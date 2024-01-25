// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.viapi20210930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAiStoreApiTreeRequest} extends {@link RequestModel}
 *
 * <p>QueryAiStoreApiTreeRequest</p>
 */
public class QueryAiStoreApiTreeRequest extends Request {
    private QueryAiStoreApiTreeRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAiStoreApiTreeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<QueryAiStoreApiTreeRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(QueryAiStoreApiTreeRequest request) {
            super(request);
        } 

        @Override
        public QueryAiStoreApiTreeRequest build() {
            return new QueryAiStoreApiTreeRequest(this);
        } 

    } 

}
