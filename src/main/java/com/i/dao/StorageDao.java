package com.i.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface StorageDao {

    /**
     * 获取表数据总行数
     * @return
     */
    @Select("select count(*) from tab_total_storage")
    public Integer getStorageCount();
}
