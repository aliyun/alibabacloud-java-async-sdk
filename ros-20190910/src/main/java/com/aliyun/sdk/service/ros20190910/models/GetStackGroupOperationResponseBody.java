// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

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
     * @return stackGroupOperation
     */
    public StackGroupOperation getStackGroupOperation() {
        return this.stackGroupOperation;
    }

    public static final class Builder {
        private String requestId; 
        private StackGroupOperation stackGroupOperation; 

        private Builder() {
        } 

        private Builder(GetStackGroupOperationResponseBody model) {
            this.requestId = model.requestId;
            this.stackGroupOperation = model.stackGroupOperation;
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
         * <p>The information about the stack group operation.</p>
         */
        public Builder stackGroupOperation(StackGroupOperation stackGroupOperation) {
            this.stackGroupOperation = stackGroupOperation;
            return this;
        }

        public GetStackGroupOperationResponseBody build() {
            return new GetStackGroupOperationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStackGroupOperationResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackGroupOperationResponseBody</p>
     */
    public static class DeploymentTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountIds")
        private java.util.List<String> accountIds;

        @com.aliyun.core.annotation.NameInMap("RdFolderIds")
        private java.util.List<String> rdFolderIds;

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
        public java.util.List<String> getAccountIds() {
            return this.accountIds;
        }

        /**
         * @return rdFolderIds
         */
        public java.util.List<String> getRdFolderIds() {
            return this.rdFolderIds;
        }

        public static final class Builder {
            private java.util.List<String> accountIds; 
            private java.util.List<String> rdFolderIds; 

            private Builder() {
            } 

            private Builder(DeploymentTargets model) {
                this.accountIds = model.accountIds;
                this.rdFolderIds = model.rdFolderIds;
            } 

            /**
             * <p>The IDs of the members in the resource directory.</p>
             * <blockquote>
             * <p>This parameter is returned only if AccountIds is specified when the <a href="https://help.aliyun.com/document_detail/151716.html">UpdateStackInstances</a> operation is called to update stack instances.</p>
             * </blockquote>
             */
            public Builder accountIds(java.util.List<String> accountIds) {
                this.accountIds = accountIds;
                return this;
            }

            /**
             * <p>The IDs of the folders in the resource directory.</p>
             */
            public Builder rdFolderIds(java.util.List<String> rdFolderIds) {
                this.rdFolderIds = rdFolderIds;
                return this;
            }

            public DeploymentTargets build() {
                return new DeploymentTargets(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackGroupOperationResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackGroupOperationResponseBody</p>
     */
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
        private java.util.List<String> regionIdsOrder;

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
        public java.util.List<String> getRegionIdsOrder() {
            return this.regionIdsOrder;
        }

        public static final class Builder {
            private Integer failureToleranceCount; 
            private Integer failureTolerancePercentage; 
            private Integer maxConcurrentCount; 
            private Integer maxConcurrentPercentage; 
            private java.util.List<String> regionIdsOrder; 

            private Builder() {
            } 

            private Builder(OperationPreferences model) {
                this.failureToleranceCount = model.failureToleranceCount;
                this.failureTolerancePercentage = model.failureTolerancePercentage;
                this.maxConcurrentCount = model.maxConcurrentCount;
                this.maxConcurrentPercentage = model.maxConcurrentPercentage;
                this.regionIdsOrder = model.regionIdsOrder;
            } 

            /**
             * <p>The number of accounts within which stack operation failures are allowed to occur in each region. If the value of this parameter is exceeded in a region, Resource Orchestration Service (ROS) stops the operation in the region. If the operation is stopped in one region, the operation is no longer performed in other regions.</p>
             * <p>Valid values: 0 to 20.</p>
             * <blockquote>
             * <p>Only one of FailureToleranceCount and FailureTolerancePercentage can be returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failureToleranceCount(Integer failureToleranceCount) {
                this.failureToleranceCount = failureToleranceCount;
                return this;
            }

            /**
             * <p>The percentage of the number of accounts within which stack operation failures are allowed to occur to the total number of accounts in each region. If the value of this parameter is exceeded in a region, ROS stops the operation in the region.</p>
             * <p>Valid values: 0 to 100.</p>
             * <blockquote>
             * <p>Only one of FailureToleranceCount and FailureTolerancePercentage can be returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder failureTolerancePercentage(Integer failureTolerancePercentage) {
                this.failureTolerancePercentage = failureTolerancePercentage;
                return this;
            }

            /**
             * <p>The maximum number of accounts within which stacks are deployed at the same time in each region.</p>
             * <p>Valid values: 1 to 20.</p>
             * <blockquote>
             * <p>Only one of MaxConcurrentCount and MaxConcurrentPercentage can be returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxConcurrentCount(Integer maxConcurrentCount) {
                this.maxConcurrentCount = maxConcurrentCount;
                return this;
            }

            /**
             * <p>The percentage of the maximum number of accounts within which stacks are deployed at the same time to the total number of accounts in each region.</p>
             * <p>Valid values: 1 to 100.</p>
             * <blockquote>
             * <p>Only one of MaxConcurrentCount and MaxConcurrentPercentage can be returned.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxConcurrentPercentage(Integer maxConcurrentPercentage) {
                this.maxConcurrentPercentage = maxConcurrentPercentage;
                return this;
            }

            /**
             * <p>The regions in the order of operation execution.</p>
             */
            public Builder regionIdsOrder(java.util.List<String> regionIdsOrder) {
                this.regionIdsOrder = regionIdsOrder;
                return this;
            }

            public OperationPreferences build() {
                return new OperationPreferences(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackGroupOperationResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackGroupOperationResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StackGroupDriftDetectionDetail model) {
                this.cancelledStackInstancesCount = model.cancelledStackInstancesCount;
                this.driftDetectionStatus = model.driftDetectionStatus;
                this.driftDetectionTime = model.driftDetectionTime;
                this.driftedStackInstancesCount = model.driftedStackInstancesCount;
                this.failedStackInstancesCount = model.failedStackInstancesCount;
                this.inProgressStackInstancesCount = model.inProgressStackInstancesCount;
                this.inSyncStackInstancesCount = model.inSyncStackInstancesCount;
                this.stackGroupDriftStatus = model.stackGroupDriftStatus;
                this.totalStackInstancesCount = model.totalStackInstancesCount;
            } 

            /**
             * <p>The number of stack instances for which drift detection was canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
                this.cancelledStackInstancesCount = cancelledStackInstancesCount;
                return this;
            }

            /**
             * <p>The drift detection state.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>COMPLETED: Drift detection is performed on the stack group and all stack instances passed the drift detection.</li>
             * <li>FAILED: Drift detection is performed on the stack group. The number of stack instances that failed the drift detection exceeds the specified threshold.</li>
             * <li>PARTIAL_SUCCESS: Drift detection is performed on the stack group. The number of stack instances that failed the drift detection does not exceed the specified threshold.</li>
             * <li>IN_PROGRESS: Drift detection is being performed on the stack group.</li>
             * <li>STOPPED: Drift detection is canceled for the stack group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>COMPLETED</p>
             */
            public Builder driftDetectionStatus(String driftDetectionStatus) {
                this.driftDetectionStatus = driftDetectionStatus;
                return this;
            }

            /**
             * <p>The time when drift detection was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-27T07:47:47</p>
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * <p>The number of stack instances that have drifted.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder driftedStackInstancesCount(Integer driftedStackInstancesCount) {
                this.driftedStackInstancesCount = driftedStackInstancesCount;
                return this;
            }

            /**
             * <p>The number of stack instances that failed drift detection.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedStackInstancesCount(Integer failedStackInstancesCount) {
                this.failedStackInstancesCount = failedStackInstancesCount;
                return this;
            }

            /**
             * <p>The number of stack instances on which drift detection was being performed.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
                this.inProgressStackInstancesCount = inProgressStackInstancesCount;
                return this;
            }

            /**
             * <p>The number of stack instances that were being synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
                this.inSyncStackInstancesCount = inSyncStackInstancesCount;
                return this;
            }

            /**
             * <p>The drift state of the stack group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DRIFTED: At least one stack instance in the stack group has drifted.</li>
             * <li>NOT_CHECKED: No successful drift detection is performed in the stack group.</li>
             * <li>IN_SYNC: All the stack instances in the stack group are being synchronized.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DRIFTED</p>
             */
            public Builder stackGroupDriftStatus(String stackGroupDriftStatus) {
                this.stackGroupDriftStatus = stackGroupDriftStatus;
                return this;
            }

            /**
             * <p>The number of stack instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
    /**
     * 
     * {@link GetStackGroupOperationResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackGroupOperationResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(StackGroupOperation model) {
                this.action = model.action;
                this.administrationRoleName = model.administrationRoleName;
                this.createTime = model.createTime;
                this.deploymentTargets = model.deploymentTargets;
                this.endTime = model.endTime;
                this.executionRoleName = model.executionRoleName;
                this.operationDescription = model.operationDescription;
                this.operationId = model.operationId;
                this.operationPreferences = model.operationPreferences;
                this.retainStacks = model.retainStacks;
                this.stackGroupDriftDetectionDetail = model.stackGroupDriftDetectionDetail;
                this.stackGroupId = model.stackGroupId;
                this.stackGroupName = model.stackGroupName;
                this.status = model.status;
            } 

            /**
             * <p>The operation type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>CREATE</li>
             * <li>UPDATE</li>
             * <li>DELETE</li>
             * <li>DETECT_DRIFT</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DELETE</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The name of the RAM role that you specify for the administrator account when you create the self-managed stack group. ROS assumes the administrator role to perform operations. If this parameter is not specified, the default value AliyunROSStackGroupAdministrationRole is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunROSStackGroupAdministrationRole</p>
             */
            public Builder administrationRoleName(String administrationRoleName) {
                this.administrationRoleName = administrationRoleName;
                return this;
            }

            /**
             * <p>The time when the operation was initiated.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-20T09:22:3</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The destinations to deploy stack instances when the stack is granted service-managed permissions.</p>
             */
            public Builder deploymentTargets(DeploymentTargets deploymentTargets) {
                this.deploymentTargets = deploymentTargets;
                return this;
            }

            /**
             * <p>The time when the operation ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-01-20T09:22:4</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The name of the RAM role that you specify for the execution account when you create the self-managed stack group. The administrator role AliyunROSStackGroupAdministrationRole assumes the execution role to perform operations. If this parameter is not specified, the default value AliyunROSStackGroupExecutionRole is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunROSStackGroupExecutionRole</p>
             */
            public Builder executionRoleName(String executionRoleName) {
                this.executionRoleName = executionRoleName;
                return this;
            }

            /**
             * <p>The description of the operation.</p>
             * <blockquote>
             * <p>This parameter is returned only if OperationDescription is specified when the <a href="https://help.aliyun.com/document_detail/151338.html">CreateStackInstances</a> operation is called to create stack instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Create stack instance in hangzhou</p>
             */
            public Builder operationDescription(String operationDescription) {
                this.operationDescription = operationDescription;
                return this;
            }

            /**
             * <p>The operation ID.</p>
             * 
             * <strong>example:</strong>
             * <p>6da106ca-1784-4a6f-a7e1-e723863d****</p>
             */
            public Builder operationId(String operationId) {
                this.operationId = operationId;
                return this;
            }

            /**
             * <p>The operation settings.</p>
             */
            public Builder operationPreferences(OperationPreferences operationPreferences) {
                this.operationPreferences = operationPreferences;
                return this;
            }

            /**
             * <p>Indicates whether stacks are retained when the associated stack instances are deleted. When you delete a stack instance, you can choose to delete or retain the stack with which the stack instance is associated.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: Stacks are retained when the associated stack instances are deleted.</li>
             * <li>false: Stacks are deleted when the associated stack instances are deleted. Proceed with caution.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only if you delete stack instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder retainStacks(Boolean retainStacks) {
                this.retainStacks = retainStacks;
                return this;
            }

            /**
             * <p>The information about drift detection.</p>
             * <blockquote>
             * <p>This parameter is returned only if drift detection is performed.</p>
             * </blockquote>
             */
            public Builder stackGroupDriftDetectionDetail(StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
                this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
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
             * <p>The state of the operation.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>RUNNING</li>
             * <li>SUCCEEDED</li>
             * <li>FAILED</li>
             * <li>STOPPING</li>
             * <li>STOPPED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCEEDED</p>
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
