// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAlarmRequest} extends {@link RequestModel}
 *
 * <p>ModifyAlarmRequest</p>
 */
public class ModifyAlarmRequest extends Request {
    @Query
    @NameInMap("AlarmActions")
    private java.util.List < String > alarmActions;

    @Query
    @NameInMap("AlarmTaskId")
    @Validation(required = true)
    private String alarmTaskId;

    @Query
    @NameInMap("ComparisonOperator")
    private String comparisonOperator;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @Query
    @NameInMap("Effective")
    private String effective;

    @Query
    @NameInMap("EvaluationCount")
    private Integer evaluationCount;

    @Query
    @NameInMap("Expressions")
    private java.util.List < Expressions> expressions;

    @Query
    @NameInMap("ExpressionsLogicOperator")
    private String expressionsLogicOperator;

    @Query
    @NameInMap("GroupId")
    private Integer groupId;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("MetricType")
    private String metricType;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Period")
    private Integer period;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("Statistics")
    private String statistics;

    @Query
    @NameInMap("Threshold")
    private Float threshold;

    private ModifyAlarmRequest(Builder builder) {
        super(builder);
        this.alarmActions = builder.alarmActions;
        this.alarmTaskId = builder.alarmTaskId;
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
        this.statistics = builder.statistics;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAlarmRequest create() {
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

    public static final class Builder extends Request.Builder<ModifyAlarmRequest, Builder> {
        private java.util.List < String > alarmActions; 
        private String alarmTaskId; 
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
        private String statistics; 
        private Float threshold; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAlarmRequest request) {
            super(request);
            this.alarmActions = request.alarmActions;
            this.alarmTaskId = request.alarmTaskId;
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
            this.statistics = request.statistics;
            this.threshold = request.threshold;
        } 

        /**
         * The unique identifiers of the scaling rules that are associated with the event-triggered task.
         */
        public Builder alarmActions(java.util.List < String > alarmActions) {
            this.putQueryParameter("AlarmActions", alarmActions);
            this.alarmActions = alarmActions;
            return this;
        }

        /**
         * The ID of the event-triggered task.
         */
        public Builder alarmTaskId(String alarmTaskId) {
            this.putQueryParameter("AlarmTaskId", alarmTaskId);
            this.alarmTaskId = alarmTaskId;
            return this;
        }

        /**
         * The operator that is used to compare the metric value and the metric threshold. Valid values:
         * <p>
         * 
         * *   If the metric value is greater than or equal to the metric threshold, set the value to `>=`.
         * *   If the metric value is less than or equal to the metric threshold, set the value to `<=`.
         * *   If the metric value is greater than the metric threshold, set the value to `>`.
         * *   If the metric value is less than the metric threshold, set the value to `<`.
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
         * The dimensions of the metric.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The effective period of the event-triggered task.
         * <p>
         * 
         * The Effective value follows the cron expression format. The default format is `X X X X X ?`. In the format:
         * 
         * *   X: a placeholder for a field, which represents seconds, minutes, hours, days, and months in sequence. X can be a definite value or a special character that has logical meaning. For information about the valid values of X, see [Cron expression](~~25907~~).
         * *   ?: No value is specified.
         * 
         * > By default, the value of this parameter is specified in **UTC+8**. You can specify the time zone in the `TZ=+yy` format before a cron expression. y indicates the time zone. For example, `TZ=+00 * * 1-2 * * ?` specifies that the event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.
         * 
         * Examples:
         * 
         * *   ` * * * * * ?  `: The event-triggered task is in effect at all times.
         * *   ` * * 17-18 * * ?  `: The event-triggered task is in effect between 17:00:00 and 18:59:00 (UTC+8) every day.
         * *   `TZ=+00 * * 1-2 * * ?`: The event-triggered task is in effect between 01:00:00 and 02:59:00 (UTC+0) every day.
         */
        public Builder effective(String effective) {
            this.putQueryParameter("Effective", effective);
            this.effective = effective;
            return this;
        }

        /**
         * The number of times that the threshold must be reached before a scaling rule can be executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is triggered.
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * The expressions that are specified in the multi-metric alert rule.
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
         * *   \`\`: An alert is triggered as long as one of the metrics in the multi-metric alert rule meets the trigger condition.
         * 
         * Default value: `&&`
         */
        public Builder expressionsLogicOperator(String expressionsLogicOperator) {
            this.putQueryParameter("ExpressionsLogicOperator", expressionsLogicOperator);
            this.expressionsLogicOperator = expressionsLogicOperator;
            return this;
        }

        /**
         * The ID of the application group to which the custom metric belongs. This parameter must be specified when MetricType is set to custom.
         */
        public Builder groupId(Integer groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The name of the metric. Valid values of MetricName vary based on the value of MetricType.
         * <p>
         * 
         * *   If you set MetricType to custom, the valid values of MetricName are your custom metrics.
         * 
         * *   If you set MetricType to system, MetricName has the following valid values:
         * 
         *     *   CpuUtilization: (ECS) the CPU utilization. Unit: %.
         *     *   IntranetTx: the outbound traffic over the internal network from an ECS instance. Unit: KB/min.
         *     *   IntranetRx: the inbound traffic over the internal network to an ECS instance. Unit: KB/min.
         *     *   VpcInternetTx: the outbound traffic over the Internet from an ECS instance that resides in a virtual private cloud (VPC). Unit: KB/min.
         *     *   VpcInternetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.
         *     *   SystemDiskReadBps: the number of bytes read from the system disk that is used by an ECS instance per second.
         *     *   SystemDiskWriteBps: the number of bytes written to the system disk that is used by an ECS instance per second.
         *     *   SystemDiskReadOps: the number of read operations on the system disk that is used by an ECS instance per second.
         *     *   SystemDiskWriteOps: the number of write operations on the system disk that is used by an ECS instance per second.
         *     *   CpuUtilizationAgent: the CPU utilization of an agent. Unit: %.
         *     *   GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory of an agent.
         *     *   GpuMemoryUtilizationAgent: the GPU memory usage of an agent. Unit: %.
         *     *   MemoryUtilization: the memory usage of an agent. Unit: %.
         *     *   LoadAverage: the average system load of an agent.
         *     *   TcpConnection: the total number of TCP connections of an agent.
         *     *   TcpConnection: the number of established TCP connections of an agent.
         *     *   PackagesNetOut: the number of packets that are sent by the internal network interface controller (NIC) used by an agent.
         *     *   PackagesNetIn: the number of packets that are received by the internal NIC used by an agent.
         *     *   EciPodCpuUtilization: the CPU utilization of an elastic container instance. Unit: %.
         *     *   EciPodMemoryUtilization: the memory usage of an elastic container instance. Unit: %.
         * 
         * For more information, see [Event-triggered task for system monitoring](~~74854~~).
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
         * The period of time during which statistics about the metric is collected. Unit: seconds. Valid values:
         * <p>
         * 
         * *   15
         * *   60
         * *   120
         * *   300
         * *   900
         * 
         * > If your scaling group is of the ECS type and uses CloudMonitor metrics, you can set Period to 15. In other cases, you can set Period to 60, 120, 300, or 900. In most cases, the name of a CloudMonitor metric contains Agent.
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * The region ID of the event-triggered task.
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
         * The method that is used to aggregate statistics for the metric. Valid values:
         * <p>
         * 
         * *   Average
         * *   Minimum
         * *   Maximum
         */
        public Builder statistics(String statistics) {
            this.putQueryParameter("Statistics", statistics);
            this.statistics = statistics;
            return this;
        }

        /**
         * The threshold of a metric in the multi-metric alert rule. If the threshold is reached the specified number of times within the specified period, a scaling rule is executed.
         */
        public Builder threshold(Float threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public ModifyAlarmRequest build() {
            return new ModifyAlarmRequest(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @NameInMap("DimensionKey")
        private String dimensionKey;

        @NameInMap("DimensionValue")
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
             * The dimension key of the metric. Valid values of DimensionKey vary based on the value of MetricType.
             * <p>
             * 
             * *   If you set MetricType to custom, you can specify this parameter based on your business requirements.
             * 
             * *   If you set MetricType to system, DimensionKey has the following valid values:
             * 
             *     *   user_id: the ID of your Alibaba Cloud account
             *     *   scaling_group: the scaling group that is monitored by the event-triggered task.
             *     *   device: the type of the NIC.
             *     *   state: the state of the TCP connection
             */
            public Builder dimensionKey(String dimensionKey) {
                this.dimensionKey = dimensionKey;
                return this;
            }

            /**
             * The dimension value of the metric. Valid values of DimensionValue vary based on the value of DimensionKey.
             * <p>
             * 
             * *   If you set MetricType to custom, you can specify this parameter based on your business requirements.
             * 
             * *   If you set MetricType to system, DimensionKey has the following valid values:
             * 
             *     *   user_id: The system specifies the value.
             * 
             *     *   scaling_group: The system specifies the value.
             * 
             *     *   If you set DimensionKey to device, you can set DimensionValue to eth0 or eth1.
             * 
             *         *   For instances that reside in the classic network, eth0 specifies the internal NIC. Only one eth0 NIC exists on each instance that resides in a VPC.
             *         *   For instances that reside in the classic network, eth1 specifies the public NIC.
             * 
             *     *   If you set DimensionKey to state, you can set DimensionValue to TCP_TOTAL or ESTABLISHED.
             * 
             *         *   TCP_TOTAL specifies the total number of TCP connections.
             *         *   ESTABLISHED specifies the number of established TCP connections.
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
        @NameInMap("ComparisonOperator")
        private String comparisonOperator;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Period")
        private Integer period;

        @NameInMap("Statistics")
        private String statistics;

        @NameInMap("Threshold")
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
             * The operator that is used to compare the metric value and the metric threshold. Valid values:
             * <p>
             * 
             * *   If the metric value is greater than or equal to the metric threshold, set the value to `>=`.
             * *   If the metric value is less than or equal to the metric threshold, set the value to `<=`.
             * *   If the metric value is greater than the metric threshold, set the value to `>`.
             * *   If the metric value is less than the metric threshold, set the value to `<`.
             * 
             * Default value: >=
             */
            public Builder comparisonOperator(String comparisonOperator) {
                this.comparisonOperator = comparisonOperator;
                return this;
            }

            /**
             * The name of the metric that is specified in the multi-metric alert rule. Valid values of MetricName vary based on the value of MetricType.
             * <p>
             * 
             * *   If you set MetricType to custom, the valid values of MetricName are your custom metrics.
             * 
             * *   If you set MetricType to system, MetricName has the following valid values:
             * 
             *     *   CpuUtilization: (ECS) the CPU utilization. Unit: %.
             *     *   IntranetTx: the outbound traffic over the internal network from an ECS instance. Unit: KB/min.
             *     *   IntranetRx: the inbound traffic over the internal network to an ECS instance. Unit: KB/min.
             *     *   VpcInternetTx: the outbound traffic over the Internet from an ECS instance that resides in a VPC. Unit: KB/min.
             *     *   VpcInternetRx: the inbound traffic over the Internet to an ECS instance that resides in a VPC. Unit: KB/min.
             *     *   SystemDiskReadBps: the number of bytes read from the system disk that is used by an ECS instance per second.
             *     *   SystemDiskWriteBps: the number of bytes written to the system disk that is used by an ECS instance per second.
             *     *   SystemDiskReadOps: the number of read operations on the system disk that is used by an ECS instance per second.
             *     *   SystemDiskWriteOps: the number of write operations on the system disk that is used by an ECS instance per second.
             *     *   CpuUtilizationAgent: the CPU utilization of an agent. Unit: %.
             *     *   GpuUtilizationAgent: the GPU utilization of an agent. Unit: %.
             *     *   GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory of an agent.
             *     *   GpuMemoryUtilizationAgent: the GPU memory usage of an agent. Unit: %.
             *     *   MemoryUtilization: the memory usage of an agent. Unit: %.
             *     *   LoadAverage: the average system load of an agent.
             *     *   TcpConnection: the total number of TCP connections of an agent.
             *     *   TcpConnection: the number of established TCP connections of an agent.
             *     *   PackagesNetOut: the number of packets that are sent by the internal NIC used by an agent.
             *     *   PackagesNetIn: the number of packets that are received by the internal NIC used by an agent.
             *     *   EciPodCpuUtilization: the CPU utilization of an elastic container instance. Unit: %.
             *     *   EciPodMemoryUtilization: the memory usage of an elastic container instance. Unit: %.
             * 
             * For more information, see [Event-triggered task for system monitoring](~~74854~~).
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The period of time during which the statistics of a metric in the multi-metric alert rule is collected. Unit: seconds. Valid values:
             * <p>
             * 
             * *   15
             * *   60
             * *   120
             * *   300
             * *   900
             * 
             * > If your scaling group is of the ECS type and uses CloudMonitor metrics, you can set Period to 15. In other cases, you can set Period to 60, 120, 300, or 900. In most cases, the name of a CloudMonitor metric contains Agent.
             * 
             * Default value: 300
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * The method that is used to aggregate the statistics of a metric that is specified in the multi-metric alert rule. Valid values:
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
             * The threshold of a metric in the multi-metric alert rule. If the threshold is reached the specified number of times within the specified period, a scaling rule is executed.
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
