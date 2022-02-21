// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryPerspectivesResponse} extends {@link TeaModel}
 *
 * <p>QueryPerspectivesResponse</p>
 */
public class QueryPerspectivesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryPerspectivesResponseBody body;

    private QueryPerspectivesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryPerspectivesResponse create() {
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
    public QueryPerspectivesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryPerspectivesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryPerspectivesResponseBody body);

        @Override
        QueryPerspectivesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryPerspectivesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryPerspectivesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryPerspectivesResponse response) {
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
        public Builder body(QueryPerspectivesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryPerspectivesResponse build() {
            return new QueryPerspectivesResponse(this);
        } 

    } 

}
