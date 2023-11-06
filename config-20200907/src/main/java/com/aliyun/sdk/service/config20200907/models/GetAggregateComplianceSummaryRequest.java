// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateComplianceSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateComplianceSummaryRequest</p>
 */
public class GetAggregateComplianceSummaryRequest extends Request {
    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    private GetAggregateComplianceSummaryRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateComplianceSummaryRequest create() {
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

    public static final class Builder extends Request.Builder<GetAggregateComplianceSummaryRequest, Builder> {
        private String aggregatorId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateComplianceSummaryRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
        } 

        /**
         * The ID of the account group.
         */
        public Builder aggregatorId(String aggregatorId) {
            this.putQueryParameter("AggregatorId", aggregatorId);
            this.aggregatorId = aggregatorId;
            return this;
        }

        @Override
        public GetAggregateComplianceSummaryRequest build() {
            return new GetAggregateComplianceSummaryRequest(this);
        } 

    } 

}
