// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsSignListResponse} extends {@link TeaModel}
 *
 * <p>QuerySmsSignListResponse</p>
 */
public class QuerySmsSignListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySmsSignListResponseBody body;

    private QuerySmsSignListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySmsSignListResponse create() {
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
    public QuerySmsSignListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySmsSignListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySmsSignListResponseBody body);

        @Override
        QuerySmsSignListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySmsSignListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySmsSignListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySmsSignListResponse response) {
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
        public Builder body(QuerySmsSignListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySmsSignListResponse build() {
            return new QuerySmsSignListResponse(this);
        } 

    } 

}
