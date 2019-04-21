package com.clrakrao.linux.dao;

import com.clrakrao.linux.entity.Customer;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Customer dao操作接口
 */
@Repository
public interface CustomerRepository extends MongoRepository<Customer, ObjectId> {

    /**
     * 根据名称查找
     * @param name
     * @return
     */
    Customer findByName(String name);

    /**
     * 根据名称删除
     * @param Name
     */
    void deleteByName(String Name);
}
