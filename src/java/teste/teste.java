/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import Dao.ClienteDao;
import java.util.LinkedList;
import java.util.List;
import model.Clientes;
import model.Combustivel;

/**
 *
 * @author EDER
 */
public class teste {
    public static void main(String[] args) {
        ClienteDao cdao = new ClienteDao();
        List<Clientes> clientes = new LinkedList<>();
        Combustivel cb = new Combustivel();
        cb.setId(1);
        Clientes cli= new Clientes();
        cli.setNome("teste");
        clientes = cdao.listar();
        
        for (Clientes c : clientes) {
            System.out.println(c.getNome());
        }
        //cdao.salvar(cli);
        
    }
    
}
