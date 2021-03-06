package app;


import swing.ui.DefaultList;
import service.Produto;

public class Application {
    
    private static Application instance;
    public DefaultList listProduto;
    public Main main;
    
    private Application(){
        main = new Main();
        listProduto = new DefaultList(main,new Produto());
        
    }
    
    public static Application getInstance(){
        if(instance==null){
            instance = new Application();
        }
        return instance;
    }
    
}
