// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateConfigRuleSummaryByRiskLevelRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateConfigRuleSummaryByRiskLevelRequest</p>
 */
public class GetAggregateConfigRuleSummaryByRiskLevelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    private GetAggregateConfigRuleSummaryByRiskLevelRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateConfigRuleSummaryByRiskLevelRequest create() {
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

    public static final class Builder extends Request.Builder<GetAggregateConfigRuleSummaryByRiskLevelRequest, Builder> {
        private String aggregatorId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateConfigRuleSummaryByRiskLevelRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
        } 

        /**
         * The ID of the account group.
         * <p>
         * 
         * For more information about how to obtain the ID of the account group, see [ListAggregators](~~255797~~).
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        @Override
        public GetAggregateConfigRuleSummaryByRiskLevelRequest build() {
            return new GetAggregateConfigRuleSummaryByRiskLevelRequest(this);
        } 

    } 

}
