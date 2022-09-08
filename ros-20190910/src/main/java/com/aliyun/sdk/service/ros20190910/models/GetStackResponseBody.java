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

    @NameInMap("NotificationURLs")
    private java.util.List < String > notificationURLs;

    @NameInMap("OperationInfo")
    private OperationInfo operationInfo;

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
        this.createTime = builder.createTime;
        this.deletionProtection = builder.deletionProtection;
        this.description = builder.description;
        this.disableRollback = builder.disableRollback;
        this.driftDetectionTime = builder.driftDetectionTime;
        this._interface = builder._interface;
        this.log = builder.log;
        this.notificationURLs = builder.notificationURLs;
        this.operationInfo = builder.operationInfo;
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
        private String createTime; 
        private String deletionProtection; 
        private String description; 
        private Boolean disableRollback; 
        private String driftDetectionTime; 
        private String _interface; 
        private Log log; 
        private java.util.List < String > notificationURLs; 
        private OperationInfo operationInfo; 
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
         * CreateTime.
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
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DisableRollback.
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
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
         * Interface.
         */
        public Builder _interface(String _interface) {
            this._interface = _interface;
            return this;
        }

        /**
         * Log.
         */
        public Builder log(Log log) {
            this.log = log;
            return this;
        }

        /**
         * NotificationURLs.
         */
        public Builder notificationURLs(java.util.List < String > notificationURLs) {
            this.notificationURLs = notificationURLs;
            return this;
        }

        /**
         * OperationInfo.
         */
        public Builder operationInfo(OperationInfo operationInfo) {
            this.operationInfo = operationInfo;
            return this;
        }

        /**
         * Outputs.
         */
        public Builder outputs(java.util.List < java.util.Map<String, ?>> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * ParentStackId.
         */
        public Builder parentStackId(String parentStackId) {
            this.parentStackId = parentStackId;
            return this;
        }

        /**
         * RamRoleName.
         */
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ResourceProgress.
         */
        public Builder resourceProgress(ResourceProgress resourceProgress) {
            this.resourceProgress = resourceProgress;
            return this;
        }

        /**
         * RootStackId.
         */
        public Builder rootStackId(String rootStackId) {
            this.rootStackId = rootStackId;
            return this;
        }

        /**
         * ServiceManaged.
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * StackDriftStatus.
         */
        public Builder stackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }

        /**
         * StackId.
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * StackName.
         */
        public Builder stackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * StackType.
         */
        public Builder stackType(String stackType) {
            this.stackType = stackType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StatusReason.
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TemplateDescription.
         */
        public Builder templateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateScratchId.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * TemplateURL.
         */
        public Builder templateURL(String templateURL) {
            this.templateURL = templateURL;
            return this;
        }

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * TimeoutInMinutes.
         */
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        /**
         * UpdateTime.
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
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Keys.
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
             * Logs.
             */
            public Builder logs(java.util.List < Logs> logs) {
                this.logs = logs;
                return this;
            }

            /**
             * ResourceName.
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
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Stream.
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
             * ResourceLogs.
             */
            public Builder resourceLogs(java.util.List < ResourceLogs> resourceLogs) {
                this.resourceLogs = resourceLogs;
                return this;
            }

            /**
             * TerraformLogs.
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
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * LogicalResourceId.
             */
            public Builder logicalResourceId(String logicalResourceId) {
                this.logicalResourceId = logicalResourceId;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RequestId.
             */
            public Builder requestId(String requestId) {
                this.requestId = requestId;
                return this;
            }

            /**
             * ResourceType.
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
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * ParameterValue.
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
             * ProgressTargetValue.
             */
            public Builder progressTargetValue(Float progressTargetValue) {
                this.progressTargetValue = progressTargetValue;
                return this;
            }

            /**
             * ProgressValue.
             */
            public Builder progressValue(Float progressValue) {
                this.progressValue = progressValue;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceType.
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

        @NameInMap("SuccessResourceCount")
        private Integer successResourceCount;

        @NameInMap("TotalResourceCount")
        private Integer totalResourceCount;

        private ResourceProgress(Builder builder) {
            this.failedResourceCount = builder.failedResourceCount;
            this.inProgressResourceCount = builder.inProgressResourceCount;
            this.inProgressResourceDetails = builder.inProgressResourceDetails;
            this.pendingResourceCount = builder.pendingResourceCount;
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
            private Integer successResourceCount; 
            private Integer totalResourceCount; 

            /**
             * FailedResourceCount.
             */
            public Builder failedResourceCount(Integer failedResourceCount) {
                this.failedResourceCount = failedResourceCount;
                return this;
            }

            /**
             * InProgressResourceCount.
             */
            public Builder inProgressResourceCount(Integer inProgressResourceCount) {
                this.inProgressResourceCount = inProgressResourceCount;
                return this;
            }

            /**
             * InProgressResourceDetails.
             */
            public Builder inProgressResourceDetails(java.util.List < InProgressResourceDetails> inProgressResourceDetails) {
                this.inProgressResourceDetails = inProgressResourceDetails;
                return this;
            }

            /**
             * PendingResourceCount.
             */
            public Builder pendingResourceCount(Integer pendingResourceCount) {
                this.pendingResourceCount = pendingResourceCount;
                return this;
            }

            /**
             * SuccessResourceCount.
             */
            public Builder successResourceCount(Integer successResourceCount) {
                this.successResourceCount = successResourceCount;
                return this;
            }

            /**
             * TotalResourceCount.
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
