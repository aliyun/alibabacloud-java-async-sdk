// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClustersResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersResponseBody</p>
 */
public class ListClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    private java.util.List < Clusters> clusters;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
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
    public java.util.List < Clusters> getClusters() {
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
        private java.util.List < Clusters> clusters; 
        private String nextToken; 
        private String requestId; 

        /**
         * 集群信息
         */
        public Builder clusters(java.util.List < Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * 本次调用返回的查询凭证值。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClustersResponseBody build() {
            return new ListClustersResponseBody(this);
        } 

    } 

    public static class Clusters extends TeaModel {
        @NameInMap("ClusterDescription")
        private String clusterDescription;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterType")
        private String clusterType;

        @NameInMap("Components")
        private Object components;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("NodeCount")
        private Long nodeCount;

        @NameInMap("NodeGroupCount")
        private Long nodeGroupCount;

        @NameInMap("OperatingState")
        private String operatingState;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("UpdateTime")
        private String updateTime;

        private Clusters(Builder builder) {
            this.clusterDescription = builder.clusterDescription;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.components = builder.components;
            this.createTime = builder.createTime;
            this.nodeCount = builder.nodeCount;
            this.nodeGroupCount = builder.nodeGroupCount;
            this.operatingState = builder.operatingState;
            this.resourceGroupId = builder.resourceGroupId;
            this.taskId = builder.taskId;
            this.updateTime = builder.updateTime;
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        public static final class Builder {
            private String clusterDescription; 
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private Object components; 
            private String createTime; 
            private Long nodeCount; 
            private Long nodeGroupCount; 
            private String operatingState; 
            private String resourceGroupId; 
            private String taskId; 
            private String updateTime; 

            /**
             * 集群描述
             */
            public Builder clusterDescription(String clusterDescription) {
                this.clusterDescription = clusterDescription;
                return this;
            }

            /**
             * 集群id
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * 集群name
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * 集群类型
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * 组件信息
             */
            public Builder components(Object components) {
                this.components = components;
                return this;
            }

            /**
             * 创建时间
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 节点数量
             */
            public Builder nodeCount(Long nodeCount) {
                this.nodeCount = nodeCount;
                return this;
            }

            /**
             * 节点组数量
             */
            public Builder nodeGroupCount(Long nodeGroupCount) {
                this.nodeGroupCount = nodeGroupCount;
                return this;
            }

            /**
             * 集群状态
             */
            public Builder operatingState(String operatingState) {
                this.operatingState = operatingState;
                return this;
            }

            /**
             * 资源组id
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * 任务id
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * 更新时间
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
