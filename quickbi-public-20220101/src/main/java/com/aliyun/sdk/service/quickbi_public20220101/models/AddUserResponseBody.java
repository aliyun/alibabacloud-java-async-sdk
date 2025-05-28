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
 * {@link AddUserResponseBody} extends {@link TeaModel}
 *
 * <p>AddUserResponseBody</p>
 */
public class AddUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddUserResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserResponseBody create() {
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

        private Builder(AddUserResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D787E1A3-A93C-424A-B626-C2B05DF8D885</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns detailed information about the newly added Aliyun user.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
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

        public AddUserResponseBody build() {
            return new AddUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddUserResponseBody} extends {@link TeaModel}
     *
     * <p>AddUserResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("AdminUser")
        private Boolean adminUser;

        @com.aliyun.core.annotation.NameInMap("AuthAdminUser")
        private Boolean authAdminUser;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("RoleIdList")
        private java.util.List<Long> roleIdList;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserType")
        private Integer userType;

        private Result(Builder builder) {
            this.accountName = builder.accountName;
            this.adminUser = builder.adminUser;
            this.authAdminUser = builder.authAdminUser;
            this.nickName = builder.nickName;
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
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
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
            private String accountName; 
            private Boolean adminUser; 
            private Boolean authAdminUser; 
            private String nickName; 
            private java.util.List<Long> roleIdList; 
            private String userId; 
            private Integer userType; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.accountName = model.accountName;
                this.adminUser = model.adminUser;
                this.authAdminUser = model.authAdminUser;
                this.nickName = model.nickName;
                this.roleIdList = model.roleIdList;
                this.userId = model.userId;
                this.userType = model.userType;
            } 

            /**
             * <p>Aliyun account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:xxxxxx@163.com">xxxxxx@163.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Whether the organization administrator role is assigned. Value range: </p>
             * <ul>
             * <li>true: Yes</li>
             * <li>false: No</li>
             * </ul>
             * <p><notice>This parameter is deprecated and not recommended for use. It is invalid when RoleIdList is provided.</notice></p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder adminUser(Boolean adminUser) {
                this.adminUser = adminUser;
                return this;
            }

            /**
             * <p>Whether the permission administrator role is assigned. Value range: </p>
             * <ul>
             * <li>true: Yes</li>
             * <li>false: No</li>
             * </ul>
             * <p><notice>This parameter is deprecated and not recommended for use. It is invalid when RoleIdList is provided.</notice></p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authAdminUser(Boolean authAdminUser) {
                this.authAdminUser = authAdminUser;
                return this;
            }

            /**
             * <p>Aliyun account nickname.</p>
             * 
             * <strong>example:</strong>
             * <p>ddd</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>List of organization role IDs bound to the user.</p>
             */
            public Builder roleIdList(java.util.List<Long> roleIdList) {
                this.roleIdList = roleIdList;
                return this;
            }

            /**
             * <p>UserID in Quick BI.</p>
             * 
             * <strong>example:</strong>
             * <p>b5d8fd9348cc4327****afb604</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>User type of the organization member. Value range: </p>
             * <ul>
             * <li>1: Developer </li>
             * <li>2: Visitor </li>
             * <li>3: Analyst</li>
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
