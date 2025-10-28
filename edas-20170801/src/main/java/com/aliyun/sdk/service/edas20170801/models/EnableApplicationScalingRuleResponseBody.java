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
 * {@link EnableApplicationScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>EnableApplicationScalingRuleResponseBody</p>
 */
public class EnableApplicationScalingRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppScalingRule")
    private AppScalingRule appScalingRule;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(EnableApplicationScalingRuleResponseBody model) {
            this.appScalingRule = model.appScalingRule;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the auto scaling policy.</p>
         */
        public Builder appScalingRule(AppScalingRule appScalingRule) {
            this.appScalingRule = appScalingRule;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
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

        public EnableApplicationScalingRuleResponseBody build() {
            return new EnableApplicationScalingRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnableApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>EnableApplicationScalingRuleResponseBody</p>
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
             * <p>12</p>
             */
            public Builder metricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
                this.metricTargetAverageUtilization = metricTargetAverageUtilization;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>cpu</p>
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
     * {@link EnableApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>EnableApplicationScalingRuleResponseBody</p>
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
     * {@link EnableApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>EnableApplicationScalingRuleResponseBody</p>
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
             * <p>cpu</p>
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
     * {@link EnableApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>EnableApplicationScalingRuleResponseBody</p>
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
             * <p>The list of triggers.</p>
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
     * {@link EnableApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>EnableApplicationScalingRuleResponseBody</p>
     */
    public static class AppScalingRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

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

            private Builder() {
            } 

            private Builder(AppScalingRule model) {
                this.appId = model.appId;
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
             * <p>The time when the auto scaling policy was created.</p>
             * 
             * <strong>example:</strong>
             * <p>23212323123</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The time when the auto scaling policy was last disabled.</p>
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
             * <p>The time when the auto scaling policy was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>23212323123</p>
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
