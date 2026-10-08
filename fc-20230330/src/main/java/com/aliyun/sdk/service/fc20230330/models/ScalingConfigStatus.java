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

    @com.aliyun.core.annotation.NameInMap("enableMixMode")
    private Boolean enableMixMode;

    @com.aliyun.core.annotation.NameInMap("enableOnDemandScaling")
    private Boolean enableOnDemandScaling;

    @com.aliyun.core.annotation.NameInMap("functionArn")
    private String functionArn;

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

    @com.aliyun.core.annotation.NameInMap("targetInstances")
    private Long targetInstances;

    private ScalingConfigStatus(Builder builder) {
        this.currentError = builder.currentError;
        this.currentInstances = builder.currentInstances;
        this.enableMixMode = builder.enableMixMode;
        this.enableOnDemandScaling = builder.enableOnDemandScaling;
        this.functionArn = builder.functionArn;
        this.horizontalScalingPolicies = builder.horizontalScalingPolicies;
        this.minInstances = builder.minInstances;
        this.requestDispatchPolicy = builder.requestDispatchPolicy;
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

    /**
     * @return targetInstances
     */
    public Long getTargetInstances() {
        return this.targetInstances;
    }

    public static final class Builder {
        private String currentError; 
        private Long currentInstances; 
        private Boolean enableMixMode; 
        private Boolean enableOnDemandScaling; 
        private String functionArn; 
        private java.util.List<ScalingPolicy> horizontalScalingPolicies; 
        private Long minInstances; 
        private String requestDispatchPolicy; 
        private String residentPoolId; 
        private java.util.List<ScheduledPolicy> scheduledPolicies; 
        private Long targetInstances; 

        private Builder() {
        } 

        private Builder(ScalingConfigStatus model) {
            this.currentError = model.currentError;
            this.currentInstances = model.currentInstances;
            this.enableMixMode = model.enableMixMode;
            this.enableOnDemandScaling = model.enableOnDemandScaling;
            this.functionArn = model.functionArn;
            this.horizontalScalingPolicies = model.horizontalScalingPolicies;
            this.minInstances = model.minInstances;
            this.requestDispatchPolicy = model.requestDispatchPolicy;
            this.residentPoolId = model.residentPoolId;
            this.scheduledPolicies = model.scheduledPolicies;
            this.targetInstances = model.targetInstances;
        } 

        /**
         * <p>The error message that is returned when an instance fails to be created.</p>
         * 
         * <strong>example:</strong>
         * <p>image not found</p>
         */
        public Builder currentError(String currentError) {
            this.currentError = currentError;
            return this;
        }

        /**
         * <p>The current number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentInstances(Long currentInstances) {
            this.currentInstances = currentInstances;
            return this;
        }

        /**
         * <p>Specifies whether mix mode is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder enableMixMode(Boolean enableMixMode) {
            this.enableMixMode = enableMixMode;
            return this;
        }

        /**
         * <p>Specifies whether on-demand scaling is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder enableOnDemandScaling(Boolean enableOnDemandScaling) {
            this.enableOnDemandScaling = enableOnDemandScaling;
            return this;
        }

        /**
         * <p>The resource identifier of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:fc:cn-shanghai:124:functions/myFunction/prod</p>
         */
        public Builder functionArn(String functionArn) {
            this.functionArn = functionArn;
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
         * <p>The scheduled scaling policies.</p>
         */
        public Builder scheduledPolicies(java.util.List<ScheduledPolicy> scheduledPolicies) {
            this.scheduledPolicies = scheduledPolicies;
            return this;
        }

        /**
         * <p>The target number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
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
