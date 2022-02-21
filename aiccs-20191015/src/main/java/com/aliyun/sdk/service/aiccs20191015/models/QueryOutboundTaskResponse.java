// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryOutboundTaskResponse} extends {@link TeaModel}
 *
 * <p>QueryOutboundTaskResponse</p>
 */
public class QueryOutboundTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryOutboundTaskResponseBody body;

    private QueryOutboundTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryOutboundTaskResponse create() {
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
    public QueryOutboundTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryOutboundTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryOutboundTaskResponseBody body);

        @Override
        QueryOutboundTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryOutboundTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryOutboundTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryOutboundTaskResponse response) {
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
        public Builder body(QueryOutboundTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryOutboundTaskResponse build() {
            return new QueryOutboundTaskResponse(this);
        } 

    } 

}
