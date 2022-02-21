// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAIPlanResponse} extends {@link TeaModel}
 *
 * <p>QueryAIPlanResponse</p>
 */
public class QueryAIPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAIPlanResponseBody body;

    private QueryAIPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAIPlanResponse create() {
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
    public QueryAIPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAIPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAIPlanResponseBody body);

        @Override
        QueryAIPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAIPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAIPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAIPlanResponse response) {
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
        public Builder body(QueryAIPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAIPlanResponse build() {
            return new QueryAIPlanResponse(this);
        } 

    } 

}
