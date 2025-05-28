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

        private Builder() {
        } 

        private Builder(ListUserGroupsByUserIdResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E2440604-3059-561A-AD68-DEDBC870EB2B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the group.</p>
         */
        public Builder result(java.util.List<Result> result) {
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

            private Builder() {
            } 

            private Builder(Result model) {
                this.createTime = model.createTime;
                this.createUser = model.createUser;
                this.identifiedPath = model.identifiedPath;
                this.modifiedTime = model.modifiedTime;
                this.modifyUser = model.modifyUser;
                this.parentUsergroupId = model.parentUsergroupId;
                this.usergroupDesc = model.usergroupDesc;
                this.usergroupId = model.usergroupId;
                this.usergroupName = model.usergroupName;
            } 

            /**
             * <p>The time when the user group was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15 17:13:55</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The user group creator. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>46e5374665ba4b679ee22e2a2927****</p>
             */
            public Builder createUser(String createUser) {
                this.createUser = createUser;
                return this;
            }

            /**
             * <p>Directory level of the user group.</p>
             */
            public Builder identifiedPath(String identifiedPath) {
                this.identifiedPath = identifiedPath;
                return this;
            }

            /**
             * <p>The time when the user group was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-03-15 20:36:40</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The user group modifier. The UserID of the Quick BI is used instead of the UID of Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>46e5374665ba4b679ee22e2a2927****</p>
             */
            public Builder modifyUser(String modifyUser) {
                this.modifyUser = modifyUser;
                return this;
            }

            /**
             * <p>The ID of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2fe4fbd8-588f-489a-b3e1-e92c7af0****</p>
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
             * <p>34fd141d-4598-4093-8c33-8e066dcb****</p>
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

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
