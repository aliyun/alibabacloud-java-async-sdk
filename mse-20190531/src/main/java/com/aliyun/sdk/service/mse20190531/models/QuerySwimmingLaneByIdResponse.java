// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySwimmingLaneByIdResponse} extends {@link TeaModel}
 *
 * <p>QuerySwimmingLaneByIdResponse</p>
 */
public class QuerySwimmingLaneByIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QuerySwimmingLaneByIdResponseBody body;

    private QuerySwimmingLaneByIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QuerySwimmingLaneByIdResponse create() {
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
    public QuerySwimmingLaneByIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QuerySwimmingLaneByIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QuerySwimmingLaneByIdResponseBody body);

        @Override
        QuerySwimmingLaneByIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QuerySwimmingLaneByIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QuerySwimmingLaneByIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QuerySwimmingLaneByIdResponse response) {
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
        public Builder body(QuerySwimmingLaneByIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QuerySwimmingLaneByIdResponse build() {
            return new QuerySwimmingLaneByIdResponse(this);
        } 

    } 

}
