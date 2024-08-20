// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchModifyDcdnWafRulesRequest} extends {@link RequestModel}
 *
 * <p>BatchModifyDcdnWafRulesRequest</p>
 */
public class BatchModifyDcdnWafRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleConfigs;

    private BatchModifyDcdnWafRulesRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.ruleConfigs = builder.ruleConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchModifyDcdnWafRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyId
     */
    public Long getPolicyId() {
        return this.policyId;
    }

    /**
     * @return ruleConfigs
     */
    public String getRuleConfigs() {
        return this.ruleConfigs;
    }

    public static final class Builder extends Request.Builder<BatchModifyDcdnWafRulesRequest, Builder> {
        private Long policyId; 
        private String ruleConfigs; 

        private Builder() {
            super();
        } 

        private Builder(BatchModifyDcdnWafRulesRequest request) {
            super(request);
            this.policyId = request.policyId;
            this.ruleConfigs = request.ruleConfigs;
        } 

        /**
         * The ID of the protection policy.
         */
        public Builder policyId(Long policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * The configurations of the protection rule.
         */
        public Builder ruleConfigs(String ruleConfigs) {
            this.putBodyParameter("RuleConfigs", ruleConfigs);
            this.ruleConfigs = ruleConfigs;
            return this;
        }

        @Override
        public BatchModifyDcdnWafRulesRequest build() {
            return new BatchModifyDcdnWafRulesRequest(this);
        } 

    } 

}
