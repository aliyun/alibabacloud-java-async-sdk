// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeResolverRuleRequest</p>
 */
public class DescribeResolverRuleRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
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

        private Builder(DescribeResolverRuleRequest response) {
            super(response);
            this.lang = response.lang;
            this.ruleId = response.ruleId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RuleId.
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
