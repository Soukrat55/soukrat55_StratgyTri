package context;
import strategy.StrategyTri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Context context=new Context();
        Map<String,StrategyTri> strategyTriMap=new HashMap<>();

        while(true) {
            try {
                System.out.println("Quelle Strategie ?");
                String strategyClass = scanner.nextLine();
                StrategyTri strategyTri = strategyTriMap.get(strategyClass);
                if(strategyTri==null){
                    strategyTri = (StrategyTri) Class.forName(strategyClass).getConstructor().newInstance();
                    strategyTriMap.put(strategyClass,strategyTri);
                }
                context.setStrategy(strategyTri);
                context.effectuerTri();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }
    }
}
