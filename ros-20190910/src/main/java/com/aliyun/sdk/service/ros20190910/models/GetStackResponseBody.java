// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackResponseBody} extends {@link TeaModel}
 *
 * <p>GetStackResponseBody</p>
 */
public class GetStackResponseBody extends TeaModel {
    @NameInMap("CheckedStackResourceCount")
    private Integer checkedStackResourceCount;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("DeletionProtection")
    private String deletionProtection;

    @NameInMap("Description")
    private String description;

    @NameInMap("DisableRollback")
    private Boolean disableRollback;

    @NameInMap("DriftDetectionTime")
    private String driftDetectionTime;

    @NameInMap("Interface")
    private String _interface;

    @NameInMap("Log")
    private Log log;

    @NameInMap("NotCheckedStackResourceCount")
    private Integer notCheckedStackResourceCount;

    @NameInMap("NotificationURLs")
    private java.util.List < String > notificationURLs;

    @NameInMap("OperationInfo")
    private OperationInfo operationInfo;

    @NameInMap("OrderIds")
    private java.util.List < String > orderIds;

    @NameInMap("Outputs")
    private java.util.List < java.util.Map<String, ?>> outputs;

    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @NameInMap("ParentStackId")
    private String parentStackId;

    @NameInMap("RamRoleName")
    private String ramRoleName;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ResourceProgress")
    private ResourceProgress resourceProgress;

    @NameInMap("RootStackId")
    private String rootStackId;

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

    @NameInMap("TemplateDescription")
    private String templateDescription;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("TemplateScratchId")
    private String templateScratchId;

    @NameInMap("TemplateURL")
    private String templateURL;

    @NameInMap("TemplateVersion")
    private String templateVersion;

    @NameInMap("TimeoutInMinutes")
    private Integer timeoutInMinutes;

