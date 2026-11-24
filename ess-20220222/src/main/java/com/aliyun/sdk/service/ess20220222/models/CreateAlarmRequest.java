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
 * {@link CreateAlarmRequest} extends {@link RequestModel}
 *
 * <p>CreateAlarmRequest</p>
 */
public class CreateAlarmRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmActions")
    private java.util.List<String> alarmActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComparisonOperator")
    private String comparisonOperator;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List<Dimensions> dimensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Effective")
    private String effective;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EvaluationCount")
    private Integer evaluationCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Expressions")
    private java.util.List<Expressions> expressions;

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
    public java.util.List<String> getAlarmActions() {
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
        private java.util.List<String> alarmActions; 
        private String comparisonOperator; 
        private String description; 
        private java.util.List<Dimensions> dimensions; 
        private String effective; 
        private Integer evaluationCount; 
        private java.util.List<Expressions> expressions; 
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
         * <p>The list of unique identifiers of the scaling rules associated with the event-triggered task.</p>
         */
        public Builder alarmActions(java.util.List<String> alarmActions) {
            this.putQueryParameter("AlarmActions", alarmActions);
            this.alarmActions = alarmActions;
            return this;
        }

        /**
         * <p>The comparison operator used to compare the aggregated metric value with the threshold. This operator specifies the condition under which the threshold is met. Valid values:</p>
         * <ul>
         * <li><blockquote>
         * <p>=: The aggregated metric value is greater than or equal to the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;=: The aggregated metric value is less than or equal to the threshold.</li>
         * <li><blockquote>
         * <p>: The aggregated metric value is greater than the threshold.</p>
         * </blockquote>
         * </li>
         * <li>&lt;: The aggregated metric value is less than the threshold.</li>
         * </ul>
         * <p>Default value: &gt;=.</p>
         * 
         * <strong>example:</strong>
         * <blockquote>
         * <p>=</p>
         * </blockquote>
         */
        public Builder comparisonOperator(String comparisonOperator) {
            this.putQueryParameter("ComparisonOperator", comparisonOperator);
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
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The dimension information associated with the metric.</p>
         */
        public Builder dimensions(java.util.List<Dimensions> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>Specifies the effective period of the event-triggered task. By default, the task takes effect at all times.</p>
         * <p>This parameter follows the cron expression format. The default format is <code>X X X X X ?</code>, which is described as follows:</p>
         * <ul>
         * <li><p>X: a placeholder for a field, representing seconds, minutes, hours, day of month, and month in sequence. X can be a specific value or a special character with logical meaning. For more information about the valid values of X, see <a href="https://help.aliyun.com/document_detail/25907.html">Cron expressions</a>.</p>
         * </li>
         * <li><p>?: indicates that no value is specified.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The specified value of this parameter <strong>defaults to the UTC+8 time zone</strong>. You can add the time zone information <code>TZ=+yy</code> before the cron expression to specify a time zone, where y represents the time zone offset. For example, <code>TZ=+00 * * 1-2 * * ?</code> indicates that the event-triggered task takes effect between 01:00 and 02:59 every day in the UTC+0 time zone.</p>
         * </blockquote>
         * <p>Examples and their meanings:</p>
         * <ul>
         * <li><p><code>* * * * * ?</code>: takes effect at all times.</p>
         * </li>
         * <li><p><code>* * 17-18 * * ?</code>: takes effect between 17:00 and 18:59 every day in the UTC+8 time zone.</p>
         * </li>
         * <li><p><code>TZ=+00 * * 1-2 * * ?</code>: takes effect between 01:00 and 02:59 every day in the UTC+0 time zone.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TZ=+00 * * 1-2 * * ?</p>
         */
        public Builder effective(String effective) {
            this.putQueryParameter("Effective", effective);
            this.effective = effective;
            return this;
        }

        /**
         * <p>The number of times that the threshold expression must be met to trigger a scaling rule. For example, if this parameter is set to 3, the scaling rule is triggered when the average CPU utilization is greater than or equal to 80% for three consecutive times.</p>
         * <p>Default value: 3.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder evaluationCount(Integer evaluationCount) {
            this.putQueryParameter("EvaluationCount", evaluationCount);
            this.evaluationCount = evaluationCount;
            return this;
        }

        /**
         * <p>The information about the multi-metric alert rule.</p>
         */
        public Builder expressions(java.util.List<Expressions> expressions) {
            this.putQueryParameter("Expressions", expressions);
            this.expressions = expressions;
            return this;
        }

        /**
         * <p>The logical operator between multiple metric alert conditions. Valid values:</p>
         * <ul>
         * <li><code>&amp;&amp;</code>: An alert is triggered only when all monitoring metrics meet the alert conditions. That is, an alert is triggered only when all expressions in the multi-metric alert rule evaluate to <code>true</code>.</li>
         * <li><code>||</code>: An alert is triggered if any one of the metrics meets the alert condition.</li>
         * </ul>
         * <p>Default value: <code>&amp;&amp;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>&amp;&amp;</p>
         */
        public Builder expressionsLogicOperator(String expressionsLogicOperator) {
            this.putQueryParameter("ExpressionsLogicOperator", expressionsLogicOperator);
            this.expressionsLogicOperator = expressionsLogicOperator;
            return this;
        }

        /**
         * <p>The ID of the CloudMonitor application group to which the custom metric belongs. This parameter is required only when the metric type is custom.</p>
         * 
         * <strong>example:</strong>
         * <p>4055401</p>
         */
        public Builder groupId(Integer groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The name of the metric. The valid values vary based on the monitoring type of the event-triggered task:</p>
         * <ul>
         * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), the valid values are your custom metrics.</p>
         * </li>
         * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values: </p>
         * <ul>
         * <li><p>CpuUtilization: the CPU utilization of an ECS instance (%).</p>
         * </li>
         * <li><p>ConcurrentConnections: the number of concurrent connections to an ECS instance.</p>
         * </li>
         * <li><p>IntranetTx: the outbound internal network traffic of an ECS instance (Kb/min).</p>
         * </li>
         * <li><p>IntranetRx: the inbound internal network traffic of an ECS instance (Kb/min).</p>
         * </li>
         * <li><p>VpcInternetTx: the outbound Internet traffic of an ECS instance (Kb/min).</p>
         * </li>
         * <li><p>VpcInternetRx: the inbound Internet traffic of an ECS instance (Kb/min).</p>
         * </li>
         * <li><p>SystemDiskReadBps: the read BPS of the system cloud disk (Byte/s).</p>
         * </li>
         * <li><p>SystemDiskWriteBps: the write BPS of the system cloud disk (Byte/s).</p>
         * </li>
         * <li><p>SystemDiskReadOps: the read IOPS of the system cloud disk (operations/s).</p>
         * </li>
         * <li><p>SystemDiskWriteOps: the write IOPS of the system cloud disk (operations/s).</p>
         * </li>
         * <li><p>CpuUtilizationAgent: the CPU utilization monitored by the agent (%).</p>
         * </li>
         * <li><p>GpuUtilizationAgent: the GPU utilization monitored by the agent (%).</p>
         * </li>
         * <li><p>GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory monitored by the agent (%).</p>
         * </li>
         * <li><p>GpuMemoryUtilizationAgent: the GPU memory utilization monitored by the agent (%).</p>
         * </li>
         * <li><p>MemoryUtilization: the memory utilization monitored by the agent (%).</p>
         * </li>
         * <li><p>LoadAverage: the average system load monitored by the agent.</p>
         * </li>
         * <li><p>TcpConnection: the total number of TCP connections monitored by the agent.</p>
         * </li>
         * <li><p>TcpConnection: the number of established TCP connections monitored by the agent.</p>
         * </li>
         * <li><p>PackagesNetOut: the number of packets sent by the internal NIC per second monitored by the agent (packets/s).</p>
         * </li>
         * <li><p>PackagesNetIn: the number of packets received by the internal NIC per second monitored by the agent (packets/s).</p>
         * </li>
         * <li><p>PackagesNetOut: the number of packets sent by the public NIC per second monitored by the agent (packets/s).</p>
         * </li>
         * <li><p>PackagesNetIn: the number of packets received by the public NIC per second monitored by the agent (packets/s).</p>
         * </li>
         * <li><p>EciPodCpuUtilization: the CPU utilization (%).</p>
         * </li>
         * <li><p>EciPodMemoryUtilization: the memory utilization (%).</p>
         * </li>
         * <li><p>LoadBalancerRealServerAverageQps: the average QPS per backend server in an ALB server group (queries/s).</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>CpuUtilization</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The type of the metric. Valid values:</p>
         * <ul>
         * <li>system: uses system metrics of CloudMonitor.</li>
         * <li>custom: uses custom metrics reported to CloudMonitor.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        public Builder metricType(String metricType) {
            this.putQueryParameter("MetricType", metricType);
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
         * <p>The epoch for aggregating monitoring metric data. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60</li>
         * <li>120</li>
         * <li>300</li>
         * <li>900</li>
         * </ul>
         * <blockquote>
         * <p>Only scaling groups of the ECS instance type support a 15-second statistical period.</p>
         * </blockquote>
         * <p>Default value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID of the scaling group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The ID of the scaling group associated with the event-triggered task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp18p2yfxow2dloq****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.putQueryParameter("ScalingGroupId", scalingGroupId);
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        /**
         * <p>The method for aggregating metric data. Valid values:</p>
         * <ul>
         * <li>Average: the average value.</li>
         * <li>Minimum: the minimum value.</li>
         * <li>Maximum: the maximum value.</li>
         * </ul>
         * <p>Default value: Average.</p>
         * 
         * <strong>example:</strong>
         * <p>Average</p>
         */
        public Builder statistics(String statistics) {
            this.putQueryParameter("Statistics", statistics);
            this.statistics = statistics;
            return this;
        }

        /**
         * <p>The threshold of the monitoring metrics. When the monitoring threshold expression is met for a specified number of times, it triggers the execution of a scaling rule.</p>
         * 
         * <strong>example:</strong>
         * <p>80.0</p>
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

    /**
     * 
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
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
             * <p>The key of the dimension information associated with the metric. Valid values vary based on the monitoring type of the event-triggered task:</p>
             * <ul>
             * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), the valid values are not limited and can be specified by you.</p>
             * </li>
             * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values:</p>
             * <ul>
             * <li>user_id: the ID of your account.</li>
             * <li>scaling_group: the monitored scaling group.</li>
             * <li>device: the type of the network interface controller (NIC) device.</li>
             * <li>state: the state of the TCP connection.</li>
             * <li>rulePool: the ALB server group specified for the QPS monitoring metrics.</li>
             * </ul>
             * </li>
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
             * <p>The value of the dimension information associated with the metric. Valid values vary based on Dimensions.DimensionKey:</p>
             * <ul>
             * <li><p>If Dimensions.DimensionKey is custom, which means the event-triggered task is of the custom monitoring type (MetricType=custom), the valid values are not limited and can be specified by you.</p>
             * </li>
             * <li><p>If Dimensions.DimensionKey is within the system-specified range, which means the event-triggered task is of the system monitoring type (MetricType=system), valid values:</p>
             * <ul>
             * <li><p>user_id: automatically populated by the system.</p>
             * </li>
             * <li><p>scaling_group: automatically populated by the system.</p>
             * </li>
             * <li><p>device:</p>
             * <ul>
             * <li><p>eth0: For classic network instances, eth0 represents the internal NIC. For VPC-connected instances, only the eth0 NIC exists.</p>
             * </li>
             * <li><p>eth1: For classic network instances, eth1 represents the public NIC.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p>state:</p>
             * <ul>
             * <li><p>TCP_TOTAL: the total number of TCP connections.</p>
             * </li>
             * <li><p>ESTABLISHED: the number of established TCP connections.</p>
             * </li>
             * </ul>
             * </li>
             * <li><p>rulePool: the ID of the ALB server group. Example: sgp-xxxxx.</p>
             * </li>
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
     * {@link CreateAlarmRequest} extends {@link TeaModel}
     *
     * <p>CreateAlarmRequest</p>
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
             * <p>The comparison operator used to compare the aggregated metric value with the threshold for the multi-metric alert rule. This operator specifies the condition under which the threshold is met. Valid values:</p>
             * <ul>
             * <li><blockquote>
             * <p>=: The aggregated metric value is greater than or equal to the threshold.</p>
             * </blockquote>
             * </li>
             * <li>&lt;=: The aggregated metric value is less than or equal to the threshold.</li>
             * <li><blockquote>
             * <p>: The aggregated metric value is greater than the threshold.</p>
             * </blockquote>
             * </li>
             * <li>&lt;: The aggregated metric value is less than the threshold.</li>
             * </ul>
             * <p>Default value: &gt;=.</p>
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
             * <p>The name of the monitoring metrics for the multi-metric alert rule. Valid values vary based on the monitoring type of the event-triggered task:</p>
             * <ul>
             * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), the valid values are your custom metrics.</p>
             * </li>
             * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values: </p>
             * <ul>
             * <li><p>CpuUtilization: the CPU utilization of an ECS instance (%).</p>
             * </li>
             * <li><p>ConcurrentConnections: the number of concurrent connections to an ECS instance.</p>
             * </li>
             * <li><p>IntranetTx: the outbound internal network traffic of an ECS instance (Kb/min).</p>
             * </li>
             * <li><p>IntranetRx: the inbound internal network traffic of an ECS instance (Kb/min).</p>
             * </li>
             * <li><p>VpcInternetTx: the outbound Internet traffic of an ECS instance (Kb/min).</p>
             * </li>
             * <li><p>VpcInternetRx: the inbound Internet traffic of an ECS instance (Kb/min).</p>
             * </li>
             * <li><p>SystemDiskReadBps: the read BPS of the system cloud disk (Byte/s).</p>
             * </li>
             * <li><p>SystemDiskWriteBps: the write BPS of the system cloud disk (Byte/s).</p>
             * </li>
             * <li><p>SystemDiskReadOps: the read IOPS of the system cloud disk (operations/s).</p>
             * </li>
             * <li><p>SystemDiskWriteOps: the write IOPS of the system cloud disk (operations/s).</p>
             * </li>
             * <li><p>CpuUtilizationAgent: the CPU utilization monitored by the agent (%).</p>
             * </li>
             * <li><p>GpuUtilizationAgent: the GPU utilization monitored by the agent (%).</p>
             * </li>
             * <li><p>GpuMemoryFreeUtilizationAgent: the percentage of idle GPU memory monitored by the agent (%).</p>
             * </li>
             * <li><p>GpuMemoryUtilizationAgent: the GPU memory utilization monitored by the agent (%).</p>
             * </li>
             * <li><p>MemoryUtilization: the memory utilization monitored by the agent (%).</p>
             * </li>
             * <li><p>LoadAverage: the average system load monitored by the agent.</p>
             * </li>
             * <li><p>TcpConnection: the total number of TCP connections monitored by the agent.</p>
             * </li>
             * <li><p>TcpConnection: the number of established TCP connections monitored by the agent.</p>
             * </li>
             * <li><p>PackagesNetOut: the number of packets sent by the internal network interface controller (NIC) per second monitored by the agent (packets/s).</p>
             * </li>
             * <li><p>PackagesNetIn: the number of packets received by the internal network interface controller (NIC) per second monitored by the agent (packets/s).</p>
             * </li>
             * <li><p>PackagesNetOut: the number of packets sent by the public network interface controller (NIC) per second monitored by the agent (packets/s).</p>
             * </li>
             * <li><p>PackagesNetIn: the number of packets received by the public network interface controller (NIC) per second monitored by the agent (packets/s).</p>
             * </li>
             * <li><p>EciPodCpuUtilization: the CPU utilization (%).</p>
             * </li>
             * <li><p>EciPodMemoryUtilization: the memory utilization (%).</p>
             * </li>
             * <li><p>LoadBalancerRealServerAverageQps: the average QPS per backend server in an ALB server group (queries/s).</p>
             * </li>
             * </ul>
             * </li>
             * </ul>
             * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">System monitoring event-triggered tasks</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>CpuUtilization</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The epoch for aggregating monitoring metric data in the multi-metric alert rule. Unit: seconds. Valid values:</p>
             * <ul>
             * <li>15</li>
             * <li>60</li>
             * <li>120</li>
             * <li>300</li>
             * <li>900</li>
             * </ul>
             * <blockquote>
             * <p>Only scaling groups of the ECS instance type support a 15-second statistical period.</p>
             * </blockquote>
             * <p>Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>900</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The method for aggregating metric data in the multi-metric alert rule. Valid values:</p>
             * <ul>
             * <li>Average: the average value.</li>
             * <li>Minimum: the minimum value.</li>
             * <li>Maximum: the maximum value.</li>
             * </ul>
             * <p>Default value: Average.</p>
             * 
             * <strong>example:</strong>
             * <p>Average</p>
             */
            public Builder statistics(String statistics) {
                this.statistics = statistics;
                return this;
            }

            /**
             * <p>The threshold of the monitoring metrics in the multi-metric alert rule. When the monitoring threshold expression is met for a specified number of times, it triggers the execution of a scaling rule.</p>
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
}
