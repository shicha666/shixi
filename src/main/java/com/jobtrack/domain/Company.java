package com.yckj.jobtrack.domain;

/**
 * Description :描述【实体】
 * Copyright:Copyright(c) 2020
 * Company 英才汇硕科技有限公司
 *
 * @author sye <br>
 * @version 1.0 <br>
 * @created DELL 2020/9/23
 */
public class Company {
    /**
     * 表示企业ID
     */
    private Integer id;
    /**
     * 表示企业名称
     */
    private String cname;
    private String city;
    private String  address;
    private String  trade;
    private String leader;
    private String telephone;
    private String job;
    private String joinDate;
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTrade() {
        return trade;
    }

    public void setTrade(String trade) {
        this.trade = trade;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                ", trade='" + trade + '\'' +
                ", leader='" + leader + '\'' +
                ", telephone='" + telephone + '\'' +
                ", job='" + job + '\'' +
                ", joinDate='" + joinDate + '\'' +
                ", status=" + status +
                '}';
    }
}
