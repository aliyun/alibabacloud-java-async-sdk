// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetStackGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackGroupResponseBody</p>
 */
public class GetStackGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StackGroup")
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
         * <p>The details of the stack group.</p>
         * 
         * <strong>example:</strong>
         * <p>14A07460-EBE7-47CA-9757-12CC4761D47A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of the stack group.</p>
         */
        public Builder stackGroup(StackGroup stackGroup) {
            this.stackGroup = stackGroup;
            return this;
        }

        public GetStackGroupResponseBody build() {
            return new GetStackGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStackGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackGroupResponseBody</p>
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
             * <p>Indicates whether stacks in the member account are retained when the member account is deleted from the folder.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: The stacks are retained.</li>
             * <li>false: The stacks are deleted.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter is returned only when the Enabled parameter is set to true.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The folder IDs of the resource directory. This parameter is used to deploy stack instances within all the accounts in the folders.</p>
             * <blockquote>
             * <p> This parameter is returned only when the PermissionModel parameter is set to SERVICE_MANAGED.</p>
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
     * {@link GetStackGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackGroupResponseBody</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterKey")
        private String parameterKey;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
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
             * <p>The name of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>Amount</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The value of the parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
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
    /**
     * 
     * {@link GetStackGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackGroupResponseBody</p>
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

            /**
             * <p>The number of stack instances that have drifted.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cancelledStackInstancesCount(Integer cancelledStackInstancesCount) {
                this.cancelledStackInstancesCount = cancelledStackInstancesCount;
                return this;
            }

            /**
             * <p>The drift status of the stack group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DRIFTED: At least one stack instance in the stack group has drifted.</li>
             * <li>NOT_CHECKED: No drift detection is completed on the stack group.</li>
             * <li>IN_SYNC: All the stack instances in the stack group are being synchronized.</li>
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
             * <p>The number of stack instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-02-27T07:47:47</p>
             */
            public Builder driftDetectionTime(String driftDetectionTime) {
                this.driftDetectionTime = driftDetectionTime;
                return this;
            }

            /**
             * <p>The ID of the resource group. This parameter is specified when you create the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder driftedStackInstancesCount(Integer driftedStackInstancesCount) {
                this.driftedStackInstancesCount = driftedStackInstancesCount;
                return this;
            }

            /**
             * <p>The status of drift detection on the stack group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>COMPLETED: Drift detection is performed and completed on all stack instances.</li>
             * <li>FAILED: Drift detection is performed. The number of stack instances that failed the drift detection exceeds the specified threshold.</li>
             * <li>PARTIAL_SUCCESS: Drift detection is performed. The number of stack instances that failed the drift detection does not exceed the specified threshold.</li>
             * <li>IN_PROGRESS: Drift detection is being performed on the stack group.</li>
             * <li>STOPPED: Drift detection is canceled for the stack group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedStackInstancesCount(Integer failedStackInstancesCount) {
                this.failedStackInstancesCount = failedStackInstancesCount;
                return this;
            }

            /**
             * <p>The number of stack instances that were being synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder inProgressStackInstancesCount(Integer inProgressStackInstancesCount) {
                this.inProgressStackInstancesCount = inProgressStackInstancesCount;
                return this;
            }

            /**
             * <p>The number of stack instances for which drift detection was canceled.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inSyncStackInstancesCount(Integer inSyncStackInstancesCount) {
                this.inSyncStackInstancesCount = inSyncStackInstancesCount;
                return this;
            }

            /**
             * <p>The number of stack instances on which drift detection was being performed.</p>
             * 
             * <strong>example:</strong>
             * <p>DRIFTED</p>
             */
            public Builder stackGroupDriftStatus(String stackGroupDriftStatus) {
                this.stackGroupDriftStatus = stackGroupDriftStatus;
                return this;
            }

            /**
             * <p>The number of stack instances that failed drift detection.</p>
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
     * {@link GetStackGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackGroupResponseBody</p>
     */
    public static class StackGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdministrationRoleName")
        private String administrationRoleName;

        @com.aliyun.core.annotation.NameInMap("AutoDeployment")
        private AutoDeployment autoDeployment;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExecutionRoleName")
        private String executionRoleName;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List < Parameters> parameters;

        @com.aliyun.core.annotation.NameInMap("PermissionModel")
        private String permissionModel;

        @com.aliyun.core.annotation.NameInMap("RdFolderIds")
        private java.util.List < String > rdFolderIds;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("StackGroupDriftDetectionDetail")
        private StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail;

        @com.aliyun.core.annotation.NameInMap("StackGroupId")
        private String stackGroupId;

        @com.aliyun.core.annotation.NameInMap("StackGroupName")
        private String stackGroupName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateBody")
        private String templateBody;

        @com.aliyun.core.annotation.NameInMap("TemplateContent")
        private String templateContent;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private StackGroup(Builder builder) {
            this.administrationRoleName = builder.administrationRoleName;
            this.autoDeployment = builder.autoDeployment;
            this.createTime = builder.createTime;
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
            this.templateContent = builder.templateContent;
            this.updateTime = builder.updateTime;
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

        /**
         * @return templateContent
         */
        public String getTemplateContent() {
            return this.templateContent;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String administrationRoleName; 
            private AutoDeployment autoDeployment; 
            private String createTime; 
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
            private String templateContent; 
            private String updateTime; 

            /**
             * <p>The parameters of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunROSStackGroupAdministrationRole</p>
             */
            public Builder administrationRoleName(String administrationRoleName) {
                this.administrationRoleName = administrationRoleName;
                return this;
            }

            /**
             * <p>Indicates whether automatic deployment is enabled.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>true: Automatic deployment is enabled. If a member account is added to the folder to which the stack group belongs after automatic deployment is enabled, the stack group deploys its stack instances in the specified region where the added account is deployed. If the account is deleted from the folder, the stack instances in the specified region are deleted from the stack group.</li>
             * <li>false: Automatic deployment is disabled. After automatic deployment is disabled, the stack instances remain unchanged when the member account in the folder is changed.</li>
             * </ul>
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
             * <p>The name of the stack group.</p>
             * 
             * <strong>example:</strong>
             * <p>StackGroup Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The template body.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunROSStackGroupExecutionRole</p>
             */
            public Builder executionRoleName(String executionRoleName) {
                this.executionRoleName = executionRoleName;
                return this;
            }

            /**
             * <p>The key of the parameter.</p>
             */
            public Builder parameters(java.util.List < Parameters> parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>The information about automatic deployment settings.</p>
             * <blockquote>
             * <p> This parameter is returned only when the PermissionModel parameter is set to SERVICE_MANAGED.</p>
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
             * <p>The folder IDs of the resource directory. This parameter is used to deploy stack instances within all the accounts in the folders.</p>
             * <blockquote>
             * <p> This parameter is returned only when the PermissionModel parameter is set to SERVICE_MANAGED.</p>
             * </blockquote>
             */
            public Builder rdFolderIds(java.util.List < String > rdFolderIds) {
                this.rdFolderIds = rdFolderIds;
                return this;
            }

            /**
             * <p>The permission model.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SELF_MANAGED: the self-managed permission model</li>
             * <li>SERVICE_MANAGED: the service-managed permission model</li>
             * </ul>
             * <blockquote>
             * <p> For more information about the permission models of stack groups, see <a href="https://help.aliyun.com/document_detail/154578.html">Overview</a>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph6aiy****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The time when drift detection was performed on the stack group.</p>
             */
            public Builder stackGroupDriftDetectionDetail(StackGroupDriftDetectionDetail stackGroupDriftDetectionDetail) {
                this.stackGroupDriftDetectionDetail = stackGroupDriftDetectionDetail;
                return this;
            }

            /**
             * <p>The status of the stack group.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>ACTIVE</li>
             * <li>DELETED</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>fd0ddef9-9540-4b42-a464-94f77835****</p>
             */
            public Builder stackGroupId(String stackGroupId) {
                this.stackGroupId = stackGroupId;
                return this;
            }

            /**
             * <p>The name of the RAM role that is specified for the execution account when you create the self-managed stack group. The administrator role AliyunROSStackGroupAdministrationRole assumes the execution role. If this parameter is not specified, the default value AliyunROSStackGroupExecutionRole is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>MyStackGroup</p>
             */
            public Builder stackGroupName(String stackGroupName) {
                this.stackGroupName = stackGroupName;
                return this;
            }

            /**
             * <p>The name of the RAM role that is specified for the administrator account in Resource Orchestration Service (ROS) when you create the self-managed stack group. If this parameter is not specified, the default value AliyunROSStackGroupAdministrationRole is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The structure that contains the template body.</p>
             * <blockquote>
             * <p>We recommend that you use TemplateContent instead of TemplateBody.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;}</p>
             */
            public Builder templateBody(String templateBody) {
                this.templateBody = templateBody;
                return this;
            }

            /**
             * <p>The JSON-formatted structure that contains the template body. For more information, see <a href="https://help.aliyun.com/document_detail/28857.html">Template syntax</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;ROSTemplateFormatVersion&quot;: &quot;2015-09-01&quot;
             * }</p>
             */
            public Builder templateContent(String templateContent) {
                this.templateContent = templateContent;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public StackGroup build() {
                return new StackGroup(this);
            } 

        } 

    }
}
