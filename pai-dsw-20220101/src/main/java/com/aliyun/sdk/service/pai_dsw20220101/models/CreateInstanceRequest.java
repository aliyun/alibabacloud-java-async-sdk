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
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Driver")
    private String driver;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DynamicMount")
    private DynamicMount dynamicMount;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcsSpec")
    private String ecsSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnvironmentVariables")
    private java.util.Map<String, String> environmentVariables;

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
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Labels> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Long priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RequestedResource")
    private RequestedResource requestedResource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserVpc")
    private UserVpc userVpc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceSource")
    private String workspaceSource;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.affinity = builder.affinity;
        this.cloudDisks = builder.cloudDisks;
        this.credentialConfig = builder.credentialConfig;
        this.datasets = builder.datasets;
        this.driver = builder.driver;
        this.dynamicMount = builder.dynamicMount;
        this.ecsSpec = builder.ecsSpec;
        this.environmentVariables = builder.environmentVariables;
        this.imageAuth = builder.imageAuth;
        this.imageId = builder.imageId;
        this.imageUrl = builder.imageUrl;
        this.instanceName = builder.instanceName;
        this.labels = builder.labels;
        this.priority = builder.priority;
        this.requestedResource = builder.requestedResource;
        this.resourceId = builder.resourceId;
        this.tag = builder.tag;
        this.userId = builder.userId;
        this.userVpc = builder.userVpc;
        this.workspaceId = builder.workspaceId;
        this.workspaceSource = builder.workspaceSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
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
     * @return environmentVariables
     */
    public java.util.Map<String, String> getEnvironmentVariables() {
        return this.environmentVariables;
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
     * @return labels
     */
    public java.util.List<Labels> getLabels() {
        return this.labels;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceSource
     */
    public String getWorkspaceSource() {
        return this.workspaceSource;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String accessibility; 
        private Affinity affinity; 
        private java.util.List<CloudDisks> cloudDisks; 
        private CredentialConfig credentialConfig; 
        private java.util.List<Datasets> datasets; 
        private String driver; 
        private DynamicMount dynamicMount; 
        private String ecsSpec; 
        private java.util.Map<String, String> environmentVariables; 
        private String imageAuth; 
        private String imageId; 
        private String imageUrl; 
        private String instanceName; 
        private java.util.List<Labels> labels; 
        private Long priority; 
        private RequestedResource requestedResource; 
        private String resourceId; 
        private java.util.List<Tag> tag; 
        private String userId; 
        private UserVpc userVpc; 
        private String workspaceId; 
        private String workspaceSource; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.affinity = request.affinity;
            this.cloudDisks = request.cloudDisks;
            this.credentialConfig = request.credentialConfig;
            this.datasets = request.datasets;
            this.driver = request.driver;
            this.dynamicMount = request.dynamicMount;
            this.ecsSpec = request.ecsSpec;
            this.environmentVariables = request.environmentVariables;
            this.imageAuth = request.imageAuth;
            this.imageId = request.imageId;
            this.imageUrl = request.imageUrl;
            this.instanceName = request.instanceName;
            this.labels = request.labels;
            this.priority = request.priority;
            this.requestedResource = request.requestedResource;
            this.resourceId = request.resourceId;
            this.tag = request.tag;
            this.userId = request.userId;
            this.userVpc = request.userVpc;
            this.workspaceId = request.workspaceId;
            this.workspaceSource = request.workspaceSource;
        } 

        /**
         * <p>The instance accessibility.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>PUBLIC: The instances are accessible to all members in the workspace.</li>
         * <li>PRIVATE: The instances are accessible only to you and the administrator of the workspace.</li>
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
         * <p>The environment variables.</p>
         * 
         * <strong>example:</strong>
         * <p>{userName: &quot;Chris&quot;}</p>
         */
        public Builder environmentVariables(java.util.Map<String, String> environmentVariables) {
            this.putBodyParameter("EnvironmentVariables", environmentVariables);
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * <p>The Base64-encoded account and password for the user&quot;s private image. The password will be hidden.</p>
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
         * <p>The instance name. The name must meet the following requirements:</p>
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
         * <p>The custom labels.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;foo&quot;: &quot;bar&quot;}</p>
         */
        public Builder labels(java.util.List<Labels> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The priority based on which resources are allocated to instances. Valid values: 1 to 9.</p>
         * <ul>
         * <li>1: the lowest priority.</li>
         * <li>9: the highest priority.</li>
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
         * <p>The ID of the resource group. This parameter is configured during prepayment. For information about how to create a dedicated resource group, see <a href="https://help.aliyun.com/document_detail/202827.html">Create a dedicated resource group and purchase general computing resources</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-123456789</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The ID of the instance owner. Valid values: Alibaba Cloud account and RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>161228528250****</p>
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
         * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40823</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The storage corresponding to the working directory. You can mount disks or datasets to /mnt/workspace at the same time. OSS datasets and dynamically mounted datasets are not supported.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>rootfsCloudDisk: Mount the disk to the working directory.</li>
         * <li>Mount path of the dataset, such as /mnt/data: Datasets in URI format only support this method.</li>
         * <li>Dataset ID, such as d-vsqjvs****rp5l206u: If a single dataset is mounted to multiple paths, the first path is selected. We recommend that you do not use this method, use the mount path instead.</li>
         * </ul>
         * <p>If you leave this parameter empty:</p>
         * <ul>
         * <li>If the instance uses cloud disks, cloud disks are selected by default.</li>
         * <li>if no cloud disks are available, the first NAS or CPFS dataset is selected as the working directory.</li>
         * <li>If no cloud disks, and NAS or CPFS datasets are available, the host space is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rootfsCloudDisk</p>
         */
        public Builder workspaceSource(String workspaceSource) {
            this.putBodyParameter("WorkspaceSource", workspaceSource);
            this.workspaceSource = workspaceSource;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
             * <p>Specifies whether to enable the CPU affinity feature.</p>
             * <ul>
             * <li>false</li>
             * <li>true</li>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Available")
        private Long available;

        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Long capacity;

        @com.aliyun.core.annotation.NameInMap("Usage")
        private Long usage;

        private Status(Builder builder) {
            this.available = builder.available;
            this.capacity = builder.capacity;
            this.usage = builder.usage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return available
         */
        public Long getAvailable() {
            return this.available;
        }

        /**
         * @return capacity
         */
        public Long getCapacity() {
            return this.capacity;
        }

        /**
         * @return usage
         */
        public Long getUsage() {
            return this.usage;
        }

        public static final class Builder {
            private Long available; 
            private Long capacity; 
            private Long usage; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.available = model.available;
                this.capacity = model.capacity;
                this.usage = model.usage;
            } 

            /**
             * <p>The available capacity. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>31841058816</p>
             */
            public Builder available(Long available) {
                this.available = available;
                return this;
            }

            /**
             * <p>The capacity. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>32212254720</p>
             */
            public Builder capacity(Long capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The used capacity. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>371195904</p>
             */
            public Builder usage(Long usage) {
                this.usage = usage;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class CloudDisks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private String capacity;

        @com.aliyun.core.annotation.NameInMap("MountPath")
        private String mountPath;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Status status;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        private CloudDisks(Builder builder) {
            this.capacity = builder.capacity;
            this.mountPath = builder.mountPath;
            this.path = builder.path;
            this.status = builder.status;
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
         * @return mountPath
         */
        public String getMountPath() {
            return this.mountPath;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return status
         */
        public Status getStatus() {
            return this.status;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        public static final class Builder {
            private String capacity; 
            private String mountPath; 
            private String path; 
            private Status status; 
            private String subType; 

            private Builder() {
            } 

            private Builder(CloudDisks model) {
                this.capacity = model.capacity;
                this.mountPath = model.mountPath;
                this.path = model.path;
                this.status = model.status;
                this.subType = model.subType;
            } 

            /**
             * <p>If <strong>Resource Type</strong> is <strong>Public Resource</strong> or if <strong>Resource Quota</strong> is subscription-based general-purpose computing resources (CPU cores ≥ 2 and memory ≥ 4 GB, or configured with GPU):</p>
             * <p>Each instance has a free system disk of 100 GiB for persistent storage. <strong>If the DSW instance is stopped and not launched for more than 15 days, the disk is cleared</strong>. The disk can be expanded. For specific pricing, refer to the console.</p>
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
             * <p>The mount path of the cloud disk.</p>
             * 
             * <strong>example:</strong>
             * <p>/mnt/systemDisk</p>
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            /**
             * <p>The subpath of the cloud disk that is mounted to the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>workspace</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The disk or snapshot usage.</p>
             */
            public Builder status(Status status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The cloud disk type.</p>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
             * <p>The dataset ID. If the dataset is read-only, you cannot change the dataset permission from read-only to read and write by using MountAccess.</p>
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
             * <p>Specifies whether to enable dynamic mounting. Default value: false.</p>
             * <ul>
             * <li>Currently, only instances using general-purpose computing resources are supported.</li>
             * <li>Currently, only OSS datasets are supported. The mounted datasets are read-only.</li>
             * <li>The mount path of the dynamically mounted dataset must be a subpath of the root path. Example: /mnt/dynamic/data1/</li>
             * <li>A dynamically mounted dataset must be after non-dynamic datasets.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
             * <p>The mount type. You cannot specify Options at the same time. This is deprecated, and you can use Options instead.</p>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
             * <p>The custom label key.</p>
             * 
             * <strong>example:</strong>
             * <p>stsTokenOwner</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The custom label value.</p>
             * 
             * <strong>example:</strong>
             * <p>123xxxxxxxx</p>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
             * <p>The number of CPU cores.</p>
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
             * <p>The GPU memory type. Valid values:</p>
             * <ul>
             * <li>V100</li>
             * <li>A100</li>
             * <li>T4</li>
             * <li>A10</li>
             * <li>P100</li>
             * </ul>
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
             * <p>The size of the shared memory. Unit: GB.</p>
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
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tag1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateInstanceRequest</p>
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
             * <li>eth1: The user&quot;s elastic network interface (ENI) is used to access the Internet through the private gateway. For more information about the configuration method, see <a href="https://help.aliyun.com/document_detail/2525343.html">Enable Internet access for a DSW instance by using a private Internet NAT gateway</a>.</li>
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
             * <li>If you leave the SwitchId and ExtendedCIDRs parameters empty, the system automatically obtains all CIDR blocks in a VPC.</li>
             * <li>If you configure the SwitchId and ExtendedCIDRs parameters, we recommend that you specify all CIDR blocks in a VPC.</li>
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
             * <p>The forward information.</p>
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
