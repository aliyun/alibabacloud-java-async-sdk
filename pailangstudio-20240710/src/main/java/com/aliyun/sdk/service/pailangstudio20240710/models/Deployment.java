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
 * {@link Deployment} extends {@link TeaModel}
 *
 * <p>Deployment</p>
 */
public class Deployment extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("ChatHistoryConfig")
    private ChatHistoryConfig chatHistoryConfig;

    @com.aliyun.core.annotation.NameInMap("ContentModerationConfig")
    private ContentModerationConfig contentModerationConfig;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.NameInMap("DeploymentConfig")
    private String deploymentConfig;

    @com.aliyun.core.annotation.NameInMap("DeploymentId")
    private String deploymentId;

    @com.aliyun.core.annotation.NameInMap("DeploymentStages")
    private String deploymentStages;

    @com.aliyun.core.annotation.NameInMap("DeploymentStatus")
    private String deploymentStatus;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private EcsSpec ecsSpec;

    @com.aliyun.core.annotation.NameInMap("EnableTrace")
    private Boolean enableTrace;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.List<Envs> envs;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("ResourceSnapshotId")
    private String resourceSnapshotId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("ServiceGroup")
    private String serviceGroup;

    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("WorkDir")
    private String workDir;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private Deployment(Builder builder) {
        this.accessibility = builder.accessibility;
        this.chatHistoryConfig = builder.chatHistoryConfig;
        this.contentModerationConfig = builder.contentModerationConfig;
        this.creator = builder.creator;
        this.credentialConfig = builder.credentialConfig;
        this.dataSources = builder.dataSources;
        this.deploymentConfig = builder.deploymentConfig;
        this.deploymentId = builder.deploymentId;
        this.deploymentStages = builder.deploymentStages;
        this.deploymentStatus = builder.deploymentStatus;
        this.description = builder.description;
        this.ecsSpec = builder.ecsSpec;
        this.enableTrace = builder.enableTrace;
        this.envs = builder.envs;
        this.errorMessage = builder.errorMessage;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labels = builder.labels;
        this.operationType = builder.operationType;
        this.resourceId = builder.resourceId;
        this.resourceSnapshotId = builder.resourceSnapshotId;
        this.resourceType = builder.resourceType;
        this.serviceGroup = builder.serviceGroup;
        this.serviceName = builder.serviceName;
        this.userVpc = builder.userVpc;
        this.workDir = builder.workDir;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Deployment create() {
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
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return dataSources
     */
    public java.util.List<DataSources> getDataSources() {
        return this.dataSources;
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
    public String getDeploymentStages() {
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
     * @return ecsSpec
     */
    public EcsSpec getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return enableTrace
     */
    public Boolean getEnableTrace() {
        return this.enableTrace;
    }

    /**
     * @return envs
     */
    public java.util.List<Envs> getEnvs() {
        return this.envs;
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
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
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
     * @return serviceGroup
     */
    public String getServiceGroup() {
        return this.serviceGroup;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
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
        private ChatHistoryConfig chatHistoryConfig; 
        private ContentModerationConfig contentModerationConfig; 
        private String creator; 
        private CredentialConfig credentialConfig; 
        private java.util.List<DataSources> dataSources; 
        private String deploymentConfig; 
        private String deploymentId; 
        private String deploymentStages; 
        private String deploymentStatus; 
        private String description; 
        private EcsSpec ecsSpec; 
        private Boolean enableTrace; 
        private java.util.List<Envs> envs; 
        private String errorMessage; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List<Labels> labels; 
        private String operationType; 
        private String resourceId; 
        private String resourceSnapshotId; 
        private String resourceType; 
        private String serviceGroup; 
        private String serviceName; 
        private UserVpc userVpc; 
        private String workDir; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Deployment model) {
            this.accessibility = model.accessibility;
            this.chatHistoryConfig = model.chatHistoryConfig;
            this.contentModerationConfig = model.contentModerationConfig;
            this.creator = model.creator;
            this.credentialConfig = model.credentialConfig;
            this.dataSources = model.dataSources;
            this.deploymentConfig = model.deploymentConfig;
            this.deploymentId = model.deploymentId;
            this.deploymentStages = model.deploymentStages;
            this.deploymentStatus = model.deploymentStatus;
            this.description = model.description;
            this.ecsSpec = model.ecsSpec;
            this.enableTrace = model.enableTrace;
            this.envs = model.envs;
            this.errorMessage = model.errorMessage;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.labels = model.labels;
            this.operationType = model.operationType;
            this.resourceId = model.resourceId;
            this.resourceSnapshotId = model.resourceSnapshotId;
            this.resourceType = model.resourceType;
            this.serviceGroup = model.serviceGroup;
            this.serviceName = model.serviceName;
            this.userVpc = model.userVpc;
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
         * CredentialConfig.
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * DataSources.
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.dataSources = dataSources;
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
        public Builder deploymentStages(String deploymentStages) {
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
         * EcsSpec.
         */
        public Builder ecsSpec(EcsSpec ecsSpec) {
            this.ecsSpec = ecsSpec;
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
         * Envs.
         */
        public Builder envs(java.util.List<Envs> envs) {
            this.envs = envs;
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
         * Labels.
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.labels = labels;
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
         * ServiceGroup.
         */
        public Builder serviceGroup(String serviceGroup) {
            this.serviceGroup = serviceGroup;
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
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.userVpc = userVpc;
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

        public Deployment build() {
            return new Deployment(this);
        } 

    } 

    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
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
             */
            public Builder connectionName(String connectionName) {
                this.connectionName = connectionName;
                return this;
            }

            /**
             * <p>存储类型</p>
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
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
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
             */
            public Builder enableInputModeration(Boolean enableInputModeration) {
                this.enableInputModeration = enableInputModeration;
                return this;
            }

            /**
             * <p>启用输出内容审查</p>
             */
            public Builder enableOutputModeration(Boolean enableOutputModeration) {
                this.enableOutputModeration = enableOutputModeration;
                return this;
            }

            /**
             * <p>流式输出内容送审缓存大小</p>
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
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class Roles extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssumeRoleFor")
        private String assumeRoleFor;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        private String roleType;

        private Roles(Builder builder) {
            this.assumeRoleFor = builder.assumeRoleFor;
            this.roleArn = builder.roleArn;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Roles create() {
            return builder().build();
        }

        /**
         * @return assumeRoleFor
         */
        public String getAssumeRoleFor() {
            return this.assumeRoleFor;
        }

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        public static final class Builder {
            private String assumeRoleFor; 
            private String roleArn; 
            private String roleType; 

            private Builder() {
            } 

            private Builder(Roles model) {
                this.assumeRoleFor = model.assumeRoleFor;
                this.roleArn = model.roleArn;
                this.roleType = model.roleType;
            } 

            /**
             * <p>AssumeRoleFor</p>
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <p>角色名称</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>角色类型</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public Roles build() {
                return new Roles(this);
            } 

        } 

    }
    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class CredentialConfigItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Roles")
        private java.util.List<Roles> roles;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CredentialConfigItems(Builder builder) {
            this.key = builder.key;
            this.roles = builder.roles;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialConfigItems create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return roles
         */
        public java.util.List<Roles> getRoles() {
            return this.roles;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<Roles> roles; 
            private String type; 

            private Builder() {
            } 

            private Builder(CredentialConfigItems model) {
                this.key = model.key;
                this.roles = model.roles;
                this.type = model.type;
            } 

            /**
             * <p>Key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>角色列表</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>Type</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CredentialConfigItems build() {
                return new CredentialConfigItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class CredentialConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunEnvRoleKey")
        private String aliyunEnvRoleKey;

        @com.aliyun.core.annotation.NameInMap("CredentialConfigItems")
        private java.util.List<CredentialConfigItems> credentialConfigItems;

        @com.aliyun.core.annotation.NameInMap("EnableCredentialInject")
        private Boolean enableCredentialInject;

        private CredentialConfig(Builder builder) {
            this.aliyunEnvRoleKey = builder.aliyunEnvRoleKey;
            this.credentialConfigItems = builder.credentialConfigItems;
            this.enableCredentialInject = builder.enableCredentialInject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CredentialConfig create() {
            return builder().build();
        }

        /**
         * @return aliyunEnvRoleKey
         */
        public String getAliyunEnvRoleKey() {
            return this.aliyunEnvRoleKey;
        }

        /**
         * @return credentialConfigItems
         */
        public java.util.List<CredentialConfigItems> getCredentialConfigItems() {
            return this.credentialConfigItems;
        }

        /**
         * @return enableCredentialInject
         */
        public Boolean getEnableCredentialInject() {
            return this.enableCredentialInject;
        }

        public static final class Builder {
            private String aliyunEnvRoleKey; 
            private java.util.List<CredentialConfigItems> credentialConfigItems; 
            private Boolean enableCredentialInject; 

            private Builder() {
            } 

            private Builder(CredentialConfig model) {
                this.aliyunEnvRoleKey = model.aliyunEnvRoleKey;
                this.credentialConfigItems = model.credentialConfigItems;
                this.enableCredentialInject = model.enableCredentialInject;
            } 

            /**
             * <p>AliyunEnvRoleKey</p>
             */
            public Builder aliyunEnvRoleKey(String aliyunEnvRoleKey) {
                this.aliyunEnvRoleKey = aliyunEnvRoleKey;
                return this;
            }

            /**
             * <p>Credential配置项列表</p>
             */
            public Builder credentialConfigItems(java.util.List<CredentialConfigItems> credentialConfigItems) {
                this.credentialConfigItems = credentialConfigItems;
                return this;
            }

            /**
             * <p>是否启用Credential注入</p>
             */
            public Builder enableCredentialInject(Boolean enableCredentialInject) {
                this.enableCredentialInject = enableCredentialInject;
                return this;
            }

            public CredentialConfig build() {
                return new CredentialConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class DataSources extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private DataSources(Builder builder) {
            this.datasetId = builder.datasetId;
            this.mountPath = builder.mountPath;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSources create() {
            return builder().build();
        }

        /**
         * @return datasetId
         */
        public String getDatasetId() {
            return this.datasetId;
        }

        /**
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String datasetId; 
            private String mountPath; 
            private String uri; 

            private Builder() {
            } 

            private Builder(DataSources model) {
                this.datasetId = model.datasetId;
                this.mountPath = model.mountPath;
                this.uri = model.uri;
            } 

            /**
             * <p>数据集ID</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>挂载路径</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>统一资源识别码</p>
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public DataSources build() {
                return new DataSources(this);
            } 

        } 

    }
    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class ComputingInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private ComputingInstances(Builder builder) {
            this.spotPriceLimit = builder.spotPriceLimit;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputingInstances create() {
            return builder().build();
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Float spotPriceLimit; 
            private String type; 

            private Builder() {
            } 

            private Builder(ComputingInstances model) {
                this.spotPriceLimit = model.spotPriceLimit;
                this.type = model.type;
            } 

            /**
             * <p>竞价出价</p>
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            /**
             * <p>机型</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ComputingInstances build() {
                return new ComputingInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class ComputingInstanceConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComputingInstances")
        private java.util.List<ComputingInstances> computingInstances;

        @com.aliyun.core.annotation.NameInMap("DisableSpotProtectionPeriod")
        private Boolean disableSpotProtectionPeriod;

        private ComputingInstanceConfig(Builder builder) {
            this.computingInstances = builder.computingInstances;
            this.disableSpotProtectionPeriod = builder.disableSpotProtectionPeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputingInstanceConfig create() {
            return builder().build();
        }

        /**
         * @return computingInstances
         */
        public java.util.List<ComputingInstances> getComputingInstances() {
            return this.computingInstances;
        }

        /**
         * @return disableSpotProtectionPeriod
         */
        public Boolean getDisableSpotProtectionPeriod() {
            return this.disableSpotProtectionPeriod;
        }

        public static final class Builder {
            private java.util.List<ComputingInstances> computingInstances; 
            private Boolean disableSpotProtectionPeriod; 

            private Builder() {
            } 

            private Builder(ComputingInstanceConfig model) {
                this.computingInstances = model.computingInstances;
                this.disableSpotProtectionPeriod = model.disableSpotProtectionPeriod;
            } 

            /**
             * <p>机器资源配置</p>
             */
            public Builder computingInstances(java.util.List<ComputingInstances> computingInstances) {
                this.computingInstances = computingInstances;
                return this;
            }

            /**
             * <p>是否启用竞价保留时长</p>
             */
            public Builder disableSpotProtectionPeriod(Boolean disableSpotProtectionPeriod) {
                this.disableSpotProtectionPeriod = disableSpotProtectionPeriod;
                return this;
            }

            public ComputingInstanceConfig build() {
                return new ComputingInstanceConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class EcsSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private Integer CPU;

        @com.aliyun.core.annotation.NameInMap("ComputingInstanceConfig")
        private ComputingInstanceConfig computingInstanceConfig;

        @com.aliyun.core.annotation.NameInMap("ExtraEphemeralStorage")
        private Integer extraEphemeralStorage;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private Integer GPU;

        @com.aliyun.core.annotation.NameInMap("GPUCorePercentage")
        private Integer GPUCorePercentage;

        @com.aliyun.core.annotation.NameInMap("GPUMemory")
        private Integer GPUMemory;

        @com.aliyun.core.annotation.NameInMap("GPUType")
        private String GPUType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("PodCount")
        private Integer podCount;

        @com.aliyun.core.annotation.NameInMap("QuotaId")
        private String quotaId;

        @com.aliyun.core.annotation.NameInMap("QuotaType")
        private String quotaType;

        @com.aliyun.core.annotation.NameInMap("ResourceBurstable")
        private Boolean resourceBurstable;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("SharedMemory")
        private Integer sharedMemory;

        private EcsSpec(Builder builder) {
            this.CPU = builder.CPU;
            this.computingInstanceConfig = builder.computingInstanceConfig;
            this.extraEphemeralStorage = builder.extraEphemeralStorage;
            this.GPU = builder.GPU;
            this.GPUCorePercentage = builder.GPUCorePercentage;
            this.GPUMemory = builder.GPUMemory;
            this.GPUType = builder.GPUType;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
            this.podCount = builder.podCount;
            this.quotaId = builder.quotaId;
            this.quotaType = builder.quotaType;
            this.resourceBurstable = builder.resourceBurstable;
            this.resourceId = builder.resourceId;
            this.sharedMemory = builder.sharedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EcsSpec create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public Integer getCPU() {
            return this.CPU;
        }

        /**
         * @return computingInstanceConfig
         */
        public ComputingInstanceConfig getComputingInstanceConfig() {
            return this.computingInstanceConfig;
        }

        /**
         * @return extraEphemeralStorage
         */
        public Integer getExtraEphemeralStorage() {
            return this.extraEphemeralStorage;
        }

        /**
         * @return GPU
         */
        public Integer getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUCorePercentage
         */
        public Integer getGPUCorePercentage() {
            return this.GPUCorePercentage;
        }

        /**
         * @return GPUMemory
         */
        public Integer getGPUMemory() {
            return this.GPUMemory;
        }

        /**
         * @return GPUType
         */
        public String getGPUType() {
            return this.GPUType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return memory
         */
        public Integer getMemory() {
            return this.memory;
        }

        /**
         * @return podCount
         */
        public Integer getPodCount() {
            return this.podCount;
        }

        /**
         * @return quotaId
         */
        public String getQuotaId() {
            return this.quotaId;
        }

        /**
         * @return quotaType
         */
        public String getQuotaType() {
            return this.quotaType;
        }

        /**
         * @return resourceBurstable
         */
        public Boolean getResourceBurstable() {
            return this.resourceBurstable;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return sharedMemory
         */
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public static final class Builder {
            private Integer CPU; 
            private ComputingInstanceConfig computingInstanceConfig; 
            private Integer extraEphemeralStorage; 
            private Integer GPU; 
            private Integer GPUCorePercentage; 
            private Integer GPUMemory; 
            private String GPUType; 
            private String instanceType; 
            private Integer memory; 
            private Integer podCount; 
            private String quotaId; 
            private String quotaType; 
            private Boolean resourceBurstable; 
            private String resourceId; 
            private Integer sharedMemory; 

            private Builder() {
            } 

            private Builder(EcsSpec model) {
                this.CPU = model.CPU;
                this.computingInstanceConfig = model.computingInstanceConfig;
                this.extraEphemeralStorage = model.extraEphemeralStorage;
                this.GPU = model.GPU;
                this.GPUCorePercentage = model.GPUCorePercentage;
                this.GPUMemory = model.GPUMemory;
                this.GPUType = model.GPUType;
                this.instanceType = model.instanceType;
                this.memory = model.memory;
                this.podCount = model.podCount;
                this.quotaId = model.quotaId;
                this.quotaType = model.quotaType;
                this.resourceBurstable = model.resourceBurstable;
                this.resourceId = model.resourceId;
                this.sharedMemory = model.sharedMemory;
            } 

            /**
             * <p>CPU信息</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>竞价资源配置</p>
             */
            public Builder computingInstanceConfig(ComputingInstanceConfig computingInstanceConfig) {
                this.computingInstanceConfig = computingInstanceConfig;
                return this;
            }

            /**
             * <p>额外系统盘</p>
             */
            public Builder extraEphemeralStorage(Integer extraEphemeralStorage) {
                this.extraEphemeralStorage = extraEphemeralStorage;
                return this;
            }

            /**
             * <p>GPU信息</p>
             */
            public Builder GPU(Integer GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>GPU算力占比</p>
             */
            public Builder GPUCorePercentage(Integer GPUCorePercentage) {
                this.GPUCorePercentage = GPUCorePercentage;
                return this;
            }

            /**
             * <p>GPU显存</p>
             */
            public Builder GPUMemory(Integer GPUMemory) {
                this.GPUMemory = GPUMemory;
                return this;
            }

            /**
             * <p>GPU类型</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>实例类型</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>内存信息</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>Pod数量</p>
             */
            public Builder podCount(Integer podCount) {
                this.podCount = podCount;
                return this;
            }

            /**
             * <p>资源配额ID</p>
             */
            public Builder quotaId(String quotaId) {
                this.quotaId = quotaId;
                return this;
            }

            /**
             * <p>资源配额类型</p>
             */
            public Builder quotaType(String quotaType) {
                this.quotaType = quotaType;
                return this;
            }

            /**
             * <p>是否启用弹性资源池</p>
             */
            public Builder resourceBurstable(Boolean resourceBurstable) {
                this.resourceBurstable = resourceBurstable;
                return this;
            }

            /**
             * <p>资源组ID</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>共享内存</p>
             */
            public Builder sharedMemory(Integer sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            public EcsSpec build() {
                return new EcsSpec(this);
            } 

        } 

    }
    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class Envs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Envs(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Envs create() {
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

            private Builder(Envs model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>环境键</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>环境值</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Envs build() {
                return new Envs(this);
            } 

        } 

    }
    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
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

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>标签键</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>标签值</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link Deployment} extends {@link TeaModel}
     *
     * <p>Deployment</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.securityGroupId = builder.securityGroupId;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserVpc create() {
            return builder().build();
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>安全组ID</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>交换机ID</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>VPC ID</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public UserVpc build() {
                return new UserVpc(this);
            } 

        } 

    }
}
