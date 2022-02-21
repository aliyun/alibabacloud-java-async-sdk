// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGatewayRegionRequest} extends {@link RequestModel}
 *
 * <p>QueryGatewayRegionRequest</p>
 */
public class QueryGatewayRegionRequest extends Request {
    private QueryGatewayRegionRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGatewayRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryGatewayRegionRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryGatewayRegionRequest response) {
            super(response);
        } 

        @Override
        public QueryGatewayRegionRequest build() {
            return new QueryGatewayRegionRequest(this);
        } 

    } 

}
