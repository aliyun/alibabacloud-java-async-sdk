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

        /**
         * <p>The event-triggered tasks.</p>
         */
        public Builder alarmList(java.util.List<AlarmList> alarmList) {
            this.alarmList = alarmList;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
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

            /**
             * <p>The dimension key of the metric. Valid values:</p>
             * <ul>
             * <li>user_id: the ID of your Alibaba Cloud account.</li>
             * <li>scaling_group: the scaling group that is monitored by the event-triggered task.</li>
             * <li>device: the NIC type.</li>
             * <li>state: the status of the TCP connection.</li>
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
             * <p>The dimension value of the metric. The value of DimensionValue varies based on the value of DimensionKey.</p>
             * <ul>
             * <li><p>If you set DimensionKey to <code>user_id</code>, the system specifies the value of DimensionValue.</p>
             * </li>
             * <li><p>If you set DimensionKey to <code>scaling_group</code>, the system specifies the value of DimensionValue.</p>
             * </li>
             * <li><p>If you set DimensionKey to <code>device</code>, you can set DimensionValue to eth0 or eth1.</p>
             * <ul>
             * <li>For instances of the classic network type, eth0 indicates the internal NIC. Only one eth0 NIC exists on each instance that resides in VPCs.</li>
             * <li>For instances of the classic network type, eth1 indicates the public NIC.</li>
             * </ul>
             * </li>
             * <li><p>If you set DimensionKey to <code>state</code>, you can set DimensionValue to TCP_TOTAL or ESTABLISHED.</p>
             * <ul>
             * <li>TCP_TOTAL indicates the total number of TCP connections.</li>
             * <li>ESTABLISHED indicates the number of TCP connections that are established.</li>
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

            /**
             * <p>The operator that is used to compare the metric value and the threshold.</p>
             * <ul>
             * <li>Valid value if the metric value is greater than or equal to the threshold: &gt;=.</li>
             * <li>Valid value if the metric value is less than or equal to the threshold: &lt;=.</li>
             * <li>Valid value if the metric value is greater than the threshold: &gt;.</li>
             * <li>Valid value if the metric value is less than the threshold: &lt;.</li>
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
             * <p>The name of the metric that is specified in the multi-metric alert rule. Valid values:</p>
             * <ul>
             * <li>CpuUtilization: the CPU utilization of an ECS instance. Unit: %.</li>
             * <li>ConcurrentConnections: the number of current connections to an ECS instance.</li>
             * <li>IntranetTx: the outbound traffic over an internal network. Unit: KB/min.</li>
             * <li>IntranetRx: the inbound traffic over an internal network. Unit: KB/min.</li>
             * <li>VpcInternetTx: the outbound traffic over a VPC. Unit: KB/min.</li>
             * <li>VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.</li>
             * <li>SystemDiskReadBps: the number of bytes read from the system disk per second.</li>
             * <li>SystemDiskWriteBps: the number of bytes written to the system disk per second.</li>
             * <li>SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.</li>
             * <li>SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.</li>
             * <li>CpuUtilizationAgent: the CPU utilization. Unit: %.</li>
             * <li>GpuUtilizationAgent: the GPU utilization. Unit: %.</li>
             * <li>GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.</li>
             * <li>GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.</li>
             * <li>MemoryUtilization: the memory usage. Unit: %.</li>
             * <li>LoadAverage: the average system load.</li>
             * <li>TcpConnection: the total number of TCP connections.</li>
             * <li>TcpConnection: the number of established TCP connections.</li>
             * <li>PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.</li>
             * <li>PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</li>
             * <li>PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</li>
             * <li>PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</li>
             * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
             * <li>EciPodMemoryUtilization: the memory usage. Unit: %.</li>
             * <li>LoadBalancerRealServerAverageQps: the QPS of an instance.</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks of the system monitoring type</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CpuUtilization</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The statistical period of the metric data in the multi-metric alert rule. Unit: seconds. Valid values:</p>
             * <ul>
             * <li>15</li>
             * <li>60</li>
             * <li>120</li>
             * <li>300</li>
             * <li>900</li>
             * </ul>
             * <blockquote>
             * <p> If your scaling group is of the ECS type and the event-triggered task that is associated with your scaling group monitors CloudMonitor metrics, you can set Period to 15. In most cases, the name of a CloudMonitor metric contains Agent.</p>
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
             * <p>The method that is used to aggregate statistics about the metrics in the multi-metric alert rule. Valid values:</p>
             * <ul>
             * <li>Average: the average value</li>
             * <li>Minimum: the minimum value</li>
             * <li>Maximum: the maximum value</li>
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
             * <p>The threshold of the metric value. If the threshold is reached the specified number of times within the specified period, a scaling rule is executed.</p>
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
             * <p>The key of the metric dimension.</p>
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

            /**
             * <p>The metric dimensions. This parameter is used to specify the monitored resources.</p>
             */
            public Builder dimensions(java.util.List<HybridMetricsDimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The metric expression that consists of multiple Hybrid Cloud Monitoring metrics. It calculates a result used to trigger scaling events.</p>
             * <p>The expression is written in Reverse Polish Notation (RPN) format and supports only the following operators: <code>+, -, *, /</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>(a+b)/2</p>
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * <p>The reference ID of the metric in the metric expression.</p>
             * 
             * <strong>example:</strong>
             * <p>a</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the Hybrid Cloud Monitoring metric.</p>
             * 
             * <strong>example:</strong>
             * <p>AliyunSmq_NumberOfMessagesVisible</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The statistical method of the metric value. Valid values:</p>
             * <ul>
             * <li>Average: The average value of all metric values within a specified interval is calculated.</li>
             * <li>Minimum: The minimum value of all metric values within a specified interval is calculated.</li>
             * <li>Maximum: The maximum value of all metric values within a specified interval is calculated.</li>
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

            /**
             * <p>The unique identifiers of the scaling rules that are associated with the event-triggered task.</p>
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
             * <p>The operator that is used to compare the metric value and the metric threshold.</p>
             * <ul>
             * <li>Valid value if the metric value is greater than or equal to the threshold: &gt;=.</li>
             * <li>Valid value if the metric value is less than or equal to the threshold: &lt;=.</li>
             * <li>Valid value if the metric value is greater than the threshold: &gt;.</li>
             * <li>Valid value if the metric value is less than the threshold: &lt;.</li>
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
             * <p>The metric dimensions.</p>
             */
            public Builder dimensions(java.util.List<Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * <p>The effective period of the event-triggered task.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder effective(String effective) {
                this.effective = effective;
                return this;
            }

            /**
             * <p>Indicates whether the event-triggered task feature is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
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
             * <p>The number of consecutive times that the threshold must be reached before a scaling rule is executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * <p>The alert conditions of the multi-metric alert rule.</p>
             */
            public Builder expressions(java.util.List<Expressions> expressions) {
                this.expressions = expressions;
                return this;
            }

            /**
             * <p>The relationship between the trigger conditions that are specified in the multi-metric alert rule. Valid values:</p>
             * <ul>
             * <li><code>&amp;&amp;</code>: An alert is triggered only if all metrics in the multi-metric alert rule meet their trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are <code>true</code>.</li>
             * <li><code>||</code>: An alert is triggered only if one of the metrics in the multi-metric alert rule meets its trigger condition.</li>
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
             * <p>The Hybrid Cloud Monitoring metrics.</p>
             */
            public Builder hybridMetrics(java.util.List<HybridMetrics> hybridMetrics) {
                this.hybridMetrics = hybridMetrics;
                return this;
            }

            /**
             * <p>The ID of the Hybrid Cloud Monitoring namespace.</p>
             * <p>For information about how to manage Hybrid Cloud Monitoring namespaces, see <a href="https://help.aliyun.com/document_detail/217606.html">Manage namespaces</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-test</p>
             */
            public Builder hybridMonitorNamespace(String hybridMonitorNamespace) {
                this.hybridMonitorNamespace = hybridMonitorNamespace;
                return this;
            }

            /**
             * <p>The metric name. Valid values:</p>
             * <ul>
             * <li>CpuUtilization: the CPU utilization of an Elastic Compute Service (ECS) instance. Unit: %.</li>
             * <li>ConcurrentConnections: the number of current connections to an ECS instance.</li>
             * <li>IntranetTx: the outbound traffic over an internal network. Unit: KB/min.</li>
             * <li>IntranetRx: the inbound traffic over an internal network. Unit: KB/min.</li>
             * <li>VpcInternetTx: the outbound traffic over a virtual private cloud (VPC). Unit: KB/min.</li>
             * <li>VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.</li>
             * <li>SystemDiskReadBps: the number of bytes read from the system disk per second.</li>
             * <li>SystemDiskWriteBps: the number of bytes written to the system disk per second.</li>
             * <li>SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.</li>
             * <li>SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.</li>
             * <li>CpuUtilizationAgent: the CPU utilization. Unit: %.</li>
             * <li>GpuUtilizationAgent: the GPU utilization. Unit: %.</li>
             * <li>GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.</li>
             * <li>GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.</li>
             * <li>MemoryUtilization: the memory usage. Unit: %.</li>
             * <li>LoadAverage: the average system load.</li>
             * <li>TcpConnection: the total number of TCP connections.</li>
             * <li>TcpConnection: the number of established TCP connections.</li>
             * <li>PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.</li>
             * <li>PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</li>
             * <li>PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</li>
             * <li>PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</li>
             * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
             * <li>EciPodMemoryUtilization: the memory usage. Unit: %.</li>
             * <li>LoadBalancerRealServerAverageQps: the queries per second (QPS) of an instance.</li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks of the system monitoring type</a>.</p>
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
             * <li>system: system metrics of CloudMonitor</li>
             * <li>custom: custom metrics that are reported to CloudMonitor.</li>
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
             * <p>The statistical period of the metric data. Unit: seconds. Valid values:</p>
             * <ul>
             * <li>15</li>
             * <li>60</li>
             * <li>120</li>
             * <li>300</li>
             * <li>900</li>
             * </ul>
             * <blockquote>
             * <p> You can set the value of this parameter to 15 Seconds only for scaling groups of the ECS type.</p>
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
             * <p>The PromQL statement of Hybrid Cloud Monitoring.</p>
             * 
             * <strong>example:</strong>
             * <p>(avg(last_over_time(AliyunMnsnew_ActiveMessages{region=&quot;cn-hangzhou&quot;,userId=&quot;123456****&quot;,queue=&quot;testQueue&quot;}[900s])) by (userId))/(avg(last_over_time(AliyunEss_RunningInstanceCount{instanceId=&quot;asg-bp1****&quot;}[900s])) by (userId) != 0)</p>
             */
            public Builder promQL(String promQL) {
                this.promQL = promQL;
                return this;
            }

            /**
             * <p>The ID of the scaling group to which the event-triggered task is associated.</p>
             * 
             * <strong>example:</strong>
             * <p>asg-bp18p2yfxow2dloq****</p>
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * <p>The status of the event-triggered task. Valid values:</p>
             * <ul>
             * <li>ALARM: The alert condition is met and an alert is triggered.</li>
             * <li>OK: The alert condition is not met.</li>
             * <li>INSUFFICIENT_DATA: Auto Scaling cannot determine whether the alert condition is met due to insufficient data.</li>
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
             * <p>The method that is used to aggregate the metric data. Valid values:</p>
             * <ul>
             * <li>Average: the average value</li>
             * <li>Minimum: the minimum value</li>
             * <li>Maximum: the maximum value</li>
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
             * <p>The threshold of the metric. If the threshold is reached the specified number of times within the statistical period, a scaling rule is executed.</p>
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
