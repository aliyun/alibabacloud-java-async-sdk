// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySmsSignResponse} extends {@link TeaModel}
 *
 * <p>QuerySmsSignResponse</p>
 */
public class QuerySmsSignResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySmsSignResponseBody body;

    private QuerySmsSignResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySmsSignResponse create() {
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
    public QuerySmsSignResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySmsSignResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySmsSignResponseBody body);

        @Override
        QuerySmsSignResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySmsSignResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySmsSignResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySmsSignResponse response) {
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
        public Builder body(QuerySmsSignResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySmsSignResponse build() {
            return new QuerySmsSignResponse(this);
        } 

    } 

}
