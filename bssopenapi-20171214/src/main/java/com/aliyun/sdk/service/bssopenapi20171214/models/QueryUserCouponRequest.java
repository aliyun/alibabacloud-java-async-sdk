// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserCouponRequest} extends {@link RequestModel}
 *
 * <p>QueryUserCouponRequest</p>
 */
public class QueryUserCouponRequest extends Request {
    private QueryUserCouponRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserCouponRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryUserCouponRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryUserCouponRequest response) {
            super(response);
        } 

        @Override
        public QueryUserCouponRequest build() {
            return new QueryUserCouponRequest(this);
        } 

    } 

}
