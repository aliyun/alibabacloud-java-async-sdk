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

        private Builder(DescribeApplicationScalingRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code or a POP error code. Valid values:</p>
         * <ul>
         * <li><p><strong>2xx</strong>: The operation is successful.</p>
         * </li>
         * <li><p><strong>3xx</strong>: A redirection is required.</p>
         * </li>
         * <li><p><strong>4xx</strong>: A request error occurred.</p>
         * </li>
         * <li><p><strong>5xx</strong>: A server error occurred.</p>
         * </li>
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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. Valid values:</p>
         * <ul>
         * <li><p>If the request is successful, the <strong>ErrorCode</strong> field is not returned.</p>
         * </li>
         * <li><p>If the request fails, the <strong>ErrorCode</strong> field is returned. For more information, see the <strong>Error codes</strong> section in this topic.</p>
         * </li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The additional information. Valid values:</p>
         * <ul>
         * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
         * </li>
         * <li><p>If the request fails, a specific error code is returned.</p>
         * </li>
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
         * <p>73404D3D-EE4F-4CB2-B197-5C46F6A1****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the application instance was successfully restarted.</p>
         * <ul>
         * <li><p><strong>true</strong>: The restart succeeded.</p>
         * </li>
         * <li><p><strong>false</strong>: The restart failed.</p>
         * </li>
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
         * <p>The trace ID. Use this ID to query the details of a request.</p>
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
             * <p>The target value of the metric.</p>
             * <ul>
             * <li><p>The target CPU utilization. Unit: percent.</p>
             * </li>
             * <li><p>The target memory usage. Unit: percent.</p>
             * </li>
             * <li><p>The number of queries per second (QPS).</p>
             * </li>
             * <li><p>The response time. Unit: milliseconds.</p>
             * </li>
             * <li><p>The average number of active TCP connections per second.</p>
             * </li>
             * <li><p>The QPS of a public-facing SLB instance.</p>
             * </li>
             * <li><p>The response time of a public-facing SLB instance. Unit: milliseconds.</p>
             * </li>
             * <li><p>The QPS of a private SLB instance.</p>
             * </li>
             * <li><p>The response time of a private SLB instance. Unit: milliseconds.</p>
             * </li>
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
             * <li><p><strong>CPU</strong>: CPU utilization.</p>
             * </li>
             * <li><p><strong>MEMORY</strong>: memory usage.</p>
             * </li>
             * <li><p><strong>QPS</strong>: the average QPS of a single instance of a Java application in one minute.</p>
             * </li>
             * <li><p><strong>RT</strong>: the average response time (RT) of all service interfaces of a Java application in one minute.</p>
             * </li>
             * <li><p><strong>tcpActiveConn</strong>: the average number of active TCP connections of a single instance in 30 seconds.</p>
             * </li>
             * <li><p><strong>SLB_QPS</strong>: the average QPS of a single instance for a public-facing SLB instance in 15 seconds.</p>
             * </li>
             * <li><p><strong>SLB_RT</strong>: the average RT of a public-facing SLB instance in 15 seconds.</p>
             * </li>
             * <li><p><strong>INTRANET_SLB_QPS</strong>: the average QPS of a single instance for a private SLB instance in 15 seconds.</p>
             * </li>
             * <li><p><strong>INTRANET_SLB_RT</strong>: the average RT of a private SLB instance in 15 seconds.</p>
             * </li>
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
             * <p>The ID of the SLB instance.</p>
             * 
             * <strong>example:</strong>
             * <p>lb-xxx</p>
             */
            public Builder slbId(String slbId) {
                this.slbId = slbId;
                return this;
            }

            /**
             * <p>The SLB access log Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder slbLogstore(String slbLogstore) {
                this.slbLogstore = slbLogstore;
                return this;
            }

            /**
             * <p>The SLB access log Project.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder slbProject(String slbProject) {
                this.slbProject = slbProject;
                return this;
            }

            /**
             * <p>The port of the SLB instance.</p>
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

            private Builder() {
            } 

            private Builder(CurrentMetrics model) {
                this.currentValue = model.currentValue;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The current value.</p>
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
             * <li><p><strong>cpu</strong>: CPU utilization.</p>
             * </li>
             * <li><p><strong>memory</strong>: memory usage.</p>
             * </li>
             * <li><p><strong>arms_incall_qps</strong>: the average QPS of a single instance of a Java application in one minute.</p>
             * </li>
             * <li><p><strong>arms_incall_rt</strong>: the average RT of all service interfaces of a Java application in one minute.</p>
             * </li>
             * <li><p><strong>tcpActiveConn</strong>: the number of active TCP connections.</p>
             * </li>
             * <li><p><strong>slb_incall_qps</strong>: the QPS of a public-facing SLB instance.</p>
             * </li>
             * <li><p><strong>slb_incall_rt</strong>: the RT of a public-facing SLB instance.</p>
             * </li>
             * <li><p><strong>intranet_slb_incall_qps</strong>: the QPS of a private SLB instance.</p>
             * </li>
             * <li><p><strong>intranet_slb_incall_rt</strong>: the RT of a private SLB instance.</p>
             * </li>
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
             * <p>The type of the metric. This parameter is associated with the monitoring metric.</p>
             * <ul>
             * <li><p><strong>Resource</strong>: the metric value of <strong>cpu</strong> or <strong>memory</strong>.</p>
             * </li>
             * <li><p><strong>Pods</strong>: the metric value of <strong>tcpActiveConn</strong>.</p>
             * </li>
             * <li><p><strong>External</strong>: the metric value of <strong>arms</strong> or <strong>slb</strong>.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(NextScaleMetrics model) {
                this.name = model.name;
                this.nextScaleInAverageUtilization = model.nextScaleInAverageUtilization;
                this.nextScaleOutAverageUtilization = model.nextScaleOutAverageUtilization;
            } 

            /**
             * <p>The name of the metric.</p>
             * <ul>
             * <li><p><strong>cpu</strong>: CPU utilization.</p>
             * </li>
             * <li><p><strong>memory</strong>: memory usage.</p>
             * </li>
             * <li><p><strong>arms_incall_qps</strong>: the average QPS of a single instance of a Java application in one minute.</p>
             * </li>
             * <li><p><strong>arms_incall_rt</strong>: the average RT of all service interfaces of a Java application in one minute.</p>
             * </li>
             * <li><p><strong>tcpActiveConn</strong>: the number of active TCP connections.</p>
             * </li>
             * <li><p><strong>slb_incall_qps</strong>: the QPS of a public-facing SLB instance.</p>
             * </li>
             * <li><p><strong>slb_incall_rt</strong>: the RT of a public-facing SLB instance.</p>
             * </li>
             * <li><p><strong>intranet_slb_incall_qps</strong>: the QPS of a private SLB instance.</p>
             * </li>
             * <li><p><strong>intranet_slb_incall_rt</strong>: the RT of a private SLB instance.</p>
             * </li>
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
             * <p>The metric threshold for the next scale-in. The value is a percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nextScaleInAverageUtilization(Integer nextScaleInAverageUtilization) {
                this.nextScaleInAverageUtilization = nextScaleInAverageUtilization;
                return this;
            }

            /**
             * <p>The metric threshold for the next scale-out. The value is a percentage.</p>
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

            private Builder() {
            } 

            private Builder(MetricsStatus model) {
                this.currentMetrics = model.currentMetrics;
                this.currentReplicas = model.currentReplicas;
                this.desiredReplicas = model.desiredReplicas;
                this.lastScaleTime = model.lastScaleTime;
                this.nextScaleMetrics = model.nextScaleMetrics;
                this.nextScaleTimePeriod = model.nextScaleTimePeriod;
            } 

            /**
             * <p>The data of the current metric-based scaling.</p>
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
             * <p>The target number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder desiredReplicas(Long desiredReplicas) {
                this.desiredReplicas = desiredReplicas;
                return this;
            }

            /**
             * <p>The time of the last scaling activity.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-11T08:14:32Z</p>
             */
            public Builder lastScaleTime(String lastScaleTime) {
                this.lastScaleTime = lastScaleTime;
                return this;
            }

            /**
             * <p>The list of metrics for the next scaling activity.</p>
             */
            public Builder nextScaleMetrics(java.util.List<NextScaleMetrics> nextScaleMetrics) {
                this.nextScaleMetrics = nextScaleMetrics;
                return this;
            }

            /**
             * <p>The period of the next metric-based scaling.</p>
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

            private Builder() {
            } 

            private Builder(ScaleDownRules model) {
                this.disabled = model.disabled;
                this.stabilizationWindowSeconds = model.stabilizationWindowSeconds;
                this.step = model.step;
            } 

            /**
             * <p>Indicates whether scale-in is disabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: disabled.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If you enable this feature, the application is never scaled in. This prevents business risks that are caused by scale-ins during peak hours. By default, this feature is disabled.</p>
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
             * <p>The cooldown period for scale-ins. The value can be an integer from 0 to 3600. Unit: seconds. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder stabilizationWindowSeconds(Long stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            /**
             * <p>The scaling step size for scale-ins. The maximum number of instances that can be removed at a time.</p>
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

            private Builder() {
            } 

            private Builder(ScaleUpRules model) {
                this.disabled = model.disabled;
                this.stabilizationWindowSeconds = model.stabilizationWindowSeconds;
                this.step = model.step;
            } 

            /**
             * <p>Indicates whether scale-in is disabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: disabled.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If you enable this feature, the application is never scaled in. This prevents business risks that are caused by scale-ins during peak hours. By default, this feature is disabled.</p>
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
             * <p>The cooldown period for scale-outs. The value can be an integer from 0 to 3600. Unit: seconds. Default value: 0.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder stabilizationWindowSeconds(Long stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            /**
             * <p>The scaling step size for scale-outs. The maximum number of instances that can be added at a time.</p>
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

            private Builder() {
            } 

            private Builder(Metric model) {
                this.maxReplicas = model.maxReplicas;
                this.metrics = model.metrics;
                this.metricsStatus = model.metricsStatus;
                this.minReplicas = model.minReplicas;
                this.scaleDownRules = model.scaleDownRules;
                this.scaleUpRules = model.scaleUpRules;
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
             * <p>The list of metric-based scaling policies.</p>
             */
            public Builder metrics(java.util.List<Metrics> metrics) {
                this.metrics = metrics;
                return this;
            }

            /**
             * <p>The status of the metric-based scaling policy.</p>
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
             * <p>The scale-in rules.</p>
             */
            public Builder scaleDownRules(ScaleDownRules scaleDownRules) {
                this.scaleDownRules = scaleDownRules;
                return this;
            }

            /**
             * <p>The scale-out rules.</p>
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

            private Builder() {
            } 

            private Builder(Schedules model) {
                this.atTime = model.atTime;
                this.maxReplicas = model.maxReplicas;
                this.minReplicas = model.minReplicas;
                this.targetReplicas = model.targetReplicas;
            } 

            /**
             * <p>The point in time. Format: <strong>HH:mm</strong>.</p>
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
             * <p>1</p>
             */
            public Builder minReplicas(Integer minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * <p>The target number of instances.</p>
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

            private Builder() {
            } 

            private Builder(Timer model) {
                this.beginDate = model.beginDate;
                this.endDate = model.endDate;
                this.period = model.period;
                this.schedules = model.schedules;
            } 

            /**
             * <p>The start date of a short-term scheduled scaling policy. The following list describes the valid values:</p>
             * <ul>
             * <li><p>If you leave both <strong>BeginDate</strong> and <strong>EndDate</strong> empty, the policy is a long-term policy. This is the default value.</p>
             * </li>
             * <li><p>If you specify a date, for example, you set <strong>BeginDate</strong> to <strong>2021-03-25</strong> and <strong>EndDate</strong> to <strong>2021-04-25</strong>, the policy is effective for one month.</p>
             * </li>
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
             * <p>The end date of a short-term scheduled scaling policy. The following list describes the valid values:</p>
             * <ul>
             * <li><p>If you leave both <strong>BeginDate</strong> and <strong>EndDate</strong> empty, the policy is a long-term policy. This is the default value.</p>
             * </li>
             * <li><p>If you specify a date, for example, you set <strong>BeginDate</strong> to <strong>2021-03-25</strong> and <strong>EndDate</strong> to <strong>2021-04-25</strong>, the policy is effective for one month.</p>
             * </li>
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
             * <p>The period in which the scheduled scaling policy is executed. Valid values:</p>
             * <ul>
             * <li><p><em><em>\</em> \</em> \***: The policy is executed at a specified time every day.</p>
             * </li>
             * <li><p><em><em>\</em> \</em> Fri,Mon**: The policy is executed at a specified time on one or more days of a week. You can select multiple days. The time is in GMT+8. Valid values:</p>
             * <ul>
             * <li><p><strong>Sun</strong>: Sunday</p>
             * </li>
             * <li><p><strong>Mon</strong>: Monday</p>
             * </li>
             * <li><p><strong>Tue</strong>: Tuesday</p>
             * </li>
             * <li><p><strong>Wed</strong>: Wednesday</p>
             * </li>
             * <li><p><strong>Thu</strong>: Thursday</p>
             * </li>
             * <li><p><strong>Fri</strong>: Friday</p>
             * </li>
             * <li><p><strong>Sat</strong>: Saturday</p>
             * </li>
             * </ul>
             * </li>
             * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: The policy is executed at a specified time on one or more days of a month. You can select multiple days. The value can be an integer from 1 to 31. If a month does not have a 31st day, the policy is not executed on that day.</p>
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
             * <p>The points in time when the auto scaling policy is triggered within a day.</p>
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
            private Long lastDisableTime; 
            private Metric metric; 
            private Integer minReadyInstanceRatio; 
            private Integer minReadyInstances; 
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
                this.lastDisableTime = model.lastDisableTime;
                this.metric = model.metric;
                this.minReadyInstanceRatio = model.minReadyInstanceRatio;
                this.minReadyInstances = model.minReadyInstances;
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
             * <p>The metric-based scaling policy.</p>
             */
            public Builder metric(Metric metric) {
                this.metric = metric;
                return this;
            }

            /**
             * <p>The percentage of the minimum number of ready instances. Valid values:</p>
             * <ul>
             * <li><p><strong>-1</strong>: an initial value, which indicates that a percentage is not used.</p>
             * </li>
             * <li><p><strong>0 to 100</strong>: a percentage that is rounded up. For example, if you set this parameter to 50% and the current number of instances is 5, the minimum number of ready instances is 3.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If you specify both MinReadyInstances and MinReadyInstanceRatio, and the value of <strong>MinReadyInstanceRatio</strong> is not <strong>-1</strong>, the value of <strong>MinReadyInstanceRatio</strong> prevails. For example, if <strong>MinReadyInstances</strong> is set to <strong>5</strong> and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the value <strong>50</strong> is used to calculate the minimum number of ready instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
                this.minReadyInstanceRatio = minReadyInstanceRatio;
                return this;
            }

            /**
             * <p>The minimum number of ready instances. Valid values:</p>
             * <ul>
             * <li><p>If you set this parameter to <strong>0</strong>, the application is interrupted during an upgrade.</p>
             * </li>
             * <li><p>If you set this parameter to -1, the system uses a recommended value for the minimum number of ready instances. The value is 25% of the current number of instances. For example, if the current number of instances is 5, the minimum number of ready instances is 2 after 5 × 25% = 1.25 is rounded up.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>Set the minimum number of ready instances to a value greater than or equal to 1 for each rolling deployment to ensure business continuity.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReadyInstances(Integer minReadyInstances) {
                this.minReadyInstances = minReadyInstances;
                return this;
            }

            /**
             * <p>Indicates whether the auto scaling policy is enabled. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: The policy is enabled.</p>
             * </li>
             * <li><p><strong>false</strong>: The policy is disabled.</p>
             * </li>
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
             * <li><p><strong>timing</strong>: scheduled scaling.</p>
             * </li>
             * <li><p><strong>metric</strong>: metric-based scaling.</p>
             * </li>
             * <li><p><strong>mix</strong>: hybrid scaling.</p>
             * </li>
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
             * <p>The scheduled scaling policy.</p>
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
