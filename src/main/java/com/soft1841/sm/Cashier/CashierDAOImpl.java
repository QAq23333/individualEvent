package com.soft1841.sm.impl;

import cn.hutool.db.Db;
import cn.hutool.db.Entity;
import com.soft1841.sm.Cashier.Cashier;
import com.soft1841.sm.dao.CashierDAO;
import com.soft1841.sm.entity.Cashier;

import java.sql.SQLException;
import java.util.List;


/**
 * 收银员DAO的实现类
 */
public class CashierDAOImpl implements CashierDAO {

    public List<Entity> selectCashier() throws SQLException {
        return Db.use().query("SELECT * FROM t_cashier");
    }

    public long deleteById(long id) throws SQLException {
        return Db.use().del(Entity.create("t_cashier").set("id",id));
    }

    public Long insertCashier(Cashier cashier) throws SQLException {
        return Db.use().insertForGeneratedKey(
                Entity.create("t_goods")
                        .set("id",cashier.getId())
                        .set("work_number",cashier.getWorkNumber())
                        .set("password",cashier.getPassword())
                        .set("name",cashier.getName())
                        .set("avatar",cashier.getAvatar())
        );
    }

    public int updateCashier(Cashier cashier) throws SQLException {
        return Db.use().update(Entity.create().set("password",cashier.getPassword())
                        .set("stock",cashier.getPassword()) ,
                Entity.create("t_cashier").set("id",cashier.getId()));
    }
}