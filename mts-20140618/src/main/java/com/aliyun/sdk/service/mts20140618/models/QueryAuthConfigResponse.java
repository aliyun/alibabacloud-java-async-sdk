// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAuthConfigResponse} extends {@link TeaModel}
 *
 * <p>QueryAuthConfigResponse</p>
 */
public class QueryAuthConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAuthConfigResponseBody body;

    private QueryAuthConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAuthConfigResponse create() {
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
    public QueryAuthConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAuthConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAuthConfigResponseBody body);

        @Override
        QueryAuthConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAuthConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAuthConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAuthConfigResponse response) {
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
        public Builder body(QueryAuthConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAuthConfigResponse build() {
            return new QueryAuthConfigResponse(this);
        } 

    } 

}
