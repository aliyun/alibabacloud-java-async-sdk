// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetInterveneRuleDetailRequest} extends {@link RequestModel}
 *
 * <p>GetInterveneRuleDetailRequest</p>
 */
public class GetInterveneRuleDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String agentKey;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    private GetInterveneRuleDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String agentKey; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetInterveneRuleDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.agentKey = request.agentKey;
            this.ruleId = request.ruleId;
        } 

        /**
         * RegionId.
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
         * <p>2daaa2e0c209xb26acb97009ea77bd4b_p_efm</p>
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
