// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIntentsResponse} extends {@link TeaModel}
 *
 * <p>QueryIntentsResponse</p>
 */
public class QueryIntentsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryIntentsResponseBody body;

    private QueryIntentsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryIntentsResponse create() {
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
    public QueryIntentsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryIntentsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryIntentsResponseBody body);

        @Override
        QueryIntentsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryIntentsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryIntentsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryIntentsResponse response) {
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
        public Builder body(QueryIntentsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryIntentsResponse build() {
            return new QueryIntentsResponse(this);
        } 

    } 

}
