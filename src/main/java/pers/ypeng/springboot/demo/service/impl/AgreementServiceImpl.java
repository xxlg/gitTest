package pers.ypeng.springboot.demo.service.impl;

import org.springframework.stereotype.Service;
import pers.ypeng.springboot.demo.dao.AgreementMapper;
import pers.ypeng.springboot.demo.domain.Agreement;
import pers.ypeng.springboot.demo.service.AgreementService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ypeng
 * @created 2018 - 06 - 01 11:25
 */
@Service
public class AgreementServiceImpl implements AgreementService{

    @Resource
    AgreementMapper agreementMapper;

    @Override
    public List<Agreement> queryList() {
        return agreementMapper.queryList();
    }
}
