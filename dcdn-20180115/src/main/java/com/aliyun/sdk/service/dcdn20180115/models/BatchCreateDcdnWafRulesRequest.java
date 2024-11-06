// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchCreateDcdnWafRulesRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateDcdnWafRulesRequest</p>
 */
public class BatchCreateDcdnWafRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PolicyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long policyId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleConfigs")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The ID of the protection policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        public Builder policyId(Long policyId) {
            this.putBodyParameter("PolicyId", policyId);
            this.policyId = policyId;
            return this;
        }

        /**
         * <p>The configuration of the protection rule.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;ttttt&quot;,&quot;action&quot;:&quot;monitor&quot;,&quot;conditions&quot;:[{&quot;key&quot;:&quot;URL&quot;,&quot;opValue&quot;:&quot;match-one&quot;,&quot;values&quot;:&quot;1,2,3,4,5&quot;},{&quot;key&quot;:&quot;Header&quot;,&quot;opValue&quot;:&quot;contain-one&quot;,&quot;subKey&quot;:&quot;testheader&quot;,&quot;values&quot;:&quot;6,7,8,9,10&quot;}],&quot;ratelimit&quot;:{&quot;target&quot;:&quot;header&quot;,&quot;interval&quot;:10,&quot;threshold&quot;:5,&quot;ttl&quot;:1800,&quot;subKey&quot;:&quot;testheadercc&quot;,&quot;status&quot;:{&quot;code&quot;:&quot;502&quot;,&quot;count&quot;:5}},&quot;ccStatus&quot;:&quot;on&quot;,&quot;effect&quot;:&quot;rule&quot;,&quot;status&quot;:&quot;on&quot;}</p>
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
