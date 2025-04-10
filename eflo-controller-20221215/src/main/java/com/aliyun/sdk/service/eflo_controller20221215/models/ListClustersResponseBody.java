// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List<Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public java.util.List<Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Clusters> clusters; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListClustersResponseBody model) {
            this.clusters = model.clusters;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Cluster information</p>
         */
        public Builder clusters(java.util.List<Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The query token value returned by this call.</p>
         * 
         * <strong>example:</strong>
         * <p>f4f9a292c17072a2</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>2FE2B22C-CF9D-59DE-BF63-DC9B9B33A9D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of tag object</p>
             * 
             * <strong>example:</strong>
             * <p>aa_key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag object</p>
             * 
             * <strong>example:</strong>
             * <p>aa_value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClustersResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterDescription")
        private String clusterDescription;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("Components")
        private Object components;

        @com.aliyun.core.annotation.NameInMap("ComputingIpVersion")
        private String computingIpVersion;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("HpnZone")
        private String hpnZone;

        @com.aliyun.core.annotation.NameInMap("NodeCount")
        private Long nodeCount;

        @com.aliyun.core.annotation.NameInMap("NodeGroupCount")
        private Long nodeGroupCount;

        @com.aliyun.core.annotation.NameInMap("OperatingState")
        private String operatingState;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Clusters(Builder builder) {
            this.clusterDescription = builder.clusterDescription;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.components = builder.components;
            this.computingIpVersion = builder.computingIpVersion;
            this.createTime = builder.createTime;
            this.hpnZone = builder.hpnZone;
            this.nodeCount = builder.nodeCount;
            this.nodeGroupCount = builder.nodeGroupCount;
            this.operatingState = builder.operatingState;
            this.resourceGroupId = builder.resourceGroupId;
            this.tags = builder.tags;
            this.taskId = builder.taskId;
            this.updateTime = builder.updateTime;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return clusterDescription
         */
        public String getClusterDescription() {
            return this.clusterDescription;
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
         * @return components
         */
        public Object getComponents() {
            return this.components;
        }

        /**
         * @return computingIpVersion
         */
        public String getComputingIpVersion() {
            return this.computingIpVersion;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return hpnZone
         */
        public String getHpnZone() {
            return this.hpnZone;
        }

        /**
         * @return nodeCount
         */
        public Long getNodeCount() {
            return this.nodeCount;
        }

        /**
         * @return nodeGroupCount
         */
        public Long getNodeGroupCount() {
            return this.nodeGroupCount;
        }

        /**
         * @return operatingState
         */
        public String getOperatingState() {
            return this.operatingState;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterDescription; 
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private Object components; 
            private String computingIpVersion; 
            private String createTime; 
            private String hpnZone; 
            private Long nodeCount; 
            private Long nodeGroupCount; 
            private String operatingState; 
            private String resourceGroupId; 
            private java.util.List<Tags> tags; 
            private String taskId; 
            private String updateTime; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Clusters model) {
                this.clusterDescription = model.clusterDescription;
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.clusterType = model.clusterType;
                this.components = model.components;
                this.computingIpVersion = model.computingIpVersion;
                this.createTime = model.createTime;
                this.hpnZone = model.hpnZone;
                this.nodeCount = model.nodeCount;
                this.nodeGroupCount = model.nodeGroupCount;
                this.operatingState = model.operatingState;
                this.resourceGroupId = model.resourceGroupId;
                this.tags = model.tags;
                this.taskId = model.taskId;
                this.updateTime = model.updateTime;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>Cluster description</p>
             * 
             * <strong>example:</strong>
             * <p>PPU-cluster2 bz</p>
             */
            public Builder clusterDescription(String clusterDescription) {
                this.clusterDescription = clusterDescription;
                return this;
            }

            /**
             * <p>Cluster ID</p>
             * 
             * <strong>example:</strong>
             * <p>i137590131672134915401</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>Cluster name</p>
             * 
             * <strong>example:</strong>
             * <p>cnp_test_cluster</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>Cluster type</p>
             * 
             * <strong>example:</strong>
             * <p>AckEdgePro</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>Component information</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder components(Object components) {
                this.components = components;
                return this;
            }

            /**
             * <p>IP version of the computing network</p>
             * 
             * <strong>example:</strong>
             * <p>IPv4</p>
             */
            public Builder computingIpVersion(String computingIpVersion) {
                this.computingIpVersion = computingIpVersion;
                return this;
            }

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>1672134938</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Cluster number</p>
             * 
             * <strong>example:</strong>
             * <p>B1</p>
             */
            public Builder hpnZone(String hpnZone) {
                this.hpnZone = hpnZone;
                return this;
            }

            /**
             * <p>Number of nodes</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * <p>Number of node groups</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodeGroupCount(Long nodeGroupCount) {
                this.nodeGroupCount = nodeGroupCount;
                return this;
            }

            /**
             * <p>Cluster status</p>
             * 
             * <strong>example:</strong>
             * <p>initializing</p>
             */
            public Builder operatingState(String operatingState) {
                this.operatingState = operatingState;
                return this;
            }

            /**
             * <p>Resource group ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek2ajbjoloa23q</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>tag information</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>Task ID</p>
             * 
             * <strong>example:</strong>
             * <p>i156365121663149566024</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>1672134968</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>VPC ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-0jlx4hol2bjboafzmffvd</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
