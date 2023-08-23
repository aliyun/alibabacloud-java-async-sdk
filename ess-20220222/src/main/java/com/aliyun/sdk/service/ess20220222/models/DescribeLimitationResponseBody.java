// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLimitationResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLimitationResponseBody</p>
 */
public class DescribeLimitationResponseBody extends TeaModel {
    @NameInMap("MaxNumberOfAlbServerGroup")
    private Integer maxNumberOfAlbServerGroup;

    @NameInMap("MaxNumberOfDBInstances")
    private Integer maxNumberOfDBInstances;

    @NameInMap("MaxNumberOfLifecycleHooks")
    private Integer maxNumberOfLifecycleHooks;

    @NameInMap("MaxNumberOfLoadBalancers")
    private Integer maxNumberOfLoadBalancers;

    @NameInMap("MaxNumberOfMaxSize")
    private Integer maxNumberOfMaxSize;

    @NameInMap("MaxNumberOfMinSize")
    private Integer maxNumberOfMinSize;

    @NameInMap("MaxNumberOfNlbServerGroup")
    private Integer maxNumberOfNlbServerGroup;

    @NameInMap("MaxNumberOfNotificationConfigurations")
    private Integer maxNumberOfNotificationConfigurations;

    @NameInMap("MaxNumberOfScalingConfigurations")
    private Integer maxNumberOfScalingConfigurations;

    @NameInMap("MaxNumberOfScalingGroups")
    private Integer maxNumberOfScalingGroups;

    @NameInMap("MaxNumberOfScalingInstances")
    private Integer maxNumberOfScalingInstances;

    @NameInMap("MaxNumberOfScalingRules")
    private Integer maxNumberOfScalingRules;

    @NameInMap("MaxNumberOfScheduledTasks")
    private Integer maxNumberOfScheduledTasks;

    @NameInMap("MaxNumberOfVServerGroups")
    private Integer maxNumberOfVServerGroups;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLimitationResponseBody(Builder builder) {
        this.maxNumberOfAlbServerGroup = builder.maxNumberOfAlbServerGroup;
        this.maxNumberOfDBInstances = builder.maxNumberOfDBInstances;
        this.maxNumberOfLifecycleHooks = builder.maxNumberOfLifecycleHooks;
        this.maxNumberOfLoadBalancers = builder.maxNumberOfLoadBalancers;
        this.maxNumberOfMaxSize = builder.maxNumberOfMaxSize;
        this.maxNumberOfMinSize = builder.maxNumberOfMinSize;
        this.maxNumberOfNlbServerGroup = builder.maxNumberOfNlbServerGroup;
        this.maxNumberOfNotificationConfigurations = builder.maxNumberOfNotificationConfigurations;
        this.maxNumberOfScalingConfigurations = builder.maxNumberOfScalingConfigurations;
        this.maxNumberOfScalingGroups = builder.maxNumberOfScalingGroups;
        this.maxNumberOfScalingInstances = builder.maxNumberOfScalingInstances;
        this.maxNumberOfScalingRules = builder.maxNumberOfScalingRules;
        this.maxNumberOfScheduledTasks = builder.maxNumberOfScheduledTasks;
        this.maxNumberOfVServerGroups = builder.maxNumberOfVServerGroups;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLimitationResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxNumberOfAlbServerGroup
     */
    public Integer getMaxNumberOfAlbServerGroup() {
        return this.maxNumberOfAlbServerGroup;
    }

    /**
     * @return maxNumberOfDBInstances
     */
    public Integer getMaxNumberOfDBInstances() {
        return this.maxNumberOfDBInstances;
    }

    /**
     * @return maxNumberOfLifecycleHooks
     */
    public Integer getMaxNumberOfLifecycleHooks() {
        return this.maxNumberOfLifecycleHooks;
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
     * @return maxNumberOfNlbServerGroup
     */
    public Integer getMaxNumberOfNlbServerGroup() {
        return this.maxNumberOfNlbServerGroup;
    }

    /**
     * @return maxNumberOfNotificationConfigurations
     */
    public Integer getMaxNumberOfNotificationConfigurations() {
        return this.maxNumberOfNotificationConfigurations;
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

    /**
     * @return maxNumberOfVServerGroups
     */
    public Integer getMaxNumberOfVServerGroups() {
        return this.maxNumberOfVServerGroups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxNumberOfAlbServerGroup; 
        private Integer maxNumberOfDBInstances; 
        private Integer maxNumberOfLifecycleHooks; 
        private Integer maxNumberOfLoadBalancers; 
        private Integer maxNumberOfMaxSize; 
        private Integer maxNumberOfMinSize; 
        private Integer maxNumberOfNlbServerGroup; 
        private Integer maxNumberOfNotificationConfigurations; 
        private Integer maxNumberOfScalingConfigurations; 
        private Integer maxNumberOfScalingGroups; 
        private Integer maxNumberOfScalingInstances; 
        private Integer maxNumberOfScalingRules; 
        private Integer maxNumberOfScheduledTasks; 
        private Integer maxNumberOfVServerGroups; 
        private String requestId; 

        /**
         * MaxNumberOfAlbServerGroup.
         */
        public Builder maxNumberOfAlbServerGroup(Integer maxNumberOfAlbServerGroup) {
            this.maxNumberOfAlbServerGroup = maxNumberOfAlbServerGroup;
            return this;
        }

        /**
         * MaxNumberOfDBInstances.
         */
        public Builder maxNumberOfDBInstances(Integer maxNumberOfDBInstances) {
            this.maxNumberOfDBInstances = maxNumberOfDBInstances;
            return this;
        }

        /**
         * MaxNumberOfLifecycleHooks.
         */
        public Builder maxNumberOfLifecycleHooks(Integer maxNumberOfLifecycleHooks) {
            this.maxNumberOfLifecycleHooks = maxNumberOfLifecycleHooks;
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
         * MaxNumberOfNlbServerGroup.
         */
        public Builder maxNumberOfNlbServerGroup(Integer maxNumberOfNlbServerGroup) {
            this.maxNumberOfNlbServerGroup = maxNumberOfNlbServerGroup;
            return this;
        }

        /**
         * MaxNumberOfNotificationConfigurations.
         */
        public Builder maxNumberOfNotificationConfigurations(Integer maxNumberOfNotificationConfigurations) {
            this.maxNumberOfNotificationConfigurations = maxNumberOfNotificationConfigurations;
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

        /**
         * MaxNumberOfVServerGroups.
         */
        public Builder maxNumberOfVServerGroups(Integer maxNumberOfVServerGroups) {
            this.maxNumberOfVServerGroups = maxNumberOfVServerGroups;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLimitationResponseBody build() {
            return new DescribeLimitationResponseBody(this);
        } 

    } 

}
