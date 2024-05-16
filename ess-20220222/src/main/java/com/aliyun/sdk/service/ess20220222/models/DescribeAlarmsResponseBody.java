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
         * The list of event-triggered tasks.
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
             * The key of the dimension. Valid values:
             * <p>
             * 
             * *   user_id: the ID of your Alibaba Cloud account
             * *   scaling_group: the scaling group that you want to monitor
             * *   device: the type of the NIC
             * *   state: the state of the TCP connection
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * The value of the dimension. The value of the DimensionValue parameter varies based on the value of the DimensionKey parameter.
             * <p>
             * 
             * *   If you set the DimensionKey parameter to `user_id`, the system specifies the value of the DimensionValue parameter.
             * 
             * *   If you set the DimensionKey parameter to `scaling_group`, the system specifies the value of the DimensionValue parameter.
             * 
             * *   If you set the DimensionKey parameter to `device`, you can set the DimensionValue parameter to eth0 or eth1.
             * 
             *     *   For instances that reside in the classic network type, eth0 specifies the internal NIC. Only one eth0 NIC exists on each instance that resides in a VPC.
             *     *   For instances that reside in the classic network, eth1 specifies the public NIC.
             * 
             * *   If you set the DimensionKey parameter to `state`, you can set the DimensionValue parameter to TCP_TOTAL or ESTABLISHED.
             * 
             *     *   TCP_TOTAL specifies the total number of TCP connections.
             *     *   ESTABLISHED specifies the number of established TCP connections.
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
             * *   Valid value if the metric value is greater than or equal to the threshold: >=
             * *   Valid value if the metric value is less than or equal to the threshold: <=
             * *   Valid value if the metric value is greater than the threshold: >
             * *   Valid value if the metric value is less than the threshold: <
             * 
             * Default value: >=.
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
             * *   IntranetTx: the outbound traffic over the internal network from an ECS instance. Unit: KB/min.
             * *   IntranetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.
             * *   VpcInternetTx: the outbound traffic over the Internet from an ECS instance that resides in a VPC. Unit: KB/min.
             * *   VpcInternetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.
             * *   SystemDiskReadBps: the number of bytes read from the system disk used by an ECS instance per second.
             * *   SystemDiskWriteBps: the number of bytes written to the system disk used by an ECS instance per second.
             * *   SystemDiskReadOps: the number of read operations on the system disk used by an ECS instance per second.
             * *   SystemDiskWriteOps: the number of write operations on the system disk used by an ECS instance per second.
             * *   CpuUtilizationAgent: the CPU utilization of an agent. Unit: %.
             * *   GpuUtilizationAgent: the GPU utilization of an agent. Unit: %.
             * *   GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory of an agent.
             * *   GpuMemoryUtilizationAgent: the GPU memory usage of an agent. Unit: %.
             * *   MemoryUtilization: the memory usage of an agent. Unit: %.
             * *   LoadAverage: the average system load of an agent.
             * *   TcpConnection: the total number of TCP connections of an agent.
             * *   TcpConnection: the number of established TCP connections of an agent.
             * *   PackagesNetOut: the number of packets that are sent by the internal NIC used by an agent.
             * *   PackagesNetIn: the number of packets that are received by the internal NIC used by an agent.
             * *   EciPodCpuUtilization: the CPU utilization of an elastic container instance. Unit: %.
             * *   EciPodMemoryUtilization: the memory usage of an elastic container instance. Unit: %.
             * 
             * For more information, see [Event-triggered task for system monitoring](~~74854~~).
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The period of time during which statistics about the metrics in the multi-metric alert rule is collected. Unit: seconds. Valid values:
             * <p>
             * 
             * *   15
             * *   60
             * *   120
             * *   300
             * *   900
             * 
             * > If your scaling group is of the ECS type and the event-triggered task associated with your scaling group monitors CloudMonitor metrics, you can set the Period parameter to 15. In most cases, the name of a CloudMonitor metric contains Agent.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The method that is used to aggregate statistics about the metrics in the multi-metric alert rule. Valid values:
             * <p>
             * 
             * *   Average
             * *   Minimum
             * *   Maximum
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The thresholds of the metric values in the multi-metric alert rule. If the thresholds are reached the specified number of times within the specified period, a scaling rule is executed.
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
             * The list of unique identifiers of the scaling rules that are associated with the event-triggered task.
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
             * The operator that is used to compare the metric value and the threshold.
             * <p>
             * 
             * *   Valid value if the metric value is greater than or equal to the threshold: >=
             * *   Valid value if the metric value is less than or equal to the threshold: <=
             * *   Valid value if the metric value is greater than the threshold: >
             * *   Valid value if the metric value is less than the threshold: <
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
             * Details of the dimensions.
             */
            public Builder dimensions(java.util.List < Dimensions> dimensions) {
                this.dimensions = dimensions;
                return this;
            }

            /**
             * > This parameter is in invitational preview and is unavailable.
             */
            public Builder effective(String effective) {
                this.effective = effective;
                return this;
            }

            /**
             * Indicates whether the event-triggered task is enabled. Valid values:
             * <p>
             * 
             * *   true: The event-triggered task is enabled.
             * *   false: The event-triggered task is disabled.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * The number of times that the threshold must be reached before a scaling rule can be executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is triggered.
             */
            public Builder evaluationCount(Integer evaluationCount) {
                this.evaluationCount = evaluationCount;
                return this;
            }

            /**
             * The expressions that are specified in the multi-metric alert rule.
             */
            public Builder expressions(java.util.List < Expressions> expressions) {
                this.expressions = expressions;
                return this;
            }

            /**
             * The relationship between the trigger conditions that are specified in the multi-metric alert rule. Valid values:
             * <p>
             * 
             * *   `&&`: An alert is triggered only if all metrics in the multi-metric alert rule meet the trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are `true`.
             * *   `||`: An alert is triggered if one of the metrics in the multi-metric alert rule meets the trigger conditions.
             */
            public Builder expressionsLogicOperator(String expressionsLogicOperator) {
                this.expressionsLogicOperator = expressionsLogicOperator;
                return this;
            }

            /**
             * The name of the metric. Valid values:
             * <p>
             * 
             * *   CpuUtilization: the CPU utilization of an ECS instance. Unit: %.
             * *   IntranetTx: the outbound traffic over the internal network from an ECS instance. Unit: KB/min.
             * *   IntranetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.
             * *   VpcInternetTx: the outbound traffic over the Internet from an ECS instance that resides in a VPC. Unit: KB/min.
             * *   VpcInternetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.
             * *   SystemDiskReadBps: the number of bytes read from the system disk used by an ECS instance per second.
             * *   SystemDiskWriteBps: the number of bytes written to the system disk used by an ECS instance per second.
             * *   SystemDiskReadOps: the number of read operations on the system disk used by an ECS instance per second.
             * *   SystemDiskWriteOps: the number of write operations on the system disk used by an ECS instance per second.
             * *   CpuUtilizationAgent: the CPU utilization of an agent. Unit: %.
             * *   GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory of an agent.
             * *   GpuMemoryUtilizationAgent: the GPU memory usage of an agent. Unit: %.
             * *   MemoryUtilization: the memory usage of an agent. Unit: %.
             * *   LoadAverage: the average system load of an agent.
             * *   TcpConnection: the total number of TCP connections of an agent.
             * *   TcpConnection: the number of established TCP connections of an agent.
             * *   PackagesNetOut: the number of packets that are sent by the internal NIC used by an agent.
             * *   PackagesNetIn: the number of packets that are received by the internal NIC used by an agent.
             * *   EciPodCpuUtilization: the CPU utilization of an elastic container instance. Unit: %.
             * *   EciPodMemoryUtilization: the memory usage of an elastic container instance. Unit: %.
             * 
             * For more information, see [Event-triggered task for system monitoring](~~74854~~).
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The type of the metric. Valid values:
             * <p>
             * 
             * *   system: system metrics of CloudMonitor
             * *   custom: custom metrics that are reported to CloudMonitor
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
             * The period of time during which statistics about the metric is collected. Unit: seconds. Valid values:
             * <p>
             * 
             * *   15
             * *   60
             * *   120
             * *   300
             * *   900
             * 
             * > If your scaling group is of the ECS type and the event-triggered task associated with your scaling group monitors CloudMonitor metrics, you can set the Period parameter to 15. In most cases, the name of a CloudMonitor metric contains Agent.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The scaling group ID of the event-triggered task.
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
             * The method that is used to aggregate statistics for the metric. Valid values:
             * <p>
             * 
             * *   Average
             * *   Minimum
             * *   Maximum
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold of the metric value. If the threshold is reached the specified times within the specified period, a scaling rule is executed.
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
