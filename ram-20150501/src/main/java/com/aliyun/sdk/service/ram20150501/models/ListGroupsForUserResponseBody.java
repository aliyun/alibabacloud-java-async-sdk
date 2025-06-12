// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListGroupsForUserResponseBody model) {
            this.groups = model.groups;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the RAM user groups.</p>
         */
        public Builder groups(Groups groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DA772B52-BF9F-54CA-AC77-AA7A2DA89D46</p>
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

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("JoinDate")
        private String joinDate;

        private Group(Builder builder) {
            this.comments = builder.comments;
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
            private String groupId; 
            private String groupName; 
            private String joinDate; 

            private Builder() {
            } 

            private Builder(Group model) {
                this.comments = model.comments;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.joinDate = model.joinDate;
            } 

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Dev-Team</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The ID of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>g-zYtroLrgbZR1****</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>Dev-Team</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The time when the RAM user was added to the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
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

            private Builder() {
            } 

            private Builder(Groups model) {
                this.group = model.group;
            } 

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
