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
 * {@link PutElasticConfigInput} extends {@link TeaModel}
 *
 * <p>PutElasticConfigInput</p>
 */
public class PutElasticConfigInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("minInstances")
    private Long minInstances;

    @com.aliyun.core.annotation.NameInMap("residentPoolId")
    private String residentPoolId;

    @com.aliyun.core.annotation.NameInMap("scalingPolicies")
    private java.util.List<ScalingPolicy> scalingPolicies;

    @com.aliyun.core.annotation.NameInMap("scheduledPolicies")
    private java.util.List<ScheduledPolicy> scheduledPolicies;

    private PutElasticConfigInput(Builder builder) {
        this.minInstances = builder.minInstances;
        this.residentPoolId = builder.residentPoolId;
        this.scalingPolicies = builder.scalingPolicies;
        this.scheduledPolicies = builder.scheduledPolicies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutElasticConfigInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder {
        private Long minInstances; 
        private String residentPoolId; 
        private java.util.List<ScalingPolicy> scalingPolicies; 
        private java.util.List<ScheduledPolicy> scheduledPolicies; 

        private Builder() {
        } 

        private Builder(PutElasticConfigInput model) {
            this.minInstances = model.minInstances;
            this.residentPoolId = model.residentPoolId;
            this.scalingPolicies = model.scalingPolicies;
            this.scheduledPolicies = model.scheduledPolicies;
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

        public PutElasticConfigInput build() {
            return new PutElasticConfigInput(this);
        } 

    } 

}
