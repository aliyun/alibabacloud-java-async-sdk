// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>FE58D7CF-03BC-432A-B42D-BC3390C8C2E1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the role.</p>
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
    public static class Role extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RolePrincipalName")
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::177242285274****:role/aliyunserviceroleforpolardb</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The document of the trust policy for the role.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Statement&quot;:[{&quot;Action&quot;:&quot;sts:AssumeRole&quot;,&quot;Effect&quot;:&quot;Allow&quot;,&quot;Principal&quot;:{&quot;Service&quot;:[&quot;polardb.aliyuncs.com&quot;]}}],&quot;Version&quot;:&quot;1&quot;}</p>
             */
            public Builder assumeRolePolicyDocument(String assumeRolePolicyDocument) {
                this.assumeRolePolicyDocument = assumeRolePolicyDocument;
                return this;
            }

            /**
             * <p>The time when the role was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-30T08:14:16Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The description of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>Service Linked Role for PolarDB. PolarDB will use this role to access your resources in other services.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the role is a service-linked role. Valid values:</p>
             * <ul>
             * <li>true: The role is a service-linked role.</li>
             * <li>false: The role is not a service-linked role.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isServiceLinkedRole(Boolean isServiceLinkedRole) {
                this.isServiceLinkedRole = isServiceLinkedRole;
                return this;
            }

            /**
             * <p>The ID of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>32833240981067****</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>The name of the role.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunServiceRoleForPolarDB</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The role name that uses a domain name as the suffix.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:AliyunServiceRoleForPolarDB@role.test.onaliyunservice.com">AliyunServiceRoleForPolarDB@role.test.onaliyunservice.com</a></p>
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
