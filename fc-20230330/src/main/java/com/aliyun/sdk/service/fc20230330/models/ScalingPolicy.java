// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link ScalingPolicy} extends {@link TeaModel}
 *
 * <p>ScalingPolicy</p>
 */
public class ScalingPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("maxInstances")
    private Long maxInstances;

    @com.aliyun.core.annotation.NameInMap("metricTarget")
    private Float metricTarget;

    @com.aliyun.core.annotation.NameInMap("metricType")
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("minInstances")
    private Long minInstances;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    private ScalingPolicy(Builder builder) {
        this.endTime = builder.endTime;
        this.maxInstances = builder.maxInstances;
        this.metricTarget = builder.metricTarget;
        this.metricType = builder.metricType;
        this.minInstances = builder.minInstances;
        this.name = builder.name;
        this.startTime = builder.startTime;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingPolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxInstances
     */
    public Long getMaxInstances() {
        return this.maxInstances;
    }

    /**
     * @return metricTarget
     */
    public Float getMetricTarget() {
        return this.metricTarget;
    }

    /**
     * @return metricType
     */
    public String getMetricType() {
        return this.metricType;
    }

    /**
     * @return minInstances
     */
    public Long getMinInstances() {
        return this.minInstances;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private String endTime; 
        private Long maxInstances; 
        private Float metricTarget; 
        private String metricType; 
        private Long minInstances; 
        private String name; 
        private String startTime; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(ScalingPolicy model) {
            this.endTime = model.endTime;
            this.maxInstances = model.maxInstances;
            this.metricTarget = model.metricTarget;
            this.metricType = model.metricType;
            this.minInstances = model.minInstances;
            this.name = model.name;
            this.startTime = model.startTime;
            this.timeZone = model.timeZone;
        } 

        /**
         * <p>The time when the policy expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-03-10T10:10:10Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The maximum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        /**
         * <p>The target value for the metric.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        public Builder metricTarget(Float metricTarget) {
            this.metricTarget = metricTarget;
            return this;
        }

        /**
         * <p>The type of metric to track. ProvisionedConcurrencyUtilization is the concurrency utilization of provisioned instances. CPUUtilization is the CPU utilization. GPUMemUtilization is the GPU memory utilization.</p>
         * 
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>The minimum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The time when the policy takes effect.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-03-10T10:10:10Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The time zone. If this parameter is empty, the times for startTime, endTime, and scheduleExpression must be in Coordinated Universal Time (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>Asia/Shanghai</p>
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public ScalingPolicy build() {
            return new ScalingPolicy(this);
        } 

    } 

}
