// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActiveConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>ActiveConfigRulesRequest</p>
 */
public class ActiveConfigRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleIds;

    private ActiveConfigRulesRequest(Builder builder) {
        super(builder);
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActiveConfigRulesRequest create() {
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

    public static final class Builder extends Request.Builder<ActiveConfigRulesRequest, Builder> {
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(ActiveConfigRulesRequest request) {
            super(request);
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * The rule ID. Separate multiple rule IDs with commas (,).
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public ActiveConfigRulesRequest build() {
            return new ActiveConfigRulesRequest(this);
        } 

    } 

}
