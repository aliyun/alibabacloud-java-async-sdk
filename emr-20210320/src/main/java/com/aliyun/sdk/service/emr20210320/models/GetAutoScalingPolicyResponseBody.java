// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAutoScalingPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetAutoScalingPolicyResponseBody</p>
 */
public class GetAutoScalingPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingPolicy")
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the auto scaling policy.</p>
         */
        public Builder scalingPolicy(ScalingPolicy scalingPolicy) {
            this.scalingPolicy = scalingPolicy;
            return this;
        }

        public GetAutoScalingPolicyResponseBody build() {
            return new GetAutoScalingPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAutoScalingPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScalingPolicyResponseBody</p>
     */
    public static class Constraints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxCapacity")
        private Integer maxCapacity;

        @com.aliyun.core.annotation.NameInMap("MinCapacity")
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
             * <p>The maximum number of nodes in the node group. Default value: 2000.</p>
             * 
             * <strong>example:</strong>
             * <p>2000</p>
             */
            public Builder maxCapacity(Integer maxCapacity) {
                this.maxCapacity = maxCapacity;
                return this;
            }

            /**
             * <p>The minimum number of nodes in the node group. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link GetAutoScalingPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScalingPolicyResponseBody</p>
     */
    public static class ScalingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityType")
        private String activityType;

        @com.aliyun.core.annotation.NameInMap("AdjustmentType")
        private String adjustmentType;

        @com.aliyun.core.annotation.NameInMap("AdjustmentValue")
        private Integer adjustmentValue;

        @com.aliyun.core.annotation.NameInMap("MetricsTrigger")
        private MetricsTrigger metricsTrigger;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("TimeTrigger")
        private TimeTrigger timeTrigger;

        @com.aliyun.core.annotation.NameInMap("TriggerType")
        private String triggerType;

        private ScalingRules(Builder builder) {
            this.activityType = builder.activityType;
            this.adjustmentType = builder.adjustmentType;
            this.adjustmentValue = builder.adjustmentValue;
            this.metricsTrigger = builder.metricsTrigger;
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
            private String ruleName; 
            private TimeTrigger timeTrigger; 
            private String triggerType; 

            /**
             * <p>The scaling type. Valid values:</p>
             * <ul>
             * <li>SCALE_OUT</li>
             * <li>SCALE_IN</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SCALE_OUT</p>
             */
            public Builder activityType(String activityType) {
                this.activityType = activityType;
                return this;
            }

            /**
             * <p>The adjustment type.</p>
             * 
             * <strong>example:</strong>
             * <p>CHANGE_IN_CAPACITY</p>
             */
            public Builder adjustmentType(String adjustmentType) {
                this.adjustmentType = adjustmentType;
                return this;
            }

            /**
             * <p>The adjustment value. The parameter value must be a positive integer, which indicates the number of instances that you want to add or remove.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder adjustmentValue(Integer adjustmentValue) {
                this.adjustmentValue = adjustmentValue;
                return this;
            }

            /**
             * <p>The description of load-based scaling.</p>
             */
            public Builder metricsTrigger(MetricsTrigger metricsTrigger) {
                this.metricsTrigger = metricsTrigger;
                return this;
            }

            /**
             * <p>The name of the auto scaling rule.</p>
             * 
             * <strong>example:</strong>
             * <p>scaling-out-memory</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The description of time-based scaling.</p>
             */
            public Builder timeTrigger(TimeTrigger timeTrigger) {
                this.timeTrigger = timeTrigger;
                return this;
            }

            /**
             * <p>The type of the auto scaling rule. Valid values:</p>
             * <ul>
             * <li>TIME_TRIGGER: time-based scaling</li>
             * <li>METRICS_TRIGGER: load-based scaling</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TIME_TRIGGER</p>
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
    /**
     * 
     * {@link GetAutoScalingPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetAutoScalingPolicyResponseBody</p>
     */
    public static class ScalingPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("Constraints")
        private Constraints constraints;

        @com.aliyun.core.annotation.NameInMap("NodeGroupId")
        private String nodeGroupId;

        @com.aliyun.core.annotation.NameInMap("ScalingPolicyId")
        private String scalingPolicyId;

        @com.aliyun.core.annotation.NameInMap("ScalingRules")
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
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c-b933c5aac8fe****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The maximum and minimum number of nodes in the node group.</p>
             */
            public Builder constraints(Constraints constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * <p>The ID of the node group.</p>
             * 
             * <strong>example:</strong>
             * <p>ng-869471354ecd****</p>
             */
            public Builder nodeGroupId(String nodeGroupId) {
                this.nodeGroupId = nodeGroupId;
                return this;
            }

            /**
             * <p>The ID of the scaling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>asp-asduwe23znl***</p>
             */
            public Builder scalingPolicyId(String scalingPolicyId) {
                this.scalingPolicyId = scalingPolicyId;
                return this;
            }

            /**
             * <p>The auto scaling rules.</p>
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
