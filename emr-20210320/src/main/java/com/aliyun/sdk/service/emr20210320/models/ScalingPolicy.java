// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link ScalingPolicy} extends {@link TeaModel}
 *
 * <p>ScalingPolicy</p>
 */
public class ScalingPolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("Constraints")
    private ManagedScalingConstraints constraints;

    @com.aliyun.core.annotation.NameInMap("Disabled")
    private Boolean disabled;

    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    @com.aliyun.core.annotation.NameInMap("NodeGroupName")
    private String nodeGroupName;

    @com.aliyun.core.annotation.NameInMap("ScalingPolicyId")
    private String scalingPolicyId;

    @com.aliyun.core.annotation.NameInMap("ScalingPolicyType")
    private String scalingPolicyType;

    @com.aliyun.core.annotation.NameInMap("ScalingRules")
    private java.util.List<ScalingRule> scalingRules;

    private ScalingPolicy(Builder builder) {
        this.clusterId = builder.clusterId;
        this.constraints = builder.constraints;
        this.disabled = builder.disabled;
        this.nodeGroupId = builder.nodeGroupId;
        this.nodeGroupName = builder.nodeGroupName;
        this.scalingPolicyId = builder.scalingPolicyId;
        this.scalingPolicyType = builder.scalingPolicyType;
        this.scalingRules = builder.scalingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScalingPolicy create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return constraints
     */
    public ManagedScalingConstraints getConstraints() {
        return this.constraints;
    }

    /**
     * @return disabled
     */
    public Boolean getDisabled() {
        return this.disabled;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return nodeGroupName
     */
    public String getNodeGroupName() {
        return this.nodeGroupName;
    }

    /**
     * @return scalingPolicyId
     */
    public String getScalingPolicyId() {
        return this.scalingPolicyId;
    }

    /**
     * @return scalingPolicyType
     */
    public String getScalingPolicyType() {
        return this.scalingPolicyType;
    }

    /**
     * @return scalingRules
     */
    public java.util.List<ScalingRule> getScalingRules() {
        return this.scalingRules;
    }

    public static final class Builder {
        private String clusterId; 
        private ManagedScalingConstraints constraints; 
        private Boolean disabled; 
        private String nodeGroupId; 
        private String nodeGroupName; 
        private String scalingPolicyId; 
        private String scalingPolicyType; 
        private java.util.List<ScalingRule> scalingRules; 

        private Builder() {
        } 

        private Builder(ScalingPolicy model) {
            this.clusterId = model.clusterId;
            this.constraints = model.constraints;
            this.disabled = model.disabled;
            this.nodeGroupId = model.nodeGroupId;
            this.nodeGroupName = model.nodeGroupName;
            this.scalingPolicyId = model.scalingPolicyId;
            this.scalingPolicyType = model.scalingPolicyType;
            this.scalingRules = model.scalingRules;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Constraints.
         */
        public Builder constraints(ManagedScalingConstraints constraints) {
            this.constraints = constraints;
            return this;
        }

        /**
         * Disabled.
         */
        public Builder disabled(Boolean disabled) {
            this.disabled = disabled;
            return this;
        }

        /**
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * NodeGroupName.
         */
        public Builder nodeGroupName(String nodeGroupName) {
            this.nodeGroupName = nodeGroupName;
            return this;
        }

        /**
         * ScalingPolicyId.
         */
        public Builder scalingPolicyId(String scalingPolicyId) {
            this.scalingPolicyId = scalingPolicyId;
            return this;
        }

        /**
         * ScalingPolicyType.
         */
        public Builder scalingPolicyType(String scalingPolicyType) {
            this.scalingPolicyType = scalingPolicyType;
            return this;
        }

        /**
         * ScalingRules.
         */
        public Builder scalingRules(java.util.List<ScalingRule> scalingRules) {
            this.scalingRules = scalingRules;
            return this;
        }

        public ScalingPolicy build() {
            return new ScalingPolicy(this);
        } 

    } 

}
