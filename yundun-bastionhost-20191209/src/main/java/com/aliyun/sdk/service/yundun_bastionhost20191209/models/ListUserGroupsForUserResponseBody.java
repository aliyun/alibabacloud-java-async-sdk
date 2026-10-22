// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link ListUserGroupsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserGroupsForUserResponseBody</p>
 */
public class ListUserGroupsForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserGroups")
    private java.util.List<UserGroups> userGroups;

    private ListUserGroupsForUserResponseBody(Builder builder) {
        this.count = builder.count;
        this.requestId = builder.requestId;
        this.userGroups = builder.userGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserGroupsForUserResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userGroups
     */
    public java.util.List<UserGroups> getUserGroups() {
        return this.userGroups;
    }

    public static final class Builder {
        private Integer count; 
        private String requestId; 
        private java.util.List<UserGroups> userGroups; 

        private Builder() {
        } 

        private Builder(ListUserGroupsForUserResponseBody model) {
            this.count = model.count;
            this.requestId = model.requestId;
            this.userGroups = model.userGroups;
        } 

        /**
         * <p>The total number of user groups returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

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
         * <p>The list of user groups.</p>
         */
        public Builder userGroups(java.util.List<UserGroups> userGroups) {
            this.userGroups = userGroups;
            return this;
        }

        public ListUserGroupsForUserResponseBody build() {
            return new ListUserGroupsForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserGroupsForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserGroupsForUserResponseBody</p>
     */
    public static class UserGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserGroupName")
        private String userGroupName;

        private UserGroups(Builder builder) {
            this.comment = builder.comment;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.userGroupId = builder.userGroupId;
            this.userGroupName = builder.userGroupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserGroups create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
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
            private String projectId; 
            private String projectName; 
            private String userGroupId; 
            private String userGroupName; 

            private Builder() {
            } 

            private Builder(UserGroups model) {
                this.comment = model.comment;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.userGroupId = model.userGroupId;
                this.userGroupName = model.userGroupName;
            } 

            /**
             * <p>The remarks of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>comment</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>The ID of the project to which the user group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the project to which the user group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The ID of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * <p>The name of the user group.</p>
             * 
             * <strong>example:</strong>
             * <p>group</p>
             */
            public Builder userGroupName(String userGroupName) {
                this.userGroupName = userGroupName;
                return this;
            }

            public UserGroups build() {
                return new UserGroups(this);
            } 

        } 

    }
}
