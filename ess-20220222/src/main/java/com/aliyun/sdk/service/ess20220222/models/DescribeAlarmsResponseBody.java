// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlarmsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAlarmsResponseBody</p>
 */
public class DescribeAlarmsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmList")
    private java.util.List < AlarmList> alarmList;

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
    public java.util.List < AlarmList> getAlarmList() {
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
        private java.util.List < AlarmList> alarmList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The event-triggered tasks.
         */
        public Builder alarmList(java.util.List < AlarmList> alarmList) {
            this.alarmList = alarmList;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of event-triggered tasks.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAlarmsResponseBody build() {
            return new DescribeAlarmsResponseBody(this);
        } 

    } 

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
             * The dimension key of the metric. Valid values:
             * <p>
             * 
             * *   user_id: the ID of your Alibaba Cloud account.
             * *   scaling_group: the scaling group that is monitored by the event-triggered task.
             * *   device: the NIC type.
             * *   state: the status of the TCP connection.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * The dimension value of the metric. The value of DimensionValue varies based on the value of DimensionKey.
             * <p>
             * 
             * *   If you set DimensionKey to `user_id`, the system specifies the value of DimensionValue.
             * 
             * *   If you set DimensionKey to `scaling_group`, the system specifies the value of DimensionValue.
             * 
             * *   If you set DimensionKey to `device`, you can set DimensionValue to eth0 or eth1.
             * 
             *     *   For instances of the classic network type, eth0 indicates the internal NIC. Only one eth0 NIC exists on each instance that resides in VPCs.
             *     *   For instances of the classic network type, eth1 indicates the public NIC.
             * 
             * *   If you set DimensionKey to `state`, you can set DimensionValue to TCP_TOTAL or ESTABLISHED.
             * 
             *     *   TCP_TOTAL indicates the total number of TCP connections.
             *     *   ESTABLISHED indicates the number of TCP connections that are established.
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
             * The operator that is used to compare the metric value and the threshold.
             * <p>
             * 
             * *   Valid value if the metric value is greater than or equal to the threshold: >=.
             * *   Valid value if the metric value is less than or equal to the threshold: <=.
             * *   Valid value if the metric value is greater than the threshold: >.
             * *   Valid value if the metric value is less than the threshold: <.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The name of the metric that is specified in the multi-metric alert rule. Valid values:
             * <p>
             * 
             * *   CpuUtilization: the CPU utilization of an ECS instance. Unit: %.
             * *   ConcurrentConnections: the number of current connections to an ECS instance.
             * *   IntranetTx: the outbound traffic over an internal network. Unit: KB/min.
             * *   IntranetRx: the inbound traffic over an internal network. Unit: KB/min.
             * *   VpcInternetTx: the outbound traffic over a VPC. Unit: KB/min.
             * *   VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.
             * *   SystemDiskReadBps: the number of bytes read from the system disk per second.
             * *   SystemDiskWriteBps: the number of bytes written to the system disk per second.
             * *   SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.
             * *   SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.
             * *   CpuUtilizationAgent: the CPU utilization. Unit: %.
             * *   GpuUtilizationAgent: the GPU utilization. Unit: %.
             * *   GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.
             * *   GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.
             * *   MemoryUtilization: the memory usage. Unit: %.
             * *   LoadAverage: the average system load.
             * *   TcpConnection: the total number of TCP connections.
             * *   TcpConnection: the number of established TCP connections.
             * *   PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.
             * *   PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.
             * *   PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.
             * *   PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.
             * *   EciPodCpuUtilization: the CPU utilization. Unit: %.
             * *   EciPodMemoryUtilization: the memory usage. Unit: %.
             * *   LoadBalancerRealServerAverageQps: the QPS of an instance.
             * 
             * For more information, see [Event-triggered tasks of the system monitoring type](~~74854~~).
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The statistical period of the metric data in the multi-metric alert rule. Unit: seconds. Valid values:
             * <p>
             * 
             * *   15
             * *   60
             * *   120
             * *   300
             * *   900
             * 
             * >  If your scaling group is of the ECS type and the event-triggered task that is associated with your scaling group monitors CloudMonitor metrics, you can set Period to 15. In most cases, the name of a CloudMonitor metric contains Agent.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The method that is used to aggregate statistics about the metrics in the multi-metric alert rule. Valid values:
             * <p>
             * 
             * *   Average: the average value
             * *   Minimum: the minimum value
             * *   Maximum: the maximum value
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold of the metric value. If the threshold is reached the specified number of times within the specified period, a scaling rule is executed.
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
    public static class AlarmList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlarmActions")
        private java.util.List < String > alarmActions;

        @com.aliyun.core.annotation.NameInMap("AlarmTaskId")
        private String alarmTaskId;

        @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Dimensions")
        private java.util.List < Dimensions> dimensions;

        @com.aliyun.core.annotation.NameInMap("Effective")
        private String effective;

        @com.aliyun.core.annotation.NameInMap("Enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("EvaluationCount")
        private Integer evaluationCount;

        @com.aliyun.core.annotation.NameInMap("Expressions")
        private java.util.List < Expressions> expressions;

        @com.aliyun.core.annotation.NameInMap("ExpressionsLogicOperator")
        private String expressionsLogicOperator;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("MetricType")
        private String metricType;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Period")
        private Integer period;

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
            this.metricName = builder.metricName;
            this.metricType = builder.metricType;
            this.name = builder.name;
            this.period = builder.period;
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
        public java.util.List < String > getAlarmActions() {
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
        public java.util.List < Dimensions> getDimensions() {
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
        public java.util.List < Expressions> getExpressions() {
            return this.expressions;
        }

        /**
         * @return expressionsLogicOperator
         */
        public String getExpressionsLogicOperator() {
            return this.expressionsLogicOperator;
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
            private java.util.List < String > alarmActions; 
            private String alarmTaskId; 
            private String comparisonOperator; 
            private String description; 
            private java.util.List < Dimensions> dimensions; 
            private String effective; 
            private Boolean enable; 
            private Integer evaluationCount; 
            private java.util.List < Expressions> expressions; 
            private String expressionsLogicOperator; 
            private String metricName; 
            private String metricType; 
            private String name; 
            private Integer period; 
            private String scalingGroupId; 
            private String state; 
            private String statistics; 
            private Float threshold; 

            /**
             * The unique identifiers of the scaling rules that are associated with the event-triggered task.
             */
            public Builder alarmActions(java.util.List < String > alarmActions) {
                this.alarmActions = alarmActions;
                return this;
            }

            /**
             * The ID of the event-triggered task.
             */
            public Builder alarmTaskId(String alarmTaskId) {
                this.alarmTaskId = alarmTaskId;
                return this;
            }

            /**
             * The operator that is used to compare the metric value and the metric threshold.
             * <p>
             * 
             * *   Valid value if the metric value is greater than or equal to the threshold: >=.
             * *   Valid value if the metric value is less than or equal to the threshold: <=.
             * *   Valid value if the metric value is greater than the threshold: >.
             * *   Valid value if the metric value is less than the threshold: <.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The description of the event-triggered task.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The metric dimensions.
             */
            public Builder dimensions(java.util.List < Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * The effective period of the event-triggered task.
             */
            public Builder effective(String effective) {
                this.effective = effective;
                return this;
            }

            /**
             * Indicates whether the event-triggered task feature is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The number of consecutive times that the threshold must be reached before a scaling rule is executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is executed.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * The alert conditions of the multi-metric alert rule.
             */
            public Builder expressions(java.util.List < Expressions> expressions) {
                this.expressions = expressions;
                return this;
            }

            /**
             * The relationship between the trigger conditions that are specified in the multi-metric alert rule. Valid values:
             * <p>
             * 
             * *   `&&`: An alert is triggered only if all metrics in the multi-metric alert rule meet their trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are `true`.
             * *   `||`: An alert is triggered only if one of the metrics in the multi-metric alert rule meets its trigger condition.
             */
            public Builder expressionsLogicOperator(String expressionsLogicOperator) {
                this.expressionsLogicOperator = expressionsLogicOperator;
                return this;
            }

            /**
             * The metric name. Valid values:
             * <p>
             * 
             * *   CpuUtilization: the CPU utilization of an Elastic Compute Service (ECS) instance. Unit: %.
             * *   ConcurrentConnections: the number of current connections to an ECS instance.
             * *   IntranetTx: the outbound traffic over an internal network. Unit: KB/min.
             * *   IntranetRx: the inbound traffic over an internal network. Unit: KB/min.
             * *   VpcInternetTx: the outbound traffic over a virtual private cloud (VPC). Unit: KB/min.
             * *   VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.
             * *   SystemDiskReadBps: the number of bytes read from the system disk per second.
             * *   SystemDiskWriteBps: the number of bytes written to the system disk per second.
             * *   SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.
             * *   SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.
             * *   CpuUtilizationAgent: the CPU utilization. Unit: %.
             * *   GpuUtilizationAgent: the GPU utilization. Unit: %.
             * *   GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.
             * *   GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.
             * *   MemoryUtilization: the memory usage. Unit: %.
             * *   LoadAverage: the average system load.
             * *   TcpConnection: the total number of TCP connections.
             * *   TcpConnection: the number of established TCP connections.
             * *   PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.
             * *   PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.
             * *   PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.
             * *   PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.
             * *   EciPodCpuUtilization: the CPU utilization. Unit: %.
             * *   EciPodMemoryUtilization: the memory usage. Unit: %.
             * *   LoadBalancerRealServerAverageQps: the queries per second (QPS) of an instance.
             * 
             * For more information, see [Event-triggered tasks of the system monitoring type](~~74854~~).
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The metric type. Valid values:
             * <p>
             * 
             * *   system: system metrics of CloudMonitor
             * *   custom: custom metrics that are reported to CloudMonitor.
             */
            public Builder metricType(String metricType) {
                this.metricType = metricType;
                return this;
            }

            /**
             * The name of the event-triggered task.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The statistical period of the metric data. Unit: seconds. Valid values:
             * <p>
             * 
             * *   15
             * *   60
             * *   120
             * *   300
             * *   900
             * 
             * >  You can set the value of this parameter to 15 Seconds only for scaling groups of the ECS type.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The ID of the scaling group to which the event-triggered task is associated.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * The status of the event-triggered task. Valid values:
             * <p>
             * 
             * *   ALARM: The alert condition is met and an alert is triggered.
             * *   OK: The alert condition is not met.
             * *   INSUFFICIENT_DATA: Auto Scaling cannot determine whether the alert condition is met due to insufficient data.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The method that is used to aggregate the metric data. Valid values:
             * <p>
             * 
             * *   Average: the average value
             * *   Minimum: the minimum value
             * *   Maximum: the maximum value
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold of the metric. If the threshold is reached the specified number of times within the statistical period, a scaling rule is executed.
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
