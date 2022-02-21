// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySubscriptionDetailResponse} extends {@link TeaModel}
 *
 * <p>QuerySubscriptionDetailResponse</p>
 */
public class QuerySubscriptionDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySubscriptionDetailResponseBody body;

    private QuerySubscriptionDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySubscriptionDetailResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public QuerySubscriptionDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySubscriptionDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySubscriptionDetailResponseBody body);

        @Override
        QuerySubscriptionDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySubscriptionDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySubscriptionDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySubscriptionDetailResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(QuerySubscriptionDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySubscriptionDetailResponse build() {
            return new QuerySubscriptionDetailResponse(this);
        } 

    } 

}
