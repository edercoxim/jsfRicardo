/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.util.LinkedList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import model.Clientes;

/**
 *
 * @author EDER
 */
public class ClienteDao {
 
    
    public void salvar(Clientes cliente){
        Session sessao = null;
        Transaction transacao = null;
        
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.merge(cliente);
            transacao.commit();
        }catch(RuntimeException e){
            if(transacao != null){
                transacao.rollback();
            }
            throw e;
        }finally{
            sessao.close();
        } 
    }
    
    public List<Clientes> listar () {
        List<Clientes> clientes = new LinkedList<>();
        Session sessao = null;
        Transaction transacao = null;
        
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            clientes = sessao.createQuery("select c from Clientes c").list();
            transacao.commit();
        }catch(RuntimeException e){
            if(transacao != null){
                transacao.rollback();
            }
            throw e;
        }finally{
            sessao.close();
        } 
        
        return clientes;
    }
    
}
