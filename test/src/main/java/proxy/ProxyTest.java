package proxy;

import org.junit.Test;
import proxy.statics.CustomerOperate;
import proxy.statics.IntermediaryCompany;
import proxy.statics.OperateService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author yangxuexi
 * @version $Id: ProxyTest.java, v 0.1 2019年04月19日 3:09 PM yang.xuexi Exp $
 */
public class ProxyTest {

    /**
     * 静态代理测试
     */
    @Test
    public void testStaticProxy() {
        IntermediaryCompany intermediaryCompany = new IntermediaryCompany(new CustomerOperate("张三"));
        intermediaryCompany.sellHouse();

    }


    /**
     *
     */
    @Test
    public void testCglibProxy() {
        OperateService operateService = new CustomerOperate("李四");
        OperateService proxyObject = (OperateService) Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{OperateService.class}, new
                InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                        System.out.println("中介公司开始卖房子 >>>>>>");

                        method.invoke(operateService, args);

                        System.out.println("中介公司结束卖房子 >>>>>>");
                        return null;
                    }
                });
        proxyObject.sellHouse();
    }


}
