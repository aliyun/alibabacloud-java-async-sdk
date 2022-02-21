// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryProductTopicResponse} extends {@link TeaModel}
 *
 * <p>QueryProductTopicResponse</p>
 */
public class QueryProductTopicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryProductTopicResponseBody body;

    private QueryProductTopicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryProductTopicResponse create() {
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
    public QueryProductTopicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryProductTopicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryProductTopicResponseBody body);

        @Override
        QueryProductTopicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryProductTopicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryProductTopicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryProductTopicResponse response) {
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
        public Builder body(QueryProductTopicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryProductTopicResponse build() {
            return new QueryProductTopicResponse(this);
        } 

    } 

}
