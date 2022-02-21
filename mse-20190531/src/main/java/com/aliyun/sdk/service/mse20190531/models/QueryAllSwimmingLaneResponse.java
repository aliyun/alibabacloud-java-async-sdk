// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAllSwimmingLaneResponse} extends {@link TeaModel}
 *
 * <p>QueryAllSwimmingLaneResponse</p>
 */
public class QueryAllSwimmingLaneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAllSwimmingLaneResponseBody body;

    private QueryAllSwimmingLaneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAllSwimmingLaneResponse create() {
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
    public QueryAllSwimmingLaneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAllSwimmingLaneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAllSwimmingLaneResponseBody body);

        @Override
        QueryAllSwimmingLaneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAllSwimmingLaneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAllSwimmingLaneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAllSwimmingLaneResponse response) {
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
        public Builder body(QueryAllSwimmingLaneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAllSwimmingLaneResponse build() {
            return new QueryAllSwimmingLaneResponse(this);
        } 

    } 

}
