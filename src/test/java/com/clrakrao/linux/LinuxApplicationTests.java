package com.clrakrao.linux;

import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.FileUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LinuxApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void testHuTool() {
        //HuTool 工具类测试
        log.info("HuTool 工具类测试 Start");
        File file = FileUtil.file("/home/clarkrao/test.png");
        String type = FileTypeUtil.getType(file);
        log.info("FIleType : " + type);
        log.info("HuTool 工具类测试 End");
    }

}
