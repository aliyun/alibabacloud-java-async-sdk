// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAiStoreRegionsRequest} extends {@link RequestModel}
 *
 * <p>QueryAiStoreRegionsRequest</p>
 */
public class QueryAiStoreRegionsRequest extends Request {
    private QueryAiStoreRegionsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiStoreRegionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryAiStoreRegionsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryAiStoreRegionsRequest request) {
            super(request);
        } 

        @Override
        public QueryAiStoreRegionsRequest build() {
            return new QueryAiStoreRegionsRequest(this);
        } 

    } 

}
