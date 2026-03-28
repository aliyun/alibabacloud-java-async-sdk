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
 * {@link CreateRuntimeRequest} extends {@link RequestModel}
 *
 * <p>CreateRuntimeRequest</p>
 */
public class CreateRuntimeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AutoUpdateImage")
    private Boolean autoUpdateImage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSources")
    private java.util.List<DataSources> dataSources;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private EcsSpec ecsSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Envs")
    private java.util.List<Envs> envs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RunTimeout")
    private Integer runTimeout;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeName")
    private String runtimeName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeType")
    private String runtimeType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkDir")
    private String workDir;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateRuntimeRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.autoUpdateImage = builder.autoUpdateImage;
        this.credentialConfig = builder.credentialConfig;
        this.dataSources = builder.dataSources;
        this.ecsSpec = builder.ecsSpec;
        this.envs = builder.envs;
        this.labels = builder.labels;
        this.resourceId = builder.resourceId;
        this.runTimeout = builder.runTimeout;
        this.runtimeName = builder.runtimeName;
        this.runtimeType = builder.runtimeType;
        this.userVpc = builder.userVpc;
        this.workDir = builder.workDir;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuntimeRequest create() {
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
     * @return autoUpdateImage
     */
    public Boolean getAutoUpdateImage() {
        return this.autoUpdateImage;
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
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
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
     * @return runtimeName
     */
    public String getRuntimeName() {
        return this.runtimeName;
    }

    /**
     * @return runtimeType
     */
    public String getRuntimeType() {
        return this.runtimeType;
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

    public static final class Builder extends Request.Builder<CreateRuntimeRequest, Builder> {
        private String accessibility; 
        private Boolean autoUpdateImage; 
        private CredentialConfig credentialConfig; 
        private java.util.List<DataSources> dataSources; 
        private EcsSpec ecsSpec; 
        private java.util.List<Envs> envs; 
        private java.util.List<Labels> labels; 
        private String resourceId; 
        private Integer runTimeout; 
        private String runtimeName; 
        private String runtimeType; 
        private UserVpc userVpc; 
        private String workDir; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRuntimeRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.autoUpdateImage = request.autoUpdateImage;
            this.credentialConfig = request.credentialConfig;
            this.dataSources = request.dataSources;
            this.ecsSpec = request.ecsSpec;
            this.envs = request.envs;
            this.labels = request.labels;
            this.resourceId = request.resourceId;
            this.runTimeout = request.runTimeout;
            this.runtimeName = request.runtimeName;
            this.runtimeType = request.runtimeType;
            this.userVpc = request.userVpc;
            this.workDir = request.workDir;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>Workspace visibility. Possible values are:</p>
         * <ul>
         * <li>PRIVATE: In this workspace, visible only to you and administrators.</li>
         * <li>PUBLIC: In this workspace, visible to everyone.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * AutoUpdateImage.
         */
        public Builder autoUpdateImage(Boolean autoUpdateImage) {
            this.putBodyParameter("AutoUpdateImage", autoUpdateImage);
            this.autoUpdateImage = autoUpdateImage;
            return this;
        }

        /**
         * <p>The credential configuration.</p>
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            this.putBodyParameter("CredentialConfig", credentialConfig);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * <p>Mount data source.</p>
         */
        public Builder dataSources(java.util.List<DataSources> dataSources) {
            this.putBodyParameter("DataSources", dataSources);
            this.dataSources = dataSources;
            return this;
        }

        /**
         * <p>The configurations of ECS resources.</p>
         */
        public Builder ecsSpec(EcsSpec ecsSpec) {
            this.putBodyParameter("EcsSpec", ecsSpec);
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * <p>The environment variables. Separate the environment variables with commas (,).</p>
         */
        public Builder envs(java.util.List<Envs> envs) {
            this.putBodyParameter("Envs", envs);
            this.envs = envs;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The resource quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>quota18******zv9</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>Timeout in seconds for a single test executed on the runtime.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        public Builder runTimeout(Integer runTimeout) {
            this.putBodyParameter("RunTimeout", runTimeout);
            this.runTimeout = runTimeout;
            return this;
        }

        /**
         * <p>The name of the container runtime. Format requirements:</p>
         * <ul>
         * <li>Can only contain English letters, digits, and underscores (_).</li>
         * <li>Starts with a letter.</li>
         * <li>The length must be 1 to 256 characters.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dev01</p>
         */
        public Builder runtimeName(String runtimeName) {
            this.putBodyParameter("RuntimeName", runtimeName);
            this.runtimeName = runtimeName;
            return this;
        }

        /**
         * <p>The runtime type used by the nodes. Valid values:</p>
         * <ul>
         * <li>DSW: PAI-DSW instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DSW</p>
         */
        public Builder runtimeType(String runtimeType) {
            this.putBodyParameter("RuntimeType", runtimeType);
            this.runtimeType = runtimeType;
            return this;
        }

        /**
         * <p>User VPC Configuration.</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>The OSS path of the working directory.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket.oss-cn-hangzhou-internal.aliyuncs.com/workdir/</p>
         */
        public Builder workDir(String workDir) {
            this.putBodyParameter("WorkDir", workDir);
            this.workDir = workDir;
            return this;
        }

        /**
         * <p>The ID of the workspace. To obtain the workspace ID, see <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>174***</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateRuntimeRequest build() {
            return new CreateRuntimeRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRuntimeRequest} extends {@link TeaModel}
     *
     * <p>CreateRuntimeRequest</p>
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
             * <p>The entity to which the role is assigned.</p>
             * 
             * <strong>example:</strong>
             * <p>1095******785714</p>
             */
            public Builder assumeRoleFor(String assumeRoleFor) {
                this.assumeRoleFor = assumeRoleFor;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the RAM role.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1095******785714:role/testrole</p>
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            /**
             * <p>The class of the role. Valid values:</p>
             * <ul>
             * <li>service: assumed by the service;</li>
             * <li>user: assumed by the regular user account</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>service</p>
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
     * {@link CreateRuntimeRequest} extends {@link TeaModel}
     *
     * <p>CreateRuntimeRequest</p>
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
             * <p>The key that identifies the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The list of configured roles.</p>
             */
            public Builder roles(java.util.List<Roles> roles) {
                this.roles = roles;
                return this;
            }

            /**
             * <p>The configuration type. Valid values:</p>
             * <ul>
             * <li>Role: role assumption</li>
             * <li>RoleChain: role chain assumption</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Role</p>
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
     * {@link CreateRuntimeRequest} extends {@link TeaModel}
     *
     * <p>CreateRuntimeRequest</p>
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
             * <p>The key of the environment variable role.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder aliyunEnvRoleKey(String aliyunEnvRoleKey) {
                this.aliyunEnvRoleKey = aliyunEnvRoleKey;
                return this;
            }

            /**
             * <p>The list of credential configurations.</p>
             */
            public Builder credentialConfigItems(java.util.List<CredentialConfigItems> credentialConfigItems) {
                this.credentialConfigItems = credentialConfigItems;
                return this;
            }

            /**
             * <p>Whether to enable credential injection.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
     * {@link CreateRuntimeRequest} extends {@link TeaModel}
     *
     * <p>CreateRuntimeRequest</p>
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
             * <p>The ID of the dataset. Choose either Uri or another option.</p>
             * 
             * <strong>example:</strong>
             * <p>d-umns******zij4szhc</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The path to which the data disk is mounted.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The OSS path of the data source. You must choose either DatasetId or another option.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket.oss-cn-hangzhou-internal.aliyuncs.com/langstudio/source/</p>
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
     * {@link CreateRuntimeRequest} extends {@link TeaModel}
     *
     * <p>CreateRuntimeRequest</p>
     */
    public static class EcsSpec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private Integer CPU;

        @com.aliyun.core.annotation.NameInMap("Driver")
        private String driver;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private Integer GPU;

        @com.aliyun.core.annotation.NameInMap("GPUType")
        private String GPUType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private Integer memory;

        @com.aliyun.core.annotation.NameInMap("SharedMemory")
        private Integer sharedMemory;

        private EcsSpec(Builder builder) {
            this.CPU = builder.CPU;
            this.driver = builder.driver;
            this.GPU = builder.GPU;
            this.GPUType = builder.GPUType;
            this.instanceType = builder.instanceType;
            this.memory = builder.memory;
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
         * @return driver
         */
        public String getDriver() {
            return this.driver;
        }

        /**
         * @return GPU
         */
        public Integer getGPU() {
            return this.GPU;
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
         * @return sharedMemory
         */
        public Integer getSharedMemory() {
            return this.sharedMemory;
        }

        public static final class Builder {
            private Integer CPU; 
            private String driver; 
            private Integer GPU; 
            private String GPUType; 
            private String instanceType; 
            private Integer memory; 
            private Integer sharedMemory; 

            private Builder() {
            } 

            private Builder(EcsSpec model) {
                this.CPU = model.CPU;
                this.driver = model.driver;
                this.GPU = model.GPU;
                this.GPUType = model.GPUType;
                this.instanceType = model.instanceType;
                this.memory = model.memory;
                this.sharedMemory = model.sharedMemory;
            } 

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder CPU(Integer CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The version of the GPU driver.</p>
             * 
             * <strong>example:</strong>
             * <p>535.161.08</p>
             */
            public Builder driver(String driver) {
                this.driver = driver;
                return this;
            }

            /**
             * <p>The number of the GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder GPU(Integer GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>The GPU Class. Valid values are as follows:</p>
             * <ul>
             * <li>V100</li>
             * <li>A100</li>
             * <li>T4</li>
             * <li>A10</li>
             * <li>P100</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>V100</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>Instance Type</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.c6.large</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The memory size, in GB.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder memory(Integer memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The shared memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
     * {@link CreateRuntimeRequest} extends {@link TeaModel}
     *
     * <p>CreateRuntimeRequest</p>
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
             * <p>The environment key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the environment.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue1</p>
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
     * {@link CreateRuntimeRequest} extends {@link TeaModel}
     *
     * <p>CreateRuntimeRequest</p>
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
             * <p>Tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>Tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>testValue1</p>
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
     * {@link CreateRuntimeRequest} extends {@link TeaModel}
     *
     * <p>CreateRuntimeRequest</p>
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
             * <p>The default Ingress.</p>
             * 
             * <strong>example:</strong>
             * <p>eth0</p>
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * <p>The extended CIDR blocks.</p>
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * <p>The ID of a security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-wz9i****1129</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch IDs.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-wz9r****ng10</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-wz90****5v23</p>
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