    @NameInMap("UpdateTime")
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
    public java.util.List < String > getNotificationURLs() {
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
    public java.util.List < String > getOrderIds() {
        return this.orderIds;
    }

    /**
     * @return outputs
     */
    public java.util.List < java.util.Map<String, ?>> getOutputs() {
        return this.outputs;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
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
    public java.util.List < Tags> getTags() {
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
        private java.util.List < String > notificationURLs; 
        private OperationInfo operationInfo; 
        private java.util.List < String > orderIds; 
        private java.util.List < java.util.Map<String, ?>> outputs; 
        private java.util.List < Parameters> parameters; 
        private String parentStackId; 
        private String ramRoleName; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private ResourceProgress resourceProgress; 
        private String rootStackId; 
        private Boolean serviceManaged; 
        private String serviceName; 
        private String stackDriftStatus; 
        private String stackId; 
        private String stackName; 
        private String stackType; 
        private String status; 
        private String statusReason; 
        private java.util.List < Tags> tags; 
        private String templateDescription; 
        private String templateId; 
        private String templateScratchId; 
        private String templateURL; 
        private String templateVersion; 
        private Integer timeoutInMinutes; 
        private String updateTime; 

        /**
         * The number of resources on which drift detection is performed.
         * <p>
         * 
         * >  This parameter is returned only if the drift detection on the stack is successful.
         */
        public Builder checkedStackResourceCount(Integer checkedStackResourceCount) {
            this.checkedStackResourceCount = checkedStackResourceCount;
            return this;
        }

        /**
         * The time when the stack was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ss format. The time is displayed in UTC.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Indicates whether deletion protection is enabled for the stack. Valid values:
         * <p>
         * 
         * *   Enabled: Deletion protection is enabled for the stack.
         * *   Disabled: Deletion protection is disabled for the stack. You can delete the stack in the Resource Orchestration Service (ROS) console or by calling the DeleteStack operation.
         * 
         * >  Deletion protection of a nested stack works in the same way as that of the root stack.
         */
        public Builder deletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * The description of the stack.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Indicates whether rollback is disabled when the stack fails to be created. Valid values:
         * <p>
         * 
         * *   true: Rollback is disabled when the stack fails to be created.
         * *   false: Rollback is enabled when the stack fails to be created. This is the default value.
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * The time when the last successful drift detection operation was performed.
         */
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }

        /**
         * The description of the web UI in the ROS console.
         */
        public Builder _interface(String _interface) {
            this._interface = _interface;
            return this;
        }

        /**
         * The logs of the stack.
         */
        public Builder log(Log log) {
            this.log = log;
            return this;
        }

        /**
         * The number of resources on which drift detection is not performed.
         * <p>
         * 
         * >  This parameter is returned only if the drift detection on the stack is successful.
         */
        public Builder notCheckedStackResourceCount(Integer notCheckedStackResourceCount) {
            this.notCheckedStackResourceCount = notCheckedStackResourceCount;
            return this;
        }

        /**
         * The callback URLs that are used to receive stack events.
         */
        public Builder notificationURLs(java.util.List < String > notificationURLs) {
            this.notificationURLs = notificationURLs;
            return this;
        }

        /**
         * The additional information that is displayed when an error occurs on a stack operation. 
         * <p>
         * 
         * >  This property is returned in specific conditions. At least one sub-property is returned. For example, an error is reported when you call the API of another cloud service.
         */
        public Builder operationInfo(OperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }

        /**
         * OrderIds.
         */
        public Builder orderIds(java.util.List < String > orderIds) {
            this.orderIds = orderIds;
            return this;
        }

        /**
         * The output parameters of the stack.
         * <p>
         * 
         * >  This parameter is returned if the OutputOption parameter is set to Enabled.
         */
        public Builder outputs(java.util.List < java.util.Map<String, ?>> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * The parameters of the stack.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
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
         * The name of the RAM role. ROS assumes the RAM role to create the stack and uses credentials of the role to call the APIs of Alibaba Cloud services.
         * <p>
         * 
         * ROS assumes the RAM role to perform operations on the stack. If you have permissions to perform operations on the stack but do not have permissions to use the RAM role, ROS still assumes the RAM role. You must make sure that the least privileges are granted to the role.
         * 
         * If you do not specify this parameter, ROS assumes an existing role that is associated with the stack. If no roles are available for ROS to assume, ROS uses a temporary credential that is generated from the credentials of your account.
         * 
         * The name of the RAM role can be up to 64 bytes in length.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * The ID of the region in which the stack is deployed. You can call the [DescribeRegions](~~131035~~) operation to query the most recent list of Alibaba Cloud regions.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group to which the instances belong.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The creation progress of resources.
         */
        public Builder resourceProgress(ResourceProgress resourceProgress) {
            this.resourceProgress = resourceProgress;
            return this;
        }

        /**
         * The ID of the root stack. This parameter is returned if the specified stack is a nested stack.
         */
        public Builder rootStackId(String rootStackId) {
            this.rootStackId = rootStackId;
            return this;
        }

        /**
         * Indicates whether the stack is a managed stack. Valid values: 
         * <p>
         * 
         * - true
         * - false
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
         * The status of the stack in the last successful drift detection. Valid values:
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
         * The ID of the stack.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * The name of the stack.
         * <p>
         * 
         * The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). It must start with a digit or letter.
         */
        public Builder stackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * The type of the stack. Valid values:
         * <p>
         * 
         * *   ROS: The ROS stack, which is created by using an ROS template.
         * *   Terraform: The Terraform stack, which is created by using a Terraform template.
         */
        public Builder stackType(String stackType) {
            this.stackType = stackType;
            return this;
        }

        /**
         * The state of the stack. Valid values:
         * <p>
         * 
         * *   CREATE_IN_PROGRESS: The stack is being created.
         * *   CREATE_FAILED: The stack fails to be created.
         * *   CREATE_COMPLETE: The stack is created.
         * *   UPDATE_IN_PROGRESS: The stack is being updated.
         * *   UPDATE_FAILED: The stack fails to be updated.
         * *   UPDATE_COMPLETE: The stack is updated.
         * *   DELETE_IN_PROGRESS: The stack is being deleted.
         * *   DELETE_FAILED: The stack fails to be deleted.
         * *   CREATE_ROLLBACK_IN_PROGRESS: The stack is being rolled back after the stack fails to be created.
         * *   CREATE_ROLLBACK_FAILED: The stack fails to be rolled back after the stack fails to be created.
         * *   CREATE_ROLLBACK_COMPLETE: The stack is rolled back after the stack fails to be created.
         * *   ROLLBACK_IN_PROGRESS: The resources in the stack are being rolled back.
         * *   ROLLBACK_FAILED: The resources in the stack fail to be rolled back.
         * *   ROLLBACK_COMPLETE: The resources in the stack are rolled back.
         * *   CHECK_IN_PROGRESS: The stack is being validated.
         * *   CHECK_FAILED: The stack fails to be validated.
         * *   CHECK_COMPLETE: The stack is validated.
         * *   REVIEW_IN_PROGRESS: The stack is being reviewed.
         * *   IMPORT_CREATE_IN_PROGRESS: The stack is being created by using imported resources.
         * *   IMPORT_CREATE_FAILED: The stack fails to be created by using imported resources.
         * *   IMPORT_CREATE_COMPLETE: The stack is created by using imported resources.
         * *   IMPORT_CREATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack fails to be created by using imported resources.
         * *   IMPORT_CREATE_ROLLBACK_FAILED: The resources fail to be rolled back after the stack fails to be created by using imported resources.
         * *   IMPORT_CREATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack fails to be created by using imported resources.
         * *   IMPORT_UPDATE_IN_PROGRESS: The stack is being updated by using imported resources.
         * *   IMPORT_UPDATE_FAILED: The stack fails to be updated by using imported resources.
         * *   IMPORT_UPDATE_COMPLETE: The stack is updated by using imported resources.
         * *   IMPORT_UPDATE_ROLLBACK_IN_PROGRESS: The resources are being rolled back after the stack fails to be updated by using imported resources.
         * *   IMPORT_UPDATE_ROLLBACK_FAILED: The resources fail to be rolled back after the stack fails to be updated by using imported resources.
         * *   IMPORT_UPDATE_ROLLBACK_COMPLETE: The resources are rolled back after the stack fails to be updated by using imported resources.
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
         * The description of the template.
         */
        public Builder templateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }

        /**
         * The ID of the template. This parameter is returned only if the current template of the stack is a custom template or a shared template.  
         * <p>
         * 
         * If the template is a shared template, the value of this parameter is the same as the value of the TemplateARN parameter.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * The ID of the scenario. This parameter is returned only if the current template of the stack is generated from a scenario.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * The URL of the file that contains the template body. This parameter is returned only if the current template of the stack is from a URL. The URL can point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket.
         */
        public Builder templateURL(String templateURL) {
            this.templateURL = templateURL;
            return this;
        }

        /**
         * The version of the template. This parameter is returned only if the current template of the stack is a custom template or a shared template.  
         * <p>
         * 
         * If the template is a shared template, this parameter is returned only when the VersionOption parameter is set to AllVersions.  
         * 
         * Valid values: v1 to v100.
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * The timeout period within which the stack can be created. Unit: minutes.
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

        public GetStackResponseBody build() {
            return new GetStackResponseBody(this);
        } 

    } 

    public static class Logs extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Keys")
        private java.util.List < String > keys;

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
        public java.util.List < String > getKeys() {
            return this.keys;
        }

        public static final class Builder {
            private String content; 
            private java.util.List < String > keys; 

            /**
             * The content of a resource log.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The keywords of a resource log.
             */
            public Builder keys(java.util.List < String > keys) {
                this.keys = keys;
                return this;
            }

            public Logs build() {
                return new Logs(this);
            } 

        } 

    }
    public static class ResourceLogs extends TeaModel {
        @NameInMap("Logs")
        private java.util.List < Logs> logs;

