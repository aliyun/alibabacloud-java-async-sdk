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
 * {@link QueueTemplate} extends {@link TeaModel}
 *
 * <p>QueueTemplate</p>
 */
public class QueueTemplate extends TeaModel {
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

    private QueueTemplate(Builder builder) {
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

    public static QueueTemplate create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder(QueueTemplate model) {
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
         * AllocationStrategy.
         */
        public Builder allocationStrategy(String allocationStrategy) {
            this.allocationStrategy = allocationStrategy;
            return this;
        }

        /**
         * ComputeNodes.
         */
        public Builder computeNodes(java.util.List<NodeTemplate> computeNodes) {
            this.computeNodes = computeNodes;
            return this;
        }

        /**
         * EnableScaleIn.
         */
        public Builder enableScaleIn(Boolean enableScaleIn) {
            this.enableScaleIn = enableScaleIn;
            return this;
        }

        /**
         * EnableScaleOut.
         */
        public Builder enableScaleOut(Boolean enableScaleOut) {
            this.enableScaleOut = enableScaleOut;
            return this;
        }

        /**
         * HostnamePrefix.
         */
        public Builder hostnamePrefix(String hostnamePrefix) {
            this.hostnamePrefix = hostnamePrefix;
            return this;
        }

        /**
         * HostnameSuffix.
         */
        public Builder hostnameSuffix(String hostnameSuffix) {
            this.hostnameSuffix = hostnameSuffix;
            return this;
        }

        /**
         * InitialCount.
         */
        public Builder initialCount(Integer initialCount) {
            this.initialCount = initialCount;
            return this;
        }

        /**
         * InterConnect.
         */
        public Builder interConnect(String interConnect) {
            this.interConnect = interConnect;
            return this;
        }

        /**
         * KeepAliveNodes.
         */
        public Builder keepAliveNodes(java.util.List<String> keepAliveNodes) {
            this.keepAliveNodes = keepAliveNodes;
            return this;
        }

        /**
         * MaxCount.
         */
        public Builder maxCount(Integer maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        /**
         * MaxCountPerCycle.
         */
        public Builder maxCountPerCycle(Long maxCountPerCycle) {
            this.maxCountPerCycle = maxCountPerCycle;
            return this;
        }

        /**
         * MinCount.
         */
        public Builder minCount(Integer minCount) {
            this.minCount = minCount;
            return this;
        }

        /**
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
         * RamRole.
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
         * VSwitchIds.
         */
        public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        public QueueTemplate build() {
            return new QueueTemplate(this);
        } 

    } 

}
