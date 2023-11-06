// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeactiveConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>DeactiveConfigRulesRequest</p>
 */
public class DeactiveConfigRulesRequest extends Request {
    @Query
    @NameInMap("ConfigRuleIds")
    @Validation(required = true)
    private String configRuleIds;

    private DeactiveConfigRulesRequest(Builder builder) {
        super(builder);
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeactiveConfigRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleIds
     */
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public static final class Builder extends Request.Builder<DeactiveConfigRulesRequest, Builder> {
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeactiveConfigRulesRequest request) {
            super(request);
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * The ID of the rule. Separate multiple rule IDs with commas (,).
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public DeactiveConfigRulesRequest build() {
            return new DeactiveConfigRulesRequest(this);
        } 

    } 

}
