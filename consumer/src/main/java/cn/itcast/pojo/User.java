package cn.itcast.pojo;

import lombok.Data;

@Data
public class User {
    private static final long serialVersionUID = 1L;
    private Long id;

    // 用户名
    private String userName;

    private String note;

    public void setNote(String note) {
        this.note = note;
    }

    public String getNote() {
        return note;
    }

    public User(String userName) {
        this.userName = userName;
    }

    //    // 密码
//    private String password;
//
//    // 姓名
//    private String name;
//
//    // 年龄
//    private Integer age;
//
//    // 性别，1男性，2女性
//    private Integer sex;
//
//    // 出生日期
//    private Date birthday;
//
//    // 创建时间
//    private Date created;
//
//    // 更新时间
//    private Date updated;
//
//    // 备注
//    private String note;
}
