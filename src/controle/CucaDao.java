
package controle;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.CucaBean;

public class CucaDao {
  
   //Depósito em Cuca: 
    
   public CucaBean salvarCuca (CucaBean boo) throws SQLException{
        
        Connection conn = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        try {
            
        stmt = conn.prepareStatement("INSERT INTO cuca (descricao, nome, valor_da_compra, moeda, unidade, data) values(?,?,?,?,?, TO_CHAR(current_date, 'DD-MM-YYYY'))");      
       
        stmt.setString(1, boo.getDesc());
        stmt.setString(2, boo.getNome());
        stmt.setString(3, boo.getValor_da_compra());
        stmt.setString(4, boo.getMoeda());
        stmt.setString(5, boo.getUnidade());
        
        stmt.executeQuery();
        
       // JOptionPane.showMessageDialog(null, "Salvo com Sucesso! ");
        
         } catch (SQLException ex) {
        //JOptionPane.showMessageDialog(null, "Erro ao inserir  o Dados!/n Erro: !!"+ex.getMessage());
        }
        finally{
        ConnectionFactory.closeConnection(conn, stmt);
        }
        
        return boo;
        
      }
    
   // Listar Cuca na Tabela:
   
   public List<CucaBean> CervejaB() throws SQLException{
     Connection conn = ConnectionFactory.getConnection();
     PreparedStatement stmt = null;   
     ResultSet rst = null;    
     
        List<CucaBean> cervejab = new ArrayList<>();
        try {
         stmt = conn.prepareStatement("SELECT * FROM cuca");
         
         rst = stmt.executeQuery();
            
            while(rst.next()) {
            
            CucaBean crj = new CucaBean();
            
            crj.setId(rst.getInt("id"));
            crj.setDesc(rst.getString("descricao"));
            crj.setNome(rst.getString("nome"));
            crj.setValor_da_compra(rst.getString("valor_da_compra"));
            crj.setMoeda(rst.getString("moeda"));
            crj.setUnidade(rst.getString("unidade"));
            crj.setData(rst.getString("data"));
            
            cervejab.add(crj);
            
            }
           
       // JOptionPane.showMessageDialog(null, "Dados inseridos com Sucesso no Cuca!!");
            
        } catch (SQLException ex) {
       // JOptionPane.showMessageDialog(null, "Erro ao inserir Dados!/n Erro: !!"+ex.getMessage());
        }finally{
        ConnectionFactory.closeConnection(conn, stmt, rst);
        }
    
        return  cervejab;
     }  
   
      //Comando de Deletar da Tabela Cuca:
    
      public void delete(CucaBean dlb) throws SQLException{
        
     Connection conn = ConnectionFactory.getConnection();
     PreparedStatement stmt = null;   
     
        try {
         stmt = conn.prepareStatement("DELETE FROM cuca where id= ? ");
          
        stmt.setInt(1, dlb.getId());
          
         stmt.execute(); 
          
           
        JOptionPane.showMessageDialog(null, "Deletado com Sucesso!!");
            
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao excluír !"+ ex);
        }finally{
        ConnectionFactory.closeConnection(conn, stmt);
        }
        }   
    
}
