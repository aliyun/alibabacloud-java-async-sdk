// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnableEventRulesRequest} extends {@link RequestModel}
 *
 * <p>EnableEventRulesRequest</p>
 */
public class EnableEventRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > ruleNames;

    private EnableEventRulesRequest(Builder builder) {
        super(builder);
        this.ruleNames = builder.ruleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableEventRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleNames
     */
    public java.util.List < String > getRuleNames() {
        return this.ruleNames;
    }

    public static final class Builder extends Request.Builder<EnableEventRulesRequest, Builder> {
        private java.util.List < String > ruleNames; 

        private Builder() {
            super();
        } 

        private Builder(EnableEventRulesRequest request) {
            super(request);
            this.ruleNames = request.ruleNames;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ruleName1</p>
         */
        public Builder ruleNames(java.util.List < String > ruleNames) {
            this.putQueryParameter("RuleNames", ruleNames);
            this.ruleNames = ruleNames;
            return this;
        }

        @Override
        public EnableEventRulesRequest build() {
            return new EnableEventRulesRequest(this);
        } 

    } 

}
