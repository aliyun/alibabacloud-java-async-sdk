// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysmsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySendDetailsResponse} extends {@link TeaModel}
 *
 * <p>QuerySendDetailsResponse</p>
 */
public class QuerySendDetailsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySendDetailsResponseBody body;

    private QuerySendDetailsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySendDetailsResponse create() {
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
    public QuerySendDetailsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySendDetailsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySendDetailsResponseBody body);

        @Override
        QuerySendDetailsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySendDetailsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySendDetailsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySendDetailsResponse response) {
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
        public Builder body(QuerySendDetailsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySendDetailsResponse build() {
            return new QuerySendDetailsResponse(this);
        } 

    } 

}
