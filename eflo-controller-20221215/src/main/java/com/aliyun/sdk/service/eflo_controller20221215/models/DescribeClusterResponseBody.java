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
 * {@link DescribeClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterResponseBody</p>
 */
public class DescribeClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterDescription")
    private String clusterDescription;

    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("Components")
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.NameInMap("ComputingIpVersion")
    private String computingIpVersion;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("HpnZone")
    private String hpnZone;

    @com.aliyun.core.annotation.NameInMap("Networks")
    private java.util.List<Networks> networks;

    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Long nodeCount;

    @com.aliyun.core.annotation.NameInMap("NodeGroupCount")
    private Long nodeGroupCount;

    @com.aliyun.core.annotation.NameInMap("OpenEniJumboFrame")
    private String openEniJumboFrame;

    @com.aliyun.core.annotation.NameInMap("OperatingState")
    private String operatingState;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private DescribeClusterResponseBody(Builder builder) {
        this.clusterDescription = builder.clusterDescription;
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.components = builder.components;
        this.computingIpVersion = builder.computingIpVersion;
        this.createTime = builder.createTime;
        this.hpnZone = builder.hpnZone;
        this.networks = builder.networks;
        this.nodeCount = builder.nodeCount;
        this.nodeGroupCount = builder.nodeGroupCount;
        this.openEniJumboFrame = builder.openEniJumboFrame;
        this.operatingState = builder.operatingState;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.taskId = builder.taskId;
        this.updateTime = builder.updateTime;
        this.vpcId = builder.vpcId;
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
    public java.util.List<Components> getComponents() {
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
     * @return networks
     */
    public java.util.List<Networks> getNetworks() {
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
     * @return openEniJumboFrame
     */
    public String getOpenEniJumboFrame() {
        return this.openEniJumboFrame;
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
        private java.util.List<Components> components; 
        private String computingIpVersion; 
        private String createTime; 
        private String hpnZone; 
        private java.util.List<Networks> networks; 
        private Long nodeCount; 
        private Long nodeGroupCount; 
        private String openEniJumboFrame; 
        private String operatingState; 
        private String requestId; 
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
        public Builder components(java.util.List<Components> components) {
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
         * Networks.
         */
        public Builder networks(java.util.List<Networks> networks) {
            this.networks = networks;
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
         * OpenEniJumboFrame.
         */
        public Builder openEniJumboFrame(String openEniJumboFrame) {
            this.openEniJumboFrame = openEniJumboFrame;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeClusterResponseBody build() {
            return new DescribeClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentId")
        private String componentId;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
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
             * ComponentId.
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * ComponentType.
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
    /**
     * 
     * {@link DescribeClusterResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeClusterResponseBody</p>
     */
    public static class Networks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VpdId")
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
             * VpdId.
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
