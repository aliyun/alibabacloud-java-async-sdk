// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskResultResponse} extends {@link TeaModel}
 *
 * <p>QueryTaskResultResponse</p>
 */
public class QueryTaskResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryTaskResultResponseBody body;

    private QueryTaskResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryTaskResultResponse create() {
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
    public QueryTaskResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryTaskResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryTaskResultResponseBody body);

        @Override
        QueryTaskResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryTaskResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryTaskResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryTaskResultResponse response) {
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
        public Builder body(QueryTaskResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryTaskResultResponse build() {
            return new QueryTaskResultResponse(this);
        } 

    } 

}
