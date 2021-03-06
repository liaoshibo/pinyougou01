package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbGoods;
import com.pinyougou.service.BaseService;
import com.pinyougou.vo.Goods;
import com.pinyougou.vo.PageResult;

public interface GoodsService extends BaseService<TbGoods> {

    PageResult search(Integer page, Integer rows, TbGoods goods);

    /**
     * 保存商品数据（基本、描述、sku列表）
     * @param goods 基本、描述、sku列表
     */
    void addGoods(Goods goods);

    /**
     * 根据商品spu id查询基本、描述、sku列表
     * @param id 商品spu id
     * @return 商品信息（基本、描述、sku列表）
     */
    Goods findGoodsByGoodsId(Long id);

    /**
     * 更新基本、描述、sku列表
     * @param goods 商品信息（基本、描述、sku列表）
     */
    void updateGoods(Goods goods);


    /**
     * 批量更新商品的审核状态
     * @param ids 商品spu id数组
     * @param status 要修改的状态
     */
    void updateStatus(Long[] ids, String status);

    /**
     * 将选择了的那些商品spu id数组对应的商品的删除状态修改为1
     * @param ids 商品spu id数组
     */
    void deleteGoodsByIds(Long[] ids);
}