// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link ListRoleResponseBody} extends {@link TeaModel}
 *
 * <p>ListRoleResponseBody</p>
 */
public class ListRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleList")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListRoleResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.roleList = model.roleList;
        } 

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>57609587-DFA2-41EC-<strong><strong>-</strong></strong>*****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The roles.</p>
         */
        public Builder roleList(RoleList roleList) {
            this.roleList = roleList;
            return this;
        }

        public ListRoleResponseBody build() {
            return new ListRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRoleResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoleResponseBody</p>
     */
    public static class Action extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(Action model) {
                this.code = model.code;
                this.description = model.description;
                this.groupId = model.groupId;
                this.name = model.name;
            } 

            /**
             * <p>The serial number of the permission that is granted to the role.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The description of the permission to be granted to the role.</p>
             * 
             * <strong>example:</strong>
             * <p>Operations in operation records</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the permission group to which the permission that is granted to the role belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>31</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the permission to be granted to the role.</p>
             * 
             * <strong>example:</strong>
             * <p>Operation records</p>
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
    /**
     * 
     * {@link ListRoleResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoleResponseBody</p>
     */
    public static class ActionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private java.util.List<Action> action;

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
        public java.util.List<Action> getAction() {
            return this.action;
        }

        public static final class Builder {
            private java.util.List<Action> action; 

            private Builder() {
            } 

            private Builder(ActionList model) {
                this.action = model.action;
            } 

            /**
             * Action.
             */
            public Builder action(java.util.List<Action> action) {
                this.action = action;
                return this;
            }

            public ActionList build() {
                return new ActionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListRoleResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoleResponseBody</p>
     */
    public static class Role extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminUserId")
        private String adminUserId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
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

            private Builder() {
            } 

            private Builder(Role model) {
                this.adminUserId = model.adminUserId;
                this.createTime = model.createTime;
                this.id = model.id;
                this.isDefault = model.isDefault;
                this.name = model.name;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>test**@aliyun.com</p>
             */
            public Builder adminUserId(String adminUserId) {
                this.adminUserId = adminUserId;
                return this;
            }

            /**
             * <p>The timestamp when the role was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1542717260156</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether the role is a default role.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The name of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>Super Admin(All privileges)</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The timestamp when the role was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1542717260156</p>
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
    /**
     * 
     * {@link ListRoleResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoleResponseBody</p>
     */
    public static class RoleItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionList")
        private ActionList actionList;

        @com.aliyun.core.annotation.NameInMap("Role")
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

            private Builder() {
            } 

            private Builder(RoleItem model) {
                this.actionList = model.actionList;
                this.role = model.role;
            } 

            /**
             * <p>The set of permissions to be granted to the role.</p>
             */
            public Builder actionList(ActionList actionList) {
                this.actionList = actionList;
                return this;
            }

            /**
             * <p>The roles.</p>
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
    /**
     * 
     * {@link ListRoleResponseBody} extends {@link TeaModel}
     *
     * <p>ListRoleResponseBody</p>
     */
    public static class RoleList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleItem")
        private java.util.List<RoleItem> roleItem;

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
        public java.util.List<RoleItem> getRoleItem() {
            return this.roleItem;
        }

        public static final class Builder {
            private java.util.List<RoleItem> roleItem; 

            private Builder() {
            } 

            private Builder(RoleList model) {
                this.roleItem = model.roleItem;
            } 

            /**
             * RoleItem.
             */
            public Builder roleItem(java.util.List<RoleItem> roleItem) {
                this.roleItem = roleItem;
                return this;
            }

            public RoleList build() {
                return new RoleList(this);
            } 

        } 

    }
}
