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
 * {@link ScalingConfigStatus} extends {@link TeaModel}
 *
 * <p>ScalingConfigStatus</p>
 */
public class ScalingConfigStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentError")
    private String currentError;

    @com.aliyun.core.annotation.NameInMap("currentInstances")
    private Long currentInstances;

    @com.aliyun.core.annotation.NameInMap("functionArn")
    private String functionArn;

    @com.aliyun.core.annotation.NameInMap("horizontalScalingPolicies")
    private java.util.List<ScalingPolicy> horizontalScalingPolicies;

    @com.aliyun.core.annotation.NameInMap("minInstances")
    private Long minInstances;

    @com.aliyun.core.annotation.NameInMap("residentPoolId")
    private String residentPoolId;

    @com.aliyun.core.annotation.NameInMap("scheduledPolicies")
    private java.util.List<ScheduledPolicy> scheduledPolicies;

    @com.aliyun.core.annotation.NameInMap("targetInstances")
    private Long targetInstances;

    private ScalingConfigStatus(Builder builder) {
        this.currentError = builder.currentError;
        this.currentInstances = builder.currentInstances;
        this.functionArn = builder.functionArn;
        this.horizontalScalingPolicies = builder.horizontalScalingPolicies;
        this.minInstances = builder.minInstances;
        this.residentPoolId = builder.residentPoolId;
        this.scheduledPolicies = builder.scheduledPolicies;
        this.targetInstances = builder.targetInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingConfigStatus create() {
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
     * @return functionArn
     */
    public String getFunctionArn() {
        return this.functionArn;
    }

    /**
     * @return horizontalScalingPolicies
     */
    public java.util.List<ScalingPolicy> getHorizontalScalingPolicies() {
        return this.horizontalScalingPolicies;
    }

    /**
     * @return minInstances
     */
    public Long getMinInstances() {
        return this.minInstances;
    }

    /**
     * @return residentPoolId
     */
    public String getResidentPoolId() {
        return this.residentPoolId;
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
        private String functionArn; 
        private java.util.List<ScalingPolicy> horizontalScalingPolicies; 
        private Long minInstances; 
        private String residentPoolId; 
        private java.util.List<ScheduledPolicy> scheduledPolicies; 
        private Long targetInstances; 

        private Builder() {
        } 

        private Builder(ScalingConfigStatus model) {
            this.currentError = model.currentError;
            this.currentInstances = model.currentInstances;
            this.functionArn = model.functionArn;
            this.horizontalScalingPolicies = model.horizontalScalingPolicies;
            this.minInstances = model.minInstances;
            this.residentPoolId = model.residentPoolId;
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
         * functionArn.
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
            return this;
        }

        /**
         * horizontalScalingPolicies.
         */
        public Builder horizontalScalingPolicies(java.util.List<ScalingPolicy> horizontalScalingPolicies) {
            this.horizontalScalingPolicies = horizontalScalingPolicies;
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
         * residentPoolId.
         */
        public Builder residentPoolId(String residentPoolId) {
            this.residentPoolId = residentPoolId;
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

        public ScalingConfigStatus build() {
            return new ScalingConfigStatus(this);
        } 

    } 

}
