package com.wanglei.service.impl;

import com.wanglei.mapper.ItemsMapper;
import com.wanglei.model.Items;
import com.wanglei.service.IItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: WangL
 * @Date: 2019/5/26 23:33
 */
@Service//注解创建service
public class ItemsServiceImpl implements IItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public List<Items> findAllItems() {
        return itemsMapper.findAllItems();
    }

    @Override
    public Items findById(Integer id) {
        return itemsMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Items items) {
        if (items.getId() == null) {
            itemsMapper.insert(items);
        } else {
            itemsMapper.updateByPrimaryKey(items);
        }
    }

    @Override
    public void deleteById(Integer id) {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
