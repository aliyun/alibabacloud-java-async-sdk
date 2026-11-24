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
 * {@link ModifyAlarmRequest} extends {@link RequestModel}
 *
 * <p>ModifyAlarmRequest</p>
 */
public class ModifyAlarmRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmActions")
    private java.util.List<String> alarmActions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlarmTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alarmTaskId;

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
    @com.aliyun.core.annotation.NameInMap("Statistics")
    private String statistics;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
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
        private java.util.List<String> alarmActions; 
        private String alarmTaskId; 
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
         * <p>The list of unique identifiers of the scaling rules associated with the event-triggered task.</p>
         */
        public Builder alarmActions(java.util.List<String> alarmActions) {
            this.putQueryParameter("AlarmActions", alarmActions);
            this.alarmActions = alarmActions;
            return this;
        }

        /**
         * <p>The ID of the event-triggered task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1hvbnmkl10vll5****_f95ce797-dc2e-4bad-9618-14fee7d1****</p>
         */
        public Builder alarmTaskId(String alarmTaskId) {
            this.putQueryParameter("AlarmTaskId", alarmTaskId);
            this.alarmTaskId = alarmTaskId;
            return this;
        }

        /**
         * <p>The comparison operator between the statistical value and the threshold of the metric. The comparison operator indicates the relationship in which the statistical value and the threshold can satisfy the condition. Valid values:</p>
         * <ul>
         * <li>The statistical value is greater than or equal to the threshold. Value: <code>&gt;=</code>.</li>
         * <li>The statistical value is less than or equal to the threshold. Value: <code>&lt;=</code>.</li>
         * <li>The statistical value is greater than the threshold. Value: <code>&gt;</code>.</li>
         * <li>The statistical value is less than the threshold. Value: <code>&lt;</code>.</li>
         * </ul>
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
         * <p>Specifies the effective period of the event-triggered task.</p>
         * <p>This parameter follows cron expressions. The default format is <code>X X X X X ?</code>, where:</p>
         * <ul>
         * <li><p>X: a placeholder for a field, which sequentially represents seconds, minutes, hours, day, and month. X can be a specific value or a special character with logical meaning. For more information about the valid values of X, see <a href="https://help.aliyun.com/document_detail/25907.html">Cron expression</a>.</p>
         * </li>
         * <li><p>?: specifies no value.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>The value of this parameter is <strong>in the UTC+8 time zone by default</strong>. You can add time zone information <code>TZ=+yy</code> before the cron expression to specify a time zone, where y represents the numeric value of the time zone. For example, <code>TZ=+00 * * 1-2 * * ?</code> indicates that the event-triggered task takes effect between 01:00 and 02:59 every day in the UTC+0 time zone.</p>
         * </blockquote>
         * <p>Examples and descriptions:</p>
         * <ul>
         * <li><p><code>* * * * * ?  </code>: takes effect at all times.</p>
         * </li>
         * <li><p><code>* * 17-18 * * ? </code>: takes effect between 17:00 and 18:59 every day in the UTC+8 time zone.</p>
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
         * <p>The number of times that the threshold expression must be met before the scaling rule is triggered. For example, the average CPU utilization must be greater than or equal to 80% in three consecutive statistical results.</p>
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
         * <p>The monitoring metrics of the multi-metric event-triggered task.</p>
         */
        public Builder expressions(java.util.List<Expressions> expressions) {
            this.putQueryParameter("Expressions", expressions);
            this.expressions = expressions;
            return this;
        }

        /**
         * <p>The relationship between multiple monitoring metrics conditions. Valid values:</p>
         * <ul>
         * <li><code>&amp;&amp;</code>: An alert is triggered only when all monitoring metrics meet the alert conditions. An alert is triggered only when all expressions in the multi-metric event-triggered task evaluate to <code>true</code>.</li>
         * <li><code>||</code>: An alert is triggered when any monitoring metric meets the alert condition.</li>
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
         * <p>The ID of the CloudMonitor application group to which the custom metric belongs. This parameter is required only when MetricType is set to custom.</p>
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
         * <p>The name of the metric. Valid values vary based on the monitoring type of the event-triggered task: </p>
         * <ul>
         * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), valid values are your custom metrics.</p>
         * </li>
         * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values: </p>
         * <ul>
         * <li><p>CpuUtilization: (ECS) CPU utilization (%).</p>
         * </li>
         * <li><p>IntranetTx: (ECS) outbound traffic over the internal network (KByte/min).</p>
         * </li>
         * <li><p>IntranetRx: (ECS) inbound traffic over the internal network (KByte/min).</p>
         * </li>
         * <li><p>VpcInternetTx: (ECS) outbound traffic over the Internet (KByte/min).</p>
         * </li>
         * <li><p>VpcInternetRx: (ECS) inbound traffic over the Internet (KByte/min).</p>
         * </li>
         * <li><p>SystemDiskReadBps: (ECS) system cloud disk read BPS (Byte/s).</p>
         * </li>
         * <li><p>SystemDiskWriteBps: (ECS) system cloud disk write BPS (Byte/s).</p>
         * </li>
         * <li><p>SystemDiskReadOps: (ECS) system cloud disk read IOPS (count/s).</p>
         * </li>
         * <li><p>SystemDiskWriteOps: (ECS) system cloud disk write IOPS (count/s).</p>
         * </li>
         * <li><p>CpuUtilizationAgent: (Agent) CPU utilization (%).</p>
         * </li>
         * <li><p>GpuMemoryFreeUtilizationAgent: (Agent) GPU memory idle rate (%).</p>
         * </li>
         * <li><p>GpuMemoryUtilizationAgent: (Agent) GPU memory utilization (%).</p>
         * </li>
         * <li><p>MemoryUtilization: (Agent) memory utilization (%).</p>
         * </li>
         * <li><p>LoadAverage: (Agent) average system load.</p>
         * </li>
         * <li><p>TcpConnection: (Agent) total number of TCP connections.</p>
         * </li>
         * <li><p>TcpConnection: (Agent) number of established TCP connections.</p>
         * </li>
         * <li><p>PackagesNetOut: (Agent) number of packets sent by the NIC.</p>
         * </li>
         * <li><p>PackagesNetIn: (Agent) number of packets received by the NIC.</p>
         * </li>
         * <li><p>EciPodCpuUtilization: CPU utilization (%).</p>
         * </li>
         * <li><p>EciPodMemoryUtilization: memory utilization (%).</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/74854.html">Event-triggered tasks for system monitoring</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>MemoryUtilization</p>
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
            return this;
        }

        /**
         * <p>The type of the metric. Valid values:</p>
         * <ul>
         * <li>system: uses CloudMonitor system metrics.</li>
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
         * <p>alarmtask****</p>
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
         * <p>The statistical period for the metric data, in seconds. Valid values:</p>
         * <ul>
         * <li><ol start="15">
         * <li></li>
         * </ol>
         * </li>
         * <li><ol start="60">
         * <li></li>
         * </ol>
         * </li>
         * <li><ol start="120">
         * <li></li>
         * </ol>
         * </li>
         * <li><ol start="300">
         * <li></li>
         * </ol>
         * </li>
         * <li><ol start="900">
         * <li></li>
         * </ol>
         * </li>
         * </ul>
         * <blockquote>
         * <p>A statistical period of 15 seconds is applicable only to metrics collected by the CloudMonitor agent (metrics that start with Agent) when monitoring ECS-type scaling groups. For all other metrics, the statistical period can be set to 60, 120, 300, or 900 seconds.</p>
         * </blockquote>
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
         * <p>The region ID of the event-triggered task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-qingdao</p>
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
         * <p>The method used to aggregate the metric data. Valid values:</p>
         * <ul>
         * <li>Average: average value.</li>
         * <li>Minimum: minimum value.</li>
         * <li>Maximum: maximum value.</li>
         * </ul>
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
         * <p>The threshold of the monitoring metrics in a multi-metric event-triggered task. The scaling rule is executed when the threshold expression is met the specified number of times.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
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

    /**
     * 
     * {@link ModifyAlarmRequest} extends {@link TeaModel}
     *
     * <p>ModifyAlarmRequest</p>
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
             * <p>The key of the dimension information associated with the metric. Valid values vary based on the monitoring type of the event-triggered node:</p>
             * <ul>
             * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), valid values are not restricted. You can specify custom values.</p>
             * </li>
             * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values:</p>
             * <ul>
             * <li>user_id: your account ID.</li>
             * <li>scaling_group: the scaling group to be monitored.</li>
             * <li>device: the type of the network interface controller (NIC) device.</li>
             * <li>state: the state of the TCP connection.</li>
             * <li>rulePool: the server group specified for the ALB QPS monitoring metrics.</li>
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
             * <p>The value of the dimension information associated with the metric. Valid values are determined by Dimension.N.DimensionKey:</p>
             * <ul>
             * <li><p>If Dimension.N.DimensionKey is set to a custom value, which means the event-triggered task is of the custom monitoring type (MetricType=custom), valid values are not restricted. You can specify custom values.</p>
             * </li>
             * <li><p>If Dimension.N.DimensionKey is set to a system-specified value, which means the event-triggered task is of the system monitoring type (MetricType=system), valid values:</p>
             * <ul>
             * <li><p>user_id: automatically populated by the system.</p>
             * </li>
             * <li><p>scaling_group: automatically populated by the system.</p>
             * </li>
             * <li><p>device:</p>
             * <ul>
             * <li>eth0: for classic network instances, eth0 represents the internal NIC. For VPC-connected instances, only the eth0 NIC exists.</li>
             * <li>eth1: for classic network instances, eth1 represents the public NIC.</li>
             * </ul>
             * </li>
             * <li><p>state:</p>
             * <ul>
             * <li>TCP_TOTAL: the total number of TCP connections.</li>
             * <li>ESTABLISHED: the number of established TCP connections.</li>
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
     * {@link ModifyAlarmRequest} extends {@link TeaModel}
     *
     * <p>ModifyAlarmRequest</p>
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
             * <p>The comparison operator between the statistical value and the threshold of the metric. The comparison operator indicates the relationship in which the statistical value and the threshold can satisfy the condition. Valid values:</p>
             * <ul>
             * <li>The statistical value is greater than or equal to the threshold. Value: <code>&gt;=</code>.</li>
             * <li>The statistical value is less than or equal to the threshold. Value: <code>&lt;=</code>.</li>
             * <li>The statistical value is greater than the threshold. Value: <code>&gt;</code>.</li>
             * <li>The statistical value is less than the threshold. Value: <code>&lt;</code>.</li>
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
             * <p>The name of the monitoring metric in the multi-metric event-triggered node. Valid values vary based on the monitoring type of the event-triggered task: </p>
             * <ul>
             * <li><p>If the event-triggered task is of the custom monitoring type (MetricType=custom), valid values are your custom monitoring metrics.</p>
             * </li>
             * <li><p>If the event-triggered task is of the system monitoring type (MetricType=system), valid values: </p>
             * <ul>
             * <li><p>CpuUtilization: (ECS) CPU utilization (%).</p>
             * </li>
             * <li><p>IntranetTx: (ECS) outbound traffic over the internal network (KByte/min).</p>
             * </li>
             * <li><p>IntranetRx: (ECS) inbound traffic over the internal network (KByte/min).</p>
             * </li>
             * <li><p>VpcInternetTx: (ECS) outbound traffic over the Internet (KByte/min).</p>
             * </li>
             * <li><p>VpcInternetRx: (ECS) inbound traffic over the Internet (KByte/min).</p>
             * </li>
             * <li><p>SystemDiskReadBps: (ECS) system cloud disk read BPS (Byte/s).</p>
             * </li>
             * <li><p>SystemDiskWriteBps: (ECS) system cloud disk write BPS (Byte/s).</p>
             * </li>
             * <li><p>SystemDiskReadOps: (ECS) system cloud disk read IOPS (count/s).</p>
             * </li>
             * <li><p>SystemDiskWriteOps: (ECS) system cloud disk write IOPS (count/s).</p>
             * </li>
             * <li><p>CpuUtilizationAgent: (Agent) CPU utilization (%).</p>
             * </li>
             * <li><p>GpuUtilizationAgent: (Agent) GPU utilization (%).</p>
             * </li>
             * <li><p>GpuMemoryFreeUtilizationAgent: (Agent) GPU memory idle rate (%).</p>
             * </li>
             * <li><p>GpuMemoryUtilizationAgent: (Agent) GPU memory utilization (%).</p>
             * </li>
             * <li><p>MemoryUtilization: (Agent) memory utilization (%).</p>
             * </li>
             * <li><p>LoadAverage: (Agent) average system load.</p>
             * </li>
             * <li><p>TcpConnection: (Agent) total number of TCP connections.</p>
             * </li>
             * <li><p>TcpConnection: (Agent) number of established TCP connections.</p>
             * </li>
             * <li><p>PackagesNetOut: (Agent) number of packets sent by the network interface controller (NIC).</p>
             * </li>
             * <li><p>PackagesNetIn: (Agent) number of packets received by the network interface controller (NIC).</p>
             * </li>
             * <li><p>EciPodCpuUtilization: CPU utilization (%).</p>
             * </li>
             * <li><p>EciPodMemoryUtilization: memory utilization (%).</p>
             * </li>
             * </ul>
             * </li>
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
             * <p>The statistical period for the metric data in the multi-metric event-triggered task, in seconds. Valid values:</p>
             * <ul>
             * <li><ol start="15">
             * <li></li>
             * </ol>
             * </li>
             * <li><ol start="60">
             * <li></li>
             * </ol>
             * </li>
             * <li><ol start="120">
             * <li></li>
             * </ol>
             * </li>
             * <li><ol start="300">
             * <li></li>
             * </ol>
             * </li>
             * <li><ol start="900">
             * <li></li>
             * </ol>
             * </li>
             * </ul>
             * <blockquote>
             * <p>A statistical period of 15 seconds is applicable only to metrics collected by the CloudMonitor agent (metrics that start with Agent) when monitoring ECS-type scaling groups. For all other metrics, the statistical period can be set to 60, 120, 300, or 900 seconds.</p>
             * </blockquote>
             * <p>Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder period(Integer period) {
                this.period = period;
                return this;
            }

            /**
             * <p>The method used to aggregate the metric data in the multi-metric event-triggered task. Valid values:</p>
             * <ul>
             * <li>Average: average value.</li>
             * <li>Minimum: minimum value.</li>
             * <li>Maximum: maximum value.</li>
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
             * <p>The threshold of the monitoring metrics in a multi-metric event-triggered task. The scaling rule is executed when the threshold expression is met the specified number of times.</p>
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
