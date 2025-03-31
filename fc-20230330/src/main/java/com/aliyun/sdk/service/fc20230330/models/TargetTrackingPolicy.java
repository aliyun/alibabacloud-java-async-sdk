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
 * {@link TargetTrackingPolicy} extends {@link TeaModel}
 *
 * <p>TargetTrackingPolicy</p>
 */
public class TargetTrackingPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("maxCapacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long maxCapacity;

    @com.aliyun.core.annotation.NameInMap("metricTarget")
    @com.aliyun.core.annotation.Validation(required = true)
    private Float metricTarget;

    @com.aliyun.core.annotation.NameInMap("metricType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metricType;

    @com.aliyun.core.annotation.NameInMap("minCapacity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long minCapacity;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    private TargetTrackingPolicy(Builder builder) {
        this.endTime = builder.endTime;
        this.maxCapacity = builder.maxCapacity;
        this.metricTarget = builder.metricTarget;
        this.metricType = builder.metricType;
        this.minCapacity = builder.minCapacity;
        this.name = builder.name;
        this.startTime = builder.startTime;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TargetTrackingPolicy create() {
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
     * @return maxCapacity
     */
    public Long getMaxCapacity() {
        return this.maxCapacity;
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
     * @return minCapacity
     */
    public Long getMinCapacity() {
        return this.minCapacity;
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
        private Long maxCapacity; 
        private Float metricTarget; 
        private String metricType; 
        private Long minCapacity; 
        private String name; 
        private String startTime; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(TargetTrackingPolicy model) {
            this.endTime = model.endTime;
            this.maxCapacity = model.maxCapacity;
            this.metricTarget = model.metricTarget;
            this.metricType = model.metricType;
            this.minCapacity = model.minCapacity;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxCapacity(Long maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        public Builder metricTarget(Float metricTarget) {
            this.metricTarget = metricTarget;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CPUUtilization</p>
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minCapacity(Long minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_1</p>
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

        public TargetTrackingPolicy build() {
            return new TargetTrackingPolicy(this);
        } 

    } 

}
