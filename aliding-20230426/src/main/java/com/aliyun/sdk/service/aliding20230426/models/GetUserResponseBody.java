// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserResponseBody</p>
 */
public class GetUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("active")
    private Boolean active;

    @com.aliyun.core.annotation.NameInMap("admin")
    private Boolean admin;

    @com.aliyun.core.annotation.NameInMap("avatar")
    private String avatar;

    @com.aliyun.core.annotation.NameInMap("boss")
    private Boolean boss;

    @com.aliyun.core.annotation.NameInMap("deptIdList")
    private java.util.List < Long > deptIdList;

    @com.aliyun.core.annotation.NameInMap("deptOrderList")
    private java.util.List < DeptOrderList> deptOrderList;

    @com.aliyun.core.annotation.NameInMap("email")
    private String email;

    @com.aliyun.core.annotation.NameInMap("exclusiveAccount")
    private Boolean exclusiveAccount;

    @com.aliyun.core.annotation.NameInMap("exclusiveAccountCorpId")
    private String exclusiveAccountCorpId;

    @com.aliyun.core.annotation.NameInMap("exclusiveAccountCorpName")
    private String exclusiveAccountCorpName;

    @com.aliyun.core.annotation.NameInMap("exclusiveAccountType")
    private String exclusiveAccountType;

    @com.aliyun.core.annotation.NameInMap("extension")
    private String extension;

    @com.aliyun.core.annotation.NameInMap("hideMobile")
    private Boolean hideMobile;

    @com.aliyun.core.annotation.NameInMap("hiredDate")
    private Long hiredDate;

    @com.aliyun.core.annotation.NameInMap("jobNumber")
    private String jobNumber;

    @com.aliyun.core.annotation.NameInMap("leaderInDept")
    private java.util.List < LeaderInDept> leaderInDept;

    @com.aliyun.core.annotation.NameInMap("loginId")
    private String loginId;

    @com.aliyun.core.annotation.NameInMap("managerUserid")
    private String managerUserid;

    @com.aliyun.core.annotation.NameInMap("mobile")
    private String mobile;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("nickname")
    private String nickname;

    @com.aliyun.core.annotation.NameInMap("orgEmail")
    private String orgEmail;

    @com.aliyun.core.annotation.NameInMap("realAuthed")
    private Boolean realAuthed;

    @com.aliyun.core.annotation.NameInMap("remark")
    private String remark;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("roleList")
    private java.util.List < RoleList> roleList;

    @com.aliyun.core.annotation.NameInMap("senior")
    private Boolean senior;

    @com.aliyun.core.annotation.NameInMap("stateCode")
    private String stateCode;

    @com.aliyun.core.annotation.NameInMap("telephone")
    private String telephone;

    @com.aliyun.core.annotation.NameInMap("title")
    private String title;

    @com.aliyun.core.annotation.NameInMap("unionEmpExt")
    private UnionEmpExt unionEmpExt;

    @com.aliyun.core.annotation.NameInMap("userid")
    private String userid;

    @com.aliyun.core.annotation.NameInMap("workPlace")
    private String workPlace;

    private GetUserResponseBody(Builder builder) {
        this.active = builder.active;
        this.admin = builder.admin;
        this.avatar = builder.avatar;
        this.boss = builder.boss;
        this.deptIdList = builder.deptIdList;
        this.deptOrderList = builder.deptOrderList;
        this.email = builder.email;
        this.exclusiveAccount = builder.exclusiveAccount;
        this.exclusiveAccountCorpId = builder.exclusiveAccountCorpId;
        this.exclusiveAccountCorpName = builder.exclusiveAccountCorpName;
        this.exclusiveAccountType = builder.exclusiveAccountType;
        this.extension = builder.extension;
        this.hideMobile = builder.hideMobile;
        this.hiredDate = builder.hiredDate;
        this.jobNumber = builder.jobNumber;
        this.leaderInDept = builder.leaderInDept;
        this.loginId = builder.loginId;
        this.managerUserid = builder.managerUserid;
        this.mobile = builder.mobile;
        this.name = builder.name;
        this.nickname = builder.nickname;
        this.orgEmail = builder.orgEmail;
        this.realAuthed = builder.realAuthed;
        this.remark = builder.remark;
        this.requestId = builder.requestId;
        this.roleList = builder.roleList;
        this.senior = builder.senior;
        this.stateCode = builder.stateCode;
        this.telephone = builder.telephone;
        this.title = builder.title;
        this.unionEmpExt = builder.unionEmpExt;
        this.userid = builder.userid;
        this.workPlace = builder.workPlace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return admin
     */
    public Boolean getAdmin() {
        return this.admin;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return this.avatar;
    }

    /**
     * @return boss
     */
    public Boolean getBoss() {
        return this.boss;
    }

    /**
     * @return deptIdList
     */
    public java.util.List < Long > getDeptIdList() {
        return this.deptIdList;
    }

    /**
     * @return deptOrderList
     */
    public java.util.List < DeptOrderList> getDeptOrderList() {
        return this.deptOrderList;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @return exclusiveAccount
     */
    public Boolean getExclusiveAccount() {
        return this.exclusiveAccount;
    }

    /**
     * @return exclusiveAccountCorpId
     */
    public String getExclusiveAccountCorpId() {
        return this.exclusiveAccountCorpId;
    }

    /**
     * @return exclusiveAccountCorpName
     */
    public String getExclusiveAccountCorpName() {
        return this.exclusiveAccountCorpName;
    }

    /**
     * @return exclusiveAccountType
     */
    public String getExclusiveAccountType() {
        return this.exclusiveAccountType;
    }

    /**
     * @return extension
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * @return hideMobile
     */
    public Boolean getHideMobile() {
        return this.hideMobile;
    }

    /**
     * @return hiredDate
     */
    public Long getHiredDate() {
        return this.hiredDate;
    }

    /**
     * @return jobNumber
     */
    public String getJobNumber() {
        return this.jobNumber;
    }

    /**
     * @return leaderInDept
     */
    public java.util.List < LeaderInDept> getLeaderInDept() {
        return this.leaderInDept;
    }

    /**
     * @return loginId
     */
    public String getLoginId() {
        return this.loginId;
    }

    /**
     * @return managerUserid
     */
    public String getManagerUserid() {
        return this.managerUserid;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return this.mobile;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nickname
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * @return orgEmail
     */
    public String getOrgEmail() {
        return this.orgEmail;
    }

    /**
     * @return realAuthed
     */
    public Boolean getRealAuthed() {
        return this.realAuthed;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleList
     */
    public java.util.List < RoleList> getRoleList() {
        return this.roleList;
    }

    /**
     * @return senior
     */
    public Boolean getSenior() {
        return this.senior;
    }

    /**
     * @return stateCode
     */
    public String getStateCode() {
        return this.stateCode;
    }

    /**
     * @return telephone
     */
    public String getTelephone() {
        return this.telephone;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return unionEmpExt
     */
    public UnionEmpExt getUnionEmpExt() {
        return this.unionEmpExt;
    }

    /**
     * @return userid
     */
    public String getUserid() {
        return this.userid;
    }

    /**
     * @return workPlace
     */
    public String getWorkPlace() {
        return this.workPlace;
    }

    public static final class Builder {
        private Boolean active; 
        private Boolean admin; 
        private String avatar; 
        private Boolean boss; 
        private java.util.List < Long > deptIdList; 
        private java.util.List < DeptOrderList> deptOrderList; 
        private String email; 
        private Boolean exclusiveAccount; 
        private String exclusiveAccountCorpId; 
        private String exclusiveAccountCorpName; 
        private String exclusiveAccountType; 
        private String extension; 
        private Boolean hideMobile; 
        private Long hiredDate; 
        private String jobNumber; 
        private java.util.List < LeaderInDept> leaderInDept; 
        private String loginId; 
        private String managerUserid; 
        private String mobile; 
        private String name; 
        private String nickname; 
        private String orgEmail; 
        private Boolean realAuthed; 
        private String remark; 
        private String requestId; 
        private java.util.List < RoleList> roleList; 
        private Boolean senior; 
        private String stateCode; 
        private String telephone; 
        private String title; 
        private UnionEmpExt unionEmpExt; 
        private String userid; 
        private String workPlace; 

        /**
         * active.
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * admin.
         */
        public Builder admin(Boolean admin) {
            this.admin = admin;
            return this;
        }

        /**
         * avatar.
         */
        public Builder avatar(String avatar) {
            this.avatar = avatar;
            return this;
        }

        /**
         * boss.
         */
        public Builder boss(Boolean boss) {
            this.boss = boss;
            return this;
        }

        /**
         * deptIdList.
         */
        public Builder deptIdList(java.util.List < Long > deptIdList) {
            this.deptIdList = deptIdList;
            return this;
        }

        /**
         * deptOrderList.
         */
        public Builder deptOrderList(java.util.List < DeptOrderList> deptOrderList) {
            this.deptOrderList = deptOrderList;
            return this;
        }

        /**
         * email.
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * exclusiveAccount.
         */
        public Builder exclusiveAccount(Boolean exclusiveAccount) {
            this.exclusiveAccount = exclusiveAccount;
            return this;
        }

        /**
         * exclusiveAccountCorpId.
         */
        public Builder exclusiveAccountCorpId(String exclusiveAccountCorpId) {
            this.exclusiveAccountCorpId = exclusiveAccountCorpId;
            return this;
        }

        /**
         * exclusiveAccountCorpName.
         */
        public Builder exclusiveAccountCorpName(String exclusiveAccountCorpName) {
            this.exclusiveAccountCorpName = exclusiveAccountCorpName;
            return this;
        }

        /**
         * exclusiveAccountType.
         */
        public Builder exclusiveAccountType(String exclusiveAccountType) {
            this.exclusiveAccountType = exclusiveAccountType;
            return this;
        }

        /**
         * extension.
         */
        public Builder extension(String extension) {
            this.extension = extension;
            return this;
        }

        /**
         * hideMobile.
         */
        public Builder hideMobile(Boolean hideMobile) {
            this.hideMobile = hideMobile;
            return this;
        }

        /**
         * hiredDate.
         */
        public Builder hiredDate(Long hiredDate) {
            this.hiredDate = hiredDate;
            return this;
        }

        /**
         * jobNumber.
         */
        public Builder jobNumber(String jobNumber) {
            this.jobNumber = jobNumber;
            return this;
        }

        /**
         * leaderInDept.
         */
        public Builder leaderInDept(java.util.List < LeaderInDept> leaderInDept) {
            this.leaderInDept = leaderInDept;
            return this;
        }

        /**
         * loginId.
         */
        public Builder loginId(String loginId) {
            this.loginId = loginId;
            return this;
        }

        /**
         * managerUserid.
         */
        public Builder managerUserid(String managerUserid) {
            this.managerUserid = managerUserid;
            return this;
        }

        /**
         * mobile.
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * nickname.
         */
        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        /**
         * orgEmail.
         */
        public Builder orgEmail(String orgEmail) {
            this.orgEmail = orgEmail;
            return this;
        }

        /**
         * realAuthed.
         */
        public Builder realAuthed(Boolean realAuthed) {
            this.realAuthed = realAuthed;
            return this;
        }

        /**
         * remark.
         */
        public Builder remark(String remark) {
            this.remark = remark;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * roleList.
         */
        public Builder roleList(java.util.List < RoleList> roleList) {
            this.roleList = roleList;
            return this;
        }

        /**
         * senior.
         */
        public Builder senior(Boolean senior) {
            this.senior = senior;
            return this;
        }

        /**
         * stateCode.
         */
        public Builder stateCode(String stateCode) {
            this.stateCode = stateCode;
            return this;
        }

        /**
         * telephone.
         */
        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        /**
         * title.
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }

        /**
         * unionEmpExt.
         */
        public Builder unionEmpExt(UnionEmpExt unionEmpExt) {
            this.unionEmpExt = unionEmpExt;
            return this;
        }

        /**
         * userid.
         */
        public Builder userid(String userid) {
            this.userid = userid;
            return this;
        }

        /**
         * workPlace.
         */
        public Builder workPlace(String workPlace) {
            this.workPlace = workPlace;
            return this;
        }

        public GetUserResponseBody build() {
            return new GetUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class DeptOrderList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deptId")
        private Long deptId;

        @com.aliyun.core.annotation.NameInMap("order")
        private Long order;

        private DeptOrderList(Builder builder) {
            this.deptId = builder.deptId;
            this.order = builder.order;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeptOrderList create() {
            return builder().build();
        }

        /**
         * @return deptId
         */
        public Long getDeptId() {
            return this.deptId;
        }

        /**
         * @return order
         */
        public Long getOrder() {
            return this.order;
        }

        public static final class Builder {
            private Long deptId; 
            private Long order; 

            /**
             * deptId.
             */
            public Builder deptId(Long deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * order.
             */
            public Builder order(Long order) {
                this.order = order;
                return this;
            }

            public DeptOrderList build() {
                return new DeptOrderList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class LeaderInDept extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deptId")
        private Long deptId;

        @com.aliyun.core.annotation.NameInMap("leader")
        private Boolean leader;

        private LeaderInDept(Builder builder) {
            this.deptId = builder.deptId;
            this.leader = builder.leader;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LeaderInDept create() {
            return builder().build();
        }

        /**
         * @return deptId
         */
        public Long getDeptId() {
            return this.deptId;
        }

        /**
         * @return leader
         */
        public Boolean getLeader() {
            return this.leader;
        }

        public static final class Builder {
            private Long deptId; 
            private Boolean leader; 

            /**
             * deptId.
             */
            public Builder deptId(Long deptId) {
                this.deptId = deptId;
                return this;
            }

            /**
             * leader.
             */
            public Builder leader(Boolean leader) {
                this.leader = leader;
                return this;
            }

            public LeaderInDept build() {
                return new LeaderInDept(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class RoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private RoleList(Builder builder) {
            this.groupName = builder.groupName;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String groupName; 
            private Long id; 
            private String name; 

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class UnionEmpMapList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cropId")
        private String cropId;

        @com.aliyun.core.annotation.NameInMap("userid")
        private String userid;

        private UnionEmpMapList(Builder builder) {
            this.cropId = builder.cropId;
            this.userid = builder.userid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnionEmpMapList create() {
            return builder().build();
        }

        /**
         * @return cropId
         */
        public String getCropId() {
            return this.cropId;
        }

        /**
         * @return userid
         */
        public String getUserid() {
            return this.userid;
        }

        public static final class Builder {
            private String cropId; 
            private String userid; 

            /**
             * cropId.
             */
            public Builder cropId(String cropId) {
                this.cropId = cropId;
                return this;
            }

            /**
             * userid.
             */
            public Builder userid(String userid) {
                this.userid = userid;
                return this;
            }

            public UnionEmpMapList build() {
                return new UnionEmpMapList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetUserResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserResponseBody</p>
     */
    public static class UnionEmpExt extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("corpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("unionEmpMapList")
        private java.util.List < UnionEmpMapList> unionEmpMapList;

        @com.aliyun.core.annotation.NameInMap("userid")
        private String userid;

        private UnionEmpExt(Builder builder) {
            this.corpId = builder.corpId;
            this.unionEmpMapList = builder.unionEmpMapList;
            this.userid = builder.userid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnionEmpExt create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return unionEmpMapList
         */
        public java.util.List < UnionEmpMapList> getUnionEmpMapList() {
            return this.unionEmpMapList;
        }

        /**
         * @return userid
         */
        public String getUserid() {
            return this.userid;
        }

        public static final class Builder {
            private String corpId; 
            private java.util.List < UnionEmpMapList> unionEmpMapList; 
            private String userid; 

            /**
             * corpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * unionEmpMapList.
             */
            public Builder unionEmpMapList(java.util.List < UnionEmpMapList> unionEmpMapList) {
                this.unionEmpMapList = unionEmpMapList;
                return this;
            }

            /**
             * userid.
             */
            public Builder userid(String userid) {
                this.userid = userid;
                return this;
            }

            public UnionEmpExt build() {
                return new UnionEmpExt(this);
            } 

        } 

    }
}
