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
 * {@link GetResourceResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceResponseBody</p>
 */
public class GetResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetResourceResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceResponseBody create() {
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

        private Builder(GetResourceResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Access denied information</p>
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
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>25859897-35C8-5015-8365-7A3CE52F4854</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total count of the query</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetResourceResponseBody build() {
            return new GetResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceResponseBody</p>
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
             * <p>2x Intel Saphhire Rapid 8469C 48C CPU</p>
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * <p>Disk information</p>
             * 
             * <strong>example:</strong>
             * <p>2x 480GB SATA SSD\n4x 3.84TB NVMe SSD</p>
             */
            public Builder diskInfo(String diskInfo) {
                this.diskInfo = diskInfo;
                return this;
            }

            /**
             * <p>GPU information</p>
             * 
             * <strong>example:</strong>
             * <p>8x OAM 810 GPU</p>
             */
            public Builder gpuInfo(String gpuInfo) {
                this.gpuInfo = gpuInfo;
                return this;
            }

            /**
             * <p>Memory information</p>
             * 
             * <strong>example:</strong>
             * <p>32x 64GB DDR4 4800 Memory</p>
             */
            public Builder memoryInfo(String memoryInfo) {
                this.memoryInfo = memoryInfo;
                return this;
            }

            /**
             * <p>Specification name</p>
             * 
             * <strong>example:</strong>
             * <p>efg2.p8en</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Network information</p>
             * 
             * <strong>example:</strong>
             * <p>1x 200Gbps Dual Port BF3 DPU for VPC\n4x 200Gbps Dual Port EIC</p>
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
             * <p>Private</p>
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
     * {@link GetResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceResponseBody</p>
     */
    public static class ResourceNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private ResourceNodes(Builder builder) {
            this.nodeName = builder.nodeName;
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

        public static final class Builder {
            private String nodeName; 

            private Builder() {
            } 

            private Builder(ResourceNodes model) {
                this.nodeName = model.nodeName;
            } 

            /**
             * <p>Node name</p>
             * 
             * <strong>example:</strong>
             * <p>lingj19q90jp66nq-mg2pa0p2l2bipnsi-17</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public ResourceNodes build() {
                return new ResourceNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceResponseBody</p>
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
             * <p>test</p>
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
     * {@link GetResourceResponseBody} extends {@link TeaModel}
     *
     * <p>GetResourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterDesc")
        private String clusterDesc;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

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

        @com.aliyun.core.annotation.NameInMap("ResourceNodes")
        private java.util.List<ResourceNodes> resourceNodes;

        @com.aliyun.core.annotation.NameInMap("UserAccessParam")
        private UserAccessParam userAccessParam;

        private Data(Builder builder) {
            this.clusterDesc = builder.clusterDesc;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.cpuCoreLimit = builder.cpuCoreLimit;
            this.gpuLimit = builder.gpuLimit;
            this.machineType = builder.machineType;
            this.maxCpuCore = builder.maxCpuCore;
            this.maxGpu = builder.maxGpu;
            this.maxMemory = builder.maxMemory;
            this.memoryLimit = builder.memoryLimit;
            this.resourceId = builder.resourceId;
            this.resourceNodes = builder.resourceNodes;
            this.userAccessParam = builder.userAccessParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterDesc
         */
        public String getClusterDesc() {
            return this.clusterDesc;
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
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
         * @return resourceNodes
         */
        public java.util.List<ResourceNodes> getResourceNodes() {
            return this.resourceNodes;
        }

        /**
         * @return userAccessParam
         */
        public UserAccessParam getUserAccessParam() {
            return this.userAccessParam;
        }

        public static final class Builder {
            private String clusterDesc; 
            private String clusterId; 
            private String clusterName; 
            private Integer cpuCoreLimit; 
            private Integer gpuLimit; 
            private MachineType machineType; 
            private Integer maxCpuCore; 
            private Integer maxGpu; 
            private Long maxMemory; 
            private Long memoryLimit; 
            private Long resourceId; 
            private java.util.List<ResourceNodes> resourceNodes; 
            private UserAccessParam userAccessParam; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.clusterDesc = model.clusterDesc;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.cpuCoreLimit = model.cpuCoreLimit;
                this.gpuLimit = model.gpuLimit;
                this.machineType = model.machineType;
                this.maxCpuCore = model.maxCpuCore;
                this.maxGpu = model.maxGpu;
                this.maxMemory = model.maxMemory;
                this.memoryLimit = model.memoryLimit;
                this.resourceId = model.resourceId;
                this.resourceNodes = model.resourceNodes;
                this.userAccessParam = model.userAccessParam;
            } 

            /**
             * <p>Cluster description</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder clusterDesc(String clusterDesc) {
                this.clusterDesc = clusterDesc;
                return this;
            }

            /**
             * <p>Cluster ID</p>
             * 
             * <strong>example:</strong>
             * <p>3123121223</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Cluster name</p>
             * 
             * <strong>example:</strong>
             * <p>main_cluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
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
             * <p>Machine type</p>
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
             * <p>List of resource nodes</p>
             */
            public Builder resourceNodes(java.util.List<ResourceNodes> resourceNodes) {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
