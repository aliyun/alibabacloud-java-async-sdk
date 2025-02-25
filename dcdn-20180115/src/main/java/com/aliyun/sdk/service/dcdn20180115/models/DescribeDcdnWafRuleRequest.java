// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnWafRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeDcdnWafRuleRequest</p>
 */
public class DescribeDcdnWafRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    private DescribeDcdnWafRuleRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnWafRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeDcdnWafRuleRequest, Builder> {
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDcdnWafRuleRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The ID of the protection rule. You can specify only one ID in each request.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DescribeDcdnWafRuleRequest build() {
            return new DescribeDcdnWafRuleRequest(this);
        } 

    } 

}
