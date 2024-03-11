// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bizworks20210408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryUsageRequest} extends {@link RequestModel}
 *
 * <p>QueryUsageRequest</p>
 */
public class QueryUsageRequest extends Request {
    private QueryUsageRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUsageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryUsageRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryUsageRequest request) {
            super(request);
        } 

        @Override
        public QueryUsageRequest build() {
            return new QueryUsageRequest(this);
        } 

    } 

}
