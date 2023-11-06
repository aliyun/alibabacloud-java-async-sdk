// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigRulesRequest</p>
 */
public class DeleteConfigRulesRequest extends Request {
    @Query
    @NameInMap("ConfigRuleIds")
    @Validation(required = true)
    private String configRuleIds;

    private DeleteConfigRulesRequest(Builder builder) {
        super(builder);
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigRulesRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteConfigRulesRequest, Builder> {
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigRulesRequest request) {
            super(request);
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * The rule IDs. Separate multiple rule IDs with commas (,).
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListConfigRules](~~609222~~).
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public DeleteConfigRulesRequest build() {
            return new DeleteConfigRulesRequest(this);
        } 

    } 

}
