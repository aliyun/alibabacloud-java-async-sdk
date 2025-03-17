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
 * {@link ListDataLevelPermissionWhiteListResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataLevelPermissionWhiteListResponseBody</p>
 */
public class ListDataLevelPermissionWhiteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListDataLevelPermissionWhiteListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataLevelPermissionWhiteListResponseBody create() {
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

        private Builder(ListDataLevelPermissionWhiteListResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

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

        public ListDataLevelPermissionWhiteListResponseBody build() {
            return new ListDataLevelPermissionWhiteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataLevelPermissionWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataLevelPermissionWhiteListResponseBody</p>
     */
    public static class UsersModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserGroups")
        private java.util.List<String> userGroups;

        @com.aliyun.core.annotation.NameInMap("Users")
        private java.util.List<String> users;

        private UsersModel(Builder builder) {
            this.userGroups = builder.userGroups;
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsersModel create() {
            return builder().build();
        }

        /**
         * @return userGroups
         */
        public java.util.List<String> getUserGroups() {
            return this.userGroups;
        }

        /**
         * @return users
         */
        public java.util.List<String> getUsers() {
            return this.users;
        }

        public static final class Builder {
            private java.util.List<String> userGroups; 
            private java.util.List<String> users; 

            private Builder() {
            } 

            private Builder(UsersModel model) {
                this.userGroups = model.userGroups;
                this.users = model.users;
            } 

            /**
             * UserGroups.
             */
            public Builder userGroups(java.util.List<String> userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            /**
             * Users.
             */
            public Builder users(java.util.List<String> users) {
                this.users = users;
                return this;
            }

            public UsersModel build() {
                return new UsersModel(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataLevelPermissionWhiteListResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataLevelPermissionWhiteListResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CubeId")
        private String cubeId;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("UsersModel")
        private UsersModel usersModel;

        private Result(Builder builder) {
            this.cubeId = builder.cubeId;
            this.ruleType = builder.ruleType;
            this.usersModel = builder.usersModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return cubeId
         */
        public String getCubeId() {
            return this.cubeId;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return usersModel
         */
        public UsersModel getUsersModel() {
            return this.usersModel;
        }

        public static final class Builder {
            private String cubeId; 
            private String ruleType; 
            private UsersModel usersModel; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.cubeId = model.cubeId;
                this.ruleType = model.ruleType;
                this.usersModel = model.usersModel;
            } 

            /**
             * CubeId.
             */
            public Builder cubeId(String cubeId) {
                this.cubeId = cubeId;
                return this;
            }

            /**
             * RuleType.
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * UsersModel.
             */
            public Builder usersModel(UsersModel usersModel) {
                this.usersModel = usersModel;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
