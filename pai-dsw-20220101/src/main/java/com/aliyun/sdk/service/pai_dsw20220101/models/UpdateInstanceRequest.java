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
    @com.aliyun.core.annotation.NameInMap("DynamicMount")
    private DynamicMount dynamicMount;

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
        this.dynamicMount = builder.dynamicMount;
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
     * @return dynamicMount
     */
    public DynamicMount getDynamicMount() {
        return this.dynamicMount;
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
        private DynamicMount dynamicMount; 
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
            this.dynamicMount = request.dynamicMount;
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
         * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/470439.html">ListInstances</a> to obtain the instance ID.</p>
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
         * <p>The visibility of the instance.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PUBLIC: Accessible to all members in the workspace.</li>
         * <li>PRIVATE: Accessible only to you and the administrator of the workspace.</li>
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
         * <p>The affinity configuration.</p>
         */
        public Builder affinity(Affinity affinity) {
            this.putBodyParameter("Affinity", affinity);
            this.affinity = affinity;
            return this;
        }

        /**
         * <p>The cloud disks.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        public Builder cloudDisks(java.util.List<CloudDisks> cloudDisks) {
            this.putBodyParameter("CloudDisks", cloudDisks);
            this.cloudDisks = cloudDisks;
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
         * <p>The datasets.</p>
         */
        public Builder datasets(java.util.List<Datasets> datasets) {
            this.putBodyParameter("Datasets", datasets);
            this.datasets = datasets;
            return this;
        }

        /**
         * <p>Specifies whether to delete the credential injection information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disassociateCredential(Boolean disassociateCredential) {
            this.putBodyParameter("DisassociateCredential", disassociateCredential);
            this.disassociateCredential = disassociateCredential;
            return this;
        }

        /**
         * <p>Specifies whether to delete the associated datasets.</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disassociateDatasets(Boolean disassociateDatasets) {
            this.putBodyParameter("DisassociateDatasets", disassociateDatasets);
            this.disassociateDatasets = disassociateDatasets;
            return this;
        }

        /**
         * <p>Specifies whether to delete the NVIDIA driver configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disassociateDriver(Boolean disassociateDriver) {
            this.putBodyParameter("DisassociateDriver", disassociateDriver);
            this.disassociateDriver = disassociateDriver;
            return this;
        }

        /**
         * <p>Specifies whether to delete the associated forward information.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disassociateForwardInfos(Boolean disassociateForwardInfos) {
            this.putBodyParameter("DisassociateForwardInfos", disassociateForwardInfos);
            this.disassociateForwardInfos = disassociateForwardInfos;
            return this;
        }

        /**
         * <p>Specifies whether to delete the associated user VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder disassociateVpc(Boolean disassociateVpc) {
            this.putBodyParameter("DisassociateVpc", disassociateVpc);
            this.disassociateVpc = disassociateVpc;
            return this;
        }

        /**
         * <p>The NVIDIA driver configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>535.54.03</p>
         */
        public Builder driver(String driver) {
            this.putBodyParameter("Driver", driver);
            this.driver = driver;
            return this;
        }

        /**
         * <p>The dynamic mount configuration.</p>
         */
        public Builder dynamicMount(DynamicMount dynamicMount) {
            this.putBodyParameter("DynamicMount", dynamicMount);
            this.dynamicMount = dynamicMount;
            return this;
        }

        /**
         * <p>The ECS instance type of the instance. You can call <a href="https://help.aliyun.com/document_detail/470423.html">ListEcsSpecs</a> to obtain the ECS instance type.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        public Builder ecsSpec(String ecsSpec) {
            this.putBodyParameter("EcsSpec", ecsSpec);
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * <p>The Base64-encoded account and password for the user‘s private image. The password will be hidden.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder imageAuth(String imageAuth) {
            this.putBodyParameter("ImageAuth", imageAuth);
            this.imageAuth = imageAuth;
            return this;
        }

        /**
         * <p>The image ID. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>image-05cefd0be2exxxx</p>
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The image address. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image address.</p>
         * 
         * <strong>example:</strong>
         * <p>registry.cn-shanghai.aliyuncs.com/pai_product/tensorflow:py36_cpu_tf1.12_ubuntu</p>
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * <p>The instance name. Format requirements:</p>
         * <ul>
         * <li>The name can contain only letters, digits, and underscores (_).</li>
         * <li>The name can be up to 27 characters in length.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>training_data</p>
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The priority based on which resources are allocated to instances. Valid values: 1 to 9.</p>
         * <ul>
         * <li>1: the lowest priority.</li>
         * <li>9 is the highest priority.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Long priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The resource configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;CPU&quot;:&quot;4&quot;,&quot;Memory&quot;:&quot;8Gi&quot;,&quot;SharedMemory&quot;:&quot;4Gi&quot;,&quot;GPU&quot;:&quot;1&quot;,&quot;GPUType&quot;:&quot;Tesla-V100-16G&quot;}</p>
         */
        public Builder requestedResource(RequestedResource requestedResource) {
            this.putBodyParameter("RequestedResource", requestedResource);
            this.requestedResource = requestedResource;
            return this;
        }

        /**
         * <p>the User ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>16122**********</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * <p>The virtual private cloud (VPC) configurations.</p>
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * <p>Specifies the storage corresponding to the working directory. You can mount disks or datasets to /mnt/workspace at the same time. OSS datasets and dynamically mounted datasets are not supported.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>rootfsCloudDisk: Mount disk to the working directory.</li>
         * <li>Mount path of the dataset, such as /mnt/data: Datasets in URI format only support this method.</li>
         * <li>Dataset ID, such as d-vsqjvs****rp5l206u: If a single dataset is mounted to multiple paths, the first path is selected. We recommend that you do not use this method, use the mount path instead.</li>
         * </ul>
         * <p>If you leave this parameter empty:</p>
         * <ul>
         * <li>If the instance uses cloud disks, cloud disks are selected by default.</li>
         * <li>if no disks are available, the first NAS or CPFS dataset is selected as the working directory.</li>
         * <li>If no disk, NAS, or CPFS datasets is available, the host space is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/mnt/data</p>
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

            private Builder() {
            } 

            private Builder(CPU model) {
                this.enable = model.enable;
            } 

            /**
             * <p>Specifies whether CPU affinity is enabled.</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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

            private Builder() {
            } 

            private Builder(Affinity model) {
                this.CPU = model.CPU;
            } 

            /**
             * <p>The CPU affinity configuration. Only subscription instances that use general-purpose computing resources support CPU affinity configuration.</p>
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

            private Builder() {
            } 

            private Builder(CloudDisks model) {
                this.capacity = model.capacity;
                this.subType = model.subType;
            } 

            /**
             * <p>If <strong>Resource Type</strong> is <strong>Public Resource</strong> or if <strong>Resource Quota</strong> is subscription-based general-purpose computing resources (CPU cores ≥ 2 and memory ≥ 4 GB, or configured with GPU):</p>
             * <p>Each instance has a free system disk quota of 100 GiB for persistent storage. <strong>If the DSW instance is stopped and not launched for more than 15 days, the disk is cleared</strong>. The disk can be expanded. For specific pricing, refer to the console.</p>
             * <p>**</p>
             * <p><strong>Warning</strong></p>
             * <ul>
             * <li><p>After the expansion, you cannot reduce the storage space. Proceed with caution.</p>
             * </li>
             * <li><p>After the expansion, the disk is not cleared if the instance is stopped for more than 15 days. However, it will continue to incur fees.</p>
             * </li>
             * <li><p>If you delete the instance, the system disk is also released and the data stored in the disk is deleted. Make sure that you have backed up your data before you delete the instance.</p>
             * </li>
             * </ul>
             * <p>If you need persistent storage, you can <strong>mount a dataset</strong> or add the OSS, NAS, or CPFS path to the <strong>storage path</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>100Gi</p>
             */
            public Builder capacity(String capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>Disk type:</p>
             * <ul>
             * <li>rootfs: Mounts the disk as a system disk. The system environment is stored on the disk.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>rootfs</p>
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

        @com.aliyun.core.annotation.NameInMap("DatasetVersion")
        private String datasetVersion;

        @com.aliyun.core.annotation.NameInMap("Dynamic")
        private Boolean dynamic;

        @com.aliyun.core.annotation.NameInMap("MountAccess")
        private String mountAccess;

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
            this.datasetVersion = builder.datasetVersion;
            this.dynamic = builder.dynamic;
            this.mountAccess = builder.mountAccess;
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
         * @return datasetVersion
         */
        public String getDatasetVersion() {
            return this.datasetVersion;
        }

        /**
         * @return dynamic
         */
        public Boolean getDynamic() {
            return this.dynamic;
        }

        /**
         * @return mountAccess
         */
        public String getMountAccess() {
            return this.mountAccess;
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
            private String datasetVersion; 
            private Boolean dynamic; 
            private String mountAccess; 
            private String mountPath; 
            private String optionType; 
            private String options; 
            private String uri; 

            private Builder() {
            } 

            private Builder(Datasets model) {
                this.datasetId = model.datasetId;
                this.datasetVersion = model.datasetVersion;
                this.dynamic = model.dynamic;
                this.mountAccess = model.mountAccess;
                this.mountPath = model.mountPath;
                this.optionType = model.optionType;
                this.options = model.options;
                this.uri = model.uri;
            } 

            /**
             * <p>The dataset ID. If the dataset is read-only, you cannot change the dataset pemission from read-only to read and write by using MountAccess.</p>
             * <p>You can call <a href="https://help.aliyun.com/document_detail/457222.html">ListDatasets</a> to obtain the dataset ID. If you configure the dataset ID, you cannot configure the dataset URI.</p>
             * 
             * <strong>example:</strong>
             * <p>d-vsqjvsjp4orp5l206u</p>
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * <p>The dataset version. You must also configure DatasetId. If you leave this parameter empty, the value v1 is used by default.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder datasetVersion(String datasetVersion) {
                this.datasetVersion = datasetVersion;
                return this;
            }

            /**
             * <p>Specifies whether dynamic mounting is enabled. Default value: false.</p>
             * <ul>
             * <li>Currently, only instances using general-purpose computing resources are supported.</li>
             * <li>Currently, only OSS datasets are supported. The mounted datasets are read-only.</li>
             * <li>The MountPath of the dynamically mounted dataset must be a subpath of the root path. Example: /mnt/dynamic/data1/</li>
             * <li>A dynamically mounted dataset must be after non-dynamic datasets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder dynamic(Boolean dynamic) {
                this.dynamic = dynamic;
                return this;
            }

            /**
             * <p>The read and write permissions of the dataset. If the dataset is read-only, it cannot be changed to read and write.</p>
             * 
             * <strong>example:</strong>
             * <p>RW</p>
             */
            public Builder mountAccess(String mountAccess) {
                this.mountAccess = mountAccess;
                return this;
            }

            /**
             * <p>The mount path of the dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/data</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The mount type. You cannot specify Options at the same time. This is deprecated, you can use Options instead.</p>
             * 
             * <strong>example:</strong>
             * <p>ReadOnly</p>
             */
            public Builder optionType(String optionType) {
                this.optionType = optionType;
                return this;
            }

            /**
             * <p>The custom dataset mount options. Only OSS is supported. You cannot specify OptionType at the same time. For more information, see <a href="https://www.alibabacloud.com/help/en/pai/user-guide/read-and-write-dataset-data">DSW mount configurations</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;fs.oss.download.thread.concurrency&quot;: &quot;10&quot;,
             *   &quot;fs.oss.upload.thread.concurrency&quot;: &quot;10&quot;,
             *   &quot;fs.jindo.args&quot;: &quot;-oattr_timeout=3 -oentry_timeout=0 -onegative_timeout=0 -oauto_cache -ono_symlink&quot;
             * }</p>
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * <p>The URI of the storage service directory, which can be directly mounted. This parameter is mutually exclusive with DatasetId.</p>
             * <p>URI formats of different types of storage:</p>
             * <ul>
             * <li>OSS: oss://bucket-name.oss-cn-shanghai-internal.aliyuncs.com/data/path/</li>
             * <li>NAS: nas://29**d-b12****446.cn-hangzhou.nas.aliyuncs.com/data/path/</li>
             * <li>Extreme NAS: nas://29****123-y**r.cn-hangzhou.extreme.nas.aliyuncs.com/data/path/</li>
             * <li>CPFS: cpfs://cpfs-213****87.cn-wulanchabu/ptc-292*****cbb/exp-290********03e/data/path/</li>
             * <li>Lingjun CPFS: bmcpfs://cpfs-290******foflh-vpc-x****8r.cn-wulanchabu.cpfs.aliyuncs.com/data/path/</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket-name.oss-cn-shanghai-internal.aliyuncs.com/data/path/</p>
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

            private Builder() {
            } 

            private Builder(RequestedResource model) {
                this.CPU = model.CPU;
                this.GPU = model.GPU;
                this.GPUType = model.GPUType;
                this.memory = model.memory;
                this.sharedMemory = model.sharedMemory;
            } 

            /**
             * <p>The number of vCPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * <p>The number of GPUs.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * <p>The GPU type.</p>
             * 
             * <strong>example:</strong>
             * <p>v100</p>
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * <p>The memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * <p>The shared memory size. Unit: GB.</p>
             * 
             * <strong>example:</strong>
             * <p>32</p>
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
        @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
        private BandwidthLimit bandwidthLimit;

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
            this.bandwidthLimit = builder.bandwidthLimit;
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
         * @return bandwidthLimit
         */
        public BandwidthLimit getBandwidthLimit() {
            return this.bandwidthLimit;
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
            private BandwidthLimit bandwidthLimit; 
            private String defaultRoute; 
            private java.util.List<String> extendedCIDRs; 
            private java.util.List<ForwardInfo> forwardInfos; 
            private String securityGroupId; 
            private String vSwitchId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(UserVpc model) {
                this.bandwidthLimit = model.bandwidthLimit;
                this.defaultRoute = model.defaultRoute;
                this.extendedCIDRs = model.extendedCIDRs;
                this.forwardInfos = model.forwardInfos;
                this.securityGroupId = model.securityGroupId;
                this.vSwitchId = model.vSwitchId;
                this.vpcId = model.vpcId;
            } 

            /**
             * BandwidthLimit.
             */
            public Builder bandwidthLimit(BandwidthLimit bandwidthLimit) {
                this.bandwidthLimit = bandwidthLimit;
                return this;
            }

            /**
             * <p>The default route. Valid values:</p>
             * <ul>
             * <li>eth0: The default network interface is used to access the Internet through the public gateway.</li>
             * <li>eth1: The user&quot;s Elastic Network Interface is used to access the Internet through the private gateway.</li>
             * </ul>
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
             * <ul>
             * <li>If you leave VSwitchId empty, this parameter is not required and the system automatically obtains all CIDR blocks in the VPC.</li>
             * <li>If VSwitchId is not empty, this parameter is required. Specify all CIDR blocks in the VPC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[&quot;192.168.0.1/24&quot;, &quot;192.168.1.1/24&quot;]</p>
             */
            public Builder extendedCIDRs(java.util.List<String> extendedCIDRs) {
                this.extendedCIDRs = extendedCIDRs;
                return this;
            }

            /**
             * <p>The forward configuration of the instance.</p>
             */
            public Builder forwardInfos(java.util.List<ForwardInfo> forwardInfos) {
                this.forwardInfos = forwardInfos;
                return this;
            }

            /**
             * <p>The security group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-xxxxxx</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxx</p>
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
