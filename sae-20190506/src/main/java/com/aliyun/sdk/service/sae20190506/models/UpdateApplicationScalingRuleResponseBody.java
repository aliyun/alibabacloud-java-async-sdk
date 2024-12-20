// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link UpdateApplicationScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateApplicationScalingRuleResponseBody</p>
 */
public class UpdateApplicationScalingRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private UpdateApplicationScalingRuleResponseBody(Builder builder) {
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

    public static UpdateApplicationScalingRuleResponseBody create() {
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
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: The call was successful.</li>
         * <li><strong>3xx</strong>: The call was redirected.</li>
         * <li><strong>4xx</strong>: The call failed.</li>
         * <li><strong>5xx</strong>: A server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code returned. Take note of the following rules:</p>
         * <ul>
         * <li>If the call is successful, <strong>ErrorCode</strong> is not returned.</li>
         * <li>If the call fails, <strong>ErrorCode</strong> is returned. For more information, see the &quot;<strong>Error codes</strong>&quot; section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Null</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The returned message. Take note of the following rules:</p>
         * <ul>
         * <li>If the call is successful, <strong>success</strong> is returned.</li>
         * <li>If the call fails, an error code is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Specifies whether the instances are successfully restarted. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The trace ID that is used to query the details of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public UpdateApplicationScalingRuleResponseBody build() {
            return new UpdateApplicationScalingRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApplicationScalingRuleResponseBody</p>
     */
    public static class Metrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MetricTargetAverageUtilization")
        private Integer metricTargetAverageUtilization;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("SlbId")
        private String slbId;

        @com.aliyun.core.annotation.NameInMap("SlbLogstore")
        private String slbLogstore;

        @com.aliyun.core.annotation.NameInMap("SlbProject")
        private String slbProject;

        @com.aliyun.core.annotation.NameInMap("Vport")
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
             * <p>The limit on the metric.</p>
             * <ul>
             * <li>The limit on the CPU utilization. Unit: percentage.</li>
             * <li>The limit on the memory usage. Unit: percentage.</li>
             * <li>The limit on the average number of active TCP connections per second.</li>
             * <li>The limit on the QPS of the Internet-facing SLB instance.</li>
             * <li>The limit on the response time of the Internet-facing SLB instance. Unit: milliseconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder metricTargetAverageUtilization(Integer metricTargetAverageUtilization) {
                this.metricTargetAverageUtilization = metricTargetAverageUtilization;
                return this;
            }

            /**
             * <p>The metric that is used to trigger the auto scaling policy. Valid values:</p>
             * <ul>
             * <li><strong>CPU</strong>: the CPU utilization.</li>
             * <li><strong>MEMORY</strong>: the memory usage.</li>
             * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections of an application instance within 30 seconds.</li>
             * <li><strong>SLB_QPS</strong>: the average QPS of the Internet-facing SLB instance associated with an application instance within 15 seconds.</li>
             * <li><strong>SLB_RT</strong>: the average response time of the Internet-facing SLB instance within 15 seconds.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CPU</p>
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
    /**
     * 
     * {@link UpdateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApplicationScalingRuleResponseBody</p>
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

            /**
             * <p>The maximum number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * <p>The metrics that are used to trigger the auto scaling policy.</p>
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The minimum number of instances.</p>
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
     * {@link UpdateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApplicationScalingRuleResponseBody</p>
     */
    public static class Schedules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AtTime")
        private String atTime;

        @com.aliyun.core.annotation.NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @com.aliyun.core.annotation.NameInMap("MinReplicas")
        private Integer minReplicas;

        @com.aliyun.core.annotation.NameInMap("TargetReplicas")
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
             * <p>The point in time. Format: <strong>Hour:Minute</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>08:00</p>
             */
            public Builder atTime(String atTime) {
                this.atTime = atTime;
                return this;
            }

            /**
             * <p>The maximum number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * <p>The minimum number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * <p>The expected number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link UpdateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApplicationScalingRuleResponseBody</p>
     */
    public static class Timer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginDate")
        private String beginDate;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("Period")
        private String period;

        @com.aliyun.core.annotation.NameInMap("Schedules")
        private java.util.List<Schedules> schedules;

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
        public java.util.List<Schedules> getSchedules() {
            return this.schedules;
        }

        public static final class Builder {
            private String beginDate; 
            private String endDate; 
            private String period; 
            private java.util.List<Schedules> schedules; 

            /**
             * <p>The start date of the validity period of the scheduled auto scaling policy. Parameter description:</p>
             * <ul>
             * <li>If <strong>BeginDate</strong> and <strong>EndDate</strong> are set to <strong>null</strong>, the auto scaling policy is a long-term policy. Default values of the beginDate and endDate parameters: null.</li>
             * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is set to 2021-03-25 and <strong>EndDate</strong> is set to 2021-04-25, the auto scaling policy is valid for one month.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2021-03-25</p>
             */
            public Builder beginDate(String beginDate) {
                this.beginDate = beginDate;
                return this;
            }

            /**
             * <p>The end date of the validity period of the scheduled auto scaling policy. Take note of the following rules:</p>
             * <ul>
             * <li>If <strong>BeginDate</strong> and <strong>EndDate</strong> are set to <strong>null</strong>, the auto scaling policy is a long-term policy. Default values of the beginDate and endDate parameters: null.</li>
             * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is set to 2021-03-25 and <strong>EndDate</strong> is set to 2021-04-25, the auto scaling policy is valid for one month.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2021-04-25</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The frequency at which the scheduled auto scaling policy is executed. Valid values:</p>
             * <ul>
             * <li><p><strong>* * *</strong>: The scheduled auto scaling policy is executed at a specified point in time every day.</p>
             * </li>
             * <li><p><strong>* * Fri,Mon</strong>: The scheduled auto scaling policy is executed at a specified point in time on one or more days of each week. GMT+8 is used. Valid values:</p>
             * <ul>
             * <li><strong>Sun</strong></li>
             * <li><strong>Mon</strong></li>
             * <li><strong>Tue</strong></li>
             * <li><strong>Wed</strong></li>
             * <li><strong>Thu</strong></li>
             * <li><strong>Fri</strong></li>
             * <li><strong>Sat</strong></li>
             * </ul>
             * </li>
             * <li><p><strong>1,2,3,28,31 * *</strong>: The scheduled auto scaling policy is executed at a specified point in time on one or more days of each month. Valid values: 1 to 31. If the month does not have a 31st day, the auto scaling policy is executed on the specified days other than the 31st day.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <hr>
             */
            public Builder period(String period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The points in time at which the auto scaling policy is triggered within one day.</p>
             */
            public Builder schedules(java.util.List<Schedules> schedules) {
                this.schedules = schedules;
                return this;
            }

            public Timer build() {
                return new Timer(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateApplicationScalingRuleResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("EnableIdle")
        private Boolean enableIdle;

        @com.aliyun.core.annotation.NameInMap("LastDisableTime")
        private Long lastDisableTime;

        @com.aliyun.core.annotation.NameInMap("Metric")
        private Metric metric;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleEnabled")
        private Boolean scaleRuleEnabled;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleName")
        private String scaleRuleName;

        @com.aliyun.core.annotation.NameInMap("ScaleRuleType")
        private String scaleRuleType;

        @com.aliyun.core.annotation.NameInMap("Timer")
        private Timer timer;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.enableIdle = builder.enableIdle;
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
         * @return enableIdle
         */
        public Boolean getEnableIdle() {
            return this.enableIdle;
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
            private Boolean enableIdle; 
            private Long lastDisableTime; 
            private Metric metric; 
            private Boolean scaleRuleEnabled; 
            private String scaleRuleName; 
            private String scaleRuleType; 
            private Timer timer; 
            private Long updateTime; 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the auto scaling policy was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616642248938</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EnableIdle.
             */
            public Builder enableIdle(Boolean enableIdle) {
                this.enableIdle = enableIdle;
                return this;
            }

            /**
             * <p>The time when the auto scaling policy was last disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1641882854484</p>
             */
            public Builder lastDisableTime(Long lastDisableTime) {
                this.lastDisableTime = lastDisableTime;
                return this;
            }

            /**
             * <p>The details of the metric-based auto scaling policy.</p>
             */
            public Builder metric(Metric metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>Specifies whether to enable the auto scaling policy. Valid values:</p>
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
             * <p>test</p>
             */
            public Builder scaleRuleName(String scaleRuleName) {
                this.scaleRuleName = scaleRuleName;
                return this;
            }

            /**
             * <p>The type of the auto scaling policy. Valid values:</p>
             * <ul>
             * <li><strong>timing</strong>: a scheduled auto scaling policy</li>
             * <li><strong>metric</strong>: a metric-based auto scaling policy</li>
             * <li><strong>mix</strong>: a hybrid auto scaling policy</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>timing</p>
             */
            public Builder scaleRuleType(String scaleRuleType) {
                this.scaleRuleType = scaleRuleType;
                return this;
            }

            /**
             * <p>The details of the scheduled auto scaling policy.</p>
             */
            public Builder timer(Timer timer) {
                this.timer = timer;
                return this;
            }

            /**
             * <p>The time when the auto scaling policy was updated. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616642248938</p>
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
