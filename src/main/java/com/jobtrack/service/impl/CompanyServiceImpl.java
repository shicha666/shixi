package com.yckj.jobtrack.service.impl;

import com.yckj.jobtrack.dao.CompanyMapper;
import com.yckj.jobtrack.domain.Company;
import com.yckj.jobtrack.service.ICompanyService;
import com.yckj.jobtrack.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Description :描述【】
 * Copyright:Copyright(c) 2020
 * Company 英才汇硕科技有限公司
 *
 * @author sye <br>
 * @version 1.0 <br>
 * @created DELL 2020/9/23
 */
public class CompanyServiceImpl implements ICompanyService {

    /**
     * 添加合作企业
     *
     * @param company
     * @return
     */
    @Override
    public boolean addCompany(Company company) {
        boolean  flag= false;
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        CompanyMapper mapper = sqlSession.getMapper(CompanyMapper.class);
        int res = mapper.insert(company);
        if(res > 0){
            sqlSession.commit();
            flag = true;
        }else{
            sqlSession.rollback();
        }
        return flag;
    }
}

