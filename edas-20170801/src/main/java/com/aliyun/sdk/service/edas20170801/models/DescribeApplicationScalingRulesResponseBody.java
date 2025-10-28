// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationScalingRulesResponseBody</p>
 */
public class DescribeApplicationScalingRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppScalingRules")
    private AppScalingRules appScalingRules;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApplicationScalingRulesResponseBody(Builder builder) {
        this.appScalingRules = builder.appScalingRules;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationScalingRulesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appScalingRules
     */
    public AppScalingRules getAppScalingRules() {
        return this.appScalingRules;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AppScalingRules appScalingRules; 
        private Integer code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeApplicationScalingRulesResponseBody model) {
            this.appScalingRules = model.appScalingRules;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The auto scaling policies of the application.</p>
         */
        public Builder appScalingRules(AppScalingRules appScalingRules) {
            this.appScalingRules = appScalingRules;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>a5281053-08e4-47a5-b2ab-5c0323de7b5a</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApplicationScalingRulesResponseBody build() {
            return new DescribeApplicationScalingRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Policies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Policies(Builder builder) {
            this.periodSeconds = builder.periodSeconds;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policies create() {
            return builder().build();
        }

        /**
         * @return periodSeconds
         */
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer periodSeconds; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Policies model) {
                this.periodSeconds = model.periodSeconds;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * PeriodSeconds.
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Policies build() {
                return new Policies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class ScaleDown extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Policies")
        private java.util.List<Policies> policies;

        @com.aliyun.core.annotation.NameInMap("SelectPolicy")
        private String selectPolicy;

        @com.aliyun.core.annotation.NameInMap("StabilizationWindowSeconds")
        private Integer stabilizationWindowSeconds;

        private ScaleDown(Builder builder) {
            this.policies = builder.policies;
            this.selectPolicy = builder.selectPolicy;
            this.stabilizationWindowSeconds = builder.stabilizationWindowSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleDown create() {
            return builder().build();
        }

        /**
         * @return policies
         */
        public java.util.List<Policies> getPolicies() {
            return this.policies;
        }

        /**
         * @return selectPolicy
         */
        public String getSelectPolicy() {
            return this.selectPolicy;
        }

        /**
         * @return stabilizationWindowSeconds
         */
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        public static final class Builder {
            private java.util.List<Policies> policies; 
            private String selectPolicy; 
            private Integer stabilizationWindowSeconds; 

            private Builder() {
            } 

            private Builder(ScaleDown model) {
                this.policies = model.policies;
                this.selectPolicy = model.selectPolicy;
                this.stabilizationWindowSeconds = model.stabilizationWindowSeconds;
            } 

            /**
             * Policies.
             */
            public Builder policies(java.util.List<Policies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * SelectPolicy.
             */
            public Builder selectPolicy(String selectPolicy) {
                this.selectPolicy = selectPolicy;
                return this;
            }

            /**
             * StabilizationWindowSeconds.
             */
            public Builder stabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            public ScaleDown build() {
                return new ScaleDown(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class ScaleUpPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PeriodSeconds")
        private Integer periodSeconds;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ScaleUpPolicies(Builder builder) {
            this.periodSeconds = builder.periodSeconds;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleUpPolicies create() {
            return builder().build();
        }

        /**
         * @return periodSeconds
         */
        public Integer getPeriodSeconds() {
            return this.periodSeconds;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Integer periodSeconds; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(ScaleUpPolicies model) {
                this.periodSeconds = model.periodSeconds;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * PeriodSeconds.
             */
            public Builder periodSeconds(Integer periodSeconds) {
                this.periodSeconds = periodSeconds;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ScaleUpPolicies build() {
                return new ScaleUpPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class ScaleUp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Policies")
        private java.util.List<ScaleUpPolicies> policies;

        @com.aliyun.core.annotation.NameInMap("SelectPolicy")
        private String selectPolicy;

        @com.aliyun.core.annotation.NameInMap("StabilizationWindowSeconds")
        private Integer stabilizationWindowSeconds;

        private ScaleUp(Builder builder) {
            this.policies = builder.policies;
            this.selectPolicy = builder.selectPolicy;
            this.stabilizationWindowSeconds = builder.stabilizationWindowSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleUp create() {
            return builder().build();
        }

        /**
         * @return policies
         */
        public java.util.List<ScaleUpPolicies> getPolicies() {
            return this.policies;
        }

        /**
         * @return selectPolicy
         */
        public String getSelectPolicy() {
            return this.selectPolicy;
        }

        /**
         * @return stabilizationWindowSeconds
         */
        public Integer getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        public static final class Builder {
            private java.util.List<ScaleUpPolicies> policies; 
            private String selectPolicy; 
            private Integer stabilizationWindowSeconds; 

            private Builder() {
            } 

            private Builder(ScaleUp model) {
                this.policies = model.policies;
                this.selectPolicy = model.selectPolicy;
                this.stabilizationWindowSeconds = model.stabilizationWindowSeconds;
            } 

            /**
             * Policies.
             */
            public Builder policies(java.util.List<ScaleUpPolicies> policies) {
                this.policies = policies;
                return this;
            }

            /**
             * SelectPolicy.
             */
            public Builder selectPolicy(String selectPolicy) {
                this.selectPolicy = selectPolicy;
                return this;
            }

            /**
             * StabilizationWindowSeconds.
             */
            public Builder stabilizationWindowSeconds(Integer stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            public ScaleUp build() {
                return new ScaleUp(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Behaviour extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ScaleDown")
        private ScaleDown scaleDown;

        @com.aliyun.core.annotation.NameInMap("ScaleUp")
        private ScaleUp scaleUp;

        private Behaviour(Builder builder) {
            this.scaleDown = builder.scaleDown;
            this.scaleUp = builder.scaleUp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Behaviour create() {
            return builder().build();
        }

        /**
         * @return scaleDown
         */
        public ScaleDown getScaleDown() {
            return this.scaleDown;
        }

        /**
         * @return scaleUp
         */
        public ScaleUp getScaleUp() {
            return this.scaleUp;
        }

        public static final class Builder {
            private ScaleDown scaleDown; 
            private ScaleUp scaleUp; 

            private Builder() {
            } 

            private Builder(Behaviour model) {
                this.scaleDown = model.scaleDown;
                this.scaleUp = model.scaleUp;
            } 

            /**
             * ScaleDown.
             */
            public Builder scaleDown(ScaleDown scaleDown) {
                this.scaleDown = scaleDown;
                return this;
            }

            /**
             * ScaleUp.
             */
            public Builder scaleUp(ScaleUp scaleUp) {
                this.scaleUp = scaleUp;
                return this;
            }

            public Behaviour build() {
                return new Behaviour(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricTargetAverageUtilization")
        private Integer metricTargetAverageUtilization;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        private Metrics(Builder builder) {
            this.metricTargetAverageUtilization = builder.metricTargetAverageUtilization;
            this.metricType = builder.metricType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metrics create() {
            return builder().build();
        }

        /**
         * @return metricTargetAverageUtilization
         */
        public Integer getMetricTargetAverageUtilization() {
            return this.metricTargetAverageUtilization;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        public static final class Builder {
            private Integer metricTargetAverageUtilization; 
            private String metricType; 

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.metricTargetAverageUtilization = model.metricTargetAverageUtilization;
                this.metricType = model.metricType;
            } 

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder metricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
                this.metricTargetAverageUtilization = metricTargetAverageUtilization;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>asd</p>
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            public Metrics build() {
                return new Metrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Metric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("MinReplicas")
        private Integer minReplicas;

        private Metric(Builder builder) {
            this.maxReplicas = builder.maxReplicas;
            this.metrics = builder.metrics;
            this.minReplicas = builder.minReplicas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metric create() {
            return builder().build();
        }

        /**
         * @return maxReplicas
         */
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        /**
         * @return metrics
         */
        public java.util.List<Metrics> getMetrics() {
            return this.metrics;
        }

        /**
         * @return minReplicas
         */
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        public static final class Builder {
            private Integer maxReplicas; 
            private java.util.List<Metrics> metrics; 
            private Integer minReplicas; 

            private Builder() {
            } 

            private Builder(Metric model) {
                this.maxReplicas = model.maxReplicas;
                this.metrics = model.metrics;
                this.minReplicas = model.minReplicas;
            } 

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            public Metric build() {
                return new Metric(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Triggers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetaData")
        private String metaData;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Triggers(Builder builder) {
            this.metaData = builder.metaData;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Triggers create() {
            return builder().build();
        }

        /**
         * @return metaData
         */
        public String getMetaData() {
            return this.metaData;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String metaData; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Triggers model) {
                this.metaData = model.metaData;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The metadata of the trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;dryRun&quot;:true}</p>
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * <p>The name of the trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>cron-trigger</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the trigger. Valid values: cron and app_metric.</p>
             * 
             * <strong>example:</strong>
             * <p>cron</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Triggers build() {
                return new Triggers(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @com.aliyun.core.annotation.NameInMap("MinReplicas")
        private Integer minReplicas;

        @com.aliyun.core.annotation.NameInMap("Triggers")
        private java.util.List<Triggers> triggers;

        private Trigger(Builder builder) {
            this.maxReplicas = builder.maxReplicas;
            this.minReplicas = builder.minReplicas;
            this.triggers = builder.triggers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return maxReplicas
         */
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        /**
         * @return minReplicas
         */
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        /**
         * @return triggers
         */
        public java.util.List<Triggers> getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private Integer maxReplicas; 
            private Integer minReplicas; 
            private java.util.List<Triggers> triggers; 

            private Builder() {
            } 

            private Builder(Trigger model) {
                this.maxReplicas = model.maxReplicas;
                this.minReplicas = model.minReplicas;
                this.triggers = model.triggers;
            } 

            /**
             * <p>The maximum number of replicas. The upper limit is 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>122</p>
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * <p>The minimum number of replicas. The lower limit is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * <p>The configurations of the trigger.</p>
             */
            public Builder triggers(java.util.List<Triggers> triggers) {
                this.triggers = triggers;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("Behaviour")
        private Behaviour behaviour;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("LastDisableTime")
        private Long lastDisableTime;

        @com.aliyun.core.annotation.NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private Metric metric;

        @com.aliyun.core.annotation.NameInMap("MinReplicas")
        private Integer minReplicas;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleEnabled")
        private Boolean scaleRuleEnabled;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleName")
        private String scaleRuleName;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleType")
        private String scaleRuleType;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Result(Builder builder) {
            this.appId = builder.appId;
            this.behaviour = builder.behaviour;
            this.createTime = builder.createTime;
            this.lastDisableTime = builder.lastDisableTime;
            this.maxReplicas = builder.maxReplicas;
            this.metric = builder.metric;
            this.minReplicas = builder.minReplicas;
            this.scaleRuleEnabled = builder.scaleRuleEnabled;
            this.scaleRuleName = builder.scaleRuleName;
            this.scaleRuleType = builder.scaleRuleType;
            this.trigger = builder.trigger;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return behaviour
         */
        public Behaviour getBehaviour() {
            return this.behaviour;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return lastDisableTime
         */
        public Long getLastDisableTime() {
            return this.lastDisableTime;
        }

        /**
         * @return maxReplicas
         */
        public Integer getMaxReplicas() {
            return this.maxReplicas;
        }

        /**
         * @return metric
         */
        public Metric getMetric() {
            return this.metric;
        }

        /**
         * @return minReplicas
         */
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        /**
         * @return scaleRuleEnabled
         */
        public Boolean getScaleRuleEnabled() {
            return this.scaleRuleEnabled;
        }

        /**
         * @return scaleRuleName
         */
        public String getScaleRuleName() {
            return this.scaleRuleName;
        }

        /**
         * @return scaleRuleType
         */
        public String getScaleRuleType() {
            return this.scaleRuleType;
        }

        /**
         * @return trigger
         */
        public Trigger getTrigger() {
            return this.trigger;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String appId; 
            private Behaviour behaviour; 
            private Long createTime; 
            private Long lastDisableTime; 
            private Integer maxReplicas; 
            private Metric metric; 
            private Integer minReplicas; 
            private Boolean scaleRuleEnabled; 
            private String scaleRuleName; 
            private String scaleRuleType; 
            private Trigger trigger; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.appId = model.appId;
                this.behaviour = model.behaviour;
                this.createTime = model.createTime;
                this.lastDisableTime = model.lastDisableTime;
                this.maxReplicas = model.maxReplicas;
                this.metric = model.metric;
                this.minReplicas = model.minReplicas;
                this.scaleRuleEnabled = model.scaleRuleEnabled;
                this.scaleRuleName = model.scaleRuleName;
                this.scaleRuleType = model.scaleRuleType;
                this.trigger = model.trigger;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The ID of the application to which the auto scaling policy belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>78194c76-3dca-418e-a263-cccd1ab4****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Behaviour.
             */
            public Builder behaviour(Behaviour behaviour) {
                this.behaviour = behaviour;
                return this;
            }

            /**
             * <p>The time when the auto scaling policy was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>23212323123</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the auto scaling policy was last disabled. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>23212323123</p>
             */
            public Builder lastDisableTime(Long lastDisableTime) {
                this.lastDisableTime = lastDisableTime;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             */
            public Builder metric(Metric metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The auto scaling policy is enabled.</li>
             * <li><strong>false</strong>: The auto scaling policy is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder scaleRuleEnabled(Boolean scaleRuleEnabled) {
                this.scaleRuleEnabled = scaleRuleEnabled;
                return this;
            }

            /**
             * <p>The name of the auto scaling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu-trigger</p>
             */
            public Builder scaleRuleName(String scaleRuleName) {
                this.scaleRuleName = scaleRuleName;
                return this;
            }

            /**
             * <p>The type of the auto scaling policy. The value is fixed to trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>trigger</p>
             */
            public Builder scaleRuleType(String scaleRuleType) {
                this.scaleRuleType = scaleRuleType;
                return this;
            }

            /**
             * <p>The configurations of the trigger.</p>
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * <p>The time when the auto scaling policy was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>23212323123</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class AppScalingRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Long totalSize;

        private AppScalingRules(Builder builder) {
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.result = builder.result;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppScalingRules create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        /**
         * @return totalSize
         */
        public Long getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private Integer currentPage; 
            private Integer pageSize; 
            private java.util.List<Result> result; 
            private Long totalSize; 

            private Builder() {
            } 

            private Builder(AppScalingRules model) {
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.result = model.result;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of auto scaling policies returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The information about auto scaling policies.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The total number of auto scaling policies.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder totalSize(Long totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public AppScalingRules build() {
                return new AppScalingRules(this);
            } 

        } 

    }
}
