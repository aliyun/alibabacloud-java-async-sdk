// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetAggregateResourceComplianceGroupByResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateResourceComplianceGroupByResourceTypeRequest</p>
 */
public class GetAggregateResourceComplianceGroupByResourceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigRuleIds")
    private String configRuleIds;

    private GetAggregateResourceComplianceGroupByResourceTypeRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
        this.configRuleIds = builder.configRuleIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceComplianceGroupByResourceTypeRequest create() {
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

    public static final class Builder extends Request.Builder<GetAggregateResourceComplianceGroupByResourceTypeRequest, Builder> {
        private String aggregatorId; 
        private String configRuleIds; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateResourceComplianceGroupByResourceTypeRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
            this.configRuleIds = request.configRuleIds;
        } 

        /**
         * <p>The ID of the account group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-cdbd626622af0042****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The ID of the rule. Separate multiple rule IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cr-2541626622af0000****</p>
         */
        public Builder configRuleIds(String configRuleIds) {
            this.putQueryParameter("ConfigRuleIds", configRuleIds);
            this.configRuleIds = configRuleIds;
            return this;
        }

        @Override
        public GetAggregateResourceComplianceGroupByResourceTypeRequest build() {
            return new GetAggregateResourceComplianceGroupByResourceTypeRequest(this);
        } 

    } 

}
