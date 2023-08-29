// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMcubeVhostResponse} extends {@link TeaModel}
 *
 * <p>QueryMcubeVhostResponse</p>
 */
public class QueryMcubeVhostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMcubeVhostResponseBody body;

    private QueryMcubeVhostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMcubeVhostResponse create() {
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
    public QueryMcubeVhostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMcubeVhostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMcubeVhostResponseBody body);

        @Override
        QueryMcubeVhostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMcubeVhostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMcubeVhostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMcubeVhostResponse response) {
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
        public Builder body(QueryMcubeVhostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMcubeVhostResponse build() {
            return new QueryMcubeVhostResponse(this);
        } 

    } 

}
