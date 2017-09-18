package br.iskisita.principal;

import br.iskisita.Cliente;
import br.iskisita.Produto;
import br.iskisita.Sexo;
import br.iskisita.Venda;
import br.senac.rn.dao.categoriaDAO;
import br.senac.rn.dao.clienteDAO;
import br.senac.rn.dao.produtoDAO;
import br.senac.rn.dao.sexoDAO;
import br.senac.rn.dao.vendaDAO;

public class Principal {

    public static void main(String[] args) {
//        Produto p1 = new Produto();
//        produtoDAO dao = new produtoDAO();
//        p1.setDescricao("bicicleta caloi");
//        p1.setNome("bicicleta");
//        p1.setPreco(180.50f);
//        categoriaDAO cDAO = new categoriaDAO();
//        p1.setCategoria(cDAO.buscaPorId(1));
//        dao.inserirProduto(p1);
   
//        Cliente c1 = new Cliente();
//        clienteDAO dao = new clienteDAO();
//        c1.setNome("Antur Antunes");
//        c1.setCpf("92265432592");
//        sexoDAO sDAO = new sexoDAO();
//        c1.setSexo(sDAO.buscarPorId(1));
//        dao.inserirCliente(c1);
        
        Venda v1 = new Venda();
        vendaDAO dao = new vendaDAO();
        clienteDAO cDAO = new clienteDAO();
        produtoDAO pDAO = new produtoDAO();
        
        v1.setCliente(cDAO.buscaPorId(1));
        v1.setProduto(pDAO.buscarPorId(2));
        v1.setValor(2.78f);
        
        

        String saida = dao.buscarTodos().toString();
        //dao.excluir(dao.buscarPorId(3));
        System.out.println(saida); // Imprime o tipo
        dao.buscarTodos().stream().forEach((s) -> {
            // imprime pro registro
            System.out.println(s);
         });
        System.exit(0);
    }

}
