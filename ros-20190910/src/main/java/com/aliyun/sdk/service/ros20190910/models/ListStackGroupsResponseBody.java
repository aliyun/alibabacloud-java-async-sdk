// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStackGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListStackGroupsResponseBody</p>
 */
public class ListStackGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackGroups")
    private java.util.List < StackGroups> stackGroups;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListStackGroupsResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.stackGroups = builder.stackGroups;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackGroupsResponseBody create() {
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
     * @return stackGroups
     */
    public java.util.List < StackGroups> getStackGroups() {
        return this.stackGroups;
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
        private java.util.List < StackGroups> stackGroups; 
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The stack groups.
         */
        public Builder stackGroups(java.util.List < StackGroups> stackGroups) {
            this.stackGroups = stackGroups;
            return this;
        }

        /**
         * The total number of stack groups.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackGroupsResponseBody build() {
            return new ListStackGroupsResponseBody(this);
        } 

    } 

    public static class AutoDeployment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("RetainStacksOnAccountRemoval")
        private Boolean retainStacksOnAccountRemoval;

        private AutoDeployment(Builder builder) {
            this.enabled = builder.enabled;
            this.retainStacksOnAccountRemoval = builder.retainStacksOnAccountRemoval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoDeployment create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return retainStacksOnAccountRemoval
         */
        public Boolean getRetainStacksOnAccountRemoval() {
            return this.retainStacksOnAccountRemoval;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Boolean retainStacksOnAccountRemoval; 

            /**
             * Indicates whether automatic deployment is enabled.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: Automatic deployment is enabled. If you add a member to the folder to which the stack group belongs after automatic deployment is enabled, Resource Orchestration Service (ROS) automatically adds the stack instances in the stack group to the specified region of the member. If you delete the member from the folder, ROS automatically deletes the stack instances in the stack group from the specified region of the member.
             * *   false: Automatic deployment is disabled. After you disable automatic deployment, the stack instances remain unchanged when you change the member in the folder.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Indicates whether the stacks within a member are retained when you delete the member from the folder.
             * <p>
             * 
             * Valid values:
             * 
             * *   true
             * *   false
             * 
             * > This parameter is returned only if Enabled is set to true.
             */
            public Builder retainStacksOnAccountRemoval(Boolean retainStacksOnAccountRemoval) {
                this.retainStacksOnAccountRemoval = retainStacksOnAccountRemoval;
                return this;
            }

            public AutoDeployment build() {
                return new AutoDeployment(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the tag that is added to the stack group.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag that is added to the stack group.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class StackGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDeployment")
        private AutoDeployment autoDeployment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @com.aliyun.core.annotation.NameInMap("PermissionModel")
        private String permissionModel;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("StackGroupDriftStatus")
        private String stackGroupDriftStatus;

        @com.aliyun.core.annotation.NameInMap("StackGroupId")
        private String stackGroupId;

        @com.aliyun.core.annotation.NameInMap("StackGroupName")
        private String stackGroupName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private StackGroups(Builder builder) {
            this.autoDeployment = builder.autoDeployment;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.driftDetectionTime = builder.driftDetectionTime;
            this.permissionModel = builder.permissionModel;
            this.resourceGroupId = builder.resourceGroupId;
            this.stackGroupDriftStatus = builder.stackGroupDriftStatus;
            this.stackGroupId = builder.stackGroupId;
            this.stackGroupName = builder.stackGroupName;
            this.status = builder.status;
            this.tags = builder.tags;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackGroups create() {
            return builder().build();
        }

        /**
         * @return autoDeployment
         */
        public AutoDeployment getAutoDeployment() {
            return this.autoDeployment;
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
         * @return driftDetectionTime
         */
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        /**
         * @return permissionModel
         */
        public String getPermissionModel() {
            return this.permissionModel;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return stackGroupDriftStatus
         */
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        /**
         * @return stackGroupId
         */
        public String getStackGroupId() {
            return this.stackGroupId;
        }

        /**
         * @return stackGroupName
         */
        public String getStackGroupName() {
            return this.stackGroupName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private AutoDeployment autoDeployment; 
            private String createTime; 
            private String description; 
            private String driftDetectionTime; 
            private String permissionModel; 
            private String resourceGroupId; 
            private String stackGroupDriftStatus; 
            private String stackGroupId; 
            private String stackGroupName; 
            private String status; 
            private java.util.List < Tags> tags; 
            private String updateTime; 

            /**
             * The information about automatic deployment settings.
             */
            public Builder autoDeployment(AutoDeployment autoDeployment) {
                this.autoDeployment = autoDeployment;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The description of the stack group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time when the most recent successful drift detection was performed on the stack group.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * The permission model of the stack group.
             * <p>
             * 
             * Valid values:
             * 
             * *   SELF_MANAGED
             * *   SERVICE_MANAGED
             * 
             * > For more information about the permission models of stack groups, see [Overview](~~154578~~).
             */
            public Builder permissionModel(String permissionModel) {
                this.permissionModel = permissionModel;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The drift state of the stack group on which the most recent successful drift detection was performed.
             * <p>
             * 
             * Valid values:
             * 
             * *   DRIFTED: The stack group has drifted.
             * *   NOT_CHECKED: No drift detection is performed on the stack group.
             * *   IN_SYNC: No drifts are detected on the stack group.
             */
            public Builder stackGroupDriftStatus(String stackGroupDriftStatus) {
                this.stackGroupDriftStatus = stackGroupDriftStatus;
                return this;
            }

            /**
             * The ID of the stack group.
             */
            public Builder stackGroupId(String stackGroupId) {
                this.stackGroupId = stackGroupId;
                return this;
            }

            /**
             * The name of the stack group.
             */
            public Builder stackGroupName(String stackGroupName) {
                this.stackGroupName = stackGroupName;
                return this;
            }

            /**
             * The state of the stack group.
             * <p>
             * 
             * Valid values:
             * 
             * *   ACTIVE
             * *   DELETED
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The tags that are added to the stack group.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public StackGroups build() {
                return new StackGroups(this);
            } 

        } 

    }
}
