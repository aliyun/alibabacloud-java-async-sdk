// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    @NameInMap("Log")
    private Log log;

    @NameInMap("NotificationURLs")
    private java.util.List < String > notificationURLs;

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
        this.log = builder.log;
        this.notificationURLs = builder.notificationURLs;
        this.outputs = builder.outputs;
        this.parameters = builder.parameters;
        this.parentStackId = builder.parentStackId;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.resourceProgress = builder.resourceProgress;
        this.rootStackId = builder.rootStackId;
        this.stackDriftStatus = builder.stackDriftStatus;
        this.stackId = builder.stackId;
        this.stackName = builder.stackName;
        this.stackType = builder.stackType;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.tags = builder.tags;
        this.templateDescription = builder.templateDescription;
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
        private Log log; 
        private java.util.List < String > notificationURLs; 
        private java.util.List < java.util.Map<String, ?>> outputs; 
        private java.util.List < Parameters> parameters; 
        private String parentStackId; 
        private String ramRoleName; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private ResourceProgress resourceProgress; 
        private String rootStackId; 
        private String stackDriftStatus; 
        private String stackId; 
        private String stackName; 
        private String stackType; 
        private String status; 
        private String statusReason; 
        private java.util.List < Tags> tags; 
        private String templateDescription; 
        private Integer timeoutInMinutes; 
        private String updateTime; 

        /**
         * <p>CreateTime.</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>DeletionProtection.</p>
         */
        public Builder deletionProtection(String deletionProtection) {
            this.deletionProtection = deletionProtection;
            return this;
        }

        /**
         * <p>Description.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>DisableRollback.</p>
         */
        public Builder disableRollback(Boolean disableRollback) {
            this.disableRollback = disableRollback;
            return this;
        }

        /**
         * <p>DriftDetectionTime.</p>
         */
        public Builder driftDetectionTime(String driftDetectionTime) {
            this.driftDetectionTime = driftDetectionTime;
            return this;
        }

        /**
         * <p>Log.</p>
         */
        public Builder log(Log log) {
            this.log = log;
            return this;
        }

        /**
         * <p>NotificationURLs.</p>
         */
        public Builder notificationURLs(java.util.List < String > notificationURLs) {
            this.notificationURLs = notificationURLs;
            return this;
        }

        /**
         * <p>Outputs.</p>
         */
        public Builder outputs(java.util.List < java.util.Map<String, ?>> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>Parameters.</p>
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>ParentStackId.</p>
         */
        public Builder parentStackId(String parentStackId) {
            this.parentStackId = parentStackId;
            return this;
        }

        /**
         * <p>RamRoleName.</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>ResourceGroupId.</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>ResourceProgress.</p>
         */
        public Builder resourceProgress(ResourceProgress resourceProgress) {
            this.resourceProgress = resourceProgress;
            return this;
        }

        /**
         * <p>RootStackId.</p>
         */
        public Builder rootStackId(String rootStackId) {
            this.rootStackId = rootStackId;
            return this;
        }

        /**
         * <p>StackDriftStatus.</p>
         */
        public Builder stackDriftStatus(String stackDriftStatus) {
            this.stackDriftStatus = stackDriftStatus;
            return this;
        }

        /**
         * <p>StackId.</p>
         */
        public Builder stackId(String stackId) {
            this.stackId = stackId;
            return this;
        }

        /**
         * <p>StackName.</p>
         */
        public Builder stackName(String stackName) {
            this.stackName = stackName;
            return this;
        }

        /**
         * <p>StackType.</p>
         */
        public Builder stackType(String stackType) {
            this.stackType = stackType;
            return this;
        }

        /**
         * <p>Status.</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>StatusReason.</p>
         */
        public Builder statusReason(String statusReason) {
            this.statusReason = statusReason;
            return this;
        }

        /**
         * <p>Tags.</p>
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>TemplateDescription.</p>
         */
        public Builder templateDescription(String templateDescription) {
            this.templateDescription = templateDescription;
            return this;
        }

        /**
         * <p>TimeoutInMinutes.</p>
         */
        public Builder timeoutInMinutes(Integer timeoutInMinutes) {
            this.timeoutInMinutes = timeoutInMinutes;
            return this;
        }

        /**
         * <p>UpdateTime.</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetStackResponseBody build() {
            return new GetStackResponseBody(this);
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
             * <p>Command.</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * <p>Content.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>Stream.</p>
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
        @NameInMap("TerraformLogs")
        private java.util.List < TerraformLogs> terraformLogs;


        private Log(Builder builder) {
            this.terraformLogs = builder.terraformLogs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return terraformLogs
         */
        public java.util.List < TerraformLogs> getTerraformLogs() {
            return this.terraformLogs;
        }

        public static final class Builder {
            private java.util.List < TerraformLogs> terraformLogs; 

            /**
             * <p>TerraformLogs.</p>
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
             * <p>ParameterKey.</p>
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * <p>ParameterValue.</p>
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
             * <p>ProgressTargetValue.</p>
             */
            public Builder progressTargetValue(Float progressTargetValue) {
                this.progressTargetValue = progressTargetValue;
                return this;
            }

            /**
             * <p>ProgressValue.</p>
             */
            public Builder progressValue(Float progressValue) {
                this.progressValue = progressValue;
                return this;
            }

            /**
             * <p>ResourceName.</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>ResourceType.</p>
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
             * <p>FailedResourceCount.</p>
             */
            public Builder failedResourceCount(Integer failedResourceCount) {
                this.failedResourceCount = failedResourceCount;
                return this;
            }

            /**
             * <p>InProgressResourceCount.</p>
             */
            public Builder inProgressResourceCount(Integer inProgressResourceCount) {
                this.inProgressResourceCount = inProgressResourceCount;
                return this;
            }

            /**
             * <p>InProgressResourceDetails.</p>
             */
            public Builder inProgressResourceDetails(java.util.List < InProgressResourceDetails> inProgressResourceDetails) {
                this.inProgressResourceDetails = inProgressResourceDetails;
                return this;
            }

            /**
             * <p>PendingResourceCount.</p>
             */
            public Builder pendingResourceCount(Integer pendingResourceCount) {
                this.pendingResourceCount = pendingResourceCount;
                return this;
            }

            /**
             * <p>SuccessResourceCount.</p>
             */
            public Builder successResourceCount(Integer successResourceCount) {
                this.successResourceCount = successResourceCount;
                return this;
            }

            /**
             * <p>TotalResourceCount.</p>
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
             * <p>Key.</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Value.</p>
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
