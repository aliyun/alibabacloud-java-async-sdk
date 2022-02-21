// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryShortUrlResponse} extends {@link TeaModel}
 *
 * <p>QueryShortUrlResponse</p>
 */
public class QueryShortUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryShortUrlResponseBody body;

    private QueryShortUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryShortUrlResponse create() {
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
    public QueryShortUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryShortUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryShortUrlResponseBody body);

        @Override
        QueryShortUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryShortUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryShortUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryShortUrlResponse response) {
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
        public Builder body(QueryShortUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryShortUrlResponse build() {
            return new QueryShortUrlResponse(this);
        } 

    } 

}
