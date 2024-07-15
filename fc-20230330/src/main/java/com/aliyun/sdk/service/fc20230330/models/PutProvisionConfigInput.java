// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutProvisionConfigInput} extends {@link TeaModel}
 *
 * <p>PutProvisionConfigInput</p>
 */
public class PutProvisionConfigInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alwaysAllocateCPU")
    private Boolean alwaysAllocateCPU;

    @com.aliyun.core.annotation.NameInMap("alwaysAllocateGPU")
    private Boolean alwaysAllocateGPU;

    @com.aliyun.core.annotation.NameInMap("scheduledActions")
    private java.util.List < ScheduledAction > scheduledActions;

    @com.aliyun.core.annotation.NameInMap("target")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long target;

    @com.aliyun.core.annotation.NameInMap("targetTrackingPolicies")
    private java.util.List < TargetTrackingPolicy > targetTrackingPolicies;

    private PutProvisionConfigInput(Builder builder) {
        this.alwaysAllocateCPU = builder.alwaysAllocateCPU;
        this.alwaysAllocateGPU = builder.alwaysAllocateGPU;
        this.scheduledActions = builder.scheduledActions;
        this.target = builder.target;
        this.targetTrackingPolicies = builder.targetTrackingPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutProvisionConfigInput create() {
        return builder().build();
    }

    /**
     * @return alwaysAllocateCPU
     */
    public Boolean getAlwaysAllocateCPU() {
        return this.alwaysAllocateCPU;
    }

    /**
     * @return alwaysAllocateGPU
     */
    public Boolean getAlwaysAllocateGPU() {
        return this.alwaysAllocateGPU;
    }

    /**
     * @return scheduledActions
     */
    public java.util.List < ScheduledAction > getScheduledActions() {
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
    public java.util.List < TargetTrackingPolicy > getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

    public static final class Builder {
        private Boolean alwaysAllocateCPU; 
        private Boolean alwaysAllocateGPU; 
        private java.util.List < ScheduledAction > scheduledActions; 
        private Long target; 
        private java.util.List < TargetTrackingPolicy > targetTrackingPolicies; 

        /**
         * alwaysAllocateCPU.
         */
        public Builder alwaysAllocateCPU(Boolean alwaysAllocateCPU) {
            this.alwaysAllocateCPU = alwaysAllocateCPU;
            return this;
        }

        /**
         * alwaysAllocateGPU.
         */
        public Builder alwaysAllocateGPU(Boolean alwaysAllocateGPU) {
            this.alwaysAllocateGPU = alwaysAllocateGPU;
            return this;
        }

        /**
         * scheduledActions.
         */
        public Builder scheduledActions(java.util.List < ScheduledAction > scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * target.
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        /**
         * targetTrackingPolicies.
         */
        public Builder targetTrackingPolicies(java.util.List < TargetTrackingPolicy > targetTrackingPolicies) {
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        public PutProvisionConfigInput build() {
            return new PutProvisionConfigInput(this);
        } 

    } 

}
