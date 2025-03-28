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
 * {@link GetStackResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackResponseBody</p>
 */
public class GetStackResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckedStackResourceCount")
    private Integer checkedStackResourceCount;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DeletionProtection")
    private String deletionProtection;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DisableRollback")
    private Boolean disableRollback;

    @com.aliyun.core.annotation.NameInMap("DriftDetectionTime")
    private String driftDetectionTime;

    @com.aliyun.core.annotation.NameInMap("Interface")
    private String _interface;

    @com.aliyun.core.annotation.NameInMap("Log")
    private Log log;

    @com.aliyun.core.annotation.NameInMap("NotCheckedStackResourceCount")
    private Integer notCheckedStackResourceCount;

    @com.aliyun.core.annotation.NameInMap("NotificationURLs")
    private java.util.List<String> notificationURLs;

    @com.aliyun.core.annotation.NameInMap("OperationInfo")
    private OperationInfo operationInfo;

    @com.aliyun.core.annotation.NameInMap("OrderIds")
    private java.util.List<String> orderIds;

    @com.aliyun.core.annotation.NameInMap("Outputs")
    private java.util.List<java.util.Map<String, ?>> outputs;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    @com.aliyun.core.annotation.NameInMap("ParentStackId")
    private String parentStackId;

    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ResourceProgress")
    private ResourceProgress resourceProgress;

    @com.aliyun.core.annotation.NameInMap("RollbackFailedRootReason")
    private String rollbackFailedRootReason;

    @com.aliyun.core.annotation.NameInMap("RootStackId")
    private String rootStackId;

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("StackDriftStatus")
    private String stackDriftStatus;

    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

    @com.aliyun.core.annotation.NameInMap("StackName")
    private String stackName;

    @com.aliyun.core.annotation.NameInMap("StackType")
    private String stackType;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusReason")
    private String statusReason;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TemplateDescription")
    private String templateDescription;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateScratchId")
    private String templateScratchId;

    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    @com.aliyun.core.annotation.NameInMap("TimeoutInMinutes")
    private Integer timeoutInMinutes;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetStackResponseBody(Builder builder) {
        this.checkedStackResourceCount = builder.checkedStackResourceCount;
        this.createTime = builder.createTime;
        this.deletionProtection = builder.deletionProtection;
        this.description = builder.description;
        this.disableRollback = builder.disableRollback;
        this.driftDetectionTime = builder.driftDetectionTime;
        this._interface = builder._interface;
        this.log = builder.log;
        this.notCheckedStackResourceCount = builder.notCheckedStackResourceCount;
        this.notificationURLs = builder.notificationURLs;
        this.operationInfo = builder.operationInfo;
        this.orderIds = builder.orderIds;
        this.outputs = builder.outputs;
        this.parameters = builder.parameters;
        this.parentStackId = builder.parentStackId;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceProgress = builder.resourceProgress;
        this.rollbackFailedRootReason = builder.rollbackFailedRootReason;
        this.rootStackId = builder.rootStackId;
        this.serviceManaged = builder.serviceManaged;
        this.serviceName = builder.serviceName;
        this.stackDriftStatus = builder.stackDriftStatus;
        this.stackId = builder.stackId;
        this.stackName = builder.stackName;
        this.stackType = builder.stackType;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.tags = builder.tags;
        this.templateDescription = builder.templateDescription;
        this.templateId = builder.templateId;
        this.templateScratchId = builder.templateScratchId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
        this.timeoutInMinutes = builder.timeoutInMinutes;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStackResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkedStackResourceCount
     */
    public Integer getCheckedStackResourceCount() {
        return this.checkedStackResourceCount;
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return _interface
     */
    public String get_interface() {
        return this._interface;
    }

    /**
     * @return log
     */
    public Log getLog() {
        return this.log;
    }

    /**
     * @return notCheckedStackResourceCount
     */
    public Integer getNotCheckedStackResourceCount() {
        return this.notCheckedStackResourceCount;
    }

    /**
     * @return notificationURLs
     */
    public java.util.List<String> getNotificationURLs() {
        return this.notificationURLs;
    }

    /**
     * @return operationInfo
     */
    public OperationInfo getOperationInfo() {
        return this.operationInfo;
    }

    /**
     * @return orderIds
     */
    public java.util.List<String> getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return outputs
     */
    public java.util.List<java.util.Map<String, ?>> getOutputs() {
        return this.outputs;
    }

    /**
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return parentStackId
     */
    public String getParentStackId() {
        return this.parentStackId;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return resourceProgress
     */
    public ResourceProgress getResourceProgress() {
        return this.resourceProgress;
    }

    /**
     * @return rollbackFailedRootReason
     */
    public String getRollbackFailedRootReason() {
        return this.rollbackFailedRootReason;
    }

    /**
     * @return rootStackId
     */
    public String getRootStackId() {
        return this.rootStackId;
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
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templateDescription
     */
    public String getTemplateDescription() {
        return this.templateDescription;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
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
        private Integer checkedStackResourceCount; 
        private String createTime; 
        private String deletionProtection; 
        private String description; 
        private Boolean disableRollback; 
        private String driftDetectionTime; 
        private String _interface; 
        private Log log; 
        private Integer notCheckedStackResourceCount; 
        private java.util.List<String> notificationURLs; 
        private OperationInfo operationInfo; 
        private java.util.List<String> orderIds; 
        private java.util.List<java.util.Map<String, ?>> outputs; 
        private java.util.List<Parameters> parameters; 
        private String parentStackId; 
        private String ramRoleName; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private ResourceProgress resourceProgress; 
        private String rollbackFailedRootReason; 
        private String rootStackId; 
        private Boolean serviceManaged; 
        private String serviceName; 
        private String stackDriftStatus; 
        private String stackId; 
        private String stackName; 
        private String stackType; 
        private String status; 
        private String statusReason; 
        private java.util.List<Tags> tags; 
        private String templateDescription; 
        private String templateId; 
        private String templateScratchId; 
        private String templateURL; 
        private String templateVersion; 
        private Integer timeoutInMinutes; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetStackResponseBody model) {
            this.checkedStackResourceCount = model.checkedStackResourceCount;
            this.createTime = model.createTime;
            this.deletionProtection = model.deletionProtection;
            this.description = model.description;
            this.disableRollback = model.disableRollback;
            this.driftDetectionTime = model.driftDetectionTime;
            this._interface = model._interface;
            this.log = model.log;
            this.notCheckedStackResourceCount = model.notCheckedStackResourceCount;
            this.notificationURLs = model.notificationURLs;
            this.operationInfo = model.operationInfo;
            this.orderIds = model.orderIds;
            this.outputs = model.outputs;
            this.parameters = model.parameters;
            this.parentStackId = model.parentStackId;
            this.ramRoleName = model.ramRoleName;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.resourceProgress = model.resourceProgress;
            this.rollbackFailedRootReason = model.rollbackFailedRootReason;
            this.rootStackId = model.rootStackId;
            this.serviceManaged = model.serviceManaged;
            this.serviceName = model.serviceName;
            this.stackDriftStatus = model.stackDriftStatus;
            this.stackId = model.stackId;
            this.stackName = model.stackName;
            this.stackType = model.stackType;
            this.status = model.status;
            this.statusReason = model.statusReason;
            this.tags = model.tags;
            this.templateDescription = model.templateDescription;
            this.templateId = model.templateId;
            this.templateScratchId = model.templateScratchId;
            this.templateURL = model.templateURL;
            this.templateVersion = model.templateVersion;
            this.timeoutInMinutes = model.timeoutInMinutes;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The number of resources on which drift detection was performed.</p>
         * <blockquote>
         * <p> This parameter is returned only if the most recent drift detection on the stack was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder checkedStackResourceCount(Integer checkedStackResourceCount) {
            this.checkedStackResourceCount = checkedStackResourceCount;
            return this;
        }

        /**
         * <p>The time when the stack was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-16T08:21:40</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether deletion protection is enabled for the stack. Valid values:</p>
         * <ul>
         * <li>Enabled: Deletion protection is enabled for the stack.</li>
         * <li>Disabled: Deletion protection is disabled for the stack. You can delete the stack by using the ROS console or by calling the DeleteStack operation.</li>
         * </ul>
         * <blockquote>
         * <p> Deletion protection of a nested stack is the same as deletion protection of its root stack.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Disabled</p>
         */
        public Builder deletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>The description of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>Create a VPC.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether rollback is disabled when the stack fails to be created. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * <p>The time when the most recent successful drift detection was performed on the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-16T09:21:40</p>
         */
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }

        /**
         * <p>The description of the console user interface (UI).</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder _interface(String _interface) {
            this._interface = _interface;
            return this;
        }

        /**
         * <p>The log of the stack.</p>
         */
        public Builder log(Log log) {
            this.log = log;
            return this;
        }

        /**
         * <p>The number of resources on which drift detection was not performed.</p>
         * <blockquote>
         * <p> This parameter is returned only if the most recent drift detection on the stack was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder notCheckedStackResourceCount(Integer notCheckedStackResourceCount) {
            this.notCheckedStackResourceCount = notCheckedStackResourceCount;
            return this;
        }

        /**
         * <p>The callback URLs for receiving stack events.</p>
         */
        public Builder notificationURLs(java.util.List<String> notificationURLs) {
            this.notificationURLs = notificationURLs;
            return this;
        }

        /**
         * <p>The supplementary information that is returned if an error occurs on a stack operation.</p>
         * <blockquote>
         * <p> This parameter is returned together with at least one sub-parameter and only under specific conditions. For example, the supplementary information is returned when an API operation of another Alibaba Cloud service fails to be called.</p>
         * </blockquote>
         */
        public Builder operationInfo(OperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }

        /**
         * <p>The order IDs. This parameter is returned only if you configured manual payment when you created a subscription stack.</p>
         */
        public Builder orderIds(java.util.List<String> orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        /**
         * <p>The outputs of the stack.</p>
         */
        public Builder outputs(java.util.List<java.util.Map<String, ?>> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>The parameters of the stack.</p>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the parent stack.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf692****</p>
         */
        public Builder parentStackId(String parentStackId) {
            this.parentStackId = parentStackId;
            return this;
        }

        /**
         * <p>The name of the Resource Access Management (RAM) role. ROS assumes the RAM role to create the stack and uses the credentials of the role to call the APIs of Alibaba Cloud services.<br>ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack, ROS assumes the RAM role even if you do not have permissions to use the RAM role. You must make sure that permissions are granted to the RAM role based on the principle of least privilege.<br>If this parameter is not specified, ROS uses the existing role that is associated with the stack. If no roles are available, ROS uses a temporary credential that is generated from the credentials of your account.<br>The RAM role name can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B288A0BE-D927-4888-B0F7-B35EF84B6E6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxazb4ph6aiy****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The resource creation progress.</p>
         */
        public Builder resourceProgress(ResourceProgress resourceProgress) {
            this.resourceProgress = resourceProgress;
            return this;
        }

        /**
         * <p>当资源栈状态为回滚失败时，该字段展示导致回滚的前一阶段执行失败的原因。</p>
         * 
         * <strong>example:</strong>
         * <p>Resource UPDATE failed: Exception: resources.FailToCreate: FailToCreate: reason</p>
         */
        public Builder rollbackFailedRootReason(String rollbackFailedRootReason) {
            this.rollbackFailedRootReason = rollbackFailedRootReason;
            return this;
        }

        /**
         * <p>The ID of the root stack. This parameter is returned if the specified stack is a nested stack.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf692****</p>
         */
        public Builder rootStackId(String rootStackId) {
            this.rootStackId = rootStackId;
            return this;
        }

        /**
         * <p>Indicates whether the stack is a managed stack. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * <p>The name of the service to which the managed stack belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>ACVS</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The state of the stack on which the most recent successful drift detection was performed. Valid values:</p>
         * <ul>
         * <li>DRIFTED: The stack has drifted.</li>
         * <li>NOT_CHECKED: No successful drift detection is performed on the stack.</li>
         * <li>IN_SYNC: The stack is being synchronized.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN_SYNC</p>
         */
        public Builder stackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }

        /**
         * <p>The stack ID.</p>
         * 
         * <strong>example:</strong>
         * <p>c754d2a4-28f1-46df-b557-9586173a****</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>The stack name.<br>The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (_). The name must start with a digit or letter.</p>
         * 
         * <strong>example:</strong>
         * <p>MyStack</p>
         */
        public Builder stackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * <p>The stack type. Valid values:</p>
         * <ul>
         * <li>ROS: ROS stack. The stack is created by using a ROS template.</li>
         * <li>Terraform: Terraform stack. The stack is created by using a Terraform template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ROS</p>
         */
        public Builder stackType(String stackType) {
            this.stackType = stackType;
            return this;
        }

        /**
         * <p>The state of the stack. Valid values:</p>
         * <ul>
         * <li>CREATE_IN_PROGRESS: The stack is being created.</li>
         * <li>CREATE_FAILED: The stack failed to be created.</li>
         * <li>CREATE_COMPLETE: The stack is created.</li>
         * <li>UPDATE_IN_PROGRESS: The stack is being updated.</li>
         * <li>UPDATE_FAILED: The stack failed to be updated.</li>
         * <li>UPDATE_COMPLETE: The stack is updated.</li>
         * <li>DELETE_IN_PROGRESS: The stack is being deleted.</li>
         * <li>DELETE_FAILED: The stack failed to be deleted.</li>
         * <li>CREATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack failed to be created.</li>
         * <li>CREATE_ROLLBACK_FAILED: The resources failed to be rolled back after the stack failed to be created.</li>
         * <li>CREATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack failed to be created.</li>
         * <li>ROLLBACK_IN_PROGRESS: The resources of the stack are being rolled back.</li>
         * <li>ROLLBACK_FAILED: The resources of the stack failed to be rolled back.</li>
         * <li>ROLLBACK_COMPLETE: The resources of the stack are rolled back.</li>
         * <li>CHECK_IN_PROGRESS: The stack is being validated.</li>
         * <li>CHECK_FAILED: The stack failed to be validated.</li>
         * <li>CHECK_COMPLETE: The stack is validated.</li>
         * <li>REVIEW_IN_PROGRESS: The stack is being reviewed.</li>
         * <li>IMPORT_CREATE_IN_PROGRESS: The stack is being created by using imported resources.</li>
         * <li>IMPORT_CREATE_FAILED: The stack failed to be created by using imported resources.</li>
         * <li>IMPORT_CREATE_COMPLETE: The stack is created by using imported resources.</li>
         * <li>IMPORT_CREATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack failed to be created by using imported resources.</li>
         * <li>IMPORT_CREATE_ROLLBACK_FAILED: The resources failed to be rolled back after the stack failed to be created by using imported resources.</li>
         * <li>IMPORT_CREATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack failed to be created by using imported resources.</li>
         * <li>IMPORT_UPDATE_IN_PROGRESS: The stack is being updated by using imported resources.</li>
         * <li>IMPORT_UPDATE_FAILED: The stack failed to be updated by using imported resources.</li>
         * <li>IMPORT_UPDATE_COMPLETE: The stack is updated by using imported resources.</li>
         * <li>IMPORT_UPDATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack failed to be updated by using imported resources.</li>
         * <li>IMPORT_UPDATE_ROLLBACK_FAILED: The resources failed to be rolled back after the stack failed to be updated by using imported resources.</li>
         * <li>IMPORT_UPDATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack failed to be updated by using imported resources.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPLETE</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The reason why the stack is in its current state.</p>
         * 
         * <strong>example:</strong>
         * <p>Stack CREATE completed successfully</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>The tags of the stack.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The description of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Create a VPC.</p>
         */
        public Builder templateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }

        /**
         * <p>The template ID. This parameter is returned only if the current stack template is a custom template or shared template.</p>
         * <p>If the template is a shared template, the value of this parameter is the same as the value of TemplateARN.</p>
         * 
         * <strong>example:</strong>
         * <p>a52f81be-496f-4e1c-a286-8852ab54****</p>
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The ID of the resource scenario. This parameter is returned only if the current template of the stack is generated from a resource scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>ts-7f7a704cf71c49a6****</p>
         */
        public Builder templateScratchId(String templateScratchId) {
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * <p>The URL of the file that contains the template body. This parameter is returned only if the current template of the stack is from a URL. The URL can point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://ros/template/demo</p>
         */
        public Builder templateURL(String templateURL) {
            this.templateURL = templateURL;
            return this;
        }

        /**
         * <p>The version of the template. This parameter is returned only if the current stack template is a custom template or shared template.</p>
         * <p>If the template is a shared template, this parameter is returned only if VersionOption is set to AllVersions.</p>
         * <p>Valid values: v1 to v100.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * <p>The timeout period for creating the stack. Unit: minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        /**
         * <p>The time when the stack was updated. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-09-17T08:21:40</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetStackResponseBody build() {
            return new GetStackResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class Logs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Keys")
        private java.util.List<String> keys;

        private Logs(Builder builder) {
            this.content = builder.content;
            this.keys = builder.keys;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Logs create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return keys
         */
        public java.util.List<String> getKeys() {
            return this.keys;
        }

        public static final class Builder {
            private String content; 
            private java.util.List<String> keys; 

            private Builder() {
            } 

            private Builder(Logs model) {
                this.content = model.content;
                this.keys = model.keys;
            } 

            /**
             * <p>The content of a resource log.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The keywords of a resource log.</p>
             */
            public Builder keys(java.util.List<String> keys) {
                this.keys = keys;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class ResourceLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Logs")
        private java.util.List<Logs> logs;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        private ResourceLogs(Builder builder) {
            this.logs = builder.logs;
            this.resourceName = builder.resourceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceLogs create() {
            return builder().build();
        }

        /**
         * @return logs
         */
        public java.util.List<Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        public static final class Builder {
            private java.util.List<Logs> logs; 
            private String resourceName; 

            private Builder() {
            } 

            private Builder(ResourceLogs model) {
                this.logs = model.logs;
                this.resourceName = model.resourceName;
            } 

            /**
             * <p>All the logs that are associated with the resources.</p>
             */
            public Builder logs(java.util.List<Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * <p>The name of the resource that is defined in the template.</p>
             * 
             * <strong>example:</strong>
             * <p>MyResourceCleaner</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            public ResourceLogs build() {
                return new ResourceLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class TerraformLogs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Stream")
        private String stream;

        private TerraformLogs(Builder builder) {
            this.command = builder.command;
            this.content = builder.content;
            this.stream = builder.stream;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TerraformLogs create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return stream
         */
        public String getStream() {
            return this.stream;
        }

        public static final class Builder {
            private String command; 
            private String content; 
            private String stream; 

            private Builder() {
            } 

            private Builder(TerraformLogs model) {
                this.command = model.command;
                this.content = model.content;
                this.stream = model.stream;
            } 

            /**
             * <p>The name of the Terraform command that is run. Valid values:</p>
             * <ul>
             * <li>apply</li>
             * <li>plan</li>
             * <li>destroy</li>
             * <li>version</li>
             * </ul>
             * <p>For more information about Terraform commands, see <a href="https://www.terraform.io/cli/commands">Basic CLI Features</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>apply</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>The content of the output stream that is returned after the command is run.</p>
             * 
             * <strong>example:</strong>
             * <p>Apply complete! Resources: 42 added, 0 changed, 0 destroyed.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The output stream. Valid values:</p>
             * <ul>
             * <li>stdout: standard output stream</li>
             * <li>stderr: standard error stream</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>stdout</p>
             */
            public Builder stream(String stream) {
                this.stream = stream;
                return this;
            }

            public TerraformLogs build() {
                return new TerraformLogs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class Log extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceLogs")
        private java.util.List<ResourceLogs> resourceLogs;

        @com.aliyun.core.annotation.NameInMap("TerraformLogs")
        private java.util.List<TerraformLogs> terraformLogs;

        private Log(Builder builder) {
            this.resourceLogs = builder.resourceLogs;
            this.terraformLogs = builder.terraformLogs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return resourceLogs
         */
        public java.util.List<ResourceLogs> getResourceLogs() {
            return this.resourceLogs;
        }

        /**
         * @return terraformLogs
         */
        public java.util.List<TerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

        public static final class Builder {
            private java.util.List<ResourceLogs> resourceLogs; 
            private java.util.List<TerraformLogs> terraformLogs; 

            private Builder() {
            } 

            private Builder(Log model) {
                this.resourceLogs = model.resourceLogs;
                this.terraformLogs = model.terraformLogs;
            } 

            /**
             * <p>The logs of resources in the stack. This parameter is returned if LogOption is set to Resource or All.</p>
             * <blockquote>
             * <p> The logs are returned only for resources of specific types, such as the <code>ALIYUN::ROS::ResourceCleaner</code> type.</p>
             * </blockquote>
             */
            public Builder resourceLogs(java.util.List<ResourceLogs> resourceLogs) {
                this.resourceLogs = resourceLogs;
                return this;
            }

            /**
             * <p>The logs generated when the Terraform stack is run. This parameter is returned only for a Terraform stack. This parameter is returned if LogOption is left empty or set to Stack or All.</p>
             * <blockquote>
             * <p> This parameter is not returned for a running stack. The logs are generated from the most recent operation on the stack, such as the creation, resumed creation, update, or deletion operation.</p>
             * </blockquote>
             */
            public Builder terraformLogs(java.util.List<TerraformLogs> terraformLogs) {
                this.terraformLogs = terraformLogs;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class OperationInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("LogicalResourceId")
        private String logicalResourceId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RequestId")
        private String requestId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
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

            private Builder() {
            } 

            private Builder(OperationInfo model) {
                this.action = model.action;
                this.code = model.code;
                this.logicalResourceId = model.logicalResourceId;
                this.message = model.message;
                this.requestId = model.requestId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The name of the API operation that belongs to another Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>DeleteSecurityGroup</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The error code.</p>
             * 
             * <strong>example:</strong>
             * <p>DependencyViolation</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The logical ID of the resource on which the operation error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>EcsSecurityGroup</p>
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>There is still instance(s) in the specified security group.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The ID of the request that is initiated to call the API operation of another Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>071D6166-3F6B-5C7B-A1F0-0113FBB643A8</p>
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * <p>The type of the resource on which the operation error occurs.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ECS::SecurityGroup</p>
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
    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameterKey = model.parameterKey;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::Region</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class InProgressResourceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProgressTargetValue")
        private Float progressTargetValue;

        @com.aliyun.core.annotation.NameInMap("ProgressValue")
        private Float progressValue;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private InProgressResourceDetails(Builder builder) {
            this.progressTargetValue = builder.progressTargetValue;
            this.progressValue = builder.progressValue;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InProgressResourceDetails create() {
            return builder().build();
        }

        /**
         * @return progressTargetValue
         */
        public Float getProgressTargetValue() {
            return this.progressTargetValue;
        }

        /**
         * @return progressValue
         */
        public Float getProgressValue() {
            return this.progressValue;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private Float progressTargetValue; 
            private Float progressValue; 
            private String resourceName; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(InProgressResourceDetails model) {
                this.progressTargetValue = model.progressTargetValue;
                this.progressValue = model.progressValue;
                this.resourceName = model.resourceName;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The desired progress value of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder progressTargetValue(Float progressTargetValue) {
                this.progressTargetValue = progressTargetValue;
                return this;
            }

            /**
             * <p>The current progress value of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder progressValue(Float progressValue) {
                this.progressValue = progressValue;
                return this;
            }

            /**
             * <p>The resource name.</p>
             * 
             * <strong>example:</strong>
             * <p>WaitCondition</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN::ROS::WaitCondition</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public InProgressResourceDetails build() {
                return new InProgressResourceDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
     */
    public static class ResourceProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedResourceCount")
        private Integer failedResourceCount;

        @com.aliyun.core.annotation.NameInMap("InProgressResourceCount")
        private Integer inProgressResourceCount;

        @com.aliyun.core.annotation.NameInMap("InProgressResourceDetails")
        private java.util.List<InProgressResourceDetails> inProgressResourceDetails;

        @com.aliyun.core.annotation.NameInMap("PendingResourceCount")
        private Integer pendingResourceCount;

        @com.aliyun.core.annotation.NameInMap("StackActionProgress")
        private Float stackActionProgress;

        @com.aliyun.core.annotation.NameInMap("StackOperationProgress")
        private Float stackOperationProgress;

        @com.aliyun.core.annotation.NameInMap("SuccessResourceCount")
        private Integer successResourceCount;

        @com.aliyun.core.annotation.NameInMap("TotalResourceCount")
        private Integer totalResourceCount;

        private ResourceProgress(Builder builder) {
            this.failedResourceCount = builder.failedResourceCount;
            this.inProgressResourceCount = builder.inProgressResourceCount;
            this.inProgressResourceDetails = builder.inProgressResourceDetails;
            this.pendingResourceCount = builder.pendingResourceCount;
            this.stackActionProgress = builder.stackActionProgress;
            this.stackOperationProgress = builder.stackOperationProgress;
            this.successResourceCount = builder.successResourceCount;
            this.totalResourceCount = builder.totalResourceCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceProgress create() {
            return builder().build();
        }

        /**
         * @return failedResourceCount
         */
        public Integer getFailedResourceCount() {
            return this.failedResourceCount;
        }

        /**
         * @return inProgressResourceCount
         */
        public Integer getInProgressResourceCount() {
            return this.inProgressResourceCount;
        }

        /**
         * @return inProgressResourceDetails
         */
        public java.util.List<InProgressResourceDetails> getInProgressResourceDetails() {
            return this.inProgressResourceDetails;
        }

        /**
         * @return pendingResourceCount
         */
        public Integer getPendingResourceCount() {
            return this.pendingResourceCount;
        }

        /**
         * @return stackActionProgress
         */
        public Float getStackActionProgress() {
            return this.stackActionProgress;
        }

        /**
         * @return stackOperationProgress
         */
        public Float getStackOperationProgress() {
            return this.stackOperationProgress;
        }

        /**
         * @return successResourceCount
         */
        public Integer getSuccessResourceCount() {
            return this.successResourceCount;
        }

        /**
         * @return totalResourceCount
         */
        public Integer getTotalResourceCount() {
            return this.totalResourceCount;
        }

        public static final class Builder {
            private Integer failedResourceCount; 
            private Integer inProgressResourceCount; 
            private java.util.List<InProgressResourceDetails> inProgressResourceDetails; 
            private Integer pendingResourceCount; 
            private Float stackActionProgress; 
            private Float stackOperationProgress; 
            private Integer successResourceCount; 
            private Integer totalResourceCount; 

            private Builder() {
            } 

            private Builder(ResourceProgress model) {
                this.failedResourceCount = model.failedResourceCount;
                this.inProgressResourceCount = model.inProgressResourceCount;
                this.inProgressResourceDetails = model.inProgressResourceDetails;
                this.pendingResourceCount = model.pendingResourceCount;
                this.stackActionProgress = model.stackActionProgress;
                this.stackOperationProgress = model.stackOperationProgress;
                this.successResourceCount = model.successResourceCount;
                this.totalResourceCount = model.totalResourceCount;
            } 

            /**
             * <p>The number of resources that failed to be created.</p>
             * <blockquote>
             * <p> This parameter is returned only if <code>ShowResourceProgress</code> is set to <code>EnabledIfCreateStack</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder failedResourceCount(Integer failedResourceCount) {
                this.failedResourceCount = failedResourceCount;
                return this;
            }

            /**
             * <p>The number of resources that are being created.</p>
             * <blockquote>
             * <p> This parameter is returned only if <code>ShowResourceProgress</code> is set to <code>EnabledIfCreateStack</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder inProgressResourceCount(Integer inProgressResourceCount) {
                this.inProgressResourceCount = inProgressResourceCount;
                return this;
            }

            /**
             * <p>The progress details of resources that are being created.</p>
             * <blockquote>
             * <p> This parameter is returned only if <code>ShowResourceProgress</code> is set to <code>EnabledIfCreateStack</code>.</p>
             * </blockquote>
             */
            public Builder inProgressResourceDetails(java.util.List<InProgressResourceDetails> inProgressResourceDetails) {
                this.inProgressResourceDetails = inProgressResourceDetails;
                return this;
            }

            /**
             * <p>The number of resources to be created.</p>
             * <blockquote>
             * <p> This parameter is returned only if <code>ShowResourceProgress</code> is set to <code>EnabledIfCreateStack</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder pendingResourceCount(Integer pendingResourceCount) {
                this.pendingResourceCount = pendingResourceCount;
                return this;
            }

            /**
             * <p>The creation or rollback progress of the stack, in percentage. Valid values: 0 to 100.</p>
             * <p>The value progressively increases from 0 to 100 during a stack creation operation. If the stack is created, the value reaches 100. If the stack fails to be created, a rollback is started for the stack resources, and the value progressively increases from the percentage of the remaining progress (100 - Progress value generated when the stack fails to be created). The value increases to 100 when the stack resources are rolled back. This parameter indicates the creation progress during a stack creation operation and indicates the rollback progress during a stack rollback operation.</p>
             * <blockquote>
             * <p> This parameter is returned only if <code>ShowResourceProgress</code> is set to <code>PercentageOnly</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder stackActionProgress(Float stackActionProgress) {
                this.stackActionProgress = stackActionProgress;
                return this;
            }

            /**
             * <p>The overall creation progress of the stack, in percentage. Valid values: 0 to 100.</p>
             * <p>The value progressively increases from 0 to 100 during a stack creation operation. If the stack is created, the value reaches 100. If the stack fails to be created, a rollback is started for the stack resources, and the value progressively decreases. The value decreases to 0 when the stack resources are rolled back. This parameter indicates only the overall creation progress, regardless of whether during a stack creation or rollback operation.</p>
             * <blockquote>
             * <p> This parameter is returned only if <code>ShowResourceProgress</code> is set to <code>PercentageOnly</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder stackOperationProgress(Float stackOperationProgress) {
                this.stackOperationProgress = stackOperationProgress;
                return this;
            }

            /**
             * <p>The number of resources that are created.</p>
             * <blockquote>
             * <p> This parameter is returned only if <code>ShowResourceProgress</code> is set to <code>EnabledIfCreateStack</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successResourceCount(Integer successResourceCount) {
                this.successResourceCount = successResourceCount;
                return this;
            }

            /**
             * <p>The total number of resources.</p>
             * <blockquote>
             * <p> This parameter is returned only if <code>ShowResourceProgress</code> is set to <code>EnabledIfCreateStack</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalResourceCount(Integer totalResourceCount) {
                this.totalResourceCount = totalResourceCount;
                return this;
            }

            public ResourceProgress build() {
                return new ResourceProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetStackResponseBody} extends {@link TeaModel}
     *
     * <p>GetStackResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>usage</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the stack.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
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
}
