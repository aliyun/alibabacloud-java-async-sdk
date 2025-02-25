// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLimitationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLimitationResponseBody</p>
 */
public class DescribeLimitationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxNumberOfDBInstances")
    private Integer maxNumberOfDBInstances;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfLoadBalancers")
    private Integer maxNumberOfLoadBalancers;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfMaxSize")
    private Integer maxNumberOfMaxSize;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfMinSize")
    private Integer maxNumberOfMinSize;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScalingConfigurations")
    private Integer maxNumberOfScalingConfigurations;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScalingGroups")
    private Integer maxNumberOfScalingGroups;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScalingInstances")
    private Integer maxNumberOfScalingInstances;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScalingRules")
    private Integer maxNumberOfScalingRules;

    @com.aliyun.core.annotation.NameInMap("MaxNumberOfScheduledTasks")
    private Integer maxNumberOfScheduledTasks;

    private DescribeLimitationResponseBody(Builder builder) {
        this.maxNumberOfDBInstances = builder.maxNumberOfDBInstances;
        this.maxNumberOfLoadBalancers = builder.maxNumberOfLoadBalancers;
        this.maxNumberOfMaxSize = builder.maxNumberOfMaxSize;
        this.maxNumberOfMinSize = builder.maxNumberOfMinSize;
        this.maxNumberOfScalingConfigurations = builder.maxNumberOfScalingConfigurations;
        this.maxNumberOfScalingGroups = builder.maxNumberOfScalingGroups;
        this.maxNumberOfScalingInstances = builder.maxNumberOfScalingInstances;
        this.maxNumberOfScalingRules = builder.maxNumberOfScalingRules;
        this.maxNumberOfScheduledTasks = builder.maxNumberOfScheduledTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLimitationResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxNumberOfDBInstances
     */
    public Integer getMaxNumberOfDBInstances() {
        return this.maxNumberOfDBInstances;
    }

    /**
     * @return maxNumberOfLoadBalancers
     */
    public Integer getMaxNumberOfLoadBalancers() {
        return this.maxNumberOfLoadBalancers;
    }

    /**
     * @return maxNumberOfMaxSize
     */
    public Integer getMaxNumberOfMaxSize() {
        return this.maxNumberOfMaxSize;
    }

    /**
     * @return maxNumberOfMinSize
     */
    public Integer getMaxNumberOfMinSize() {
        return this.maxNumberOfMinSize;
    }

    /**
     * @return maxNumberOfScalingConfigurations
     */
    public Integer getMaxNumberOfScalingConfigurations() {
        return this.maxNumberOfScalingConfigurations;
    }

    /**
     * @return maxNumberOfScalingGroups
     */
    public Integer getMaxNumberOfScalingGroups() {
        return this.maxNumberOfScalingGroups;
    }

    /**
     * @return maxNumberOfScalingInstances
     */
    public Integer getMaxNumberOfScalingInstances() {
        return this.maxNumberOfScalingInstances;
    }

    /**
     * @return maxNumberOfScalingRules
     */
    public Integer getMaxNumberOfScalingRules() {
        return this.maxNumberOfScalingRules;
    }

    /**
     * @return maxNumberOfScheduledTasks
     */
    public Integer getMaxNumberOfScheduledTasks() {
        return this.maxNumberOfScheduledTasks;
    }

    public static final class Builder {
        private Integer maxNumberOfDBInstances; 
        private Integer maxNumberOfLoadBalancers; 
        private Integer maxNumberOfMaxSize; 
        private Integer maxNumberOfMinSize; 
        private Integer maxNumberOfScalingConfigurations; 
        private Integer maxNumberOfScalingGroups; 
        private Integer maxNumberOfScalingInstances; 
        private Integer maxNumberOfScalingRules; 
        private Integer maxNumberOfScheduledTasks; 

        /**
         * MaxNumberOfDBInstances.
         */
        public Builder maxNumberOfDBInstances(Integer maxNumberOfDBInstances) {
            this.maxNumberOfDBInstances = maxNumberOfDBInstances;
            return this;
        }

        /**
         * MaxNumberOfLoadBalancers.
         */
        public Builder maxNumberOfLoadBalancers(Integer maxNumberOfLoadBalancers) {
            this.maxNumberOfLoadBalancers = maxNumberOfLoadBalancers;
            return this;
        }

        /**
         * MaxNumberOfMaxSize.
         */
        public Builder maxNumberOfMaxSize(Integer maxNumberOfMaxSize) {
            this.maxNumberOfMaxSize = maxNumberOfMaxSize;
            return this;
        }

        /**
         * MaxNumberOfMinSize.
         */
        public Builder maxNumberOfMinSize(Integer maxNumberOfMinSize) {
            this.maxNumberOfMinSize = maxNumberOfMinSize;
            return this;
        }

        /**
         * MaxNumberOfScalingConfigurations.
         */
        public Builder maxNumberOfScalingConfigurations(Integer maxNumberOfScalingConfigurations) {
            this.maxNumberOfScalingConfigurations = maxNumberOfScalingConfigurations;
            return this;
        }

        /**
         * MaxNumberOfScalingGroups.
         */
        public Builder maxNumberOfScalingGroups(Integer maxNumberOfScalingGroups) {
            this.maxNumberOfScalingGroups = maxNumberOfScalingGroups;
            return this;
        }

        /**
         * MaxNumberOfScalingInstances.
         */
        public Builder maxNumberOfScalingInstances(Integer maxNumberOfScalingInstances) {
            this.maxNumberOfScalingInstances = maxNumberOfScalingInstances;
            return this;
        }

        /**
         * MaxNumberOfScalingRules.
         */
        public Builder maxNumberOfScalingRules(Integer maxNumberOfScalingRules) {
            this.maxNumberOfScalingRules = maxNumberOfScalingRules;
            return this;
        }

        /**
         * MaxNumberOfScheduledTasks.
         */
        public Builder maxNumberOfScheduledTasks(Integer maxNumberOfScheduledTasks) {
            this.maxNumberOfScheduledTasks = maxNumberOfScheduledTasks;
            return this;
        }

        public DescribeLimitationResponseBody build() {
            return new DescribeLimitationResponseBody(this);
        } 

    } 

}
