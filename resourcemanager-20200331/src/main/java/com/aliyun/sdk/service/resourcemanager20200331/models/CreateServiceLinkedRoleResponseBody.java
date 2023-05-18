// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceLinkedRoleResponseBody</p>
 */
public class CreateServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Role")
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

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the role.
         */
        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        public CreateServiceLinkedRoleResponseBody build() {
            return new CreateServiceLinkedRoleResponseBody(this);
        } 

    } 

    public static class Role extends TeaModel {
        @NameInMap("Arn")
        private String arn;

        @NameInMap("AssumeRolePolicyDocument")
        private String assumeRolePolicyDocument;

        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("IsServiceLinkedRole")
        private Boolean isServiceLinkedRole;

        @NameInMap("RoleId")
        private String roleId;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("RolePrincipalName")
        private String rolePrincipalName;

        private Role(Builder builder) {
            this.arn = builder.arn;
            this.assumeRolePolicyDocument = builder.assumeRolePolicyDocument;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.isServiceLinkedRole = builder.isServiceLinkedRole;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
            this.rolePrincipalName = builder.rolePrincipalName;
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
            private String roleId; 
            private String roleName; 
            private String rolePrincipalName; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the role.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The document of the trust policy for the role.
             */
            public Builder assumeRolePolicyDocument(String assumeRolePolicyDocument) {
                this.assumeRolePolicyDocument = assumeRolePolicyDocument;
                return this;
            }

            /**
             * The time when the role was created. The time is displayed in UTC.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The description of the role.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the role is a service-linked role. Valid values:
             * <p>
             * 
             * *   true: The role is a service-linked role.
             * *   false: The role is not a service-linked role.
             */
            public Builder isServiceLinkedRole(Boolean isServiceLinkedRole) {
                this.isServiceLinkedRole = isServiceLinkedRole;
                return this;
            }

            /**
             * The ID of the role.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * The name of the role.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The role name that uses a domain name as the suffix.
             */
            public Builder rolePrincipalName(String rolePrincipalName) {
                this.rolePrincipalName = rolePrincipalName;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
}
