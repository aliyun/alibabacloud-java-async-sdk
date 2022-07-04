// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEmbeddedStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryEmbeddedStatusResponse</p>
 */
public class QueryEmbeddedStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEmbeddedStatusResponseBody body;

    private QueryEmbeddedStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEmbeddedStatusResponse create() {
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
    public QueryEmbeddedStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEmbeddedStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEmbeddedStatusResponseBody body);

        @Override
        QueryEmbeddedStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEmbeddedStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEmbeddedStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEmbeddedStatusResponse response) {
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
        public Builder body(QueryEmbeddedStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEmbeddedStatusResponse build() {
            return new QueryEmbeddedStatusResponse(this);
        } 

    } 

}
