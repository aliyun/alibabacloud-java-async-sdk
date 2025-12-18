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
 * {@link PutScalingConfigInput} extends {@link TeaModel}
 *
 * <p>PutScalingConfigInput</p>
 */
public class PutScalingConfigInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enableMixMode")
    private Boolean enableMixMode;

    @com.aliyun.core.annotation.NameInMap("enableOnDemandScaling")
    private Boolean enableOnDemandScaling;

    @com.aliyun.core.annotation.NameInMap("horizontalScalingPolicies")
    private java.util.List<ScalingPolicy> horizontalScalingPolicies;

    @com.aliyun.core.annotation.NameInMap("minInstances")
    private Long minInstances;

    @com.aliyun.core.annotation.NameInMap("requestDispatchPolicy")
    private String requestDispatchPolicy;

    @com.aliyun.core.annotation.NameInMap("residentPoolId")
    private String residentPoolId;

    @com.aliyun.core.annotation.NameInMap("scheduledPolicies")
    private java.util.List<ScheduledPolicy> scheduledPolicies;

    private PutScalingConfigInput(Builder builder) {
        this.enableMixMode = builder.enableMixMode;
        this.enableOnDemandScaling = builder.enableOnDemandScaling;
        this.horizontalScalingPolicies = builder.horizontalScalingPolicies;
        this.minInstances = builder.minInstances;
        this.requestDispatchPolicy = builder.requestDispatchPolicy;
        this.residentPoolId = builder.residentPoolId;
        this.scheduledPolicies = builder.scheduledPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutScalingConfigInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableMixMode
     */
    public Boolean getEnableMixMode() {
        return this.enableMixMode;
    }

    /**
     * @return enableOnDemandScaling
     */
    public Boolean getEnableOnDemandScaling() {
        return this.enableOnDemandScaling;
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
     * @return requestDispatchPolicy
     */
    public String getRequestDispatchPolicy() {
        return this.requestDispatchPolicy;
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

    public static final class Builder {
        private Boolean enableMixMode; 
        private Boolean enableOnDemandScaling; 
        private java.util.List<ScalingPolicy> horizontalScalingPolicies; 
        private Long minInstances; 
        private String requestDispatchPolicy; 
        private String residentPoolId; 
        private java.util.List<ScheduledPolicy> scheduledPolicies; 

        private Builder() {
        } 

        private Builder(PutScalingConfigInput model) {
            this.enableMixMode = model.enableMixMode;
            this.enableOnDemandScaling = model.enableOnDemandScaling;
            this.horizontalScalingPolicies = model.horizontalScalingPolicies;
            this.minInstances = model.minInstances;
            this.requestDispatchPolicy = model.requestDispatchPolicy;
            this.residentPoolId = model.residentPoolId;
            this.scheduledPolicies = model.scheduledPolicies;
        } 

        /**
         * enableMixMode.
         */
        public Builder enableMixMode(Boolean enableMixMode) {
            this.enableMixMode = enableMixMode;
            return this;
        }

        /**
         * enableOnDemandScaling.
         */
        public Builder enableOnDemandScaling(Boolean enableOnDemandScaling) {
            this.enableOnDemandScaling = enableOnDemandScaling;
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
         * requestDispatchPolicy.
         */
        public Builder requestDispatchPolicy(String requestDispatchPolicy) {
            this.requestDispatchPolicy = requestDispatchPolicy;
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

        public PutScalingConfigInput build() {
            return new PutScalingConfigInput(this);
        } 

    } 

}
