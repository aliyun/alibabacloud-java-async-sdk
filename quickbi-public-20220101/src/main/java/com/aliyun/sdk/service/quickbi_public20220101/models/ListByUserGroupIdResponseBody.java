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
 * {@link ListByUserGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListByUserGroupIdResponseBody</p>
 */
public class ListByUserGroupIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListByUserGroupIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListByUserGroupIdResponseBody create() {
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D8749D65-E80A-433C-AF1B-CE9C180FF3B4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The user group query result is returned.</p>
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

        public ListByUserGroupIdResponseBody build() {
            return new ListByUserGroupIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListByUserGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListByUserGroupIdResponseBody</p>
     */
    public static class UserGroupModels extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("ParentUsergroupId")
        private String parentUsergroupId;

        @com.aliyun.core.annotation.NameInMap("UsergroupDesc")
        private String usergroupDesc;

        @com.aliyun.core.annotation.NameInMap("UsergroupId")
        private String usergroupId;

        @com.aliyun.core.annotation.NameInMap("UsergroupName")
        private String usergroupName;

        private UserGroupModels(Builder builder) {
            this.createTime = builder.createTime;
            this.createUser = builder.createUser;
            this.identifiedPath = builder.identifiedPath;
            this.modifiedTime = builder.modifiedTime;
            this.modifyUser = builder.modifyUser;
            this.parentUsergroupId = builder.parentUsergroupId;
            this.usergroupDesc = builder.usergroupDesc;
            this.usergroupId = builder.usergroupId;
            this.usergroupName = builder.usergroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroupModels create() {
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
         * @return parentUsergroupId
         */
        public String getParentUsergroupId() {
            return this.parentUsergroupId;
        }

        /**
         * @return usergroupDesc
         */
        public String getUsergroupDesc() {
            return this.usergroupDesc;
        }

        /**
         * @return usergroupId
         */
        public String getUsergroupId() {
            return this.usergroupId;
        }

        /**
         * @return usergroupName
         */
        public String getUsergroupName() {
            return this.usergroupName;
        }

        public static final class Builder {
            private String createTime; 
            private String createUser; 
            private String identifiedPath; 
            private String modifiedTime; 
            private String modifyUser; 
            private String parentUsergroupId; 
            private String usergroupDesc; 
            private String usergroupId; 
            private String usergroupName; 

            /**
             * <p>The time when the Secret was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15 17:13:55</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The UserID of the creator in the Quick BI.</p>
             * 
             * <strong>example:</strong>
             * <p>46e5*******ee22e2a292704c8</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>The path of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2fe4fbd8-<strong><strong>-af083ea/34fd1-</strong></strong>-dcbc33f</p>
             */
            public Builder identifiedPath(String identifiedPath) {
                this.identifiedPath = identifiedPath;
                return this;
            }

            /**
             * <p>The time when the protection policy was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15 20:36:40</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The UserID of the modifier in the Quick BI.</p>
             * 
             * <strong>example:</strong>
             * <p>46e5*******ee22e2a292704c8</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The ID of the parent user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2fe4fbd8-588f-489a-b3e1-e92c7af083ea</p>
             */
            public Builder parentUsergroupId(String parentUsergroupId) {
                this.parentUsergroupId = parentUsergroupId;
                return this;
            }

            /**
             * <p>The description of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>Description</p>
             */
            public Builder usergroupDesc(String usergroupDesc) {
                this.usergroupDesc = usergroupDesc;
                return this;
            }

            /**
             * <p>The ID of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>34fd141d-****-4093-8c33-8e066dcbc33f</p>
             */
            public Builder usergroupId(String usergroupId) {
                this.usergroupId = usergroupId;
                return this;
            }

            /**
             * <p>The name of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>Test user group</p>
             */
            public Builder usergroupName(String usergroupName) {
                this.usergroupName = usergroupName;
                return this;
            }

            public UserGroupModels build() {
                return new UserGroupModels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListByUserGroupIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListByUserGroupIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedUserGroupIds")
        private java.util.List<String> failedUserGroupIds;

        @com.aliyun.core.annotation.NameInMap("UserGroupModels")
        private java.util.List<UserGroupModels> userGroupModels;

        private Result(Builder builder) {
            this.failedUserGroupIds = builder.failedUserGroupIds;
            this.userGroupModels = builder.userGroupModels;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return failedUserGroupIds
         */
        public java.util.List<String> getFailedUserGroupIds() {
            return this.failedUserGroupIds;
        }

        /**
         * @return userGroupModels
         */
        public java.util.List<UserGroupModels> getUserGroupModels() {
            return this.userGroupModels;
        }

        public static final class Builder {
            private java.util.List<String> failedUserGroupIds; 
            private java.util.List<UserGroupModels> userGroupModels; 

            /**
             * FailedUserGroupIds.
             */
            public Builder failedUserGroupIds(java.util.List<String> failedUserGroupIds) {
                this.failedUserGroupIds = failedUserGroupIds;
                return this;
            }

            /**
             * <p>The details of the user group that was queried.</p>
             */
            public Builder userGroupModels(java.util.List<UserGroupModels> userGroupModels) {
                this.userGroupModels = userGroupModels;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
