// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRoleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateRoleResponseBody</p>
 */
public class UpdateRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Role")
    private Role role;

    private UpdateRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.role = builder.role;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRoleResponseBody create() {
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
         * The information of the RAM role.
         */
        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        public UpdateRoleResponseBody build() {
            return new UpdateRoleResponseBody(this);
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

        @NameInMap("MaxSessionDuration")
        private Long maxSessionDuration;

        @NameInMap("RoleId")
        private String roleId;

        @NameInMap("RoleName")
        private String roleName;

        @NameInMap("RolePrincipalName")
        private String rolePrincipalName;

        @NameInMap("UpdateDate")
        private String updateDate;

        private Role(Builder builder) {
            this.arn = builder.arn;
            this.assumeRolePolicyDocument = builder.assumeRolePolicyDocument;
            this.createDate = builder.createDate;
            this.description = builder.description;
            this.maxSessionDuration = builder.maxSessionDuration;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
            this.rolePrincipalName = builder.rolePrincipalName;
            this.updateDate = builder.updateDate;
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
         * @return maxSessionDuration
         */
        public Long getMaxSessionDuration() {
            return this.maxSessionDuration;
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

        /**
         * @return updateDate
         */
        public String getUpdateDate() {
            return this.updateDate;
        }

        public static final class Builder {
            private String arn; 
            private String assumeRolePolicyDocument; 
            private String createDate; 
            private String description; 
            private Long maxSessionDuration; 
            private String roleId; 
            private String roleName; 
            private String rolePrincipalName; 
            private String updateDate; 

            /**
             * The Alibaba Cloud Resource Name (ARN) of the RAM role.
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * The document of the policy that specifies the trusted entity to assume the RAM role.
             */
            public Builder assumeRolePolicyDocument(String assumeRolePolicyDocument) {
                this.assumeRolePolicyDocument = assumeRolePolicyDocument;
                return this;
            }

            /**
             * The time when the RAM role was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The description of the RAM role.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The maximum session duration of the RAM role.
             */
            public Builder maxSessionDuration(Long maxSessionDuration) {
                this.maxSessionDuration = maxSessionDuration;
                return this;
            }

            /**
             * The ID of the RAM role.
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * The name of the RAM role.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * The name of the RAM role after authorization.
             */
            public Builder rolePrincipalName(String rolePrincipalName) {
                this.rolePrincipalName = rolePrincipalName;
                return this;
            }

            /**
             * The time when the RAM role was updated.
             */
            public Builder updateDate(String updateDate) {
                this.updateDate = updateDate;
                return this;
            }

            public Role build() {
                return new Role(this);
            } 

        } 

    }
}
