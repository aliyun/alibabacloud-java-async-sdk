// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ScalingStatus} extends {@link TeaModel}
 *
 * <p>ScalingStatus</p>
 */
public class ScalingStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentError")
    private String currentError;

    @com.aliyun.core.annotation.NameInMap("currentInstances")
    private Long currentInstances;

    @com.aliyun.core.annotation.NameInMap("minInstances")
    private Long minInstances;

    @com.aliyun.core.annotation.NameInMap("scheduledPolicies")
    private java.util.List<ScheduledPolicy> scheduledPolicies;

    @com.aliyun.core.annotation.NameInMap("targetInstances")
    private Long targetInstances;

    private ScalingStatus(Builder builder) {
        this.currentError = builder.currentError;
        this.currentInstances = builder.currentInstances;
        this.minInstances = builder.minInstances;
        this.scheduledPolicies = builder.scheduledPolicies;
        this.targetInstances = builder.targetInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentError
     */
    public String getCurrentError() {
        return this.currentError;
    }

    /**
     * @return currentInstances
     */
    public Long getCurrentInstances() {
        return this.currentInstances;
    }

    /**
     * @return minInstances
     */
    public Long getMinInstances() {
        return this.minInstances;
    }

    /**
     * @return scheduledPolicies
     */
    public java.util.List<ScheduledPolicy> getScheduledPolicies() {
        return this.scheduledPolicies;
    }

    /**
     * @return targetInstances
     */
    public Long getTargetInstances() {
        return this.targetInstances;
    }

    public static final class Builder {
        private String currentError; 
        private Long currentInstances; 
        private Long minInstances; 
        private java.util.List<ScheduledPolicy> scheduledPolicies; 
        private Long targetInstances; 

        private Builder() {
        } 

        private Builder(ScalingStatus model) {
            this.currentError = model.currentError;
            this.currentInstances = model.currentInstances;
            this.minInstances = model.minInstances;
            this.scheduledPolicies = model.scheduledPolicies;
            this.targetInstances = model.targetInstances;
        } 

        /**
         * currentError.
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * currentInstances.
         */
        public Builder currentInstances(Long currentInstances) {
            this.currentInstances = currentInstances;
            return this;
        }

        /**
         * minInstances.
         */
        public Builder minInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        /**
         * scheduledPolicies.
         */
        public Builder scheduledPolicies(java.util.List<ScheduledPolicy> scheduledPolicies) {
            this.scheduledPolicies = scheduledPolicies;
            return this;
        }

        /**
         * targetInstances.
         */
        public Builder targetInstances(Long targetInstances) {
            this.targetInstances = targetInstances;
            return this;
        }

        public ScalingStatus build() {
            return new ScalingStatus(this);
        } 

    } 

}
