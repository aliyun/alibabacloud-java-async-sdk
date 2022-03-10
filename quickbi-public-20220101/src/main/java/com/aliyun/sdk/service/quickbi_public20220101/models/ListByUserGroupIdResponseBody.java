// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListByUserGroupIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListByUserGroupIdResponseBody</p>
 */
public class ListByUserGroupIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
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

        public ListByUserGroupIdResponseBody build() {
            return new ListByUserGroupIdResponseBody(this);
        } 

    } 

    public static class UserGroupModels extends TeaModel {
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

        @NameInMap("ParentUsergroupId")
        private String parentUsergroupId;

        @NameInMap("UsergroupDesc")
        private String usergroupDesc;

        @NameInMap("UsergroupId")
        private String usergroupId;

        @NameInMap("UsergroupName")
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
             * ParentUsergroupId.
             */
            public Builder parentUsergroupId(String parentUsergroupId) {
                this.parentUsergroupId = parentUsergroupId;
                return this;
            }

            /**
             * UsergroupDesc.
             */
            public Builder usergroupDesc(String usergroupDesc) {
                this.usergroupDesc = usergroupDesc;
                return this;
            }

            /**
             * UsergroupId.
             */
            public Builder usergroupId(String usergroupId) {
                this.usergroupId = usergroupId;
                return this;
            }

            /**
             * UsergroupName.
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
    public static class Result extends TeaModel {
        @NameInMap("FailedUserGroupIds")
        private java.util.List < String > failedUserGroupIds;

        @NameInMap("UserGroupModels")
        private java.util.List < UserGroupModels> userGroupModels;

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
        public java.util.List < String > getFailedUserGroupIds() {
            return this.failedUserGroupIds;
        }

        /**
         * @return userGroupModels
         */
        public java.util.List < UserGroupModels> getUserGroupModels() {
            return this.userGroupModels;
        }

        public static final class Builder {
            private java.util.List < String > failedUserGroupIds; 
            private java.util.List < UserGroupModels> userGroupModels; 

            /**
             * FailedUserGroupIds.
             */
            public Builder failedUserGroupIds(java.util.List < String > failedUserGroupIds) {
                this.failedUserGroupIds = failedUserGroupIds;
                return this;
            }

            /**
             * UserGroupModels.
             */
            public Builder userGroupModels(java.util.List < UserGroupModels> userGroupModels) {
                this.userGroupModels = userGroupModels;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
