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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        sexoDAO sexo = new sexoDAO();
        sexo.insert(new Sexo(0,"GENERICO",'G'));
        System.exit(0);
        
    }
        
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
        
//        Venda v1 = new Venda();
//        vendaDAO dao = new vendaDAO();
//        clienteDAO cDAO = new clienteDAO();
//        produtoDAO pDAO = new produtoDAO();
//        
//        v1.setCliente(cDAO.buscarPorCPF("92265478592"));
//        v1.setData(Calendar.getInstance());
//        List<Produto> produtos = new ArrayList();
//        produtos.add(new produtoDAO().buscarPorId(2));
//        produtos.add(new produtoDAO().buscarPorId(1));
//
//        
////v1.setProduto(pDAO.buscarPorId(2));
//        float valor = 0;
//        for(Produto p : produtos){
//            valor += p.getPreco();
//        }
//        v1.setValor(valor);
//        
//        new vendaDAO().insereVenda(v1);
//        
//
//        String saida = dao.buscarTodos().toString();
//        //dao.excluir(dao.buscarPorId(3));
//        System.out.println(saida); // Imprime o tipo
//        dao.buscarTodos().stream().forEach((s) -> {
//            // imprime pro registro
//            System.out.println(s);
//         });
        
    }


