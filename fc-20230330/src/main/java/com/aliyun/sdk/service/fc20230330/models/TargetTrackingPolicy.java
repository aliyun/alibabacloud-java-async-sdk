// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TargetTrackingPolicy} extends {@link TeaModel}
 *
 * <p>TargetTrackingPolicy</p>
 */
public class TargetTrackingPolicy extends TeaModel {
    @NameInMap("endTime")
    private String endTime;

    @NameInMap("maxCapacity")
    @Validation(maximum = 100000)
    private Long maxCapacity;

    @NameInMap("metricTarget")
    private Float metricTarget;

    @NameInMap("metricType")
    private String metricType;

    @NameInMap("minCapacity")
    @Validation(maximum = 100000)
    private Long minCapacity;

    @NameInMap("name")
    private String name;

    @NameInMap("startTime")
    private String startTime;

    private TargetTrackingPolicy(Builder builder) {
        this.endTime = builder.endTime;
        this.maxCapacity = builder.maxCapacity;
        this.metricTarget = builder.metricTarget;
        this.metricType = builder.metricType;
        this.minCapacity = builder.minCapacity;
        this.name = builder.name;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TargetTrackingPolicy create() {
        return builder().build();
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

    public static final class Builder {
        private String endTime; 
        private Long maxCapacity; 
        private Float metricTarget; 
        private String metricType; 
        private Long minCapacity; 
        private String name; 
        private String startTime; 

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * maxCapacity.
         */
        public Builder maxCapacity(Long maxCapacity) {
            this.maxCapacity = maxCapacity;
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
         * minCapacity.
         */
        public Builder minCapacity(Long minCapacity) {
            this.minCapacity = minCapacity;
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

        public TargetTrackingPolicy build() {
            return new TargetTrackingPolicy(this);
        } 

    } 

}
