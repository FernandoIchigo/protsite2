import React from 'react';
import { BrowserRouter as Router, Routes, Route} from 'react-router-dom';

import Navbar from './components/Navbar';
import Home from './views/Home';
import AddClientes_fisico_juridico from './views/AddClientes_fisico_juridico';
import EditClientes_fisico_juridico from './views/EditClientes_fisico_juridico';
import ViewClientes_fisico_juridico from './views/ViewClientes_fisico_juridico';
import Viewcliente from './views/ViewClientes_fisico_juridico';

export default function Rotas() {
  return (
    <Router>
        <Navbar />
        <Routes>
            <Route path="/home" element={<Home />} />
            <Route path="/add" element={<AddClientes_fisico_juridico />} />
            <Route path="/edit/:id" element={<EditClientes_fisico_juridico />} />
            <Route path="/view/:id" element={<ViewCliente_fisico_juridico/>} />
            <Route path="*" element={<h1>Página não encontrada.</h1>} />
        </Routes>
    </Router>
  )
}
