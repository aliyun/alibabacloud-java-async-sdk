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
         * current.
         */
        public Builder current(Long current) {
            this.current = current;
            return this;
        }

        /**
         * currentError.
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * defaultTarget.
         */
        public Builder defaultTarget(Long defaultTarget) {
            this.defaultTarget = defaultTarget;
            return this;
        }

        /**
         * functionArn.
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * scheduledActions.
         */
        public Builder scheduledActions(java.util.List<ScheduledAction> scheduledActions) {
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
        public Builder targetTrackingPolicies(java.util.List<TargetTrackingPolicy> targetTrackingPolicies) {
            this.targetTrackingPolicies = targetTrackingPolicies;
            return this;
        }

        public ProvisionConfig build() {
            return new ProvisionConfig(this);
        } 

    } 

}
