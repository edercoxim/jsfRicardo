/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import model.Combustivel;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author EDER
 */
public class combustivelDao {
      public void salvar(Combustivel combustivel){
        Session sessao = null;
        Transaction transacao = null;
        
        try{
            sessao = HibernateUtil.getSessionFactory().openSession();
            transacao = sessao.beginTransaction();
            sessao.save(combustivel);
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
    
}
