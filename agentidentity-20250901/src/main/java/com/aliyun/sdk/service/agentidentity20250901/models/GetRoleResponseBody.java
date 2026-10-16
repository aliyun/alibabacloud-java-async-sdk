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
 * {@link GetRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoleResponseBody</p>
 */
public class GetRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private Role role;

    private GetRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleResponseBody create() {
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

        private Builder(GetRoleResponseBody model) {
            this.requestId = model.requestId;
            this.role = model.role;
        } 

        /**
         * <p>The request ID.</p>
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

        public GetRoleResponseBody build() {
            return new GetRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRoleResponseBody} extends {@link TeaModel}
     *
     * <p>GetRoleResponseBody</p>
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
             * <p>The creation time in ISO 8601 format (UTC).</p>
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
             * <p>The role ID.</p>
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
             * <p>The type of the role. Default indicates a default role, and Manual indicates a custom role.</p>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The update time in ISO 8601 format (UTC).</p>
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
