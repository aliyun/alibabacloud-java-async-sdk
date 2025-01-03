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

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * TotalCount.
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

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * RequestCPU.
             */
            public Builder requestCPU(Integer requestCPU) {
                this.requestCPU = requestCPU;
                return this;
            }

            /**
             * RequestGPU.
             */
            public Builder requestGPU(Integer requestGPU) {
                this.requestGPU = requestGPU;
                return this;
            }

            /**
             * RequestMemory.
             */
            public Builder requestMemory(Integer requestMemory) {
                this.requestMemory = requestMemory;
                return this;
            }

            /**
             * TotalCPU.
             */
            public Builder totalCPU(Integer totalCPU) {
                this.totalCPU = totalCPU;
                return this;
            }

            /**
             * TotalGPU.
             */
            public Builder totalGPU(Integer totalGPU) {
                this.totalGPU = totalGPU;
                return this;
            }

            /**
             * TotalMemory.
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

            /**
             * CpuPerWorker.
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
             * ExtendParam.
             */
            public Builder extendParam(java.util.Map<String, String> extendParam) {
                this.extendParam = extendParam;
                return this;
            }

            /**
             * <p>GpuDriverVersion</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder gpuDriverVersion(String gpuDriverVersion) {
                this.gpuDriverVersion = gpuDriverVersion;
                return this;
            }

            /**
             * GpuPerWorker.
             */
            public Builder gpuPerWorker(Integer gpuPerWorker) {
                this.gpuPerWorker = gpuPerWorker;
                return this;
            }

            /**
             * MemoryPerWorker.
             */
            public Builder memoryPerWorker(Integer memoryPerWorker) {
                this.memoryPerWorker = memoryPerWorker;
                return this;
            }

            /**
             * <p>NCCLVersion</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder NCCLVersion(String NCCLVersion) {
                this.NCCLVersion = NCCLVersion;
                return this;
            }

            /**
             * <p>PyTorchVersion</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder pyTorchVersion(String pyTorchVersion) {
                this.pyTorchVersion = pyTorchVersion;
                return this;
            }

            /**
             * ResourceNodes.
             */
            public Builder resourceNodes(java.util.List<ResourceNodes> resourceNodes) {
                this.resourceNodes = resourceNodes;
                return this;
            }

            /**
             * ShareMemory.
             */
            public Builder shareMemory(Integer shareMemory) {
                this.shareMemory = shareMemory;
                return this;
            }

            /**
             * WorkerNum.
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

            /**
             * BondNum.
             */
            public Builder bondNum(Integer bondNum) {
                this.bondNum = bondNum;
                return this;
            }

            /**
             * CpuInfo.
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * DiskInfo.
             */
            public Builder diskInfo(String diskInfo) {
                this.diskInfo = diskInfo;
                return this;
            }

            /**
             * GpuInfo.
             */
            public Builder gpuInfo(String gpuInfo) {
                this.gpuInfo = gpuInfo;
                return this;
            }

            /**
             * MemoryInfo.
             */
            public Builder memoryInfo(String memoryInfo) {
                this.memoryInfo = memoryInfo;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NetworkInfo.
             */
            public Builder networkInfo(String networkInfo) {
                this.networkInfo = networkInfo;
                return this;
            }

            /**
             * NetworkMode.
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Integer nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * Type.
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

            /**
             * NodeName.
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

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * AccessKey.
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * <p>endpoint</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * WorkspaceId.
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

            /**
             * CpuCoreLimit.
             */
            public Builder cpuCoreLimit(Integer cpuCoreLimit) {
                this.cpuCoreLimit = cpuCoreLimit;
                return this;
            }

            /**
             * GpuLimit.
             */
            public Builder gpuLimit(Integer gpuLimit) {
                this.gpuLimit = gpuLimit;
                return this;
            }

            /**
             * MachineType.
             */
            public Builder machineType(MachineType machineType) {
                this.machineType = machineType;
                return this;
            }

            /**
             * MaxCpuCore.
             */
            public Builder maxCpuCore(Integer maxCpuCore) {
                this.maxCpuCore = maxCpuCore;
                return this;
            }

            /**
             * MaxGpu.
             */
            public Builder maxGpu(Integer maxGpu) {
                this.maxGpu = maxGpu;
                return this;
            }

            /**
             * MaxMemory.
             */
            public Builder maxMemory(Long maxMemory) {
                this.maxMemory = maxMemory;
                return this;
            }

            /**
             * MemoryLimit.
             */
            public Builder memoryLimit(Long memoryLimit) {
                this.memoryLimit = memoryLimit;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(Long resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceNodes.
             */
            public Builder resourceNodes(java.util.List<ResourceResourceNodes> resourceNodes) {
                this.resourceNodes = resourceNodes;
                return this;
            }

            /**
             * UserAccessParam.
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

            /**
             * ErrorFlag.
             */
            public Builder errorFlag(Boolean errorFlag) {
                this.errorFlag = errorFlag;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * GpuName.
             */
            public Builder gpuName(String gpuName) {
                this.gpuName = gpuName;
                return this;
            }

            /**
             * GpuNum.
             */
            public Builder gpuNum(Integer gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * PodName.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * SamplesPerSecond.
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * Tflops.
             */
            public Builder tflops(Double tflops) {
                this.tflops = tflops;
                return this;
            }

            /**
             * WarningFlag.
             */
            public Builder warningFlag(Boolean warningFlag) {
                this.warningFlag = warningFlag;
                return this;
            }

            /**
             * WarningMsg.
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

            /**
             * ErrorFlag.
             */
            public Builder errorFlag(Boolean errorFlag) {
                this.errorFlag = errorFlag;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * GpuName.
             */
            public Builder gpuName(String gpuName) {
                this.gpuName = gpuName;
                return this;
            }

            /**
             * GpuNum.
             */
            public Builder gpuNum(Integer gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * PodName.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * SamplesPerSecond.
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * Tflops.
             */
            public Builder tflops(Double tflops) {
                this.tflops = tflops;
                return this;
            }

            /**
             * WarningFlag.
             */
            public Builder warningFlag(Boolean warningFlag) {
                this.warningFlag = warningFlag;
                return this;
            }

            /**
             * WarningMsg.
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

            /**
             * Iteration.
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

            /**
             * ErrorFlag.
             */
            public Builder errorFlag(Boolean errorFlag) {
                this.errorFlag = errorFlag;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * GpuName.
             */
            public Builder gpuName(String gpuName) {
                this.gpuName = gpuName;
                return this;
            }

            /**
             * GpuNum.
             */
            public Builder gpuNum(Integer gpuNum) {
                this.gpuNum = gpuNum;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * PodName.
             */
            public Builder podName(String podName) {
                this.podName = podName;
                return this;
            }

            /**
             * SamplesPerSecond.
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * Tflops.
             */
            public Builder tflops(Double tflops) {
                this.tflops = tflops;
                return this;
            }

            /**
             * WarningFlag.
             */
            public Builder warningFlag(Boolean warningFlag) {
                this.warningFlag = warningFlag;
                return this;
            }

            /**
             * WarningMsg.
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

            /**
             * Duration.
             */
            public Builder duration(Double duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ErrorWorker.
             */
            public Builder errorWorker(java.util.List<ErrorWorker> errorWorker) {
                this.errorWorker = errorWorker;
                return this;
            }

            /**
             * ExperimentId.
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
             * SamplesPerSecond.
             */
            public Builder samplesPerSecond(Double samplesPerSecond) {
                this.samplesPerSecond = samplesPerSecond;
                return this;
            }

            /**
             * SecondsPerIteration.
             */
            public Builder secondsPerIteration(Double secondsPerIteration) {
                this.secondsPerIteration = secondsPerIteration;
                return this;
            }

            /**
             * TaskIndividualResultList.
             */
            public Builder taskIndividualResultList(java.util.List<TaskIndividualResultList> taskIndividualResultList) {
                this.taskIndividualResultList = taskIndividualResultList;
                return this;
            }

            /**
             * TaskIndividualResultMap.
             */
            public Builder taskIndividualResultMap(java.util.Map<String, java.util.List<DataResultsTaskIndividualResultMapValue>> taskIndividualResultMap) {
                this.taskIndividualResultMap = taskIndividualResultMap;
                return this;
            }

            /**
             * WarningBoundList.
             */
            public Builder warningBoundList(java.util.List<WarningBoundList> warningBoundList) {
                this.warningBoundList = warningBoundList;
                return this;
            }

            /**
             * WarningWorker.
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

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Params.
             */
            public Builder params(java.util.Map<String, String> params) {
                this.params = params;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * UpdateTime.
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

            /**
             * DefaultValue.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * ParamDesc.
             */
            public Builder paramDesc(String paramDesc) {
                this.paramDesc = paramDesc;
                return this;
            }

            /**
             * ParamName.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * ParamRegex.
             */
            public Builder paramRegex(String paramRegex) {
                this.paramRegex = paramRegex;
                return this;
            }

            /**
             * ParamType.
             */
            public Builder paramType(String paramType) {
                this.paramType = paramType;
                return this;
            }

            /**
             * ParamValue.
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

            /**
             * FrameWork.
             */
            public Builder frameWork(String frameWork) {
                this.frameWork = frameWork;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * SoftwareStack.
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

            /**
             * DefaultCpuPerWorker.
             */
            public Builder defaultCpuPerWorker(Integer defaultCpuPerWorker) {
                this.defaultCpuPerWorker = defaultCpuPerWorker;
                return this;
            }

            /**
             * DefaultGpuPerWorker.
             */
            public Builder defaultGpuPerWorker(Integer defaultGpuPerWorker) {
                this.defaultGpuPerWorker = defaultGpuPerWorker;
                return this;
            }

            /**
             * DefaultMemoryPerWorker.
             */
            public Builder defaultMemoryPerWorker(Integer defaultMemoryPerWorker) {
                this.defaultMemoryPerWorker = defaultMemoryPerWorker;
                return this;
            }

            /**
             * DefaultShareMemory.
             */
            public Builder defaultShareMemory(Integer defaultShareMemory) {
                this.defaultShareMemory = defaultShareMemory;
                return this;
            }

            /**
             * Family.
             */
            public Builder family(String family) {
                this.family = family;
                return this;
            }

            /**
             * JobKind.
             */
            public Builder jobKind(String jobKind) {
                this.jobKind = jobKind;
                return this;
            }

            /**
             * ParamSettings.
             */
            public Builder paramSettings(java.util.List<ParamSettings> paramSettings) {
                this.paramSettings = paramSettings;
                return this;
            }

            /**
             * Scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * StaticConfig.
             */
            public Builder staticConfig(StaticConfig staticConfig) {
                this.staticConfig = staticConfig;
                return this;
            }

            /**
             * VersionId.
             */
            public Builder versionId(Long versionId) {
                this.versionId = versionId;
                return this;
            }

            /**
             * WorkloadDescription.
             */
            public Builder workloadDescription(String workloadDescription) {
                this.workloadDescription = workloadDescription;
                return this;
            }

            /**
             * WorkloadId.
             */
            public Builder workloadId(Long workloadId) {
                this.workloadId = workloadId;
                return this;
            }

            /**
             * WorkloadName.
             */
            public Builder workloadName(String workloadName) {
                this.workloadName = workloadName;
                return this;
            }

            /**
             * WorkloadType.
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

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * EnvParams.
             */
            public Builder envParams(EnvParams envParams) {
                this.envParams = envParams;
                return this;
            }

            /**
             * ExperimentId.
             */
            public Builder experimentId(Long experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * ExperimentName.
             */
            public Builder experimentName(String experimentName) {
                this.experimentName = experimentName;
                return this;
            }

            /**
             * ExperimentType.
             */
            public Builder experimentType(String experimentType) {
                this.experimentType = experimentType;
                return this;
            }

            /**
             * GetParams.
             */
            public Builder getParams(java.util.Map<String, String> getParams) {
                this.getParams = getParams;
                return this;
            }

            /**
             * Resource.
             */
            public Builder resource(Resource resource) {
                this.resource = resource;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * Results.
             */
            public Builder results(Results results) {
                this.results = results;
                return this;
            }

            /**
             * SetParams.
             */
            public Builder setParams(java.util.Map<String, String> setParams) {
                this.setParams = setParams;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Task.
             */
            public Builder task(Task task) {
                this.task = task;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Workload.
             */
            public Builder workload(Workload workload) {
                this.workload = workload;
                return this;
            }

            /**
             * WorkloadName.
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
