// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopConfigRulesRequest} extends {@link RequestModel}
 *
 * <p>StopConfigRulesRequest</p>
 */
public class StopConfigRulesRequest extends Request {
    @Query
    @NameInMap("ConfigRuleIds")
    @Validation(required = true)
    private String configRuleIds;

    private StopConfigRulesRequest(Builder builder) {
        super(builder);
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopConfigRulesRequest create() {
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

    public static final class Builder extends Request.Builder<StopConfigRulesRequest, Builder> {
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(StopConfigRulesRequest response) {
            super(response);
            this.configRuleIds = response.configRuleIds;
        } 

        /**
         * ConfigRuleIds.
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public StopConfigRulesRequest build() {
            return new StopConfigRulesRequest(this);
        } 

    } 

}
