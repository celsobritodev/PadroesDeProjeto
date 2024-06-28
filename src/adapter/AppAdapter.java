package adapter;

public class AppAdapter
{
  public static void doAdapter() {
        IRelatorio  rel;
        
        rel = new ReportAdapter();
        rel.gerarRelatorio("Unidade1 R$ 1000\nUnidade2 R$ 1200\nUnidade3 R$ 1300");
        
        

     }
  
  
}
