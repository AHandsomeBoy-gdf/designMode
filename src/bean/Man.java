package bean;

import proxyI.IPerson;

public class Man implements IPerson {

    @Override
    public void say() {
        System.out.println("I am man!");
    }
}
