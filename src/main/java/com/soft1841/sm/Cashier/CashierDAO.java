package com.soft1841.sm.dao;

import cn.hutool.db.Entity;
import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;
import java.util.List;

/**
 * 收银员的DAO接口
 */

public interface CashierDAO {
    /**
     * 查询所有收银员信息
     * @return
     * @throws SQLException
     */
    List<Entity> selectCashier() throws SQLException;

    /**
     * 根据id删除实体
     * @param id
     * @return
     * @throws SQLException
     */
    long deleteById(long id) throws SQLException;

    /**
     * 新增一个收银员，返回自增主键
     * @param cashier
     * @return
     * @throws SQLException
     */
    Long insertCashier(Cashier cashier)throws SQLException;

    /**
     * 修改收银员，返回自增主键
     * @param cashier
     * @return
     * @throws SQLException
     */
    Long updateGoods(Cashier cashier)throws SQLException;
}
