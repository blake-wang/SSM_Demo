package com.wanglei.service;

import com.wanglei.model.Items;

import java.util.List;

/**
 * @Auther: WangL
 * @Date: 2019/5/26 23:31
 */
public interface IItemsService {
    public List<Items> findAllItems();

    public Items findById(Integer id);

    public void saveOrUpdate(Items items);

    public void deleteById();
}
