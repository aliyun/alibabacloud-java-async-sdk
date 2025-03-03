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
 * {@link ListRolesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRolesResponseBody</p>
 */
public class ListRolesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Roles")
    private Roles roles;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7B8A4E7D-6CFF-471D-84DF-195A7A241ECB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information of the RAM roles.</p>
         */
        public Builder roles(Roles roles) {
            this.roles = roles;
            return this;
        }

        /**
         * <p>The total number of RAM roles.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRolesResponseBody build() {
            return new ListRolesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class LatestDeletionTask extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("DeletionTaskId")
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
             * <p>The time when the deletion task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2018-10-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The ID of the deletion task.</p>
             * 
             * <strong>example:</strong>
             * <p>ECSAdmin/cc61514b-26eb-4453-ab53-b142eb70****</p>
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
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Role extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("CreateDate")
        private String createDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IsServiceLinkedRole")
        private Boolean isServiceLinkedRole;

        @com.aliyun.core.annotation.NameInMap("LatestDeletionTask")
        private LatestDeletionTask latestDeletionTask;

        @com.aliyun.core.annotation.NameInMap("MaxSessionDuration")
        private Long maxSessionDuration;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        private String roleId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RolePrincipalName")
        private String rolePrincipalName;

        @com.aliyun.core.annotation.NameInMap("UpdateDate")
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
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::123456789012****:role/ECSAdmin</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The time when the RAM role was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2015-01-23T12:33:18Z</p>
             */
            public Builder createDate(String createDate) {
                this.createDate = createDate;
                return this;
            }

            /**
             * <p>The description of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>ECS administrator</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the RAM role is a service linked role.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isServiceLinkedRole(Boolean isServiceLinkedRole) {
                this.isServiceLinkedRole = isServiceLinkedRole;
                return this;
            }

            /**
             * <p>The information of the most recent deletion task.</p>
             */
            public Builder latestDeletionTask(LatestDeletionTask latestDeletionTask) {
                this.latestDeletionTask = latestDeletionTask;
                return this;
            }

            /**
             * <p>The maximum session duration of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>3600</p>
             */
            public Builder maxSessionDuration(Long maxSessionDuration) {
                this.maxSessionDuration = maxSessionDuration;
                return this;
            }

            /**
             * <p>The ID of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>90123456789****</p>
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            /**
             * <p>The name of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>ECSAdmin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The name of the RAM role after authorization.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:ECSAdmin@role.123456.onaliyunservice.com">ECSAdmin@role.123456.onaliyunservice.com</a></p>
             */
            public Builder rolePrincipalName(String rolePrincipalName) {
                this.rolePrincipalName = rolePrincipalName;
                return this;
            }

            /**
             * <p>The time when the RAM role was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-01-23T12:33:18Z</p>
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
    /**
     * 
     * {@link ListRolesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRolesResponseBody</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Role")
        private java.util.List<Role> role;

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
        public java.util.List<Role> getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<Role> role; 

            /**
             * Role.
             */
            public Builder role(java.util.List<Role> role) {
                this.role = role;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
}
