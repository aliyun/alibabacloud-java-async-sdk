// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeResolverRuleRequest</p>
 */
public class DescribeResolverRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleId;

    private DescribeResolverRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResolverRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeResolverRuleRequest, Builder> {
        private String lang; 
        private String ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResolverRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.ruleId = request.ruleId;
        } 

        /**
         * The language.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The forwarding rule ID.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DescribeResolverRuleRequest build() {
            return new DescribeResolverRuleRequest(this);
        } 

    } 

}
