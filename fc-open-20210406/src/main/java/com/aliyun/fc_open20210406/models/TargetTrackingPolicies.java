// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link TargetTrackingPolicies} extends {@link TeaModel}
 *
 * <p>TargetTrackingPolicies</p>
 */
public class TargetTrackingPolicies extends TeaModel {
    @NameInMap("endTime")
    private String endTime;

    @NameInMap("maxCapacity")
    private Long maxCapacity;

    @NameInMap("metricTarget")
    private Double metricTarget;

    @NameInMap("metricType")
    private String metricType;

    @NameInMap("minCapacity")
    private Long minCapacity;

    @NameInMap("name")
    private String name;

    @NameInMap("startTime")
    private String startTime;


    private TargetTrackingPolicies(Builder builder) {
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

    public static TargetTrackingPolicies create() {
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
    public Double getMetricTarget() {
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
        private Double metricTarget; 
        private String metricType; 
        private Long minCapacity; 
        private String name; 
        private String startTime; 

        /**
         * <p>endTime</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>maxCapacity</p>
         */
        public Builder maxCapacity(Long maxCapacity) {
            this.maxCapacity = maxCapacity;
            return this;
        }

        /**
         * <p>metricTarget</p>
         */
        public Builder metricTarget(Double metricTarget) {
            this.metricTarget = metricTarget;
            return this;
        }

        /**
         * <p>metricType</p>
         */
        public Builder metricType(String metricType) {
            this.metricType = metricType;
            return this;
        }

        /**
         * <p>minCapacity</p>
         */
        public Builder minCapacity(Long minCapacity) {
            this.minCapacity = minCapacity;
            return this;
        }

        /**
         * <p>name</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>startTime</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public TargetTrackingPolicies build() {
            return new TargetTrackingPolicies(this);
        } 

    } 

}
