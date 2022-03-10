// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserGroupListByParentIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserGroupListByParentIdResponseBody</p>
 */
public class QueryUserGroupListByParentIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
    private Boolean success;

    private QueryUserGroupListByParentIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserGroupListByParentIdResponseBody create() {
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
    public java.util.List < Result> getResult() {
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
        private java.util.List < Result> result; 
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
        public Builder result(java.util.List < Result> result) {
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

        public QueryUserGroupListByParentIdResponseBody build() {
            return new QueryUserGroupListByParentIdResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CreateUser")
        private String createUser;

        @NameInMap("IdentifiedPath")
        private String identifiedPath;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ModifyUser")
        private String modifyUser;

        @NameInMap("ParentUserGroupId")
        private String parentUserGroupId;

        @NameInMap("UserGroupDescription")
        private String userGroupDescription;

        @NameInMap("UserGroupId")
        private String userGroupId;

        @NameInMap("UserGroupName")
        private String userGroupName;

        private Result(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.identifiedPath = builder.identifiedPath;
            this.modifiedTime = builder.modifiedTime;
            this.modifyUser = builder.modifyUser;
            this.parentUserGroupId = builder.parentUserGroupId;
            this.userGroupDescription = builder.userGroupDescription;
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return createUser
         */
        public String getCreateUser() {
            return this.createUser;
        }

        /**
         * @return identifiedPath
         */
        public String getIdentifiedPath() {
            return this.identifiedPath;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return modifyUser
         */
        public String getModifyUser() {
            return this.modifyUser;
        }

        /**
         * @return parentUserGroupId
         */
        public String getParentUserGroupId() {
            return this.parentUserGroupId;
        }

        /**
         * @return userGroupDescription
         */
        public String getUserGroupDescription() {
            return this.userGroupDescription;
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userGroupName
         */
        public String getUserGroupName() {
            return this.userGroupName;
        }

        public static final class Builder {
            private String createTime; 
            private String createUser; 
            private String identifiedPath; 
            private String modifiedTime; 
            private String modifyUser; 
            private String parentUserGroupId; 
            private String userGroupDescription; 
            private String userGroupId; 
            private String userGroupName; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateUser.
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * IdentifiedPath.
             */
            public Builder identifiedPath(String identifiedPath) {
                this.identifiedPath = identifiedPath;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * ModifyUser.
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * ParentUserGroupId.
             */
            public Builder parentUserGroupId(String parentUserGroupId) {
                this.parentUserGroupId = parentUserGroupId;
                return this;
            }

            /**
             * UserGroupDescription.
             */
            public Builder userGroupDescription(String userGroupDescription) {
                this.userGroupDescription = userGroupDescription;
                return this;
            }

            /**
             * UserGroupId.
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * UserGroupName.
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
