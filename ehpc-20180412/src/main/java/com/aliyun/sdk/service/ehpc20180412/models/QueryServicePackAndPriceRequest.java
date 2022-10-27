// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryServicePackAndPriceRequest} extends {@link RequestModel}
 *
 * <p>QueryServicePackAndPriceRequest</p>
 */
public class QueryServicePackAndPriceRequest extends Request {
    private QueryServicePackAndPriceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryServicePackAndPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryServicePackAndPriceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryServicePackAndPriceRequest request) {
            super(request);
        } 

        @Override
        public QueryServicePackAndPriceRequest build() {
            return new QueryServicePackAndPriceRequest(this);
        } 

    } 

}
