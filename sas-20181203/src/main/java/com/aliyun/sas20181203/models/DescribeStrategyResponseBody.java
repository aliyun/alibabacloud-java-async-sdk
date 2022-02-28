// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyResponseBody</p>
 */
public class DescribeStrategyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Strategies")
    private java.util.List < Strategies> strategies;

    private DescribeStrategyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.strategies = builder.strategies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStrategyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return strategies
     */
    public java.util.List < Strategies> getStrategies() {
        return this.strategies;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Strategies> strategies; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Strategies.
         */
        public Builder strategies(java.util.List < Strategies> strategies) {
            this.strategies = strategies;
            return this;
        }

        public DescribeStrategyResponseBody build() {
            return new DescribeStrategyResponseBody(this);
        } 

    } 

    public static class ConfigTargets extends TeaModel {
        @NameInMap("Flag")
        private String flag;

        @NameInMap("Target")
        private String target;

        @NameInMap("TargetType")
        private String targetType;

        private ConfigTargets(Builder builder) {
            this.flag = builder.flag;
            this.target = builder.target;
            this.targetType = builder.targetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigTargets create() {
            return builder().build();
        }

        /**
         * @return flag
         */
        public String getFlag() {
            return this.flag;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        public static final class Builder {
            private String flag; 
            private String target; 
            private String targetType; 

            /**
             * Flag.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            public ConfigTargets build() {
                return new ConfigTargets(this);
            } 

        } 

    }
    public static class Strategies extends TeaModel {
        @NameInMap("ConfigTargets")
        private java.util.List < ConfigTargets> configTargets;

        @NameInMap("CustomType")
        private String customType;

        @NameInMap("CycleDays")
        private Integer cycleDays;

        @NameInMap("CycleStartTime")
        private Integer cycleStartTime;

        @NameInMap("EcsCount")
        private Integer ecsCount;

        @NameInMap("ExecStatus")
        private Integer execStatus;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Name")
        private String name;

        @NameInMap("PassRate")
        private Integer passRate;

        @NameInMap("ProcessRate")
        private Integer processRate;

        @NameInMap("RiskCount")
        private Integer riskCount;

        @NameInMap("Type")
        private Integer type;

        private Strategies(Builder builder) {
            this.configTargets = builder.configTargets;
            this.customType = builder.customType;
            this.cycleDays = builder.cycleDays;
            this.cycleStartTime = builder.cycleStartTime;
            this.ecsCount = builder.ecsCount;
            this.execStatus = builder.execStatus;
            this.id = builder.id;
            this.name = builder.name;
            this.passRate = builder.passRate;
            this.processRate = builder.processRate;
            this.riskCount = builder.riskCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategies create() {
            return builder().build();
        }

        /**
         * @return configTargets
         */
        public java.util.List < ConfigTargets> getConfigTargets() {
            return this.configTargets;
        }

        /**
         * @return customType
         */
        public String getCustomType() {
            return this.customType;
        }

        /**
         * @return cycleDays
         */
        public Integer getCycleDays() {
            return this.cycleDays;
        }

        /**
         * @return cycleStartTime
         */
        public Integer getCycleStartTime() {
            return this.cycleStartTime;
        }

        /**
         * @return ecsCount
         */
        public Integer getEcsCount() {
            return this.ecsCount;
        }

        /**
         * @return execStatus
         */
        public Integer getExecStatus() {
            return this.execStatus;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return passRate
         */
        public Integer getPassRate() {
            return this.passRate;
        }

        /**
         * @return processRate
         */
        public Integer getProcessRate() {
            return this.processRate;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return type
         */
        public Integer getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < ConfigTargets> configTargets; 
            private String customType; 
            private Integer cycleDays; 
            private Integer cycleStartTime; 
            private Integer ecsCount; 
            private Integer execStatus; 
            private Integer id; 
            private String name; 
            private Integer passRate; 
            private Integer processRate; 
            private Integer riskCount; 
            private Integer type; 

            /**
             * ConfigTargets.
             */
            public Builder configTargets(java.util.List < ConfigTargets> configTargets) {
                this.configTargets = configTargets;
                return this;
            }

            /**
             * CustomType.
             */
            public Builder customType(String customType) {
                this.customType = customType;
                return this;
            }

            /**
             * CycleDays.
             */
            public Builder cycleDays(Integer cycleDays) {
                this.cycleDays = cycleDays;
                return this;
            }

            /**
             * CycleStartTime.
             */
            public Builder cycleStartTime(Integer cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * EcsCount.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * ExecStatus.
             */
            public Builder execStatus(Integer execStatus) {
                this.execStatus = execStatus;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
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
             * PassRate.
             */
            public Builder passRate(Integer passRate) {
                this.passRate = passRate;
                return this;
            }

            /**
             * ProcessRate.
             */
            public Builder processRate(Integer processRate) {
                this.processRate = processRate;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
}
