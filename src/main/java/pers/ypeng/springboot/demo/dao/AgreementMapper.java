package pers.ypeng.springboot.demo.dao;

import pers.ypeng.springboot.demo.domain.Agreement;

import java.util.List;

public interface AgreementMapper {
    public List<Agreement> queryList();
}
