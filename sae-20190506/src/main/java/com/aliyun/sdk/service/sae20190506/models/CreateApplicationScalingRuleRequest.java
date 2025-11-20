// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link CreateApplicationScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationScalingRuleRequest</p>
 */
public class CreateApplicationScalingRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ScalingRuleEnable")
    private Boolean scalingRuleEnable;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingRuleType;

    private CreateApplicationScalingRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.enableIdle = builder.enableIdle;
        this.minReadyInstanceRatio = builder.minReadyInstanceRatio;
        this.minReadyInstances = builder.minReadyInstances;
        this.scalingRuleEnable = builder.scalingRuleEnable;
        this.scalingRuleMetric = builder.scalingRuleMetric;
        this.scalingRuleName = builder.scalingRuleName;
        this.scalingRuleTimer = builder.scalingRuleTimer;
        this.scalingRuleType = builder.scalingRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationScalingRuleRequest create() {
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
     * @return scalingRuleEnable
     */
    public Boolean getScalingRuleEnable() {
        return this.scalingRuleEnable;
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

    /**
     * @return scalingRuleType
     */
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    public static final class Builder extends Request.Builder<CreateApplicationScalingRuleRequest, Builder> {
        private String appId; 
        private Boolean enableIdle; 
        private Integer minReadyInstanceRatio; 
        private Integer minReadyInstances; 
        private Boolean scalingRuleEnable; 
        private String scalingRuleMetric; 
        private String scalingRuleName; 
        private String scalingRuleTimer; 
        private String scalingRuleType; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationScalingRuleRequest request) {
            super(request);
            this.appId = request.appId;
            this.enableIdle = request.enableIdle;
            this.minReadyInstanceRatio = request.minReadyInstanceRatio;
            this.minReadyInstances = request.minReadyInstances;
            this.scalingRuleEnable = request.scalingRuleEnable;
            this.scalingRuleMetric = request.scalingRuleMetric;
            this.scalingRuleName = request.scalingRuleName;
            this.scalingRuleTimer = request.scalingRuleTimer;
            this.scalingRuleType = request.scalingRuleType;
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
         * <p>The percentage of the minimum number of available instances. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong> (default value): The minimum number of available instances is not determined based on this parameter.</li>
         * <li><strong>0 to 100</strong>: The minimum number of available instances is calculated by using the following formula: Number of existing instances × Value of MinReadyInstanceRatio × 100%. The calculation result is rounded up to the nearest integer. For example, if the number of existing instances is 5 and MinReadyInstanceRatio is set to 50, the minimum number of available instances is 3.</li>
         * </ul>
         * <blockquote>
         * <p> When <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are passed at the same time and the <strong>MinReadyInstanceRatio</strong> value is not **-1**, the <strong>MinReadyInstanceRatio</strong> parameter takes precedence. <strong>Note</strong>When both <strong>MinReadyInstance</strong> and <strong>MinReadyInstanceRatio</strong> are specified and <strong>MinReadyInstanceRatio</strong> is set to a number from 0 to 100, the value of <strong>MinReadyInstanceRatio</strong> takes precedence.</p>
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
         * <p>The minimum number of available instances. Special values:</p>
         * <ul>
         * <li>If you set the value to <strong>0</strong>, business is interrupted when the application is updated.</li>
         * <li>If you set this property to -1, the system calculates a recommended value as the minimum number of available instances by using the following formula: Recommended value = Number of existing instances × 25%. The calculation result is rounded up to the nearest integer. For example, if the number of existing instances is 5, the recommended value is calculated by using the following formula: 5 × 25% = 1.25. In this case, the minimum number of available instances is 2.</li>
         * </ul>
         * <blockquote>
         * <p> To ensure business continuity, make sure that at least one instance is available during application deployment and rollback.</p>
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
         * <p>Specifies whether to enable the auto scaling policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The auto scaling policy is enabled.</li>
         * <li><strong>false</strong>: The auto scaling policy is disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scalingRuleEnable(Boolean scalingRuleEnable) {
            this.putQueryParameter("ScalingRuleEnable", scalingRuleEnable);
            this.scalingRuleEnable = scalingRuleEnable;
            return this;
        }

        /**
         * <p>The configurations of the metric-based auto scaling policy. This parameter is required if you set the ScalingRuleType parameter to metric.</p>
         * <p>The following list describes the involved parameters:</p>
         * <ul>
         * <li><p><strong>maxReplicas</strong>: the maximum number of instances in the application.</p>
         * </li>
         * <li><p><strong>minReplicas</strong>: the minimum number of instances in the application.</p>
         * </li>
         * <li><p><strong>metricType</strong>: the metric that is used to trigger the auto scaling policy.</p>
         * <ul>
         * <li><strong>CPU</strong>: the CPU utilization.</li>
         * <li><strong>MEMORY</strong>: the memory usage.</li>
         * <li><strong>QPS</strong>: the average QPS within 1 minute per Java application instance.</li>
         * <li><strong>RT</strong>: the average response time of all API operations within 1 minute in the Java application.</li>
         * <li><strong>tcpActiveConn</strong>: the average number of active TCP connections within 30 seconds per instance.</li>
         * <li><strong>SLB_QPS</strong>: the average QPS of the Internet-facing SLB instance within 15 seconds per instance.</li>
         * <li><strong>SLB_RT</strong>: the average response time of the Internet-facing SLB instance within 15 seconds.</li>
         * <li><strong>INTRANET_SLB_QPS</strong>: the average QPS of the internal-facing SLB instance within 15 seconds per instance.</li>
         * <li><strong>INTRANET_SLB_RT</strong>: the average response time of the internal-facing SLB instance within 15 seconds.</li>
         * </ul>
         * </li>
         * <li><p><strong>metricTargetAverageUtilization</strong>: the limit on the metric that is specified by <strong>metricType</strong>. You can specify following limits:</p>
         * <ul>
         * <li>The limit on the CPU utilization. Unit: percentage.</li>
         * <li>The limit on the memory usage. Unit: percentage.</li>
         * <li>The limit on the QPS.</li>
         * <li>The limit on the response time. Unit: milliseconds.</li>
         * <li>The limit on the average number of active TCP connections per second.</li>
         * <li>The limit on the QPS of the Internet-facing SLB instance.</li>
         * <li>The limit on the response time of the Internet-facing SLB instance. Unit: milliseconds.</li>
         * <li>The limit on the QPS of the internal-facing SLB instance.</li>
         * <li>The limit on the response time of the internal-facing SLB instance. Unit: milliseconds.</li>
         * </ul>
         * </li>
         * <li><p><strong>slbId</strong>: the ID of the SLB instance.</p>
         * </li>
         * <li><p><strong>slbProject</strong>: the Simple Log Service (SLS) project.</p>
         * </li>
         * <li><p><strong>slbLogstore</strong>: the SLS Logstore.</p>
         * </li>
         * <li><p><strong>vport</strong>: the listener port of the SLB instance. HTTP and HTTPS are supported.</p>
         * </li>
         * <li><p><strong>scaleUpRules</strong>: the scale-out rules.</p>
         * </li>
         * <li><p><strong>scaleDownRules</strong>: the scale-in rule.</p>
         * </li>
         * <li><p><strong>step</strong>: the scale-out or scale-in step size. This parameter specifies the maximum number of instances that can be added or removed per unit time.</p>
         * </li>
         * <li><p><strong>disabled</strong>: specifies whether to disable the application scale-in. If you set this parameter to true, the application instances are never reduced. This prevents business risks during peak hours.</p>
         * <ul>
         * <li><strong>true</strong>: disables the application scale-in.</li>
         * <li><strong>false</strong>: enables the application scale-in. Default value: false.</li>
         * </ul>
         * </li>
         * <li><p><strong>stabilizationWindowSeconds</strong>: the cooldown period during which the system is stable and does not perform scale-out or scale-in operations. Valid values: 0 to 3600. Unit: seconds. Default value: 0.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> NoteYou can specify one or more metrics as the trigger conditions of the auto scaling policy. If one of the values of the specified metrics is greater than or equal to the specified limit, the application is scaled out. The number of instances after the scale-out operation is less than or equal to the value of the specified maximum application instances. If the values of all specified metrics are less than the limits, the application is scaled in. The number of instances after the scale-in operation is greater than or equal to the value of the specified minimum application instances.</p>
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
         * <p>The name of the auto scaling policy. The name must be unique in an application, and can be up to 32 characters in length. It must start with a lowercase letter and can contain only lowercase letters, digits, and hyphens (-).</p>
         * <blockquote>
         * <p> You cannot change the names of created auto scaling policies.</p>
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
         * <p>The configuration of the scheduled elasticity policy. This parameter is required if you select Scheduled Scaling Policy or Use SDK to Set.</p>
         * <p>The following table describes the parameters.</p>
         * <ul>
         * <li><p><strong>beginDate</strong> and <strong>endDate</strong>: <strong>beginDate</strong> is the start date and <strong>endDate</strong> is the end date, which is used to configure the timing Auto Scaling policy. Valid values:</p>
         * <ul>
         * <li>If both values are <strong>null</strong>, long-term execution is performed. This is the default value.</li>
         * <li>If the value is a specific date, for example, the <strong>beginDate</strong> is <strong>2021-03-25</strong> and the <strong>endDate</strong> is <strong>2021-04-25</strong>, the validity period is one month.</li>
         * </ul>
         * </li>
         * <li><p><strong>period</strong>: The period during which the timed Auto Scaling policy is executed. Valid values:</p>
         * <ul>
         * <li><p><strong>* * *</strong>: The scheduled policy is executed at a specified time every day.</p>
         * </li>
         * <li><p><strong>* * Fri,Mon</strong>: The scheduled policy is executed at the specified time on the specified number of days per week. You can select multiple time zones. The time zone is GMT +8. Valid values:</p>
         * <ul>
         * <li><strong>Sun</strong>: Sunday</li>
         * <li><strong>Mon</strong>: Monday</li>
         * <li><strong>Tue</strong>: Tuesday</li>
         * <li><strong>Wed</strong>: Wednesday</li>
         * <li><strong>Thu</strong>: Thursday</li>
         * <li><strong>Fri</strong>: Friday</li>
         * <li><strong>Sat</strong>: Saturday</li>
         * </ul>
         * </li>
         * <li><p><strong>1,2,3,28,31 * *</strong>: The scheduled auto scaling policy is executed at a specified point in time on one or more dates of each month. Valid values: 1 to 31. If a month does not have the 31st day, the auto scaling policy is executed on the specified days other than the 31st day.</p>
         * </li>
         * </ul>
         * </li>
         * <li><p><strong>schedules</strong>: the points in time at which the scheduled auto scaling policy is triggered and the number of application instances that are retained during the time periods. You can specify up to 20 points in time. The following list describes the involved parameters:</p>
         * <ul>
         * <li><p><strong>atTime</strong>: the point in time at which the policy is triggered. <strong>targetReplicas</strong>: the number of application instances that you want to retain during the corresponding time period or the minimum number of available instances required for each deployment.****</p>
         * </li>
         * <li><p><strong>Valid values: 1 to 50.</strong> Valid values: 1 to 50.</p>
         * <p>**</p>
         * <p><strong>Note</strong>Make sure that at least one instance is available during the application deployment and rollback to prevent your business from being interrupted. If you set the value to <strong>0</strong>, business interruptions occur when the application is updated. If you set the value to <strong>0</strong>, business interruptions occur when the application is updated.</p>
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

        /**
         * <p>The type of the auto scaling policy. Take note of the following rules:</p>
         * <ul>
         * <li><strong>timing</strong>: a scheduled auto scaling policy.</li>
         * <li><strong>metric</strong>: a metric-based auto scaling policy.</li>
         * <li><strong>mix</strong>: a hybrid auto scaling policy.</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you set this parameter to timing, the ScalingRuleTimer parameter must be specified.</p>
         * </li>
         * <li><p>If you set this parameter to metric, the ScalingRuleMetric parameter must be specified.</p>
         * </li>
         * <li><p>If you set this parameter to mix, the ScalingRuleMetric parameter must be specified. You can specify the ScalingRuleTimer parameter based on your business requirements.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>timing</p>
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.putQueryParameter("ScalingRuleType", scalingRuleType);
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        @Override
        public CreateApplicationScalingRuleRequest build() {
            return new CreateApplicationScalingRuleRequest(this);
        } 

    } 

}
