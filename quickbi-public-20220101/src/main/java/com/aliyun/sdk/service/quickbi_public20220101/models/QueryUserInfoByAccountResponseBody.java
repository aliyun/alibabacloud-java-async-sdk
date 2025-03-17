// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryUserInfoByAccountResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned organization user information.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li>true: The request was successful.</li>
         * <li>false: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryUserInfoByAccountResponseBody build() {
            return new QueryUserInfoByAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserInfoByAccountResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserInfoByAccountResponseBody</p>
     */
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
        private java.util.List<Long> roleIdList;

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
        public java.util.List<Long> getRoleIdList() {
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
            private java.util.List<Long> roleIdList; 
            private String userId; 
            private Integer userType; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.adminUser = model.adminUser;
                this.authAdminUser = model.authAdminUser;
                this.email = model.email;
                this.nickName = model.nickName;
                this.phone = model.phone;
                this.roleIdList = model.roleIdList;
                this.userId = model.userId;
                this.userType = model.userType;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>135****5848</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The name of the Alibaba Cloud account that corresponds to the member. (If you use a RAM user, the domain name information that follows @ is removed. For example, if you use a <a href="mailto:test@test.com">test@test.com</a>, test is returned.)</p>
             * 
             * <strong>example:</strong>
             * <p>1386587****@163.com</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Whether you are an administrator of the organization. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder adminUser(Boolean adminUser) {
                this.adminUser = adminUser;
                return this;
            }

            /**
             * <p>Whether you are a permission administrator. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authAdminUser(Boolean authAdminUser) {
                this.authAdminUser = authAdminUser;
                return this;
            }

            /**
             * <p>The email address of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1386587****@163.com</p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The nickname of the account.</p>
             * 
             * <strong>example:</strong>
             * <p>Test user</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>The phone number of the alert contact.</p>
             * 
             * <strong>example:</strong>
             * <p>1386587****</p>
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * <p>用户绑定的组织角色ID列表。</p>
             */
            public Builder roleIdList(java.util.List<Long> roleIdList) {
                this.roleIdList = roleIdList;
                return this;
            }

            /**
             * <p>The UserID in the Quick BI.</p>
             * 
             * <strong>example:</strong>
             * <p>fe67f61a35a94b7da1a34ba174a7****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The role type of the organization member. Valid values:</p>
             * <ul>
             * <li>1 : developer</li>
             * <li>2 : visitors</li>
             * <li>3 : Analyst</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
