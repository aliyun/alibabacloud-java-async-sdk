// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDataMessageResponse} extends {@link TeaModel}
 *
 * <p>QueryDataMessageResponse</p>
 */
public class QueryDataMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDataMessageResponseBody body;

    private QueryDataMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDataMessageResponse create() {
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
    public QueryDataMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDataMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDataMessageResponseBody body);

        @Override
        QueryDataMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDataMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDataMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDataMessageResponse response) {
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
        public Builder body(QueryDataMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDataMessageResponse build() {
            return new QueryDataMessageResponse(this);
        } 

    } 

}
