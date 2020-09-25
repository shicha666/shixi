package com.yckj.jobtrack.servlet;

import com.google.gson.Gson;
import com.yckj.jobtrack.domain.Company;
import com.yckj.jobtrack.service.ICompanyService;
import com.yckj.jobtrack.service.impl.CompanyServiceImpl;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Description :描述【】
 * Copyright:Copyright(c) 2020
 * Company 英才汇硕科技有限公司
 *
 * @author sye <br>
 * @version 1.0 <br>
 * @created DELL 2020/9/23
 */
@WebServlet(value = "/CompanyServlet")
public class CompanyServlet extends HttpServlet {
    private Logger logger = Logger.getLogger(this.getClass());
    private ICompanyService companyService = new CompanyServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取执行的请求方法
        String method = req.getParameter("method");
        if("addUser".equals(method)){
            this.addUser(req,resp);
        }else if("queryAll".equals(method)){
            this.queryAll(req,resp);
        }else{
            logger.debug("请求地址不存在");
        }
    }



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
    public void addUser(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // 获取前台传回的data（收集的form的数据）
        String data = req.getParameter("data");
        // 输出
        logger.debug("data:"+data);
        Gson gson = new Gson();
        Company company = gson.fromJson(data, Company.class);
        logger.debug(company);
        boolean flag = companyService.addCompany(company);
        logger.debug("flag="+flag);
        PrintWriter writer = resp.getWriter();
        if(flag){
            writer.print(1);
        }else{
            writer.print(0);
        }
       writer.close();

    }

    private void queryAll(HttpServletRequest req, HttpServletResponse resp) {
    }
}
