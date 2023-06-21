// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMessageResponse} extends {@link TeaModel}
 *
 * <p>QueryMessageResponse</p>
 */
public class QueryMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryMessageResponseBody body;

    private QueryMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryMessageResponse create() {
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
    public QueryMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryMessageResponseBody body);

        @Override
        QueryMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryMessageResponse response) {
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
        public Builder body(QueryMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryMessageResponse build() {
            return new QueryMessageResponse(this);
        } 

    } 

}
