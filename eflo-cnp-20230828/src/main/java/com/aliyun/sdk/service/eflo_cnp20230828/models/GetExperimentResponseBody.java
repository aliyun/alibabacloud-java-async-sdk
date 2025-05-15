// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link GetExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentResponseBody</p>
 */
public class GetExperimentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetExperimentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Data data; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetExperimentResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Access denied detail</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>RequestId</p>
         * 
         * <strong>example:</strong>
         * <p>E67E2E4C-2B47-5C55-AA17-1D771E070AEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>total</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetExperimentResponseBody build() {
            return new GetExperimentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class ResourceNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("RequestCPU")
        private Integer requestCPU;

        @com.aliyun.core.annotation.NameInMap("RequestGPU")
        private Integer requestGPU;

        @com.aliyun.core.annotation.NameInMap("RequestMemory")
        private Integer requestMemory;

        @com.aliyun.core.annotation.NameInMap("TotalCPU")
        private Integer totalCPU;

        @com.aliyun.core.annotation.NameInMap("TotalGPU")
        private Integer totalGPU;

        @com.aliyun.core.annotation.NameInMap("TotalMemory")
        private Long totalMemory;

        private ResourceNodes(Builder builder) {
            this.nodeName = builder.nodeName;
            this.requestCPU = builder.requestCPU;
            this.requestGPU = builder.requestGPU;
            this.requestMemory = builder.requestMemory;
            this.totalCPU = builder.totalCPU;
            this.totalGPU = builder.totalGPU;
            this.totalMemory = builder.totalMemory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceNodes create() {
            return builder().build();
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return requestCPU
         */
        public Integer getRequestCPU() {
            return this.requestCPU;
        }

        /**
         * @return requestGPU
         */
        public Integer getRequestGPU() {
            return this.requestGPU;
        }

        /**
         * @return requestMemory
         */
        public Integer getRequestMemory() {
            return this.requestMemory;
        }

        /**
         * @return totalCPU
         */
        public Integer getTotalCPU() {
            return this.totalCPU;
        }

        /**
         * @return totalGPU
         */
        public Integer getTotalGPU() {
            return this.totalGPU;
        }

        /**
         * @return totalMemory
         */
        public Long getTotalMemory() {
            return this.totalMemory;
        }

        public static final class Builder {
            private String nodeName; 
            private Integer requestCPU; 
            private Integer requestGPU; 
            private Integer requestMemory; 
            private Integer totalCPU; 
            private Integer totalGPU; 
            private Long totalMemory; 

            private Builder() {
            } 

            private Builder(ResourceNodes model) {
                this.nodeName = model.nodeName;
                this.requestCPU = model.requestCPU;
                this.requestGPU = model.requestGPU;
                this.requestMemory = model.requestMemory;
                this.totalCPU = model.totalCPU;
                this.totalGPU = model.totalGPU;
                this.totalMemory = model.totalMemory;
            } 

            /**
             * <p>Node name</p>
             * 
             * <strong>example:</strong>
             * <p>p-jt-waf-app1</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>Requested CPU</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder requestCPU(Integer requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * <p>Requested GPU</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder requestGPU(Integer requestGPU) {
                this.requestGPU = requestGPU;
                return this;
            }

            /**
             * <p>Requested memory</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder requestMemory(Integer requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            /**
             * <p>Total CPU</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder totalCPU(Integer totalCPU) {
                this.totalCPU = totalCPU;
                return this;
            }

            /**
             * <p>Total GPU</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder totalGPU(Integer totalGPU) {
                this.totalGPU = totalGPU;
                return this;
            }

            /**
             * <p>Total memory</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder totalMemory(Long totalMemory) {
                this.totalMemory = totalMemory;
                return this;
            }

            public ResourceNodes build() {
                return new ResourceNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class EnvParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuPerWorker")
        private Integer cpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("CudaVersion")
        private String cudaVersion;

        @com.aliyun.core.annotation.NameInMap("ExtendParam")
        private java.util.Map<String, String> extendParam;

        @com.aliyun.core.annotation.NameInMap("GpuDriverVersion")
        private String gpuDriverVersion;

        @com.aliyun.core.annotation.NameInMap("GpuPerWorker")
        private Integer gpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("MemoryPerWorker")
        private Integer memoryPerWorker;

        @com.aliyun.core.annotation.NameInMap("NCCLVersion")
        private String NCCLVersion;

        @com.aliyun.core.annotation.NameInMap("PyTorchVersion")
        private String pyTorchVersion;

        @com.aliyun.core.annotation.NameInMap("ResourceNodes")
        private java.util.List<ResourceNodes> resourceNodes;

        @com.aliyun.core.annotation.NameInMap("ShareMemory")
        private Integer shareMemory;

        @com.aliyun.core.annotation.NameInMap("WorkerNum")
        private Integer workerNum;

        private EnvParams(Builder builder) {
            this.cpuPerWorker = builder.cpuPerWorker;
            this.cudaVersion = builder.cudaVersion;
            this.extendParam = builder.extendParam;
            this.gpuDriverVersion = builder.gpuDriverVersion;
            this.gpuPerWorker = builder.gpuPerWorker;
            this.memoryPerWorker = builder.memoryPerWorker;
            this.NCCLVersion = builder.NCCLVersion;
            this.pyTorchVersion = builder.pyTorchVersion;
            this.resourceNodes = builder.resourceNodes;
            this.shareMemory = builder.shareMemory;
            this.workerNum = builder.workerNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnvParams create() {
            return builder().build();
        }

        /**
         * @return cpuPerWorker
         */
        public Integer getCpuPerWorker() {
            return this.cpuPerWorker;
        }

        /**
         * @return cudaVersion
         */
        public String getCudaVersion() {
            return this.cudaVersion;
        }

        /**
         * @return extendParam
         */
        public java.util.Map<String, String> getExtendParam() {
            return this.extendParam;
        }

        /**
         * @return gpuDriverVersion
         */
        public String getGpuDriverVersion() {
            return this.gpuDriverVersion;
        }

        /**
         * @return gpuPerWorker
         */
        public Integer getGpuPerWorker() {
            return this.gpuPerWorker;
        }

        /**
         * @return memoryPerWorker
         */
        public Integer getMemoryPerWorker() {
            return this.memoryPerWorker;
        }

        /**
         * @return NCCLVersion
         */
        public String getNCCLVersion() {
            return this.NCCLVersion;
        }

        /**
         * @return pyTorchVersion
         */
        public String getPyTorchVersion() {
            return this.pyTorchVersion;
        }

        /**
         * @return resourceNodes
         */
        public java.util.List<ResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        /**
         * @return shareMemory
         */
        public Integer getShareMemory() {
            return this.shareMemory;
        }

        /**
         * @return workerNum
         */
        public Integer getWorkerNum() {
            return this.workerNum;
        }

        public static final class Builder {
            private Integer cpuPerWorker; 
            private String cudaVersion; 
            private java.util.Map<String, String> extendParam; 
            private String gpuDriverVersion; 
            private Integer gpuPerWorker; 
            private Integer memoryPerWorker; 
            private String NCCLVersion; 
            private String pyTorchVersion; 
            private java.util.List<ResourceNodes> resourceNodes; 
            private Integer shareMemory; 
            private Integer workerNum; 

            private Builder() {
            } 

            private Builder(EnvParams model) {
                this.cpuPerWorker = model.cpuPerWorker;
                this.cudaVersion = model.cudaVersion;
                this.extendParam = model.extendParam;
                this.gpuDriverVersion = model.gpuDriverVersion;
                this.gpuPerWorker = model.gpuPerWorker;
                this.memoryPerWorker = model.memoryPerWorker;
                this.NCCLVersion = model.NCCLVersion;
                this.pyTorchVersion = model.pyTorchVersion;
                this.resourceNodes = model.resourceNodes;
                this.shareMemory = model.shareMemory;
                this.workerNum = model.workerNum;
            } 

            /**
             * <p>CPU allocation number</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder cpuPerWorker(Integer cpuPerWorker) {
                this.cpuPerWorker = cpuPerWorker;
                return this;
            }

            /**
             * <p>cudaVersion</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder cudaVersion(String cudaVersion) {
                this.cudaVersion = cudaVersion;
                return this;
            }

            /**
             * <p>Additional parameters</p>
             */
            public Builder extendParam(java.util.Map<String, String> extendParam) {
                this.extendParam = extendParam;
                return this;
            }

            /**
             * <p>GPU driver version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * <p>GPU allocation number</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuPerWorker(Integer gpuPerWorker) {
                this.gpuPerWorker = gpuPerWorker;
                return this;
            }

            /**
             * <p>Memory Per Worker</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder memoryPerWorker(Integer memoryPerWorker) {
                this.memoryPerWorker = memoryPerWorker;
                return this;
            }

            /**
             * <p>NCCL version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder NCCLVersion(String NCCLVersion) {
                this.NCCLVersion = NCCLVersion;
                return this;
            }

            /**
             * <p>PyTorch version</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder pyTorchVersion(String pyTorchVersion) {
                this.pyTorchVersion = pyTorchVersion;
                return this;
            }

            /**
             * <p>Specified nodes</p>
             */
            public Builder resourceNodes(java.util.List<ResourceNodes> resourceNodes) {
                this.resourceNodes = resourceNodes;
                return this;
            }

            /**
             * <p>Share Memory</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder shareMemory(Integer shareMemory) {
                this.shareMemory = shareMemory;
                return this;
            }

            /**
             * <p>Worker number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder workerNum(Integer workerNum) {
                this.workerNum = workerNum;
                return this;
            }

            public EnvParams build() {
                return new EnvParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class MachineType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BondNum")
        private Integer bondNum;

        @com.aliyun.core.annotation.NameInMap("CpuInfo")
        private String cpuInfo;

        @com.aliyun.core.annotation.NameInMap("DiskInfo")
        private String diskInfo;

        @com.aliyun.core.annotation.NameInMap("GpuInfo")
        private String gpuInfo;

        @com.aliyun.core.annotation.NameInMap("MemoryInfo")
        private String memoryInfo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NetworkInfo")
        private String networkInfo;

        @com.aliyun.core.annotation.NameInMap("NetworkMode")
        private String networkMode;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Integer nodeCount;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MachineType(Builder builder) {
            this.bondNum = builder.bondNum;
            this.cpuInfo = builder.cpuInfo;
            this.diskInfo = builder.diskInfo;
            this.gpuInfo = builder.gpuInfo;
            this.memoryInfo = builder.memoryInfo;
            this.name = builder.name;
            this.networkInfo = builder.networkInfo;
            this.networkMode = builder.networkMode;
            this.nodeCount = builder.nodeCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MachineType create() {
            return builder().build();
        }

        /**
         * @return bondNum
         */
        public Integer getBondNum() {
            return this.bondNum;
        }

        /**
         * @return cpuInfo
         */
        public String getCpuInfo() {
            return this.cpuInfo;
        }

        /**
         * @return diskInfo
         */
        public String getDiskInfo() {
            return this.diskInfo;
        }

        /**
         * @return gpuInfo
         */
        public String getGpuInfo() {
            return this.gpuInfo;
        }

        /**
         * @return memoryInfo
         */
        public String getMemoryInfo() {
            return this.memoryInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return networkInfo
         */
        public String getNetworkInfo() {
            return this.networkInfo;
        }

        /**
         * @return networkMode
         */
        public String getNetworkMode() {
            return this.networkMode;
        }

        /**
         * @return nodeCount
         */
        public Integer getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer bondNum; 
            private String cpuInfo; 
            private String diskInfo; 
            private String gpuInfo; 
            private String memoryInfo; 
            private String name; 
            private String networkInfo; 
            private String networkMode; 
            private Integer nodeCount; 
            private String type; 

            private Builder() {
            } 

            private Builder(MachineType model) {
                this.bondNum = model.bondNum;
                this.cpuInfo = model.cpuInfo;
                this.diskInfo = model.diskInfo;
                this.gpuInfo = model.gpuInfo;
                this.memoryInfo = model.memoryInfo;
                this.name = model.name;
                this.networkInfo = model.networkInfo;
                this.networkMode = model.networkMode;
                this.nodeCount = model.nodeCount;
                this.type = model.type;
            } 

            /**
             * <p>Number of network bonds</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder bondNum(Integer bondNum) {
                this.bondNum = bondNum;
                return this;
            }

            /**
             * <p>CPU information</p>
             * 
             * <strong>example:</strong>
             * <p>2x Intel Icelake 8369B 32C CPU</p>
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * <p>Disk information</p>
             * 
             * <strong>example:</strong>
             * <p>2x 480GB SATA SSD \n 4x 3.84TB NVMe SSD</p>
             */
            public Builder diskInfo(String diskInfo) {
                this.diskInfo = diskInfo;
                return this;
            }

            /**
             * <p>GPU information</p>
             * 
             * <strong>example:</strong>
             * <p>8x NVIDIA SXM4 80GB A100 GPU</p>
             */
            public Builder gpuInfo(String gpuInfo) {
                this.gpuInfo = gpuInfo;
                return this;
            }

            /**
             * <p>Memory information</p>
             * 
             * <strong>example:</strong>
             * <p>32x 64GB DDR4 3200 Memory</p>
             */
            public Builder memoryInfo(String memoryInfo) {
                this.memoryInfo = memoryInfo;
                return this;
            }

            /**
             * <p>Specification name</p>
             * 
             * <strong>example:</strong>
             * <p>efg1.nvga1n</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Network information</p>
             * 
             * <strong>example:</strong>
             * <p>1x 100Gbps DP NIC for VPC \n 4x 100Gbps DP RoCE NIC</p>
             */
            public Builder networkInfo(String networkInfo) {
                this.networkInfo = networkInfo;
                return this;
            }

            /**
             * <p>Network mode</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * <p>Number of nodes</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>Type</p>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MachineType build() {
                return new MachineType(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class ResourceResourceNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private ResourceResourceNodes(Builder builder) {
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceResourceNodes create() {
            return builder().build();
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String nodeName; 

            private Builder() {
            } 

            private Builder(ResourceResourceNodes model) {
                this.nodeName = model.nodeName;
            } 

            /**
             * <p>Node name</p>
             * 
             * <strong>example:</strong>
             * <p>InputCheck</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public ResourceResourceNodes build() {
                return new ResourceResourceNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class UserAccessParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private String accessId;

        @com.aliyun.core.annotation.NameInMap("AccessKey")
        private String accessKey;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private UserAccessParam(Builder builder) {
            this.accessId = builder.accessId;
            this.accessKey = builder.accessKey;
            this.endpoint = builder.endpoint;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserAccessParam create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String accessId; 
            private String accessKey; 
            private String endpoint; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(UserAccessParam model) {
                this.accessId = model.accessId;
                this.accessKey = model.accessKey;
                this.endpoint = model.endpoint;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * <p>User ID</p>
             * 
             * <strong>example:</strong>
             * <p>dev</p>
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * <p>User key</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>Endpoint</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>Workspace ID</p>
             * 
             * <strong>example:</strong>
             * <p>123434542498</p>
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public UserAccessParam build() {
                return new UserAccessParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CpuCoreLimit")
        private Integer cpuCoreLimit;

        @com.aliyun.core.annotation.NameInMap("GpuLimit")
        private Integer gpuLimit;

        @com.aliyun.core.annotation.NameInMap("MachineType")
        private MachineType machineType;

        @com.aliyun.core.annotation.NameInMap("MaxCpuCore")
        private Integer maxCpuCore;

        @com.aliyun.core.annotation.NameInMap("MaxGpu")
        private Integer maxGpu;

        @com.aliyun.core.annotation.NameInMap("MaxMemory")
        private Long maxMemory;

        @com.aliyun.core.annotation.NameInMap("MemoryLimit")
        private Long memoryLimit;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private Long resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceNodes")
        private java.util.List<ResourceResourceNodes> resourceNodes;

        @com.aliyun.core.annotation.NameInMap("UserAccessParam")
        private UserAccessParam userAccessParam;

        private Resource(Builder builder) {
            this.cpuCoreLimit = builder.cpuCoreLimit;
            this.gpuLimit = builder.gpuLimit;
            this.machineType = builder.machineType;
            this.maxCpuCore = builder.maxCpuCore;
            this.maxGpu = builder.maxGpu;
            this.maxMemory = builder.maxMemory;
            this.memoryLimit = builder.memoryLimit;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceNodes = builder.resourceNodes;
            this.userAccessParam = builder.userAccessParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return cpuCoreLimit
         */
        public Integer getCpuCoreLimit() {
            return this.cpuCoreLimit;
        }

        /**
         * @return gpuLimit
         */
        public Integer getGpuLimit() {
            return this.gpuLimit;
        }

        /**
         * @return machineType
         */
        public MachineType getMachineType() {
            return this.machineType;
        }

        /**
         * @return maxCpuCore
         */
        public Integer getMaxCpuCore() {
            return this.maxCpuCore;
        }

        /**
         * @return maxGpu
         */
        public Integer getMaxGpu() {
            return this.maxGpu;
        }

        /**
         * @return maxMemory
         */
        public Long getMaxMemory() {
            return this.maxMemory;
        }

        /**
         * @return memoryLimit
         */
        public Long getMemoryLimit() {
            return this.memoryLimit;
        }

        /**
         * @return resourceId
         */
        public Long getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceNodes
         */
        public java.util.List<ResourceResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        /**
         * @return userAccessParam
         */
        public UserAccessParam getUserAccessParam() {
            return this.userAccessParam;
        }

        public static final class Builder {
            private Integer cpuCoreLimit; 
            private Integer gpuLimit; 
            private MachineType machineType; 
            private Integer maxCpuCore; 
            private Integer maxGpu; 
            private Long maxMemory; 
            private Long memoryLimit; 
            private Long resourceId; 
            private String resourceName; 
            private java.util.List<ResourceResourceNodes> resourceNodes; 
            private UserAccessParam userAccessParam; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.cpuCoreLimit = model.cpuCoreLimit;
                this.gpuLimit = model.gpuLimit;
                this.machineType = model.machineType;
                this.maxCpuCore = model.maxCpuCore;
                this.maxGpu = model.maxGpu;
                this.maxMemory = model.maxMemory;
                this.memoryLimit = model.memoryLimit;
                this.resourceId = model.resourceId;
                this.resourceName = model.resourceName;
                this.resourceNodes = model.resourceNodes;
                this.userAccessParam = model.userAccessParam;
            } 

            /**
             * <p>Used CPU</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder cpuCoreLimit(Integer cpuCoreLimit) {
                this.cpuCoreLimit = cpuCoreLimit;
                return this;
            }

            /**
             * <p>Used GPU</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuLimit(Integer gpuLimit) {
                this.gpuLimit = gpuLimit;
                return this;
            }

            /**
             * <p>Instance type</p>
             */
            public Builder machineType(MachineType machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * <p>Used memory</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder maxCpuCore(Integer maxCpuCore) {
                this.maxCpuCore = maxCpuCore;
                return this;
            }

            /**
             * <p>Used memory</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder maxGpu(Integer maxGpu) {
                this.maxGpu = maxGpu;
                return this;
            }

            /**
             * <p>Used memory</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder maxMemory(Long maxMemory) {
                this.maxMemory = maxMemory;
                return this;
            }

            /**
             * <p>Used memory</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder memoryLimit(Long memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * <p>Cluster ID</p>
             * 
             * <strong>example:</strong>
             * <p>189</p>
             */
            public Builder resourceId(Long resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>Cluster name</p>
             * 
             * <strong>example:</strong>
             * <p>ecs.r8y.4xlarge</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>Resource node list</p>
             */
            public Builder resourceNodes(java.util.List<ResourceResourceNodes> resourceNodes) {
                this.resourceNodes = resourceNodes;
                return this;
            }

            /**
             * <p>User authorization parameters</p>
             */
            public Builder userAccessParam(UserAccessParam userAccessParam) {
                this.userAccessParam = userAccessParam;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class ErrorWorker extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorFlag")
        private Boolean errorFlag;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private Long experimentId;

        @com.aliyun.core.annotation.NameInMap("GpuName")
        private String gpuName;

        @com.aliyun.core.annotation.NameInMap("GpuNum")
        private Integer gpuNum;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("SamplesPerSecond")
        private Double samplesPerSecond;

        @com.aliyun.core.annotation.NameInMap("Tflops")
        private Double tflops;

        @com.aliyun.core.annotation.NameInMap("WarningFlag")
        private Boolean warningFlag;

        @com.aliyun.core.annotation.NameInMap("WarningMsg")
        private String warningMsg;

        private ErrorWorker(Builder builder) {
            this.errorFlag = builder.errorFlag;
            this.errorMsg = builder.errorMsg;
            this.experimentId = builder.experimentId;
            this.gpuName = builder.gpuName;
            this.gpuNum = builder.gpuNum;
            this.hostname = builder.hostname;
            this.podName = builder.podName;
            this.samplesPerSecond = builder.samplesPerSecond;
            this.tflops = builder.tflops;
            this.warningFlag = builder.warningFlag;
            this.warningMsg = builder.warningMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ErrorWorker create() {
            return builder().build();
        }

        /**
         * @return errorFlag
         */
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return experimentId
         */
        public Long getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return gpuName
         */
        public String getGpuName() {
            return this.gpuName;
        }

        /**
         * @return gpuNum
         */
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return samplesPerSecond
         */
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        /**
         * @return tflops
         */
        public Double getTflops() {
            return this.tflops;
        }

        /**
         * @return warningFlag
         */
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        /**
         * @return warningMsg
         */
        public String getWarningMsg() {
            return this.warningMsg;
        }

        public static final class Builder {
            private Boolean errorFlag; 
            private String errorMsg; 
            private Long experimentId; 
            private String gpuName; 
            private Integer gpuNum; 
            private String hostname; 
            private String podName; 
            private Double samplesPerSecond; 
            private Double tflops; 
            private Boolean warningFlag; 
            private String warningMsg; 

            private Builder() {
            } 

            private Builder(ErrorWorker model) {
                this.errorFlag = model.errorFlag;
                this.errorMsg = model.errorMsg;
                this.experimentId = model.experimentId;
                this.gpuName = model.gpuName;
                this.gpuNum = model.gpuNum;
                this.hostname = model.hostname;
                this.podName = model.podName;
                this.samplesPerSecond = model.samplesPerSecond;
                this.tflops = model.tflops;
                this.warningFlag = model.warningFlag;
                this.warningMsg = model.warningMsg;
            } 

            /**
             * <p>error flag</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder errorFlag(Boolean errorFlag) {
                this.errorFlag = errorFlag;
                return this;
            }

            /**
             * <p>error message</p>
             * 
             * <strong>example:</strong>
             * <p>Connection reset</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Experiment ID</p>
             * 
             * <strong>example:</strong>
             * <p>97</p>
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>GPU name</p>
             * 
             * <strong>example:</strong>
             * <p>8x OAM 810 GPU</p>
             */
            public Builder gpuName(String gpuName) {
                this.gpuName = gpuName;
                return this;
            }

            /**
             * <p>Number of GPUs</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuNum(Integer gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * <p>Service address</p>
             * 
             * <strong>example:</strong>
             * <p>60.188.98.209</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Pod name.</p>
             * 
             * <strong>example:</strong>
             * <p>hzs-forge-sdxl-online-7ff4d86444-pc95h</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>Samples Per Second</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * <p>TFLOPS</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder tflops(Double tflops) {
                this.tflops = tflops;
                return this;
            }

            /**
             * <p>Whether there is a warning</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder warningFlag(Boolean warningFlag) {
                this.warningFlag = warningFlag;
                return this;
            }

            /**
             * <p>Warning message</p>
             * 
             * <strong>example:</strong>
             * <p>warning message</p>
             */
            public Builder warningMsg(String warningMsg) {
                this.warningMsg = warningMsg;
                return this;
            }

            public ErrorWorker build() {
                return new ErrorWorker(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class TaskIndividualResultList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorFlag")
        private Boolean errorFlag;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private Long experimentId;

        @com.aliyun.core.annotation.NameInMap("GpuName")
        private String gpuName;

        @com.aliyun.core.annotation.NameInMap("GpuNum")
        private Integer gpuNum;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("SamplesPerSecond")
        private Double samplesPerSecond;

        @com.aliyun.core.annotation.NameInMap("Tflops")
        private Double tflops;

        @com.aliyun.core.annotation.NameInMap("WarningFlag")
        private Boolean warningFlag;

        @com.aliyun.core.annotation.NameInMap("WarningMsg")
        private String warningMsg;

        private TaskIndividualResultList(Builder builder) {
            this.errorFlag = builder.errorFlag;
            this.errorMsg = builder.errorMsg;
            this.experimentId = builder.experimentId;
            this.gpuName = builder.gpuName;
            this.gpuNum = builder.gpuNum;
            this.hostname = builder.hostname;
            this.podName = builder.podName;
            this.samplesPerSecond = builder.samplesPerSecond;
            this.tflops = builder.tflops;
            this.warningFlag = builder.warningFlag;
            this.warningMsg = builder.warningMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskIndividualResultList create() {
            return builder().build();
        }

        /**
         * @return errorFlag
         */
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return experimentId
         */
        public Long getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return gpuName
         */
        public String getGpuName() {
            return this.gpuName;
        }

        /**
         * @return gpuNum
         */
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return samplesPerSecond
         */
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        /**
         * @return tflops
         */
        public Double getTflops() {
            return this.tflops;
        }

        /**
         * @return warningFlag
         */
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        /**
         * @return warningMsg
         */
        public String getWarningMsg() {
            return this.warningMsg;
        }

        public static final class Builder {
            private Boolean errorFlag; 
            private String errorMsg; 
            private Long experimentId; 
            private String gpuName; 
            private Integer gpuNum; 
            private String hostname; 
            private String podName; 
            private Double samplesPerSecond; 
            private Double tflops; 
            private Boolean warningFlag; 
            private String warningMsg; 

            private Builder() {
            } 

            private Builder(TaskIndividualResultList model) {
                this.errorFlag = model.errorFlag;
                this.errorMsg = model.errorMsg;
                this.experimentId = model.experimentId;
                this.gpuName = model.gpuName;
                this.gpuNum = model.gpuNum;
                this.hostname = model.hostname;
                this.podName = model.podName;
                this.samplesPerSecond = model.samplesPerSecond;
                this.tflops = model.tflops;
                this.warningFlag = model.warningFlag;
                this.warningMsg = model.warningMsg;
            } 

            /**
             * <p>Whether there is an error</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder errorFlag(Boolean errorFlag) {
                this.errorFlag = errorFlag;
                return this;
            }

            /**
             * <p>Error message</p>
             * 
             * <strong>example:</strong>
             * <p>error message</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>实验ID。</p>
             * 
             * <strong>example:</strong>
             * <p>48</p>
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>GPU name</p>
             * 
             * <strong>example:</strong>
             * <p>8x OAM 810 GPU</p>
             */
            public Builder gpuName(String gpuName) {
                this.gpuName = gpuName;
                return this;
            }

            /**
             * <p>Number of GPUs</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuNum(Integer gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * <p>节点主机名称。</p>
             * 
             * <strong>example:</strong>
             * <p>p-jt-waf-app1</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Pod名称。</p>
             * 
             * <strong>example:</strong>
             * <p>fluxserv-6fc89b45cf-w8wq6</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>Throughput</p>
             * 
             * <strong>example:</strong>
             * <p>28</p>
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * <p>TFLOPS value</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder tflops(Double tflops) {
                this.tflops = tflops;
                return this;
            }

            /**
             * <p>Whether there is a warning</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder warningFlag(Boolean warningFlag) {
                this.warningFlag = warningFlag;
                return this;
            }

            /**
             * <p>Warning message</p>
             * 
             * <strong>example:</strong>
             * <p>warning message</p>
             */
            public Builder warningMsg(String warningMsg) {
                this.warningMsg = warningMsg;
                return this;
            }

            public TaskIndividualResultList build() {
                return new TaskIndividualResultList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class WarningBoundList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Iteration")
        private Integer iteration;

        @com.aliyun.core.annotation.NameInMap("Lower")
        private Double lower;

        @com.aliyun.core.annotation.NameInMap("Upper")
        private Double upper;

        private WarningBoundList(Builder builder) {
            this.iteration = builder.iteration;
            this.lower = builder.lower;
            this.upper = builder.upper;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningBoundList create() {
            return builder().build();
        }

        /**
         * @return iteration
         */
        public Integer getIteration() {
            return this.iteration;
        }

        /**
         * @return lower
         */
        public Double getLower() {
            return this.lower;
        }

        /**
         * @return upper
         */
        public Double getUpper() {
            return this.upper;
        }

        public static final class Builder {
            private Integer iteration; 
            private Double lower; 
            private Double upper; 

            private Builder() {
            } 

            private Builder(WarningBoundList model) {
                this.iteration = model.iteration;
                this.lower = model.lower;
                this.upper = model.upper;
            } 

            /**
             * <p>Iteration</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder iteration(Integer iteration) {
                this.iteration = iteration;
                return this;
            }

            /**
             * <p>LOWER</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder lower(Double lower) {
                this.lower = lower;
                return this;
            }

            /**
             * <p>UPPER</p>
             * 
             * <strong>example:</strong>
             * <p>56</p>
             */
            public Builder upper(Double upper) {
                this.upper = upper;
                return this;
            }

            public WarningBoundList build() {
                return new WarningBoundList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class WarningWorker extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorFlag")
        private Boolean errorFlag;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private Long experimentId;

        @com.aliyun.core.annotation.NameInMap("GpuName")
        private String gpuName;

        @com.aliyun.core.annotation.NameInMap("GpuNum")
        private Integer gpuNum;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("PodName")
        private String podName;

        @com.aliyun.core.annotation.NameInMap("SamplesPerSecond")
        private Double samplesPerSecond;

        @com.aliyun.core.annotation.NameInMap("Tflops")
        private Double tflops;

        @com.aliyun.core.annotation.NameInMap("WarningFlag")
        private Boolean warningFlag;

        @com.aliyun.core.annotation.NameInMap("WarningMsg")
        private String warningMsg;

        private WarningWorker(Builder builder) {
            this.errorFlag = builder.errorFlag;
            this.errorMsg = builder.errorMsg;
            this.experimentId = builder.experimentId;
            this.gpuName = builder.gpuName;
            this.gpuNum = builder.gpuNum;
            this.hostname = builder.hostname;
            this.podName = builder.podName;
            this.samplesPerSecond = builder.samplesPerSecond;
            this.tflops = builder.tflops;
            this.warningFlag = builder.warningFlag;
            this.warningMsg = builder.warningMsg;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WarningWorker create() {
            return builder().build();
        }

        /**
         * @return errorFlag
         */
        public Boolean getErrorFlag() {
            return this.errorFlag;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return experimentId
         */
        public Long getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return gpuName
         */
        public String getGpuName() {
            return this.gpuName;
        }

        /**
         * @return gpuNum
         */
        public Integer getGpuNum() {
            return this.gpuNum;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return podName
         */
        public String getPodName() {
            return this.podName;
        }

        /**
         * @return samplesPerSecond
         */
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        /**
         * @return tflops
         */
        public Double getTflops() {
            return this.tflops;
        }

        /**
         * @return warningFlag
         */
        public Boolean getWarningFlag() {
            return this.warningFlag;
        }

        /**
         * @return warningMsg
         */
        public String getWarningMsg() {
            return this.warningMsg;
        }

        public static final class Builder {
            private Boolean errorFlag; 
            private String errorMsg; 
            private Long experimentId; 
            private String gpuName; 
            private Integer gpuNum; 
            private String hostname; 
            private String podName; 
            private Double samplesPerSecond; 
            private Double tflops; 
            private Boolean warningFlag; 
            private String warningMsg; 

            private Builder() {
            } 

            private Builder(WarningWorker model) {
                this.errorFlag = model.errorFlag;
                this.errorMsg = model.errorMsg;
                this.experimentId = model.experimentId;
                this.gpuName = model.gpuName;
                this.gpuNum = model.gpuNum;
                this.hostname = model.hostname;
                this.podName = model.podName;
                this.samplesPerSecond = model.samplesPerSecond;
                this.tflops = model.tflops;
                this.warningFlag = model.warningFlag;
                this.warningMsg = model.warningMsg;
            } 

            /**
             * <p>Whether there is an error</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder errorFlag(Boolean errorFlag) {
                this.errorFlag = errorFlag;
                return this;
            }

            /**
             * <p>Error message</p>
             * 
             * <strong>example:</strong>
             * <p>error message</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>Experiment ID</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>GPU name</p>
             * 
             * <strong>example:</strong>
             * <p>8x OAM 810 GPU</p>
             */
            public Builder gpuName(String gpuName) {
                this.gpuName = gpuName;
                return this;
            }

            /**
             * <p>Number of GPUs</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder gpuNum(Integer gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * <p>Service address</p>
             * 
             * <strong>example:</strong>
             * <p>whza008403</p>
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * <p>Pod name.</p>
             * 
             * <strong>example:</strong>
             * <p>fluxserv-6fc89b45cf-w8wq6</p>
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * <p>Throughput</p>
             * 
             * <strong>example:</strong>
             * <p>15</p>
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * <p>TFLOPS value</p>
             * 
             * <strong>example:</strong>
             * <p>14</p>
             */
            public Builder tflops(Double tflops) {
                this.tflops = tflops;
                return this;
            }

            /**
             * <p>Whether there is an alarm</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder warningFlag(Boolean warningFlag) {
                this.warningFlag = warningFlag;
                return this;
            }

            /**
             * <p>Alarm message</p>
             * 
             * <strong>example:</strong>
             * <p>warging message</p>
             */
            public Builder warningMsg(String warningMsg) {
                this.warningMsg = warningMsg;
                return this;
            }

            public WarningWorker build() {
                return new WarningWorker(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Double duration;

        @com.aliyun.core.annotation.NameInMap("ErrorWorker")
        private java.util.List<ErrorWorker> errorWorker;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private Long experimentId;

        @com.aliyun.core.annotation.NameInMap("Mfu")
        private Double mfu;

        @com.aliyun.core.annotation.NameInMap("SamplesPerSecond")
        private Double samplesPerSecond;

        @com.aliyun.core.annotation.NameInMap("SecondsPerIteration")
        private Double secondsPerIteration;

        @com.aliyun.core.annotation.NameInMap("TaskIndividualResultList")
        private java.util.List<TaskIndividualResultList> taskIndividualResultList;

        @com.aliyun.core.annotation.NameInMap("TaskIndividualResultMap")
        private java.util.Map<String, java.util.List<DataResultsTaskIndividualResultMapValue>> taskIndividualResultMap;

        @com.aliyun.core.annotation.NameInMap("WarningBoundList")
        private java.util.List<WarningBoundList> warningBoundList;

        @com.aliyun.core.annotation.NameInMap("WarningWorker")
        private java.util.List<WarningWorker> warningWorker;

        private Results(Builder builder) {
            this.duration = builder.duration;
            this.errorWorker = builder.errorWorker;
            this.experimentId = builder.experimentId;
            this.mfu = builder.mfu;
            this.samplesPerSecond = builder.samplesPerSecond;
            this.secondsPerIteration = builder.secondsPerIteration;
            this.taskIndividualResultList = builder.taskIndividualResultList;
            this.taskIndividualResultMap = builder.taskIndividualResultMap;
            this.warningBoundList = builder.warningBoundList;
            this.warningWorker = builder.warningWorker;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Double getDuration() {
            return this.duration;
        }

        /**
         * @return errorWorker
         */
        public java.util.List<ErrorWorker> getErrorWorker() {
            return this.errorWorker;
        }

        /**
         * @return experimentId
         */
        public Long getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return mfu
         */
        public Double getMfu() {
            return this.mfu;
        }

        /**
         * @return samplesPerSecond
         */
        public Double getSamplesPerSecond() {
            return this.samplesPerSecond;
        }

        /**
         * @return secondsPerIteration
         */
        public Double getSecondsPerIteration() {
            return this.secondsPerIteration;
        }

        /**
         * @return taskIndividualResultList
         */
        public java.util.List<TaskIndividualResultList> getTaskIndividualResultList() {
            return this.taskIndividualResultList;
        }

        /**
         * @return taskIndividualResultMap
         */
        public java.util.Map<String, java.util.List<DataResultsTaskIndividualResultMapValue>> getTaskIndividualResultMap() {
            return this.taskIndividualResultMap;
        }

        /**
         * @return warningBoundList
         */
        public java.util.List<WarningBoundList> getWarningBoundList() {
            return this.warningBoundList;
        }

        /**
         * @return warningWorker
         */
        public java.util.List<WarningWorker> getWarningWorker() {
            return this.warningWorker;
        }

        public static final class Builder {
            private Double duration; 
            private java.util.List<ErrorWorker> errorWorker; 
            private Long experimentId; 
            private Double mfu; 
            private Double samplesPerSecond; 
            private Double secondsPerIteration; 
            private java.util.List<TaskIndividualResultList> taskIndividualResultList; 
            private java.util.Map<String, java.util.List<DataResultsTaskIndividualResultMapValue>> taskIndividualResultMap; 
            private java.util.List<WarningBoundList> warningBoundList; 
            private java.util.List<WarningWorker> warningWorker; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.duration = model.duration;
                this.errorWorker = model.errorWorker;
                this.experimentId = model.experimentId;
                this.mfu = model.mfu;
                this.samplesPerSecond = model.samplesPerSecond;
                this.secondsPerIteration = model.secondsPerIteration;
                this.taskIndividualResultList = model.taskIndividualResultList;
                this.taskIndividualResultMap = model.taskIndividualResultMap;
                this.warningBoundList = model.warningBoundList;
                this.warningWorker = model.warningWorker;
            } 

            /**
             * <p>Duration</p>
             * 
             * <strong>example:</strong>
             * <p>764</p>
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>Error node</p>
             */
            public Builder errorWorker(java.util.List<ErrorWorker> errorWorker) {
                this.errorWorker = errorWorker;
                return this;
            }

            /**
             * <p>Parameter name</p>
             * 
             * <strong>example:</strong>
             * <p>1748274952976261121</p>
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>MFU</p>
             * 
             * <strong>example:</strong>
             * <p>54.2</p>
             */
            public Builder mfu(Double mfu) {
                this.mfu = mfu;
                return this;
            }

            /**
             * <p>Samples Per Second</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * <p>Seconds per iteration</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder secondsPerIteration(Double secondsPerIteration) {
                this.secondsPerIteration = secondsPerIteration;
                return this;
            }

            /**
             * <p>Task individual result list</p>
             */
            public Builder taskIndividualResultList(java.util.List<TaskIndividualResultList> taskIndividualResultList) {
                this.taskIndividualResultList = taskIndividualResultList;
                return this;
            }

            /**
             * <p>Invalid task results</p>
             */
            public Builder taskIndividualResultMap(java.util.Map<String, java.util.List<DataResultsTaskIndividualResultMapValue>> taskIndividualResultMap) {
                this.taskIndividualResultMap = taskIndividualResultMap;
                return this;
            }

            /**
             * <p>Warning bound list</p>
             */
            public Builder warningBoundList(java.util.List<WarningBoundList> warningBoundList) {
                this.warningBoundList = warningBoundList;
                return this;
            }

            /**
             * <p>Warning worker</p>
             */
            public Builder warningWorker(java.util.List<WarningWorker> warningWorker) {
                this.warningWorker = warningWorker;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class Task extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.Map<String, String> params;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Task(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.params = builder.params;
            this.scene = builder.scene;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Task create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return params
         */
        public java.util.Map<String, String> getParams() {
            return this.params;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private Long endTime; 
            private java.util.Map<String, String> params; 
            private String scene; 
            private Long startTime; 
            private String status; 
            private Long taskId; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Task model) {
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.params = model.params;
                this.scene = model.scene;
                this.startTime = model.startTime;
                this.status = model.status;
                this.taskId = model.taskId;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 18:24:08</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>End time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 18:34:08</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Experiment parameters</p>
             */
            public Builder params(java.util.Map<String, String> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>Scene</p>
             * 
             * <strong>example:</strong>
             * <p>baseline</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>Start time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 18:24:08</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Status</p>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Task ID</p>
             * 
             * <strong>example:</strong>
             * <p>167420</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-03-05 18:24:08</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Task build() {
                return new Task(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class ParamSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("ParamDesc")
        private String paramDesc;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ParamRegex")
        private String paramRegex;

        @com.aliyun.core.annotation.NameInMap("ParamType")
        private String paramType;

        @com.aliyun.core.annotation.NameInMap("ParamValue")
        private String paramValue;

        private ParamSettings(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.paramDesc = builder.paramDesc;
            this.paramName = builder.paramName;
            this.paramRegex = builder.paramRegex;
            this.paramType = builder.paramType;
            this.paramValue = builder.paramValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamSettings create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return paramDesc
         */
        public String getParamDesc() {
            return this.paramDesc;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return paramRegex
         */
        public String getParamRegex() {
            return this.paramRegex;
        }

        /**
         * @return paramType
         */
        public String getParamType() {
            return this.paramType;
        }

        /**
         * @return paramValue
         */
        public String getParamValue() {
            return this.paramValue;
        }

        public static final class Builder {
            private String defaultValue; 
            private String paramDesc; 
            private String paramName; 
            private String paramRegex; 
            private String paramType; 
            private String paramValue; 

            private Builder() {
            } 

            private Builder(ParamSettings model) {
                this.defaultValue = model.defaultValue;
                this.paramDesc = model.paramDesc;
                this.paramName = model.paramName;
                this.paramRegex = model.paramRegex;
                this.paramType = model.paramType;
                this.paramValue = model.paramValue;
            } 

            /**
             * <p>Default parameter value</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>Parameter description</p>
             * 
             * <strong>example:</strong>
             * <p>number</p>
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * <p>Parameter name</p>
             * 
             * <strong>example:</strong>
             * <p>ITERATION</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>Parameter regular expression</p>
             * 
             * <strong>example:</strong>
             * <p>[0-9]+</p>
             */
            public Builder paramRegex(String paramRegex) {
                this.paramRegex = paramRegex;
                return this;
            }

            /**
             * <p>Parameter type</p>
             * 
             * <strong>example:</strong>
             * <p>number</p>
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * <p>Parameter value</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder paramValue(String paramValue) {
                this.paramValue = paramValue;
                return this;
            }

            public ParamSettings build() {
                return new ParamSettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class StaticConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameWork")
        private String frameWork;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("SoftwareStack")
        private String softwareStack;

        private StaticConfig(Builder builder) {
            this.frameWork = builder.frameWork;
            this.os = builder.os;
            this.parameters = builder.parameters;
            this.softwareStack = builder.softwareStack;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StaticConfig create() {
            return builder().build();
        }

        /**
         * @return frameWork
         */
        public String getFrameWork() {
            return this.frameWork;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return softwareStack
         */
        public String getSoftwareStack() {
            return this.softwareStack;
        }

        public static final class Builder {
            private String frameWork; 
            private String os; 
            private String parameters; 
            private String softwareStack; 

            private Builder() {
            } 

            private Builder(StaticConfig model) {
                this.frameWork = model.frameWork;
                this.os = model.os;
                this.parameters = model.parameters;
                this.softwareStack = model.softwareStack;
            } 

            /**
             * <p>Framework</p>
             * 
             * <strong>example:</strong>
             * <p>pyTorch</p>
             */
            public Builder frameWork(String frameWork) {
                this.frameWork = frameWork;
                return this;
            }

            /**
             * <p>Operating system</p>
             * 
             * <strong>example:</strong>
             * <p>linux</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>Number of parameters</p>
             * 
             * <strong>example:</strong>
             * <p>7B</p>
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * <p>Software stack</p>
             * 
             * <strong>example:</strong>
             * <p>python</p>
             */
            public Builder softwareStack(String softwareStack) {
                this.softwareStack = softwareStack;
                return this;
            }

            public StaticConfig build() {
                return new StaticConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class Workload extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultCpuPerWorker")
        private Integer defaultCpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("DefaultGpuPerWorker")
        private Integer defaultGpuPerWorker;

        @com.aliyun.core.annotation.NameInMap("DefaultMemoryPerWorker")
        private Integer defaultMemoryPerWorker;

        @com.aliyun.core.annotation.NameInMap("DefaultShareMemory")
        private Integer defaultShareMemory;

        @com.aliyun.core.annotation.NameInMap("Family")
        private String family;

        @com.aliyun.core.annotation.NameInMap("JobKind")
        private String jobKind;

        @com.aliyun.core.annotation.NameInMap("ParamSettings")
        private java.util.List<ParamSettings> paramSettings;

        @com.aliyun.core.annotation.NameInMap("Scene")
        private String scene;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("StaticConfig")
        private StaticConfig staticConfig;

        @com.aliyun.core.annotation.NameInMap("VersionId")
        private Long versionId;

        @com.aliyun.core.annotation.NameInMap("WorkloadDescription")
        private String workloadDescription;

        @com.aliyun.core.annotation.NameInMap("WorkloadId")
        private Long workloadId;

        @com.aliyun.core.annotation.NameInMap("WorkloadName")
        private String workloadName;

        @com.aliyun.core.annotation.NameInMap("WorkloadType")
        private String workloadType;

        private Workload(Builder builder) {
            this.defaultCpuPerWorker = builder.defaultCpuPerWorker;
            this.defaultGpuPerWorker = builder.defaultGpuPerWorker;
            this.defaultMemoryPerWorker = builder.defaultMemoryPerWorker;
            this.defaultShareMemory = builder.defaultShareMemory;
            this.family = builder.family;
            this.jobKind = builder.jobKind;
            this.paramSettings = builder.paramSettings;
            this.scene = builder.scene;
            this.scope = builder.scope;
            this.staticConfig = builder.staticConfig;
            this.versionId = builder.versionId;
            this.workloadDescription = builder.workloadDescription;
            this.workloadId = builder.workloadId;
            this.workloadName = builder.workloadName;
            this.workloadType = builder.workloadType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Workload create() {
            return builder().build();
        }

        /**
         * @return defaultCpuPerWorker
         */
        public Integer getDefaultCpuPerWorker() {
            return this.defaultCpuPerWorker;
        }

        /**
         * @return defaultGpuPerWorker
         */
        public Integer getDefaultGpuPerWorker() {
            return this.defaultGpuPerWorker;
        }

        /**
         * @return defaultMemoryPerWorker
         */
        public Integer getDefaultMemoryPerWorker() {
            return this.defaultMemoryPerWorker;
        }

        /**
         * @return defaultShareMemory
         */
        public Integer getDefaultShareMemory() {
            return this.defaultShareMemory;
        }

        /**
         * @return family
         */
        public String getFamily() {
            return this.family;
        }

        /**
         * @return jobKind
         */
        public String getJobKind() {
            return this.jobKind;
        }

        /**
         * @return paramSettings
         */
        public java.util.List<ParamSettings> getParamSettings() {
            return this.paramSettings;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return staticConfig
         */
        public StaticConfig getStaticConfig() {
            return this.staticConfig;
        }

        /**
         * @return versionId
         */
        public Long getVersionId() {
            return this.versionId;
        }

        /**
         * @return workloadDescription
         */
        public String getWorkloadDescription() {
            return this.workloadDescription;
        }

        /**
         * @return workloadId
         */
        public Long getWorkloadId() {
            return this.workloadId;
        }

        /**
         * @return workloadName
         */
        public String getWorkloadName() {
            return this.workloadName;
        }

        /**
         * @return workloadType
         */
        public String getWorkloadType() {
            return this.workloadType;
        }

        public static final class Builder {
            private Integer defaultCpuPerWorker; 
            private Integer defaultGpuPerWorker; 
            private Integer defaultMemoryPerWorker; 
            private Integer defaultShareMemory; 
            private String family; 
            private String jobKind; 
            private java.util.List<ParamSettings> paramSettings; 
            private String scene; 
            private String scope; 
            private StaticConfig staticConfig; 
            private Long versionId; 
            private String workloadDescription; 
            private Long workloadId; 
            private String workloadName; 
            private String workloadType; 

            private Builder() {
            } 

            private Builder(Workload model) {
                this.defaultCpuPerWorker = model.defaultCpuPerWorker;
                this.defaultGpuPerWorker = model.defaultGpuPerWorker;
                this.defaultMemoryPerWorker = model.defaultMemoryPerWorker;
                this.defaultShareMemory = model.defaultShareMemory;
                this.family = model.family;
                this.jobKind = model.jobKind;
                this.paramSettings = model.paramSettings;
                this.scene = model.scene;
                this.scope = model.scope;
                this.staticConfig = model.staticConfig;
                this.versionId = model.versionId;
                this.workloadDescription = model.workloadDescription;
                this.workloadId = model.workloadId;
                this.workloadName = model.workloadName;
                this.workloadType = model.workloadType;
            } 

            /**
             * <p>Default CPU allocation</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder defaultCpuPerWorker(Integer defaultCpuPerWorker) {
                this.defaultCpuPerWorker = defaultCpuPerWorker;
                return this;
            }

            /**
             * <p>Default GPU allocation</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder defaultGpuPerWorker(Integer defaultGpuPerWorker) {
                this.defaultGpuPerWorker = defaultGpuPerWorker;
                return this;
            }

            /**
             * <p>Default memory (GB) allocation</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder defaultMemoryPerWorker(Integer defaultMemoryPerWorker) {
                this.defaultMemoryPerWorker = defaultMemoryPerWorker;
                return this;
            }

            /**
             * <p>Default shared memory (GB) allocation</p>
             * 
             * <strong>example:</strong>
             * <p>500</p>
             */
            public Builder defaultShareMemory(Integer defaultShareMemory) {
                this.defaultShareMemory = defaultShareMemory;
                return this;
            }

            /**
             * <p>Workload cluster, AI, GPU</p>
             * 
             * <strong>example:</strong>
             * <p>AI</p>
             */
            public Builder family(String family) {
                this.family = family;
                return this;
            }

            /**
             * <p>JobKind</p>
             * 
             * <strong>example:</strong>
             * <p>PyTorchJob</p>
             */
            public Builder jobKind(String jobKind) {
                this.jobKind = jobKind;
                return this;
            }

            /**
             * <p>Parameter settings</p>
             */
            public Builder paramSettings(java.util.List<ParamSettings> paramSettings) {
                this.paramSettings = paramSettings;
                return this;
            }

            /**
             * <p>Workload usage scenario</p>
             * 
             * <strong>example:</strong>
             * <p>NLP-LLM</p>
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * <p>Scope</p>
             * 
             * <strong>example:</strong>
             * <p>common</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>Static configuration</p>
             */
            public Builder staticConfig(StaticConfig staticConfig) {
                this.staticConfig = staticConfig;
                return this;
            }

            /**
             * <p>Version ID</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * <p>Workload description</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadDescription(String workloadDescription) {
                this.workloadDescription = workloadDescription;
                return this;
            }

            /**
             * <p>Workload ID</p>
             * 
             * <strong>example:</strong>
             * <p>13</p>
             */
            public Builder workloadId(Long workloadId) {
                this.workloadId = workloadId;
                return this;
            }

            /**
             * <p>Workload name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            /**
             * <p>Workload name</p>
             * 
             * <strong>example:</strong>
             * <p>AI</p>
             */
            public Builder workloadType(String workloadType) {
                this.workloadType = workloadType;
                return this;
            }

            public Workload build() {
                return new Workload(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetExperimentResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("EnvParams")
        private EnvParams envParams;

        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private Long experimentId;

        @com.aliyun.core.annotation.NameInMap("ExperimentName")
        private String experimentName;

        @com.aliyun.core.annotation.NameInMap("ExperimentType")
        private String experimentType;

        @com.aliyun.core.annotation.NameInMap("GetParams")
        private java.util.Map<String, String> getParams;

        @com.aliyun.core.annotation.NameInMap("Resource")
        private Resource resource;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("Results")
        private Results results;

        @com.aliyun.core.annotation.NameInMap("SetParams")
        private java.util.Map<String, String> setParams;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Task")
        private Task task;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("Workload")
        private Workload workload;

        @com.aliyun.core.annotation.NameInMap("WorkloadName")
        private String workloadName;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.envParams = builder.envParams;
            this.experimentId = builder.experimentId;
            this.experimentName = builder.experimentName;
            this.experimentType = builder.experimentType;
            this.getParams = builder.getParams;
            this.resource = builder.resource;
            this.resourceName = builder.resourceName;
            this.results = builder.results;
            this.setParams = builder.setParams;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.task = builder.task;
            this.updateTime = builder.updateTime;
            this.workload = builder.workload;
            this.workloadName = builder.workloadName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return envParams
         */
        public EnvParams getEnvParams() {
            return this.envParams;
        }

        /**
         * @return experimentId
         */
        public Long getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return experimentName
         */
        public String getExperimentName() {
            return this.experimentName;
        }

        /**
         * @return experimentType
         */
        public String getExperimentType() {
            return this.experimentType;
        }

        /**
         * @return getParams
         */
        public java.util.Map<String, String> getGetParams() {
            return this.getParams;
        }

        /**
         * @return resource
         */
        public Resource getResource() {
            return this.resource;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return results
         */
        public Results getResults() {
            return this.results;
        }

        /**
         * @return setParams
         */
        public java.util.Map<String, String> getSetParams() {
            return this.setParams;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return task
         */
        public Task getTask() {
            return this.task;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return workload
         */
        public Workload getWorkload() {
            return this.workload;
        }

        /**
         * @return workloadName
         */
        public String getWorkloadName() {
            return this.workloadName;
        }

        public static final class Builder {
            private Long createTime; 
            private String endTime; 
            private EnvParams envParams; 
            private Long experimentId; 
            private String experimentName; 
            private String experimentType; 
            private java.util.Map<String, String> getParams; 
            private Resource resource; 
            private String resourceName; 
            private Results results; 
            private java.util.Map<String, String> setParams; 
            private String startTime; 
            private String status; 
            private Task task; 
            private Long updateTime; 
            private Workload workload; 
            private String workloadName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.endTime = model.endTime;
                this.envParams = model.envParams;
                this.experimentId = model.experimentId;
                this.experimentName = model.experimentName;
                this.experimentType = model.experimentType;
                this.getParams = model.getParams;
                this.resource = model.resource;
                this.resourceName = model.resourceName;
                this.results = model.results;
                this.setParams = model.setParams;
                this.startTime = model.startTime;
                this.status = model.status;
                this.task = model.task;
                this.updateTime = model.updateTime;
                this.workload = model.workload;
                this.workloadName = model.workloadName;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-29 02:16:35</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Task end time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-29 02:26:35</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Running environment parameters</p>
             */
            public Builder envParams(EnvParams envParams) {
                this.envParams = envParams;
                return this;
            }

            /**
             * <p>Experiment ID</p>
             * 
             * <strong>example:</strong>
             * <p>1726882991828688898</p>
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * <p>Experiment name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder experimentName(String experimentName) {
                this.experimentName = experimentName;
                return this;
            }

            /**
             * <p>Experiment type</p>
             * 
             * <strong>example:</strong>
             * <p>AI</p>
             */
            public Builder experimentType(String experimentType) {
                this.experimentType = experimentType;
                return this;
            }

            /**
             * <p>Parsed workload parameters</p>
             */
            public Builder getParams(java.util.Map<String, String> getParams) {
                this.getParams = getParams;
                return this;
            }

            /**
             * <p>cluster info</p>
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * <p>Resource name</p>
             * 
             * <strong>example:</strong>
             * <p>cifnews-guoyuan</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>Task results</p>
             */
            public Builder results(Results results) {
                this.results = results;
                return this;
            }

            /**
             * <p>Running workload parameters</p>
             */
            public Builder setParams(java.util.Map<String, String> setParams) {
                this.setParams = setParams;
                return this;
            }

            /**
             * <p>Task start time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-29 02:16:35</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Status</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Experiment task</p>
             */
            public Builder task(Task task) {
                this.task = task;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-11-29 02:16:35</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>Workload information</p>
             */
            public Builder workload(Workload workload) {
                this.workload = workload;
                return this;
            }

            /**
             * <p>Workload name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
