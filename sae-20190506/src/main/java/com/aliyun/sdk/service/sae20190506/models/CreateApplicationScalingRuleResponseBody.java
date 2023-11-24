// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationScalingRuleResponseBody</p>
 */
public class CreateApplicationScalingRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TraceId")
    private String traceId;

    private CreateApplicationScalingRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationScalingRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String traceId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CreateApplicationScalingRuleResponseBody build() {
            return new CreateApplicationScalingRuleResponseBody(this);
        } 

    } 

    public static class Metrics extends TeaModel {
        @NameInMap("MetricTargetAverageUtilization")
        private Integer metricTargetAverageUtilization;

        @NameInMap("MetricType")
        private String metricType;

        @NameInMap("SlbId")
        private String slbId;

        @NameInMap("SlbLogstore")
        private String slbLogstore;

        @NameInMap("SlbProject")
        private String slbProject;

        @NameInMap("Vport")
        private String vport;

        private Metrics(Builder builder) {
            this.metricTargetAverageUtilization = builder.metricTargetAverageUtilization;
            this.metricType = builder.metricType;
            this.slbId = builder.slbId;
            this.slbLogstore = builder.slbLogstore;
            this.slbProject = builder.slbProject;
            this.vport = builder.vport;
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

        /**
         * @return slbId
         */
        public String getSlbId() {
            return this.slbId;
        }

        /**
         * @return slbLogstore
         */
        public String getSlbLogstore() {
            return this.slbLogstore;
        }

        /**
         * @return slbProject
         */
        public String getSlbProject() {
            return this.slbProject;
        }

        /**
         * @return vport
         */
        public String getVport() {
            return this.vport;
        }

        public static final class Builder {
            private Integer metricTargetAverageUtilization; 
            private String metricType; 
            private String slbId; 
            private String slbLogstore; 
            private String slbProject; 
            private String vport; 

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

            /**
             * SlbId.
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * SlbLogstore.
             */
            public Builder slbLogstore(String slbLogstore) {
                this.slbLogstore = slbLogstore;
                return this;
            }

            /**
             * SlbProject.
             */
            public Builder slbProject(String slbProject) {
                this.slbProject = slbProject;
                return this;
            }

            /**
             * Vport.
             */
            public Builder vport(String vport) {
                this.vport = vport;
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
             * MinReplicas.
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
    public static class Schedules extends TeaModel {
        @NameInMap("AtTime")
        private String atTime;

        @NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @NameInMap("MinReplicas")
        private Integer minReplicas;

        @NameInMap("TargetReplicas")
        private Integer targetReplicas;

        private Schedules(Builder builder) {
            this.atTime = builder.atTime;
            this.maxReplicas = builder.maxReplicas;
            this.minReplicas = builder.minReplicas;
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
         * @return targetReplicas
         */
        public Integer getTargetReplicas() {
            return this.targetReplicas;
        }

        public static final class Builder {
            private String atTime; 
            private Integer maxReplicas; 
            private Integer minReplicas; 
            private Integer targetReplicas; 

            /**
             * AtTime.
             */
            public Builder atTime(String atTime) {
                this.atTime = atTime;
                return this;
            }

            /**
             * MaxReplicas.
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
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
