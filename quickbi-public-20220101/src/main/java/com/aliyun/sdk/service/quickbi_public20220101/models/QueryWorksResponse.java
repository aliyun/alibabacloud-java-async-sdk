// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryWorksResponse} extends {@link TeaModel}
 *
 * <p>QueryWorksResponse</p>
 */
public class QueryWorksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryWorksResponseBody body;

    private QueryWorksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryWorksResponse create() {
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
    public QueryWorksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryWorksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryWorksResponseBody body);

        @Override
        QueryWorksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryWorksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryWorksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryWorksResponse response) {
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
        public Builder body(QueryWorksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryWorksResponse build() {
            return new QueryWorksResponse(this);
        } 

    } 

}
