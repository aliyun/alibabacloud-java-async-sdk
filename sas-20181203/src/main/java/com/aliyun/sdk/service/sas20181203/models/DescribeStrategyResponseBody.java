// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeStrategyResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeStrategyResponseBody</p>
 */
public class DescribeStrategyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Strategies")
    private java.util.List<Strategies> strategies;

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
    public java.util.List<Strategies> getStrategies() {
        return this.strategies;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Strategies> strategies; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>75C127E6-76CD-59A7-B6E4-1CBBDC98F2EB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The details of the baseline check policies.</p>
         */
        public Builder strategies(java.util.List<Strategies> strategies) {
            this.strategies = strategies;
            return this;
        }

        public DescribeStrategyResponseBody build() {
            return new DescribeStrategyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyResponseBody</p>
     */
    public static class ConfigTargets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Flag")
        private String flag;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("TargetType")
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
             * <p>Indicates whether the baseline check policy is applied to the asset group. Valid values:</p>
             * <ul>
             * <li><strong>add</strong>: The baseline check policy is applied to the asset group.</li>
             * <li><strong>del</strong>: the baseline check policy is not applied to the asset group.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>add</p>
             */
            public Builder flag(String flag) {
                this.flag = flag;
                return this;
            }

            /**
             * <p>The asset group ID or UUID of the asset to which the baseline check policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>10099713</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The condition by which the baseline check policy is applied to the asset. Valid values:</p>
             * <ul>
             * <li><strong>groupId</strong>: the ID of the asset group</li>
             * <li><strong>uuid</strong>: the UUID of the asset</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>groupId</p>
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
    /**
     * 
     * {@link DescribeStrategyResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeStrategyResponseBody</p>
     */
    public static class Strategies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigTargets")
        private java.util.List<ConfigTargets> configTargets;

        @com.aliyun.core.annotation.NameInMap("CustomType")
        private String customType;

        @com.aliyun.core.annotation.NameInMap("CycleDays")
        private Integer cycleDays;

        @com.aliyun.core.annotation.NameInMap("CycleStartTime")
        private Integer cycleStartTime;

        @com.aliyun.core.annotation.NameInMap("EcsCount")
        private Integer ecsCount;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("ExecStatus")
        private Integer execStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PassRate")
        private Integer passRate;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private String percent;

        @com.aliyun.core.annotation.NameInMap("ProcessRate")
        private Integer processRate;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Integer riskCount;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private Integer type;

        @com.aliyun.core.annotation.NameInMap("UserModifyTime")
        private Long userModifyTime;

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
            this.percent = builder.percent;
            this.processRate = builder.processRate;
            this.riskCount = builder.riskCount;
            this.startTime = builder.startTime;
            this.type = builder.type;
            this.userModifyTime = builder.userModifyTime;
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
        public java.util.List<ConfigTargets> getConfigTargets() {
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
         * @return percent
         */
        public String getPercent() {
            return this.percent;
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

        /**
         * @return userModifyTime
         */
        public Long getUserModifyTime() {
            return this.userModifyTime;
        }

        public static final class Builder {
            private java.util.List<ConfigTargets> configTargets; 
            private String customType; 
            private Integer cycleDays; 
            private Integer cycleStartTime; 
            private Integer ecsCount; 
            private String endTime; 
            private Integer execStatus; 
            private Integer id; 
            private String name; 
            private Integer passRate; 
            private String percent; 
            private Integer processRate; 
            private Integer riskCount; 
            private String startTime; 
            private Integer type; 
            private Long userModifyTime; 

            /**
             * <p>The details of the assets to which the baseline check policy is applied.</p>
             */
            public Builder configTargets(java.util.List<ConfigTargets> configTargets) {
                this.configTargets = configTargets;
                return this;
            }

            /**
             * <p>The type of the baseline check policy. Valid values:</p>
             * <ul>
             * <li><strong>common</strong></li>
             * <li><strong>custom</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>custom</p>
             */
            public Builder customType(String customType) {
                this.customType = customType;
                return this;
            }

            /**
             * <p>The cycle of the baseline check. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: every 2 days</li>
             * <li><strong>3</strong>: every 4 days</li>
             * <li><strong>7</strong>: every 8 days</li>
             * <li>30: every 31 days</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cycleDays(Integer cycleDays) {
                this.cycleDays = cycleDays;
                return this;
            }

            /**
             * <p>The time when the baseline check starts. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: The baseline check starts within the time range from 00:00 to 06:00.</li>
             * <li><strong>6</strong>: The baseline check starts within the time range from 06:00 to 12:00.</li>
             * <li><strong>12</strong>: The baseline check starts within the time range from 12:00 to 18:00.</li>
             * <li><strong>18</strong>: The baseline check starts within the time range from 18:00 to 24:00.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder cycleStartTime(Integer cycleStartTime) {
                this.cycleStartTime = cycleStartTime;
                return this;
            }

            /**
             * <p>The number of the assets to which the baseline check policy is applied.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder ecsCount(Integer ecsCount) {
                this.ecsCount = ecsCount;
                return this;
            }

            /**
             * <p>The end time of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>03:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The status of the baseline check policy. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: not executed</li>
             * <li><strong>2</strong>: executing</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder execStatus(Integer execStatus) {
                this.execStatus = execStatus;
                return this;
            }

            /**
             * <p>The ID of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>8164248</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>text2</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The proportion of risky baselines in the baseline check result.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder passRate(Integer passRate) {
                this.passRate = passRate;
                return this;
            }

            /**
             * <p>The progress of the baseline check by using the baseline. This parameter is returned only if the value of the ExecStatus parameter is 2.</p>
             * 
             * <strong>example:</strong>
             * <p>50%</p>
             */
            public Builder percent(String percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The number of the assets on which the baseline check is complete.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder processRate(Integer processRate) {
                this.processRate = processRate;
                return this;
            }

            /**
             * <p>The number of baseline check items in the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * <p>The start time of the baseline check policy.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The source type of the baseline check policy. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: indicates a built-in policy provided and performed by Security Center by default.</li>
             * <li><strong>2</strong>: indicates a user-defined policy. It can be a standard or custom baseline check policy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder type(Integer type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The time when the baseline check policy was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-07 10:46:43</p>
             */
            public Builder userModifyTime(Long userModifyTime) {
                this.userModifyTime = userModifyTime;
                return this;
            }

            public Strategies build() {
                return new Strategies(this);
            } 

        } 

    }
}
