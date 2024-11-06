// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link BatchDeleteDcdnWafRulesRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteDcdnWafRulesRequest</p>
 */
public class BatchDeleteDcdnWafRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleIds;

    private BatchDeleteDcdnWafRulesRequest(Builder builder) {
        super(builder);
        this.ruleIds = builder.ruleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteDcdnWafRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleIds
     */
    public String getRuleIds() {
        return this.ruleIds;
    }

    public static final class Builder extends Request.Builder<BatchDeleteDcdnWafRulesRequest, Builder> {
        private String ruleIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteDcdnWafRulesRequest request) {
            super(request);
            this.ruleIds = request.ruleIds;
        } 

        /**
         * <p>The IDs of the protection rules that you want to delete. Separate multiple IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20000001,20000002</p>
         */
        public Builder ruleIds(String ruleIds) {
            this.putBodyParameter("RuleIds", ruleIds);
            this.ruleIds = ruleIds;
            return this;
        }

        @Override
        public BatchDeleteDcdnWafRulesRequest build() {
            return new BatchDeleteDcdnWafRulesRequest(this);
        } 

    } 

}
