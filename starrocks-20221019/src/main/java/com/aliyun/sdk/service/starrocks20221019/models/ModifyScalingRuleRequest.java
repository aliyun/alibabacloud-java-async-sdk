// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ModifyScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>ModifyScalingRuleRequest</p>
 */
public class ModifyScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewTriggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newTriggerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OldTriggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String oldTriggerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingRuleId;

    private ModifyScalingRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.newTriggerType = builder.newTriggerType;
        this.nodeGroupId = builder.nodeGroupId;
        this.oldTriggerType = builder.oldTriggerType;
        this.rule = builder.rule;
        this.scalingRuleId = builder.scalingRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyScalingRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return newTriggerType
     */
    public String getNewTriggerType() {
        return this.newTriggerType;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return oldTriggerType
     */
    public String getOldTriggerType() {
        return this.oldTriggerType;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return scalingRuleId
     */
    public String getScalingRuleId() {
        return this.scalingRuleId;
    }

    public static final class Builder extends Request.Builder<ModifyScalingRuleRequest, Builder> {
        private String regionId; 
        private String newTriggerType; 
        private String nodeGroupId; 
        private String oldTriggerType; 
        private String rule; 
        private String scalingRuleId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyScalingRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.newTriggerType = request.newTriggerType;
            this.nodeGroupId = request.nodeGroupId;
            this.oldTriggerType = request.oldTriggerType;
            this.rule = request.rule;
            this.scalingRuleId = request.scalingRuleId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TIME_TRIGGER</p>
         */
        public Builder newTriggerType(String newTriggerType) {
            this.putQueryParameter("NewTriggerType", newTriggerType);
            this.newTriggerType = newTriggerType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-3d5ce6454354****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TIME_TRIGGER</p>
         */
        public Builder oldTriggerType(String oldTriggerType) {
            this.putQueryParameter("OldTriggerType", oldTriggerType);
            this.oldTriggerType = oldTriggerType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;nodeNumber&quot;: 1,
         *   &quot;scalingRuleName&quot;: &quot;test1&quot;,
         *   &quot;scalingOutRule&quot;: {
         *     &quot;year&quot;: 2026,
         *     &quot;month&quot;: 3,
         *     &quot;day&quot;: 2,
         *     &quot;hour&quot;: 5,
         *     &quot;minute&quot;: 50,
         *     &quot;second&quot;: 0,
         *     &quot;recurrenceInterval&quot;: 1,
         *     &quot;recurrenceType&quot;: &quot;DAILY&quot;,
         *     &quot;recurrenceValues&quot;: null
         *   },
         *   &quot;scalingInRule&quot;: {
         *     &quot;year&quot;: 2026,
         *     &quot;month&quot;: 3,
         *     &quot;day&quot;: 2,
         *     &quot;hour&quot;: 6,
         *     &quot;minute&quot;: 50,
         *     &quot;second&quot;: 0,
         *     &quot;recurrenceInterval&quot;: 1,
         *     &quot;recurrenceType&quot;: &quot;DAILY&quot;,
         *     &quot;recurrenceValues&quot;: null
         *   }
         * }</p>
         */
        public Builder rule(String rule) {
            this.putQueryParameter("Rule", rule);
            this.rule = rule;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>asr-bp10s4t9l21u9qtyrtco</p>
         */
        public Builder scalingRuleId(String scalingRuleId) {
            this.putQueryParameter("ScalingRuleId", scalingRuleId);
            this.scalingRuleId = scalingRuleId;
            return this;
        }

        @Override
        public ModifyScalingRuleRequest build() {
            return new ModifyScalingRuleRequest(this);
        } 

    } 

}
