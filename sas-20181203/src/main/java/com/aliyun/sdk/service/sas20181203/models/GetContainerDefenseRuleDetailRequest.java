// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetContainerDefenseRuleDetailRequest} extends {@link RequestModel}
 *
 * <p>GetContainerDefenseRuleDetailRequest</p>
 */
public class GetContainerDefenseRuleDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    private Long ruleId;

    private GetContainerDefenseRuleDetailRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContainerDefenseRuleDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetContainerDefenseRuleDetailRequest, Builder> {
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetContainerDefenseRuleDetailRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The rule ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/2590599.html">ListContainerDefenseRule</a> operation to query the rule ID.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>156</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetContainerDefenseRuleDetailRequest build() {
            return new GetContainerDefenseRuleDetailRequest(this);
        } 

    } 

}
