// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListProjectMembersResponseBody} extends {@link TeaModel}
 *
 * <p>ListProjectMembersResponseBody</p>
 */
public class ListProjectMembersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("members")
    private java.util.List<Members> members;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
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
    public java.util.List<Members> getMembers() {
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
        private java.util.List<Members> members; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * members.
         */
        public Builder members(java.util.List<Members> members) {
            this.members = members;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListProjectMembersResponseBody build() {
            return new ListProjectMembersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProjectMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectMembersResponseBody</p>
     */
    public static class Division extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("identifier")
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
             * identifier.
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
    /**
     * 
     * {@link ListProjectMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectMembersResponseBody</p>
     */
    public static class OrganizationUserInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("organizationIdentifier")
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
             * organizationIdentifier.
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
    /**
     * 
     * {@link ListProjectMembersResponseBody} extends {@link TeaModel}
     *
     * <p>ListProjectMembersResponseBody</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("account")
        private String account;

        @com.aliyun.core.annotation.NameInMap("avatar")
        private String avatar;

        @com.aliyun.core.annotation.NameInMap("dingTalkId")
        private String dingTalkId;

        @com.aliyun.core.annotation.NameInMap("displayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("displayNickName")
        private String displayNickName;

        @com.aliyun.core.annotation.NameInMap("displayRealName")
        private String displayRealName;

        @com.aliyun.core.annotation.NameInMap("division")
        private Division division;

        @com.aliyun.core.annotation.NameInMap("email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("gender")
        private String gender;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("mobile")
        private String mobile;

        @com.aliyun.core.annotation.NameInMap("nameEn")
        private String nameEn;

        @com.aliyun.core.annotation.NameInMap("nickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("nickNamePinyin")
        private String nickNamePinyin;

        @com.aliyun.core.annotation.NameInMap("organizationUserInfo")
        private OrganizationUserInfo organizationUserInfo;

        @com.aliyun.core.annotation.NameInMap("realName")
        private String realName;

        @com.aliyun.core.annotation.NameInMap("realNamePinyin")
        private String realNamePinyin;

        @com.aliyun.core.annotation.NameInMap("roleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("stamp")
        private String stamp;

        @com.aliyun.core.annotation.NameInMap("tbRoleId")
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
             * account.
             */
            public Builder account(String account) {
                this.account = account;
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
             * dingTalkId.
             */
            public Builder dingTalkId(String dingTalkId) {
                this.dingTalkId = dingTalkId;
                return this;
            }

            /**
             * displayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * displayNickName.
             */
            public Builder displayNickName(String displayNickName) {
                this.displayNickName = displayNickName;
                return this;
            }

            /**
             * displayRealName.
             */
            public Builder displayRealName(String displayRealName) {
                this.displayRealName = displayRealName;
                return this;
            }

            /**
             * division.
             */
            public Builder division(Division division) {
                this.division = division;
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
             * gender.
             */
            public Builder gender(String gender) {
                this.gender = gender;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
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
             * nameEn.
             */
            public Builder nameEn(String nameEn) {
                this.nameEn = nameEn;
                return this;
            }

            /**
             * nickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * nickNamePinyin.
             */
            public Builder nickNamePinyin(String nickNamePinyin) {
                this.nickNamePinyin = nickNamePinyin;
                return this;
            }

            /**
             * organizationUserInfo.
             */
            public Builder organizationUserInfo(OrganizationUserInfo organizationUserInfo) {
                this.organizationUserInfo = organizationUserInfo;
                return this;
            }

            /**
             * realName.
             */
            public Builder realName(String realName) {
                this.realName = realName;
                return this;
            }

            /**
             * realNamePinyin.
             */
            public Builder realNamePinyin(String realNamePinyin) {
                this.realNamePinyin = realNamePinyin;
                return this;
            }

            /**
             * <p>角色名称</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * stamp.
             */
            public Builder stamp(String stamp) {
                this.stamp = stamp;
                return this;
            }

            /**
             * tbRoleId.
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
