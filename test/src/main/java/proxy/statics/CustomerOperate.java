package proxy.statics;

/**
 * @author yangxuexi
 * @version $Id: CustomerOperateServiceImpl.java, v 0.1 2019年04月19日 3:19 PM yang.xuexi Exp $
 */
public class CustomerOperate implements OperateService {

    /**
     * 客户名称
     */
    private String customerName;

    public CustomerOperate(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void sellHouse() {
        System.out.println("客户" + customerName + "卖房子>>>>>>>>>>>>");
    }
}
