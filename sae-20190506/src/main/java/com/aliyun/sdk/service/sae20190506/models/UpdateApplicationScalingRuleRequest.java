// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateApplicationScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationScalingRuleRequest</p>
 */
public class UpdateApplicationScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableIdle")
    private Boolean enableIdle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinReadyInstanceRatio")
    private Integer minReadyInstanceRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MinReadyInstances")
    private Integer minReadyInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleMetric")
    private String scalingRuleMetric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleTimer")
    private String scalingRuleTimer;

    private UpdateApplicationScalingRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.enableIdle = builder.enableIdle;
        this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
        this.minReadyInstances = builder.minReadyInstances;
        this.scalingRuleMetric = builder.scalingRuleMetric;
        this.scalingRuleName = builder.scalingRuleName;
        this.scalingRuleTimer = builder.scalingRuleTimer;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationScalingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return enableIdle
     */
    public Boolean getEnableIdle() {
        return this.enableIdle;
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
     * @return scalingRuleMetric
     */
    public String getScalingRuleMetric() {
        return this.scalingRuleMetric;
    }

    /**
     * @return scalingRuleName
     */
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    /**
     * @return scalingRuleTimer
     */
    public String getScalingRuleTimer() {
        return this.scalingRuleTimer;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationScalingRuleRequest, Builder> {
        private String appId; 
        private Boolean enableIdle; 
        private Integer minReadyInstanceRatio; 
        private Integer minReadyInstances; 
        private String scalingRuleMetric; 
        private String scalingRuleName; 
        private String scalingRuleTimer; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationScalingRuleRequest request) {
            super(request);
            this.appId = request.appId;
            this.enableIdle = request.enableIdle;
            this.minReadyInstanceRatio = request.minReadyInstanceRatio;
            this.minReadyInstances = request.minReadyInstances;
            this.scalingRuleMetric = request.scalingRuleMetric;
            this.scalingRuleName = request.scalingRuleName;
            this.scalingRuleTimer = request.scalingRuleTimer;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * EnableIdle.
         */
        public Builder enableIdle(Boolean enableIdle) {
            this.putQueryParameter("EnableIdle", enableIdle);
            this.enableIdle = enableIdle;
            return this;
        }

        /**
         * <p>The percentage of the minimum number of available instances. Take note of the following rules:</p>
         * <ul>
         * <li>If you set the value to <strong>-1</strong>, the minimum number of available instances is not determined based on this parameter. This is the default value.</li>
         * <li>If you set the value to a number <strong>from 0 to 100</strong>, the minimum number of available instances is calculated by using the following formula: Current number of instances × (Value of MinReadyInstanceRatio × 100%). The value is the nearest integer rounded up from the calculated result. For example, if you set this parameter to <strong>50</strong>, and five instances are available, the minimum number of available instances is 3.</li>
         * </ul>
         * <blockquote>
         * <p>When <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are specified and <strong>MinReadyInstanceRatio</strong> is set to a number from 0 to 100, the value of **MinReadyInstanceRatio** takes precedence.**** For example, if <strong>MinReadyInstances</strong> is set to **5**, and <strong>MinReadyInstanceRatio</strong> is set to <strong>50</strong>, the minimum number of available instances is set to the nearest integer rounded up from the calculated result of the following formula: Current number of instances × <strong>50%</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder minReadyInstanceRatio(Integer minReadyInstanceRatio) {
            this.putQueryParameter("MinReadyInstanceRatio", minReadyInstanceRatio);
            this.minReadyInstanceRatio = minReadyInstanceRatio;
            return this;
        }

        /**
         * <p>The minimum number of available instances. Take note of the following rules:</p>
         * <ul>
         * <li>If you set the value to <strong>0</strong>, business interruptions occur when the auto-scaling policy is updated.</li>
         * <li>If you set the value to **-1**, the minimum number of available instances is automatically set to a system-recommended value. The value is the nearest integer to which the calculated result of the following formula is rounded up: Current number of instances × 25%. For example, if five instances are available, the minimum number of available instances is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</li>
         * </ul>
         * <blockquote>
         * <p>Make sure that at least one instance is available during application deployment and rollback to prevent business interruptions.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder minReadyInstances(Integer minReadyInstances) {
            this.putQueryParameter("MinReadyInstances", minReadyInstances);
            this.minReadyInstances = minReadyInstances;
            return this;
        }

        /**
         * <p>The configurations of the metric-based auto scaling policy. This parameter is required if you set the ScalingRuleType parameter to metric.</p>
         * <p>Parameter description:</p>
         * <ul>
         * <li><p><strong>maxReplicas</strong>: the maximum number of instances in the application.</p>
         * </li>
         * <li><p><strong>minReplicas</strong>: the minimum number of instances in the application.</p>
         * </li>
         * <li><p><strong>metricType</strong>: the metric that is used to trigger the auto scaling policy.</p>
         * <ul>
         * <li><strong>CPU</strong>: the CPU utilization.</li>
         * <li><strong>MEMORY</strong>: the memory usage.</li>
         * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections in an application instance within 30 seconds.</li>
         * <li><strong>SLB_QPS</strong>: the average queries per second (QPS) of the Internet-facing Server Load Balancer (SLB) instance associated with an application instance within 15 seconds.</li>
         * <li><strong>SLB_RT</strong>: the average response time of the Internet-facing SLB instance within 15 seconds.</li>
         * </ul>
         * </li>
         * <li><p><strong>metricTargetAverageUtilization</strong>: the limit on the metric specified by the <strong>metricType</strong> parameter.</p>
         * <ul>
         * <li>The limit on the CPU utilization. Unit: percentage.</li>
         * <li>The limit on the memory usage. Unit: percentage.</li>
         * <li>The limit on the average number of active TCP connections per second.</li>
         * <li>The limit on the QPS of the Internet-facing SLB instance.</li>
         * <li>The limit on the response time of the Internet-facing SLB instance. Unit: milliseconds.</li>
         * </ul>
         * </li>
         * <li><p><strong>SlbProject</strong>: the Log Service project.</p>
         * </li>
         * <li><p><strong>SlbLogstore</strong>: the Log Service Logstore.</p>
         * </li>
         * <li><p><strong>Vport</strong>: the listener port for the SLB instance. HTTP and HTTPS are supported.</p>
         * </li>
         * <li><p><strong>scaleUpRules</strong>: the scale-out rule.</p>
         * </li>
         * <li><p><strong>scaleDownRules</strong>: the scale-in rule.</p>
         * </li>
         * <li><p><strong>step</strong>: the scale-out or scale-in step size. The maximum number of instances that can be added or removed per unit time.</p>
         * </li>
         * <li><p><strong>disabled</strong>: specifies whether to disable the application scale-in. If you set this parameter to true, the application instances are never scaled in. This prevents business risks during peak hours.</p>
         * <ul>
         * <li><strong>true</strong>: disables the application scale-in.</li>
         * <li><strong>false</strong>: enables the application scale-in. Default value: false.</li>
         * </ul>
         * </li>
         * <li><p><strong>stabilizationWindowSeconds</strong>: the cooldown period during which the system is stable and does not perform scale-out or scale-in operations. Valid values: 0 to 3600. Unit: seconds. Default value: 0.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>You can specify one or more metrics as the trigger conditions of the auto scaling policy. If you specify multiple metrics, the application is scaled out when the value of a metric is greater than or equal to the limit. The number of application instances after the scale-out cannot exceed the configured maximum number of application instances. If the values of all the metrics are less than the limits, the application is scaled in. The number of instances after the scale-in cannot be less than the configured minimum number of application instances.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;maxReplicas&quot;:3,&quot;minReplicas&quot;:1,&quot;metrics&quot;:[{&quot;metricType&quot;:&quot;CPU&quot;,&quot;metricTargetAverageUtilization&quot;:20},{&quot;metricType&quot;:&quot;MEMORY&quot;,&quot;metricTargetAverageUtilization&quot;:30},{&quot;metricType&quot;:&quot;tcpActiveConn&quot;,&quot;metricTargetAverageUtilization&quot;:20},{&quot;metricType&quot;:&quot;SLB_QPS&quot;,&quot;MetricTargetAverageUtilization&quot;:25,&quot;SlbProject&quot;:&quot;aliyun-fc-cn-hangzhou-d95881d9-5d3c-5f26-a6b8-<strong><strong><strong><strong><strong><strong>&quot;,&quot;SlbLogstore&quot;:&quot;function-log&quot;,&quot;Vport&quot;:&quot;80&quot;},{&quot;metricType&quot;:&quot;SLB_RT&quot;,&quot;MetricTargetAverageUtilization&quot;:35,&quot;SlbProject&quot;:&quot;aliyun-fc-cn-hangzhou-d95881d9-5d3c-5f26-a6b8-</strong></strong></strong></strong></strong></strong>&quot;,&quot;SlbLogstore&quot;:&quot;function-log&quot;,&quot;Vport&quot;:&quot;80&quot;}],&quot;scaleUpRules&quot;:{&quot;step&quot;:&quot;100&quot;,&quot;disabled&quot;:false,&quot;stabilizationWindowSeconds&quot;:0},&quot;scaleDownRules&quot;:{&quot;step&quot;:&quot;100&quot;,&quot;disabled&quot;:false,&quot;stabilizationWindowSeconds&quot;:300}}</p>
         */
        public Builder scalingRuleMetric(String scalingRuleMetric) {
            this.putQueryParameter("ScalingRuleMetric", scalingRuleMetric);
            this.scalingRuleMetric = scalingRuleMetric;
            return this;
        }

        /**
         * <p>The name of the auto scaling policy. The name must start with a lowercase letter and can contain only lowercase letters, digits, and hyphens (-). The name cannot exceed 32 characters in length.</p>
         * <blockquote>
         * <p>You cannot change the names of created policies.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>timer-0800-2100</p>
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * <p>The configurations of the scheduled auto scaling policy. This parameter is required when you set the ScalingRuleType parameter to timing or when you want to create a scheduled auto scaling policy by using an SDK.</p>
         * <p>Parameter description:</p>
         * <ul>
         * <li><p><strong>beginDate</strong> and <strong>endDate</strong>: specify the validity period of the scheduled auto scaling policy. <strong>beginDate</strong> specifies the start date and <strong>endDate</strong> specifies the end date. Take note of the following rules:</p>
         * <ul>
         * <li>If you set the two parameters to <strong>null</strong>, the scheduled auto scaling policy is a long-term policy. Default values of the beginDate and endDate parameters: null.</li>
         * <li>If you set the two parameters to specific dates, the scheduled auto scaling policy can be triggered during the period between the two dates. For example, if you set <strong>beginDate</strong> to <strong>2021-03-25</strong> and <strong>endDate</strong> to <strong>2021-04-25</strong>, the auto scaling policy is valid for one month.</li>
         * </ul>
         * </li>
         * <li><p><strong>period</strong>: specifies the frequency at which the scheduled auto scaling policy is executed. Valid values:</p>
         * <ul>
         * <li><p><strong>* * *</strong>: The scheduled auto scaling policy is executed at a specified point in time every day.</p>
         * </li>
         * <li><p><strong>* * Fri,Mon</strong>: The scheduled auto scaling policy is executed at a specified point in time on one or more specified days of each week. GMT+8 is used. Valid values:</p>
         * <ul>
         * <li><strong>Sun</strong></li>
         * <li><strong>Mon</strong></li>
         * <li><strong>Tue</strong></li>
         * <li><strong>Wed</strong></li>
         * <li><strong>Thu</strong></li>
         * <li><strong>Fri</strong></li>
         * <li><strong>Sat</strong></li>
         * </ul>
         * </li>
         * <li><p><strong>1,2,3,28,31 * *</strong>: The scheduled auto scaling policy is executed at a specified point in time on one or more days of each month. Valid values: 1 to 31. If the month does not have a 31st day, the auto scaling policy is executed on the specified days other than the 31st day.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>schedules</strong>: specifies the points in time at which the auto scaling policy is triggered and the number of application instances that are retained during the corresponding period of time. You can specify up to 20 points in time. Parameter description:</p>
         * <ul>
         * <li><p><strong>atTime</strong>: the point in time at which the policy is triggered. Format: <strong>Hour:Minute</strong>. Example: <strong>08:00</strong>.</p>
         * </li>
         * <li><p><strong>targetReplicas</strong>: specifies the number of application instances that you want to maintain by using this policy. You can also set the value to the minimum number of available instances required for each application release. Valid values: 1 to 50.</p>
         * <p>**</p>
         * <p><strong>Note</strong>Make sure that at least <strong>one</strong> instance is available during the application deployment and rollback to prevent your business from being interrupted. If you set the value to <strong>0</strong>, business interruptions occur when the application is updated.</p>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;beginDate&quot;:null,&quot;endDate&quot;:null,&quot;period&quot;:&quot;* * *&quot;,&quot;schedules&quot;:[{&quot;atTime&quot;:&quot;08:00&quot;,&quot;targetReplicas&quot;:10},{&quot;atTime&quot;:&quot;20:00&quot;,&quot;targetReplicas&quot;:3}]}</p>
         */
        public Builder scalingRuleTimer(String scalingRuleTimer) {
            this.putQueryParameter("ScalingRuleTimer", scalingRuleTimer);
            this.scalingRuleTimer = scalingRuleTimer;
            return this;
        }

        @Override
        public UpdateApplicationScalingRuleRequest build() {
            return new UpdateApplicationScalingRuleRequest(this);
        } 

    } 

}
