// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoleResponseBody</p>
 */
public class ListRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleList")
    private RoleList roleList;

    private ListRoleResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.roleList = builder.roleList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roleList
     */
    public RoleList getRoleList() {
        return this.roleList;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private RoleList roleList; 

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The roles.
         */
        public Builder roleList(RoleList roleList) {
            this.roleList = roleList;
            return this;
        }

        public ListRoleResponseBody build() {
            return new ListRoleResponseBody(this);
        } 

    } 

    public static class Action extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("Name")
        private String name;

        private Action(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Action create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private String groupId; 
            private String name; 

            /**
             * The serial number of the permission that is granted to the role.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The description of the permission to be granted to the role.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the permission group to which the permission that is granted to the role belongs.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the permission to be granted to the role.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Action build() {
                return new Action(this);
            } 

        } 

    }
    public static class ActionList extends TeaModel {
        @NameInMap("Action")
        private java.util.List < Action> action;

        private ActionList(Builder builder) {
            this.action = builder.action;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActionList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public java.util.List < Action> getAction() {
            return this.action;
        }

        public static final class Builder {
            private java.util.List < Action> action; 

            /**
             * Action.
             */
            public Builder action(java.util.List < Action> action) {
                this.action = action;
                return this;
            }

            public ActionList build() {
                return new ActionList(this);
            } 

        } 

    }
    public static class Role extends TeaModel {
        @NameInMap("AdminUserId")
        private String adminUserId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Name")
        private String name;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Role(Builder builder) {
            this.adminUserId = builder.adminUserId;
            this.createTime = builder.createTime;
            this.id = builder.id;
            this.isDefault = builder.isDefault;
            this.name = builder.name;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Role create() {
            return builder().build();
        }

        /**
         * @return adminUserId
         */
        public String getAdminUserId() {
            return this.adminUserId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String adminUserId; 
            private Long createTime; 
            private Integer id; 
            private Boolean isDefault; 
            private String name; 
            private Long updateTime; 

            /**
             * The ID of the Alibaba Cloud account.
             */
            public Builder adminUserId(String adminUserId) {
                this.adminUserId = adminUserId;
                return this;
            }

            /**
             * The timestamp when the role was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the role.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Indicates whether the role is a default role.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The name of the role.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The timestamp when the role was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
    public static class RoleItem extends TeaModel {
        @NameInMap("ActionList")
        private ActionList actionList;

        @NameInMap("Role")
        private Role role;

        private RoleItem(Builder builder) {
            this.actionList = builder.actionList;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleItem create() {
            return builder().build();
        }

        /**
         * @return actionList
         */
        public ActionList getActionList() {
            return this.actionList;
        }

        /**
         * @return role
         */
        public Role getRole() {
            return this.role;
        }

        public static final class Builder {
            private ActionList actionList; 
            private Role role; 

            /**
             * The set of permissions to be granted to the role.
             */
            public Builder actionList(ActionList actionList) {
                this.actionList = actionList;
                return this;
            }

            /**
             * The roles.
             */
            public Builder role(Role role) {
                this.role = role;
                return this;
            }

            public RoleItem build() {
                return new RoleItem(this);
            } 

        } 

    }
    public static class RoleList extends TeaModel {
        @NameInMap("RoleItem")
        private java.util.List < RoleItem> roleItem;

        private RoleList(Builder builder) {
            this.roleItem = builder.roleItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleList create() {
            return builder().build();
        }

        /**
         * @return roleItem
         */
        public java.util.List < RoleItem> getRoleItem() {
            return this.roleItem;
        }

        public static final class Builder {
            private java.util.List < RoleItem> roleItem; 

            /**
             * RoleItem.
             */
            public Builder roleItem(java.util.List < RoleItem> roleItem) {
                this.roleItem = roleItem;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
}
