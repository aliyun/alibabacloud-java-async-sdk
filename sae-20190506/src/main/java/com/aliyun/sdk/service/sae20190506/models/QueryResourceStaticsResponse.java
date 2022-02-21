// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryResourceStaticsResponse} extends {@link TeaModel}
 *
 * <p>QueryResourceStaticsResponse</p>
 */
public class QueryResourceStaticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryResourceStaticsResponseBody body;

    private QueryResourceStaticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryResourceStaticsResponse create() {
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
    public QueryResourceStaticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryResourceStaticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryResourceStaticsResponseBody body);

        @Override
        QueryResourceStaticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryResourceStaticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryResourceStaticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryResourceStaticsResponse response) {
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
        public Builder body(QueryResourceStaticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryResourceStaticsResponse build() {
            return new QueryResourceStaticsResponse(this);
        } 

    } 

}
