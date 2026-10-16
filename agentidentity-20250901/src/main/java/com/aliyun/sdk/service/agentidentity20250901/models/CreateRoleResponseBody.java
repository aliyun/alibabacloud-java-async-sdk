// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link CreateRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRoleResponseBody</p>
 */
public class CreateRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private Role role;

    private CreateRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoleResponseBody create() {
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
     * @return role
     */
    public Role getRole() {
        return this.role;
    }

    public static final class Builder {
        private String requestId; 
        private Role role; 

        private Builder() {
        } 

        private Builder(CreateRoleResponseBody model) {
            this.requestId = model.requestId;
            this.role = model.role;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>AABD6E03-4B3A-5687-88FF-72232670ED0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The role information.</p>
         */
        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        public CreateRoleResponseBody build() {
            return new CreateRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRoleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRoleResponseBody</p>
     */
    public static class Role extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Role(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Role create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String roleId; 
            private String roleName; 
            private String type; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(Role model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the role was created. The time is displayed in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>Data analyst role</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>role_xxxxxxxxxxxxxxxxxxxx</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>The name of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>Analyst</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The type of the role. Valid values:</p>
             * <ul>
             * <li>Default: the default role that is automatically provisioned when the user pool is created</li>
             * <li>Manual: a custom role that is manually created by calling an API operation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the role was updated. The time is displayed in ISO 8601 format (UTC).</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T06:19:17Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
}
