// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryIotIdsByAIPlanResponse} extends {@link TeaModel}
 *
 * <p>QueryIotIdsByAIPlanResponse</p>
 */
public class QueryIotIdsByAIPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryIotIdsByAIPlanResponseBody body;

    private QueryIotIdsByAIPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryIotIdsByAIPlanResponse create() {
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
    public QueryIotIdsByAIPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryIotIdsByAIPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryIotIdsByAIPlanResponseBody body);

        @Override
        QueryIotIdsByAIPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryIotIdsByAIPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryIotIdsByAIPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryIotIdsByAIPlanResponse response) {
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
        public Builder body(QueryIotIdsByAIPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryIotIdsByAIPlanResponse build() {
            return new QueryIotIdsByAIPlanResponse(this);
        } 

    } 

}
