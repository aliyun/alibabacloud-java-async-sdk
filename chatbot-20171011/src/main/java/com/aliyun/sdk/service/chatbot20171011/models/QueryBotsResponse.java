// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBotsResponse} extends {@link TeaModel}
 *
 * <p>QueryBotsResponse</p>
 */
public class QueryBotsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryBotsResponseBody body;

    private QueryBotsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryBotsResponse create() {
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
    public QueryBotsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryBotsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryBotsResponseBody body);

        @Override
        QueryBotsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryBotsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryBotsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryBotsResponse response) {
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
        public Builder body(QueryBotsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryBotsResponse build() {
            return new QueryBotsResponse(this);
        } 

    } 

}
