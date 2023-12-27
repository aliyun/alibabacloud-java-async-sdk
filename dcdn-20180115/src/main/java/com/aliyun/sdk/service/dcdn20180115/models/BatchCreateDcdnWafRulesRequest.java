// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateDcdnWafRulesRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateDcdnWafRulesRequest</p>
 */
public class BatchCreateDcdnWafRulesRequest extends Request {
    @Body
    @NameInMap("PolicyId")
    @Validation(required = true)
    private Long policyId;

    @Body
    @NameInMap("RuleConfigs")
    @Validation(required = true)
    private String ruleConfigs;

    private BatchCreateDcdnWafRulesRequest(Builder builder) {
        super(builder);
        this.policyId = builder.policyId;
        this.ruleConfigs = builder.ruleConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateDcdnWafRulesRequest create() {
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

    public static final class Builder extends Request.Builder<BatchCreateDcdnWafRulesRequest, Builder> {
        private Long policyId; 
        private String ruleConfigs; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateDcdnWafRulesRequest request) {
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
         * The configuration of the protection rule.
         */
        public Builder ruleConfigs(String ruleConfigs) {
            this.putBodyParameter("RuleConfigs", ruleConfigs);
            this.ruleConfigs = ruleConfigs;
            return this;
        }

        @Override
        public BatchCreateDcdnWafRulesRequest build() {
            return new BatchCreateDcdnWafRulesRequest(this);
        } 

    } 

}
