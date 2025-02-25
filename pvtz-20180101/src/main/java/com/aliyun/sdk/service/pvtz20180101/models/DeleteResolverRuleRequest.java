// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteResolverRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteResolverRuleRequest</p>
 */
public class DeleteResolverRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private DeleteResolverRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResolverRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteResolverRuleRequest, Builder> {
        private String lang; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResolverRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.ruleId = request.ruleId;
        } 

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The forwarding rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hr****</p>
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteResolverRuleRequest build() {
            return new DeleteResolverRuleRequest(this);
        } 

    } 

}
