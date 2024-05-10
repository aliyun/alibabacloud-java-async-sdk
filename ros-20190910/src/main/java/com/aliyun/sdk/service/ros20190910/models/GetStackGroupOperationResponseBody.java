// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackGroupOperationResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackGroupOperationResponseBody</p>
 */
public class GetStackGroupOperationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackGroupOperation")
    private StackGroupOperation stackGroupOperation;

    private GetStackGroupOperationResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackGroupOperation = builder.stackGroupOperation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackGroupOperationResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackGroupOperation
     */
    public StackGroupOperation getStackGroupOperation() {
        return this.stackGroupOperation;
    }

    public static final class Builder {
        private String requestId; 
        private StackGroupOperation stackGroupOperation; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the stack group operation.
         */
        public Builder stackGroupOperation(StackGroupOperation stackGroupOperation) {
            this.stackGroupOperation = stackGroupOperation;
            return this;
        }

        public GetStackGroupOperationResponseBody build() {
            return new GetStackGroupOperationResponseBody(this);
        } 

    } 

    public static class DeploymentTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List < String > accountIds;

        @com.aliyun.core.annotation.NameInMap("RdFolderIds")
        private java.util.List < String > rdFolderIds;

        private DeploymentTargets(Builder builder) {
            this.accountIds = builder.accountIds;
            this.rdFolderIds = builder.rdFolderIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentTargets create() {
            return builder().build();
        }

        /**
         * @return accountIds
         */
        public java.util.List < String > getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return rdFolderIds
         */
        public java.util.List < String > getRdFolderIds() {
            return this.rdFolderIds;
        }

        public static final class Builder {
            private java.util.List < String > accountIds; 
            private java.util.List < String > rdFolderIds; 

            /**
             * The IDs of the members in the resource directory.
             * <p>
             * 
             * > This parameter is returned only if AccountIds is specified when the [UpdateStackInstances](~~151716~~) operation is called to update stack instances.
             */
            public Builder accountIds(java.util.List < String > accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * The IDs of the folders in the resource directory.
             */
            public Builder rdFolderIds(java.util.List < String > rdFolderIds) {
                this.rdFolderIds = rdFolderIds;
                return this;
            }

            public DeploymentTargets build() {
                return new DeploymentTargets(this);
            } 

        } 

    }
    public static class OperationPreferences extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailureToleranceCount")
        private Integer failureToleranceCount;

        @com.aliyun.core.annotation.NameInMap("FailureTolerancePercentage")
        private Integer failureTolerancePercentage;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrentCount")
        private Integer maxConcurrentCount;

        @com.aliyun.core.annotation.NameInMap("MaxConcurrentPercentage")
        private Integer maxConcurrentPercentage;

        @com.aliyun.core.annotation.NameInMap("RegionIdsOrder")
        private java.util.List < String > regionIdsOrder;

        private OperationPreferences(Builder builder) {
            this.failureToleranceCount = builder.failureToleranceCount;
            this.failureTolerancePercentage = builder.failureTolerancePercentage;
            this.maxConcurrentCount = builder.maxConcurrentCount;
            this.maxConcurrentPercentage = builder.maxConcurrentPercentage;
            this.regionIdsOrder = builder.regionIdsOrder;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationPreferences create() {
            return builder().build();
        }

        /**
         * @return failureToleranceCount
         */
        public Integer getFailureToleranceCount() {
            return this.failureToleranceCount;
        }

        /**
         * @return failureTolerancePercentage
         */
        public Integer getFailureTolerancePercentage() {
            return this.failureTolerancePercentage;
        }

        /**
         * @return maxConcurrentCount
         */
        public Integer getMaxConcurrentCount() {
            return this.maxConcurrentCount;
        }

        /**
         * @return maxConcurrentPercentage
         */
        public Integer getMaxConcurrentPercentage() {
            return this.maxConcurrentPercentage;
        }

        /**
         * @return regionIdsOrder
         */
        public java.util.List < String > getRegionIdsOrder() {
            return this.regionIdsOrder;
        }

        public static final class Builder {
            private Integer failureToleranceCount; 
            private Integer failureTolerancePercentage; 
            private Integer maxConcurrentCount; 
            private Integer maxConcurrentPercentage; 
            private java.util.List < String > regionIdsOrder; 

            /**
             * The number of accounts within which stack operation failures are allowed to occur in each region. If the value of this parameter is exceeded in a region, Resource Orchestration Service (ROS) stops the operation in the region. If the operation is stopped in one region, the operation is no longer performed in other regions.
             * <p>
             * 
             * Valid values: 0 to 20.
             * 
             * > Only one of FailureToleranceCount and FailureTolerancePercentage can be returned.
             */
            public Builder failureToleranceCount(Integer failureToleranceCount) {
                this.failureToleranceCount = failureToleranceCount;
                return this;
            }

            /**
             * The percentage of the number of accounts within which stack operation failures are allowed to occur to the total number of accounts in each region. If the value of this parameter is exceeded in a region, ROS stops the operation in the region.
             * <p>
             * 
             * Valid values: 0 to 100.
             * 
             * > Only one of FailureToleranceCount and FailureTolerancePercentage can be returned.
             */
            public Builder failureTolerancePercentage(Integer failureTolerancePercentage) {
                this.failureTolerancePercentage = failureTolerancePercentage;
                return this;
            }

            /**
             * The maximum number of accounts within which stacks are deployed at the same time in each region.
             * <p>
             * 
             * Valid values: 1 to 20.
             * 
             * > Only one of MaxConcurrentCount and MaxConcurrentPercentage can be returned.
             */
            public Builder maxConcurrentCount(Integer maxConcurrentCount) {
                this.maxConcurrentCount = maxConcurrentCount;
                return this;
            }

            /**
             * The percentage of the maximum number of accounts within which stacks are deployed at the same time to the total number of accounts in each region.
             * <p>
             * 
             * Valid values: 1 to 100.
             * 
             * > Only one of MaxConcurrentCount and MaxConcurrentPercentage can be returned.
             */
            public Builder maxConcurrentPercentage(Integer maxConcurrentPercentage) {
                this.maxConcurrentPercentage = maxConcurrentPercentage;
                return this;
            }

            /**
             * The regions in the order of operation execution.
             */
            public Builder regionIdsOrder(java.util.List < String > regionIdsOrder) {
                this.regionIdsOrder = regionIdsOrder;
                return this;
            }

            public OperationPreferences build() {
                return new OperationPreferences(this);
            } 

        } 

    }
    public static class StackGroupDriftDetectionDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CancelledStackInstancesCount")
        private Integer cancelledStackInstancesCount;

        @com.aliyun.core.annotation.NameInMap("DriftDetectionStatus")
        private String driftDetectionStatus;

        @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @com.aliyun.core.annotation.NameInMap("DriftedStackInstancesCount")
        private Integer driftedStackInstancesCount;

        @com.aliyun.core.annotation.NameInMap("FailedStackInstancesCount")
        private Integer failedStackInstancesCount;

        @com.aliyun.core.annotation.NameInMap("InProgressStackInstancesCount")
        private Integer inProgressStackInstancesCount;

        @com.aliyun.core.annotation.NameInMap("InSyncStackInstancesCount")
        private Integer inSyncStackInstancesCount;

        @com.aliyun.core.annotation.NameInMap("StackGroupDriftStatus")
        private String stackGroupDriftStatus;

        @com.aliyun.core.annotation.NameInMap("TotalStackInstancesCount")
        private Integer totalStackInstancesCount;

        private StackGroupDriftDetectionDetail(Builder builder) {
            this.cancelledStackInstancesCount = builder.cancelledStackInstancesCount;
            this.driftDetectionStatus = builder.driftDetectionStatus;
            this.driftDetectionTime = builder.driftDetectionTime;
            this.driftedStackInstancesCount = builder.driftedStackInstancesCount;
            this.failedStackInstancesCount = builder.failedStackInstancesCount;
            this.inProgressStackInstancesCount = builder.inProgressStackInstancesCount;
            this.inSyncStackInstancesCount = builder.inSyncStackInstancesCount;
            this.stackGroupDriftStatus = builder.stackGroupDriftStatus;
            this.totalStackInstancesCount = builder.totalStackInstancesCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackGroupDriftDetectionDetail create() {
            return builder().build();
        }

        /**
         * @return cancelledStackInstancesCount
         */
        public Integer getCancelledStackInstancesCount() {
            return this.cancelledStackInstancesCount;
        }

        /**
         * @return driftDetectionStatus
         */
        public String getDriftDetectionStatus() {
            return this.driftDetectionStatus;
        }

        /**
         * @return driftDetectionTime
         */
        public String getDriftDetectionTime() {
            return this.driftDetectionTime;
        }

        /**
         * @return driftedStackInstancesCount
         */
        public Integer getDriftedStackInstancesCount() {
            return this.driftedStackInstancesCount;
        }

        /**
         * @return failedStackInstancesCount
         */
        public Integer getFailedStackInstancesCount() {
            return this.failedStackInstancesCount;
        }

        /**
         * @return inProgressStackInstancesCount
         */
        public Integer getInProgressStackInstancesCount() {
            return this.inProgressStackInstancesCount;
        }

        /**
         * @return inSyncStackInstancesCount
         */
        public Integer getInSyncStackInstancesCount() {
            return this.inSyncStackInstancesCount;
        }

        /**
         * @return stackGroupDriftStatus
         */
        public String getStackGroupDriftStatus() {
            return this.stackGroupDriftStatus;
        }

        /**
         * @return totalStackInstancesCount
         */
        public Integer getTotalStackInstancesCount() {
            return this.totalStackInstancesCount;
        }

        public static final class Builder {
            private Integer cancelledStackInstancesCount; 
            private String driftDetectionStatus; 
            private String driftDetectionTime; 
            private Integer driftedStackInstancesCount; 
            private Integer failedStackInstancesCount; 
            private Integer inProgressStackInstancesCount; 
            private Integer inSyncStackInstancesCount; 
            private String stackGroupDriftStatus; 
            private Integer totalStackInstancesCount; 

            /**
             * The number of stack instances for which drift detection was canceled.
             */
            public Builder cancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
                this.cancelledStackInstancesCount = cancelledStackInstancesCount;
                return this;
            }

            /**
             * The drift detection state.
             * <p>
             * 
             * Valid values:
             * 
             * *   COMPLETED: Drift detection is performed on the stack group and all stack instances passed the drift detection.
             * *   FAILED: Drift detection is performed on the stack group. The number of stack instances that failed the drift detection exceeds the specified threshold.
             * *   PARTIAL_SUCCESS: Drift detection is performed on the stack group. The number of stack instances that failed the drift detection does not exceed the specified threshold.
             * *   IN_PROGRESS: Drift detection is being performed on the stack group.
             * *   STOPPED: Drift detection is canceled for the stack group.
             */
            public Builder driftDetectionStatus(String driftDetectionStatus) {
                this.driftDetectionStatus = driftDetectionStatus;
                return this;
            }

            /**
             * The time when drift detection was performed.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * The number of stack instances that have drifted.
             */
            public Builder driftedStackInstancesCount(Integer driftedStackInstancesCount) {
                this.driftedStackInstancesCount = driftedStackInstancesCount;
                return this;
            }

            /**
             * The number of stack instances that failed drift detection.
             */
            public Builder failedStackInstancesCount(Integer failedStackInstancesCount) {
                this.failedStackInstancesCount = failedStackInstancesCount;
                return this;
            }

            /**
             * The number of stack instances on which drift detection was being performed.
             */
            public Builder inProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
                this.inProgressStackInstancesCount = inProgressStackInstancesCount;
                return this;
            }

            /**
             * The number of stack instances that were being synchronized.
             */
            public Builder inSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
                this.inSyncStackInstancesCount = inSyncStackInstancesCount;
                return this;
            }

            /**
             * The drift state of the stack group.
             * <p>
             * 
             * Valid values:
             * 
             * *   DRIFTED: At least one stack instance in the stack group has drifted.
             * *   NOT_CHECKED: No successful drift detection is performed in the stack group.
             * *   IN_SYNC: All the stack instances in the stack group are being synchronized.
             */
            public Builder stackGroupDriftStatus(String stackGroupDriftStatus) {
                this.stackGroupDriftStatus = stackGroupDriftStatus;
                return this;
            }

            /**
             * The number of stack instances.
             */
            public Builder totalStackInstancesCount(Integer totalStackInstancesCount) {
                this.totalStackInstancesCount = totalStackInstancesCount;
                return this;
            }

            public StackGroupDriftDetectionDetail build() {
                return new StackGroupDriftDetectionDetail(this);
            } 

        } 

    }
    public static class StackGroupOperation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("AdministrationRoleName")
        private String administrationRoleName;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DeploymentTargets")
        private DeploymentTargets deploymentTargets;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExecutionRoleName")
        private String executionRoleName;

        @com.aliyun.core.annotation.NameInMap("OperationDescription")
        private String operationDescription;

        @com.aliyun.core.annotation.NameInMap("OperationId")
        private String operationId;

        @com.aliyun.core.annotation.NameInMap("OperationPreferences")
        private OperationPreferences operationPreferences;

        @com.aliyun.core.annotation.NameInMap("RetainStacks")
        private Boolean retainStacks;

        @com.aliyun.core.annotation.NameInMap("StackGroupDriftDetectionDetail")
        private StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        @com.aliyun.core.annotation.NameInMap("StackGroupId")
        private String stackGroupId;

        @com.aliyun.core.annotation.NameInMap("StackGroupName")
        private String stackGroupName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private StackGroupOperation(Builder builder) {
            this.action = builder.action;
            this.administrationRoleName = builder.administrationRoleName;
            this.createTime = builder.createTime;
            this.deploymentTargets = builder.deploymentTargets;
            this.endTime = builder.endTime;
            this.executionRoleName = builder.executionRoleName;
            this.operationDescription = builder.operationDescription;
            this.operationId = builder.operationId;
            this.operationPreferences = builder.operationPreferences;
            this.retainStacks = builder.retainStacks;
            this.stackGroupDriftDetectionDetail = builder.stackGroupDriftDetectionDetail;
            this.stackGroupId = builder.stackGroupId;
            this.stackGroupName = builder.stackGroupName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackGroupOperation create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return administrationRoleName
         */
        public String getAdministrationRoleName() {
            return this.administrationRoleName;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deploymentTargets
         */
        public DeploymentTargets getDeploymentTargets() {
            return this.deploymentTargets;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return executionRoleName
         */
        public String getExecutionRoleName() {
            return this.executionRoleName;
        }

        /**
         * @return operationDescription
         */
        public String getOperationDescription() {
            return this.operationDescription;
        }

        /**
         * @return operationId
         */
        public String getOperationId() {
            return this.operationId;
        }

        /**
         * @return operationPreferences
         */
        public OperationPreferences getOperationPreferences() {
            return this.operationPreferences;
        }

        /**
         * @return retainStacks
         */
        public Boolean getRetainStacks() {
            return this.retainStacks;
        }

        /**
         * @return stackGroupDriftDetectionDetail
         */
        public StackGroupDriftDetectionDetail getStackGroupDriftDetectionDetail() {
            return this.stackGroupDriftDetectionDetail;
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

        public static final class Builder {
            private String action; 
            private String administrationRoleName; 
            private String createTime; 
            private DeploymentTargets deploymentTargets; 
            private String endTime; 
            private String executionRoleName; 
            private String operationDescription; 
            private String operationId; 
            private OperationPreferences operationPreferences; 
            private Boolean retainStacks; 
            private StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail; 
            private String stackGroupId; 
            private String stackGroupName; 
            private String status; 

            /**
             * The operation type.
             * <p>
             * 
             * Valid values:
             * 
             * *   CREATE
             * *   UPDATE
             * *   DELETE
             * *   DETECT_DRIFT
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The name of the RAM role that you specify for the administrator account when you create the self-managed stack group. ROS assumes the administrator role to perform operations. If this parameter is not specified, the default value AliyunROSStackGroupAdministrationRole is returned.
             */
            public Builder administrationRoleName(String administrationRoleName) {
                this.administrationRoleName = administrationRoleName;
                return this;
            }

            /**
             * The time when the operation was initiated.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The destinations to deploy stack instances when the stack is granted service-managed permissions.
             */
            public Builder deploymentTargets(DeploymentTargets deploymentTargets) {
                this.deploymentTargets = deploymentTargets;
                return this;
            }

            /**
             * The time when the operation ended.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The name of the RAM role that you specify for the execution account when you create the self-managed stack group. The administrator role AliyunROSStackGroupAdministrationRole assumes the execution role to perform operations. If this parameter is not specified, the default value AliyunROSStackGroupExecutionRole is returned.
             */
            public Builder executionRoleName(String executionRoleName) {
                this.executionRoleName = executionRoleName;
                return this;
            }

            /**
             * The description of the operation.
             * <p>
             * 
             * > This parameter is returned only if OperationDescription is specified when the [CreateStackInstances](~~151338~~) operation is called to create stack instances.
             */
            public Builder operationDescription(String operationDescription) {
                this.operationDescription = operationDescription;
                return this;
            }

            /**
             * The operation ID.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * The operation settings.
             */
            public Builder operationPreferences(OperationPreferences operationPreferences) {
                this.operationPreferences = operationPreferences;
                return this;
            }

            /**
             * Indicates whether stacks are retained when the associated stack instances are deleted. When you delete a stack instance, you can choose to delete or retain the stack with which the stack instance is associated.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: Stacks are retained when the associated stack instances are deleted.
             * *   false: Stacks are deleted when the associated stack instances are deleted. Proceed with caution.
             * 
             * > This parameter is returned only if you delete stack instances.
             */
            public Builder retainStacks(Boolean retainStacks) {
                this.retainStacks = retainStacks;
                return this;
            }

            /**
             * The information about drift detection.
             * <p>
             * 
             * > This parameter is returned only if drift detection is performed.
             */
            public Builder stackGroupDriftDetectionDetail(StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
                this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
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
             * The state of the operation.
             * <p>
             * 
             * Valid values:
             * 
             * *   RUNNING
             * *   SUCCEEDED
             * *   FAILED
             * *   STOPPING
             * *   STOPPED
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StackGroupOperation build() {
                return new StackGroupOperation(this);
            } 

        } 

    }
}
