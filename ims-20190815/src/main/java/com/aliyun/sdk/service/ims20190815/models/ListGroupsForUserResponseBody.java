// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListGroupsForUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListGroupsForUserResponseBody</p>
 */
public class ListGroupsForUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private Groups groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGroupsForUserResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGroupsForUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public Groups getGroups() {
        return this.groups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Groups groups; 
        private String requestId; 

        /**
         * <p>The information of the RAM user groups.</p>
         */
        public Builder groups(Groups groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7158A935-FB5E-49A7-8E52-FDA5B2B67247</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGroupsForUserResponseBody build() {
            return new ListGroupsForUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGroupsForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsForUserResponseBody</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("JoinDate")
        private String joinDate;

        private Group(Builder builder) {
            this.comments = builder.comments;
            this.displayName = builder.displayName;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.joinDate = builder.joinDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return joinDate
         */
        public String getJoinDate() {
            return this.joinDate;
        }

        public static final class Builder {
            private String comments; 
            private String displayName; 
            private String groupId; 
            private String groupName; 
            private String joinDate; 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Test-Team</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The display name of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>Test-Team</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>740317625433843****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>Test-Team</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The time when the RAM user was added.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-10-20T06:57:00Z</p>
             */
            public Builder joinDate(String joinDate) {
                this.joinDate = joinDate;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGroupsForUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListGroupsForUserResponseBody</p>
     */
    public static class Groups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Group")
        private java.util.List<Group> group;

        private Groups(Builder builder) {
            this.group = builder.group;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return group
         */
        public java.util.List<Group> getGroup() {
            return this.group;
        }

        public static final class Builder {
            private java.util.List<Group> group; 

            /**
             * Group.
             */
            public Builder group(java.util.List<Group> group) {
                this.group = group;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
