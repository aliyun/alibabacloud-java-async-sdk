// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoScalingPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoScalingPolicyResponseBody</p>
 */
public class GetAutoScalingPolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingPolicy")
    private ScalingPolicy scalingPolicy;

    private GetAutoScalingPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingPolicy = builder.scalingPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAutoScalingPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingPolicy
     */
    public ScalingPolicy getScalingPolicy() {
        return this.scalingPolicy;
    }

    public static final class Builder {
        private String requestId; 
        private ScalingPolicy scalingPolicy; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the auto scaling policy.
         */
        public Builder scalingPolicy(ScalingPolicy scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        public GetAutoScalingPolicyResponseBody build() {
            return new GetAutoScalingPolicyResponseBody(this);
        } 

    } 

    public static class Constraints extends TeaModel {
        @NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @NameInMap("MinCapacity")
        private Integer minCapacity;

        private Constraints(Builder builder) {
            this.maxCapacity = builder.maxCapacity;
            this.minCapacity = builder.minCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Constraints create() {
            return builder().build();
        }

        /**
         * @return maxCapacity
         */
        public Integer getMaxCapacity() {
            return this.maxCapacity;
        }

        /**
         * @return minCapacity
         */
        public Integer getMinCapacity() {
            return this.minCapacity;
        }

        public static final class Builder {
            private Integer maxCapacity; 
            private Integer minCapacity; 

            /**
             * The maximum number of nodes in the node group. Default value: 2000.
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * The minimum number of nodes in the node group. Default value: 0.
             */
            public Builder minCapacity(Integer minCapacity) {
                this.minCapacity = minCapacity;
                return this;
            }

            public Constraints build() {
                return new Constraints(this);
            } 

        } 

    }
    public static class ScalingRules extends TeaModel {
        @NameInMap("ActivityType")
        private String activityType;

        @NameInMap("AdjustmentType")
        private String adjustmentType;

        @NameInMap("AdjustmentValue")
        private Integer adjustmentValue;

        @NameInMap("MetricsTrigger")
        private MetricsTrigger metricsTrigger;

        @NameInMap("MinAdjustmentValue")
        private Integer minAdjustmentValue;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("TimeTrigger")
        private TimeTrigger timeTrigger;

        @NameInMap("TriggerType")
        private String triggerType;

        private ScalingRules(Builder builder) {
            this.activityType = builder.activityType;
            this.adjustmentType = builder.adjustmentType;
            this.adjustmentValue = builder.adjustmentValue;
            this.metricsTrigger = builder.metricsTrigger;
            this.minAdjustmentValue = builder.minAdjustmentValue;
            this.ruleName = builder.ruleName;
            this.timeTrigger = builder.timeTrigger;
            this.triggerType = builder.triggerType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingRules create() {
            return builder().build();
        }

        /**
         * @return activityType
         */
        public String getActivityType() {
            return this.activityType;
        }

        /**
         * @return adjustmentType
         */
        public String getAdjustmentType() {
            return this.adjustmentType;
        }

        /**
         * @return adjustmentValue
         */
        public Integer getAdjustmentValue() {
            return this.adjustmentValue;
        }

        /**
         * @return metricsTrigger
         */
        public MetricsTrigger getMetricsTrigger() {
            return this.metricsTrigger;
        }

        /**
         * @return minAdjustmentValue
         */
        public Integer getMinAdjustmentValue() {
            return this.minAdjustmentValue;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return timeTrigger
         */
        public TimeTrigger getTimeTrigger() {
            return this.timeTrigger;
        }

        /**
         * @return triggerType
         */
        public String getTriggerType() {
            return this.triggerType;
        }

        public static final class Builder {
            private String activityType; 
            private String adjustmentType; 
            private Integer adjustmentValue; 
            private MetricsTrigger metricsTrigger; 
            private Integer minAdjustmentValue; 
            private String ruleName; 
            private TimeTrigger timeTrigger; 
            private String triggerType; 

            /**
             * The type of the scaling activity. Valid values:
             * <p>
             * 
             * *   SCALE_OUT: scale-out rules
             * *   SCALE_IN: scale-in rules
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * The adjustment type.
             */
            public Builder adjustmentType(String adjustmentType) {
                this.adjustmentType = adjustmentType;
                return this;
            }

            /**
             * The adjustment value. The value must be a positive number, which indicates the number of instances to be scaled out or in.
             */
            public Builder adjustmentValue(Integer adjustmentValue) {
                this.adjustmentValue = adjustmentValue;
                return this;
            }

            /**
             * The description of scaling by load.
             */
            public Builder metricsTrigger(MetricsTrigger metricsTrigger) {
                this.metricsTrigger = metricsTrigger;
                return this;
            }

            /**
             * MinAdjustmentValue.
             */
            public Builder minAdjustmentValue(Integer minAdjustmentValue) {
                this.minAdjustmentValue = minAdjustmentValue;
                return this;
            }

            /**
             * The name of the auto scaling rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The description of scaling by time.
             */
            public Builder timeTrigger(TimeTrigger timeTrigger) {
                this.timeTrigger = timeTrigger;
                return this;
            }

            /**
             * The type of the scaling rule. Valid values:
             * <p>
             * 
             * *   TIME_TRIGGER: scaling by time.
             * *   METRICS_TRIGGER: scaling by load.
             */
            public Builder triggerType(String triggerType) {
                this.triggerType = triggerType;
                return this;
            }

            public ScalingRules build() {
                return new ScalingRules(this);
            } 

        } 

    }
    public static class ScalingPolicy extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("Constraints")
        private Constraints constraints;

        @NameInMap("NodeGroupId")
        private String nodeGroupId;

        @NameInMap("ScalingPolicyId")
        private String scalingPolicyId;

        @NameInMap("ScalingRules")
        private java.util.List < ScalingRules> scalingRules;

        private ScalingPolicy(Builder builder) {
            this.clusterId = builder.clusterId;
            this.constraints = builder.constraints;
            this.nodeGroupId = builder.nodeGroupId;
            this.scalingPolicyId = builder.scalingPolicyId;
            this.scalingRules = builder.scalingRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScalingPolicy create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return constraints
         */
        public Constraints getConstraints() {
            return this.constraints;
        }

        /**
         * @return nodeGroupId
         */
        public String getNodeGroupId() {
            return this.nodeGroupId;
        }

        /**
         * @return scalingPolicyId
         */
        public String getScalingPolicyId() {
            return this.scalingPolicyId;
        }

        /**
         * @return scalingRules
         */
        public java.util.List < ScalingRules> getScalingRules() {
            return this.scalingRules;
        }

        public static final class Builder {
            private String clusterId; 
            private Constraints constraints; 
            private String nodeGroupId; 
            private String scalingPolicyId; 
            private java.util.List < ScalingRules> scalingRules; 

            /**
             * The cluster ID.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The maximum and minimum numbers of node groups.
             */
            public Builder constraints(Constraints constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * The ID of the node group.
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * The ID of the scaling policy.
             */
            public Builder scalingPolicyId(String scalingPolicyId) {
                this.scalingPolicyId = scalingPolicyId;
                return this;
            }

            /**
             * The scaling rules.
             */
            public Builder scalingRules(java.util.List < ScalingRules> scalingRules) {
                this.scalingRules = scalingRules;
                return this;
            }

            public ScalingPolicy build() {
                return new ScalingPolicy(this);
            } 

        } 

    }
}
