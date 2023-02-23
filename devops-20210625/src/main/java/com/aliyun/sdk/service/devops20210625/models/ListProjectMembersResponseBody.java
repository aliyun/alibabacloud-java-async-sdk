// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectMembersResponseBody</p>
 */
public class ListProjectMembersResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("members")
    private java.util.List < Members> members;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private ListProjectMembersResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.members = builder.members;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectMembersResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return members
     */
    public java.util.List < Members> getMembers() {
        return this.members;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private java.util.List < Members> members; 
        private String requestId; 
        private Boolean success; 

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * member信息
         */
        public Builder members(java.util.List < Members> members) {
            this.members = members;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true或者false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListProjectMembersResponseBody build() {
            return new ListProjectMembersResponseBody(this);
        } 

    } 

    public static class Division extends TeaModel {
        @NameInMap("identifier")
        private String identifier;

        private Division(Builder builder) {
            this.identifier = builder.identifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Division create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        public static final class Builder {
            private String identifier; 

            /**
             * 部门唯一标识
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            public Division build() {
                return new Division(this);
            } 

        } 

    }
    public static class OrganizationUserInfo extends TeaModel {
        @NameInMap("organizationIdentifier")
        private String organizationIdentifier;

        private OrganizationUserInfo(Builder builder) {
            this.organizationIdentifier = builder.organizationIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OrganizationUserInfo create() {
            return builder().build();
        }

        /**
         * @return organizationIdentifier
         */
        public String getOrganizationIdentifier() {
            return this.organizationIdentifier;
        }

        public static final class Builder {
            private String organizationIdentifier; 

            /**
             * 企业唯一标识符
             */
            public Builder organizationIdentifier(String organizationIdentifier) {
                this.organizationIdentifier = organizationIdentifier;
                return this;
            }

            public OrganizationUserInfo build() {
                return new OrganizationUserInfo(this);
            } 

        } 

    }
    public static class Members extends TeaModel {
        @NameInMap("account")
        private String account;

        @NameInMap("avatar")
        private String avatar;

        @NameInMap("dingTalkId")
        private String dingTalkId;

        @NameInMap("displayName")
        private String displayName;

        @NameInMap("displayNickName")
        private String displayNickName;

        @NameInMap("displayRealName")
        private String displayRealName;

        @NameInMap("division")
        private Division division;

        @NameInMap("email")
        private String email;

        @NameInMap("gender")
        private String gender;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("mobile")
        private String mobile;

        @NameInMap("nameEn")
        private String nameEn;

        @NameInMap("nickName")
        private String nickName;

        @NameInMap("nickNamePinyin")
        private String nickNamePinyin;

        @NameInMap("organizationUserInfo")
        private OrganizationUserInfo organizationUserInfo;

        @NameInMap("realName")
        private String realName;

        @NameInMap("realNamePinyin")
        private String realNamePinyin;

        @NameInMap("roleName")
        private String roleName;

        @NameInMap("stamp")
        private String stamp;

        @NameInMap("tbRoleId")
        private String tbRoleId;

        private Members(Builder builder) {
            this.account = builder.account;
            this.avatar = builder.avatar;
            this.dingTalkId = builder.dingTalkId;
            this.displayName = builder.displayName;
            this.displayNickName = builder.displayNickName;
            this.displayRealName = builder.displayRealName;
            this.division = builder.division;
            this.email = builder.email;
            this.gender = builder.gender;
            this.identifier = builder.identifier;
            this.mobile = builder.mobile;
            this.nameEn = builder.nameEn;
            this.nickName = builder.nickName;
            this.nickNamePinyin = builder.nickNamePinyin;
            this.organizationUserInfo = builder.organizationUserInfo;
            this.realName = builder.realName;
            this.realNamePinyin = builder.realNamePinyin;
            this.roleName = builder.roleName;
            this.stamp = builder.stamp;
            this.tbRoleId = builder.tbRoleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return account
         */
        public String getAccount() {
            return this.account;
        }

        /**
         * @return avatar
         */
        public String getAvatar() {
            return this.avatar;
        }

        /**
         * @return dingTalkId
         */
        public String getDingTalkId() {
            return this.dingTalkId;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return displayNickName
         */
        public String getDisplayNickName() {
            return this.displayNickName;
        }

        /**
         * @return displayRealName
         */
        public String getDisplayRealName() {
            return this.displayRealName;
        }

        /**
         * @return division
         */
        public Division getDivision() {
            return this.division;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return gender
         */
        public String getGender() {
            return this.gender;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return nameEn
         */
        public String getNameEn() {
            return this.nameEn;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return nickNamePinyin
         */
        public String getNickNamePinyin() {
            return this.nickNamePinyin;
        }

        /**
         * @return organizationUserInfo
         */
        public OrganizationUserInfo getOrganizationUserInfo() {
            return this.organizationUserInfo;
        }

        /**
         * @return realName
         */
        public String getRealName() {
            return this.realName;
        }

        /**
         * @return realNamePinyin
         */
        public String getRealNamePinyin() {
            return this.realNamePinyin;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return stamp
         */
        public String getStamp() {
            return this.stamp;
        }

        /**
         * @return tbRoleId
         */
        public String getTbRoleId() {
            return this.tbRoleId;
        }

        public static final class Builder {
            private String account; 
            private String avatar; 
            private String dingTalkId; 
            private String displayName; 
            private String displayNickName; 
            private String displayRealName; 
            private Division division; 
            private String email; 
            private String gender; 
            private String identifier; 
            private String mobile; 
            private String nameEn; 
            private String nickName; 
            private String nickNamePinyin; 
            private OrganizationUserInfo organizationUserInfo; 
            private String realName; 
            private String realNamePinyin; 
            private String roleName; 
            private String stamp; 
            private String tbRoleId; 

            /**
             * 登陆账号
             */
            public Builder account(String account) {
                this.account = account;
                return this;
            }

            /**
             * 用户头像
             */
            public Builder avatar(String avatar) {
                this.avatar = avatar;
                return this;
            }

            /**
             * 钉钉id
             */
            public Builder dingTalkId(String dingTalkId) {
                this.dingTalkId = dingTalkId;
                return this;
            }

            /**
             * 展示名
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * 展示昵称
             */
            public Builder displayNickName(String displayNickName) {
                this.displayNickName = displayNickName;
                return this;
            }

            /**
             * 展示真名
             */
            public Builder displayRealName(String displayRealName) {
                this.displayRealName = displayRealName;
                return this;
            }

            /**
             * 部门信息
             */
            public Builder division(Division division) {
                this.division = division;
                return this;
            }

            /**
             * 邮箱
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * 性别
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * 用户唯一 标识符
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * 手机号
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * 英文名
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * 昵称
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * 昵称拼音
             */
            public Builder nickNamePinyin(String nickNamePinyin) {
                this.nickNamePinyin = nickNamePinyin;
                return this;
            }

            /**
             * 企业信息
             */
            public Builder organizationUserInfo(OrganizationUserInfo organizationUserInfo) {
                this.organizationUserInfo = organizationUserInfo;
                return this;
            }

            /**
             * 真名
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * 真名拼音
             */
            public Builder realNamePinyin(String realNamePinyin) {
                this.realNamePinyin = realNamePinyin;
                return this;
            }

            /**
             * 角色名称
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * 用户类型
             */
            public Builder stamp(String stamp) {
                this.stamp = stamp;
                return this;
            }

            /**
             * 角色id
             */
            public Builder tbRoleId(String tbRoleId) {
                this.tbRoleId = tbRoleId;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
