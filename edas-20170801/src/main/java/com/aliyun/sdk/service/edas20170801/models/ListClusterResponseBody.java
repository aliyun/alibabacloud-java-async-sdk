// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterResponseBody</p>
 */
public class ListClusterResponseBody extends TeaModel {
    @NameInMap("ClusterList")
    private ClusterList clusterList;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListClusterResponseBody(Builder builder) {
        this.clusterList = builder.clusterList;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterList
     */
    public ClusterList getClusterList() {
        return this.clusterList;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterList clusterList; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The clusters.
         */
        public Builder clusterList(ClusterList clusterList) {
            this.clusterList = clusterList;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterResponseBody build() {
            return new ListClusterResponseBody(this);
        } 

    } 

    public static class Cluster extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterType")
        private Integer clusterType;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CpuUsed")
        private Integer cpuUsed;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("CsClusterId")
        private String csClusterId;

        @NameInMap("Description")
        private String description;

        @NameInMap("IaasProvider")
        private String iaasProvider;

        @NameInMap("Mem")
        private Integer mem;

        @NameInMap("MemUsed")
        private Integer memUsed;

        @NameInMap("NetworkMode")
        private Integer networkMode;

        @NameInMap("NodeNum")
        private Integer nodeNum;

        @NameInMap("OversoldFactor")
        private Integer oversoldFactor;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("UpdateTime")
        private Long updateTime;

        @NameInMap("VpcId")
        private String vpcId;

        private Cluster(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.cpu = builder.cpu;
            this.cpuUsed = builder.cpuUsed;
            this.createTime = builder.createTime;
            this.csClusterId = builder.csClusterId;
            this.description = builder.description;
            this.iaasProvider = builder.iaasProvider;
            this.mem = builder.mem;
            this.memUsed = builder.memUsed;
            this.networkMode = builder.networkMode;
            this.nodeNum = builder.nodeNum;
            this.oversoldFactor = builder.oversoldFactor;
            this.regionId = builder.regionId;
            this.resourceGroupId = builder.resourceGroupId;
            this.updateTime = builder.updateTime;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
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
        public Integer getClusterType() {
            return this.clusterType;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return cpuUsed
         */
        public Integer getCpuUsed() {
            return this.cpuUsed;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return csClusterId
         */
        public String getCsClusterId() {
            return this.csClusterId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return iaasProvider
         */
        public String getIaasProvider() {
            return this.iaasProvider;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return memUsed
         */
        public Integer getMemUsed() {
            return this.memUsed;
        }

        /**
         * @return networkMode
         */
        public Integer getNetworkMode() {
            return this.networkMode;
        }

        /**
         * @return nodeNum
         */
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return oversoldFactor
         */
        public Integer getOversoldFactor() {
            return this.oversoldFactor;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private Integer clusterType; 
            private Integer cpu; 
            private Integer cpuUsed; 
            private Long createTime; 
            private String csClusterId; 
            private String description; 
            private String iaasProvider; 
            private Integer mem; 
            private Integer memUsed; 
            private Integer networkMode; 
            private Integer nodeNum; 
            private Integer oversoldFactor; 
            private String regionId; 
            private String resourceGroupId; 
            private Long updateTime; 
            private String vpcId; 

            /**
             * The ID of the cluster in EDAS.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The type of the cluster. Valid values:
             * <p>
             * 
             * *   0: regular Docker cluster
             * *   1: Swarm cluster
             * *   2: Elastic Compute Service (ECS) cluster
             * *   3: self-managed Kubernetes cluster in Enterprise Distributed Application Service (EDAS)
             * *   4: cluster in which Pandora automatically registers applications
             * *   5: ACK cluster
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The total number of CPU cores.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The number of used CPU cores.
             */
            public Builder cpuUsed(Integer cpuUsed) {
                this.cpuUsed = cpuUsed;
                return this;
            }

            /**
             * The timestamp when the cluster was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The ID of the cluster in Container Service for Kubernetes (ACK).
             */
            public Builder csClusterId(String csClusterId) {
                this.csClusterId = csClusterId;
                return this;
            }

            /**
             * The description of the cluster.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The provider of the cluster.
             */
            public Builder iaasProvider(String iaasProvider) {
                this.iaasProvider = iaasProvider;
                return this;
            }

            /**
             * The total size of memory. Unit: MB.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The size of used memory. Unit: MB.
             */
            public Builder memUsed(Integer memUsed) {
                this.memUsed = memUsed;
                return this;
            }

            /**
             * The network type of the cluster. Valid values:
             * <p>
             * 
             * *   1: classic network
             * *   2: virtual private cloud (VPC)
             */
            public Builder networkMode(Integer networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * The number of instances.
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * The CPU overcommit ratio that is supported by a Docker cluster. Valid values:
             * <p>
             * 
             * *   1: 1:1, which means that CPU resources are not overcommitted.
             * *   2: 1:2, which means that CPU resources are overcommitted by 1:2.
             * *   4: 1:4, which means that CPU resources are overcommitted by 1:4.
             * *   8: 1:8, which means that CPU resources are overcommitted by 1:8.
             */
            public Builder oversoldFactor(Integer oversoldFactor) {
                this.oversoldFactor = oversoldFactor;
                return this;
            }

            /**
             * The ID of the region.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the resource group.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The timestamp when the cluster was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VPC ID
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
    public static class ClusterList extends TeaModel {
        @NameInMap("Cluster")
        private java.util.List < Cluster> cluster;

        private ClusterList(Builder builder) {
            this.cluster = builder.cluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterList create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public java.util.List < Cluster> getCluster() {
            return this.cluster;
        }

        public static final class Builder {
            private java.util.List < Cluster> cluster; 

            /**
             * Cluster.
             */
            public Builder cluster(java.util.List < Cluster> cluster) {
                this.cluster = cluster;
                return this;
            }

            public ClusterList build() {
                return new ClusterList(this);
            } 

        } 

    }
}
