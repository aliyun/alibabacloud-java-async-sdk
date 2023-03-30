// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryNamespaceResponse} extends {@link TeaModel}
 *
 * <p>QueryNamespaceResponse</p>
 */
public class QueryNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryNamespaceResponseBody body;

    private QueryNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryNamespaceResponse create() {
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
    public QueryNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryNamespaceResponseBody body);

        @Override
        QueryNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryNamespaceResponse response) {
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
        public Builder body(QueryNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryNamespaceResponse build() {
            return new QueryNamespaceResponse(this);
        } 

    } 

}
