// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStacksResponseBody} extends {@link TeaModel}
 *
 * <p>ListStacksResponseBody</p>
 */
public class ListStacksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Stacks")
    private java.util.List < Stacks> stacks;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListStacksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.stacks = builder.stacks;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStacksResponseBody create() {
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
     * @return stacks
     */
    public java.util.List < Stacks> getStacks() {
        return this.stacks;
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
        private java.util.List < Stacks> stacks; 
        private Integer totalCount; 

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         * <p>
         * 
         * Maximum value: 50.
         * 
         * Default value: 10.
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
         * The stacks.
         */
        public Builder stacks(java.util.List < Stacks> stacks) {
            this.stacks = stacks;
            return this;
        }

        /**
         * The total number of stacks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListStacksResponseBody build() {
            return new ListStacksResponseBody(this);
        } 

    } 

    public static class OperationInfo extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("Code")
        private String code;

        @NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @NameInMap("Message")
        private String message;

        @NameInMap("RequestId")
        private String requestId;

        @NameInMap("ResourceType")
        private String resourceType;

        private OperationInfo(Builder builder) {
            this.action = builder.action;
            this.code = builder.code;
            this.logicalResourceId = builder.logicalResourceId;
            this.message = builder.message;
            this.requestId = builder.requestId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationInfo create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return logicalResourceId
         */
        public String getLogicalResourceId() {
            return this.logicalResourceId;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return requestId
         */
        public String getRequestId() {
            return this.requestId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String action; 
            private String code; 
            private String logicalResourceId; 
            private String message; 
            private String requestId; 
            private String resourceType; 

            /**
             * The name of the API operation that belongs to another Alibaba Cloud service.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The error code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The logical ID of the resource on which the operation error occurred.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * The error message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the request that is initiated to call the API operation of another Alibaba Cloud service.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * The type of the resource on which the operation error occurred.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public OperationInfo build() {
                return new OperationInfo(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag.
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
    public static class Stacks extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeletionProtection")
        private String deletionProtection;

        @NameInMap("DisableRollback")
        private Boolean disableRollback;

        @NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @NameInMap("OperationInfo")
        private OperationInfo operationInfo;

        @NameInMap("ParentStackId")
        private String parentStackId;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("StackDriftStatus")
        private String stackDriftStatus;

        @NameInMap("StackId")
        private String stackId;

        @NameInMap("StackName")
        private String stackName;

        @NameInMap("StackType")
        private String stackType;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusReason")
        private String statusReason;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TimeoutInMinutes")
        private Integer timeoutInMinutes;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Stacks(Builder builder) {
            this.createTime = builder.createTime;
            this.deletionProtection = builder.deletionProtection;
            this.disableRollback = builder.disableRollback;
            this.driftDetectionTime = builder.driftDetectionTime;
            this.operationInfo = builder.operationInfo;
            this.parentStackId = builder.parentStackId;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceName = builder.serviceName;
            this.stackDriftStatus = builder.stackDriftStatus;
            this.stackId = builder.stackId;
            this.stackName = builder.stackName;
            this.stackType = builder.stackType;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.tags = builder.tags;
            this.timeoutInMinutes = builder.timeoutInMinutes;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stacks create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deletionProtection
         */
        public String getDeletionProtection() {
            return this.deletionProtection;
        }

        /**
         * @return disableRollback
         */
        public Boolean getDisableRollback() {
            return this.disableRollback;
        }

        /**
         * @return driftDetectionTime
         */
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        /**
         * @return operationInfo
         */
        public OperationInfo getOperationInfo() {
            return this.operationInfo;
        }

        /**
         * @return parentStackId
         */
        public String getParentStackId() {
            return this.parentStackId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return stackDriftStatus
         */
        public String getStackDriftStatus() {
            return this.stackDriftStatus;
        }

        /**
         * @return stackId
         */
        public String getStackId() {
            return this.stackId;
        }

        /**
         * @return stackName
         */
        public String getStackName() {
            return this.stackName;
        }

        /**
         * @return stackType
         */
        public String getStackType() {
            return this.stackType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return statusReason
         */
        public String getStatusReason() {
            return this.statusReason;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return timeoutInMinutes
         */
        public Integer getTimeoutInMinutes() {
            return this.timeoutInMinutes;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String deletionProtection; 
            private Boolean disableRollback; 
            private String driftDetectionTime; 
            private OperationInfo operationInfo; 
            private String parentStackId; 
            private String regionId; 
            private String resourceGroupId; 
            private Boolean serviceManaged; 
            private String serviceName; 
            private String stackDriftStatus; 
            private String stackId; 
            private String stackName; 
            private String stackType; 
            private String status; 
            private String statusReason; 
            private java.util.List < Tags> tags; 
            private Integer timeoutInMinutes; 
            private String updateTime; 

            /**
             * The time when the stack was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeletionProtection.
             */
            public Builder deletionProtection(String deletionProtection) {
                this.deletionProtection = deletionProtection;
                return this;
            }

            /**
             * Indicates whether rollback is disabled when the stack fails to be created. Valid values:
             * <p>
             * 
             * *   true
             * *   false (default)
             */
            public Builder disableRollback(Boolean disableRollback) {
                this.disableRollback = disableRollback;
                return this;
            }

            /**
             * The time when the most recent successful drift detection was performed on the stack.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * The supplementary information that is returned when an error occurs on a stack operation.
             * <p>
             * 
             * > This parameter is returned only if an error occurs on a stack operation. The system returns at least one sub-property. For example, an error occurred when an API operation of another Alibaba Cloud service was called.
             */
            public Builder operationInfo(OperationInfo operationInfo) {
                this.operationInfo = operationInfo;
                return this;
            }

            /**
             * The ID of the parent stack.
             */
            public Builder parentStackId(String parentStackId) {
                this.parentStackId = parentStackId;
                return this;
            }

            /**
             * The region ID of the stack. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * Indicates whether the stack is a managed stack. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The name of the service to which the managed stack belongs.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * The state of the stack on which the most recent successful drift detection was performed. Valid values:
             * <p>
             * 
             * *   DRIFTED: The stack has drifted.
             * *   NOT_CHECKED: No successful drift detection is performed on the stack.
             * *   IN_SYNC: The stack is being synchronized.
             */
            public Builder stackDriftStatus(String stackDriftStatus) {
                this.stackDriftStatus = stackDriftStatus;
                return this;
            }

            /**
             * The stack ID.
             */
            public Builder stackId(String stackId) {
                this.stackId = stackId;
                return this;
            }

            /**
             * The stack name.
             */
            public Builder stackName(String stackName) {
                this.stackName = stackName;
                return this;
            }

            /**
             * The stack type. Valid values:
             * <p>
             * 
             * *   ROS: Resource Orchestration Service (ROS) stack. The stack is created by using a ROS template.
             * *   Terraform: Terraform stack. The stack is created by using a Terraform template.
             */
            public Builder stackType(String stackType) {
                this.stackType = stackType;
                return this;
            }

            /**
             * The state of the stack.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The reason why the stack is in its current state.
             */
            public Builder statusReason(String statusReason) {
                this.statusReason = statusReason;
                return this;
            }

            /**
             * The tags of the stack.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The timeout period that is allowed to create the stack. Unit: minutes.
             */
            public Builder timeoutInMinutes(Integer timeoutInMinutes) {
                this.timeoutInMinutes = timeoutInMinutes;
                return this;
            }

            /**
             * The time when the stack was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Stacks build() {
                return new Stacks(this);
            } 

        } 

    }
}
