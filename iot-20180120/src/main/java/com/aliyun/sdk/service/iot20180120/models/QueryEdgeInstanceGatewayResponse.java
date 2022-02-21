// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeInstanceGatewayResponse} extends {@link TeaModel}
 *
 * <p>QueryEdgeInstanceGatewayResponse</p>
 */
public class QueryEdgeInstanceGatewayResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEdgeInstanceGatewayResponseBody body;

    private QueryEdgeInstanceGatewayResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEdgeInstanceGatewayResponse create() {
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
    public QueryEdgeInstanceGatewayResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEdgeInstanceGatewayResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEdgeInstanceGatewayResponseBody body);

        @Override
        QueryEdgeInstanceGatewayResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEdgeInstanceGatewayResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEdgeInstanceGatewayResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEdgeInstanceGatewayResponse response) {
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
        public Builder body(QueryEdgeInstanceGatewayResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEdgeInstanceGatewayResponse build() {
            return new QueryEdgeInstanceGatewayResponse(this);
        } 

    } 

}
