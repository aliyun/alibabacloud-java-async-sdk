// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUserValueCardRequest} extends {@link RequestModel}
 *
 * <p>QueryUserValueCardRequest</p>
 */
public class QueryUserValueCardRequest extends Request {
    private QueryUserValueCardRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserValueCardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryUserValueCardRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryUserValueCardRequest response) {
            super(response);
        } 

        @Override
        public QueryUserValueCardRequest build() {
            return new QueryUserValueCardRequest(this);
        } 

    } 

}
