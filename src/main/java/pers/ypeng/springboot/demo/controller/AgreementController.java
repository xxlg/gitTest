package pers.ypeng.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pers.ypeng.springboot.demo.domain.Agreement;
import pers.ypeng.springboot.demo.service.AgreementService;

import javax.annotation.Resource;
import java.util.List;

/**
 * test
 *
 * @author ypeng
 * @created 2018 - 06 - 01 14:03
 */
@RestController
public class AgreementController {

    @Resource
    AgreementService agreementService;

    @RequestMapping("/agreement/queryList")
    public String queryList(){
        List<Agreement> agreeList = agreementService.queryList();
        System.out.println("agreeNo:"+agreeList.get(0).getAgreeName());
        return agreeList.get(0).getAgreeName();
    }
}
