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
 * {@link QueryUserGroupMemberResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserGroupMemberResponseBody</p>
 */
public class QueryUserGroupMemberResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryUserGroupMemberResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserGroupMemberResponseBody create() {
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

        private Builder(QueryUserGroupMemberResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>48C930FF-DFCF-5986-902B-E24C202E2443</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The result of the request for the user group member list.</p>
         */
        public Builder result(java.util.List<Result> result) {
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

        public QueryUserGroupMemberResponseBody build() {
            return new QueryUserGroupMemberResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserGroupMemberResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserGroupMemberResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsUserGroup")
        private Boolean isUserGroup;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentUserGroupId")
        private String parentUserGroupId;

        @com.aliyun.core.annotation.NameInMap("ParentUserGroupName")
        private String parentUserGroupName;

        private Result(Builder builder) {
            this.id = builder.id;
            this.isUserGroup = builder.isUserGroup;
            this.name = builder.name;
            this.parentUserGroupId = builder.parentUserGroupId;
            this.parentUserGroupName = builder.parentUserGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isUserGroup
         */
        public Boolean getIsUserGroup() {
            return this.isUserGroup;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentUserGroupId
         */
        public String getParentUserGroupId() {
            return this.parentUserGroupId;
        }

        /**
         * @return parentUserGroupName
         */
        public String getParentUserGroupName() {
            return this.parentUserGroupName;
        }

        public static final class Builder {
            private String id; 
            private Boolean isUserGroup; 
            private String name; 
            private String parentUserGroupId; 
            private String parentUserGroupName; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.id = model.id;
                this.isUserGroup = model.isUserGroup;
                this.name = model.name;
                this.parentUserGroupId = model.parentUserGroupId;
                this.parentUserGroupName = model.parentUserGroupName;
            } 

            /**
             * <p>ID of the user group or the user group member.</p>
             * 
             * <strong>example:</strong>
             * <p>3d2c23d4-2b41-4af8-a1f5-f6390f32****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether it is a user group. Possible values:</p>
             * <ul>
             * <li>true: It is a user group.</li>
             * <li>false: It is a user.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isUserGroup(Boolean isUserGroup) {
                this.isUserGroup = isUserGroup;
                return this;
            }

            /**
             * <p>Name or nickname of the user group or its member.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>ID of the parent user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2fe4fbd8-588f-489a-b3e1-e92c7af0****</p>
             */
            public Builder parentUserGroupId(String parentUserGroupId) {
                this.parentUserGroupId = parentUserGroupId;
                return this;
            }

            /**
             * <p>Name of the parent user group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder parentUserGroupName(String parentUserGroupName) {
                this.parentUserGroupName = parentUserGroupName;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
