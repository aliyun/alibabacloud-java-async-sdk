// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>GetConfigRuleRequest</p>
 */
public class GetConfigRuleRequest extends Request {
    @Query
    @NameInMap("ConfigRuleId")
    @Validation(required = true)
    private String configRuleId;

    private GetConfigRuleRequest(Builder builder) {
        super(builder);
        this.configRuleId = builder.configRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public static final class Builder extends Request.Builder<GetConfigRuleRequest, Builder> {
        private String configRuleId; 

        private Builder() {
            super();
        } 

        private Builder(GetConfigRuleRequest request) {
            super(request);
            this.configRuleId = request.configRuleId;
        } 

        /**
         * The rule ID.
         * <p>
         * 
         * For more information about how to obtain the ID of a rule, see [ListConfigRules](~~169607~~).
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        @Override
        public GetConfigRuleRequest build() {
            return new GetConfigRuleRequest(this);
        } 

    } 

}
