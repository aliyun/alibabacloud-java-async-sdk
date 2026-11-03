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
 * {@link CreateApplicationScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateApplicationScalingRuleResponseBody</p>
 */
public class CreateApplicationScalingRuleResponseBody extends TeaModel {
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateApplicationScalingRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The API status code or POP error code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: success.</li>
         * <li><strong>3xx</strong>: redirection.</li>
         * <li><strong>4xx</strong>: request error.</li>
         * <li><strong>5xx</strong>: server error.</li>
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
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
         * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InstanceExist.ScalingRuleName</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information. Valid values:</p>
         * <ul>
         * <li>If the request is normal, <strong>success</strong> is returned.</li>
         * <li>If the request is abnormal, a specific error code is returned.</li>
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
         * <p>Indicates whether the application instance is restarted successfully. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: restarted successfully.</li>
         * <li><strong>false</strong>: failed to restart.</li>
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
         * <p>The trace ID, which is used to accurately query the call information.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CreateApplicationScalingRuleResponseBody build() {
            return new CreateApplicationScalingRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApplicationScalingRuleResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Metrics model) {
                this.metricTargetAverageUtilization = model.metricTargetAverageUtilization;
                this.metricType = model.metricType;
                this.slbId = model.slbId;
                this.slbLogstore = model.slbLogstore;
                this.slbProject = model.slbProject;
                this.vport = model.vport;
            } 

            /**
             * <p>The target value of the monitoring metric.</p>
             * <ul>
             * <li>Target CPU utilization, in percentage.</li>
             * <li>Target memory utilization, in percentage.</li>
             * <li>QPS.</li>
             * <li>Response time, in milliseconds.</li>
             * <li>Average number of active TCP connections, in connections per second.</li>
             * <li>Public-Internet-facing SLB QPS.</li>
             * <li>Public-Internet-facing SLB response time, in milliseconds.</li>
             * <li>Private network SLB QPS.</li>
             * <li>Private network SLB response time, in milliseconds.</li>
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
             * <p>The trigger condition for the monitoring metric. Valid values:</p>
             * <ul>
             * <li><strong>CPU</strong>: CPU utilization.</li>
             * <li><strong>MEMORY</strong>: memory utilization.</li>
             * <li><strong>QPS</strong>: the average QPS of a single instance of a Java application within 1 minute.</li>
             * <li><strong>RT</strong>: the average RT of all service interfaces of a Java application within 1 minute.</li>
             * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections of a single instance within 30 seconds.</li>
             * <li><strong>SLB_QPS</strong>: the average public-Internet-facing SLB QPS of a single instance within 15 seconds.</li>
             * <li><strong>SLB_RT</strong>: the average public-Internet-facing SLB response time within 15 seconds.</li>
             * <li><strong>INTRANET_SLB_QPS</strong>: the average private network SLB QPS of a single instance within 15 seconds.</li>
             * <li><strong>INTRANET_SLB_RT</strong>: the average private network SLB response time within 15 seconds.</li>
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
             * <p>The SLB instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-xxx</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The Simple Log Service Logstore for SLB access logs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder slbLogstore(String slbLogstore) {
                this.slbLogstore = slbLogstore;
                return this;
            }

            /**
             * <p>The Simple Log Service project for SLB access logs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder slbProject(String slbProject) {
                this.slbProject = slbProject;
                return this;
            }

            /**
             * <p>The SLB port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
     * {@link CreateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApplicationScalingRuleResponseBody</p>
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
             * <p>The list of monitoring metric-based elastic scaling configurations.</p>
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
     * {@link CreateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApplicationScalingRuleResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Schedules model) {
                this.atTime = model.atTime;
                this.maxReplicas = model.maxReplicas;
                this.minReplicas = model.minReplicas;
                this.targetReplicas = model.targetReplicas;
            } 

            /**
             * <p>The time point. Format: <strong>HH:mm</strong>.</p>
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
             * <p>10</p>
             */
            public Builder maxReplicas(Integer maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * <p>The minimum number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * <p>The target number of instances.</p>
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
     * {@link CreateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApplicationScalingRuleResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Timer model) {
                this.beginDate = model.beginDate;
                this.endDate = model.endDate;
                this.period = model.period;
                this.schedules = model.schedules;
            } 

            /**
             * <p>The short-term start date of the scheduled elastic scaling policy.</p>
             * <ul>
             * <li>If both <strong>BeginDate</strong> and <strong>EndDate</strong> are <strong>null</strong>, the policy is executed on a long-term basis. This is the default value.</li>
             * <li>If specific dates are specified, for example, <strong>BeginDate</strong> is 2021-03-25 and <strong>EndDate</strong> is 2021-04-25, the validity period is one month.</li>
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
             * <p>The short-term end date of the scheduled elastic scaling policy.</p>
             * <ul>
             * <li>If both <strong>BeginDate</strong> and <strong>EndDate</strong> are <strong>null</strong>, the policy is executed on a long-term basis. This is the default value.</li>
             * <li>If specific dates are specified, for example, <strong>BeginDate</strong> is 2021-03-25 and <strong>EndDate</strong> is 2021-04-25, the validity period is one month.</li>
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
             * <p>The epoch for executing the scheduled elastic scaling policy. Valid values:</p>
             * <ul>
             * <li><p><em><em>\</em> \</em> \***: executes the scheduled policy at the specified time every day.</p>
             * </li>
             * <li><p><em><em>\</em> \</em> Fri,Mon**: executes the scheduled policy at the specified time on the specified days of every week. Multiple days are supported. The time zone is GMT+8. Valid values: </p>
             * <ul>
             * <li><strong>Sun</strong>: Sunday</li>
             * <li><strong>Mon</strong>: Monday</li>
             * <li><strong>Tue</strong>: Tuesday</li>
             * <li><strong>Wed</strong>: Wednesday</li>
             * <li><strong>Thu</strong>: Thursday</li>
             * <li><strong>Fri</strong>: Friday</li>
             * <li><strong>Sat</strong>: Saturday</li>
             * </ul>
             * </li>
             * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: executes the scheduled policy at the specified time on the specified days of every month. Multiple days are supported. Valid values: [1,31\]. If the current month does not have the 31st day, the scheduled policy is skipped on that day.</p>
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
             * <p>The trigger time points within a single day.</p>
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
     * {@link CreateApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>CreateApplicationScalingRuleResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.appId = model.appId;
                this.createTime = model.createTime;
                this.enableIdle = model.enableIdle;
                this.lastDisableTime = model.lastDisableTime;
                this.metric = model.metric;
                this.scaleRuleEnabled = model.scaleRuleEnabled;
                this.scaleRuleName = model.scaleRuleName;
                this.scaleRuleType = model.scaleRuleType;
                this.timer = model.timer;
                this.updateTime = model.updateTime;
            } 

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
             * <p>The creation time of the elastic scaling policy. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616642248938</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the idle mode is enabled.</p>
             */
            public Builder enableIdle(Boolean enableIdle) {
                this.enableIdle = enableIdle;
                return this;
            }

            /**
             * <p>The time when the elastic scaling policy was last disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>1641882854484</p>
             */
            public Builder lastDisableTime(Long lastDisableTime) {
                this.lastDisableTime = lastDisableTime;
                return this;
            }

            /**
             * <p>The monitoring metric-based elastic scaling configuration.</p>
             */
            public Builder metric(Metric metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>Indicates whether the elastic scaling policy is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled.</li>
             * <li><strong>false</strong>: disabled.</li>
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
             * <p>The name of the elastic scaling policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder scaleRuleName(String scaleRuleName) {
                this.scaleRuleName = scaleRuleName;
                return this;
            }

            /**
             * <p>The type of the elastic scaling policy. Valid values:</p>
             * <ul>
             * <li><strong>timing</strong>: scheduled elastic scaling.</li>
             * <li><strong>metric</strong>: monitoring metric-based elastic scaling.</li>
             * <li><strong>mix</strong>: hybrid elastic scaling.</li>
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
             * <p>The scheduled elastic scaling configuration.</p>
             */
            public Builder timer(Timer timer) {
                this.timer = timer;
                return this;
            }

            /**
             * <p>The update time of the elastic scaling policy. Unit: milliseconds.</p>
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
