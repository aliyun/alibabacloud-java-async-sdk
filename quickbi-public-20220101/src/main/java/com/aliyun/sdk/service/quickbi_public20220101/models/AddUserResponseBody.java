// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUserResponseBody} extends {@link TeaModel}
 *
 * <p>AddUserResponseBody</p>
 */
public class AddUserResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AddUserResponseBody build() {
            return new AddUserResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AdminUser")
        private Boolean adminUser;

        @NameInMap("AuthAdminUser")
        private Boolean authAdminUser;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("RoleIdList")
        private java.util.List < Long > roleIdList;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserType")
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
            private String accountName; 
            private Boolean adminUser; 
            private Boolean authAdminUser; 
            private String nickName; 
            private java.util.List < Long > roleIdList; 
            private String userId; 
            private Integer userType; 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AdminUser.
             */
            public Builder adminUser(Boolean adminUser) {
                this.adminUser = adminUser;
                return this;
            }

            /**
             * AuthAdminUser.
             */
            public Builder authAdminUser(Boolean authAdminUser) {
                this.authAdminUser = authAdminUser;
                return this;
            }

            /**
             * NickName.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserType.
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
