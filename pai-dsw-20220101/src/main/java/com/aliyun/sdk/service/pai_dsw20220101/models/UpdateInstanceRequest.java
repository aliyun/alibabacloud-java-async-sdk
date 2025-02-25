// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Affinity")
    private Affinity affinity;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CloudDisks")
    private java.util.List<CloudDisks> cloudDisks;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CredentialConfig")
    private CredentialConfig credentialConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Datasets")
    private java.util.List<Datasets> datasets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisassociateCredential")
    private Boolean disassociateCredential;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisassociateDatasets")
    private Boolean disassociateDatasets;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisassociateDriver")
    private Boolean disassociateDriver;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisassociateForwardInfos")
    private Boolean disassociateForwardInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DisassociateVpc")
    private Boolean disassociateVpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Driver")
    private String driver;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageAuth")
    private String imageAuth;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ImageUrl")
    private String imageUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestedResource")
    private RequestedResource requestedResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceSource")
    private String workspaceSource;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.accessibility = builder.accessibility;
        this.affinity = builder.affinity;
        this.cloudDisks = builder.cloudDisks;
        this.credentialConfig = builder.credentialConfig;
        this.datasets = builder.datasets;
        this.disassociateCredential = builder.disassociateCredential;
        this.disassociateDatasets = builder.disassociateDatasets;
        this.disassociateDriver = builder.disassociateDriver;
        this.disassociateForwardInfos = builder.disassociateForwardInfos;
        this.disassociateVpc = builder.disassociateVpc;
        this.driver = builder.driver;
        this.ecsSpec = builder.ecsSpec;
        this.imageAuth = builder.imageAuth;
        this.imageId = builder.imageId;
        this.imageUrl = builder.imageUrl;
        this.instanceName = builder.instanceName;
        this.priority = builder.priority;
        this.requestedResource = builder.requestedResource;
        this.userId = builder.userId;
        this.userVpc = builder.userVpc;
        this.workspaceSource = builder.workspaceSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return affinity
     */
    public Affinity getAffinity() {
        return this.affinity;
    }

    /**
     * @return cloudDisks
     */
    public java.util.List<CloudDisks> getCloudDisks() {
        return this.cloudDisks;
    }

    /**
     * @return credentialConfig
     */
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    /**
     * @return datasets
     */
    public java.util.List<Datasets> getDatasets() {
        return this.datasets;
    }

    /**
     * @return disassociateCredential
     */
    public Boolean getDisassociateCredential() {
        return this.disassociateCredential;
    }

    /**
     * @return disassociateDatasets
     */
    public Boolean getDisassociateDatasets() {
        return this.disassociateDatasets;
    }

    /**
     * @return disassociateDriver
     */
    public Boolean getDisassociateDriver() {
        return this.disassociateDriver;
    }

    /**
     * @return disassociateForwardInfos
     */
    public Boolean getDisassociateForwardInfos() {
        return this.disassociateForwardInfos;
    }

    /**
     * @return disassociateVpc
     */
    public Boolean getDisassociateVpc() {
        return this.disassociateVpc;
    }

    /**
     * @return driver
     */
    public String getDriver() {
        return this.driver;
    }

    /**
     * @return ecsSpec
     */
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    /**
     * @return imageAuth
     */
    public String getImageAuth() {
        return this.imageAuth;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return priority
     */
    public Long getPriority() {
        return this.priority;
    }

    /**
     * @return requestedResource
     */
    public RequestedResource getRequestedResource() {
        return this.requestedResource;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return userVpc
     */
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    /**
     * @return workspaceSource
     */
    public String getWorkspaceSource() {
        return this.workspaceSource;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String instanceId; 
        private String accessibility; 
        private Affinity affinity; 
        private java.util.List<CloudDisks> cloudDisks; 
        private CredentialConfig credentialConfig; 
        private java.util.List<Datasets> datasets; 
        private Boolean disassociateCredential; 
        private Boolean disassociateDatasets; 
        private Boolean disassociateDriver; 
        private Boolean disassociateForwardInfos; 
        private Boolean disassociateVpc; 
        private String driver; 
        private String ecsSpec; 
        private String imageAuth; 
        private String imageId; 
        private String imageUrl; 
        private String instanceName; 
        private Long priority; 
        private RequestedResource requestedResource; 
        private String userId; 
        private UserVpc userVpc; 
        private String workspaceSource; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.accessibility = request.accessibility;
            this.affinity = request.affinity;
            this.cloudDisks = request.cloudDisks;
            this.credentialConfig = request.credentialConfig;
            this.datasets = request.datasets;
            this.disassociateCredential = request.disassociateCredential;
            this.disassociateDatasets = request.disassociateDatasets;
            this.disassociateDriver = request.disassociateDriver;
            this.disassociateForwardInfos = request.disassociateForwardInfos;
            this.disassociateVpc = request.disassociateVpc;
            this.driver = request.driver;
            this.ecsSpec = request.ecsSpec;
            this.imageAuth = request.imageAuth;
            this.imageId = request.imageId;
            this.imageUrl = request.imageUrl;
            this.instanceName = request.instanceName;
            this.priority = request.priority;
            this.requestedResource = request.requestedResource;
            this.userId = request.userId;
            this.userVpc = request.userVpc;
            this.workspaceSource = request.workspaceSource;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * Affinity.
         */
        public Builder affinity(Affinity affinity) {
            this.putBodyParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * CloudDisks.
         */
        public Builder cloudDisks(java.util.List<CloudDisks> cloudDisks) {
            this.putBodyParameter("CloudDisks", cloudDisks);
            this.cloudDisks = cloudDisks;
            return this;
        }

        /**
         * CredentialConfig.
         */
        public Builder credentialConfig(CredentialConfig credentialConfig) {
            this.putBodyParameter("CredentialConfig", credentialConfig);
            this.credentialConfig = credentialConfig;
            return this;
        }

        /**
         * Datasets.
         */
        public Builder datasets(java.util.List<Datasets> datasets) {
            this.putBodyParameter("Datasets", datasets);
            this.datasets = datasets;
            return this;
        }

        /**
         * DisassociateCredential.
         */
        public Builder disassociateCredential(Boolean disassociateCredential) {
            this.putBodyParameter("DisassociateCredential", disassociateCredential);
            this.disassociateCredential = disassociateCredential;
            return this;
        }

        /**
         * DisassociateDatasets.
         */
        public Builder disassociateDatasets(Boolean disassociateDatasets) {
            this.putBodyParameter("DisassociateDatasets", disassociateDatasets);
            this.disassociateDatasets = disassociateDatasets;
            return this;
        }

        /**
         * DisassociateDriver.
         */
        public Builder disassociateDriver(Boolean disassociateDriver) {
            this.putBodyParameter("DisassociateDriver", disassociateDriver);
            this.disassociateDriver = disassociateDriver;
            return this;
        }

        /**
         * DisassociateForwardInfos.
         */
        public Builder disassociateForwardInfos(Boolean disassociateForwardInfos) {
            this.putBodyParameter("DisassociateForwardInfos", disassociateForwardInfos);
            this.disassociateForwardInfos = disassociateForwardInfos;
            return this;
        }

        /**
         * DisassociateVpc.
         */
        public Builder disassociateVpc(Boolean disassociateVpc) {
            this.putBodyParameter("DisassociateVpc", disassociateVpc);
            this.disassociateVpc = disassociateVpc;
            return this;
        }

        /**
         * Driver.
         */
        public Builder driver(String driver) {
            this.putBodyParameter("Driver", driver);
            this.driver = driver;
            return this;
        }

        /**
         * EcsSpec.
         */
        public Builder ecsSpec(String ecsSpec) {
            this.putBodyParameter("EcsSpec", ecsSpec);
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * ImageAuth.
         */
        public Builder imageAuth(String imageAuth) {
            this.putBodyParameter("ImageAuth", imageAuth);
            this.imageAuth = imageAuth;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageUrl.
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Priority.
         */
        public Builder priority(Long priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * RequestedResource.
         */
        public Builder requestedResource(RequestedResource requestedResource) {
            this.putBodyParameter("RequestedResource", requestedResource);
            this.requestedResource = requestedResource;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * UserVpc.
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * WorkspaceSource.
         */
        public Builder workspaceSource(String workspaceSource) {
            this.putBodyParameter("WorkspaceSource", workspaceSource);
            this.workspaceSource = workspaceSource;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class CPU extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        private CPU(Builder builder) {
            this.enable = builder.enable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CPU create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        public static final class Builder {
            private Boolean enable; 

            /**
             * Enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            public CPU build() {
                return new CPU(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class Affinity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private CPU CPU;

        private Affinity(Builder builder) {
            this.CPU = builder.CPU;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Affinity create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public CPU getCPU() {
            return this.CPU;
        }

        public static final class Builder {
            private CPU CPU; 

            /**
             * CPU.
             */
            public Builder CPU(CPU CPU) {
                this.CPU = CPU;
                return this;
            }

            public Affinity build() {
                return new Affinity(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class CloudDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        private CloudDisks(Builder builder) {
            this.capacity = builder.capacity;
            this.subType = builder.subType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudDisks create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public String getCapacity() {
            return this.capacity;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        public static final class Builder {
            private String capacity; 
            private String subType; 

            /**
             * Capacity.
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            public CloudDisks build() {
                return new CloudDisks(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class Datasets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DatasetId")
        private String datasetId;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("OptionType")
        @Deprecated
        private String optionType;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("Uri")
        private String uri;

        private Datasets(Builder builder) {
            this.datasetId = builder.datasetId;
            this.mountPath = builder.mountPath;
            this.optionType = builder.optionType;
            this.options = builder.options;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Datasets create() {
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
         * @return optionType
         */
        public String getOptionType() {
            return this.optionType;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
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
            private String optionType; 
            private String options; 
            private String uri; 

            /**
             * DatasetId.
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * MountPath.
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * OptionType.
             */
            public Builder optionType(String optionType) {
                this.optionType = optionType;
                return this;
            }

            /**
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * Uri.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class RequestedResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CPU")
        private String CPU;

        @com.aliyun.core.annotation.NameInMap("GPU")
        private String GPU;

        @com.aliyun.core.annotation.NameInMap("GPUType")
        private String GPUType;

        @com.aliyun.core.annotation.NameInMap("Memory")
        private String memory;

        @com.aliyun.core.annotation.NameInMap("SharedMemory")
        private String sharedMemory;

        private RequestedResource(Builder builder) {
            this.CPU = builder.CPU;
            this.GPU = builder.GPU;
            this.GPUType = builder.GPUType;
            this.memory = builder.memory;
            this.sharedMemory = builder.sharedMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RequestedResource create() {
            return builder().build();
        }

        /**
         * @return CPU
         */
        public String getCPU() {
            return this.CPU;
        }

        /**
         * @return GPU
         */
        public String getGPU() {
            return this.GPU;
        }

        /**
         * @return GPUType
         */
        public String getGPUType() {
            return this.GPUType;
        }

        /**
         * @return memory
         */
        public String getMemory() {
            return this.memory;
        }

        /**
         * @return sharedMemory
         */
        public String getSharedMemory() {
            return this.sharedMemory;
        }

        public static final class Builder {
            private String CPU; 
            private String GPU; 
            private String GPUType; 
            private String memory; 
            private String sharedMemory; 

            /**
             * CPU.
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * GPU.
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * GPUType.
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * Memory.
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * SharedMemory.
             */
            public Builder sharedMemory(String sharedMemory) {
                this.sharedMemory = sharedMemory;
                return this;
            }

            public RequestedResource build() {
                return new RequestedResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class UserVpc extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultRoute")
        private String defaultRoute;

        @com.aliyun.core.annotation.NameInMap("ExtendedCIDRs")
        private java.util.List<String> extendedCIDRs;

        @com.aliyun.core.annotation.NameInMap("ForwardInfos")
        private java.util.List<ForwardInfo> forwardInfos;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private UserVpc(Builder builder) {
            this.defaultRoute = builder.defaultRoute;
            this.extendedCIDRs = builder.extendedCIDRs;
            this.forwardInfos = builder.forwardInfos;
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
         * @return forwardInfos
         */
        public java.util.List<ForwardInfo> getForwardInfos() {
            return this.forwardInfos;
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
            private java.util.List<ForwardInfo> forwardInfos; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            /**
             * DefaultRoute.
             */
            public Builder defaultRoute(String defaultRoute) {
                this.defaultRoute = defaultRoute;
                return this;
            }

            /**
             * ExtendedCIDRs.
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * ForwardInfos.
             */
            public Builder forwardInfos(java.util.List<ForwardInfo> forwardInfos) {
                this.forwardInfos = forwardInfos;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * VpcId.
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
