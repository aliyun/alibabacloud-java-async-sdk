// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserGroupResponseBody</p>
 */
public class GetUserGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserGroup")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC9BF0F4-8983-491A-BC8C-1B4DD94976DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the user group returned.</p>
         */
        public Builder userGroup(UserGroup userGroup) {
            this.userGroup = userGroup;
            return this;
        }

        public GetUserGroupResponseBody build() {
            return new GetUserGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserGroupResponseBody</p>
     */
    public static class UserGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserGroupName")
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
             * <p>The description of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The ID of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * <p>The name of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>UserGroup01</p>
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
