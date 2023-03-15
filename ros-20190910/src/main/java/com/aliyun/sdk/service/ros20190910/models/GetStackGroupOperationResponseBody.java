// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackGroupOperationResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackGroupOperationResponseBody</p>
 */
public class GetStackGroupOperationResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackGroupOperation")
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
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the operation on the stack group.
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
        @NameInMap("AccountIds")
        private java.util.List < String > accountIds;

        @NameInMap("RdFolderIds")
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
             * The IDs of the member accounts in the resource directory.
             * <p>
             * 
             * >  This parameter is returned only if the AccountIds request parameter is specified in the [UpdateStackInstances](~~151716~~) operation to update stack instances.
             */
            public Builder accountIds(java.util.List < String > accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * The folder IDs of the resource directory.
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
        @NameInMap("FailureToleranceCount")
        private Integer failureToleranceCount;

        @NameInMap("FailureTolerancePercentage")
        private Integer failureTolerancePercentage;

        @NameInMap("MaxConcurrentCount")
        private Integer maxConcurrentCount;

        @NameInMap("MaxConcurrentPercentage")
        private Integer maxConcurrentPercentage;

        @NameInMap("RegionIdsOrder")
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
             * The maximum number of stack operation failures that can occur within the accounts in each region. When the value is exceeded, the operation fails to be performed in the region. If the operation fails to be performed in one region, the operation fails to be performed in other regions.
             * <p>
             * 
             * Valid values: 0 to 20.
             * 
             * >  Only one of the FailureToleranceCount and FailureTolerancePercentage parameters is returned.
             */
            public Builder failureToleranceCount(Integer failureToleranceCount) {
                this.failureToleranceCount = failureToleranceCount;
                return this;
            }

            /**
             * The percentage of the total number of accounts within which stack operation failures can occur to the total number of accounts in each region. When the value is exceeded, the operation fails to be performed in the region.
             * <p>
             * 
             * Valid values: 0 to 100.
             * 
             * >  Only one of the FailureToleranceCount and FailureTolerancePercentage parameters is returned.
             */
            public Builder failureTolerancePercentage(Integer failureTolerancePercentage) {
                this.failureTolerancePercentage = failureTolerancePercentage;
                return this;
            }

            /**
             * The maximum number of accounts within which operations are performed on stacks concurrently in each region.
             * <p>
             * 
             * Valid values: 1 to 20.
             * 
             * >  Only one of the MaxConcurrentCount and MaxConcurrentPercentage parameters is returned.
             */
            public Builder maxConcurrentCount(Integer maxConcurrentCount) {
                this.maxConcurrentCount = maxConcurrentCount;
                return this;
            }

            /**
             * The percentage of the total number of accounts within which operations are performed on stacks concurrently to the total number of accounts in each region.
             * <p>
             * 
             * Valid values: 1 to 100.
             * 
             * >  Only one of the MaxConcurrentCount and MaxConcurrentPercentage parameters is returned.
             */
            public Builder maxConcurrentPercentage(Integer maxConcurrentPercentage) {
                this.maxConcurrentPercentage = maxConcurrentPercentage;
                return this;
            }

            /**
             * The regions in the order of which the operation is performed.
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
        @NameInMap("CancelledStackInstancesCount")
        private Integer cancelledStackInstancesCount;

        @NameInMap("DriftDetectionStatus")
        private String driftDetectionStatus;

        @NameInMap("DriftDetectionTime")
        private String driftDetectionTime;

        @NameInMap("DriftedStackInstancesCount")
        private Integer driftedStackInstancesCount;

        @NameInMap("FailedStackInstancesCount")
        private Integer failedStackInstancesCount;

        @NameInMap("InProgressStackInstancesCount")
        private Integer inProgressStackInstancesCount;

        @NameInMap("InSyncStackInstancesCount")
        private Integer inSyncStackInstancesCount;

        @NameInMap("StackGroupDriftStatus")
        private String stackGroupDriftStatus;

        @NameInMap("TotalStackInstancesCount")
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
             * The number of stack instances for which the drift detection was canceled.
             */
            public Builder cancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
                this.cancelledStackInstancesCount = cancelledStackInstancesCount;
                return this;
            }

            /**
             * The status of the drift detection.
             * <p>
             * 
             * Valid values:
             * 
             * *   COMPLETED: The drift detection is performed and completed on all stack instances.
             * *   FAILED: The drift detection is performed. The number of stack instances that failed the drift detection exceeds the specified threshold.
             * *   PARTIAL_SUCCESS: The drift detection is performed. The number of stack instances that failed the drift detection does not exceed the specified threshold.
             * *   IN_PROGRESS: The drift detection is being performed on the stack group.
             * *   STOPPED: The drift detection is canceled for the stack group.
             */
            public Builder driftDetectionStatus(String driftDetectionStatus) {
                this.driftDetectionStatus = driftDetectionStatus;
                return this;
            }

            /**
             * The time when the drift detection was initiated.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * The number of stack instances that were drifted.
             */
            public Builder driftedStackInstancesCount(Integer driftedStackInstancesCount) {
                this.driftedStackInstancesCount = driftedStackInstancesCount;
                return this;
            }

            /**
             * The number of stack instances that failed the drift detection.
             */
            public Builder failedStackInstancesCount(Integer failedStackInstancesCount) {
                this.failedStackInstancesCount = failedStackInstancesCount;
                return this;
            }

            /**
             * The number of stack instances on which the drift detection was being performed.
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
             * The drift status of the stack group.
             * <p>
             * 
             * Valid values:
             * 
             * *   DRIFTED: At least one stack instance in the stack group is drifted.
             * *   NOT_CHECKED: No drift detection is completed in the stack group.
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
        @NameInMap("Action")
        private String action;

        @NameInMap("AdministrationRoleName")
        private String administrationRoleName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DeploymentTargets")
        private DeploymentTargets deploymentTargets;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("ExecutionRoleName")
        private String executionRoleName;

        @NameInMap("OperationDescription")
        private String operationDescription;

        @NameInMap("OperationId")
        private String operationId;

        @NameInMap("OperationPreferences")
        private OperationPreferences operationPreferences;

        @NameInMap("RetainStacks")
        private Boolean retainStacks;

        @NameInMap("StackGroupDriftDetectionDetail")
        private StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        @NameInMap("StackGroupId")
        private String stackGroupId;

        @NameInMap("StackGroupName")
        private String stackGroupName;

        @NameInMap("Status")
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
             * The operation that was performed.
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
             * The name of the RAM role that is specified for the administrator account in Resource Orchestration Service (ROS) when you create the stack group that is granted self-managed permissions. If this parameter is not specified, the default value AliyunROSStackGroupAdministrationRole is returned.
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
             * The folders in which you want to deploy the stack instances that are granted service-managed permissions.
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
             * The name of the RAM role that is specified for the execution account when you create the stack group that is granted self-managed permissions. The administrator account whose RAM role is AliyunROSStackGroupAdministrationRole assumes this RAM role. If this parameter is not specified, the default value AliyunROSStackGroupExecutionRole is returned.
             */
            public Builder executionRoleName(String executionRoleName) {
                this.executionRoleName = executionRoleName;
                return this;
            }

            /**
             * The description of the operation.
             * <p>
             * 
             * >  This parameter is returned only if the OperationDescription request parameter is specified in the [CreateStackInstances](~~151338~~) operation to create stack instances.
             */
            public Builder operationDescription(String operationDescription) {
                this.operationDescription = operationDescription;
                return this;
            }

            /**
             * The ID of the operation that was performed on the stack group.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * The operation preferences.
             */
            public Builder operationPreferences(OperationPreferences operationPreferences) {
                this.operationPreferences = operationPreferences;
                return this;
            }

            /**
             * Indicates whether the relevant stacks are retained when stack instances are deleted in the stack group.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: The stacks are retained.
             * *   false: The stacks are deleted. Proceed with caution.
             * 
             * >  This parameter is returned only when the stack instances are deleted.
             */
            public Builder retainStacks(Boolean retainStacks) {
                this.retainStacks = retainStacks;
                return this;
            }

            /**
             * The details of the drift detection.
             * <p>
             * 
             * >  This parameter is returned only when the drift detection is performed on the stack group.
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
             * The status of the operation.
             * <p>
             * 
             * Valid values:
             * 
             * *   RUNNING: The operation is being performed.
             * *   SUCCEEDED: The operation succeeded.
             * *   FAILED: The operation failed.
             * *   STOPPING: The operation is being stopped.
             * *   STOPPED: The operation is stopped.
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
