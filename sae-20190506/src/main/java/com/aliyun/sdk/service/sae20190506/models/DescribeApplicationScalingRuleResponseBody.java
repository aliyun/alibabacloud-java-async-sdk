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
 * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationScalingRuleResponseBody</p>
 */
public class DescribeApplicationScalingRuleResponseBody extends TeaModel {
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

    private DescribeApplicationScalingRuleResponseBody(Builder builder) {
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

    public static DescribeApplicationScalingRuleResponseBody create() {
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
         * <p>The returned data.</p>
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>73404D3D-EE4F-4CB2-B197-5C46F6A1****</p>
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
         * <p>The ID of the trace. The ID is used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0b57ff7e16243300839193068e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public DescribeApplicationScalingRuleResponseBody build() {
            return new DescribeApplicationScalingRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
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
             * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections for an instance in 30 seconds.</li>
             * <li><strong>SLB_QPS</strong>: the average QPS of the Internet-facing SLB instance associated with an application instance in 15 seconds.</li>
             * <li><strong>SLB_RT</strong>: the average response time of the Internet-facing SLB instance in 15 seconds.</li>
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
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
     */
    public static class CurrentMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentValue")
        private Long currentValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The current value of the metric.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder currentValue(Long currentValue) {
                this.currentValue = currentValue;
                return this;
            }

            /**
             * <p>The name of the metric.</p>
             * <ul>
             * <li><strong>cpu</strong>: the CPU utilization.</li>
             * <li><strong>memory</strong>: the memory usage.</li>
             * <li><strong>tcpActiveConn</strong>: the number of active TCP connections.</li>
             * <li><strong>slb_incall_qps</strong>: the QPS of the Internet-facing SLB instance.</li>
             * <li><strong>slb_incall_rt</strong>: the response time of the Internet-facing SLB instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cpu</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the data. This parameter corresponds to the metric.</p>
             * <ul>
             * <li><strong>Resource</strong>: used when the metric is the <strong>CPU utilization</strong> or <strong>memory usage</strong>.</li>
             * <li><strong>Pods</strong>: used when the metric is the <strong>number of active TCP connections</strong>.</li>
             * <li><strong>External</strong>: used when the metric is about the <strong>SLB</strong> instance or from <strong>Application Real-Time Monitoring Service (ARMS)</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Resource</p>
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
    /**
     * 
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
     */
    public static class NextScaleMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NextScaleInAverageUtilization")
        private Integer nextScaleInAverageUtilization;

        @com.aliyun.core.annotation.NameInMap("NextScaleOutAverageUtilization")
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
             * <p>The name of the metric.</p>
             * <ul>
             * <li><strong>cpu</strong>: the CPU utilization.</li>
             * <li><strong>memory</strong>: the memory usage.</li>
             * <li><strong>tcpActiveConn</strong>: the number of active TCP connections.</li>
             * <li><strong>slb_incall_qps</strong>: the QPS of the Internet-facing SLB instance.</li>
             * <li><strong>slb_incall_rt</strong>: the response time of the Internet-facing SLB instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cpu</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The metric value as a percentage that triggers the application scale-in next time.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nextScaleInAverageUtilization(Integer nextScaleInAverageUtilization) {
                this.nextScaleInAverageUtilization = nextScaleInAverageUtilization;
                return this;
            }

            /**
             * <p>The metric value as a percentage that triggers the application scale-out next time.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
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
    /**
     * 
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
     */
    public static class MetricsStatus extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentMetrics")
        private java.util.List<CurrentMetrics> currentMetrics;

        @com.aliyun.core.annotation.NameInMap("CurrentReplicas")
        private Long currentReplicas;

        @com.aliyun.core.annotation.NameInMap("DesiredReplicas")
        private Long desiredReplicas;

        @com.aliyun.core.annotation.NameInMap("LastScaleTime")
        private String lastScaleTime;

        @com.aliyun.core.annotation.NameInMap("NextScaleMetrics")
        private java.util.List<NextScaleMetrics> nextScaleMetrics;

        @com.aliyun.core.annotation.NameInMap("NextScaleTimePeriod")
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
        public java.util.List<CurrentMetrics> getCurrentMetrics() {
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
        public java.util.List<NextScaleMetrics> getNextScaleMetrics() {
            return this.nextScaleMetrics;
        }

        /**
         * @return nextScaleTimePeriod
         */
        public Integer getNextScaleTimePeriod() {
            return this.nextScaleTimePeriod;
        }

        public static final class Builder {
            private java.util.List<CurrentMetrics> currentMetrics; 
            private Long currentReplicas; 
            private Long desiredReplicas; 
            private String lastScaleTime; 
            private java.util.List<NextScaleMetrics> nextScaleMetrics; 
            private Integer nextScaleTimePeriod; 

            /**
             * <p>The metrics that is used to trigger the current auto scaling policy.</p>
             */
            public Builder currentMetrics(java.util.List<CurrentMetrics> currentMetrics) {
                this.currentMetrics = currentMetrics;
                return this;
            }

            /**
             * <p>The current number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder currentReplicas(Long currentReplicas) {
                this.currentReplicas = currentReplicas;
                return this;
            }

            /**
             * <p>The expected number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder desiredReplicas(Long desiredReplicas) {
                this.desiredReplicas = desiredReplicas;
                return this;
            }

            /**
             * <p>The time when the auto scaling policy was last triggered.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-11T08:14:32Z</p>
             */
            public Builder lastScaleTime(String lastScaleTime) {
                this.lastScaleTime = lastScaleTime;
                return this;
            }

            /**
             * <p>The metrics that are used to trigger the auto scaling policy next time.</p>
             */
            public Builder nextScaleMetrics(java.util.List<NextScaleMetrics> nextScaleMetrics) {
                this.nextScaleMetrics = nextScaleMetrics;
                return this;
            }

            /**
             * <p>The duration for which the metric-based auto scaling policy takes effect next time.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
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
    /**
     * 
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
     */
    public static class ScaleDownRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("StabilizationWindowSeconds")
        private Long stabilizationWindowSeconds;

        @com.aliyun.core.annotation.NameInMap("Step")
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
             * <p>Indicates whether the application scale-in is disabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: disabled.</li>
             * <li><strong>false</strong>: enabled.</li>
             * </ul>
             * <blockquote>
             * <p> When this parameter is set to true, the application instances are never reduced. This prevents risks to your business in peak hours. By default, this parameter is set to false.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>The cooldown time of the scale-in. Valid values: 0 to 3600. Unit: seconds. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder stabilizationWindowSeconds(Long stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            /**
             * <p>The step size for the scale-in. The maximum number of instances that can be reduced within a specific period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
     */
    public static class ScaleUpRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Disabled")
        private Boolean disabled;

        @com.aliyun.core.annotation.NameInMap("StabilizationWindowSeconds")
        private Long stabilizationWindowSeconds;

        @com.aliyun.core.annotation.NameInMap("Step")
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
             * <p>Indicates whether the application scale-in is disabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The application scale-in is disabled.</li>
             * <li><strong>false</strong>: The application scale-in is enabled.</li>
             * </ul>
             * <blockquote>
             * <p> When this parameter is set to true, the application instances are never reduced. This prevents risks to your business in peak hours. By default, this parameter is set to false.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disabled(Boolean disabled) {
                this.disabled = disabled;
                return this;
            }

            /**
             * <p>The cooldown time of the scale-out. Valid values: 0 to 3600. Unit: seconds. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder stabilizationWindowSeconds(Long stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            /**
             * <p>The step size for the scale-out. The maximum number of instances that can be added within a specific period of time.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
    /**
     * 
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
     */
    public static class Metric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("MetricsStatus")
        private MetricsStatus metricsStatus;

        @com.aliyun.core.annotation.NameInMap("MinReplicas")
        private Integer minReplicas;

        @com.aliyun.core.annotation.NameInMap("ScaleDownRules")
        private ScaleDownRules scaleDownRules;

        @com.aliyun.core.annotation.NameInMap("ScaleUpRules")
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
        public java.util.List<Metrics> getMetrics() {
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
            private java.util.List<Metrics> metrics; 
            private MetricsStatus metricsStatus; 
            private Integer minReplicas; 
            private ScaleDownRules scaleDownRules; 
            private ScaleUpRules scaleUpRules; 

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
             * <p>The list of metrics that are used to trigger the auto scaling policy.</p>
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The execution status of the metric-based auto scaling policy.</p>
             */
            public Builder metricsStatus(MetricsStatus metricsStatus) {
                this.metricsStatus = metricsStatus;
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
             * <p>Rules that determine the application scale-in.</p>
             */
            public Builder scaleDownRules(ScaleDownRules scaleDownRules) {
                this.scaleDownRules = scaleDownRules;
                return this;
            }

            /**
             * <p>Rules that determine the application scale-out.</p>
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
    /**
     * 
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
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
             * <p>2</p>
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
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
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
             * <p>The start date of the validity period of the scheduled auto scaling policy. Valid values:</p>
             * <ul>
             * <li>If both the <strong>BeginDate</strong> and <strong>EndDate</strong> parameters are set to <strong>null</strong>, the auto scaling policy can always be triggered. The default value for these parameters is null.</li>
             * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is <strong>2021-03-25</strong> and <strong>EndDate</strong> is <strong>2021-04-25</strong>, the auto scaling policy is valid for one month.</li>
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
             * <p>The end date of the validity period of the scheduled auto scaling policy. Valid values:</p>
             * <ul>
             * <li>If both the <strong>BeginDate</strong> and <strong>EndDate</strong> parameters are set to <strong>null</strong>, the auto scaling policy can always be triggered. The default value for these parameters is null.</li>
             * <li>If the two parameters are set to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if <strong>BeginDate</strong> is <strong>2021-03-25</strong> and <strong>EndDate</strong> is <strong>2021-04-25</strong>, the auto scaling policy is valid for one month.</li>
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
             * <p>The days on which the scheduled auto scaling policy takes effect. Valid values:</p>
             * <ul>
             * <li><p><strong>* * *</strong>: The scheduled auto scaling policy takes effect at a specified time every day.</p>
             * </li>
             * <li><p><strong>* * Fri,Mon</strong>: The scheduled auto scaling policy takes effect at a specified time on one or multiple days of a week. The specified time is in the GMT+8 time zone. Valid values:</p>
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
             * <li><p><strong>1,2,3,28,31 * *</strong>: The scheduled auto scaling policy takes effect at a specified time on one or multiple days of a month. Valid values: 1 to 31. If the month does not have a 31st day, the auto scaling policy takes effect on the specified days other than the 31st day.</p>
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
             * <p>The points in time when the auto scaling policy is triggered within one day.</p>
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
     * {@link DescribeApplicationScalingRuleResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRuleResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("MinReadyInstanceRatio")
        private Integer minReadyInstanceRatio;

        @com.aliyun.core.annotation.NameInMap("MinReadyInstances")
        private Integer minReadyInstances;

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
            this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
            this.minReadyInstances = builder.minReadyInstances;
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
         * @return minReadyInstanceRatio
         */
        public Integer getMinReadyInstanceRatio() {
            return this.minReadyInstanceRatio;
        }

        /**
         * @return minReadyInstances
         */
        public Integer getMinReadyInstances() {
            return this.minReadyInstances;
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
            private Integer minReadyInstanceRatio; 
            private Integer minReadyInstances; 
            private Boolean scaleRuleEnabled; 
            private String scaleRuleName; 
            private String scaleRuleType; 
            private Timer timer; 
            private Long updateTime; 

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>a0d2e04c-159d-40a8-b240-d2f2c263****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The time when the auto scaling policy was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1624329843790</p>
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
             * MinReadyInstanceRatio.
             */
            public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
                this.minReadyInstanceRatio = minReadyInstanceRatio;
                return this;
            }

            /**
             * MinReadyInstances.
             */
            public Builder minReadyInstances(Integer minReadyInstances) {
                this.minReadyInstances = minReadyInstances;
                return this;
            }

            /**
             * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: enabled</li>
             * <li><strong>false</strong>: disabled</li>
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
             * <li><strong>timing</strong>: the scheduled auto scaling policy.</li>
             * <li><strong>metric</strong>: the metric-based auto scaling policy.</li>
             * <li><strong>mix</strong>: the hybrid auto scaling policy.</li>
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
             * <p>1624330075827</p>
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
