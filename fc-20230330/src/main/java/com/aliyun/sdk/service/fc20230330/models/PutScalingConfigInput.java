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
         * <p>Specifies whether to enable the mix mode.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder enableMixMode(Boolean enableMixMode) {
            this.enableMixMode = enableMixMode;
            return this;
        }

        /**
         * <p>Specifies whether to enable on-demand scaling.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder enableOnDemandScaling(Boolean enableOnDemandScaling) {
            this.enableOnDemandScaling = enableOnDemandScaling;
            return this;
        }

        /**
         * <p>The horizontal scaling policies.</p>
         */
        public Builder horizontalScalingPolicies(java.util.List<ScalingPolicy> horizontalScalingPolicies) {
            this.horizontalScalingPolicies = horizontalScalingPolicies;
            return this;
        }

        /**
         * <p>The minimum number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minInstances(Long minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        /**
         * <p>The request dispatch policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Balanced</p>
         */
        public Builder requestDispatchPolicy(String requestDispatchPolicy) {
            this.requestDispatchPolicy = requestDispatchPolicy;
            return this;
        }

        /**
         * <p>The ID of the resident resource pool.</p>
         * 
         * <strong>example:</strong>
         * <p>fc-pool-a2b664c1f87171j4******</p>
         */
        public Builder residentPoolId(String residentPoolId) {
            this.residentPoolId = residentPoolId;
            return this;
        }

        /**
         * <p>The scheduled elastic policies.</p>
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
