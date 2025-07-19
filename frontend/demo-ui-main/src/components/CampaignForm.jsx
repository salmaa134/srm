import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import api from '../api';

function CampaignForm() {
  const [form, setForm] = useState({
    nomCampagne: '',
    seuilConsommation: '',
    fluideConcerne: '',
    natureCampagne: '',
    demandeurCampagne: '',
  });
  const navigate = useNavigate();

  const handleChange = e => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = e => {
    e.preventDefault();
    api.post('/campagnes', form)
      .then(() => navigate('/campagnes'))
      .catch(err => console.error(err));
  };

  return (
    <form onSubmit={handleSubmit}>
      {Object.entries(form).map(([key, value]) => (
        <input
          key={key}
          name={key}
          value={value}
          onChange={handleChange}
          placeholder={key}
          required
        />
      ))}
      <button type="submit">Créer la campagne</button>
    </form>
  );
}

export default CampaignForm;
