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
 * {@link Runtime} extends {@link TeaModel}
 *
 * <p>Runtime</p>
 */
public class Runtime extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private EcsSpec ecsSpec;

    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.List<Envs> envs;

    @com.aliyun.core.annotation.NameInMap("FlowId")
    private String flowId;

    @com.aliyun.core.annotation.NameInMap("Flows")
    private java.util.List<Flows> flows;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private String latestVersion;

    @com.aliyun.core.annotation.NameInMap("MCPConfig")
    private String MCPConfig;

    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.NameInMap("RunTimeout")
    private Integer runTimeout;

    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    private String runtimeId;

    @com.aliyun.core.annotation.NameInMap("RuntimeLog")
    private String runtimeLog;

    @com.aliyun.core.annotation.NameInMap("RuntimeName")
    private String runtimeName;

    @com.aliyun.core.annotation.NameInMap("RuntimeStatus")
    private String runtimeStatus;

    @com.aliyun.core.annotation.NameInMap("RuntimeType")
    private String runtimeType;

    @com.aliyun.core.annotation.NameInMap("SupportSSEStream")
    private Boolean supportSSEStream;

    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("WorkDir")
    private String workDir;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private Runtime(Builder builder) {
        this.accessibility = builder.accessibility;
        this.creator = builder.creator;
        this.credentialConfig = builder.credentialConfig;
        this.dataSources = builder.dataSources;
        this.ecsSpec = builder.ecsSpec;
        this.envs = builder.envs;
        this.flowId = builder.flowId;
        this.flows = builder.flows;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.idleTimeout = builder.idleTimeout;
        this.labels = builder.labels;
        this.latestVersion = builder.latestVersion;
        this.MCPConfig = builder.MCPConfig;
        this.resourceId = builder.resourceId;
        this.runTimeout = builder.runTimeout;
        this.runtimeId = builder.runtimeId;
        this.runtimeLog = builder.runtimeLog;
        this.runtimeName = builder.runtimeName;
        this.runtimeStatus = builder.runtimeStatus;
        this.runtimeType = builder.runtimeType;
        this.supportSSEStream = builder.supportSSEStream;
        this.userVpc = builder.userVpc;
        this.version = builder.version;
        this.workDir = builder.workDir;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Runtime create() {
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
     * @return ecsSpec
     */
    public EcsSpec getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return envs
     */
    public java.util.List<Envs> getEnvs() {
        return this.envs;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return flows
     */
    public java.util.List<Flows> getFlows() {
        return this.flows;
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
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
    }

    /**
     * @return latestVersion
     */
    public String getLatestVersion() {
        return this.latestVersion;
    }

    /**
     * @return MCPConfig
     */
    public String getMCPConfig() {
        return this.MCPConfig;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return runTimeout
     */
    public Integer getRunTimeout() {
        return this.runTimeout;
    }

    /**
     * @return runtimeId
     */
    public String getRuntimeId() {
        return this.runtimeId;
    }

    /**
     * @return runtimeLog
     */
    public String getRuntimeLog() {
        return this.runtimeLog;
    }

    /**
     * @return runtimeName
     */
    public String getRuntimeName() {
        return this.runtimeName;
    }

    /**
     * @return runtimeStatus
     */
    public String getRuntimeStatus() {
        return this.runtimeStatus;
    }

    /**
     * @return runtimeType
     */
    public String getRuntimeType() {
        return this.runtimeType;
    }

    /**
     * @return supportSSEStream
     */
    public Boolean getSupportSSEStream() {
        return this.supportSSEStream;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
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
        private String creator; 
        private CredentialConfig credentialConfig; 
        private java.util.List<DataSources> dataSources; 
        private EcsSpec ecsSpec; 
        private java.util.List<Envs> envs; 
        private String flowId; 
        private java.util.List<Flows> flows; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private Integer idleTimeout; 
        private java.util.List<Labels> labels; 
        private String latestVersion; 
        private String MCPConfig; 
        private String resourceId; 
        private Integer runTimeout; 
        private String runtimeId; 
        private String runtimeLog; 
        private String runtimeName; 
        private String runtimeStatus; 
        private String runtimeType; 
        private Boolean supportSSEStream; 
        private UserVpc userVpc; 
        private String version; 
        private String workDir; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(Runtime model) {
            this.accessibility = model.accessibility;
            this.creator = model.creator;
            this.credentialConfig = model.credentialConfig;
            this.dataSources = model.dataSources;
            this.ecsSpec = model.ecsSpec;
            this.envs = model.envs;
            this.flowId = model.flowId;
            this.flows = model.flows;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.idleTimeout = model.idleTimeout;
            this.labels = model.labels;
            this.latestVersion = model.latestVersion;
            this.MCPConfig = model.MCPConfig;
            this.resourceId = model.resourceId;
            this.runTimeout = model.runTimeout;
            this.runtimeId = model.runtimeId;
            this.runtimeLog = model.runtimeLog;
            this.runtimeName = model.runtimeName;
            this.runtimeStatus = model.runtimeStatus;
            this.runtimeType = model.runtimeType;
            this.supportSSEStream = model.supportSSEStream;
            this.userVpc = model.userVpc;
            this.version = model.version;
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
         * EcsSpec.
         */
        public Builder ecsSpec(EcsSpec ecsSpec) {
            this.ecsSpec = ecsSpec;
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
         * FlowId.
         */
        public Builder flowId(String flowId) {
            this.flowId = flowId;
            return this;
        }

        /**
         * Flows.
         */
        public Builder flows(java.util.List<Flows> flows) {
            this.flows = flows;
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
         * IdleTimeout.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
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
         * LatestVersion.
         */
        public Builder latestVersion(String latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * MCPConfig.
         */
        public Builder MCPConfig(String MCPConfig) {
            this.MCPConfig = MCPConfig;
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
         * RunTimeout.
         */
        public Builder runTimeout(Integer runTimeout) {
            this.runTimeout = runTimeout;
            return this;
        }

        /**
         * RuntimeId.
         */
        public Builder runtimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }

        /**
         * RuntimeLog.
         */
        public Builder runtimeLog(String runtimeLog) {
            this.runtimeLog = runtimeLog;
            return this;
        }

        /**
         * RuntimeName.
         */
        public Builder runtimeName(String runtimeName) {
            this.runtimeName = runtimeName;
            return this;
        }

        /**
         * RuntimeStatus.
         */
        public Builder runtimeStatus(String runtimeStatus) {
            this.runtimeStatus = runtimeStatus;
            return this;
        }

        /**
         * RuntimeType.
         */
        public Builder runtimeType(String runtimeType) {
            this.runtimeType = runtimeType;
            return this;
        }

        /**
         * SupportSSEStream.
         */
        public Builder supportSSEStream(Boolean supportSSEStream) {
            this.supportSSEStream = supportSSEStream;
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
         * Version.
         */
        public Builder version(String version) {
            this.version = version;
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

        public Runtime build() {
            return new Runtime(this);
        } 

    } 

    /**
     * 
     * {@link Runtime} extends {@link TeaModel}
     *
     * <p>Runtime</p>
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
     * {@link Runtime} extends {@link TeaModel}
     *
     * <p>Runtime</p>
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
     * {@link Runtime} extends {@link TeaModel}
     *
     * <p>Runtime</p>
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
     * {@link Runtime} extends {@link TeaModel}
     *
     * <p>Runtime</p>
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
     * {@link Runtime} extends {@link TeaModel}
     *
     * <p>Runtime</p>
     */
    public static class EcsSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private Integer CPU;

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

        @com.aliyun.core.annotation.NameInMap("SharedMemory")
        private Integer sharedMemory;

        private EcsSpec(Builder builder) {
            this.CPU = builder.CPU;
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
         * @return sharedMemory
         */
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public static final class Builder {
            private Integer CPU; 
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
            private Integer sharedMemory; 

            private Builder() {
            } 

            private Builder(EcsSpec model) {
                this.CPU = model.CPU;
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
     * {@link Runtime} extends {@link TeaModel}
     *
     * <p>Runtime</p>
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
     * {@link Runtime} extends {@link TeaModel}
     *
     * <p>Runtime</p>
     */
    public static class Flows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        private Flows(Builder builder) {
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flows create() {
            return builder().build();
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        public static final class Builder {
            private String flowId; 
            private String flowName; 

            private Builder() {
            } 

            private Builder(Flows model) {
                this.flowId = model.flowId;
                this.flowName = model.flowName;
            } 

            /**
             * <p>应用流ID</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>应用流名称</p>
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            public Flows build() {
                return new Flows(this);
            } 

        } 

    }
    /**
     * 
     * {@link Runtime} extends {@link TeaModel}
     *
     * <p>Runtime</p>
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
     * {@link Runtime} extends {@link TeaModel}
     *
     * <p>Runtime</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRoute")
        private String defaultRoute;

        @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
        private java.util.List<String> extendedCIDRs;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.defaultRoute = builder.defaultRoute;
            this.extendedCIDRs = builder.extendedCIDRs;
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
         * @return defaultRoute
         */
        public String getDefaultRoute() {
            return this.defaultRoute;
        }

        /**
         * @return extendedCIDRs
         */
        public java.util.List<String> getExtendedCIDRs() {
            return this.extendedCIDRs;
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
            private String defaultRoute; 
            private java.util.List<String> extendedCIDRs; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.defaultRoute = model.defaultRoute;
                this.extendedCIDRs = model.extendedCIDRs;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>默认路由</p>
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * <p>扩展网段</p>
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
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
