// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeDriverResponse} extends {@link TeaModel}
 *
 * <p>QueryEdgeDriverResponse</p>
 */
public class QueryEdgeDriverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEdgeDriverResponseBody body;

    private QueryEdgeDriverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEdgeDriverResponse create() {
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
    public QueryEdgeDriverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEdgeDriverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEdgeDriverResponseBody body);

        @Override
        QueryEdgeDriverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEdgeDriverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEdgeDriverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEdgeDriverResponse response) {
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
        public Builder body(QueryEdgeDriverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEdgeDriverResponse build() {
            return new QueryEdgeDriverResponse(this);
        } 

    } 

}
