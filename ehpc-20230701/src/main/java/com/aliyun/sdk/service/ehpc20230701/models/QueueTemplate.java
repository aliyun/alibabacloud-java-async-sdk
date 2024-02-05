// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20230701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueueTemplate} extends {@link TeaModel}
 *
 * <p>QueueTemplate</p>
 */
public class QueueTemplate extends TeaModel {
    @NameInMap("AllocationStrategy")
    private String allocationStrategy;

    @NameInMap("ComputeNodes")
    private java.util.List < NodeTemplate > computeNodes;

    @NameInMap("EnableScaleIn")
    private Boolean enableScaleIn;

    @NameInMap("EnableScaleOut")
    private Boolean enableScaleOut;

    @NameInMap("HostnamePrefix")
    private String hostnamePrefix;

    @NameInMap("HostnameSuffix")
    private String hostnameSuffix;

    @NameInMap("InitialCount")
    private Integer initialCount;

    @NameInMap("InterConnect")
    private String interConnect;

    @NameInMap("KeepAliveNodes")
    private java.util.List < String > keepAliveNodes;

    @NameInMap("MaxCount")
    private Integer maxCount;

    @NameInMap("MaxCountPerCycle")
    private Long maxCountPerCycle;

    @NameInMap("MinCount")
    private Integer minCount;

    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @NameInMap("RamRole")
    private String ramRole;

    @NameInMap("VSwitchIds")
    private java.util.List < String > vSwitchIds;

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
        this.name = builder.name;
        this.ramRole = builder.ramRole;
        this.vSwitchIds = builder.vSwitchIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueueTemplate create() {
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
    public java.util.List < NodeTemplate > getComputeNodes() {
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
    public java.util.List < String > getKeepAliveNodes() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ramRole
     */
    public String getRamRole() {
        return this.ramRole;
    }

    /**
     * @return vSwitchIds
     */
    public java.util.List < String > getVSwitchIds() {
        return this.vSwitchIds;
    }

    public static final class Builder {
        private String allocationStrategy; 
        private java.util.List < NodeTemplate > computeNodes; 
        private Boolean enableScaleIn; 
        private Boolean enableScaleOut; 
        private String hostnamePrefix; 
        private String hostnameSuffix; 
        private Integer initialCount; 
        private String interConnect; 
        private java.util.List < String > keepAliveNodes; 
        private Integer maxCount; 
        private Long maxCountPerCycle; 
        private Integer minCount; 
        private String name; 
        private String ramRole; 
        private java.util.List < String > vSwitchIds; 

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
        public Builder computeNodes(java.util.List < NodeTemplate > computeNodes) {
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
        public Builder keepAliveNodes(java.util.List < String > keepAliveNodes) {
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
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * VSwitchIds.
         */
        public Builder vSwitchIds(java.util.List < String > vSwitchIds) {
            this.vSwitchIds = vSwitchIds;
            return this;
        }

        public QueueTemplate build() {
            return new QueueTemplate(this);
        } 

    } 

}
