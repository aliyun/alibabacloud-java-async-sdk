// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCategoriesResponse} extends {@link TeaModel}
 *
 * <p>QueryCategoriesResponse</p>
 */
public class QueryCategoriesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCategoriesResponseBody body;

    private QueryCategoriesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCategoriesResponse create() {
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
    public QueryCategoriesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCategoriesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCategoriesResponseBody body);

        @Override
        QueryCategoriesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCategoriesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCategoriesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCategoriesResponse response) {
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
        public Builder body(QueryCategoriesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCategoriesResponse build() {
            return new QueryCategoriesResponse(this);
        } 

    } 

}
