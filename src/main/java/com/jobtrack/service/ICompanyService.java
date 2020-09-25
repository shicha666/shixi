package com.yckj.jobtrack.service;

import com.yckj.jobtrack.domain.Company;

/**
 * Description :描述【合作企业业务层接口】
 * Copyright:Copyright(c) 2020
 * Company 英才汇硕科技有限公司
 *
 * @author sye <br>
 * @version 1.0 <br>
 * @created DELL 2020/9/23
 */
public interface ICompanyService {
    /**
     * 添加合作企业
     * @param company
     * @return
     */
    boolean addCompany(Company company);
}
