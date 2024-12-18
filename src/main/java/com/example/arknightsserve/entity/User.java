package com.example.arknightsserve.entity;

import java.io.Serializable;

/**
 * user
 * @author 
 */
public class User implements Serializable {
    private Integer id;

    private String arkname;

    private String arkid;

    private Integer arklv;

    private String arkvoice;

    private Integer arklongmenbi;

    private Integer arkhechengyu;

    private Integer arkyuanshi;

    private String account;

    private String password;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArkname() {
        return arkname;
    }

    public void setArkname(String arkname) {
        this.arkname = arkname;
    }

    public String getArkid() {
        return arkid;
    }

    public void setArkid(String arkid) {
        this.arkid = arkid;
    }

    public Integer getArklv() {
        return arklv;
    }

    public void setArklv(Integer arklv) {
        this.arklv = arklv;
    }

    public String getArkvoice() {
        return arkvoice;
    }

    public void setArkvoice(String arkvoice) {
        this.arkvoice = arkvoice;
    }

    public Integer getArklongmenbi() {
        return arklongmenbi;
    }

    public void setArklongmenbi(Integer arklongmenbi) {
        this.arklongmenbi = arklongmenbi;
    }

    public Integer getArkhechengyu() {
        return arkhechengyu;
    }

    public void setArkhechengyu(Integer arkhechengyu) {
        this.arkhechengyu = arkhechengyu;
    }

    public Integer getArkyuanshi() {
        return arkyuanshi;
    }

    public void setArkyuanshi(Integer arkyuanshi) {
        this.arkyuanshi = arkyuanshi;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getArkname() == null ? other.getArkname() == null : this.getArkname().equals(other.getArkname()))
            && (this.getArkid() == null ? other.getArkid() == null : this.getArkid().equals(other.getArkid()))
            && (this.getArklv() == null ? other.getArklv() == null : this.getArklv().equals(other.getArklv()))
            && (this.getArkvoice() == null ? other.getArkvoice() == null : this.getArkvoice().equals(other.getArkvoice()))
            && (this.getArklongmenbi() == null ? other.getArklongmenbi() == null : this.getArklongmenbi().equals(other.getArklongmenbi()))
            && (this.getArkhechengyu() == null ? other.getArkhechengyu() == null : this.getArkhechengyu().equals(other.getArkhechengyu()))
            && (this.getArkyuanshi() == null ? other.getArkyuanshi() == null : this.getArkyuanshi().equals(other.getArkyuanshi()))
            && (this.getAccount() == null ? other.getAccount() == null : this.getAccount().equals(other.getAccount()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getArkname() == null) ? 0 : getArkname().hashCode());
        result = prime * result + ((getArkid() == null) ? 0 : getArkid().hashCode());
        result = prime * result + ((getArklv() == null) ? 0 : getArklv().hashCode());
        result = prime * result + ((getArkvoice() == null) ? 0 : getArkvoice().hashCode());
        result = prime * result + ((getArklongmenbi() == null) ? 0 : getArklongmenbi().hashCode());
        result = prime * result + ((getArkhechengyu() == null) ? 0 : getArkhechengyu().hashCode());
        result = prime * result + ((getArkyuanshi() == null) ? 0 : getArkyuanshi().hashCode());
        result = prime * result + ((getAccount() == null) ? 0 : getAccount().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", arkname=").append(arkname);
        sb.append(", arkid=").append(arkid);
        sb.append(", arklv=").append(arklv);
        sb.append(", arkvoice=").append(arkvoice);
        sb.append(", arklongmenbi=").append(arklongmenbi);
        sb.append(", arkhechengyu=").append(arkhechengyu);
        sb.append(", arkyuanshi=").append(arkyuanshi);
        sb.append(", account=").append(account);
        sb.append(", password=").append(password);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}