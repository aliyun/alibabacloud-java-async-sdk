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
 * {@link PutProvisionConfigInput} extends {@link TeaModel}
 *
 * <p>PutProvisionConfigInput</p>
 */
public class PutProvisionConfigInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alwaysAllocateCPU")
    private Boolean alwaysAllocateCPU;

    @com.aliyun.core.annotation.NameInMap("alwaysAllocateGPU")
    private Boolean alwaysAllocateGPU;

    @com.aliyun.core.annotation.NameInMap("defaultTarget")
    private Long defaultTarget;

    @com.aliyun.core.annotation.NameInMap("scheduledActions")
    private java.util.List<ScheduledAction> scheduledActions;

    @com.aliyun.core.annotation.NameInMap("target")
    @Deprecated
    @com.aliyun.core.annotation.Validation(required = true)
    private Long target;

    @com.aliyun.core.annotation.NameInMap("targetTrackingPolicies")
    private java.util.List<TargetTrackingPolicy> targetTrackingPolicies;

    private PutProvisionConfigInput(Builder builder) {
        this.alwaysAllocateCPU = builder.alwaysAllocateCPU;
        this.alwaysAllocateGPU = builder.alwaysAllocateGPU;
        this.defaultTarget = builder.defaultTarget;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return defaultTarget
     */
    public Long getDefaultTarget() {
        return this.defaultTarget;
    }

    /**
     * @return scheduledActions
     */
    public java.util.List<ScheduledAction> getScheduledActions() {
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
    public java.util.List<TargetTrackingPolicy> getTargetTrackingPolicies() {
        return this.targetTrackingPolicies;
    }

    public static final class Builder {
        private Boolean alwaysAllocateCPU; 
        private Boolean alwaysAllocateGPU; 
        private Long defaultTarget; 
        private java.util.List<ScheduledAction> scheduledActions; 
        private Long target; 
        private java.util.List<TargetTrackingPolicy> targetTrackingPolicies; 

        private Builder() {
        } 

        private Builder(PutProvisionConfigInput model) {
            this.alwaysAllocateCPU = model.alwaysAllocateCPU;
            this.alwaysAllocateGPU = model.alwaysAllocateGPU;
            this.defaultTarget = model.defaultTarget;
            this.scheduledActions = model.scheduledActions;
            this.target = model.target;
            this.targetTrackingPolicies = model.targetTrackingPolicies;
        } 

        /**
         * <p>Specifies whether to always allocate CPU. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alwaysAllocateCPU(Boolean alwaysAllocateCPU) {
            this.alwaysAllocateCPU = alwaysAllocateCPU;
            return this;
        }

        /**
         * <p>Specifies whether to always allocate GPU. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alwaysAllocateGPU(Boolean alwaysAllocateGPU) {
            this.alwaysAllocateGPU = alwaysAllocateGPU;
            return this;
        }

        /**
         * <p>The default minimum number of provisioned instances. Valid values: 0 to 10000.</p>
         * <blockquote>
         * <ul>
         * <li>If no metric-based auto elastic policy or scheduled elastic policy is configured, the current minimum number of instances equals the minimum number of instances you configured.</li>
         * <li>If you configured multiple elastic policies for the minimum number of instances, the system calculates the minimum number of instances triggered by each policy and uses the maximum value among the elastic policies that are effective at the current time as the current minimum number of instances.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder defaultTarget(Long defaultTarget) {
            this.defaultTarget = defaultTarget;
            return this;
        }

        /**
         * <p>The scheduled scaling configuration.</p>
         */
        public Builder scheduledActions(java.util.List<ScheduledAction> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * <blockquote>
         * <p>Notice: This parameter is no longer recommended. Use the defaultTarget parameter instead.</notice>
         * The target number of provisioned resources. Valid values: 0 to 10000.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        /**
         * <p>The metric-based scaling policy configuration.</p>
         */
        public Builder targetTrackingPolicies(java.util.List<TargetTrackingPolicy> targetTrackingPolicies) {
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        public PutProvisionConfigInput build() {
            return new PutProvisionConfigInput(this);
        } 

    } 

}
