import bean.Man;
import proxy.ProxyHandler;
import proxyI.IPerson;

import java.lang.reflect.Proxy;

public class Main {

    public static void main(String[] args) {
        Man man = new Man();
        ProxyHandler handler =  new ProxyHandler(man);
        IPerson iPerson = (IPerson) Proxy.newProxyInstance(IPerson.class.getClassLoader(), new Class[]{IPerson.class}, handler);
        iPerson.say();
    }
}
