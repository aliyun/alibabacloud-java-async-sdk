// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The stack groups.</p>
         */
        public Builder stackGroups(java.util.List < StackGroups> stackGroups) {
            this.stackGroups = stackGroups;
            return this;
        }

        /**
         * <p>The total number of stack groups.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStackGroupsResponseBody build() {
            return new ListStackGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListStackGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackGroupsResponseBody</p>
     */
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
             * <p>Indicates whether automatic deployment is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: Automatic deployment is enabled. If you add a member to the folder to which the stack group belongs after automatic deployment is enabled, Resource Orchestration Service (ROS) automatically adds the stack instances in the stack group to the specified region of the member. If you delete the member from the folder, ROS automatically deletes the stack instances in the stack group from the specified region of the member.</li>
             * <li>false: Automatic deployment is disabled. After you disable automatic deployment, the stack instances remain unchanged when you change the member in the folder.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Indicates whether the stacks within a member are retained when you delete the member from the folder.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only if Enabled is set to true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListStackGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackGroupsResponseBody</p>
     */
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
             * <p>The key of the tag that is added to the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>usage1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag that is added to the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>test1</p>
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
    /**
     * 
     * {@link ListStackGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListStackGroupsResponseBody</p>
     */
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
             * <p>The information about automatic deployment settings.</p>
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
             * <p>The description of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>My Stack Group</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time when the most recent successful drift detection was performed on the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-27T07:47:47</p>
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * <p>The permission model of the stack group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SELF_MANAGED</li>
             * <li>SERVICE_MANAGED</li>
             * </ul>
             * <blockquote>
             * <p>For more information about the permission models of stack groups, see <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>SELF_MANAGED</p>
             */
            public Builder permissionModel(String permissionModel) {
                this.permissionModel = permissionModel;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmzawhxxcj****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The drift state of the stack group on which the most recent successful drift detection was performed.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DRIFTED: The stack group has drifted.</li>
             * <li>NOT_CHECKED: No drift detection is performed on the stack group.</li>
             * <li>IN_SYNC: No drifts are detected on the stack group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN_SYNC</p>
             */
            public Builder stackGroupDriftStatus(String stackGroupDriftStatus) {
                this.stackGroupDriftStatus = stackGroupDriftStatus;
                return this;
            }

            /**
             * <p>The ID of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
             */
            public Builder stackGroupId(String stackGroupId) {
                this.stackGroupId = stackGroupId;
                return this;
            }

            /**
             * <p>The name of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>MyStackGroup</p>
             */
            public Builder stackGroupName(String stackGroupName) {
                this.stackGroupName = stackGroupName;
                return this;
            }

            /**
             * <p>The state of the stack group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ACTIVE</li>
             * <li>DELETED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags that are added to the stack group.</p>
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
