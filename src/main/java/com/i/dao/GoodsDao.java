package com.i.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
@Mapper
public interface GoodsDao {
    @Select("select * from tab_goods join tab_goodstype on tab_goods.typeid = tab_goodstype.typeid")
    public List<Map> selAllGoods();


}
