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
 * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApplicationScalingRulesResponseBody</p>
 */
public class DescribeApplicationScalingRulesResponseBody extends TeaModel {
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

    private DescribeApplicationScalingRulesResponseBody(Builder builder) {
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

    public static DescribeApplicationScalingRulesResponseBody create() {
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

        private Builder(DescribeApplicationScalingRulesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.traceId = model.traceId;
        } 

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><p><strong>2xx</strong>: The request was successful.</p>
         * </li>
         * <li><p><strong>3xx</strong>: The request was redirected.</p>
         * </li>
         * <li><p><strong>4xx</strong>: The request was invalid.</p>
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
         * <p>The error code. This parameter is returned only when the request fails.</p>
         * <ul>
         * <li></li>
         * <li><p>For more information, see the <strong>Error codes</strong> section of this topic.</p>
         * </li>
         * </ul>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The response message. Valid values:</p>
         * <ul>
         * <li><p>Returns <strong>success</strong> if the request is successful.</p>
         * </li>
         * <li><p>Returns an error message if the request fails.</p>
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
         * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: The call was successful.</p>
         * </li>
         * <li><p><strong>false</strong>: The call failed.</p>
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
         * <p>The trace ID used to query the details of a request.</p>
         * 
         * <strong>example:</strong>
         * <p>0a98a02315955564772843261e****</p>
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
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
             * <p>The target value for the metric. The unit varies based on the value of <code>MetricType</code>.</p>
             * <ul>
             * <li><p>Target CPU usage, in percent.</p>
             * </li>
             * <li><p>Target memory usage, in percent.</p>
             * </li>
             * <li><p>Target QPS, in queries per second.</p>
             * </li>
             * <li><p>Target response time, in milliseconds.</p>
             * </li>
             * <li><p>Target number of active TCP connections.</p>
             * </li>
             * <li><p>Target QPS of a public-facing SLB instance, in queries per second.</p>
             * </li>
             * <li><p>Target response time of a public-facing SLB instance, in milliseconds.</p>
             * </li>
             * <li><p>Target QPS of a private SLB instance, in queries per second.</p>
             * </li>
             * <li><p>Target response time of a private SLB instance, in milliseconds.</p>
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
             * <p>The metric used to trigger the auto scaling policy. Valid values:</p>
             * <ul>
             * <li><p><strong>CPU</strong>: CPU usage.</p>
             * </li>
             * <li><p><strong>MEMORY</strong>: memory usage.</p>
             * </li>
             * <li><p><strong>QPS</strong>: Average queries per second (QPS) per instance over a 1-minute period. This metric applies to Java applications only.</p>
             * </li>
             * <li><p><strong>RT</strong>: Average response time of all service interfaces in a Java application over a 1-minute period.</p>
             * </li>
             * <li><p><strong>tcpActiveConn</strong>: Average number of active TCP connections per instance over a 30-second period.</p>
             * </li>
             * <li><p><strong>SLB_QPS</strong>: Average QPS per instance for a public-facing SLB instance over a 15-second period.</p>
             * </li>
             * <li><p><strong>SLB_RT</strong>: Average response time of a public-facing SLB instance over a 15-second period.</p>
             * </li>
             * <li><p><strong>INTRANET_SLB_QPS</strong>: Average QPS per instance for a private SLB instance over a 15-second period.</p>
             * </li>
             * <li><p><strong>INTRANET_SLB_RT</strong>: Average response time of a private SLB instance over a 15-second period.</p>
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
             * <p>The Logstore in Log Service that stores SLB access logs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder slbLogstore(String slbLogstore) {
                this.slbLogstore = slbLogstore;
                return this;
            }

            /**
             * <p>The project in Log Service that stores SLB access logs.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder slbProject(String slbProject) {
                this.slbProject = slbProject;
                return this;
            }

            /**
             * <p>The monitored port of the SLB instance.</p>
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
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
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
             * <p>The name of the trigger condition.</p>
             * <ul>
             * <li><p><strong>cpu</strong>: CPU usage.</p>
             * </li>
             * <li><p><strong>memory</strong>: memory usage.</p>
             * </li>
             * <li><p><strong>arms_incall_qps_v2</strong>: QPS of a Java application.</p>
             * </li>
             * <li><p><strong>arms_incall_rt</strong>: Response time of a Java application.</p>
             * </li>
             * <li><p><strong>tcpActiveConn</strong>: The number of active TCP connections.</p>
             * </li>
             * <li><p><strong>slb_incall_qps</strong>: QPS of a public-facing SLB instance.</p>
             * </li>
             * <li><p><strong>slb_incall_rt</strong>: Response time of a public-facing SLB instance.</p>
             * </li>
             * <li><p><strong>intranet_slb_incall_qps</strong>: QPS of a private SLB instance.</p>
             * </li>
             * <li><p><strong>intranet_slb_incall_rt</strong>: Response time of a private SLB instance.</p>
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
             * <p>The data type. This parameter is associated with the specified metric.</p>
             * <ul>
             * <li><p><strong>Resource</strong>: The metric value for <strong>cpu</strong> or <strong>memory</strong>.</p>
             * </li>
             * <li><p><strong>Pods</strong>: The metric value for <strong>tcpActiveConn</strong>.</p>
             * </li>
             * <li><p><strong>External</strong>: The metric value for <strong>arms</strong> or <strong>slb</strong>.</p>
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
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
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
             * <p>The name of the trigger condition.</p>
             * <ul>
             * <li><p><strong>cpu</strong>: CPU usage.</p>
             * </li>
             * <li><p><strong>memory</strong>: memory usage.</p>
             * </li>
             * <li><p><strong>arms_incall_qps_v2</strong>: QPS of a Java application.</p>
             * </li>
             * <li><p><strong>arms_incall_rt</strong>: Response time of a Java application.</p>
             * </li>
             * <li><p><strong>tcpActiveConn</strong>: The number of active TCP connections.</p>
             * </li>
             * <li><p><strong>slb_incall_qps</strong>: QPS of a public-facing SLB instance.</p>
             * </li>
             * <li><p><strong>slb_incall_rt</strong>: Response time of a public-facing SLB instance.</p>
             * </li>
             * <li><p><strong>intranet_slb_incall_qps</strong>: QPS of a private SLB instance.</p>
             * </li>
             * <li><p><strong>intranet_slb_incall_rt</strong>: Response time of a private SLB instance.</p>
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
             * <p>The metric value that triggers the next scale-in event. The value is a percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder nextScaleInAverageUtilization(Integer nextScaleInAverageUtilization) {
                this.nextScaleInAverageUtilization = nextScaleInAverageUtilization;
                return this;
            }

            /**
             * <p>The metric value that triggers the next scale-out event. The value is a percentage.</p>
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
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("MaxReplicas")
        private Long maxReplicas;

        @com.aliyun.core.annotation.NameInMap("MinReplicas")
        private Long minReplicas;

        @com.aliyun.core.annotation.NameInMap("NextScaleMetrics")
        private java.util.List<NextScaleMetrics> nextScaleMetrics;

        @com.aliyun.core.annotation.NameInMap("NextScaleTimePeriod")
        private Integer nextScaleTimePeriod;

        private MetricsStatus(Builder builder) {
            this.currentMetrics = builder.currentMetrics;
            this.currentReplicas = builder.currentReplicas;
            this.desiredReplicas = builder.desiredReplicas;
            this.lastScaleTime = builder.lastScaleTime;
            this.maxReplicas = builder.maxReplicas;
            this.minReplicas = builder.minReplicas;
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
         * @return maxReplicas
         */
        public Long getMaxReplicas() {
            return this.maxReplicas;
        }

        /**
         * @return minReplicas
         */
        public Long getMinReplicas() {
            return this.minReplicas;
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
            private Long maxReplicas; 
            private Long minReplicas; 
            private java.util.List<NextScaleMetrics> nextScaleMetrics; 
            private Integer nextScaleTimePeriod; 

            private Builder() {
            } 

            private Builder(MetricsStatus model) {
                this.currentMetrics = model.currentMetrics;
                this.currentReplicas = model.currentReplicas;
                this.desiredReplicas = model.desiredReplicas;
                this.lastScaleTime = model.lastScaleTime;
                this.maxReplicas = model.maxReplicas;
                this.minReplicas = model.minReplicas;
                this.nextScaleMetrics = model.nextScaleMetrics;
                this.nextScaleTimePeriod = model.nextScaleTimePeriod;
            } 

            /**
             * <p>A list of the current metrics for scaling.</p>
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
             * <p>The maximum number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder maxReplicas(Long maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * <p>The minimum number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReplicas(Long minReplicas) {
                this.minReplicas = minReplicas;
                return this;
            }

            /**
             * <p>A list of metrics for the next scaling activity.</p>
             */
            public Builder nextScaleMetrics(java.util.List<NextScaleMetrics> nextScaleMetrics) {
                this.nextScaleMetrics = nextScaleMetrics;
                return this;
            }

            /**
             * <p>The next period for metric-based scaling.</p>
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
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class PrometheusMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PrometheusQuery")
        private String prometheusQuery;

        @com.aliyun.core.annotation.NameInMap("TargetMetricValue")
        private String targetMetricValue;

        private PrometheusMetrics(Builder builder) {
            this.prometheusQuery = builder.prometheusQuery;
            this.targetMetricValue = builder.targetMetricValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusMetrics create() {
            return builder().build();
        }

        /**
         * @return prometheusQuery
         */
        public String getPrometheusQuery() {
            return this.prometheusQuery;
        }

        /**
         * @return targetMetricValue
         */
        public String getTargetMetricValue() {
            return this.targetMetricValue;
        }

        public static final class Builder {
            private String prometheusQuery; 
            private String targetMetricValue; 

            private Builder() {
            } 

            private Builder(PrometheusMetrics model) {
                this.prometheusQuery = model.prometheusQuery;
                this.targetMetricValue = model.targetMetricValue;
            } 

            /**
             * <p>The Prometheus query.</p>
             */
            public Builder prometheusQuery(String prometheusQuery) {
                this.prometheusQuery = prometheusQuery;
                return this;
            }

            /**
             * <p>The target value for the Prometheus query that triggers a scaling event.</p>
             */
            public Builder targetMetricValue(String targetMetricValue) {
                this.targetMetricValue = targetMetricValue;
                return this;
            }

            public PrometheusMetrics build() {
                return new PrometheusMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
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
             * <p>Specifies whether to disable scale-in. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Disables scale-in.</p>
             * </li>
             * <li><p><strong>false</strong>: Enables scale-in.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>Setting this to <code>true</code> prevents the application from scaling in, which can be useful to avoid service disruptions from unexpected capacity reduction during peak hours. Default: <code>false</code>.</p>
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
             * <p>The cooldown time for scale-in events, in seconds. During this period, no further scaling events are triggered. The value must be an integer from 0 to 3,600. The default value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder stabilizationWindowSeconds(Long stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            /**
             * <p>The number of instances to remove in a single scale-in event.</p>
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
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
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
             * <p>Specifies whether to disable scale-out. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong>: Disables scale-out.</p>
             * </li>
             * <li><p><strong>false</strong>: Enables scale-out.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If this parameter is set to <code>true</code>, application instances are never scaled out. This can be useful to freeze the application capacity during specific events. By default, this parameter is set to <code>false</code>.</p>
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
             * <p>The cooldown time for scale-out events, in seconds. During this period, no further scaling events are triggered. The value must be an integer from 0 to 3,600. The default value is 0.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder stabilizationWindowSeconds(Long stabilizationWindowSeconds) {
                this.stabilizationWindowSeconds = stabilizationWindowSeconds;
                return this;
            }

            /**
             * <p>The number of instances to add in a single scale-out event.</p>
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
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Metric extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxReplicas")
        private Integer maxReplicas;

        @com.aliyun.core.annotation.NameInMap("MetricSource")
        private String metricSource;

        @com.aliyun.core.annotation.NameInMap("Metrics")
        private java.util.List<Metrics> metrics;

        @com.aliyun.core.annotation.NameInMap("MetricsStatus")
        private MetricsStatus metricsStatus;

        @com.aliyun.core.annotation.NameInMap("MinReplicas")
        private Integer minReplicas;

        @com.aliyun.core.annotation.NameInMap("PrometheusMetrics")
        private java.util.List<PrometheusMetrics> prometheusMetrics;

        @com.aliyun.core.annotation.NameInMap("PrometheusToken")
        private String prometheusToken;

        @com.aliyun.core.annotation.NameInMap("PrometheusUrl")
        private String prometheusUrl;

        @com.aliyun.core.annotation.NameInMap("ScaleDownRules")
        private ScaleDownRules scaleDownRules;

        @com.aliyun.core.annotation.NameInMap("ScaleUpRules")
        private ScaleUpRules scaleUpRules;

        private Metric(Builder builder) {
            this.maxReplicas = builder.maxReplicas;
            this.metricSource = builder.metricSource;
            this.metrics = builder.metrics;
            this.metricsStatus = builder.metricsStatus;
            this.minReplicas = builder.minReplicas;
            this.prometheusMetrics = builder.prometheusMetrics;
            this.prometheusToken = builder.prometheusToken;
            this.prometheusUrl = builder.prometheusUrl;
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
         * @return metricSource
         */
        public String getMetricSource() {
            return this.metricSource;
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
         * @return prometheusMetrics
         */
        public java.util.List<PrometheusMetrics> getPrometheusMetrics() {
            return this.prometheusMetrics;
        }

        /**
         * @return prometheusToken
         */
        public String getPrometheusToken() {
            return this.prometheusToken;
        }

        /**
         * @return prometheusUrl
         */
        public String getPrometheusUrl() {
            return this.prometheusUrl;
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
            private String metricSource; 
            private java.util.List<Metrics> metrics; 
            private MetricsStatus metricsStatus; 
            private Integer minReplicas; 
            private java.util.List<PrometheusMetrics> prometheusMetrics; 
            private String prometheusToken; 
            private String prometheusUrl; 
            private ScaleDownRules scaleDownRules; 
            private ScaleUpRules scaleUpRules; 

            private Builder() {
            } 

            private Builder(Metric model) {
                this.maxReplicas = model.maxReplicas;
                this.metricSource = model.metricSource;
                this.metrics = model.metrics;
                this.metricsStatus = model.metricsStatus;
                this.minReplicas = model.minReplicas;
                this.prometheusMetrics = model.prometheusMetrics;
                this.prometheusToken = model.prometheusToken;
                this.prometheusUrl = model.prometheusUrl;
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
             * <p>The source of the metrics.</p>
             */
            public Builder metricSource(String metricSource) {
                this.metricSource = metricSource;
                return this;
            }

            /**
             * <p>The metric-based conditions that trigger scaling.</p>
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
             * <p>The Prometheus metrics.</p>
             */
            public Builder prometheusMetrics(java.util.List<PrometheusMetrics> prometheusMetrics) {
                this.prometheusMetrics = prometheusMetrics;
                return this;
            }

            /**
             * <p>The Prometheus token.</p>
             */
            public Builder prometheusToken(String prometheusToken) {
                this.prometheusToken = prometheusToken;
                return this;
            }

            /**
             * <p>The endpoint of the Prometheus service.</p>
             */
            public Builder prometheusUrl(String prometheusUrl) {
                this.prometheusUrl = prometheusUrl;
                return this;
            }

            /**
             * <p>Configuration for scale-in events.</p>
             */
            public Builder scaleDownRules(ScaleDownRules scaleDownRules) {
                this.scaleDownRules = scaleDownRules;
                return this;
            }

            /**
             * <p>Configuration for scale-out events.</p>
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
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Schedules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AtTime")
        private String atTime;

        @com.aliyun.core.annotation.NameInMap("MaxReplicas")
        private Long maxReplicas;

        @com.aliyun.core.annotation.NameInMap("MinReplicas")
        private Long minReplicas;

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
        public Long getMaxReplicas() {
            return this.maxReplicas;
        }

        /**
         * @return minReplicas
         */
        public Long getMinReplicas() {
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
            private Long maxReplicas; 
            private Long minReplicas; 
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
             * <p>The trigger time in <code>HH:mm</code> format.</p>
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
             * <p>50</p>
             */
            public Builder maxReplicas(Long maxReplicas) {
                this.maxReplicas = maxReplicas;
                return this;
            }

            /**
             * <p>The minimum number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder minReplicas(Long minReplicas) {
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
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private Timer(Builder builder) {
            this.beginDate = builder.beginDate;
            this.endDate = builder.endDate;
            this.period = builder.period;
            this.schedules = builder.schedules;
            this.timeZone = builder.timeZone;
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

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String beginDate; 
            private String endDate; 
            private String period; 
            private java.util.List<Schedules> schedules; 
            private String timeZone; 

            private Builder() {
            } 

            private Builder(Timer model) {
                this.beginDate = model.beginDate;
                this.endDate = model.endDate;
                this.period = model.period;
                this.schedules = model.schedules;
                this.timeZone = model.timeZone;
            } 

            /**
             * <p>The start date of the short-term scheduled scaling policy. The following rules apply:</p>
             * <ul>
             * <li><p>If <strong>BeginDate</strong> and <strong>EndDate</strong> are not specified, the policy is long-term by default.</p>
             * </li>
             * <li><p>If you specify a <code>BeginDate</code> and an <code>EndDate</code>, the policy is short-term and applies only within that date range.</p>
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
             * <p>The end date of the short-term scheduled scaling policy. The following rules apply:</p>
             * <ul>
             * <li><p>If <strong>BeginDate</strong> and <strong>EndDate</strong> are not specified, the policy is long-term by default.</p>
             * </li>
             * <li><p>If you specify a <code>BeginDate</code> and an <code>EndDate</code>, the policy is short-term and applies only within that date range.</p>
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
             * <p>The days on which the scheduled scaling policy runs. Valid values:</p>
             * <ul>
             * <li><p><em><em>\</em> \</em> \***: The policy is executed at a specified time every day.</p>
             * </li>
             * <li><p><em><em>\</em> \</em> Fri,Mon**: Executes the policy on specified days of the week. The time zone is GMT+8. Valid days are listed below:</p>
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
             * <li><p><em><em>1,2,3,28,31 \</em> \</em>**: Executes the policy on specified days of the month (1-31). If a specified day does not exist in a given month (e.g., the 31st), the policy does not run on that day.</p>
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
             * <p>The daily trigger schedule for the policy.</p>
             */
            public Builder schedules(java.util.List<Schedules> schedules) {
                this.schedules = schedules;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public Timer build() {
                return new Timer(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class ApplicationScalingRules extends TeaModel {
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

        private ApplicationScalingRules(Builder builder) {
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

        public static ApplicationScalingRules create() {
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

            private Builder(ApplicationScalingRules model) {
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
             * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The timestamp of the policy\&quot;s creation, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616642248938</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The timestamp of when the policy was last disabled.</p>
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
             * <p>The minimum number of available instances, specified as a percentage. Valid values:</p>
             * <ul>
             * <li><p><strong>-1</strong>: Indicates that this parameter is not used.</p>
             * </li>
             * <li><p><strong>0 to 100</strong>: a percentage that is rounded up to the nearest integer. For example, if you set this parameter to 50% and you have five instances, the minimum number of available instances is 3.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If you specify both <strong>MinReadyInstances</strong> and <strong>MinReadyInstanceRatio</strong>, the value of <strong>MinReadyInstanceRatio</strong> takes precedence, unless it is set to <strong>-1</strong>.</p>
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
             * <p>The minimum number of available instances. Valid values:</p>
             * <ul>
             * <li><p>If you set this parameter to <strong>0</strong>, the application may be interrupted during an upgrade.</p>
             * </li>
             * <li><p>If you set this parameter to <strong>-1</strong>, a recommended value is used, which is 25% of the current number of instances, rounded up to the nearest integer. For example, if an application has five instances, the minimum number of available instances is 2 (5 \* 25% = 1.25, rounded up).</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>To ensure business continuity during a rolling deployment, we recommend that you set this parameter to a value greater than or equal to 1.</p>
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
             * <li><p><strong>timing</strong>: A scheduled scaling policy.</p>
             * </li>
             * <li><p><strong>metric</strong>: A metric-based scaling policy.</p>
             * </li>
             * <li><p><strong>mix</strong>: A hybrid scaling policy.</p>
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
             * <p>The timestamp of the last policy update, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1616642248938</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public ApplicationScalingRules build() {
                return new ApplicationScalingRules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeApplicationScalingRulesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApplicationScalingRulesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationScalingRules")
        private java.util.List<ApplicationScalingRules> applicationScalingRules;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private Data(Builder builder) {
            this.applicationScalingRules = builder.applicationScalingRules;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return applicationScalingRules
         */
        public java.util.List<ApplicationScalingRules> getApplicationScalingRules() {
            return this.applicationScalingRules;
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
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private java.util.List<ApplicationScalingRules> applicationScalingRules; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.applicationScalingRules = model.applicationScalingRules;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>A list of auto scaling policies for the application.</p>
             */
            public Builder applicationScalingRules(java.util.List<ApplicationScalingRules> applicationScalingRules) {
                this.applicationScalingRules = applicationScalingRules;
                return this;
            }

            /**
             * <p>The current page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of auto scaling policies for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
