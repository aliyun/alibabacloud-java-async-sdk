// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryEntitiesResponse} extends {@link TeaModel}
 *
 * <p>QueryEntitiesResponse</p>
 */
public class QueryEntitiesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryEntitiesResponseBody body;

    private QueryEntitiesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryEntitiesResponse create() {
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
    public QueryEntitiesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryEntitiesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryEntitiesResponseBody body);

        @Override
        QueryEntitiesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryEntitiesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryEntitiesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryEntitiesResponse response) {
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
        public Builder body(QueryEntitiesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryEntitiesResponse build() {
            return new QueryEntitiesResponse(this);
        } 

    } 

}
