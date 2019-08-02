package com.i.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
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

    //获取所有订单数据
    @Select("select * from tab_total_purchase")
    public List<Map> selAllPurOrder();

    //获取所有订单详情数据
    @Select("select * from tab_detail_purchase")
    public List<Map> selAllPurDetail();

    //更新订单状态
    @Update("update tab_total_purchase set purstatus = #{purstatus} where purno = #{purno}")
    public void sh(@Param("purno") String purno,@Param("purstatus") String purstatus);
}
