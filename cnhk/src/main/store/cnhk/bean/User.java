package store.cnhk.bean;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    private String userId;
    private String userName;
    private String userPassward;
    private String wechatid;
    private String wechatName;

    @Id
    @Column(name = "userid")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "username")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "userpassward")
    public String getUserPassward() {
        return userPassward;
    }

    public void setUserPassward(String userPassward) {
        this.userPassward = userPassward;
    }

    @Basic
    @Column(name = "wechatid")
    public String getWechatid() {
        return wechatid;
    }

    public void setWechatid(String wechatid) {
        this.wechatid = wechatid;
    }

    @Basic
    @Column(name = "wecharname")
    public String getWechatName() {
        return wechatName;
    }

    public void setWechatName(String wechatName) {
        this.wechatName = wechatName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != null ? !userId.equals(user.userId) : user.userId != null) return false;
        if (userName != null ? !userName.equals(user.userName) : user.userName != null) return false;
        if (userPassward != null ? !userPassward.equals(user.userPassward) : user.userPassward != null) return false;
        if (wechatid != null ? !wechatid.equals(user.wechatid) : user.wechatid != null) return false;
        if (wechatName != null ? !wechatName.equals(user.wechatName) : user.wechatName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPassward != null ? userPassward.hashCode() : 0);
        result = 31 * result + (wechatid != null ? wechatid.hashCode() : 0);
        result = 31 * result + (wechatName != null ? wechatName.hashCode() : 0);
        return result;
    }
}
