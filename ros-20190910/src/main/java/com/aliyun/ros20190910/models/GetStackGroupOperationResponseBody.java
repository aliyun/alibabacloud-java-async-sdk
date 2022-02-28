// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StackGroupOperation.
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
             * AccountIds.
             */
            public Builder accountIds(java.util.List < String > accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * RdFolderIds.
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
             * FailureToleranceCount.
             */
            public Builder failureToleranceCount(Integer failureToleranceCount) {
                this.failureToleranceCount = failureToleranceCount;
                return this;
            }

            /**
             * FailureTolerancePercentage.
             */
            public Builder failureTolerancePercentage(Integer failureTolerancePercentage) {
                this.failureTolerancePercentage = failureTolerancePercentage;
                return this;
            }

            /**
             * MaxConcurrentCount.
             */
            public Builder maxConcurrentCount(Integer maxConcurrentCount) {
                this.maxConcurrentCount = maxConcurrentCount;
                return this;
            }

            /**
             * MaxConcurrentPercentage.
             */
            public Builder maxConcurrentPercentage(Integer maxConcurrentPercentage) {
                this.maxConcurrentPercentage = maxConcurrentPercentage;
                return this;
            }

            /**
             * RegionIdsOrder.
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
             * CancelledStackInstancesCount.
             */
            public Builder cancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
                this.cancelledStackInstancesCount = cancelledStackInstancesCount;
                return this;
            }

            /**
             * DriftDetectionStatus.
             */
            public Builder driftDetectionStatus(String driftDetectionStatus) {
                this.driftDetectionStatus = driftDetectionStatus;
                return this;
            }

            /**
             * DriftDetectionTime.
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * DriftedStackInstancesCount.
             */
            public Builder driftedStackInstancesCount(Integer driftedStackInstancesCount) {
                this.driftedStackInstancesCount = driftedStackInstancesCount;
                return this;
            }

            /**
             * FailedStackInstancesCount.
             */
            public Builder failedStackInstancesCount(Integer failedStackInstancesCount) {
                this.failedStackInstancesCount = failedStackInstancesCount;
                return this;
            }

            /**
             * InProgressStackInstancesCount.
             */
            public Builder inProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
                this.inProgressStackInstancesCount = inProgressStackInstancesCount;
                return this;
            }

            /**
             * InSyncStackInstancesCount.
             */
            public Builder inSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
                this.inSyncStackInstancesCount = inSyncStackInstancesCount;
                return this;
            }

            /**
             * StackGroupDriftStatus.
             */
            public Builder stackGroupDriftStatus(String stackGroupDriftStatus) {
                this.stackGroupDriftStatus = stackGroupDriftStatus;
                return this;
            }

            /**
             * TotalStackInstancesCount.
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
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * AdministrationRoleName.
             */
            public Builder administrationRoleName(String administrationRoleName) {
                this.administrationRoleName = administrationRoleName;
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
             * DeploymentTargets.
             */
            public Builder deploymentTargets(DeploymentTargets deploymentTargets) {
                this.deploymentTargets = deploymentTargets;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExecutionRoleName.
             */
            public Builder executionRoleName(String executionRoleName) {
                this.executionRoleName = executionRoleName;
                return this;
            }

            /**
             * OperationDescription.
             */
            public Builder operationDescription(String operationDescription) {
                this.operationDescription = operationDescription;
                return this;
            }

            /**
             * OperationId.
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * OperationPreferences.
             */
            public Builder operationPreferences(OperationPreferences operationPreferences) {
                this.operationPreferences = operationPreferences;
                return this;
            }

            /**
             * RetainStacks.
             */
            public Builder retainStacks(Boolean retainStacks) {
                this.retainStacks = retainStacks;
                return this;
            }

            /**
             * StackGroupDriftDetectionDetail.
             */
            public Builder stackGroupDriftDetectionDetail(StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
                this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
                return this;
            }

            /**
             * StackGroupId.
             */
            public Builder stackGroupId(String stackGroupId) {
                this.stackGroupId = stackGroupId;
                return this;
            }

            /**
             * StackGroupName.
             */
            public Builder stackGroupName(String stackGroupName) {
                this.stackGroupName = stackGroupName;
                return this;
            }

            /**
             * Status.
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
