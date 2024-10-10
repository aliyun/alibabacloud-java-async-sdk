// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

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
         * <p>The list of unique identifiers of the scaling rules that are associated with the event-triggered task.</p>
         */
        public Builder alarmActions(java.util.List < String > alarmActions) {
            this.putQueryParameter("AlarmActions", alarmActions);
            this.alarmActions = alarmActions;
            return this;
        }

        /**
         * <p>The operator that is used to compare the metric value and the threshold. Valid values:</p>
         * <ul>
         * <li>If the metric value is greater than or equal to the threshold, set the value to: &gt;=.</li>
         * <li>If the metric value is less than or equal to the threshold, set the value to: &lt;=.</li>
         * <li>If the metric value is greater than the threshold, set the value to: &gt;.</li>
         * <li>If the metric value is less than the threshold, set the value to: &lt;.</li>
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
         * <p>The metric dimensions.</p>
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putQueryParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The effective period of the event-triggered task. By default, the event-triggered task is in effect all the time.</p>
         * <p>This parameter follows the cron expression format. The default format is <code>X X X X X ?</code>. In the format:</p>
         * <ul>
         * <li>X: a placeholder for a field, which represents seconds, minutes, hours, days, and months in sequence. X can be a definite value or a special character that has logical meaning. For information about the valid values of X, see <a href="https://help.aliyun.com/document_detail/25907.html">Cron expression</a>.</li>
         * <li>?: No value is specified.</li>
         * </ul>
         * <blockquote>
         * <p>By default, this parameter value is specified in <strong>UTC+8</strong>. You can specify the time zone in the <code>TZ=+yy</code> format before a cron expression. y indicates the time zone. For example, <code>TZ=+00 * * 1-2 * * ?</code> specifies that the event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.</p>
         * </blockquote>
         * <p>Sample values:</p>
         * <ul>
         * <li><code>* * * * * ? </code>: The event-triggered task is in effect all the time.</li>
         * <li><code>* * 17-18 * * ? </code>: The event-triggered task is in effect between 17:00 and 18:59 (UTC+8) every day.</li>
         * <li><code>TZ=+00 * * 1-2 * * ?</code>: The event-triggered task is in effect between 01:00 and 02:59 (UTC+0) every day.</li>
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
         * <p>The number of times that the threshold must be reached before a scaling rule can be executed. For example, if you set this parameter to 3, the average CPU utilization must reach or exceed 80% three times in a row before a scaling rule is triggered.</p>
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
         * <p>The information about the multi-metric alert rules.</p>
         */
        public Builder expressions(java.util.List < Expressions> expressions) {
            this.putQueryParameter("Expressions", expressions);
            this.expressions = expressions;
            return this;
        }

        /**
         * <p>The relationship between the trigger conditions in the multi-metric alert rule. Valid values:</p>
         * <ul>
         * <li><code>&amp;&amp;</code>: An alert is triggered only if all metrics in the multi-metric alert rule meet the trigger conditions. In this case, an alert is triggered only if the results of all trigger conditions that are specified in the multi-metric alert rule are <code>true</code>.</li>
         * <li><code>||</code>: An alert is triggered if one of the metrics in the multi-metric alert rule meets the trigger conditions.</li>
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
         * <p>The ID of the application group to which the custom metric belongs. If you set the MetricType parameter to custom, you must specify this parameter.</p>
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
         * <p>The metric name. The valid values of this parameter vary based on the metric type.</p>
         * <ul>
         * <li><p>If you set MetricType to custom, the valid values are the metrics that you have.</p>
         * </li>
         * <li><p>If you set MetricType to system, this parameter has the following valid values:</p>
         * <ul>
         * <li>CpuUtilization: the CPU utilization. Unit: %.</li>
         * <li>ConcurrentConnections: the number of concurrent connections.</li>
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
         * <li>PackagesNetOut: the number of packets sent by the internal network interface controller (NIC). Unit: counts/s.</li>
         * <li>PackagesNetIn: the number of packets received by the internal NIC. Unit: counts/s.</li>
         * <li>PackagesNetOut: the number of packets sent by the public NIC. Unit: counts/s.</li>
         * <li>PackagesNetIn: the number of packets received by the public NIC. Unit: counts/s.</li>
         * <li>EciPodCpuUtilization: the CPU utilization. Unit: %.</li>
         * <li>EciPodMemoryUtilization: the memory usage. Unit: %.</li>
         * <li>LoadBalancerRealServerAverageQps: the queries per second (QPS) of an instance.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks of the system monitoring type</a>.</p>
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
         * <li>system: system metrics of CloudMonitor</li>
         * <li>custom: custom metrics that are reported to CloudMonitor</li>
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
         * <p>The statistical period of the metric data. Unit: seconds. Valid values:</p>
         * <ul>
         * <li>15</li>
         * <li>60</li>
         * <li>120</li>
         * <li>300</li>
         * <li>900</li>
         * </ul>
         * <blockquote>
         * <p> You can set this parameter to 15 seconds only for scaling groups of the ECS type.</p>
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
         * <p>The scaling group ID of the event-triggered task.</p>
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
         * <p>The method that is used to aggregate statistics for the metric. Valid values:</p>
         * <ul>
         * <li>Average</li>
         * <li>Minimum</li>
         * <li>Maximum</li>
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
         * <p>The threshold of the metric value. If the threshold is reached the specified number of times within the specified period, a scaling rule is executed.</p>
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

            /**
             * <p>The dimension key of the metric. The valid values vary based on the metric type.</p>
             * <ul>
             * <li><p>If you set MetricType to custom, you can specify this parameter based on your business requirements.</p>
             * </li>
             * <li><p>If you set MetricType to system, this parameter has the following valid values:</p>
             * <ul>
             * <li>user_id: the ID of your Alibaba Cloud account.</li>
             * <li>scaling_group: the scaling group that you want to monitor by using the event-triggered task.</li>
             * <li>device: the NIC type.</li>
             * <li>state: the status of the TCP connection.</li>
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
             * <p>The dimension value of the metric. The valid values of this parameter vary based on the value of Dimensions.DimensionKey.</p>
             * <ul>
             * <li><p>If you set MetricType to custom, you can specify this parameter based on your business requirements.</p>
             * </li>
             * <li><p>If you set MetricType to system, this parameter has the following valid values:</p>
             * <ul>
             * <li><p>user_id: The system specifies the value.</p>
             * </li>
             * <li><p>scaling_group: The system specifies the value.</p>
             * </li>
             * <li><p>device: You can set this parameter to eth0 or eth1.</p>
             * <ul>
             * <li>For instances of the classic network type, eth0 specifies the internal NIC. Only one eth0 NIC exists on each instance that resides in VPCs.</li>
             * <li>For instances of the classic network type, eth1 specifies the public NIC.</li>
             * </ul>
             * </li>
             * <li><p>state: You can set this parameter to TCP_TOTAL or ESTABLISHED.</p>
             * <ul>
             * <li>TCP_TOTAL specifies the total number of TCP connections.</li>
             * <li>ESTABLISHED specifies the number of TCP connections that are established.</li>
             * </ul>
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

            /**
             * <p>The operator that you want to use to compare the metric value and the threshold in the multi-metric alert rule. Valid values:</p>
             * <ul>
             * <li>If the metric value is greater than or equal to the threshold, set the value to &gt;=.</li>
             * <li>If the metric value is less than or equal to the metric threshold, set the value to &lt;=.</li>
             * <li>If the metric value is greater than the metric threshold, set the value to &gt;.</li>
             * <li>If the metric value is less than the metric threshold, set the value to &lt;.</li>
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
             * <p>The names of the metrics in the multi-metric alert rule. The valid values of this parameter vary based on the metric type.</p>
             * <ul>
             * <li><p>If you set MetricType to custom, the valid values are the metrics that you have.</p>
             * </li>
             * <li><p>If you set MetricType to system, this parameter has the following valid values:</p>
             * <ul>
             * <li>CpuUtilization: the CPU utilization. Unit: %.</li>
             * <li>ConcurrentConnections: the number of concurrent connections.</li>
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
             * </li>
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
             * <p> You can set this parameter to 15 seconds only for scaling groups of the ECS type.</p>
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
             * <p>The method that you want to use to aggregate the metric data in the multi-metric alert rule. Valid values:</p>
             * <ul>
             * <li>Average: the average value.</li>
             * <li>Minimum: the minimum value</li>
             * <li>Maximum: the maximum value</li>
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
             * <p>The threshold of the metric value in the multi-metric alert rule. If the threshold is reached the specified number of times within the statistical period, a scaling rule is executed.</p>
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
