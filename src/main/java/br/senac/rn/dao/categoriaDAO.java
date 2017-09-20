package br.senac.rn.dao;

import br.iskisita.Categoria;
import br.iskisita.rn.util.genericDAO;

public class categoriaDAO extends genericDAO<Categoria> {
//METODO ABAIXO POR SER ABASTRATO FOI IMPORTADO DO CATEGORIA dao
    @Override
    public Class<Categoria> getClassType() {
        return Categoria.class;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
