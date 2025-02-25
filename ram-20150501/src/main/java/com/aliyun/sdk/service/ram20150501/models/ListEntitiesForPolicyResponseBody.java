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
 * {@link ListEntitiesForPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ListEntitiesForPolicyResponseBody</p>
 */
public class ListEntitiesForPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Groups")
    private Groups groups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private Roles roles;

    @com.aliyun.core.annotation.NameInMap("Users")
    private Users users;

    private ListEntitiesForPolicyResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
        this.roles = builder.roles;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEntitiesForPolicyResponseBody create() {
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

    /**
     * @return roles
     */
    public Roles getRoles() {
        return this.roles;
    }

    /**
     * @return users
     */
    public Users getUsers() {
        return this.users;
    }

    public static final class Builder {
        private Groups groups; 
        private String requestId; 
        private Roles roles; 
        private Users users; 

        /**
         * <p>The list of the RAM user groups.</p>
         */
        public Builder groups(Groups groups) {
            this.groups = groups;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of RAM roles.</p>
         */
        public Builder roles(Roles roles) {
            this.roles = roles;
            return this;
        }

        /**
         * <p>The list of the RAM users to which the policy is attached.</p>
         */
        public Builder users(Users users) {
            this.users = users;
            return this;
        }

        public ListEntitiesForPolicyResponseBody build() {
            return new ListEntitiesForPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEntitiesForPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesForPolicyResponseBody</p>
     */
    public static class Group extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachDate")
        private String attachDate;

        @com.aliyun.core.annotation.NameInMap("Comments")
        private String comments;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        private Group(Builder builder) {
            this.attachDate = builder.attachDate;
            this.comments = builder.comments;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Group create() {
            return builder().build();
        }

        /**
         * @return attachDate
         */
        public String getAttachDate() {
            return this.attachDate;
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private String attachDate; 
            private String comments; 
            private String groupName; 

            /**
             * <p>The time when the policy was attached to the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-02-18T17:22:08Z</p>
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * <p>The description of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>Test team</p>
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * <p>The name of the RAM user group.</p>
             * 
             * <strong>example:</strong>
             * <p>QA-Team</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public Group build() {
                return new Group(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEntitiesForPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesForPolicyResponseBody</p>
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
    /**
     * 
     * {@link ListEntitiesForPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesForPolicyResponseBody</p>
     */
    public static class Role extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("AttachDate")
        private String attachDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        private Role(Builder builder) {
            this.arn = builder.arn;
            this.attachDate = builder.attachDate;
            this.description = builder.description;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Role create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return attachDate
         */
        public String getAttachDate() {
            return this.attachDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        public static final class Builder {
            private String arn; 
            private String attachDate; 
            private String description; 
            private String roleId; 
            private String roleName; 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/ECSAdmin</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The time when the policy was attached to the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * <p>The description of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS administrator</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>122748924538****</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>The name of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>ECSAdmin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEntitiesForPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesForPolicyResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Role")
        private java.util.List<Role> role;

        private Roles(Builder builder) {
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public java.util.List<Role> getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<Role> role; 

            /**
             * Role.
             */
            public Builder role(java.util.List<Role> role) {
                this.role = role;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEntitiesForPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesForPolicyResponseBody</p>
     */
    public static class User extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachDate")
        private String attachDate;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private User(Builder builder) {
            this.attachDate = builder.attachDate;
            this.displayName = builder.displayName;
            this.userId = builder.userId;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static User create() {
            return builder().build();
        }

        /**
         * @return attachDate
         */
        public String getAttachDate() {
            return this.attachDate;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String attachDate; 
            private String displayName; 
            private String userId; 
            private String userName; 

            /**
             * <p>The time when the policy was attached to the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder attachDate(String attachDate) {
                this.attachDate = attachDate;
                return this;
            }

            /**
             * <p>The display name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhang*</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The unique ID of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>122748924538****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p>zhangq****</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public User build() {
                return new User(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEntitiesForPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ListEntitiesForPolicyResponseBody</p>
     */
    public static class Users extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("User")
        private java.util.List<User> user;

        private Users(Builder builder) {
            this.user = builder.user;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return user
         */
        public java.util.List<User> getUser() {
            return this.user;
        }

        public static final class Builder {
            private java.util.List<User> user; 

            /**
             * User.
             */
            public Builder user(java.util.List<User> user) {
                this.user = user;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
