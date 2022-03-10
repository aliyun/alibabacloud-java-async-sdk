// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserGroupMemberResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserGroupMemberResponseBody</p>
 */
public class QueryUserGroupMemberResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    @NameInMap("Success")
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

        public QueryUserGroupMemberResponseBody build() {
            return new QueryUserGroupMemberResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("IsUserGroup")
        private Boolean isUserGroup;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentUserGroupId")
        private String parentUserGroupId;

        @NameInMap("ParentUserGroupName")
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

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsUserGroup.
             */
            public Builder isUserGroup(Boolean isUserGroup) {
                this.isUserGroup = isUserGroup;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * ParentUserGroupName.
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
