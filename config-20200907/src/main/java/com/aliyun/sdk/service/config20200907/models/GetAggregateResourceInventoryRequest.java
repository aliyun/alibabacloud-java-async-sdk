// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAggregateResourceInventoryRequest} extends {@link RequestModel}
 *
 * <p>GetAggregateResourceInventoryRequest</p>
 */
public class GetAggregateResourceInventoryRequest extends Request {
    @Query
    @NameInMap("AggregatorId")
    @Validation(required = true)
    private String aggregatorId;

    private GetAggregateResourceInventoryRequest(Builder builder) {
        super(builder);
        this.aggregatorId = builder.aggregatorId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAggregateResourceInventoryRequest create() {
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

    public static final class Builder extends Request.Builder<GetAggregateResourceInventoryRequest, Builder> {
        private String aggregatorId; 

        private Builder() {
            super();
        } 

        private Builder(GetAggregateResourceInventoryRequest request) {
            super(request);
            this.aggregatorId = request.aggregatorId;
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

        @Override
        public GetAggregateResourceInventoryRequest build() {
            return new GetAggregateResourceInventoryRequest(this);
        } 

    } 

}
