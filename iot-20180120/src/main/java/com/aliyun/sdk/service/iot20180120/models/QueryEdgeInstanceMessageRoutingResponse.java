// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeInstanceMessageRoutingResponse} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceMessageRoutingResponse</p>
 */
public class QueryEdgeInstanceMessageRoutingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEdgeInstanceMessageRoutingResponseBody body;

    private QueryEdgeInstanceMessageRoutingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEdgeInstanceMessageRoutingResponse create() {
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
    public QueryEdgeInstanceMessageRoutingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEdgeInstanceMessageRoutingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEdgeInstanceMessageRoutingResponseBody body);

        @Override
        QueryEdgeInstanceMessageRoutingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEdgeInstanceMessageRoutingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEdgeInstanceMessageRoutingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEdgeInstanceMessageRoutingResponse response) {
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
        public Builder body(QueryEdgeInstanceMessageRoutingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEdgeInstanceMessageRoutingResponse build() {
            return new QueryEdgeInstanceMessageRoutingResponse(this);
        } 

    } 

}
