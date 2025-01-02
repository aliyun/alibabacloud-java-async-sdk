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
         * <p>Cluster Description</p>
         * 
         * <strong>example:</strong>
         * <p>Default cluster</p>
         */
        public Builder clusterDescription(String clusterDescription) {
            this.clusterDescription = clusterDescription;
            return this;
        }

        /**
         * <p>Cluster ID</p>
         * 
         * <strong>example:</strong>
         * <p>i116913051662373010974</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Cluster Name</p>
         * 
         * <strong>example:</strong>
         * <p>Eflo-YJ-Test-Cluster</p>
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>Cluster Type</p>
         * 
         * <strong>example:</strong>
         * <p>AckEdgePro</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>Component Information</p>
         */
        public Builder components(java.util.List<Components> components) {
            this.components = components;
            return this;
        }

        /**
         * <p>Type of IP in the compute network</p>
         * 
         * <strong>example:</strong>
         * <p>IPv4</p>
         */
        public Builder computingIpVersion(String computingIpVersion) {
            this.computingIpVersion = computingIpVersion;
            return this;
        }

        /**
         * <p>Creation Time</p>
         * 
         * <strong>example:</strong>
         * <p>2022-06-08T07:05:11Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Cluster Number</p>
         * 
         * <strong>example:</strong>
         * <p>A2</p>
         */
        public Builder hpnZone(String hpnZone) {
            this.hpnZone = hpnZone;
            return this;
        }

        /**
         * <p>Network Information</p>
         */
        public Builder networks(java.util.List<Networks> networks) {
            this.networks = networks;
            return this;
        }

        /**
         * <p>Number of Nodes</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeCount(Long nodeCount) {
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * <p>Number of Node Groups</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder nodeGroupCount(Long nodeGroupCount) {
            this.nodeGroupCount = nodeGroupCount;
            return this;
        }

        /**
         * <p>Open Eni Jumbo Frame</p>
         * 
         * <strong>example:</strong>
         * <p>close</p>
         */
        public Builder openEniJumboFrame(String openEniJumboFrame) {
            this.openEniJumboFrame = openEniJumboFrame;
            return this;
        }

        /**
         * <p>Cluster State</p>
         * 
         * <strong>example:</strong>
         * <p>running</p>
         */
        public Builder operatingState(String operatingState) {
            this.operatingState = operatingState;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Resource Group ID</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2k3rqlvv6ytq</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Task ID</p>
         * 
         * <strong>example:</strong>
         * <p>i152609221670466904596</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>Update Time</p>
         * 
         * <strong>example:</strong>
         * <p>2022-08-23T06:36:17.000Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>VPC ID</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-0jlkqysom5dmcviymep3f</p>
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
             * <p>Component ID</p>
             * 
             * <strong>example:</strong>
             * <p>i149549021660892626529</p>
             */
            public Builder componentId(String componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>Component Type</p>
             * 
             * <strong>example:</strong>
             * <p>ACKEdge</p>
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
             * <p>VPC Segment ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpd-iqd7xunc</p>
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
