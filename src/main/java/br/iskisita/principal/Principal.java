package br.iskisita.principal;

import br.iskisita.Sexo;
import br.senac.rn.dao.sexoDAO;

public class Principal {

    public static void main(String[] args) {

        Sexo s1 = new Sexo();
        
        s1.setId(2);
        s1.setNome("Homem");
        s1.setSigla('H');
        
        sexoDAO dao = new sexoDAO();
        //dao.excluir(dao.buscarPorId(3));

        dao.atualizar(s1);
        //System.out.println(dao.buscarPorId(2));

        //System.out.println(dao.buscarTodos().toString()); // Imprime o tipo
        dao.buscarTodos().stream().forEach((s) -> {
            // imprime pro registro
            System.out.println(s);
        });

        System.exit(0);
    }

}
