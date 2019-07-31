package com.i.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface PurDao {

    //获取订单数量
    public int getPurCount();

    //添加采购单
    public int addPurTotal(Map map);

    //添加采购详情表
    public int addPurDetail(List<Map> list);

    //获取所有订单详情
    @Select("select * from tab_total_purchase")
    public List<Map> selAllPurOrder();
}
