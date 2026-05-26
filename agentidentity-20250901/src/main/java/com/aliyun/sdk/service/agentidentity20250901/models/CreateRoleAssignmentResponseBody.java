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
 * {@link CreateRoleAssignmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRoleAssignmentResponseBody</p>
 */
public class CreateRoleAssignmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleAssignment")
    private RoleAssignment roleAssignment;

    private CreateRoleAssignmentResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.roleAssignment = builder.roleAssignment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRoleAssignmentResponseBody create() {
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
     * @return roleAssignment
     */
    public RoleAssignment getRoleAssignment() {
        return this.roleAssignment;
    }

    public static final class Builder {
        private String requestId; 
        private RoleAssignment roleAssignment; 

        private Builder() {
        } 

        private Builder(CreateRoleAssignmentResponseBody model) {
            this.requestId = model.requestId;
            this.roleAssignment = model.roleAssignment;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoleAssignment.
         */
        public Builder roleAssignment(RoleAssignment roleAssignment) {
            this.roleAssignment = roleAssignment;
            return this;
        }

        public CreateRoleAssignmentResponseBody build() {
            return new CreateRoleAssignmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRoleAssignmentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRoleAssignmentResponseBody</p>
     */
    public static class RoleAssignment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("PrincipalId")
        private String principalId;

        @com.aliyun.core.annotation.NameInMap("PrincipalName")
        private String principalName;

        @com.aliyun.core.annotation.NameInMap("PrincipalType")
        private String principalType;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("UserPoolId")
        private String userPoolId;

        private RoleAssignment(Builder builder) {
            this.createTime = builder.createTime;
            this.principalId = builder.principalId;
            this.principalName = builder.principalName;
            this.principalType = builder.principalType;
            this.roleId = builder.roleId;
            this.roleName = builder.roleName;
            this.userPoolId = builder.userPoolId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RoleAssignment create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return principalId
         */
        public String getPrincipalId() {
            return this.principalId;
        }

        /**
         * @return principalName
         */
        public String getPrincipalName() {
            return this.principalName;
        }

        /**
         * @return principalType
         */
        public String getPrincipalType() {
            return this.principalType;
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
         * @return userPoolId
         */
        public String getUserPoolId() {
            return this.userPoolId;
        }

        public static final class Builder {
            private String createTime; 
            private String principalId; 
            private String principalName; 
            private String principalType; 
            private String roleId; 
            private String roleName; 
            private String userPoolId; 

            private Builder() {
            } 

            private Builder(RoleAssignment model) {
                this.createTime = model.createTime;
                this.principalId = model.principalId;
                this.principalName = model.principalName;
                this.principalType = model.principalType;
                this.roleId = model.roleId;
                this.roleName = model.roleName;
                this.userPoolId = model.userPoolId;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * PrincipalId.
             */
            public Builder principalId(String principalId) {
                this.principalId = principalId;
                return this;
            }

            /**
             * PrincipalName.
             */
            public Builder principalName(String principalName) {
                this.principalName = principalName;
                return this;
            }

            /**
             * PrincipalType.
             */
            public Builder principalType(String principalType) {
                this.principalType = principalType;
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
             * UserPoolId.
             */
            public Builder userPoolId(String userPoolId) {
                this.userPoolId = userPoolId;
                return this;
            }

            public RoleAssignment build() {
                return new RoleAssignment(this);
            } 

        } 

    }
}
