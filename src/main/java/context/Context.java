package context;

import strategy.TriDefaultStrategy;
import strategy.StrategyTri;
import strategy.TriRapidStrategy;

public class Context {
    private StrategyTri strategyTri=new TriDefaultStrategy();
    private int counter=0;
    public void effectuerTri(){

        ++counter;
        if(counter>5){
            strategyTri=new TriRapidStrategy();
        }
        System.out.println("******************Strategy Start***********************");
        strategyTri.trier();
        System.out.println("******************Strategy End***********************");

    }

    public void setStrategy(StrategyTri strategy){
        this.strategyTri=strategy;
    }
}