// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The details of the baseline check policies.
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
             * Indicates whether the baseline check policy is applied to the asset group. Valid values:
             * <p>
             * 
             * *   **add**: The baseline check policy is applied to the asset group.
             * *   **del**: the baseline check policy is not applied to the asset group.
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * The asset group ID or UUID of the asset to which the baseline check policy is applied.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The condition by which the baseline check policy is applied to the asset. Valid values:
             * <p>
             * 
             * *   **groupId**: the ID of the asset group
             * *   **uuid**: the UUID of the asset
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

        @NameInMap("EndTime")
        private String endTime;

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

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Type")
        private Integer type;

        private Strategies(Builder builder) {
            this.configTargets = builder.configTargets;
            this.customType = builder.customType;
            this.cycleDays = builder.cycleDays;
            this.cycleStartTime = builder.cycleStartTime;
            this.ecsCount = builder.ecsCount;
            this.endTime = builder.endTime;
            this.execStatus = builder.execStatus;
            this.id = builder.id;
            this.name = builder.name;
            this.passRate = builder.passRate;
            this.processRate = builder.processRate;
            this.riskCount = builder.riskCount;
            this.startTime = builder.startTime;
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
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
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
            private String endTime; 
            private Integer execStatus; 
            private Integer id; 
            private String name; 
            private Integer passRate; 
            private Integer processRate; 
            private Integer riskCount; 
            private String startTime; 
            private Integer type; 

            /**
             * The details of the assets to which the baseline check policy is applied.
             */
            public Builder configTargets(java.util.List < ConfigTargets> configTargets) {
                this.configTargets = configTargets;
                return this;
            }

            /**
             * The type of the baseline check policy. Valid values:
             * <p>
             * 
             * *   **common**
             * *   **custom**
             */
            public Builder customType(String customType) {
                this.customType = customType;
                return this;
            }

            /**
             * The cycle of the baseline check. Valid values:
             * <p>
             * 
             * *   **1**: every 2 days
             * *   **3**: every 4 days
             * *   **7**: every 8 days
             * *   30: every 31 days
             */
            public Builder cycleDays(Integer cycleDays) {
                this.cycleDays = cycleDays;
                return this;
            }

            /**
             * The time when the baseline check starts. Valid values:
             * <p>
             * 
             * *   **0**: The baseline check starts within the time range from 00:00 to 06:00.
             * *   **6**: The baseline check starts within the time range from 06:00 to 12:00.
             * *   **12**: The baseline check starts within the time range from 12:00 to 18:00.
             * *   **18**: The baseline check starts within the time range from 18:00 to 24:00.
             */
            public Builder cycleStartTime(Integer cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * The number of the assets to which the baseline check policy is applied.
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * The end time of the baseline check policy.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The status of the baseline check policy. Valid values:
             * <p>
             * 
             * *   **1**: not executed
             * *   **2**: executing
             */
            public Builder execStatus(Integer execStatus) {
                this.execStatus = execStatus;
                return this;
            }

            /**
             * The ID of the baseline check policy.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the baseline check policy.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The proportion of risky baselines in the baseline check result.
             */
            public Builder passRate(Integer passRate) {
                this.passRate = passRate;
                return this;
            }

            /**
             * The number of the assets on which the baseline check is complete.
             */
            public Builder processRate(Integer processRate) {
                this.processRate = processRate;
                return this;
            }

            /**
             * The number of baseline check items in the baseline check policy.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * The start time of the baseline check policy.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The source type of the baseline check policy. Valid values:
             * <p>
             * 
             * *   **1**: indicates a built-in policy provided and performed by Security Center by default.
             * *   **2**: indicates a user-defined policy. It can be a standard or custom baseline check policy.
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
