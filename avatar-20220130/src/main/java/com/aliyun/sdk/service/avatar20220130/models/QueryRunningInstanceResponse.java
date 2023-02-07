// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.avatar20220130.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRunningInstanceResponse} extends {@link TeaModel}
 *
 * <p>QueryRunningInstanceResponse</p>
 */
public class QueryRunningInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryRunningInstanceResponseBody body;

    private QueryRunningInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryRunningInstanceResponse create() {
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
    public QueryRunningInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryRunningInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryRunningInstanceResponseBody body);

        @Override
        QueryRunningInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryRunningInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryRunningInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryRunningInstanceResponse response) {
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
        public Builder body(QueryRunningInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryRunningInstanceResponse build() {
            return new QueryRunningInstanceResponse(this);
        } 

    } 

}
