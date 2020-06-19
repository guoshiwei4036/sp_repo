package cn.tedu.sp01.service;


import cn.tedu.sp01.pojo.Order;

public interface OrderService {
	/**
	 * 根据订单Id 获取订单数据
	 * 包含用户信息+订单中的商品信息
	 * @param orderId
	 * @return
	 */
	Order getOrder(String orderId);
	/**
	 * 添加订单时 要修改商品库存
	 * 修改用户积分
	 * @param order
	 */
	void addOrder(Order order);
}
