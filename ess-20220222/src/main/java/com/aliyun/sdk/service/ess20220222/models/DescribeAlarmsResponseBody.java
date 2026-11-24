// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
 * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmsResponseBody</p>
 */
public class DescribeAlarmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmList")
    private java.util.List<AlarmList> alarmList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAlarmsResponseBody(Builder builder) {
        this.alarmList = builder.alarmList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlarmsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmList
     */
    public java.util.List<AlarmList> getAlarmList() {
        return this.alarmList;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AlarmList> alarmList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAlarmsResponseBody model) {
            this.alarmList = model.alarmList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of event-triggered tasks.</p>
         */
        public Builder alarmList(java.util.List<AlarmList> alarmList) {
            this.alarmList = alarmList;
            return this;
        }

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>871C7C53-34A4-45AA-8C14-4B72FA6A****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of event-triggered tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAlarmsResponseBody build() {
            return new DescribeAlarmsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DimensionKey")
        private String dimensionKey;

        @com.aliyun.core.annotation.NameInMap("DimensionValue")
        private String dimensionValue;

        private Dimensions(Builder builder) {
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValue = builder.dimensionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return dimensionKey
         */
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        /**
         * @return dimensionValue
         */
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public static final class Builder {
            private String dimensionKey; 
            private String dimensionValue; 

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.dimensionKey = model.dimensionKey;
                this.dimensionValue = model.dimensionValue;
            } 

            /**
             * <p>The key of the dimension associated with the metric. Valid values:</p>
             * <ul>
             * <li>user_id: the ID of your account.</li>
             * <li>scaling_group: the monitored scaling group.</li>
             * <li>device: the type of the NIC device.</li>
             * <li>state: the state of the TCP connection.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>device</p>
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * <p>The value of the dimension associated with the metric. The valid values vary based on the dimension key.</p>
             * <ul>
             * <li><p><code>user_id</code>: automatically populated by the system.</p>
             * </li>
             * <li><p><code>scaling_group</code>: automatically populated by the system.</p>
             * </li>
             * <li><p>Valid values for <code>device</code>:</p>
             * <ul>
             * <li>eth0: For classic network instances, eth0 represents the internal NIC. For VPC-connected instances, only the eth0 NIC exists.</li>
             * <li>eth1: For classic network instances, eth1 represents the public NIC.</li>
             * </ul>
             * </li>
             * <li><p>Valid values for <code>state</code>:</p>
             * <ul>
             * <li>TCP_TOTAL: the total number of TCP connections.</li>
             * <li>ESTABLISHED: the number of established TCP connections.</li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>eth0</p>
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class Expressions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        private Expressions(Builder builder) {
            this.comparisonOperator = builder.comparisonOperator;
            this.metricName = builder.metricName;
            this.period = builder.period;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Expressions create() {
            return builder().build();
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private String comparisonOperator; 
            private String metricName; 
            private Integer period; 
            private String statistics; 
            private Float threshold; 

            private Builder() {
            } 

            private Builder(Expressions model) {
                this.comparisonOperator = model.comparisonOperator;
                this.metricName = model.metricName;
                this.period = model.period;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The comparison operator used to compare the metric value with the threshold in the multi-metric alert rule. Valid values:</p>
             * <ul>
             * <li><blockquote>
             * <p>=: The metric value is greater than or equal to the threshold.</p>
             * </blockquote>
             * </li>
             * <li>&lt;=: The metric value is less than or equal to the threshold.</li>
             * <li><blockquote>
             * <p>: The metric value is greater than the threshold.</p>
             * </blockquote>
             * </li>
             * <li>&lt;: The metric value is less than the threshold.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * <p>=</p>
             * </blockquote>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The name of the monitoring metrics in the multi-metric alert rule. Valid values: </p>
             * <ul>
             * <li>CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</li>
             * <li>ConcurrentConnections: the number of concurrent connections to an ECS instance.</li>
             * <li>IntranetTx: the outbound internal network traffic of an ECS instance. Unit: Kbit/min.</li>
             * <li>IntranetRx: the inbound internal network traffic of an ECS instance. Unit: Kbit/min.</li>
             * <li>VpcInternetTx: the outbound Internet traffic of an ECS instance. Unit: Kbit/min.</li>
             * <li>VpcInternetRx: the inbound Internet traffic of an ECS instance. Unit: Kbit/min.</li>
             * <li>SystemDiskReadBps: the number of bytes read from the system cloud disk per second. Unit: Byte/s.</li>
             * <li>SystemDiskWriteBps: the number of bytes written to the system cloud disk per second. Unit: Byte/s.</li>
             * <li>SystemDiskReadOps: the number of read operations on the system cloud disk per second. Unit: IOPS.</li>
             * <li>SystemDiskWriteOps: the number of write operations on the system cloud disk per second. Unit: IOPS.</li>
             * <li>CpuUtilizationAgent: the CPU utilization collected by the CloudMonitor agent. Unit: %.</li>
             * <li>GpuUtilizationAgent: the GPU utilization collected by the CloudMonitor agent. Unit: %.</li>
             * <li>GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory collected by the CloudMonitor agent. Unit: %.</li>
             * <li>GpuMemoryUtilizationAgent: the GPU memory utilization collected by the CloudMonitor agent. Unit: %.</li>
             * <li>MemoryUtilization: the memory utilization collected by the CloudMonitor agent. Unit: %.</li>
             * <li>LoadAverage: the average system load collected by the CloudMonitor agent.</li>
             * <li>TcpConnection: the total number of TCP connections collected by the CloudMonitor agent.</li>
             * <li>TcpConnection: the number of established TCP connections collected by the CloudMonitor agent.</li>
             * <li>PackagesNetOut: the number of packets sent by the internal network interface controller (NIC) per second collected by the CloudMonitor agent. Unit: packets/s.</li>
             * <li>PackagesNetIn: the number of packets received by the internal network interface controller (NIC) per second collected by the CloudMonitor agent. Unit: packets/s.</li>
             * <li>PackagesNetOut: the number of packets sent by the public network interface controller (NIC) per second collected by the CloudMonitor agent. Unit: packets/s.</li>
             * <li>PackagesNetIn: the number of packets received by the public network interface controller (NIC) per second collected by the CloudMonitor agent. Unit: packets/s.</li>
             * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
             * <li>EciPodMemoryUtilization: the memory utilization. Unit: %.</li>
             * <li>LoadBalancerRealServerAverageQps: the average QPS per backend server in an ALB server group. Unit: queries/s.</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered nodes for system monitoring</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CpuUtilization</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The period at which metric data is collected in the multi-metric alert rule. Unit: seconds. Valid values:</p>
             * <ul>
             * <li>15</li>
             * <li>60</li>
             * <li>120</li>
             * <li>300</li>
             * <li>900</li>
             * </ul>
             * <blockquote>
             * <p>A statistical period of 15 seconds is supported only when you monitor a scaling group that contains ECS instances and use metrics collected by the CloudMonitor agent (metrics whose names start with Agent).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The statistical method used for metric data in the multi-metric alert rule. Valid values:</p>
             * <ul>
             * <li>Average: the average value.</li>
             * <li>Minimum: the minimum value.</li>
             * <li>Maximum: the maximum value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold of the monitoring metrics in the multi-metric alert rule. The scaling rule is triggered when the threshold expression is met for the specified number of times.</p>
             * 
             * <strong>example:</strong>
             * <p>40.0</p>
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public Expressions build() {
                return new Expressions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class HybridMetricsDimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DimensionKey")
        private String dimensionKey;

        @com.aliyun.core.annotation.NameInMap("DimensionValue")
        private String dimensionValue;

        private HybridMetricsDimensions(Builder builder) {
            this.dimensionKey = builder.dimensionKey;
            this.dimensionValue = builder.dimensionValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HybridMetricsDimensions create() {
            return builder().build();
        }

        /**
         * @return dimensionKey
         */
        public String getDimensionKey() {
            return this.dimensionKey;
        }

        /**
         * @return dimensionValue
         */
        public String getDimensionValue() {
            return this.dimensionValue;
        }

        public static final class Builder {
            private String dimensionKey; 
            private String dimensionValue; 

            private Builder() {
            } 

            private Builder(HybridMetricsDimensions model) {
                this.dimensionKey = model.dimensionKey;
                this.dimensionValue = model.dimensionValue;
            } 

            /**
             * <p>The key of the metric dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>queue</p>
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * <p>The value of the metric dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>testQueue</p>
             */
            public Builder dimensionValue(String dimensionValue) {
                this.dimensionValue = dimensionValue;
                return this;
            }

            public HybridMetricsDimensions build() {
                return new HybridMetricsDimensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class HybridMetrics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<HybridMetricsDimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Statistic")
        private String statistic;

        private HybridMetrics(Builder builder) {
            this.dimensions = builder.dimensions;
            this.expression = builder.expression;
            this.id = builder.id;
            this.metricName = builder.metricName;
            this.statistic = builder.statistic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HybridMetrics create() {
            return builder().build();
        }

        /**
         * @return dimensions
         */
        public java.util.List<HybridMetricsDimensions> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return statistic
         */
        public String getStatistic() {
            return this.statistic;
        }

        public static final class Builder {
            private java.util.List<HybridMetricsDimensions> dimensions; 
            private String expression; 
            private String id; 
            private String metricName; 
            private String statistic; 

            private Builder() {
            } 

            private Builder(HybridMetrics model) {
                this.dimensions = model.dimensions;
                this.expression = model.expression;
                this.id = model.id;
                this.metricName = model.metricName;
                this.statistic = model.statistic;
            } 

            /**
             * <p>The dimensions of the metric. This is used to specify the resources monitored by the metric.</p>
             */
            public Builder dimensions(java.util.List<HybridMetricsDimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The metric calculation expression for multiple Hybrid Cloud Monitoring metrics. The calculation result of the expression is used to trigger scaling activities. The calculation expression must comply with the Reverse Polish Notation (RPN) specification, and only the <code>+</code>, <code>-</code>, <code>*</code>, and <code>/</code> operators are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>(a+b)/2</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The reference ID of the metric in the metric calculation expression.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the monitoring metrics in the Hybrid Cloud Monitoring metrics repository.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunSmq_NumberOfMessagesVisible</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The statistical method of the metric. Valid values:</p>
             * <ul>
             * <li>Average: the average value of all data points in the specified period.</li>
             * <li>Minimum: the minimum value of all data points in the specified period.</li>
             * <li>Maximum: the maximum value of all data points in the specified period.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistic(String statistic) {
                this.statistic = statistic;
                return this;
            }

            public HybridMetrics build() {
                return new HybridMetrics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAlarmsResponseBody</p>
     */
    public static class AlarmList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmActions")
        private java.util.List<String> alarmActions;

        @com.aliyun.core.annotation.NameInMap("AlarmTaskId")
        private String alarmTaskId;

        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List<Dimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("Effective")
        private String effective;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @com.aliyun.core.annotation.NameInMap("Expressions")
        private java.util.List<Expressions> expressions;

        @com.aliyun.core.annotation.NameInMap("ExpressionsLogicOperator")
        private String expressionsLogicOperator;

        @com.aliyun.core.annotation.NameInMap("HybridMetrics")
        private java.util.List<HybridMetrics> hybridMetrics;

        @com.aliyun.core.annotation.NameInMap("HybridMonitorNamespace")
        private String hybridMonitorNamespace;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

        @com.aliyun.core.annotation.NameInMap("PromQL")
        private String promQL;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Statistics")
        private String statistics;

        @com.aliyun.core.annotation.NameInMap("Threshold")
        private Float threshold;

        private AlarmList(Builder builder) {
            this.alarmActions = builder.alarmActions;
            this.alarmTaskId = builder.alarmTaskId;
            this.comparisonOperator = builder.comparisonOperator;
            this.description = builder.description;
            this.dimensions = builder.dimensions;
            this.effective = builder.effective;
            this.enable = builder.enable;
            this.evaluationCount = builder.evaluationCount;
            this.expressions = builder.expressions;
            this.expressionsLogicOperator = builder.expressionsLogicOperator;
            this.hybridMetrics = builder.hybridMetrics;
            this.hybridMonitorNamespace = builder.hybridMonitorNamespace;
            this.metricName = builder.metricName;
            this.metricType = builder.metricType;
            this.name = builder.name;
            this.period = builder.period;
            this.promQL = builder.promQL;
            this.scalingGroupId = builder.scalingGroupId;
            this.state = builder.state;
            this.statistics = builder.statistics;
            this.threshold = builder.threshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmList create() {
            return builder().build();
        }

        /**
         * @return alarmActions
         */
        public java.util.List<String> getAlarmActions() {
            return this.alarmActions;
        }

        /**
         * @return alarmTaskId
         */
        public String getAlarmTaskId() {
            return this.alarmTaskId;
        }

        /**
         * @return comparisonOperator
         */
        public String getComparisonOperator() {
            return this.comparisonOperator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return dimensions
         */
        public java.util.List<Dimensions> getDimensions() {
            return this.dimensions;
        }

        /**
         * @return effective
         */
        public String getEffective() {
            return this.effective;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return evaluationCount
         */
        public Integer getEvaluationCount() {
            return this.evaluationCount;
        }

        /**
         * @return expressions
         */
        public java.util.List<Expressions> getExpressions() {
            return this.expressions;
        }

        /**
         * @return expressionsLogicOperator
         */
        public String getExpressionsLogicOperator() {
            return this.expressionsLogicOperator;
        }

        /**
         * @return hybridMetrics
         */
        public java.util.List<HybridMetrics> getHybridMetrics() {
            return this.hybridMetrics;
        }

        /**
         * @return hybridMonitorNamespace
         */
        public String getHybridMonitorNamespace() {
            return this.hybridMonitorNamespace;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return metricType
         */
        public String getMetricType() {
            return this.metricType;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return period
         */
        public Integer getPeriod() {
            return this.period;
        }

        /**
         * @return promQL
         */
        public String getPromQL() {
            return this.promQL;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return statistics
         */
        public String getStatistics() {
            return this.statistics;
        }

        /**
         * @return threshold
         */
        public Float getThreshold() {
            return this.threshold;
        }

        public static final class Builder {
            private java.util.List<String> alarmActions; 
            private String alarmTaskId; 
            private String comparisonOperator; 
            private String description; 
            private java.util.List<Dimensions> dimensions; 
            private String effective; 
            private Boolean enable; 
            private Integer evaluationCount; 
            private java.util.List<Expressions> expressions; 
            private String expressionsLogicOperator; 
            private java.util.List<HybridMetrics> hybridMetrics; 
            private String hybridMonitorNamespace; 
            private String metricName; 
            private String metricType; 
            private String name; 
            private Integer period; 
            private String promQL; 
            private String scalingGroupId; 
            private String state; 
            private String statistics; 
            private Float threshold; 

            private Builder() {
            } 

            private Builder(AlarmList model) {
                this.alarmActions = model.alarmActions;
                this.alarmTaskId = model.alarmTaskId;
                this.comparisonOperator = model.comparisonOperator;
                this.description = model.description;
                this.dimensions = model.dimensions;
                this.effective = model.effective;
                this.enable = model.enable;
                this.evaluationCount = model.evaluationCount;
                this.expressions = model.expressions;
                this.expressionsLogicOperator = model.expressionsLogicOperator;
                this.hybridMetrics = model.hybridMetrics;
                this.hybridMonitorNamespace = model.hybridMonitorNamespace;
                this.metricName = model.metricName;
                this.metricType = model.metricType;
                this.name = model.name;
                this.period = model.period;
                this.promQL = model.promQL;
                this.scalingGroupId = model.scalingGroupId;
                this.state = model.state;
                this.statistics = model.statistics;
                this.threshold = model.threshold;
            } 

            /**
             * <p>The list of unique identifiers of the scaling rules associated with the event-triggered task.</p>
             */
            public Builder alarmActions(java.util.List<String> alarmActions) {
                this.alarmActions = alarmActions;
                return this;
            }

            /**
             * <p>The ID of the event-triggered task.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp1hvbnmkl10vll5****_f95ce797-dc2e-4bad-9618-14fee7d1****</p>
             */
            public Builder alarmTaskId(String alarmTaskId) {
                this.alarmTaskId = alarmTaskId;
                return this;
            }

            /**
             * <p>The comparison operator used to compare the metric value with the threshold. Valid values:</p>
             * <ul>
             * <li><blockquote>
             * <p>=: The metric value is greater than or equal to the threshold.</p>
             * </blockquote>
             * </li>
             * <li>&lt;=: The metric value is less than or equal to the threshold.</li>
             * <li><blockquote>
             * <p>: The metric value is greater than the threshold.</p>
             * </blockquote>
             * </li>
             * <li>&lt;: The metric value is less than the threshold.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <blockquote>
             * <p>=</p>
             * </blockquote>
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * <p>The description of the event-triggered task.</p>
             * 
             * <strong>example:</strong>
             * <p>Test alarm task.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The dimension information associated with the metric.</p>
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The effective period of the event-triggered node.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li><ul>
             * <li><ul>
             * <li><ul>
             * <li><ul>
             * <li>?</li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * </li>
             * </ul>
             */
            public Builder effective(String effective) {
                this.effective = effective;
                return this;
            }

            /**
             * <p>Indicates whether the event-triggered task is enabled. Valid values:</p>
             * <ul>
             * <li>true: Enabled.</li>
             * <li>false: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The number of times that the threshold condition must be met before the scaling rule is triggered. For example, if this parameter is set to 3, the scaling rule is triggered only when the average CPU utilization is greater than or equal to 80% for three consecutive times.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * <p>The information about the multi-metric alert rule.</p>
             */
            public Builder expressions(java.util.List<Expressions> expressions) {
                this.expressions = expressions;
                return this;
            }

            /**
             * <p>The logical operator that specifies the relationship among multiple monitoring alert conditions. Valid values:</p>
             * <ul>
             * <li><code>&amp;&amp;</code>: An alert is triggered only when all monitoring metrics meet the alert conditions. That is, an alert is triggered only when all expressions in the multi-metric alert rule evaluate to <code>true</code>.</li>
             * <li><code>||</code>: An alert is triggered when any of the monitoring metrics meets the alert condition.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>&amp;&amp;</p>
             */
            public Builder expressionsLogicOperator(String expressionsLogicOperator) {
                this.expressionsLogicOperator = expressionsLogicOperator;
                return this;
            }

            /**
             * <p>The monitoring metrics settings of Hybrid Cloud Monitoring. For more information about how to configure the settings, see <a href="https://help.aliyun.com/document_detail/2852162.html">Use formulas to customize target tracking scaling rules</a>.</p>
             */
            public Builder hybridMetrics(java.util.List<HybridMetrics> hybridMetrics) {
                this.hybridMetrics = hybridMetrics;
                return this;
            }

            /**
             * <p>The ID of the Hybrid Cloud Monitoring metrics repository.</p>
             * <p>For more information about how to manage metrics repositories, see <a href="https://help.aliyun.com/document_detail/217606.html">Manage metrics repositories</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-test</p>
             */
            public Builder hybridMonitorNamespace(String hybridMonitorNamespace) {
                this.hybridMonitorNamespace = hybridMonitorNamespace;
                return this;
            }

            /**
             * <p>The name of the metric. Valid values: </p>
             * <ul>
             * <li>CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</li>
             * <li>ConcurrentConnections: the number of concurrent connections to an ECS instance.</li>
             * <li>IntranetTx: the outbound internal traffic of an ECS instance. Unit: Kbit/min.</li>
             * <li>IntranetRx: the inbound internal traffic of an ECS instance. Unit: Kbit/min.</li>
             * <li>VpcInternetTx: the outbound Internet traffic of an ECS instance. Unit: Kbit/min.</li>
             * <li>VpcInternetRx: the inbound Internet traffic of an ECS instance. Unit: Kbit/min.</li>
             * <li>SystemDiskReadBps: the number of bytes read from the system cloud disk per second. Unit: Byte/s.</li>
             * <li>SystemDiskWriteBps: the number of bytes written to the system cloud disk per second. Unit: Byte/s.</li>
             * <li>SystemDiskReadOps: the number of read operations on the system cloud disk per second. Unit: IOPS.</li>
             * <li>SystemDiskWriteOps: the number of write operations on the system cloud disk per second. Unit: IOPS.</li>
             * <li>CpuUtilizationAgent: the CPU utilization collected by the CloudMonitor agent. Unit: %.</li>
             * <li>GpuUtilizationAgent: the GPU utilization collected by the CloudMonitor agent. Unit: %.</li>
             * <li>GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory collected by the CloudMonitor agent. Unit: %.</li>
             * <li>GpuMemoryUtilizationAgent: the GPU memory utilization collected by the CloudMonitor agent. Unit: %.</li>
             * <li>MemoryUtilization: the memory utilization collected by the CloudMonitor agent. Unit: %.</li>
             * <li>LoadAverage: the average system load collected by the CloudMonitor agent.</li>
             * <li>TcpConnection: the total number of TCP connections collected by the CloudMonitor agent.</li>
             * <li>TcpConnection: the number of established TCP connections collected by the CloudMonitor agent.</li>
             * <li>PackagesNetOut: the number of packets sent by the internal NIC per second collected by the CloudMonitor agent. Unit: packets/s.</li>
             * <li>PackagesNetIn: the number of packets received by the internal NIC per second collected by the CloudMonitor agent. Unit: packets/s.</li>
             * <li>PackagesNetOut: the number of packets sent by the public NIC per second collected by the CloudMonitor agent. Unit: packets/s.</li>
             * <li>PackagesNetIn: the number of packets received by the public NIC per second collected by the CloudMonitor agent. Unit: packets/s.</li>
             * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
             * <li>EciPodMemoryUtilization: the memory utilization. Unit: %.</li>
             * <li>LoadBalancerRealServerAverageQps: the average QPS per backend server in an ALB server group. Unit: queries/s.</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks for system monitoring</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CpuUtilization</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The type of the metric. Valid values:</p>
             * <ul>
             * <li>system: system metrics of CloudMonitor.</li>
             * <li>custom: custom metrics reported to CloudMonitor.</li>
             * <li>hybrid: metrics of Hybrid Cloud Monitoring.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>system</p>
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * <p>The name of the event-triggered task.</p>
             * 
             * <strong>example:</strong>
             * <p>TestAlarmTask</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The period at which metric data is collected. Unit: seconds. Valid values:</p>
             * <ul>
             * <li>15</li>
             * <li>60</li>
             * <li>120</li>
             * <li>300</li>
             * <li>900</li>
             * </ul>
             * <blockquote>
             * <p>A statistical period of 15 seconds is supported only for scaling groups that contain ECS instances.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The PromQL query statement for Hybrid Cloud Monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>(avg(last_over_time(AliyunMnsnew_ActiveMessages{region=\&quot;cn-hangzhou\&quot;,userId=\&quot;123456****\&quot;,queue=\&quot;testQueue\&quot;}[900s])) by (userId))/(avg(last_over_time(AliyunEss_RunningInstanceCount{instanceId=\&quot;asg-bp1****\&quot;}[900s])) by (userId) != 0)</p>
             */
            public Builder promQL(String promQL) {
                this.promQL = promQL;
                return this;
            }

            /**
             * <p>The ID of the scaling group with which the event-triggered task is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp18p2yfxow2dloq****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The state of the event-triggered task. Valid values:</p>
             * <ul>
             * <li>ALARM: Alerting. The alert condition is met.</li>
             * <li>OK: Normal. The alert condition is not met.</li>
             * <li>INSUFFICIENT_DATA: Insufficient data. The data is insufficient to determine whether the alert condition is met.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALARM</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The statistical method used for metric data. Valid values:</p>
             * <ul>
             * <li>Average: the average value.</li>
             * <li>Minimum: the minimum value.</li>
             * <li>Maximum: the maximum value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold of the monitoring metrics. The scaling rule is triggered when the threshold expression is met for the specified number of times.</p>
             * 
             * <strong>example:</strong>
             * <p>80.0</p>
             */
            public Builder threshold(Float threshold) {
                this.threshold = threshold;
                return this;
            }

            public AlarmList build() {
                return new AlarmList(this);
            } 

        } 

    }
}
