// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackGroupResponseBody</p>
 */
public class GetStackGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StackGroup")
    private StackGroup stackGroup;

    private GetStackGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.stackGroup = builder.stackGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return stackGroup
     */
    public StackGroup getStackGroup() {
        return this.stackGroup;
    }

    public static final class Builder {
        private String requestId; 
        private StackGroup stackGroup; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the stack group.
         */
        public Builder stackGroup(StackGroup stackGroup) {
            this.stackGroup = stackGroup;
            return this;
        }

        public GetStackGroupResponseBody build() {
            return new GetStackGroupResponseBody(this);
        } 

    } 

    public static class AutoDeployment extends TeaModel {
        @NameInMap("Enabled")
        private Boolean enabled;

        @NameInMap("RetainStacksOnAccountRemoval")
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
             * *   true: Automatic deployment is enabled. If a member account is added to the folder to which the stack group belongs after automatic deployment is enabled, the stack group deploys its stack instances in the specified region where the added account is deployed. If the account is deleted from the folder, the stack instances in the specified region are deleted from the stack group.
             * *   false: Automatic deployment is disabled. After automatic deployment is disabled, the stack instances remain unchanged when the member account in the folder is changed.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * Indicates whether stacks in the member account are retained when the member account is deleted from the folder.
             * <p>
             * 
             * Valid values:
             * 
             * *   true: The stacks are retained.
             * *   false: The stacks are deleted.
             * 
             * >  This parameter is returned only when the Enabled parameter is set to true.
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
    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * The key of the parameter.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of the parameter.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
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
             * The number of stack instances for which drift detection was canceled.
             */
            public Builder cancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
                this.cancelledStackInstancesCount = cancelledStackInstancesCount;
                return this;
            }

            /**
             * The status of drift detection on the stack group.
             * <p>
             * 
             * Valid values:
             * 
             * *   COMPLETED: Drift detection is performed and completed on all stack instances.
             * *   FAILED: Drift detection is performed. The number of stack instances that failed the drift detection exceeds the specified threshold.
             * *   PARTIAL_SUCCESS: Drift detection is performed. The number of stack instances that failed the drift detection does not exceed the specified threshold.
             * *   IN_PROGRESS: Drift detection is being performed on the stack group.
             * *   STOPPED: Drift detection is canceled for the stack group.
             */
            public Builder driftDetectionStatus(String driftDetectionStatus) {
                this.driftDetectionStatus = driftDetectionStatus;
                return this;
            }

            /**
             * The time when drift detection was performed on the stack group.
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
             * The drift status of the stack group.
             * <p>
             * 
             * Valid values:
             * 
             * *   DRIFTED: At least one stack instance in the stack group has drifted.
             * *   NOT_CHECKED: No drift detection is completed on the stack group.
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
    public static class StackGroup extends TeaModel {
        @NameInMap("AdministrationRoleName")
        private String administrationRoleName;

        @NameInMap("AutoDeployment")
        private AutoDeployment autoDeployment;

        @NameInMap("Description")
        private String description;

        @NameInMap("ExecutionRoleName")
        private String executionRoleName;

        @NameInMap("Parameters")
        private java.util.List < Parameters> parameters;

        @NameInMap("PermissionModel")
        private String permissionModel;

        @NameInMap("RdFolderIds")
        private java.util.List < String > rdFolderIds;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("StackGroupDriftDetectionDetail")
        private StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        @NameInMap("StackGroupId")
        private String stackGroupId;

        @NameInMap("StackGroupName")
        private String stackGroupName;

        @NameInMap("Status")
        private String status;

        @NameInMap("TemplateBody")
        private String templateBody;

        private StackGroup(Builder builder) {
            this.administrationRoleName = builder.administrationRoleName;
            this.autoDeployment = builder.autoDeployment;
            this.description = builder.description;
            this.executionRoleName = builder.executionRoleName;
            this.parameters = builder.parameters;
            this.permissionModel = builder.permissionModel;
            this.rdFolderIds = builder.rdFolderIds;
            this.resourceGroupId = builder.resourceGroupId;
            this.stackGroupDriftDetectionDetail = builder.stackGroupDriftDetectionDetail;
            this.stackGroupId = builder.stackGroupId;
            this.stackGroupName = builder.stackGroupName;
            this.status = builder.status;
            this.templateBody = builder.templateBody;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StackGroup create() {
            return builder().build();
        }

        /**
         * @return administrationRoleName
         */
        public String getAdministrationRoleName() {
            return this.administrationRoleName;
        }

        /**
         * @return autoDeployment
         */
        public AutoDeployment getAutoDeployment() {
            return this.autoDeployment;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return executionRoleName
         */
        public String getExecutionRoleName() {
            return this.executionRoleName;
        }

        /**
         * @return parameters
         */
        public java.util.List < Parameters> getParameters() {
            return this.parameters;
        }

        /**
         * @return permissionModel
         */
        public String getPermissionModel() {
            return this.permissionModel;
        }

        /**
         * @return rdFolderIds
         */
        public java.util.List < String > getRdFolderIds() {
            return this.rdFolderIds;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
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

        /**
         * @return templateBody
         */
        public String getTemplateBody() {
            return this.templateBody;
        }

        public static final class Builder {
            private String administrationRoleName; 
            private AutoDeployment autoDeployment; 
            private String description; 
            private String executionRoleName; 
            private java.util.List < Parameters> parameters; 
            private String permissionModel; 
            private java.util.List < String > rdFolderIds; 
            private String resourceGroupId; 
            private StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail; 
            private String stackGroupId; 
            private String stackGroupName; 
            private String status; 
            private String templateBody; 

            /**
             * The name of the RAM role that is specified for the administrator account in Resource Orchestration Service (ROS) when you create the self-managed stack group. If this parameter is not specified, the default value AliyunROSStackGroupAdministrationRole is returned.
             */
            public Builder administrationRoleName(String administrationRoleName) {
                this.administrationRoleName = administrationRoleName;
                return this;
            }

            /**
             * The information about automatic deployment settings.
             * <p>
             * 
             * >  This parameter is returned only when the PermissionModel parameter is set to SERVICE_MANAGED.
             */
            public Builder autoDeployment(AutoDeployment autoDeployment) {
                this.autoDeployment = autoDeployment;
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
             * The name of the RAM role that is specified for the execution account when you create the self-managed stack group. The administrator role AliyunROSStackGroupAdministrationRole assumes the execution role. If this parameter is not specified, the default value AliyunROSStackGroupExecutionRole is returned.
             */
            public Builder executionRoleName(String executionRoleName) {
                this.executionRoleName = executionRoleName;
                return this;
            }

            /**
             * The parameters of the stack group.
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * The permission model.
             * <p>
             * 
             * Valid values:
             * 
             * *   SELF_MANAGED: the self-managed permission model
             * *   SERVICE_MANAGED: the service-managed permission model
             * 
             * >  For more information about the permission models of stack groups, see [Overview](~~154578~~).
             */
            public Builder permissionModel(String permissionModel) {
                this.permissionModel = permissionModel;
                return this;
            }

            /**
             * The folder IDs of the resource directory. This parameter is used to deploy stack instances within all the accounts in the folders.
             * <p>
             * 
             * >  This parameter is returned only when the PermissionModel parameter is set to SERVICE_MANAGED.
             */
            public Builder rdFolderIds(java.util.List < String > rdFolderIds) {
                this.rdFolderIds = rdFolderIds;
                return this;
            }

            /**
             * The ID of the resource group. This parameter is specified when you create the stack group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The details of the last drift detection that was performed on the stack group.
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
             * The status of the stack group.
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
             * The template body.
             */
            public Builder templateBody(String templateBody) {
                this.templateBody = templateBody;
                return this;
            }

            public StackGroup build() {
                return new StackGroup(this);
            } 

        } 

    }
}
