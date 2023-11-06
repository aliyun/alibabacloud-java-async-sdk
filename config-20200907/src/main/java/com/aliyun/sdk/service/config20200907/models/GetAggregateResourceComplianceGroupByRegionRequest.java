// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceComplianceGroupByRegionRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateResourceComplianceGroupByRegionRequest</p>
 */
public class GetAggregateResourceComplianceGroupByRegionRequest extends Request {
    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    @Query
    @NameInMap("ConfigRuleIds")
    private String configRuleIds;

    private GetAggregateResourceComplianceGroupByRegionRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceComplianceGroupByRegionRequest create() {
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
     * @return configRuleIds
     */
    public String getConfigRuleIds() {
        return this.configRuleIds;
    }

    public static final class Builder extends Request.Builder<GetAggregateResourceComplianceGroupByRegionRequest, Builder> {
        private String aggregatorId; 
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateResourceComplianceGroupByRegionRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * The ID of the account group.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * The rule IDs. Separate multiple rule IDs with commas (,).
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public GetAggregateResourceComplianceGroupByRegionRequest build() {
            return new GetAggregateResourceComplianceGroupByRegionRequest(this);
        } 

    } 

}
