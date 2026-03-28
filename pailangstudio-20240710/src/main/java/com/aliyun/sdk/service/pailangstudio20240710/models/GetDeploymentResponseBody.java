// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link GetDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeploymentResponseBody</p>
 */
public class GetDeploymentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("AutoApproval")
    private Boolean autoApproval;

    @com.aliyun.core.annotation.NameInMap("ChatHistoryConfig")
    private ChatHistoryConfig chatHistoryConfig;

    @com.aliyun.core.annotation.NameInMap("ContentModerationConfig")
    private ContentModerationConfig contentModerationConfig;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("DeploymentConfig")
    private String deploymentConfig;

    @com.aliyun.core.annotation.NameInMap("DeploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("DeploymentStages")
    private java.util.List<DeploymentStages> deploymentStages;

    @com.aliyun.core.annotation.NameInMap("DeploymentStatus")
    private String deploymentStatus;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnableTrace")
    private Boolean enableTrace;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceSnapshotId")
    private String resourceSnapshotId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("WorkDir")
    private String workDir;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetDeploymentResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
        this.autoApproval = builder.autoApproval;
        this.chatHistoryConfig = builder.chatHistoryConfig;
        this.contentModerationConfig = builder.contentModerationConfig;
        this.creator = builder.creator;
        this.deploymentConfig = builder.deploymentConfig;
        this.deploymentId = builder.deploymentId;
        this.deploymentStages = builder.deploymentStages;
        this.deploymentStatus = builder.deploymentStatus;
        this.description = builder.description;
        this.enableTrace = builder.enableTrace;
        this.errorMessage = builder.errorMessage;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.operationType = builder.operationType;
        this.requestId = builder.requestId;
        this.resourceId = builder.resourceId;
        this.resourceSnapshotId = builder.resourceSnapshotId;
        this.resourceType = builder.resourceType;
        this.serviceName = builder.serviceName;
        this.workDir = builder.workDir;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return autoApproval
     */
    public Boolean getAutoApproval() {
        return this.autoApproval;
    }

    /**
     * @return chatHistoryConfig
     */
    public ChatHistoryConfig getChatHistoryConfig() {
        return this.chatHistoryConfig;
    }

    /**
     * @return contentModerationConfig
     */
    public ContentModerationConfig getContentModerationConfig() {
        return this.contentModerationConfig;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return deploymentConfig
     */
    public String getDeploymentConfig() {
        return this.deploymentConfig;
    }

    /**
     * @return deploymentId
     */
    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * @return deploymentStages
     */
    public java.util.List<DeploymentStages> getDeploymentStages() {
        return this.deploymentStages;
    }

    /**
     * @return deploymentStatus
     */
    public String getDeploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableTrace
     */
    public Boolean getEnableTrace() {
        return this.enableTrace;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceSnapshotId
     */
    public String getResourceSnapshotId() {
        return this.resourceSnapshotId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return workDir
     */
    public String getWorkDir() {
        return this.workDir;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private Boolean autoApproval; 
        private ChatHistoryConfig chatHistoryConfig; 
        private ContentModerationConfig contentModerationConfig; 
        private String creator; 
        private String deploymentConfig; 
        private String deploymentId; 
        private java.util.List<DeploymentStages> deploymentStages; 
        private String deploymentStatus; 
        private String description; 
        private Boolean enableTrace; 
        private String errorMessage; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String operationType; 
        private String requestId; 
        private String resourceId; 
        private String resourceSnapshotId; 
        private String resourceType; 
        private String serviceName; 
        private String workDir; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetDeploymentResponseBody model) {
            this.accessibility = model.accessibility;
            this.autoApproval = model.autoApproval;
            this.chatHistoryConfig = model.chatHistoryConfig;
            this.contentModerationConfig = model.contentModerationConfig;
            this.creator = model.creator;
            this.deploymentConfig = model.deploymentConfig;
            this.deploymentId = model.deploymentId;
            this.deploymentStages = model.deploymentStages;
            this.deploymentStatus = model.deploymentStatus;
            this.description = model.description;
            this.enableTrace = model.enableTrace;
            this.errorMessage = model.errorMessage;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.operationType = model.operationType;
            this.requestId = model.requestId;
            this.resourceId = model.resourceId;
            this.resourceSnapshotId = model.resourceSnapshotId;
            this.resourceType = model.resourceType;
            this.serviceName = model.serviceName;
            this.workDir = model.workDir;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The workspace visibility. Valid values:  </p>
         * <ul>
         * <li>PRIVATE: The resource is visible only to you and administrators in this workspace.  </li>
         * <li>PUBLIC: The resource is visible to all users in this workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>Indicates whether deployment confirmation is automatically skipped.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoApproval(Boolean autoApproval) {
            this.autoApproval = autoApproval;
            return this;
        }

        /**
         * <p>Chat history configuration.</p>
         */
        public Builder chatHistoryConfig(ChatHistoryConfig chatHistoryConfig) {
            this.chatHistoryConfig = chatHistoryConfig;
            return this;
        }

        /**
         * <p>Content moderation configuration.</p>
         */
        public Builder contentModerationConfig(ContentModerationConfig contentModerationConfig) {
            this.contentModerationConfig = contentModerationConfig;
            return this;
        }

        /**
         * <p>Creator ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2003******4844</p>
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * <p>Deployment configuration. For details, see <a href="https://help.aliyun.com/zh/pai/user-guide/parameters-of-model-services">Deployment Configuration</a> in PAI-EAS documentation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;metadata&quot;:{&quot;name&quot;:&quot;langstudio_2026<em><strong><em><strong>3848_jro7&quot;,&quot;instance&quot;:1,&quot;workspace_id&quot;:&quot;285</strong></em>&quot;,&quot;enable_webservice&quot;:false},&quot;cloud&quot;:{&quot;computing&quot;:{&quot;instances&quot;:[{&quot;type&quot;:&quot;ecs.g7.xlarge&quot;}]},&quot;networking&quot;:{&quot;vpc_id&quot;:&quot;vpc-bp1obprt</strong></em><em><strong>4bzo00d&quot;,&quot;vswitch_id&quot;:&quot;vsw-bp1p6i36k</strong></em><em><strong>pmfhw8&quot;,&quot;security_group_id&quot;:&quot;sg-bp1djud4</strong></em>***zecl5a&quot;}}}</p>
         */
        public Builder deploymentConfig(String deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }

        /**
         * <p>The ID of the deployment job.</p>
         * 
         * <strong>example:</strong>
         * <p>dploy-asdf******1234</p>
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * <p>Stage information of the deployment.</p>
         */
        public Builder deploymentStages(java.util.List<DeploymentStages> deploymentStages) {
            this.deploymentStages = deploymentStages;
            return this;
        }

        /**
         * <p>Task Status. Valid values:  </p>
         * <ul>
         * <li>Creating: Creating.  </li>
         * <li>Failed: Deployment failed.  </li>
         * <li>Stopping: Stopping.  </li>
         * <li>Waiting: Waiting.  </li>
         * <li>Starting: Starting.  </li>
         * <li>Running: Running.  </li>
         * <li>Pending: Pending.  </li>
         * <li>WaitForConfirm: Waiting for confirmation.  </li>
         * <li>Canceled: Canceled.  </li>
         * <li>Succeed: Succeeded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeed</p>
         */
        public Builder deploymentStatus(String deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
            return this;
        }

        /**
         * <p>The service description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether Tracing Analysis is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableTrace(Boolean enableTrace) {
            this.enableTrace = enableTrace;
            return this;
        }

        /**
         * <p>Error message.</p>
         * 
         * <strong>example:</strong>
         * <p>This is error message</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Creation Time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-24T07:33:53Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>Updated At.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-09-24T08:58:35Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>Operation Type. Valid values:  </p>
         * <ul>
         * <li>Create: Create a new service.  </li>
         * <li>Update: Update an existing service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Create</p>
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>963BD7F9-0C02-5594-9550-BCC6DD43E3C0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource to be deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>flow-asdf******123</p>
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The snapshot ID of the resource to be deployed. If this parameter is provided, the system deploys directly based on this snapshot. If not provided, the system creates a new snapshot of the resource before deployment.</p>
         * 
         * <strong>example:</strong>
         * <p>snap-asfg******123</p>
         */
        public Builder resourceSnapshotId(String resourceSnapshotId) {
            this.resourceSnapshotId = resourceSnapshotId;
            return this;
        }

        /**
         * <p>The resource type to be deployed. Valid values:  </p>
         * <ul>
         * <li>Flow: A pipeline project  </li>
         * <li>Code: A Code project</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Flow</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>Service Name. Format requirements:  </p>
         * <ul>
         * <li>Supports lowercase letters, digits, and underscores.  </li>
         * <li>Must start with a letter.  </li>
         * <li>Length must be 1–45 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>myservice01</p>
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The OSS working directory for the service. It stores runtime logs, conversation history, and other data.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket.oss-cn-hangzhou-internal.aliyuncs.com/workdir/</p>
         */
        public Builder workDir(String workDir) {
            this.workDir = workDir;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>478***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetDeploymentResponseBody build() {
            return new GetDeploymentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeploymentResponseBody</p>
     */
    public static class ChatHistoryConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionName")
        private String connectionName;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        private ChatHistoryConfig(Builder builder) {
            this.connectionName = builder.connectionName;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ChatHistoryConfig create() {
            return builder().build();
        }

        /**
         * @return connectionName
         */
        public String getConnectionName() {
            return this.connectionName;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String connectionName; 
            private String storageType; 

            private Builder() {
            } 

            private Builder(ChatHistoryConfig model) {
                this.connectionName = model.connectionName;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The connection name. This parameter is required when the chat history storage type is RDS.</p>
             * 
             * <strong>example:</strong>
             * <p>rdsconnection</p>
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * <p>The storage class. Valid values:  </p>
             * <ul>
             * <li>LOCAL: Chat history is stored in a local SQLite file. This option does not support multi-instance deployment.  </li>
             * <li>OSS: Chat history is stored in a specific path under the service OSS workspace path.  </li>
             * <li>RDS: Chat history is stored in an RDS Table, and an RDS connection must be specified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public ChatHistoryConfig build() {
                return new ChatHistoryConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeploymentResponseBody</p>
     */
    public static class ContentModerationConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableInputModeration")
        private Boolean enableInputModeration;

        @com.aliyun.core.annotation.NameInMap("EnableOutputModeration")
        private Boolean enableOutputModeration;

        @com.aliyun.core.annotation.NameInMap("StreamingModerationThreshold")
        private Integer streamingModerationThreshold;

        private ContentModerationConfig(Builder builder) {
            this.enableInputModeration = builder.enableInputModeration;
            this.enableOutputModeration = builder.enableOutputModeration;
            this.streamingModerationThreshold = builder.streamingModerationThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContentModerationConfig create() {
            return builder().build();
        }

        /**
         * @return enableInputModeration
         */
        public Boolean getEnableInputModeration() {
            return this.enableInputModeration;
        }

        /**
         * @return enableOutputModeration
         */
        public Boolean getEnableOutputModeration() {
            return this.enableOutputModeration;
        }

        /**
         * @return streamingModerationThreshold
         */
        public Integer getStreamingModerationThreshold() {
            return this.streamingModerationThreshold;
        }

        public static final class Builder {
            private Boolean enableInputModeration; 
            private Boolean enableOutputModeration; 
            private Integer streamingModerationThreshold; 

            private Builder() {
            } 

            private Builder(ContentModerationConfig model) {
                this.enableInputModeration = model.enableInputModeration;
                this.enableOutputModeration = model.enableOutputModeration;
                this.streamingModerationThreshold = model.streamingModerationThreshold;
            } 

            /**
             * <p>Indicates whether to enable security review for input.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableInputModeration(Boolean enableInputModeration) {
                this.enableInputModeration = enableInputModeration;
                return this;
            }

            /**
             * <p>Indicates whether to enable content moderation for output.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOutputModeration(Boolean enableOutputModeration) {
                this.enableOutputModeration = enableOutputModeration;
                return this;
            }

            /**
             * <p>Cache size for streaming output content submitted for moderation. The default value is 5.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder streamingModerationThreshold(Integer streamingModerationThreshold) {
                this.streamingModerationThreshold = streamingModerationThreshold;
                return this;
            }

            public ContentModerationConfig build() {
                return new ContentModerationConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeploymentResponseBody</p>
     */
    public static class DeploymentStages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("GmtEndTime")
        private String gmtEndTime;

        @com.aliyun.core.annotation.NameInMap("GmtStartTime")
        private String gmtStartTime;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private Integer stage;

        @com.aliyun.core.annotation.NameInMap("StageInfo")
        private String stageInfo;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("StageStatus")
        private String stageStatus;

        private DeploymentStages(Builder builder) {
            this.description = builder.description;
            this.errorMessage = builder.errorMessage;
            this.gmtEndTime = builder.gmtEndTime;
            this.gmtStartTime = builder.gmtStartTime;
            this.stage = builder.stage;
            this.stageInfo = builder.stageInfo;
            this.stageName = builder.stageName;
            this.stageStatus = builder.stageStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeploymentStages create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return gmtEndTime
         */
        public String getGmtEndTime() {
            return this.gmtEndTime;
        }

        /**
         * @return gmtStartTime
         */
        public String getGmtStartTime() {
            return this.gmtStartTime;
        }

        /**
         * @return stage
         */
        public Integer getStage() {
            return this.stage;
        }

        /**
         * @return stageInfo
         */
        public String getStageInfo() {
            return this.stageInfo;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return stageStatus
         */
        public String getStageStatus() {
            return this.stageStatus;
        }

        public static final class Builder {
            private String description; 
            private String errorMessage; 
            private String gmtEndTime; 
            private String gmtStartTime; 
            private Integer stage; 
            private String stageInfo; 
            private String stageName; 
            private String stageStatus; 

            private Builder() {
            } 

            private Builder(DeploymentStages model) {
                this.description = model.description;
                this.errorMessage = model.errorMessage;
                this.gmtEndTime = model.gmtEndTime;
                this.gmtStartTime = model.gmtStartTime;
                this.stage = model.stage;
                this.stageInfo = model.stageInfo;
                this.stageName = model.stageName;
                this.stageStatus = model.stageStatus;
            } 

            /**
             * <p>Deployment stage description.</p>
             * 
             * <strong>example:</strong>
             * <p>Create snapshot for deployment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Error message.</p>
             * 
             * <strong>example:</strong>
             * <p>This is error</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>End time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-23T10:35:38+08:00</p>
             */
            public Builder gmtEndTime(String gmtEndTime) {
                this.gmtEndTime = gmtEndTime;
                return this;
            }

            /**
             * <p>Start Time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-23T10:25:38+08:00</p>
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * <p>Deployment stage.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stage(Integer stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>Deployment stage information.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;SnapshotId&quot;:&quot;snap-i8j29kw8nubqb0hotn&quot;}</p>
             */
            public Builder stageInfo(String stageInfo) {
                this.stageInfo = stageInfo;
                return this;
            }

            /**
             * <p>Deployment stage name.</p>
             * 
             * <strong>example:</strong>
             * <p>PrepareSnapshot</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>Deployment stage status. Valid values:  </p>
             * <ul>
             * <li>NotStarted: Not started.  </li>
             * <li>WaitForConfirm: Waiting for confirmation.  </li>
             * <li>Waiting: Waiting.  </li>
             * <li>Creating: Creating.  </li>
             * <li>Running: Running.  </li>
             * <li>Succeed: Succeeded.  </li>
             * <li>Failed: Failed.  </li>
             * <li>Canceled: Canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder stageStatus(String stageStatus) {
                this.stageStatus = stageStatus;
                return this;
            }

            public DeploymentStages build() {
                return new DeploymentStages(this);
            } 

        } 

    }
}
