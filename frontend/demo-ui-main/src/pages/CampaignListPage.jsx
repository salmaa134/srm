import { useEffect, useState } from 'react';
import { Link } from 'react-router-dom';
import api from '../api';

function CampaignListPage() {
  const [campagnes, setCampagnes] = useState([]);

  useEffect(() => {
    api.get('/campagnes')
      .then(res => setCampagnes(res.data))
      .catch(err => console.error(err));
  }, []);

  return (
    <div style={styles.container}>
      <div style={styles.header}>
        <h2 style={styles.title}>Liste des campagnes</h2>
        <Link to="/campagnes/nouvelle">
          <button style={styles.addButton}>+ Ajouter une campagne</button>
        </Link>
      </div>

      <div style={{ overflowX: 'auto' }}>
        <table style={styles.table}>
          <thead>
            <tr>
              <th style={styles.th}>Nom</th>
              <th style={styles.th}>Seuil consommation</th>
              <th style={styles.th}>Fluide concerné</th>
              <th style={styles.th}>Nature</th>
              <th style={styles.th}>Demandeur</th>
            </tr>
          </thead>
          <tbody>
            {campagnes.map((c, index) => (
              <tr
                key={c.id}
                style={index % 2 === 0 ? styles.rowEven : styles.rowOdd}
              >
                <td style={styles.td}>{c.nomCampagne}</td>
                <td style={styles.td}>{c.seuilConsommation}</td>
                <td style={styles.td}>{c.fluideConcerne}</td>
                <td style={styles.td}>{c.natureCampagne}</td>
                <td style={styles.td}>{c.demandeurCampagne}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
}

const styles = {
  container: {
    padding: '40px',
    maxWidth: '1000px',
    margin: '0 auto',
    fontFamily: 'Arial, sans-serif',
    backgroundColor: '#f9f9f9',
  },
  header: {
    display: 'flex',
    justifyContent: 'space-between',
    alignItems: 'center',
    marginBottom: '25px',
  },
  title: {
    fontSize: '26px',
    color: '#222',
  },
  addButton: {
    padding: '10px 18px',
    fontSize: '14px',
    background: '#28a745',
    color: '#fff',
    border: 'none',
    borderRadius: '6px',
    cursor: 'pointer',
  },
  table: {
    width: '100%',
    borderCollapse: 'separate',
    borderSpacing: 0,
    border: '1px solid #e0e0e0',
    borderRadius: '6px',
    overflow: 'hidden',
    boxShadow: '0 2px 5px rgba(0,0,0,0.05)',
  },
  th: {
    background: '#f0f0f0',
    padding: '14px',
    fontWeight: 'bold',
    fontSize: '15px',
    color: '#333',
    borderBottom: '1px solid #ddd',
    textAlign: 'left',
  },
  td: {
    padding: '12px 14px',
    fontSize: '14px',
    color: '#444',
    borderBottom: '1px solid #eee',
  },
  rowEven: {
    backgroundColor: '#ffffff',
  },
  rowOdd: {
    backgroundColor: '#f7f7f7',
  },
};

export default CampaignListPage;
