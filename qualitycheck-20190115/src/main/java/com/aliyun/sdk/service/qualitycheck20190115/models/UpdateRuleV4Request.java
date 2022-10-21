// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRuleV4Request} extends {@link RequestModel}
 *
 * <p>UpdateRuleV4Request</p>
 */
public class UpdateRuleV4Request extends Request {
    @Body
    @NameInMap("JsonStrForRule")
    @Validation(required = true)
    private String jsonStrForRule;

    @Body
    @NameInMap("RuleId")
    private Long ruleId;

    private UpdateRuleV4Request(Builder builder) {
        super(builder);
        this.jsonStrForRule = builder.jsonStrForRule;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRuleV4Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jsonStrForRule
     */
    public String getJsonStrForRule() {
        return this.jsonStrForRule;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<UpdateRuleV4Request, Builder> {
        private String jsonStrForRule; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRuleV4Request request) {
            super(request);
            this.jsonStrForRule = request.jsonStrForRule;
            this.ruleId = request.ruleId;
        } 

        /**
         * JsonStrForRule.
         */
        public Builder jsonStrForRule(String jsonStrForRule) {
            this.putBodyParameter("JsonStrForRule", jsonStrForRule);
            this.jsonStrForRule = jsonStrForRule;
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
        public UpdateRuleV4Request build() {
            return new UpdateRuleV4Request(this);
        } 

    } 

}
