// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryConfigResponse} extends {@link TeaModel}
 *
 * <p>QueryConfigResponse</p>
 */
public class QueryConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryConfigResponseBody body;

    private QueryConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryConfigResponse create() {
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
    public QueryConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryConfigResponseBody body);

        @Override
        QueryConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryConfigResponse response) {
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
        public Builder body(QueryConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryConfigResponse build() {
            return new QueryConfigResponse(this);
        } 

    } 

}
