// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link GetClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetClusterResponseBody</p>
 */
public class GetClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cluster")
    private Cluster cluster;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetClusterResponseBody(Builder builder) {
        this.cluster = builder.cluster;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cluster
     */
    public Cluster getCluster() {
        return this.cluster;
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
        private Cluster cluster; 
        private Integer code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetClusterResponseBody model) {
            this.cluster = model.cluster;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the cluster.</p>
         */
        public Builder cluster(Cluster cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The detailed information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>d76db491</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetClusterResponseBody build() {
            return new GetClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetClusterResponseBody</p>
     */
    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterImportStatus")
        private Integer clusterImportStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private Integer clusterType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CpuUsed")
        private Integer cpuUsed;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("CsClusterId")
        private String csClusterId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IaasProvider")
        private String iaasProvider;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("MemUsed")
        private Integer memUsed;

        @com.aliyun.core.annotation.NameInMap("NetworkMode")
        private Integer networkMode;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("OversoldFactor")
        private Integer oversoldFactor;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SubClusterType")
        private String subClusterType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Cluster(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterImportStatus = builder.clusterImportStatus;
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
            this.subClusterType = builder.subClusterType;
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
         * @return clusterImportStatus
         */
        public Integer getClusterImportStatus() {
            return this.clusterImportStatus;
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
         * @return subClusterType
         */
        public String getSubClusterType() {
            return this.subClusterType;
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
            private Integer clusterImportStatus; 
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
            private String subClusterType; 
            private Long updateTime; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Cluster model) {
                this.clusterId = model.clusterId;
                this.clusterImportStatus = model.clusterImportStatus;
                this.clusterName = model.clusterName;
                this.clusterType = model.clusterType;
                this.cpu = model.cpu;
                this.cpuUsed = model.cpuUsed;
                this.createTime = model.createTime;
                this.csClusterId = model.csClusterId;
                this.description = model.description;
                this.iaasProvider = model.iaasProvider;
                this.mem = model.mem;
                this.memUsed = model.memUsed;
                this.networkMode = model.networkMode;
                this.nodeNum = model.nodeNum;
                this.oversoldFactor = model.oversoldFactor;
                this.regionId = model.regionId;
                this.subClusterType = model.subClusterType;
                this.updateTime = model.updateTime;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>5439271a-015b-433d-befb-d76d****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The import status of the cluster. Valid values:</p>
             * <ul>
             * <li>1: The cluster is imported.</li>
             * <li>2: The cluster fails to be imported.</li>
             * <li>3: The cluster is being imported.</li>
             * <li>4: The cluster is deleted.</li>
             * <li>0: The cluster is not imported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder clusterImportStatus(Integer clusterImportStatus) {
                this.clusterImportStatus = clusterImportStatus;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ClusterTest</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li>0: regular Docker cluster</li>
             * <li>1: Swarm cluster</li>
             * <li>2: Elastic Compute Service (ECS) cluster</li>
             * <li>3: self-managed Kubernetes cluster in EDAS</li>
             * <li>4: cluster in which Pandora automatically registers applications</li>
             * <li>5: ACK cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The total number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The number of used CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder cpuUsed(Integer cpuUsed) {
                this.cpuUsed = cpuUsed;
                return this;
            }

            /**
             * <p>The time when the cluster was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1570708232145</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the Container Service for Kubernetes (ACK) cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c2ce62869f4d4466b920312315f05****</p>
             */
            public Builder csClusterId(String csClusterId) {
                this.csClusterId = csClusterId;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The provider of Infrastructure as a Service (IaaS) resources used in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder iaasProvider(String iaasProvider) {
                this.iaasProvider = iaasProvider;
                return this;
            }

            /**
             * <p>The total size of memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The size of used memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder memUsed(Integer memUsed) {
                this.memUsed = memUsed;
                return this;
            }

            /**
             * <p>The network type of the cluster. Valid values:</p>
             * <ul>
             * <li>1: classic network</li>
             * <li>2: virtual private cloud (VPC)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder networkMode(Integer networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * <p>The number of ECS instances.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * <p>The overcommit ratio supported by a Docker cluster. Valid values:</p>
             * <ul>
             * <li>1: 1:1, which means that resources are not overcommitted.</li>
             * <li>2: 1:2, which means that resources are overcommitted by 1:2.</li>
             * <li>4: 1:4, which means that resources are overcommitted by 1:4.</li>
             * <li>8: 1:8, which means that resources are overcommitted by 1:8.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder oversoldFactor(Integer oversoldFactor) {
                this.oversoldFactor = oversoldFactor;
                return this;
            }

            /**
             * <p>The ID of the region where the cluster resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The subtype of the Kubernetes cluster. Valid values: ManagedKubernetes, Ask, and ExternalKubernetes. ManagedKubernetes refers to the ACK cluster. Ask refers to the Serverless Kubernetes (ASK) cluster. ExternalKubernetes refers to the external cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ManagedKubernetes</p>
             */
            public Builder subClusterType(String subClusterType) {
                this.subClusterType = subClusterType;
                return this;
            }

            /**
             * <p>The time when the cluster was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1570708232145</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxz1mlwpb****</p>
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
}
