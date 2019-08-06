package com.i.service.Impl;

import com.i.dao.StorageDao;
import com.i.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    @Override
    public Integer getStorageCount() {
        return storageDao.getStorageCount();
    }
}
