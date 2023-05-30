// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProvisionConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProvisionConfigsResponseBody</p>
 */
public class ListProvisionConfigsResponseBody extends TeaModel {
    @NameInMap("nextToken")
    private String nextToken;

    @NameInMap("provisionConfigs")
    private java.util.List < ProvisionConfigs> provisionConfigs;

    private ListProvisionConfigsResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.provisionConfigs = builder.provisionConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProvisionConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return provisionConfigs
     */
    public java.util.List < ProvisionConfigs> getProvisionConfigs() {
        return this.provisionConfigs;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < ProvisionConfigs> provisionConfigs; 

        /**
         * The qualifier of the service to which resources belong. The qualifier must be aliasName and used together with the serviceName parameter.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The time when Function Compute API is called. Specify the time in the **EEE,d MMM yyyy HH:mm:ss GMT** format.
         */
        public Builder provisionConfigs(java.util.List < ProvisionConfigs> provisionConfigs) {
            this.provisionConfigs = provisionConfigs;
            return this;
        }

        public ListProvisionConfigsResponseBody build() {
            return new ListProvisionConfigsResponseBody(this);
        } 

    } 

    public static class ProvisionConfigs extends TeaModel {
        @NameInMap("alwaysAllocateCPU")
        private Boolean alwaysAllocateCPU;

        @NameInMap("current")
        private Long current;

        @NameInMap("currentError")
        private String currentError;

        @NameInMap("resource")
        private String resource;

        @NameInMap("scheduledActions")
        private java.util.List < ScheduledActions > scheduledActions;

        @NameInMap("target")
        private Long target;

        @NameInMap("targetTrackingPolicies")
        private java.util.List < TargetTrackingPolicies > targetTrackingPolicies;

        private ProvisionConfigs(Builder builder) {
            this.alwaysAllocateCPU = builder.alwaysAllocateCPU;
            this.current = builder.current;
            this.currentError = builder.currentError;
            this.resource = builder.resource;
            this.scheduledActions = builder.scheduledActions;
            this.target = builder.target;
            this.targetTrackingPolicies = builder.targetTrackingPolicies;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProvisionConfigs create() {
            return builder().build();
        }

        /**
         * @return alwaysAllocateCPU
         */
        public Boolean getAlwaysAllocateCPU() {
            return this.alwaysAllocateCPU;
        }

        /**
         * @return current
         */
        public Long getCurrent() {
            return this.current;
        }

        /**
         * @return currentError
         */
        public String getCurrentError() {
            return this.currentError;
        }

        /**
         * @return resource
         */
        public String getResource() {
            return this.resource;
        }

        /**
         * @return scheduledActions
         */
        public java.util.List < ScheduledActions > getScheduledActions() {
            return this.scheduledActions;
        }

        /**
         * @return target
         */
        public Long getTarget() {
            return this.target;
        }

        /**
         * @return targetTrackingPolicies
         */
        public java.util.List < TargetTrackingPolicies > getTargetTrackingPolicies() {
            return this.targetTrackingPolicies;
        }

        public static final class Builder {
            private Boolean alwaysAllocateCPU; 
            private Long current; 
            private String currentError; 
            private String resource; 
            private java.util.List < ScheduledActions > scheduledActions; 
            private Long target; 
            private java.util.List < TargetTrackingPolicies > targetTrackingPolicies; 

            /**
             * Xiaoqi
             */
            public Builder alwaysAllocateCPU(Boolean alwaysAllocateCPU) {
                this.alwaysAllocateCPU = alwaysAllocateCPU;
                return this;
            }

            /**
             * The expected number of provisioned instances.
             */
            public Builder current(Long current) {
                this.current = current;
                return this;
            }

            /**
             * 139490
             */
            public Builder currentError(String currentError) {
                this.currentError = currentError;
                return this;
            }

            /**
             * Details about the scheduled scaling policy. You can use the scheduled scaling policy to flexibly configure provisioned instances. You can specify the number of provisioned instances to the desired value at the scheduled time. This way, the number of provisioned instances can meet the concurrency requirements of your business.
             */
            public Builder resource(String resource) {
                this.resource = resource;
                return this;
            }

            /**
             * The ID of your Alibaba Cloud account.
             */
            public Builder scheduledActions(java.util.List < ScheduledActions > scheduledActions) {
                this.scheduledActions = scheduledActions;
                return this;
            }

            /**
             * The configuration of metric-based auto scaling. Provisioned instances are scaled in or out every minute based on the concurrency utilization of provisioned instances. 
             * <p>
             * 
             * - If the metric value exceeds the value of the metricTarget parameter, the system scales out provisioned instances based on a progressive policy to make the metric value closer to the value of the metricTarget parameter. 
             * - When the metric value is smaller than the value of the metricTarget parameter, the system scales in provisioned instances based on a conservative policy to make the metric value close to the value of the metricTarget parameter. 
             * 
             * After you specify the maximum and minimum numbers of provisioned instances, the system scales in or out provisioned instances within the range from the minimum number to the maximum number. If the number of provisioned instances is beyond the range, the scaling stops.
             */
            public Builder target(Long target) {
                this.target = target;
                return this;
            }

            /**
             * Example 1
             */
            public Builder targetTrackingPolicies(java.util.List < TargetTrackingPolicies > targetTrackingPolicies) {
                this.targetTrackingPolicies = targetTrackingPolicies;
                return this;
            }

            public ProvisionConfigs build() {
                return new ProvisionConfigs(this);
            } 

        } 

    }
}
