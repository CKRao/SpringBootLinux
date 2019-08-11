package com.clrakrao.linux.controller;

import com.clrakrao.linux.dao.CustomerRepository;
import com.clrakrao.linux.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 测试控制器
 */
@RestController()
@RequestMapping("/test")
public class TestController {
    @Autowired
    CustomerRepository customerRepository;

    /**
     * mongodb添加数据测试接口
     *
     * @param customer
     * @return
     */
    @PostMapping("/add")
    public Map testMongoDBAdd(@RequestBody Customer customer) {
        Customer save = customerRepository.save(customer);
        Map<String, String> result = new HashMap();
        if (save != null) {
            result.put("result", "success");
            return result;
        }
        result.put("result", "error");
        return result;
    }

    /**
     * 根据名字获取数据
     *
     * @param name
     * @return
     */
    @GetMapping("/{name}")
    public Customer findByName(@PathVariable String name) {
        return customerRepository.findByName(name);
    }

    /**
     * 获取所有的数据
     *
     * @return
     */

    @GetMapping("/all")
    public List<Customer> findAll() {
        List<Customer> all = customerRepository.findAll();
        return all;
    }

    /**
     * 删除接口
     *
     * @param name
     * @return
     */
    @DeleteMapping("/{name}")
    public Map deleteByName(@PathVariable String name) {
        customerRepository.deleteByName(name);

        Map<String, String> result = new HashMap();

        result.put("result", "success");
        return result;
    }

    /**
     * 修改接口
     *
     * @param name
     * @param customer
     * @return
     */
    @PutMapping("/{name}")
    public Customer updateByName(@PathVariable String name, @RequestBody Customer customer) {
        Customer old = customerRepository.findByName(name);

        old.setName(customer.getName());
        old.setPwd(customer.getPwd());

        Customer save = customerRepository.save(old);

        return save;
    }
}
