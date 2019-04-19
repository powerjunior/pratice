package proxy.statics;

/**
 * @author yangxuexi
 * @version $Id: IntermediaryCompany.java, v 0.1 2019年04月19日 3:21 PM yang.xuexi Exp $
 */
public class IntermediaryCompany implements OperateService {


    private CustomerOperate customerOperate;


    public IntermediaryCompany(CustomerOperate customerOperate) {
        this.customerOperate = customerOperate;
    }

    @Override
    public void sellHouse() {
        System.out.println("中介公司开始卖房子 >>>>>>");
        customerOperate.sellHouse();
        System.out.println("中介公司结束卖房子>>>>>>");

    }
}
