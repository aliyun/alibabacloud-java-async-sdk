// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterResponseBody</p>
 */
public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("ClusterDescription")
    private String clusterDescription;

    @NameInMap("ClusterId")
    private String clusterId;

    @NameInMap("ClusterName")
    private String clusterName;

    @NameInMap("ClusterType")
    private String clusterType;

    @NameInMap("Components")
    private java.util.List < Components> components;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Networks")
    private java.util.List < Networks> networks;

    @NameInMap("NodeCount")
    private Long nodeCount;

    @NameInMap("NodeGroupCount")
    private Long nodeGroupCount;

    @NameInMap("OperatingState")
    private String operatingState;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("TaskId")
    private String taskId;

    @NameInMap("UpdateTime")
    private String updateTime;

    private DescribeClusterResponseBody(Builder builder) {
        this.clusterDescription = builder.clusterDescription;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.components = builder.components;
        this.createTime = builder.createTime;
        this.networks = builder.networks;
        this.nodeCount = builder.nodeCount;
        this.nodeGroupCount = builder.nodeGroupCount;
        this.operatingState = builder.operatingState;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.taskId = builder.taskId;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterResponseBody create() {
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
    public java.util.List < Components> getComponents() {
        return this.components;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return networks
     */
    public java.util.List < Networks> getNetworks() {
        return this.networks;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private java.util.List < Components> components; 
        private String createTime; 
        private java.util.List < Networks> networks; 
        private Long nodeCount; 
        private Long nodeGroupCount; 
        private String operatingState; 
        private String requestId; 
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
         * 集群名称
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
        public Builder components(java.util.List < Components> components) {
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
         * 网络信息
         */
        public Builder networks(java.util.List < Networks> networks) {
            this.networks = networks;
            return this;
        }

        /**
         * 节点数
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
         * 请求id
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeClusterResponseBody build() {
            return new DescribeClusterResponseBody(this);
        } 

    } 

    public static class Components extends TeaModel {
        @NameInMap("ComponentId")
        private String componentId;

        @NameInMap("ComponentType")
        private String componentType;

        private Components(Builder builder) {
            this.componentId = builder.componentId;
            this.componentType = builder.componentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return componentId
         */
        public String getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        public static final class Builder {
            private String componentId; 
            private String componentType; 

            /**
             * 组件id
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * 组件类型
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    public static class Networks extends TeaModel {
        @NameInMap("VpdId")
        private String vpdId;

        private Networks(Builder builder) {
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Networks create() {
            return builder().build();
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private String vpdId; 

            /**
             * 集群网段id
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public Networks build() {
                return new Networks(this);
            } 

        } 

    }
}
