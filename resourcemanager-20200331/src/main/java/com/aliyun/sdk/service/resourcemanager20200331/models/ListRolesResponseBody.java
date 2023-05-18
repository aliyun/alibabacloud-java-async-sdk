// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRolesResponseBody</p>
 */
public class ListRolesResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Roles")
    private Roles roles;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListRolesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.roles = builder.roles;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return roles
     */
    public Roles getRoles() {
        return this.roles;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Roles roles; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The information of the RAM roles.
         */
        public Builder roles(Roles roles) {
            this.roles = roles;
            return this;
        }

        /**
         * The total number of RAM roles.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
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
             * The time when the deletion task was created.
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * The ID of the deletion task.
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
             * The Alibaba Cloud Resource Name (ARN) of the RAM role.
             */
            public Builder arn(String arn) {
                this.arn = arn;
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
             * Indicates whether the RAM role is a service linked role.
             */
            public Builder isServiceLinkedRole(Boolean isServiceLinkedRole) {
                this.isServiceLinkedRole = isServiceLinkedRole;
                return this;
            }

            /**
             * The information of the most recent deletion task.
             */
            public Builder latestDeletionTask(LatestDeletionTask latestDeletionTask) {
                this.latestDeletionTask = latestDeletionTask;
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
    public static class Roles extends TeaModel {
        @NameInMap("Role")
        private java.util.List < Role> role;

        private Roles(Builder builder) {
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return role
         */
        public java.util.List < Role> getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List < Role> role; 

            /**
             * Role.
             */
            public Builder role(java.util.List < Role> role) {
                this.role = role;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
}
