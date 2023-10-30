// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserGroupResponseBody</p>
 */
public class GetUserGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UserGroup")
    private UserGroup userGroup;

    private GetUserGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userGroup = builder.userGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userGroup
     */
    public UserGroup getUserGroup() {
        return this.userGroup;
    }

    public static final class Builder {
        private String requestId; 
        private UserGroup userGroup; 

        /**
         * Queries the details of a specified user group in a specified Bastionhost instance.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * GetUserGroup
         */
        public Builder userGroup(UserGroup userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public GetUserGroupResponseBody build() {
            return new GetUserGroupResponseBody(this);
        } 

    } 

    public static class UserGroup extends TeaModel {
        @NameInMap("Comment")
        private String comment;

        @NameInMap("UserGroupId")
        private String userGroupId;

        @NameInMap("UserGroupName")
        private String userGroupName;

        private UserGroup(Builder builder) {
            this.comment = builder.comment;
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroup create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
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
            private String comment; 
            private String userGroupId; 
            private String userGroupName; 

            /**
             * GetUserGroup
             */
            public Builder comment(String comment) {
                this.comment = comment;
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
             * WB662865
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public UserGroup build() {
                return new UserGroup(this);
            } 

        } 

    }
}
