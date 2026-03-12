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
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * AutoApproval.
         */
        public Builder autoApproval(Boolean autoApproval) {
            this.autoApproval = autoApproval;
            return this;
        }

        /**
         * ChatHistoryConfig.
         */
        public Builder chatHistoryConfig(ChatHistoryConfig chatHistoryConfig) {
            this.chatHistoryConfig = chatHistoryConfig;
            return this;
        }

        /**
         * ContentModerationConfig.
         */
        public Builder contentModerationConfig(ContentModerationConfig contentModerationConfig) {
            this.contentModerationConfig = contentModerationConfig;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * DeploymentConfig.
         */
        public Builder deploymentConfig(String deploymentConfig) {
            this.deploymentConfig = deploymentConfig;
            return this;
        }

        /**
         * DeploymentId.
         */
        public Builder deploymentId(String deploymentId) {
            this.deploymentId = deploymentId;
            return this;
        }

        /**
         * DeploymentStages.
         */
        public Builder deploymentStages(java.util.List<DeploymentStages> deploymentStages) {
            this.deploymentStages = deploymentStages;
            return this;
        }

        /**
         * DeploymentStatus.
         */
        public Builder deploymentStatus(String deploymentStatus) {
            this.deploymentStatus = deploymentStatus;
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
         * EnableTrace.
         */
        public Builder enableTrace(Boolean enableTrace) {
            this.enableTrace = enableTrace;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(String operationType) {
            this.operationType = operationType;
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
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceSnapshotId.
         */
        public Builder resourceSnapshotId(String resourceSnapshotId) {
            this.resourceSnapshotId = resourceSnapshotId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
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
         * WorkDir.
         */
        public Builder workDir(String workDir) {
            this.workDir = workDir;
            return this;
        }

        /**
         * WorkspaceId.
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
             * <p>连接名称</p>
             * 
             * <strong>example:</strong>
             * <p>rdsconnection</p>
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * <p>存储类型</p>
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
             * <p>启用输入内容审查</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableInputModeration(Boolean enableInputModeration) {
                this.enableInputModeration = enableInputModeration;
                return this;
            }

            /**
             * <p>启用输出内容审查</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOutputModeration(Boolean enableOutputModeration) {
                this.enableOutputModeration = enableOutputModeration;
                return this;
            }

            /**
             * <p>流式输出内容送审缓存大小</p>
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
             * <p>描述</p>
             * 
             * <strong>example:</strong>
             * <p>Create snapshot for deployment</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>错误信息</p>
             * 
             * <strong>example:</strong>
             * <p>This is error</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-23T10:35:38+08:00</p>
             */
            public Builder gmtEndTime(String gmtEndTime) {
                this.gmtEndTime = gmtEndTime;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-23T10:25:38+08:00</p>
             */
            public Builder gmtStartTime(String gmtStartTime) {
                this.gmtStartTime = gmtStartTime;
                return this;
            }

            /**
             * <p>阶段</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder stage(Integer stage) {
                this.stage = stage;
                return this;
            }

            /**
             * <p>阶段信息</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;SnapshotId&quot;:&quot;snap-i8j29kw8nubqb0hotn&quot;}</p>
             */
            public Builder stageInfo(String stageInfo) {
                this.stageInfo = stageInfo;
                return this;
            }

            /**
             * <p>阶段名称</p>
             * 
             * <strong>example:</strong>
             * <p>PrepareSnapshot</p>
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * <p>阶段状态</p>
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
