// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScalingGroupConfig} extends {@link TeaModel}
 *
 * <p>ScalingGroupConfig</p>
 */
public class ScalingGroupConfig extends TeaModel {
    @NameInMap("DataDiskCategory")
    private String dataDiskCategory;

    @NameInMap("DataDiskCount")
    private Integer dataDiskCount;

    @NameInMap("DataDiskSize")
    private Long dataDiskSize;

    @NameInMap("DefaultCoolDownTime")
    private Long defaultCoolDownTime;

    @NameInMap("InstanceTypeList")
    private java.util.List < InstanceTypeList> instanceTypeList;

    @NameInMap("MultiAvailablePolicy")
    private MultiAvailablePolicy multiAvailablePolicy;

    @NameInMap("NodeOfflinePolicy")
    private NodeOfflinePolicy nodeOfflinePolicy;

    @NameInMap("PrivatePoolOptions")
    private PrivatePoolOptions privatePoolOptions;

    @NameInMap("ScalingMaxSize")
    private Integer scalingMaxSize;

    @NameInMap("ScalingMinSize")
    private Integer scalingMinSize;

    @NameInMap("SpotStrategy")
    private String spotStrategy;

    @NameInMap("SysDiskCategory")
    private String sysDiskCategory;

    @NameInMap("SysDiskSize")
    private Long sysDiskSize;

    @NameInMap("TriggerMode")
    private String triggerMode;

