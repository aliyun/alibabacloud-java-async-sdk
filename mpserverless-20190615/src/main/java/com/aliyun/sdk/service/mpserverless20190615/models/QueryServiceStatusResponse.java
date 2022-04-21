// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryServiceStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryServiceStatusResponse</p>
 */
public class QueryServiceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryServiceStatusResponseBody body;

    private QueryServiceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryServiceStatusResponse create() {
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
    public QueryServiceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryServiceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryServiceStatusResponseBody body);

        @Override
        QueryServiceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryServiceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryServiceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryServiceStatusResponse response) {
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
        public Builder body(QueryServiceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryServiceStatusResponse build() {
            return new QueryServiceStatusResponse(this);
        } 

    } 

}
