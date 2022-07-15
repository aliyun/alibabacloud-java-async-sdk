// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Body
    @NameInMap("Accessibility")
    private String accessibility;

    @Body
    @NameInMap("Datasets")
    private java.util.List < Datasets> datasets;

    @Body
    @NameInMap("EcsSpec")
    private String ecsSpec;

    @Body
    @NameInMap("EnvironmentVariables")
    private java.util.Map < String, String > environmentVariables;

    @Body
    @NameInMap("ImageId")
    private String imageId;

    @Body
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Body
    @NameInMap("InstanceName")
    private String instanceName;

    @Body
    @NameInMap("Priority")
    private Long priority;

    @Body
    @NameInMap("RequestedResource")
    private RequestedResource requestedResource;

    @Body
    @NameInMap("ResourceId")
    private String resourceId;

    @Body
    @NameInMap("UserVpc")
    private UserVpc userVpc;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.datasets = builder.datasets;
        this.ecsSpec = builder.ecsSpec;
        this.environmentVariables = builder.environmentVariables;
        this.imageId = builder.imageId;
        this.imageUrl = builder.imageUrl;
        this.instanceName = builder.instanceName;
        this.priority = builder.priority;
        this.requestedResource = builder.requestedResource;
        this.resourceId = builder.resourceId;
        this.userVpc = builder.userVpc;
        this.workspaceId = builder.workspaceId;
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
     * @return datasets
     */
    public java.util.List < Datasets> getDatasets() {
        return this.datasets;
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
    public java.util.Map < String, String > getEnvironmentVariables() {
        return this.environmentVariables;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
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

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String accessibility; 
        private java.util.List < Datasets> datasets; 
        private String ecsSpec; 
        private java.util.Map < String, String > environmentVariables; 
        private String imageId; 
        private String imageUrl; 
        private String instanceName; 
        private Long priority; 
        private RequestedResource requestedResource; 
        private String resourceId; 
        private UserVpc userVpc; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.datasets = request.datasets;
            this.ecsSpec = request.ecsSpec;
            this.environmentVariables = request.environmentVariables;
            this.imageId = request.imageId;
            this.imageUrl = request.imageUrl;
            this.instanceName = request.instanceName;
            this.priority = request.priority;
            this.requestedResource = request.requestedResource;
            this.resourceId = request.resourceId;
            this.userVpc = request.userVpc;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * 工作空间内是否他人可见
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * 数据集集合
         */
        public Builder datasets(java.util.List < Datasets> datasets) {
            this.putBodyParameter("Datasets", datasets);
            this.datasets = datasets;
            return this;
        }

        /**
         * 实例对应的Ecs规格
         */
        public Builder ecsSpec(String ecsSpec) {
            this.putBodyParameter("EcsSpec", ecsSpec);
            this.ecsSpec = ecsSpec;
            return this;
        }

        /**
         * 环境变量
         */
        public Builder environmentVariables(java.util.Map < String, String > environmentVariables) {
            this.putBodyParameter("EnvironmentVariables", environmentVariables);
            this.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * 镜像Id
         */
        public Builder imageId(String imageId) {
            this.putBodyParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * 镜像地址
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * 实例名称
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * 优先级，在分配资源给实例时，优先级越高的实例越优先
         */
        public Builder priority(Long priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * 资源配置，弹内或者轻量化时使用
         */
        public Builder requestedResource(RequestedResource requestedResource) {
            this.putBodyParameter("RequestedResource", requestedResource);
            this.requestedResource = requestedResource;
            return this;
        }

        /**
         * 资源Id,预付费时填写
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * user vpc配置
         */
        public Builder userVpc(UserVpc userVpc) {
            this.putBodyParameter("UserVpc", userVpc);
            this.userVpc = userVpc;
            return this;
        }

        /**
         * 工作空间Id
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

    public static class Datasets extends TeaModel {
        @NameInMap("DatasetId")
        private String datasetId;

        @NameInMap("MountPath")
        private String mountPath;

        private Datasets(Builder builder) {
            this.datasetId = builder.datasetId;
            this.mountPath = builder.mountPath;
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

        public static final class Builder {
            private String datasetId; 
            private String mountPath; 

            /**
             * 数据集Id
             */
            public Builder datasetId(String datasetId) {
                this.datasetId = datasetId;
                return this;
            }

            /**
             * 容器内挂载路径
             */
            public Builder mountPath(String mountPath) {
                this.mountPath = mountPath;
                return this;
            }

            public Datasets build() {
                return new Datasets(this);
            } 

        } 

    }
    public static class RequestedResource extends TeaModel {
        @NameInMap("CPU")
        private String CPU;

        @NameInMap("GPU")
        private String GPU;

        @NameInMap("GPUType")
        private String GPUType;

        @NameInMap("Memory")
        private String memory;

        @NameInMap("SharedMemory")
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
             * cpu核数
             */
            public Builder CPU(String CPU) {
                this.CPU = CPU;
                return this;
            }

            /**
             * gpu数量
             */
            public Builder GPU(String GPU) {
                this.GPU = GPU;
                return this;
            }

            /**
             * gpu显卡类型
             */
            public Builder GPUType(String GPUType) {
                this.GPUType = GPUType;
                return this;
            }

            /**
             * memory大小
             */
            public Builder memory(String memory) {
                this.memory = memory;
                return this;
            }

            /**
             * shared memory大小
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
    public static class UserVpc extends TeaModel {
        @NameInMap("SecurityGroupId")
        private String securityGroupId;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VpcId")
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

            /**
             * Security Group Id
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * VSwitch Id
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * Vpc Id
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
