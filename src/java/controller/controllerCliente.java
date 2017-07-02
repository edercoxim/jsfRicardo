/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Dao.ClienteDao;
import Dao.combustivelDao;
import javax.faces.bean.ManagedBean;
import model.Clientes;
import model.Combustivel;

/**
 *
 * @author EDER
 */
@ManagedBean
public class controllerCliente {
    private Clientes cliente;
    private ClienteDao cdao;
    private Combustivel combustivel;
    private combustivelDao combDao;
    private Integer id;

    public controllerCliente() {
        cliente = new Clientes();
        cdao = new ClienteDao();
        combustivel = new Combustivel();
        combDao = new combustivelDao();           
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }
    
    public void salvar(){
        combustivel.setId(1);
        System.out.println(cliente.getNome());
        cliente.setCombustivel(combustivel);
        cdao.salvar(cliente); 
    }
    
}