    private ScalingGroupConfig(Builder builder) {
        this.dataDiskCategory = builder.dataDiskCategory;
        this.dataDiskCount = builder.dataDiskCount;
        this.dataDiskSize = builder.dataDiskSize;
        this.defaultCoolDownTime = builder.defaultCoolDownTime;
        this.instanceTypeList = builder.instanceTypeList;
        this.multiAvailablePolicy = builder.multiAvailablePolicy;
        this.nodeOfflinePolicy = builder.nodeOfflinePolicy;
        this.privatePoolOptions = builder.privatePoolOptions;
        this.scalingMaxSize = builder.scalingMaxSize;
        this.scalingMinSize = builder.scalingMinSize;
        this.spotStrategy = builder.spotStrategy;
        this.sysDiskCategory = builder.sysDiskCategory;
        this.sysDiskSize = builder.sysDiskSize;
        this.triggerMode = builder.triggerMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingGroupConfig create() {
        return builder().build();
    }

    /**
     * @return dataDiskCategory
     */
    public String getDataDiskCategory() {
        return this.dataDiskCategory;
    }

    /**
     * @return dataDiskCount
     */
    public Integer getDataDiskCount() {
        return this.dataDiskCount;
    }

    /**
     * @return dataDiskSize
     */
    public Long getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return defaultCoolDownTime
     */
    public Long getDefaultCoolDownTime() {
        return this.defaultCoolDownTime;
    }

    /**
     * @return instanceTypeList
     */
    public java.util.List < InstanceTypeList> getInstanceTypeList() {
        return this.instanceTypeList;
    }

    /**
     * @return multiAvailablePolicy
     */
    public MultiAvailablePolicy getMultiAvailablePolicy() {
        return this.multiAvailablePolicy;
    }

    /**
     * @return nodeOfflinePolicy
     */
    public NodeOfflinePolicy getNodeOfflinePolicy() {
        return this.nodeOfflinePolicy;
    }

    /**
     * @return privatePoolOptions
     */
    public PrivatePoolOptions getPrivatePoolOptions() {
        return this.privatePoolOptions;
    }

    /**
     * @return scalingMaxSize
     */
    public Integer getScalingMaxSize() {
        return this.scalingMaxSize;
    }

    /**
     * @return scalingMinSize
     */
    public Integer getScalingMinSize() {
        return this.scalingMinSize;
    }

    /**
     * @return spotStrategy
     */
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    /**
     * @return sysDiskCategory
     */
    public String getSysDiskCategory() {
        return this.sysDiskCategory;
    }

    /**
     * @return sysDiskSize
     */
    public Long getSysDiskSize() {
        return this.sysDiskSize;
    }

    /**
     * @return triggerMode
     */
    public String getTriggerMode() {
        return this.triggerMode;
    }

    public static final class Builder {
        private String dataDiskCategory; 
        private Integer dataDiskCount; 
        private Long dataDiskSize; 
        private Long defaultCoolDownTime; 
        private java.util.List < InstanceTypeList> instanceTypeList; 
        private MultiAvailablePolicy multiAvailablePolicy; 
        private NodeOfflinePolicy nodeOfflinePolicy; 
        private PrivatePoolOptions privatePoolOptions; 
        private Integer scalingMaxSize; 
        private Integer scalingMinSize; 
        private String spotStrategy; 
        private String sysDiskCategory; 
        private Long sysDiskSize; 
        private String triggerMode; 

        /**
         * 数据盘类型。
         */
        public Builder dataDiskCategory(String dataDiskCategory) {
            this.dataDiskCategory = dataDiskCategory;
            return this;
        }

        /**
         * 数据盘个数。
         */
        public Builder dataDiskCount(Integer dataDiskCount) {
            this.dataDiskCount = dataDiskCount;
            return this;
        }

        /**
         * 数据盘大小,单位GB。
         */
        public Builder dataDiskSize(Long dataDiskSize) {
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * 默认冷却时间。
         */
        public Builder defaultCoolDownTime(Long defaultCoolDownTime) {
            this.defaultCoolDownTime = defaultCoolDownTime;
            return this;
        }

        /**
         * 抢占实例列表。
         */
        public Builder instanceTypeList(java.util.List < InstanceTypeList> instanceTypeList) {
            this.instanceTypeList = instanceTypeList;
            return this;
        }

        /**
         * 资源可用性策略(成本优化参数)。
         */
        public Builder multiAvailablePolicy(MultiAvailablePolicy multiAvailablePolicy) {
            this.multiAvailablePolicy = multiAvailablePolicy;
            return this;
        }

        /**
         * 节点下线策略。
         */
        public Builder nodeOfflinePolicy(NodeOfflinePolicy nodeOfflinePolicy) {
            this.nodeOfflinePolicy = nodeOfflinePolicy;
            return this;
        }

        /**
         * 私有池选项	。
         */
        public Builder privatePoolOptions(PrivatePoolOptions privatePoolOptions) {
            this.privatePoolOptions = privatePoolOptions;
            return this;
        }

        /**
         * 伸缩组节点最大个数。
         */
        public Builder scalingMaxSize(Integer scalingMaxSize) {
            this.scalingMaxSize = scalingMaxSize;
            return this;
        }

        /**
         * 伸缩组节点最小个数。
         */
        public Builder scalingMinSize(Integer scalingMinSize) {
            this.scalingMinSize = scalingMinSize;
            return this;
        }

        /**
         * 抢占式Spot实例策略。
         */
        public Builder spotStrategy(String spotStrategy) {
            this.spotStrategy = spotStrategy;
            return this;
        }

        /**
         * 系统盘类型。
         */
        public Builder sysDiskCategory(String sysDiskCategory) {
            this.sysDiskCategory = sysDiskCategory;
            return this;
        }

        /**
         * 系统盘大小,单位GB。
         */
        public Builder sysDiskSize(Long sysDiskSize) {
            this.sysDiskSize = sysDiskSize;
            return this;
        }

        /**
         * 伸缩活动触发模式。
         */
        public Builder triggerMode(String triggerMode) {
            this.triggerMode = triggerMode;
            return this;
        }

        public ScalingGroupConfig build() {
            return new ScalingGroupConfig(this);
        } 

    } 

    public static class InstanceTypeList extends TeaModel {
        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("SpotPriceLimit")
        private Float spotPriceLimit;

        private InstanceTypeList(Builder builder) {
            this.instanceType = builder.instanceType;
            this.spotPriceLimit = builder.spotPriceLimit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceTypeList create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return spotPriceLimit
         */
        public Float getSpotPriceLimit() {
            return this.spotPriceLimit;
        }

        public static final class Builder {
            private String instanceType; 
            private Float spotPriceLimit; 

            /**
             * Ecs类型。
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * 抢占价格上限,可空。
             */
            public Builder spotPriceLimit(Float spotPriceLimit) {
                this.spotPriceLimit = spotPriceLimit;
                return this;
            }

            public InstanceTypeList build() {
                return new InstanceTypeList(this);
            } 

        } 

    }
    public static class PolicyParam extends TeaModel {
        @NameInMap("OnDemandBaseCapacity")
        private Integer onDemandBaseCapacity;

        @NameInMap("OnDemandPercentageAboveBaseCapacity")
        private Integer onDemandPercentageAboveBaseCapacity;

        @NameInMap("SpotInstancePools")
        private Integer spotInstancePools;

        @NameInMap("SpotInstanceRemedy")
        private Boolean spotInstanceRemedy;

        private PolicyParam(Builder builder) {
            this.onDemandBaseCapacity = builder.onDemandBaseCapacity;
            this.onDemandPercentageAboveBaseCapacity = builder.onDemandPercentageAboveBaseCapacity;
            this.spotInstancePools = builder.spotInstancePools;
            this.spotInstanceRemedy = builder.spotInstanceRemedy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyParam create() {
            return builder().build();
        }

        /**
         * @return onDemandBaseCapacity
         */
        public Integer getOnDemandBaseCapacity() {
            return this.onDemandBaseCapacity;
        }

        /**
         * @return onDemandPercentageAboveBaseCapacity
         */
        public Integer getOnDemandPercentageAboveBaseCapacity() {
            return this.onDemandPercentageAboveBaseCapacity;
        }

        /**
         * @return spotInstancePools
         */
        public Integer getSpotInstancePools() {
            return this.spotInstancePools;
        }

        /**
         * @return spotInstanceRemedy
         */
        public Boolean getSpotInstanceRemedy() {
            return this.spotInstanceRemedy;
        }

        public static final class Builder {
            private Integer onDemandBaseCapacity; 
            private Integer onDemandPercentageAboveBaseCapacity; 
            private Integer spotInstancePools; 
            private Boolean spotInstanceRemedy; 

            /**
             * 按需实例最小个数。
             */
            public Builder onDemandBaseCapacity(Integer onDemandBaseCapacity) {
                this.onDemandBaseCapacity = onDemandBaseCapacity;
                return this;
            }

            /**
             * 按需实例百分比。
             */
            public Builder onDemandPercentageAboveBaseCapacity(Integer onDemandPercentageAboveBaseCapacity) {
                this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
                return this;
            }

            /**
             * 抢占实例类型池规模。
             */
            public Builder spotInstancePools(Integer spotInstancePools) {
                this.spotInstancePools = spotInstancePools;
                return this;
            }

            /**
             * 是否使用按量补偿。
             */
            public Builder spotInstanceRemedy(Boolean spotInstanceRemedy) {
                this.spotInstanceRemedy = spotInstanceRemedy;
                return this;
            }

            public PolicyParam build() {
                return new PolicyParam(this);
            } 

        } 

    }
    public static class MultiAvailablePolicy extends TeaModel {
        @NameInMap("PolicyParam")
        private PolicyParam policyParam;

        @NameInMap("PolicyType")
        private String policyType;

        private MultiAvailablePolicy(Builder builder) {
            this.policyParam = builder.policyParam;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MultiAvailablePolicy create() {
            return builder().build();
        }

        /**
         * @return policyParam
         */
        public PolicyParam getPolicyParam() {
            return this.policyParam;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private PolicyParam policyParam; 
            private String policyType; 

            /**
             * 资源可用性策略(成本优化参数)。
             */
            public Builder policyParam(PolicyParam policyParam) {
                this.policyParam = policyParam;
                return this;
            }

            /**
             * 策略类型。
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public MultiAvailablePolicy build() {
                return new MultiAvailablePolicy(this);
            } 

        } 

    }
    public static class NodeOfflinePolicy extends TeaModel {
        @NameInMap("Mode")
        private String mode;

        @NameInMap("TimeoutMs")
        private Long timeoutMs;

        private NodeOfflinePolicy(Builder builder) {
            this.mode = builder.mode;
            this.timeoutMs = builder.timeoutMs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeOfflinePolicy create() {
            return builder().build();
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return timeoutMs
         */
        public Long getTimeoutMs() {
            return this.timeoutMs;
        }

        public static final class Builder {
            private String mode; 
            private Long timeoutMs; 

            /**
             * 下线模式,是否为优雅下线。
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * 下线超时时间,单位毫秒。
             */
            public Builder timeoutMs(Long timeoutMs) {
                this.timeoutMs = timeoutMs;
                return this;
            }

            public NodeOfflinePolicy build() {
                return new NodeOfflinePolicy(this);
            } 

        } 

    }
    public static class PrivatePoolOptions extends TeaModel {
        @NameInMap("Id")
        private String id;

        @NameInMap("MatchCriteria")
        private String matchCriteria;

        private PrivatePoolOptions(Builder builder) {
            this.id = builder.id;
            this.matchCriteria = builder.matchCriteria;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivatePoolOptions create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return matchCriteria
         */
        public String getMatchCriteria() {
            return this.matchCriteria;
        }

        public static final class Builder {
            private String id; 
            private String matchCriteria; 

            /**
             * 私有池id。
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 实例启动的私有池容量选项。。
             */
            public Builder matchCriteria(String matchCriteria) {
                this.matchCriteria = matchCriteria;
                return this;
            }

            public PrivatePoolOptions build() {
                return new PrivatePoolOptions(this);
            } 

        } 

    }
}
