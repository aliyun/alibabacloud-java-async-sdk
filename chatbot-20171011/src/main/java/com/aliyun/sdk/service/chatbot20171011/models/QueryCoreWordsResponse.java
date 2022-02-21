// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCoreWordsResponse} extends {@link TeaModel}
 *
 * <p>QueryCoreWordsResponse</p>
 */
public class QueryCoreWordsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCoreWordsResponseBody body;

    private QueryCoreWordsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCoreWordsResponse create() {
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
    public QueryCoreWordsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCoreWordsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCoreWordsResponseBody body);

        @Override
        QueryCoreWordsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCoreWordsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCoreWordsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCoreWordsResponse response) {
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
        public Builder body(QueryCoreWordsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCoreWordsResponse build() {
            return new QueryCoreWordsResponse(this);
        } 

    } 

}
