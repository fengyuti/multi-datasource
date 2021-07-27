package com.dwyinyuan;

import com.dwyinyuan.service.SyncService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class SyncServiceTest {

    @Autowired
    SyncService syncService;

    @Test
    public void test() {
        syncService.sync();
    }
}
