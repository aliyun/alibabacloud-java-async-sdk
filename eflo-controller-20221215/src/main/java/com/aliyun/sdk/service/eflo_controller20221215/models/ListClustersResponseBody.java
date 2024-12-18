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

        /**
         * Clusters.
         */
        public Builder clusters(java.util.List<Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
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
            private String taskId; 
            private String updateTime; 
            private String vpcId; 

            /**
             * ClusterDescription.
             */
            public Builder clusterDescription(String clusterDescription) {
                this.clusterDescription = clusterDescription;
                return this;
            }

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * Components.
             */
            public Builder components(Object components) {
                this.components = components;
                return this;
            }

            /**
             * ComputingIpVersion.
             */
            public Builder computingIpVersion(String computingIpVersion) {
                this.computingIpVersion = computingIpVersion;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * HpnZone.
             */
            public Builder hpnZone(String hpnZone) {
                this.hpnZone = hpnZone;
                return this;
            }

            /**
             * NodeCount.
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * NodeGroupCount.
             */
            public Builder nodeGroupCount(Long nodeGroupCount) {
                this.nodeGroupCount = nodeGroupCount;
                return this;
            }

            /**
             * OperatingState.
             */
            public Builder operatingState(String operatingState) {
                this.operatingState = operatingState;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VpcId.
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
