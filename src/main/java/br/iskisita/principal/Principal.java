package br.iskisita.principal;

import br.iskisita.Categoria;
import br.senac.rn.dao.categoriaDAO;

public class Principal {

    public static void main(String[] args) {
        
        Categoria c1 = new Categoria();
        
        c1.setId(2);
        c1.setNome("plastico");
        c1.setDescricao("escova");

        categoriaDAO dao = new categoriaDAO();
        //inserir dados
        //dao.atualizaCategoria(c1);
        //dao.inserirCategoria(c1);
        //dao.buscarTodos();
        dao.removeCategoria(c1);
//        Sexo s1 = new Sexo();
//        s1.setId(2);
//        s1.setNome("Homem");
//        s1.setSigla('H');
//        
//        sexoDAO dao = new sexoDAO();
//        //dao.excluir(dao.buscarPorId(3));
        System.out.println(dao.buscarTodos().toString()); // Imprime o tipo
        dao.buscarTodos().stream().forEach((s) -> {
            // imprime pro registro
            System.out.println(s);
         });
        System.exit(0);
    }

}
