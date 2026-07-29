// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gdb20190903.models;

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
 * {@link CreateServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceLinkedRoleResponseBody</p>
 */
public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Role")
    private Role role;

    private CreateServiceLinkedRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleResponseBody create() {
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

        private Builder(CreateServiceLinkedRoleResponseBody model) {
            this.requestId = model.requestId;
            this.role = model.role;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        public CreateServiceLinkedRoleResponseBody build() {
            return new CreateServiceLinkedRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceLinkedRoleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateServiceLinkedRoleResponseBody</p>
     */
    public static class RoleRole extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("AssumeRolePolicyDocument")
        private String assumeRolePolicyDocument;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsServiceLinkedRole")
        private Boolean isServiceLinkedRole;

        @com.aliyun.core.annotation.NameInMap("LatestDeletionTask")
        private Boolean latestDeletionTask;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RolePrincipalName")
        private String rolePrincipalName;

        private RoleRole(Builder builder) {
            this.arn = builder.arn;
            this.assumeRolePolicyDocument = builder.assumeRolePolicyDocument;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.isServiceLinkedRole = builder.isServiceLinkedRole;
            this.latestDeletionTask = builder.latestDeletionTask;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
            this.rolePrincipalName = builder.rolePrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleRole create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return assumeRolePolicyDocument
         */
        public String getAssumeRolePolicyDocument() {
            return this.assumeRolePolicyDocument;
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return isServiceLinkedRole
         */
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        /**
         * @return latestDeletionTask
         */
        public Boolean getLatestDeletionTask() {
            return this.latestDeletionTask;
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
         * @return rolePrincipalName
         */
        public String getRolePrincipalName() {
            return this.rolePrincipalName;
        }

        public static final class Builder {
            private String arn; 
            private String assumeRolePolicyDocument; 
            private String createDate; 
            private String description; 
            private Boolean isServiceLinkedRole; 
            private Boolean latestDeletionTask; 
            private String roleId; 
            private String roleName; 
            private String rolePrincipalName; 

            private Builder() {
            } 

            private Builder(RoleRole model) {
                this.arn = model.arn;
                this.assumeRolePolicyDocument = model.assumeRolePolicyDocument;
                this.createDate = model.createDate;
                this.description = model.description;
                this.isServiceLinkedRole = model.isServiceLinkedRole;
                this.latestDeletionTask = model.latestDeletionTask;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
                this.rolePrincipalName = model.rolePrincipalName;
            } 

            /**
             * Arn.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * AssumeRolePolicyDocument.
             */
            public Builder assumeRolePolicyDocument(String assumeRolePolicyDocument) {
                this.assumeRolePolicyDocument = assumeRolePolicyDocument;
                return this;
            }

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IsServiceLinkedRole.
             */
            public Builder isServiceLinkedRole(Boolean isServiceLinkedRole) {
                this.isServiceLinkedRole = isServiceLinkedRole;
                return this;
            }

            /**
             * LatestDeletionTask.
             */
            public Builder latestDeletionTask(Boolean latestDeletionTask) {
                this.latestDeletionTask = latestDeletionTask;
                return this;
            }

            /**
             * RoleId.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * RolePrincipalName.
             */
            public Builder rolePrincipalName(String rolePrincipalName) {
                this.rolePrincipalName = rolePrincipalName;
                return this;
            }

            public RoleRole build() {
                return new RoleRole(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateServiceLinkedRoleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateServiceLinkedRoleResponseBody</p>
     */
    public static class Role extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Role")
        private java.util.List<RoleRole> role;

        private Role(Builder builder) {
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Role create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public java.util.List<RoleRole> getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<RoleRole> role; 

            private Builder() {
            } 

            private Builder(Role model) {
                this.role = model.role;
            } 

            /**
             * Role.
             */
            public Builder role(java.util.List<RoleRole> role) {
                this.role = role;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
}
