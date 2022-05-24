// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCopyrightResponse} extends {@link TeaModel}
 *
 * <p>QueryCopyrightResponse</p>
 */
public class QueryCopyrightResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryCopyrightResponseBody body;

    private QueryCopyrightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryCopyrightResponse create() {
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
    public QueryCopyrightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryCopyrightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryCopyrightResponseBody body);

        @Override
        QueryCopyrightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryCopyrightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryCopyrightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryCopyrightResponse response) {
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
        public Builder body(QueryCopyrightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryCopyrightResponse build() {
            return new QueryCopyrightResponse(this);
        } 

    } 

}
