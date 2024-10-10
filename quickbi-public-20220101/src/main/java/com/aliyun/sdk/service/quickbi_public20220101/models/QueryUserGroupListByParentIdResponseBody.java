// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryUserGroupListByParentIdResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserGroupListByParentIdResponseBody</p>
 */
public class QueryUserGroupListByParentIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>72B19D61-B37A-5C7A-9389-0856CD7935B3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the sub-user group.</p>
         */
        public Builder result(java.util.List < Result> result) {
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

        public QueryUserGroupListByParentIdResponseBody build() {
            return new QueryUserGroupListByParentIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserGroupListByParentIdResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserGroupListByParentIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("CreateUser")
        private String createUser;

        @com.aliyun.core.annotation.NameInMap("IdentifiedPath")
        private String identifiedPath;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("ModifyUser")
        private String modifyUser;

        @com.aliyun.core.annotation.NameInMap("ParentUserGroupId")
        private String parentUserGroupId;

        @com.aliyun.core.annotation.NameInMap("UserGroupDescription")
        private String userGroupDescription;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserGroupName")
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
             * <p>The time when the sub-user group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-30 10:03:09</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator of the sub-user group. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>136516262323****</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>Directory level of the sub-user group.</p>
             */
            public Builder identifiedPath(String identifiedPath) {
                this.identifiedPath = identifiedPath;
                return this;
            }

            /**
             * <p>The time when the sub-user group was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-11-16 15:49:08</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The user who modified the subgroup. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>136516262323****</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The ID of the parent user group.</p>
             * 
             * <strong>example:</strong>
             * <p>3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
             */
            public Builder parentUserGroupId(String parentUserGroupId) {
                this.parentUserGroupId = parentUserGroupId;
                return this;
            }

            /**
             * <p>The description of the sub-user group.</p>
             * 
             * <strong>example:</strong>
             * <p>User Group for Testing</p>
             */
            public Builder userGroupDescription(String userGroupDescription) {
                this.userGroupDescription = userGroupDescription;
                return this;
            }

            /**
             * <p>The ID of the sub-user group.</p>
             * 
             * <strong>example:</strong>
             * <p>f5eeb52e-d9c2-4a8b-80e3-47ab55c2****</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * <p>The name of the sub-user group.</p>
             * 
             * <strong>example:</strong>
             * <p>popapi test group</p>
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
