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
 * {@link ListUserGroupsByUserIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGroupsByUserIdResponseBody</p>
 */
public class ListUserGroupsByUserIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListUserGroupsByUserIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsByUserIdResponseBody create() {
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
    public java.util.List<Result> getResult() {
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
        private java.util.List<Result> result; 
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
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * <p>The user group modifier. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListUserGroupsByUserIdResponseBody build() {
            return new ListUserGroupsByUserIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserGroupsByUserIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsByUserIdResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("ParentUsergroupId")
        private String parentUsergroupId;

        @com.aliyun.core.annotation.NameInMap("UsergroupDesc")
        private String usergroupDesc;

        @com.aliyun.core.annotation.NameInMap("UsergroupId")
        private String usergroupId;

        @com.aliyun.core.annotation.NameInMap("UsergroupName")
        private String usergroupName;

        private Result(Builder builder) {
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
