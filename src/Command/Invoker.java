package Command;

import java.util.ArrayList;
import java.util.List;

/**
 *命令调用类
 */
public class Invoker {

    private List<Command> orderList = new ArrayList<>();

    public void takeOrder(Command order){
        orderList.add(order);
    }

    public void placeOrders(){
        for (Command order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
