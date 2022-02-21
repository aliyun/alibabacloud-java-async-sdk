// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationScalingRuleResponseBody</p>
 */
public class DescribeApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TraceId")
    private String traceId;

    private DescribeApplicationScalingRuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationScalingRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private String traceId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationScalingRuleResponseBody build() {
            return new DescribeApplicationScalingRuleResponseBody(this);
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
             * MetricTargetAverageUtilization.
             */
            public Builder metricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
                this.metricTargetAverageUtilization = metricTargetAverageUtilization;
                return this;
            }

            /**
             * MetricType.
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
    public static class CurrentMetrics extends TeaModel {
        @NameInMap("CurrentValue")
        private Long currentValue;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private CurrentMetrics(Builder builder) {
            this.currentValue = builder.currentValue;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CurrentMetrics create() {
            return builder().build();
        }

        /**
         * @return currentValue
         */
        public Long getCurrentValue() {
            return this.currentValue;
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
            private Long currentValue; 
            private String name; 
            private String type; 

            /**
             * CurrentValue.
             */
            public Builder currentValue(Long currentValue) {
                this.currentValue = currentValue;
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CurrentMetrics build() {
                return new CurrentMetrics(this);
            } 

        } 

    }
    public static class NextScaleMetrics extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("NextScaleInAverageUtilization")
        private Integer nextScaleInAverageUtilization;

        @NameInMap("NextScaleOutAverageUtilization")
        private Integer nextScaleOutAverageUtilization;

        private NextScaleMetrics(Builder builder) {
            this.name = builder.name;
            this.nextScaleInAverageUtilization = builder.nextScaleInAverageUtilization;
            this.nextScaleOutAverageUtilization = builder.nextScaleOutAverageUtilization;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NextScaleMetrics create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nextScaleInAverageUtilization
         */
        public Integer getNextScaleInAverageUtilization() {
            return this.nextScaleInAverageUtilization;
        }

        /**
         * @return nextScaleOutAverageUtilization
         */
        public Integer getNextScaleOutAverageUtilization() {
            return this.nextScaleOutAverageUtilization;
        }

        public static final class Builder {
            private String name; 
            private Integer nextScaleInAverageUtilization; 
            private Integer nextScaleOutAverageUtilization; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NextScaleInAverageUtilization.
             */
            public Builder nextScaleInAverageUtilization(Integer nextScaleInAverageUtilization) {
                this.nextScaleInAverageUtilization = nextScaleInAverageUtilization;
                return this;
            }

            /**
             * NextScaleOutAverageUtilization.
             */
            public Builder nextScaleOutAverageUtilization(Integer nextScaleOutAverageUtilization) {
                this.nextScaleOutAverageUtilization = nextScaleOutAverageUtilization;
                return this;
            }

            public NextScaleMetrics build() {
                return new NextScaleMetrics(this);
            } 

        } 

    }
    public static class MetricsStatus extends TeaModel {
        @NameInMap("CurrentMetrics")
        private java.util.List < CurrentMetrics> currentMetrics;

        @NameInMap("CurrentReplicas")
        private Long currentReplicas;

        @NameInMap("DesiredReplicas")
        private Long desiredReplicas;

        @NameInMap("LastScaleTime")
        private String lastScaleTime;

        @NameInMap("NextScaleMetrics")
        private java.util.List < NextScaleMetrics> nextScaleMetrics;

        @NameInMap("NextScaleTimePeriod")
        private Integer nextScaleTimePeriod;

        private MetricsStatus(Builder builder) {
            this.currentMetrics = builder.currentMetrics;
            this.currentReplicas = builder.currentReplicas;
            this.desiredReplicas = builder.desiredReplicas;
            this.lastScaleTime = builder.lastScaleTime;
            this.nextScaleMetrics = builder.nextScaleMetrics;
            this.nextScaleTimePeriod = builder.nextScaleTimePeriod;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MetricsStatus create() {
            return builder().build();
        }

        /**
         * @return currentMetrics
         */
        public java.util.List < CurrentMetrics> getCurrentMetrics() {
            return this.currentMetrics;
        }

        /**
         * @return currentReplicas
         */
        public Long getCurrentReplicas() {
            return this.currentReplicas;
        }

        /**
         * @return desiredReplicas
         */
        public Long getDesiredReplicas() {
            return this.desiredReplicas;
        }

        /**
         * @return lastScaleTime
         */
        public String getLastScaleTime() {
            return this.lastScaleTime;
        }

        /**
         * @return nextScaleMetrics
         */
        public java.util.List < NextScaleMetrics> getNextScaleMetrics() {
            return this.nextScaleMetrics;
        }

        /**
         * @return nextScaleTimePeriod
         */
        public Integer getNextScaleTimePeriod() {
            return this.nextScaleTimePeriod;
        }

        public static final class Builder {
            private java.util.List < CurrentMetrics> currentMetrics; 
            private Long currentReplicas; 
            private Long desiredReplicas; 
            private String lastScaleTime; 
            private java.util.List < NextScaleMetrics> nextScaleMetrics; 
            private Integer nextScaleTimePeriod; 

            /**
             * CurrentMetrics.
             */
            public Builder currentMetrics(java.util.List < CurrentMetrics> currentMetrics) {
                this.currentMetrics = currentMetrics;
                return this;
            }

            /**
             * CurrentReplicas.
             */
            public Builder currentReplicas(Long currentReplicas) {
                this.currentReplicas = currentReplicas;
                return this;
            }

            /**
             * DesiredReplicas.
             */
            public Builder desiredReplicas(Long desiredReplicas) {
                this.desiredReplicas = desiredReplicas;
                return this;
            }

            /**
             * LastScaleTime.
             */
            public Builder lastScaleTime(String lastScaleTime) {
                this.lastScaleTime = lastScaleTime;
                return this;
            }

            /**
             * NextScaleMetrics.
             */
            public Builder nextScaleMetrics(java.util.List < NextScaleMetrics> nextScaleMetrics) {
                this.nextScaleMetrics = nextScaleMetrics;
                return this;
            }

            /**
             * NextScaleTimePeriod.
             */
            public Builder nextScaleTimePeriod(Integer nextScaleTimePeriod) {
                this.nextScaleTimePeriod = nextScaleTimePeriod;
                return this;
            }

            public MetricsStatus build() {
                return new MetricsStatus(this);
            } 

        } 

    }
    public static class ScaleDownRules extends TeaModel {
        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("StabilizationWindowSeconds")
        private Long stabilizationWindowSeconds;

        @NameInMap("Step")
        private Long step;

        private ScaleDownRules(Builder builder) {
            this.disabled = builder.disabled;
            this.stabilizationWindowSeconds = builder.stabilizationWindowSeconds;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleDownRules create() {
            return builder().build();
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return stabilizationWindowSeconds
         */
        public Long getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        /**
         * @return step
         */
        public Long getStep() {
            return this.step;
        }

        public static final class Builder {
            private Boolean disabled; 
            private Long stabilizationWindowSeconds; 
            private Long step; 

            /**
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * StabilizationWindowSeconds.
             */
            public Builder stabilizationWindowSeconds(Long stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Long step) {
                this.step = step;
                return this;
            }

            public ScaleDownRules build() {
                return new ScaleDownRules(this);
            } 

        } 

    }
    public static class ScaleUpRules extends TeaModel {
        @NameInMap("Disabled")
        private Boolean disabled;

        @NameInMap("StabilizationWindowSeconds")
        private Long stabilizationWindowSeconds;

        @NameInMap("Step")
        private Long step;

        private ScaleUpRules(Builder builder) {
            this.disabled = builder.disabled;
            this.stabilizationWindowSeconds = builder.stabilizationWindowSeconds;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScaleUpRules create() {
            return builder().build();
        }

        /**
         * @return disabled
         */
        public Boolean getDisabled() {
            return this.disabled;
        }

        /**
         * @return stabilizationWindowSeconds
         */
        public Long getStabilizationWindowSeconds() {
            return this.stabilizationWindowSeconds;
        }

        /**
         * @return step
         */
        public Long getStep() {
            return this.step;
        }

        public static final class Builder {
            private Boolean disabled; 
            private Long stabilizationWindowSeconds; 
            private Long step; 

            /**
             * Disabled.
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * StabilizationWindowSeconds.
             */
            public Builder stabilizationWindowSeconds(Long stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            /**
             * Step.
             */
            public Builder step(Long step) {
                this.step = step;
                return this;
            }

            public ScaleUpRules build() {
                return new ScaleUpRules(this);
            } 

        } 

    }
    public static class Metric extends TeaModel {
        @NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @NameInMap("Metrics")
        private java.util.List < Metrics> metrics;

        @NameInMap("MetricsStatus")
        private MetricsStatus metricsStatus;

        @NameInMap("MinReplicas")
        private Integer minReplicas;

        @NameInMap("ScaleDownRules")
        private ScaleDownRules scaleDownRules;

        @NameInMap("ScaleUpRules")
        private ScaleUpRules scaleUpRules;

        private Metric(Builder builder) {
            this.maxReplicas = builder.maxReplicas;
            this.metrics = builder.metrics;
            this.metricsStatus = builder.metricsStatus;
            this.minReplicas = builder.minReplicas;
            this.scaleDownRules = builder.scaleDownRules;
            this.scaleUpRules = builder.scaleUpRules;
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
         * @return metricsStatus
         */
        public MetricsStatus getMetricsStatus() {
            return this.metricsStatus;
        }

        /**
         * @return minReplicas
         */
        public Integer getMinReplicas() {
            return this.minReplicas;
        }

        /**
         * @return scaleDownRules
         */
        public ScaleDownRules getScaleDownRules() {
            return this.scaleDownRules;
        }

        /**
         * @return scaleUpRules
         */
        public ScaleUpRules getScaleUpRules() {
            return this.scaleUpRules;
        }

        public static final class Builder {
            private Integer maxReplicas; 
            private java.util.List < Metrics> metrics; 
            private MetricsStatus metricsStatus; 
            private Integer minReplicas; 
            private ScaleDownRules scaleDownRules; 
            private ScaleUpRules scaleUpRules; 

            /**
             * MaxReplicas.
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * Metrics.
             */
            public Builder metrics(java.util.List < Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * MetricsStatus.
             */
            public Builder metricsStatus(MetricsStatus metricsStatus) {
                this.metricsStatus = metricsStatus;
                return this;
            }

            /**
             * MinReplicas.
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * ScaleDownRules.
             */
            public Builder scaleDownRules(ScaleDownRules scaleDownRules) {
                this.scaleDownRules = scaleDownRules;
                return this;
            }

            /**
             * ScaleUpRules.
             */
            public Builder scaleUpRules(ScaleUpRules scaleUpRules) {
                this.scaleUpRules = scaleUpRules;
                return this;
            }

            public Metric build() {
                return new Metric(this);
            } 

        } 

    }
    public static class Schedules extends TeaModel {
        @NameInMap("AtTime")
        private String atTime;

        @NameInMap("TargetReplicas")
        private Integer targetReplicas;

        private Schedules(Builder builder) {
            this.atTime = builder.atTime;
            this.targetReplicas = builder.targetReplicas;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Schedules create() {
            return builder().build();
        }

        /**
         * @return atTime
         */
        public String getAtTime() {
            return this.atTime;
        }

        /**
         * @return targetReplicas
         */
        public Integer getTargetReplicas() {
            return this.targetReplicas;
        }

        public static final class Builder {
            private String atTime; 
            private Integer targetReplicas; 

            /**
             * AtTime.
             */
            public Builder atTime(String atTime) {
                this.atTime = atTime;
                return this;
            }

            /**
             * TargetReplicas.
             */
            public Builder targetReplicas(Integer targetReplicas) {
                this.targetReplicas = targetReplicas;
                return this;
            }

            public Schedules build() {
                return new Schedules(this);
            } 

        } 

    }
    public static class Timer extends TeaModel {
        @NameInMap("BeginDate")
        private String beginDate;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("Period")
        private String period;

        @NameInMap("Schedules")
        private java.util.List < Schedules> schedules;

        private Timer(Builder builder) {
            this.beginDate = builder.beginDate;
            this.endDate = builder.endDate;
            this.period = builder.period;
            this.schedules = builder.schedules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Timer create() {
            return builder().build();
        }

        /**
         * @return beginDate
         */
        public String getBeginDate() {
            return this.beginDate;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return period
         */
        public String getPeriod() {
            return this.period;
        }

        /**
         * @return schedules
         */
        public java.util.List < Schedules> getSchedules() {
            return this.schedules;
        }

        public static final class Builder {
            private String beginDate; 
            private String endDate; 
            private String period; 
            private java.util.List < Schedules> schedules; 

            /**
             * BeginDate.
             */
            public Builder beginDate(String beginDate) {
                this.beginDate = beginDate;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * Period.
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * Schedules.
             */
            public Builder schedules(java.util.List < Schedules> schedules) {
                this.schedules = schedules;
                return this;
            }

            public Timer build() {
                return new Timer(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("LastDisableTime")
        private Long lastDisableTime;

        @NameInMap("Metric")
        private Metric metric;

        @NameInMap("ScaleRuleEnabled")
        private Boolean scaleRuleEnabled;

        @NameInMap("ScaleRuleName")
        private String scaleRuleName;

        @NameInMap("ScaleRuleType")
        private String scaleRuleType;

        @NameInMap("Timer")
        private Timer timer;

        @NameInMap("UpdateTime")
        private Long updateTime;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.lastDisableTime = builder.lastDisableTime;
            this.metric = builder.metric;
            this.scaleRuleEnabled = builder.scaleRuleEnabled;
            this.scaleRuleName = builder.scaleRuleName;
            this.scaleRuleType = builder.scaleRuleType;
            this.timer = builder.timer;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
         * @return metric
         */
        public Metric getMetric() {
            return this.metric;
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
         * @return timer
         */
        public Timer getTimer() {
            return this.timer;
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
            private Metric metric; 
            private Boolean scaleRuleEnabled; 
            private String scaleRuleName; 
            private String scaleRuleType; 
            private Timer timer; 
            private Long updateTime; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * LastDisableTime.
             */
            public Builder lastDisableTime(Long lastDisableTime) {
                this.lastDisableTime = lastDisableTime;
                return this;
            }

            /**
             * Metric.
             */
            public Builder metric(Metric metric) {
                this.metric = metric;
                return this;
            }

            /**
             * ScaleRuleEnabled.
             */
            public Builder scaleRuleEnabled(Boolean scaleRuleEnabled) {
                this.scaleRuleEnabled = scaleRuleEnabled;
                return this;
            }

            /**
             * ScaleRuleName.
             */
            public Builder scaleRuleName(String scaleRuleName) {
                this.scaleRuleName = scaleRuleName;
                return this;
            }

            /**
             * ScaleRuleType.
             */
            public Builder scaleRuleType(String scaleRuleType) {
                this.scaleRuleType = scaleRuleType;
                return this;
            }

            /**
             * Timer.
             */
            public Builder timer(Timer timer) {
                this.timer = timer;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
