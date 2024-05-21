// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserInfoByAccountResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserInfoByAccountResponseBody</p>
 */
public class QueryUserInfoByAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryUserInfoByAccountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserInfoByAccountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned organization user information.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Indicates whether the request is successful. Valid values:
         * <p>
         * 
         * *   true: The request was successful.
         * *   false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryUserInfoByAccountResponseBody build() {
            return new QueryUserInfoByAccountResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AdminUser")
        private Boolean adminUser;

        @com.aliyun.core.annotation.NameInMap("AuthAdminUser")
        private Boolean authAdminUser;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        @com.aliyun.core.annotation.NameInMap("RoleIdList")
        private java.util.List < Long > roleIdList;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private Integer userType;

        private Result(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.adminUser = builder.adminUser;
            this.authAdminUser = builder.authAdminUser;
            this.email = builder.email;
            this.nickName = builder.nickName;
            this.phone = builder.phone;
            this.roleIdList = builder.roleIdList;
            this.userId = builder.userId;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return adminUser
         */
        public Boolean getAdminUser() {
            return this.adminUser;
        }

        /**
         * @return authAdminUser
         */
        public Boolean getAuthAdminUser() {
            return this.authAdminUser;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return roleIdList
         */
        public java.util.List < Long > getRoleIdList() {
            return this.roleIdList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userType
         */
        public Integer getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private Boolean adminUser; 
            private Boolean authAdminUser; 
            private String email; 
            private String nickName; 
            private String phone; 
            private java.util.List < Long > roleIdList; 
            private String userId; 
            private Integer userType; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * The name of the Alibaba Cloud account that corresponds to the member. (If you use a RAM user, the domain name information that follows @ is removed. For example, if you use a <test@test.com>, test is returned.)
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * Whether you are an administrator of the organization. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder adminUser(Boolean adminUser) {
                this.adminUser = adminUser;
                return this;
            }

            /**
             * Whether you are a permission administrator. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder authAdminUser(Boolean authAdminUser) {
                this.authAdminUser = authAdminUser;
                return this;
            }

            /**
             * The email address of the user.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The nickname of the account.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * The phone number of the alert contact.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * RoleIdList.
             */
            public Builder roleIdList(java.util.List < Long > roleIdList) {
                this.roleIdList = roleIdList;
                return this;
            }

            /**
             * The UserID in the Quick BI.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * The role type of the organization member. Valid values:
             * <p>
             * 
             * *   1 : developer
             * *   2 : visitors
             * *   3 : Analyst
             */
            public Builder userType(Integer userType) {
                this.userType = userType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
