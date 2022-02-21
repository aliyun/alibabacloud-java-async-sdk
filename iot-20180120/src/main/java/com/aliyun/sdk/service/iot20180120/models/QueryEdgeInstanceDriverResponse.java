// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeInstanceDriverResponse} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceDriverResponse</p>
 */
public class QueryEdgeInstanceDriverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEdgeInstanceDriverResponseBody body;

    private QueryEdgeInstanceDriverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEdgeInstanceDriverResponse create() {
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
    public QueryEdgeInstanceDriverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEdgeInstanceDriverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEdgeInstanceDriverResponseBody body);

        @Override
        QueryEdgeInstanceDriverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEdgeInstanceDriverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEdgeInstanceDriverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEdgeInstanceDriverResponse response) {
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
        public Builder body(QueryEdgeInstanceDriverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEdgeInstanceDriverResponse build() {
            return new QueryEdgeInstanceDriverResponse(this);
        } 

    } 

}
