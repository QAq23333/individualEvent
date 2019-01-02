package com.soft1841.sm.dao;

import com.soft1841.sm.entity.Goods;

import java.sql.SQLException;
import java.util.List;

//商品的接口类

 public interface SellerGoodsDAO {
    /**
     * 查询所有商品
     * @return
     * @throws SQLException
     */
        List<Goods> getAllGoods() throws SQLException;


}
