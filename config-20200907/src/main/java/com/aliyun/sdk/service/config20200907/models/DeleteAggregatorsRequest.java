// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAggregatorsRequest} extends {@link RequestModel}
 *
 * <p>DeleteAggregatorsRequest</p>
 */
public class DeleteAggregatorsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AggregatorIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aggregatorIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    private DeleteAggregatorsRequest(Builder builder) {
        super(builder);
        this.aggregatorIds = builder.aggregatorIds;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAggregatorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorIds
     */
    public String getAggregatorIds() {
        return this.aggregatorIds;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<DeleteAggregatorsRequest, Builder> {
        private String aggregatorIds; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAggregatorsRequest request) {
            super(request);
            this.aggregatorIds = request.aggregatorIds;
            this.clientToken = request.clientToken;
        } 

        /**
         * The ID of the account group. Separate multiple IDs with commas (,).
         */
        public Builder aggregatorIds(String aggregatorIds) {
            this.putBodyParameter("AggregatorIds", aggregatorIds);
            this.aggregatorIds = aggregatorIds;
            return this;
        }

        /**
         * The client token that you want to use to ensure the idempotency of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public DeleteAggregatorsRequest build() {
            return new DeleteAggregatorsRequest(this);
        } 

    } 

}
