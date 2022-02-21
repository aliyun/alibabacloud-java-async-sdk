// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEdgeDriverVersionResponse} extends {@link TeaModel}
 *
 * <p>QueryEdgeDriverVersionResponse</p>
 */
public class QueryEdgeDriverVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEdgeDriverVersionResponseBody body;

    private QueryEdgeDriverVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEdgeDriverVersionResponse create() {
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
    public QueryEdgeDriverVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEdgeDriverVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEdgeDriverVersionResponseBody body);

        @Override
        QueryEdgeDriverVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEdgeDriverVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEdgeDriverVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEdgeDriverVersionResponse response) {
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
        public Builder body(QueryEdgeDriverVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEdgeDriverVersionResponse build() {
            return new QueryEdgeDriverVersionResponse(this);
        } 

    } 

}
