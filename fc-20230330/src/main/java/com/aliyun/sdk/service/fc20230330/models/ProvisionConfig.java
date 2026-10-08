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
 * {@link ProvisionConfig} extends {@link TeaModel}
 *
 * <p>ProvisionConfig</p>
 */
public class ProvisionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("alwaysAllocateCPU")
    private Boolean alwaysAllocateCPU;

    @com.aliyun.core.annotation.NameInMap("alwaysAllocateGPU")
    private Boolean alwaysAllocateGPU;

    @com.aliyun.core.annotation.NameInMap("current")
    private Long current;

    @com.aliyun.core.annotation.NameInMap("currentError")
    private String currentError;

    @com.aliyun.core.annotation.NameInMap("defaultTarget")
    private Long defaultTarget;

    @com.aliyun.core.annotation.NameInMap("functionArn")
    private String functionArn;

    @com.aliyun.core.annotation.NameInMap("scheduledActions")
    private java.util.List<ScheduledAction> scheduledActions;

    @com.aliyun.core.annotation.NameInMap("target")
    private Long target;

    @com.aliyun.core.annotation.NameInMap("targetTrackingPolicies")
    private java.util.List<TargetTrackingPolicy> targetTrackingPolicies;

    private ProvisionConfig(Builder builder) {
        this.alwaysAllocateCPU = builder.alwaysAllocateCPU;
        this.alwaysAllocateGPU = builder.alwaysAllocateGPU;
        this.current = builder.current;
        this.currentError = builder.currentError;
        this.defaultTarget = builder.defaultTarget;
        this.functionArn = builder.functionArn;
        this.scheduledActions = builder.scheduledActions;
        this.target = builder.target;
        this.targetTrackingPolicies = builder.targetTrackingPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProvisionConfig create() {
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
     * @return defaultTarget
     */
    public Long getDefaultTarget() {
        return this.defaultTarget;
    }

    /**
     * @return functionArn
     */
    public String getFunctionArn() {
        return this.functionArn;
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
        private Long current; 
        private String currentError; 
        private Long defaultTarget; 
        private String functionArn; 
        private java.util.List<ScheduledAction> scheduledActions; 
        private Long target; 
        private java.util.List<TargetTrackingPolicy> targetTrackingPolicies; 

        private Builder() {
        } 

        private Builder(ProvisionConfig model) {
            this.alwaysAllocateCPU = model.alwaysAllocateCPU;
            this.alwaysAllocateGPU = model.alwaysAllocateGPU;
            this.current = model.current;
            this.currentError = model.currentError;
            this.defaultTarget = model.defaultTarget;
            this.functionArn = model.functionArn;
            this.scheduledActions = model.scheduledActions;
            this.target = model.target;
            this.targetTrackingPolicies = model.targetTrackingPolicies;
        } 

        /**
         * <p>Specifies whether to always allocate CPU to function instances.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alwaysAllocateCPU(Boolean alwaysAllocateCPU) {
            this.alwaysAllocateCPU = alwaysAllocateCPU;
            return this;
        }

        /**
         * <p>Specifies whether to always allocate GPU to function instances.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder alwaysAllocateGPU(Boolean alwaysAllocateGPU) {
            this.alwaysAllocateGPU = alwaysAllocateGPU;
            return this;
        }

        /**
         * <p>The actual number of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder current(Long current) {
            this.current = current;
            return this;
        }

        /**
         * <p>The error message when provisioned instance creation fails.</p>
         * 
         * <strong>example:</strong>
         * <p>image not found</p>
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * <p>The default number of resources when all metric-based scaling policies and scheduled scaling policies are inactive.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder defaultTarget(Long defaultTarget) {
            this.defaultTarget = defaultTarget;
            return this;
        }

        /**
         * <p>The resource descriptor of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-shanghai:124:functions/myFunction/prod</p>
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * <p>The scheduled scaling policy configurations.</p>
         */
        public Builder scheduledActions(java.util.List<ScheduledAction> scheduledActions) {
            this.scheduledActions = scheduledActions;
            return this;
        }

        /**
         * <p>The current target number of resources. If a metric-based scaling policy or scheduled scaling policy exists, this value is the number of resources calculated by the policy. Otherwise, it is the default number of provisioned instances.</p>
         * <blockquote>
         * <p>What is the difference between target and defaultTarget?\
         * Assume that the number of provisioned instances is configured as 1, and then a scheduled scaling policy is added to set the number of provisioned instances to 5 during a specific time period.</p>
         * <ul>
         * <li>During the <strong>active period</strong> of the scheduled scaling policy, target and defaultTarget are 5 and 1, respectively.</li>
         * <li>During the <strong>inactive period</strong> of the scheduled scaling policy, both target and defaultTarget are 1.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder target(Long target) {
            this.target = target;
            return this;
        }

        /**
         * <p>The metric-based scaling policy configurations.</p>
         */
        public Builder targetTrackingPolicies(java.util.List<TargetTrackingPolicy> targetTrackingPolicies) {
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        public ProvisionConfig build() {
            return new ProvisionConfig(this);
        } 

    } 

}
