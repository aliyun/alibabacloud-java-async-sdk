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
 * {@link CreateResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceRequest</p>
 */
public class CreateResourceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterDesc")
    private String clusterDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MachineTypes")
    private MachineTypes machineTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserAccessParam")
    private UserAccessParam userAccessParam;

    private CreateResourceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterDesc = builder.clusterDesc;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.machineTypes = builder.machineTypes;
        this.resourceType = builder.resourceType;
        this.userAccessParam = builder.userAccessParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return machineTypes
     */
    public MachineTypes getMachineTypes() {
        return this.machineTypes;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return userAccessParam
     */
    public UserAccessParam getUserAccessParam() {
        return this.userAccessParam;
    }

    public static final class Builder extends Request.Builder<CreateResourceRequest, Builder> {
        private String regionId; 
        private String clusterDesc; 
        private String clusterId; 
        private String clusterName; 
        private String clusterType; 
        private MachineTypes machineTypes; 
        private String resourceType; 
        private UserAccessParam userAccessParam; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterDesc = request.clusterDesc;
            this.clusterId = request.clusterId;
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.machineTypes = request.machineTypes;
            this.resourceType = request.resourceType;
            this.userAccessParam = request.userAccessParam;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Cluster Description</p>
         * 
         * <strong>example:</strong>
         * <p>ppu集群</p>
         */
        public Builder clusterDesc(String clusterDesc) {
            this.putQueryParameter("ClusterDesc", clusterDesc);
            this.clusterDesc = clusterDesc;
            return this;
        }

        /**
         * <p>Cluster ID</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-sh-fj71c0ycfw</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Cluster Name</p>
         * 
         * <strong>example:</strong>
         * <p>tre-1-ppu</p>
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>Cluster Type</p>
         * 
         * <strong>example:</strong>
         * <p>ACK</p>
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>Machine Types</p>
         */
        public Builder machineTypes(MachineTypes machineTypes) {
            String machineTypesShrink = shrink(machineTypes, "MachineTypes", "json");
            this.putBodyParameter("MachineTypes", machineTypesShrink);
            this.machineTypes = machineTypes;
            return this;
        }

        /**
         * <p>Resource Type</p>
         * 
         * <strong>example:</strong>
         * <p>ACK</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>User Access Parameters</p>
         */
        public Builder userAccessParam(UserAccessParam userAccessParam) {
            String userAccessParamShrink = shrink(userAccessParam, "UserAccessParam", "json");
            this.putBodyParameter("UserAccessParam", userAccessParamShrink);
            this.userAccessParam = userAccessParam;
            return this;
        }

        @Override
        public CreateResourceRequest build() {
            return new CreateResourceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateResourceRequest} extends {@link TeaModel}
     *
     * <p>CreateResourceRequest</p>
     */
    public static class MachineTypes extends TeaModel {
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

        private MachineTypes(Builder builder) {
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

        public static MachineTypes create() {
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
             * <p>Number of Network Bonds</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder bondNum(Integer bondNum) {
                this.bondNum = bondNum;
                return this;
            }

            /**
             * <p>CPU Information</p>
             * 
             * <strong>example:</strong>
             * <p>2x Intel Saphhire Rapid 8469C 48C CPU</p>
             */
            public Builder cpuInfo(String cpuInfo) {
                this.cpuInfo = cpuInfo;
                return this;
            }

            /**
             * <p>Disk Information</p>
             * 
             * <strong>example:</strong>
             * <p>2x 480GB SATA SSD \n 4x 3.84TB NVMe SSD</p>
             */
            public Builder diskInfo(String diskInfo) {
                this.diskInfo = diskInfo;
                return this;
            }

            /**
             * <p>GPU Information</p>
             * 
             * <strong>example:</strong>
             * <p>8x NVIDIA SXM4 80GB A100 GPU</p>
             */
            public Builder gpuInfo(String gpuInfo) {
                this.gpuInfo = gpuInfo;
                return this;
            }

            /**
             * <p>Memory Information</p>
             * 
             * <strong>example:</strong>
             * <p>32x 64GB DDR4 4800 Memory</p>
             */
            public Builder memoryInfo(String memoryInfo) {
                this.memoryInfo = memoryInfo;
                return this;
            }

            /**
             * <p>Specification Name</p>
             * 
             * <strong>example:</strong>
             * <p>efg1.nvga1n</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Network Information</p>
             * 
             * <strong>example:</strong>
             * <p>1x 200Gbps Dual Port BF3 DPU for VPC\n4x 200Gbps Dual Port EIC</p>
             */
            public Builder networkInfo(String networkInfo) {
                this.networkInfo = networkInfo;
                return this;
            }

            /**
             * <p>Network Mode</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder networkMode(String networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * <p>Number of Nodes</p>
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

            public MachineTypes build() {
                return new MachineTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateResourceRequest} extends {@link TeaModel}
     *
     * <p>CreateResourceRequest</p>
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
             * <p>User Key</p>
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
             * <p>1245688643</p>
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
}
