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
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * maxInstances.
         */
        public Builder maxInstances(Long maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        /**
         * metricTarget.
         */
        public Builder metricTarget(Float metricTarget) {
            this.metricTarget = metricTarget;
            return this;
        }

        /**
         * metricType.
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * minInstances.
         */
        public Builder minInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * timeZone.
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
