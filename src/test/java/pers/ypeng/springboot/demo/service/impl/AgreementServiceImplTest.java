package pers.ypeng.springboot.demo.service.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pers.ypeng.springboot.demo.DemoApplication;
import pers.ypeng.springboot.demo.dao.AgreementMapper;
import pers.ypeng.springboot.demo.domain.Agreement;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
public class AgreementServiceImplTest {

    @Resource
    AgreementMapper agreementMapper;

    @Test
    public void queryList() {
        List<Agreement> agreeList = agreementMapper.queryList();
        System.out.print("名称--------->"+agreeList.get(0).getAgreeName());
    }
}