// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserAvailableCreditAmountRequest} extends {@link RequestModel}
 *
 * <p>QueryUserAvailableCreditAmountRequest</p>
 */
public class QueryUserAvailableCreditAmountRequest extends Request {
    private QueryUserAvailableCreditAmountRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserAvailableCreditAmountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryUserAvailableCreditAmountRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryUserAvailableCreditAmountRequest response) {
            super(response);
        } 

        @Override
        public QueryUserAvailableCreditAmountRequest build() {
            return new QueryUserAvailableCreditAmountRequest(this);
        } 

    } 

}
