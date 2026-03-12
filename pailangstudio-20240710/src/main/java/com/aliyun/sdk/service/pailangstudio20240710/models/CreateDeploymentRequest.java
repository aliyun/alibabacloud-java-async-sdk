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
 * {@link CreateDeploymentRequest} extends {@link RequestModel}
 *
 * <p>CreateDeploymentRequest</p>
 */
public class CreateDeploymentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoApproval")
    private Boolean autoApproval;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChatHistoryConfig")
    private ChatHistoryConfig chatHistoryConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentModerationConfig")
    private ContentModerationConfig contentModerationConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeploymentConfig")
    private String deploymentConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableTrace")
    private Boolean enableTrace;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceSnapshotId")
    private String resourceSnapshotId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkDir")
    private String workDir;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateDeploymentRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.autoApproval = builder.autoApproval;
        this.chatHistoryConfig = builder.chatHistoryConfig;
        this.contentModerationConfig = builder.contentModerationConfig;
        this.deploymentConfig = builder.deploymentConfig;
        this.description = builder.description;
        this.enableTrace = builder.enableTrace;
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

    public static CreateDeploymentRequest create() {
        return builder().build();
    }

@Override
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
     * @return deploymentConfig
     */
    public String getDeploymentConfig() {
        return this.deploymentConfig;
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

    public static final class Builder extends Request.Builder<CreateDeploymentRequest, Builder> {
        private String accessibility; 
        private Boolean autoApproval; 
        private ChatHistoryConfig chatHistoryConfig; 
        private ContentModerationConfig contentModerationConfig; 
        private String deploymentConfig; 
        private String description; 
        private Boolean enableTrace; 
        private String resourceId; 
        private String resourceSnapshotId; 
        private String resourceType; 
        private String serviceName; 
        private String workDir; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDeploymentRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.autoApproval = request.autoApproval;
            this.chatHistoryConfig = request.chatHistoryConfig;
            this.contentModerationConfig = request.contentModerationConfig;
            this.deploymentConfig = request.deploymentConfig;
            this.description = request.description;
            this.enableTrace = request.enableTrace;
            this.resourceId = request.resourceId;
            this.resourceSnapshotId = request.resourceSnapshotId;
            this.resourceType = request.resourceType;
            this.serviceName = request.serviceName;
            this.workDir = request.workDir;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * AutoApproval.
         */
        public Builder autoApproval(Boolean autoApproval) {
            this.putBodyParameter("AutoApproval", autoApproval);
            this.autoApproval = autoApproval;
            return this;
        }

        /**
         * ChatHistoryConfig.
         */
        public Builder chatHistoryConfig(ChatHistoryConfig chatHistoryConfig) {
            this.putBodyParameter("ChatHistoryConfig", chatHistoryConfig);
            this.chatHistoryConfig = chatHistoryConfig;
            return this;
        }

        /**
         * ContentModerationConfig.
         */
        public Builder contentModerationConfig(ContentModerationConfig contentModerationConfig) {
            this.putBodyParameter("ContentModerationConfig", contentModerationConfig);
            this.contentModerationConfig = contentModerationConfig;
            return this;
        }

        /**
         * DeploymentConfig.
         */
        public Builder deploymentConfig(String deploymentConfig) {
            this.putBodyParameter("DeploymentConfig", deploymentConfig);
            this.deploymentConfig = deploymentConfig;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnableTrace.
         */
        public Builder enableTrace(Boolean enableTrace) {
            this.putBodyParameter("EnableTrace", enableTrace);
            this.enableTrace = enableTrace;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceSnapshotId.
         */
        public Builder resourceSnapshotId(String resourceSnapshotId) {
            this.putBodyParameter("ResourceSnapshotId", resourceSnapshotId);
            this.resourceSnapshotId = resourceSnapshotId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putBodyParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * WorkDir.
         */
        public Builder workDir(String workDir) {
            this.putBodyParameter("WorkDir", workDir);
            this.workDir = workDir;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDeploymentRequest build() {
            return new CreateDeploymentRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDeploymentRequest} extends {@link TeaModel}
     *
     * <p>CreateDeploymentRequest</p>
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
     * {@link CreateDeploymentRequest} extends {@link TeaModel}
     *
     * <p>CreateDeploymentRequest</p>
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
}
