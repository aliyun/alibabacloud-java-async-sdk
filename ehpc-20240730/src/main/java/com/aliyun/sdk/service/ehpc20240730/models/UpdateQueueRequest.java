// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
 * {@link UpdateQueueRequest} extends {@link RequestModel}
 *
 * <p>UpdateQueueRequest</p>
 */
public class UpdateQueueRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Queue")
    private Queue queue;

    private UpdateQueueRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.queue = builder.queue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateQueueRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return queue
     */
    public Queue getQueue() {
        return this.queue;
    }

    public static final class Builder extends Request.Builder<UpdateQueueRequest, Builder> {
        private String clusterId; 
        private Queue queue; 

        private Builder() {
            super();
        } 

        private Builder(UpdateQueueRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.queue = request.queue;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The information about the queue to be updated.</p>
         */
        public Builder queue(Queue queue) {
            String queueShrink = shrink(queue, "Queue", "json");
            this.putQueryParameter("Queue", queueShrink);
            this.queue = queue;
            return this;
        }

        @Override
        public UpdateQueueRequest build() {
            return new UpdateQueueRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateQueueRequest} extends {@link TeaModel}
     *
     * <p>UpdateQueueRequest</p>
     */
    public static class Queue extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllocationStrategy")
        private String allocationStrategy;

        @com.aliyun.core.annotation.NameInMap("ComputeNodes")
        private java.util.List<NodeTemplate> computeNodes;

        @com.aliyun.core.annotation.NameInMap("EnableScaleIn")
        private Boolean enableScaleIn;

        @com.aliyun.core.annotation.NameInMap("EnableScaleOut")
        private Boolean enableScaleOut;

        @com.aliyun.core.annotation.NameInMap("HostnamePrefix")
        private String hostnamePrefix;

        @com.aliyun.core.annotation.NameInMap("HostnameSuffix")
        private String hostnameSuffix;

        @com.aliyun.core.annotation.NameInMap("InitialCount")
        private Integer initialCount;

        @com.aliyun.core.annotation.NameInMap("InterConnect")
        private String interConnect;

        @com.aliyun.core.annotation.NameInMap("KeepAliveNodes")
        private java.util.List<String> keepAliveNodes;

        @com.aliyun.core.annotation.NameInMap("MaxCount")
        private Integer maxCount;

        @com.aliyun.core.annotation.NameInMap("MaxCountPerCycle")
        private Long maxCountPerCycle;

        @com.aliyun.core.annotation.NameInMap("MinCount")
        private Integer minCount;

        @com.aliyun.core.annotation.NameInMap("QueueName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String queueName;

        @com.aliyun.core.annotation.NameInMap("RamRole")
        private String ramRole;

        @com.aliyun.core.annotation.NameInMap("ReservedNodePoolId")
        private String reservedNodePoolId;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        private Queue(Builder builder) {
            this.allocationStrategy = builder.allocationStrategy;
            this.computeNodes = builder.computeNodes;
            this.enableScaleIn = builder.enableScaleIn;
            this.enableScaleOut = builder.enableScaleOut;
            this.hostnamePrefix = builder.hostnamePrefix;
            this.hostnameSuffix = builder.hostnameSuffix;
            this.initialCount = builder.initialCount;
            this.interConnect = builder.interConnect;
            this.keepAliveNodes = builder.keepAliveNodes;
            this.maxCount = builder.maxCount;
            this.maxCountPerCycle = builder.maxCountPerCycle;
            this.minCount = builder.minCount;
            this.queueName = builder.queueName;
            this.ramRole = builder.ramRole;
            this.reservedNodePoolId = builder.reservedNodePoolId;
            this.vSwitchIds = builder.vSwitchIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Queue create() {
            return builder().build();
        }

        /**
         * @return allocationStrategy
         */
        public String getAllocationStrategy() {
            return this.allocationStrategy;
        }

        /**
         * @return computeNodes
         */
        public java.util.List<NodeTemplate> getComputeNodes() {
            return this.computeNodes;
        }

        /**
         * @return enableScaleIn
         */
        public Boolean getEnableScaleIn() {
            return this.enableScaleIn;
        }

        /**
         * @return enableScaleOut
         */
        public Boolean getEnableScaleOut() {
            return this.enableScaleOut;
        }

        /**
         * @return hostnamePrefix
         */
        public String getHostnamePrefix() {
            return this.hostnamePrefix;
        }

        /**
         * @return hostnameSuffix
         */
        public String getHostnameSuffix() {
            return this.hostnameSuffix;
        }

        /**
         * @return initialCount
         */
        public Integer getInitialCount() {
            return this.initialCount;
        }

        /**
         * @return interConnect
         */
        public String getInterConnect() {
            return this.interConnect;
        }

        /**
         * @return keepAliveNodes
         */
        public java.util.List<String> getKeepAliveNodes() {
            return this.keepAliveNodes;
        }

        /**
         * @return maxCount
         */
        public Integer getMaxCount() {
            return this.maxCount;
        }

        /**
         * @return maxCountPerCycle
         */
        public Long getMaxCountPerCycle() {
            return this.maxCountPerCycle;
        }

        /**
         * @return minCount
         */
        public Integer getMinCount() {
            return this.minCount;
        }

        /**
         * @return queueName
         */
        public String getQueueName() {
            return this.queueName;
        }

        /**
         * @return ramRole
         */
        public String getRamRole() {
            return this.ramRole;
        }

        /**
         * @return reservedNodePoolId
         */
        public String getReservedNodePoolId() {
            return this.reservedNodePoolId;
        }

        /**
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        public static final class Builder {
            private String allocationStrategy; 
            private java.util.List<NodeTemplate> computeNodes; 
            private Boolean enableScaleIn; 
            private Boolean enableScaleOut; 
            private String hostnamePrefix; 
            private String hostnameSuffix; 
            private Integer initialCount; 
            private String interConnect; 
            private java.util.List<String> keepAliveNodes; 
            private Integer maxCount; 
            private Long maxCountPerCycle; 
            private Integer minCount; 
            private String queueName; 
            private String ramRole; 
            private String reservedNodePoolId; 
            private java.util.List<String> vSwitchIds; 

            private Builder() {
            } 

            private Builder(Queue model) {
                this.allocationStrategy = model.allocationStrategy;
                this.computeNodes = model.computeNodes;
                this.enableScaleIn = model.enableScaleIn;
                this.enableScaleOut = model.enableScaleOut;
                this.hostnamePrefix = model.hostnamePrefix;
                this.hostnameSuffix = model.hostnameSuffix;
                this.initialCount = model.initialCount;
                this.interConnect = model.interConnect;
                this.keepAliveNodes = model.keepAliveNodes;
                this.maxCount = model.maxCount;
                this.maxCountPerCycle = model.maxCountPerCycle;
                this.minCount = model.minCount;
                this.queueName = model.queueName;
                this.ramRole = model.ramRole;
                this.reservedNodePoolId = model.reservedNodePoolId;
                this.vSwitchIds = model.vSwitchIds;
            } 

            /**
             * <p>The policy based on which instance types are selected for compute nodes during auto scale-outs. Valid values:</p>
             * <ul>
             * <li>PriorityInstanceType</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PriorityInstanceType</p>
             */
            public Builder allocationStrategy(String allocationStrategy) {
                this.allocationStrategy = allocationStrategy;
                return this;
            }

            /**
             * <p>The hardware configurations of the compute nodes in the queue. Valid values of N: 1 to 10.</p>
             */
            public Builder computeNodes(java.util.List<NodeTemplate> computeNodes) {
                this.computeNodes = computeNodes;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto scale-in for the queue. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableScaleIn(Boolean enableScaleIn) {
                this.enableScaleIn = enableScaleIn;
                return this;
            }

            /**
             * <p>Specifies whether to enable auto scale-out for the queue. Valid values:</p>
             * <ul>
             * <li>true: deletion protection is enabled.</li>
             * <li>false: disables ASM.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableScaleOut(Boolean enableScaleOut) {
                this.enableScaleOut = enableScaleOut;
                return this;
            }

            /**
             * <p>The hostname prefix of the added compute nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>compute</p>
             */
            public Builder hostnamePrefix(String hostnamePrefix) {
                this.hostnamePrefix = hostnamePrefix;
                return this;
            }

            /**
             * <p>The hostname suffix of the compute nodes in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>hpc</p>
             */
            public Builder hostnameSuffix(String hostnameSuffix) {
                this.hostnameSuffix = hostnameSuffix;
                return this;
            }

            /**
             * <p>The initial number of compute nodes in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder initialCount(Integer initialCount) {
                this.initialCount = initialCount;
                return this;
            }

            /**
             * <p>The type of the network for interconnecting compute nodes in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>erdma</p>
             */
            public Builder interConnect(String interConnect) {
                this.interConnect = interConnect;
                return this;
            }

            /**
             * <p>The nodes for which deletion protection is enabled in the queue.</p>
             */
            public Builder keepAliveNodes(java.util.List<String> keepAliveNodes) {
                this.keepAliveNodes = keepAliveNodes;
                return this;
            }

            /**
             * <p>The maximum number of compute nodes that the queue can contain.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder maxCount(Integer maxCount) {
                this.maxCount = maxCount;
                return this;
            }

            /**
             * <p>The minimum number of compute nodes that are added to the queue during an automatic scale-out.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder maxCountPerCycle(Long maxCountPerCycle) {
                this.maxCountPerCycle = maxCountPerCycle;
                return this;
            }

            /**
             * <p>The minimum number of compute nodes that the queue must contain.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder minCount(Integer minCount) {
                this.minCount = minCount;
                return this;
            }

            /**
             * <p>The queue name.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>comp</p>
             */
            public Builder queueName(String queueName) {
                this.queueName = queueName;
                return this;
            }

            /**
             * <p>The Resource Access Management (RAM) role that is assumed by compute nodes in the queue.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunECSInstanceForEHPCRole</p>
             */
            public Builder ramRole(String ramRole) {
                this.ramRole = ramRole;
                return this;
            }

            /**
             * ReservedNodePoolId.
             */
            public Builder reservedNodePoolId(String reservedNodePoolId) {
                this.reservedNodePoolId = reservedNodePoolId;
                return this;
            }

            /**
             * <p>The vSwitches available for use by compute nodes in the queue.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            public Queue build() {
                return new Queue(this);
            } 

        } 

    }
}
