// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEmbeddedInfoResponse} extends {@link TeaModel}
 *
 * <p>QueryEmbeddedInfoResponse</p>
 */
public class QueryEmbeddedInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEmbeddedInfoResponseBody body;

    private QueryEmbeddedInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEmbeddedInfoResponse create() {
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
    public QueryEmbeddedInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEmbeddedInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEmbeddedInfoResponseBody body);

        @Override
        QueryEmbeddedInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEmbeddedInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEmbeddedInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEmbeddedInfoResponse response) {
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
        public Builder body(QueryEmbeddedInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEmbeddedInfoResponse build() {
            return new QueryEmbeddedInfoResponse(this);
        } 

    } 

}
