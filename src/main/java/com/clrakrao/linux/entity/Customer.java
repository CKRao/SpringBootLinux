package com.clrakrao.linux.entity;

import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Customer {
    @Id
    private ObjectId id;
    /**
     * 名称
     */
    private String name;
    /**
     * 密码
     */
    private String pwd;

}
