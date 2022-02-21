// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskResponse} extends {@link TeaModel}
 *
 * <p>QueryTaskResponse</p>
 */
public class QueryTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTaskResponseBody body;

    private QueryTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTaskResponse create() {
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
    public QueryTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTaskResponseBody body);

        @Override
        QueryTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTaskResponse response) {
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
        public Builder body(QueryTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTaskResponse build() {
            return new QueryTaskResponse(this);
        } 

    } 

}
