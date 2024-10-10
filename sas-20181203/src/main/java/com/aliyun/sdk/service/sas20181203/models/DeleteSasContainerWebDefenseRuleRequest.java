// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteSasContainerWebDefenseRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteSasContainerWebDefenseRuleRequest</p>
 */
public class DeleteSasContainerWebDefenseRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long ruleId;

    private DeleteSasContainerWebDefenseRuleRequest(Builder builder) {
        super(builder);
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSasContainerWebDefenseRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteSasContainerWebDefenseRuleRequest, Builder> {
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSasContainerWebDefenseRuleRequest request) {
            super(request);
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The rule ID.</p>
         * <blockquote>
         * <p> You can call the ListContainerWebDefenseRule operation to query the rule ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>400597</p>
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteSasContainerWebDefenseRuleRequest build() {
            return new DeleteSasContainerWebDefenseRuleRequest(this);
        } 

    } 

}
