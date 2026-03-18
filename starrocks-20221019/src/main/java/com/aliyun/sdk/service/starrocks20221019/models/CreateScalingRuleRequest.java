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
 * {@link CreateScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateScalingRuleRequest</p>
 */
public class CreateScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Rule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerType;

    private CreateScalingRuleRequest(Builder builder) {
        super(builder);
        this.nodeGroupId = builder.nodeGroupId;
        this.rule = builder.rule;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScalingRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder extends Request.Builder<CreateScalingRuleRequest, Builder> {
        private String nodeGroupId; 
        private String rule; 
        private String triggerType; 

        private Builder() {
            super();
        } 

        private Builder(CreateScalingRuleRequest request) {
            super(request);
            this.nodeGroupId = request.nodeGroupId;
            this.rule = request.rule;
            this.triggerType = request.triggerType;
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
         * <p>TIME_TRIGGER</p>
         */
        public Builder triggerType(String triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        @Override
        public CreateScalingRuleRequest build() {
            return new CreateScalingRuleRequest(this);
        } 

    } 

}
