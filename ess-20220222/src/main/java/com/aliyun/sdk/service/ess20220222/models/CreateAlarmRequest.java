// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlarmRequest} extends {@link RequestModel}
 *
 * <p>CreateAlarmRequest</p>
 */
public class CreateAlarmRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmActions")
    private java.util.List < String > alarmActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
    private String comparisonOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Effective")
    private String effective;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    private Integer evaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expressions")
    private java.util.List < Expressions> expressions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpressionsLogicOperator")
    private String expressionsLogicOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private Integer groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricName")
    private String metricName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MetricType")
    private String metricType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statistics")
    private String statistics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    private Float threshold;

    private CreateAlarmRequest(Builder builder) {
        super(builder);
        this.alarmActions = builder.alarmActions;
        this.comparisonOperator = builder.comparisonOperator;
        this.description = builder.description;
        this.dimensions = builder.dimensions;
        this.effective = builder.effective;
        this.evaluationCount = builder.evaluationCount;
        this.expressions = builder.expressions;
        this.expressionsLogicOperator = builder.expressionsLogicOperator;
        this.groupId = builder.groupId;
        this.metricName = builder.metricName;
        this.metricType = builder.metricType;
        this.name = builder.name;
        this.ownerId = builder.ownerId;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.scalingGroupId = builder.scalingGroupId;
        this.statistics = builder.statistics;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlarmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmActions
     */
    public java.util.List < String > getAlarmActions() {
        return this.alarmActions;
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
     * @return groupId
     */
    public Integer getGroupId() {
        return this.groupId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
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

    public static final class Builder extends Request.Builder<CreateAlarmRequest, Builder> {
        private java.util.List < String > alarmActions; 
        private String comparisonOperator; 
        private String description; 
        private java.util.List < Dimensions> dimensions; 
        private String effective; 
        private Integer evaluationCount; 
        private java.util.List < Expressions> expressions; 
        private String expressionsLogicOperator; 
        private Integer groupId; 
        private String metricName; 
        private String metricType; 
        private String name; 
        private Long ownerId; 
        private Integer period; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private String scalingGroupId; 
        private String statistics; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlarmRequest request) {
            super(request);
            this.alarmActions = request.alarmActions;
            this.comparisonOperator = request.comparisonOperator;
            this.description = request.description;
            this.dimensions = request.dimensions;
            this.effective = request.effective;
            this.evaluationCount = request.evaluationCount;
            this.expressions = request.expressions;
            this.expressionsLogicOperator = request.expressionsLogicOperator;
            this.groupId = request.groupId;
            this.metricName = request.metricName;
            this.metricType = request.metricType;
            this.name = request.name;
            this.ownerId = request.ownerId;
            this.period = request.period;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.scalingGroupId = request.scalingGroupId;
            this.statistics = request.statistics;
            this.threshold = request.threshold;
        } 

        /**
         * The list of unique identifiers of the scaling rules that are associated with the event-triggered task.
         */
        public Builder alarmActions(java.util.List < String > alarmActions) {
            this.putQueryParameter("AlarmActions", alarmActions);
            this.alarmActions = alarmActions;
            return this;
        }

        /**
         * The operator that is used to compare the metric value and the threshold. Valid values:
         * <p>
         * 
         * *   If the metric value is greater than or equal to the threshold, set the value to: >=.
         * *   If the metric value is less than or equal to the threshold, set the value to: <=.
         * *   If the metric value is greater than the threshold, set the value to: >.
         * *   If the metric value is less than the threshold, set the value to: <.
         * 
         * Default value: >=.
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.putQueryParameter("ComparisonOperator", comparisonOperator);
            this.comparisonOperator = comparisonOperator;
            return this;
        }

        /**
         * The description of the event-triggered task.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The metric dimensions.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The effective period of the event-triggered task. By default, the event-triggered task is in effect all the time.
         * <p>
         * 
         * This parameter follows the cron expression format. The default format is `X X X X X ?`. In the format:
         * 
         * *   X: a placeholder for a field, which represents seconds, minutes, hours, days, and months in sequence. X can be a definite value or a special character that has logical meaning. For information about the valid values of X, see [Cron expression](~~25907~~).
         * *   ?: No value is specified.
         * 
         * > By default, this parameter value is specified in **UTC+8**. You can specify the time zone in the `TZ=+yy` format before a cron expression. y indicates the time zone. For example, `TZ=+00 * * 1-2 * * ?` specifies that the event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.
         * 
         * Sample values:
         * 
         * *   ` * * * * * ?  `: The event-triggered task is in effect all the time.
         * *   ` * * 17-18 * * ?  `: The event-triggered task is in effect between 17:00 and 18:59 (UTC+8) every day.
         * *   `TZ=+00 * * 1-2 * * ?`: The event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.
         */
        public Builder effective(String effective) {
            this.putQueryParameter("Effective", effective);
            this.effective = effective;
            return this;
        }

        /**
         * The number of times that the threshold must be reached before a scaling rule can be executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is triggered.
         * <p>
         * 
         * Default value: 3.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * The information about the multi-metric alert rules.
         */
        public Builder expressions(java.util.List < Expressions> expressions) {
            this.putQueryParameter("Expressions", expressions);
            this.expressions = expressions;
            return this;
        }

        /**
         * The relationship between the trigger conditions in the multi-metric alert rule. Valid values:
         * <p>
         * 
         * *   `&&`: An alert is triggered only if all metrics in the multi-metric alert rule meet the trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are `true`.
         * *   `||`: An alert is triggered if one of the metrics in the multi-metric alert rule meets the trigger conditions.
         * 
         * Default value: `&&`.
         */
        public Builder expressionsLogicOperator(String expressionsLogicOperator) {
            this.putQueryParameter("ExpressionsLogicOperator", expressionsLogicOperator);
            this.expressionsLogicOperator = expressionsLogicOperator;
            return this;
        }

        /**
         * The ID of the application group to which the custom metric belongs. If you set the MetricType parameter to custom, you must specify this parameter.
         */
        public Builder groupId(Integer groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The metric name. The valid values of this parameter vary based on the metric type.
         * <p>
         * 
         * *   If you set MetricType to custom, the valid values are the metrics that you have.
         * 
         * *   If you set MetricType to system, this parameter has the following valid values:
         * 
         *     *   CpuUtilization: the CPU utilization. Unit: %.
         *     *   ConcurrentConnections: the number of concurrent connections.
         *     *   IntranetTx: the outbound traffic over an internal network. Unit: KB/min.
         *     *   IntranetRx: the inbound traffic over an internal network. Unit: KB/min.
         *     *   VpcInternetTx: the outbound traffic over a virtual private cloud (VPC). Unit: KB/min.
         *     *   VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.
         *     *   SystemDiskReadBps: the number of bytes read from the system disk per second.
         *     *   SystemDiskWriteBps: the number of bytes written to the system disk per second.
         *     *   SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.
         *     *   SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.
         *     *   CpuUtilizationAgent: the CPU utilization. Unit: %.
         *     *   GpuUtilizationAgent: the GPU utilization. Unit: %.
         *     *   GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.
         *     *   GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.
         *     *   MemoryUtilization: the memory usage. Unit: %.
         *     *   LoadAverage: the average system load.
         *     *   TcpConnection: the total number of TCP connections.
         *     *   TcpConnection: the number of established TCP connections.
         *     *   PackagesNetOut: the number of packets sent by the internal network interface controller (NIC). Unit: counts/s.
         *     *   PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.
         *     *   PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.
         *     *   PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.
         *     *   EciPodCpuUtilization: the CPU utilization. Unit: %.
         *     *   EciPodMemoryUtilization: the memory usage. Unit: %.
         *     *   LoadBalancerRealServerAverageQps: the queries per second (QPS) of an instance.
         * 
         * For more information, see [Event-triggered tasks of the system monitoring type](~~74854~~).
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
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
            this.putQueryParameter("MetricType", metricType);
            this.metricType = metricType;
            return this;
        }

        /**
         * The name of the event-triggered task.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
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
         * >  You can set this parameter to 15 seconds only for scaling groups of the ECS type.
         * 
         * Default value: 300.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The region ID of the scaling group.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * The scaling group ID of the event-triggered task.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * The method that is used to aggregate statistics for the metric. Valid values:
         * <p>
         * 
         * *   Average
         * *   Minimum
         * *   Maximum
         * 
         * Default value: Average.
         */
        public Builder statistics(String statistics) {
            this.putQueryParameter("Statistics", statistics);
            this.statistics = statistics;
            return this;
        }

        /**
         * The threshold of the metric value. If the threshold is reached the specified number of times within the specified period, a scaling rule is executed.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public CreateAlarmRequest build() {
            return new CreateAlarmRequest(this);
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
             * The dimension key of the metric. The valid values vary based on the metric type.
             * <p>
             * 
             * *   If you set MetricType to custom, you can specify this parameter based on your business requirements.
             * 
             * *   If you set MetricType to system, this parameter has the following valid values:
             * 
             *     *   user_id: the ID of your Alibaba Cloud account.
             *     *   scaling_group: the scaling group that you want to monitor by using the event-triggered task.
             *     *   device: the NIC type.
             *     *   state: the status of the TCP connection.
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * The dimension value of the metric. The valid values of this parameter vary based on the value of Dimensions.DimensionKey.
             * <p>
             * 
             * *   If you set MetricType to custom, you can specify this parameter based on your business requirements.
             * 
             * *   If you set MetricType to system, this parameter has the following valid values:
             * 
             *     *   user_id: The system specifies the value.
             * 
             *     *   scaling_group: The system specifies the value.
             * 
             *     *   device: You can set this parameter to eth0 or eth1.
             * 
             *         *   For instances of the classic network type, eth0 specifies the internal NIC. Only one eth0 NIC exists on each instance that resides in VPCs.
             *         *   For instances of the classic network type, eth1 specifies the public NIC.
             * 
             *     *   state: You can set this parameter to TCP_TOTAL or ESTABLISHED.
             * 
             *         *   TCP_TOTAL specifies the total number of TCP connections.
             *         *   ESTABLISHED specifies the number of TCP connections that are established.
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
             * The operator that you want to use to compare the metric value and the threshold in the multi-metric alert rule. Valid values:
             * <p>
             * 
             * *   If the metric value is greater than or equal to the threshold, set the value to >=.
             * *   If the metric value is less than or equal to the metric threshold, set the value to <=.
             * *   If the metric value is greater than the metric threshold, set the value to >.
             * *   If the metric value is less than the metric threshold, set the value to <.
             * 
             * Default value: >=.
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The names of the metrics in the multi-metric alert rule. The valid values of this parameter vary based on the metric type.
             * <p>
             * 
             * *   If you set MetricType to custom, the valid values are the metrics that you have.
             * 
             * *   If you set MetricType to system, this parameter has the following valid values:
             * 
             *     *   CpuUtilization: the CPU utilization. Unit: %.
             *     *   ConcurrentConnections: the number of concurrent connections.
             *     *   IntranetTx: the outbound traffic over an internal network. Unit: KB/min.
             *     *   IntranetRx: the inbound traffic over an internal network. Unit: KB/min.
             *     *   VpcInternetTx: the outbound traffic over a VPC. Unit: KB/min.
             *     *   VpcInternetRx: the inbound traffic over a VPC. Unit: KB/min.
             *     *   SystemDiskReadBps: the number of bytes read from the system disk per second.
             *     *   SystemDiskWriteBps: the number of bytes written to the system disk per second.
             *     *   SystemDiskReadOps: the read IOPS of the system disk. Unit: counts/s.
             *     *   SystemDiskWriteOps: the write IOPS of the system disk. Unit: counts/s.
             *     *   CpuUtilizationAgent: the CPU utilization. Unit: %.
             *     *   GpuUtilizationAgent: the GPU utilization. Unit: %.
             *     *   GpuMemoryFreeUtilizationAgent: the idle GPU memory usage. Unit: %.
             *     *   GpuMemoryUtilizationAgent: the GPU memory usage. Unit: %.
             *     *   MemoryUtilization: the memory usage. Unit: %.
             *     *   LoadAverage: the average system load.
             *     *   TcpConnection: the total number of TCP connections.
             *     *   TcpConnection: the number of established TCP connections.
             *     *   PackagesNetOut: the number of packets sent by the internal NIC. Unit: counts/s.
             *     *   PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.
             *     *   PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.
             *     *   PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.
             *     *   EciPodCpuUtilization: the CPU utilization. Unit: %.
             *     *   EciPodMemoryUtilization: the memory usage. Unit: %.
             *     *   LoadBalancerRealServerAverageQps: the QPS of an instance.
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
             * >  You can set this parameter to 15 seconds only for scaling groups of the ECS type.
             * 
             * Default value: 300.
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The method that you want to use to aggregate the metric data in the multi-metric alert rule. Valid values:
             * <p>
             * 
             * *   Average: the average value.
             * *   Minimum: the minimum value
             * *   Maximum: the maximum value
             * 
             * Default value: Average.
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * The threshold of the metric value in the multi-metric alert rule. If the threshold is reached the specified number of times within the statistical period, a scaling rule is executed.
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
}