        @NameInMap("ResourceName")
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
        public java.util.List < Logs> getLogs() {
            return this.logs;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        public static final class Builder {
            private java.util.List < Logs> logs; 
            private String resourceName; 

            /**
             * The logs of all resources.
             */
            public Builder logs(java.util.List < Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * The name of the resource that is defined in the template.
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
    public static class TerraformLogs extends TeaModel {
        @NameInMap("Command")
        private String command;

        @NameInMap("Content")
        private String content;

        @NameInMap("Stream")
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

            /**
             * The name of the Terraform command that is run. Valid values:
             * <p>
             * 
             * *   apply
             * *   plan
             * *   destroy
             * *   version
             * 
             * For more information about Terraform commands, see [Basic CLI Features](https://www.terraform.io/cli/commands).
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The content of the output stream that is returned after the command is run.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * The output stream. Valid values:
             * <p>
             * 
             * *   stdout: standard output stream
             * *   stderr: standard error stream
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
    public static class Log extends TeaModel {
        @NameInMap("ResourceLogs")
        private java.util.List < ResourceLogs> resourceLogs;

        @NameInMap("TerraformLogs")
        private java.util.List < TerraformLogs> terraformLogs;

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
        public java.util.List < ResourceLogs> getResourceLogs() {
            return this.resourceLogs;
        }

        /**
         * @return terraformLogs
         */
        public java.util.List < TerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

        public static final class Builder {
            private java.util.List < ResourceLogs> resourceLogs; 
            private java.util.List < TerraformLogs> terraformLogs; 

            /**
             * The logs of resources in the stack. This parameter is returned if the LogOption parameter is set to Resource or All.  
             * <p>
             * 
             * >  The logs are returned for resources of specific types, such as `ALIYUN::ROS::ResourceCleaner`.
             */
            public Builder resourceLogs(java.util.List < ResourceLogs> resourceLogs) {
                this.resourceLogs = resourceLogs;
                return this;
            }

            /**
             * The logs of the Terraform stack. This parameter is returned only for a Terraform stack. 
             * <p>
             * 
             * This parameter is returned if the LogOption parameter is left empty or set to Stack or All.  
             * 
             * >  This parameter is not returned for a running stack. The logs are generated from the last creation, re-creation, update, or deletion operation on the stack.
             */
            public Builder terraformLogs(java.util.List < TerraformLogs> terraformLogs) {
                this.terraformLogs = terraformLogs;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

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
             * The name of the API of another cloud service.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The error code returned.
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
             * The error message returned.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the request to call the API of another cloud service.
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
             * The name of the parameter.
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
    public static class InProgressResourceDetails extends TeaModel {
        @NameInMap("ProgressTargetValue")
        private Float progressTargetValue;

        @NameInMap("ProgressValue")
        private Float progressValue;

        @NameInMap("ResourceName")
        private String resourceName;

        @NameInMap("ResourceType")
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

            /**
             * The desired progress value of the resource.
             */
            public Builder progressTargetValue(Float progressTargetValue) {
                this.progressTargetValue = progressTargetValue;
                return this;
            }

            /**
             * The current progress value of the resource.
             */
            public Builder progressValue(Float progressValue) {
                this.progressValue = progressValue;
                return this;
            }

            /**
             * The resource name.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * The resource type.
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
    public static class ResourceProgress extends TeaModel {
        @NameInMap("FailedResourceCount")
        private Integer failedResourceCount;

        @NameInMap("InProgressResourceCount")
        private Integer inProgressResourceCount;

        @NameInMap("InProgressResourceDetails")
        private java.util.List < InProgressResourceDetails> inProgressResourceDetails;

        @NameInMap("PendingResourceCount")
        private Integer pendingResourceCount;

        @NameInMap("StackActionProgress")
        private Float stackActionProgress;

        @NameInMap("StackOperationProgress")
        private Float stackOperationProgress;

        @NameInMap("SuccessResourceCount")
        private Integer successResourceCount;

        @NameInMap("TotalResourceCount")
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
        public java.util.List < InProgressResourceDetails> getInProgressResourceDetails() {
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
            private java.util.List < InProgressResourceDetails> inProgressResourceDetails; 
            private Integer pendingResourceCount; 
            private Float stackActionProgress; 
            private Float stackOperationProgress; 
            private Integer successResourceCount; 
            private Integer totalResourceCount; 

            /**
             * The number of resources that fail to be created.
             */
            public Builder failedResourceCount(Integer failedResourceCount) {
                this.failedResourceCount = failedResourceCount;
                return this;
            }

            /**
             * The number of resources that are being created.
             */
            public Builder inProgressResourceCount(Integer inProgressResourceCount) {
                this.inProgressResourceCount = inProgressResourceCount;
                return this;
            }

            /**
             * The progress details of resources that are being created.
             */
            public Builder inProgressResourceDetails(java.util.List < InProgressResourceDetails> inProgressResourceDetails) {
                this.inProgressResourceDetails = inProgressResourceDetails;
                return this;
            }

            /**
             * The number of resources to be created.
             */
            public Builder pendingResourceCount(Integer pendingResourceCount) {
                this.pendingResourceCount = pendingResourceCount;
                return this;
            }

            /**
             * StackActionProgress.
             */
            public Builder stackActionProgress(Float stackActionProgress) {
                this.stackActionProgress = stackActionProgress;
                return this;
            }

            /**
             * StackOperationProgress.
             */
            public Builder stackOperationProgress(Float stackOperationProgress) {
                this.stackOperationProgress = stackOperationProgress;
                return this;
            }

            /**
             * The number of resources that are created.
             */
            public Builder successResourceCount(Integer successResourceCount) {
                this.successResourceCount = successResourceCount;
                return this;
            }

            /**
             * The total number of resources.
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
             * The tag key of the stack.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the stack.
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
