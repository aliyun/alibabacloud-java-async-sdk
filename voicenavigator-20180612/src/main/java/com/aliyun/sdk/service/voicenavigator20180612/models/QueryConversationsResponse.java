// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.voicenavigator20180612.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConversationsResponse} extends {@link TeaModel}
 *
 * <p>QueryConversationsResponse</p>
 */
public class QueryConversationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryConversationsResponseBody body;

    private QueryConversationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryConversationsResponse create() {
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
    public QueryConversationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryConversationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryConversationsResponseBody body);

        @Override
        QueryConversationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryConversationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryConversationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryConversationsResponse response) {
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
        public Builder body(QueryConversationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryConversationsResponse build() {
            return new QueryConversationsResponse(this);
        } 

    } 

}
