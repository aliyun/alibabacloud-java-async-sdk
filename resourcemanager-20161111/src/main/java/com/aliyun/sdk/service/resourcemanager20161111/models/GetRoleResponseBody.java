// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20161111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoleResponseBody</p>
 */
public class GetRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Role")
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

        public GetRoleResponseBody build() {
            return new GetRoleResponseBody(this);
        } 

    } 

    public static class LatestDeletionTask extends TeaModel {
        @NameInMap("CreateDate")
        private String createDate;

        @NameInMap("DeletionTaskId")
        private String deletionTaskId;

        private LatestDeletionTask(Builder builder) {
            this.createDate = builder.createDate;
            this.deletionTaskId = builder.deletionTaskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestDeletionTask create() {
            return builder().build();
        }

        /**
         * @return createDate
         */
        public String getCreateDate() {
            return this.createDate;
        }

        /**
         * @return deletionTaskId
         */
        public String getDeletionTaskId() {
            return this.deletionTaskId;
        }

        public static final class Builder {
            private String createDate; 
            private String deletionTaskId; 

            /**
             * CreateDate.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * DeletionTaskId.
             */
            public Builder deletionTaskId(String deletionTaskId) {
                this.deletionTaskId = deletionTaskId;
                return this;
            }

            public LatestDeletionTask build() {
                return new LatestDeletionTask(this);
            } 

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

        @NameInMap("LatestDeletionTask")
        private LatestDeletionTask latestDeletionTask;

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
            this.isServiceLinkedRole = builder.isServiceLinkedRole;
            this.latestDeletionTask = builder.latestDeletionTask;
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
         * @return isServiceLinkedRole
         */
        public Boolean getIsServiceLinkedRole() {
            return this.isServiceLinkedRole;
        }

        /**
         * @return latestDeletionTask
         */
        public LatestDeletionTask getLatestDeletionTask() {
            return this.latestDeletionTask;
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
            private Boolean isServiceLinkedRole; 
            private LatestDeletionTask latestDeletionTask; 
            private Long maxSessionDuration; 
            private String roleId; 
            private String roleName; 
            private String rolePrincipalName; 
            private String updateDate; 

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
            public Builder latestDeletionTask(LatestDeletionTask latestDeletionTask) {
                this.latestDeletionTask = latestDeletionTask;
                return this;
            }

            /**
             * MaxSessionDuration.
             */
            public Builder maxSessionDuration(Long maxSessionDuration) {
                this.maxSessionDuration = maxSessionDuration;
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

            /**
             * UpdateDate.
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
