// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMgsApirestResponse} extends {@link TeaModel}
 *
 * <p>QueryMgsApirestResponse</p>
 */
public class QueryMgsApirestResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMgsApirestResponseBody body;

    private QueryMgsApirestResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMgsApirestResponse create() {
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
    public QueryMgsApirestResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMgsApirestResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMgsApirestResponseBody body);

        @Override
        QueryMgsApirestResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMgsApirestResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMgsApirestResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMgsApirestResponse response) {
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
        public Builder body(QueryMgsApirestResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMgsApirestResponse build() {
            return new QueryMgsApirestResponse(this);
        } 

    } 

}
