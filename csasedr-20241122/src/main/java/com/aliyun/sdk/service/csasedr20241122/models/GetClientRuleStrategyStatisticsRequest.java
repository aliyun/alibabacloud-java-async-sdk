// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csasedr20241122.models;

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
 * {@link GetClientRuleStrategyStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetClientRuleStrategyStatisticsRequest</p>
 */
public class GetClientRuleStrategyStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolicyType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer policyType;

    private GetClientRuleStrategyStatisticsRequest(Builder builder) {
        super(builder);
        this.policyType = builder.policyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetClientRuleStrategyStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return policyType
     */
    public Integer getPolicyType() {
        return this.policyType;
    }

    public static final class Builder extends Request.Builder<GetClientRuleStrategyStatisticsRequest, Builder> {
        private Integer policyType; 

        private Builder() {
            super();
        } 

        private Builder(GetClientRuleStrategyStatisticsRequest request) {
            super(request);
            this.policyType = request.policyType;
        } 

        /**
         * <p>The policy type. Set this parameter to 2 to query the statistics of proactive defense policies.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder policyType(Integer policyType) {
            this.putQueryParameter("PolicyType", policyType);
            this.policyType = policyType;
            return this;
        }

        @Override
        public GetClientRuleStrategyStatisticsRequest build() {
            return new GetClientRuleStrategyStatisticsRequest(this);
        } 

    } 

}
