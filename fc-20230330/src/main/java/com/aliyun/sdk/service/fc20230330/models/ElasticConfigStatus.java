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
 * {@link ElasticConfigStatus} extends {@link TeaModel}
 *
 * <p>ElasticConfigStatus</p>
 */
public class ElasticConfigStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentError")
    private String currentError;

    @com.aliyun.core.annotation.NameInMap("currentInstances")
    private Long currentInstances;

    @com.aliyun.core.annotation.NameInMap("functionArn")
    private String functionArn;

    @com.aliyun.core.annotation.NameInMap("minInstances")
    private Long minInstances;

    @com.aliyun.core.annotation.NameInMap("residentPoolId")
    private String residentPoolId;

    @com.aliyun.core.annotation.NameInMap("scalingPolicies")
    private java.util.List<ScalingPolicy> scalingPolicies;

    @com.aliyun.core.annotation.NameInMap("scheduledPolicies")
    private java.util.List<ScheduledPolicy> scheduledPolicies;

    @com.aliyun.core.annotation.NameInMap("targetInstances")
    private Long targetInstances;

    private ElasticConfigStatus(Builder builder) {
        this.currentError = builder.currentError;
        this.currentInstances = builder.currentInstances;
        this.functionArn = builder.functionArn;
        this.minInstances = builder.minInstances;
        this.residentPoolId = builder.residentPoolId;
        this.scalingPolicies = builder.scalingPolicies;
        this.scheduledPolicies = builder.scheduledPolicies;
        this.targetInstances = builder.targetInstances;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ElasticConfigStatus create() {
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
     * @return scalingPolicies
     */
    public java.util.List<ScalingPolicy> getScalingPolicies() {
        return this.scalingPolicies;
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
        private Long minInstances; 
        private String residentPoolId; 
        private java.util.List<ScalingPolicy> scalingPolicies; 
        private java.util.List<ScheduledPolicy> scheduledPolicies; 
        private Long targetInstances; 

        private Builder() {
        } 

        private Builder(ElasticConfigStatus model) {
            this.currentError = model.currentError;
            this.currentInstances = model.currentInstances;
            this.functionArn = model.functionArn;
            this.minInstances = model.minInstances;
            this.residentPoolId = model.residentPoolId;
            this.scalingPolicies = model.scalingPolicies;
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
         * scalingPolicies.
         */
        public Builder scalingPolicies(java.util.List<ScalingPolicy> scalingPolicies) {
            this.scalingPolicies = scalingPolicies;
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

        public ElasticConfigStatus build() {
            return new ElasticConfigStatus(this);
        } 

    } 

}
