// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateConfigRuleRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateConfigRuleRequest</p>
 */
public class GetAggregateConfigRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configRuleId;

    private GetAggregateConfigRuleRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.configRuleId = builder.configRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateConfigRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return configRuleId
     */
    public String getConfigRuleId() {
        return this.configRuleId;
    }

    public static final class Builder extends Request.Builder<GetAggregateConfigRuleRequest, Builder> {
        private String aggregatorId; 
        private String configRuleId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateConfigRuleRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.configRuleId = request.configRuleId;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of an account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The ID of the rule.
         * <p>
         * 
         * You can call the [ListAggregateConfigRules](~~264148~~) operation to obtain the rule ID.
         */
        public Builder configRuleId(String configRuleId) {
            this.putQueryParameter("ConfigRuleId", configRuleId);
            this.configRuleId = configRuleId;
            return this;
        }

        @Override
        public GetAggregateConfigRuleRequest build() {
            return new GetAggregateConfigRuleRequest(this);
        } 

    } 

}
