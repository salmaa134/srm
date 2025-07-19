import { BrowserRouter as Router, Routes, Route, Navigate } from 'react-router-dom';
import LoginPage from './pages/LoginPage';
import CampaignListPage from './pages/CampaignListPage';
import CreateCampaignPage from './pages/CreateCampaignPage';

function App() {
  const isAuthenticated = !!localStorage.getItem('user');

  return (
    <Router>
      <Routes>
        <Route path="/" element={<LoginPage />} />
        <Route
          path="/campagnes"
          element={isAuthenticated ? <CampaignListPage /> : <Navigate to="/" />}
        />
        <Route
          path="/campagnes/nouvelle"
          element={isAuthenticated ? <CreateCampaignPage /> : <Navigate to="/" />}
        />
      </Routes>
    </Router>
  );
}

export default App;
