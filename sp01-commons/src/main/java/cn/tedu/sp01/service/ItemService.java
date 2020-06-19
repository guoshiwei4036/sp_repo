package cn.tedu.sp01.service;

import java.util.List;

import cn.tedu.sp01.pojo.Item;

public interface ItemService {
	/**
	 * 获取商品列表
	 * @param orderId
	 * @return
	 */
	List<Item> getItems(String orderId);
	/**
	 * 减少库存
	 * @param list
	 */
	void decreaseNumbers(List<Item> list);
}
