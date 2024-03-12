// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInterveneRuleDetailRequest} extends {@link RequestModel}
 *
 * <p>GetInterveneRuleDetailRequest</p>
 */
public class GetInterveneRuleDetailRequest extends Request {
    @Query
    @NameInMap("AgentKey")
    @Validation(required = true)
    private String agentKey;

    @Body
    @NameInMap("RuleId")
    private Long ruleId;

    private GetInterveneRuleDetailRequest(Builder builder) {
        super(builder);
        this.agentKey = builder.agentKey;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInterveneRuleDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentKey
     */
    public String getAgentKey() {
        return this.agentKey;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetInterveneRuleDetailRequest, Builder> {
        private String agentKey; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetInterveneRuleDetailRequest request) {
            super(request);
            this.agentKey = request.agentKey;
            this.ruleId = request.ruleId;
        } 

        /**
         * AgentKey.
         */
        public Builder agentKey(String agentKey) {
            this.putQueryParameter("AgentKey", agentKey);
            this.agentKey = agentKey;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetInterveneRuleDetailRequest build() {
            return new GetInterveneRuleDetailRequest(this);
        } 

    } 

}
