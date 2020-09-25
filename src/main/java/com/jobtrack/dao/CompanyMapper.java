package com.yckj.jobtrack.dao;

import com.yckj.jobtrack.domain.Company;

/**
 * Description :描述【】
 * Copyright:Copyright(c) 2020
 * Company 英才汇硕科技有限公司
 *
 * @author sye <br>
 * @version 1.0 <br>
 * @created DELL 2020/9/23
 */
public interface CompanyMapper {
    /**
     * 添加合作企业信息
     * @param company
     * @return
     */
    int insert(Company company);
}
