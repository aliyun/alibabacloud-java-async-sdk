// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableApplicationScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>EnableApplicationScalingRuleResponseBody</p>
 */
public class EnableApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("AppScalingRule")
    private AppScalingRule appScalingRule;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private EnableApplicationScalingRuleResponseBody(Builder builder) {
        this.appScalingRule = builder.appScalingRule;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableApplicationScalingRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return appScalingRule
     */
    public AppScalingRule getAppScalingRule() {
        return this.appScalingRule;
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
        private AppScalingRule appScalingRule; 
        private Integer code; 
        private String message; 
        private String requestId; 

        /**
         * The information about the auto scaling policy.
         */
        public Builder appScalingRule(AppScalingRule appScalingRule) {
            this.appScalingRule = appScalingRule;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableApplicationScalingRuleResponseBody build() {
            return new EnableApplicationScalingRuleResponseBody(this);
        } 

    } 

    public static class Metrics extends TeaModel {
        @NameInMap("MetricTargetAverageUtilization")
        private Integer metricTargetAverageUtilization;

        @NameInMap("MetricType")
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

            /**
             * This parameter is deprecated.
             */
            public Builder metricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
                this.metricTargetAverageUtilization = metricTargetAverageUtilization;
                return this;
            }

            /**
             * This parameter is deprecated.
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
    public static class Metric extends TeaModel {
        @NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @NameInMap("Metrics")
        private java.util.List < Metrics> metrics;

        @NameInMap("MinReplicas")
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
        public java.util.List < Metrics> getMetrics() {
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
            private java.util.List < Metrics> metrics; 
            private Integer minReplicas; 

            /**
             * This parameter is deprecated.
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder metrics(java.util.List < Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * This parameter is deprecated.
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
    public static class Triggers extends TeaModel {
        @NameInMap("MetaData")
        private String metaData;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
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

            /**
             * The metadata of the trigger.
             */
            public Builder metaData(String metaData) {
                this.metaData = metaData;
                return this;
            }

            /**
             * The name of the trigger.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The type of the trigger. Valid values: cron and app_metric.
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
    public static class Trigger extends TeaModel {
        @NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @NameInMap("MinReplicas")
        private Integer minReplicas;

        @NameInMap("Triggers")
        private java.util.List < Triggers> triggers;

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
        public java.util.List < Triggers> getTriggers() {
            return this.triggers;
        }

        public static final class Builder {
            private Integer maxReplicas; 
            private Integer minReplicas; 
            private java.util.List < Triggers> triggers; 

            /**
             * The maximum number of replicas. The upper limit is 1000.
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * The minimum number of replicas. The lower limit is 0.
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * The list of triggers.
             */
            public Builder triggers(java.util.List < Triggers> triggers) {
                this.triggers = triggers;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
    public static class AppScalingRule extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("LastDisableTime")
        private Long lastDisableTime;

        @NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @NameInMap("Metric")
        private Metric metric;

        @NameInMap("MinReplicas")
        private Integer minReplicas;

        @NameInMap("ScaleRuleEnabled")
        private Boolean scaleRuleEnabled;

        @NameInMap("ScaleRuleName")
        private String scaleRuleName;

        @NameInMap("ScaleRuleType")
        private String scaleRuleType;

        @NameInMap("Trigger")
        private Trigger trigger;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private AppScalingRule(Builder builder) {
            this.appId = builder.appId;
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

        public static AppScalingRule create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
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

            /**
             * The ID of the application to which the auto scaling policy belongs.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The time when the auto scaling policy was created.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the auto scaling policy was last disabled.
             */
            public Builder lastDisableTime(Long lastDisableTime) {
                this.lastDisableTime = lastDisableTime;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder metric(Metric metric) {
                this.metric = metric;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * Indicates whether the auto scaling policy is enabled. Valid values:
             * <p>
             * 
             * *   **true**: The auto scaling policy is enabled.
             * *   **false**: The auto scaling policy is disabled.
             */
            public Builder scaleRuleEnabled(Boolean scaleRuleEnabled) {
                this.scaleRuleEnabled = scaleRuleEnabled;
                return this;
            }

            /**
             * The name of the auto scaling policy.
             */
            public Builder scaleRuleName(String scaleRuleName) {
                this.scaleRuleName = scaleRuleName;
                return this;
            }

            /**
             * The type of the auto scaling policy. The value is fixed to trigger.
             */
            public Builder scaleRuleType(String scaleRuleType) {
                this.scaleRuleType = scaleRuleType;
                return this;
            }

            /**
             * The configurations of the trigger.
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            /**
             * The time when the auto scaling policy was last modified.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public AppScalingRule build() {
                return new AppScalingRule(this);
            } 

        } 

    }
}
