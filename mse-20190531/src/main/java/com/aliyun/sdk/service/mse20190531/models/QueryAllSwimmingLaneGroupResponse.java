// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAllSwimmingLaneGroupResponse} extends {@link TeaModel}
 *
 * <p>QueryAllSwimmingLaneGroupResponse</p>
 */
public class QueryAllSwimmingLaneGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAllSwimmingLaneGroupResponseBody body;

    private QueryAllSwimmingLaneGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAllSwimmingLaneGroupResponse create() {
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
    public QueryAllSwimmingLaneGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAllSwimmingLaneGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAllSwimmingLaneGroupResponseBody body);

        @Override
        QueryAllSwimmingLaneGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAllSwimmingLaneGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAllSwimmingLaneGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAllSwimmingLaneGroupResponse response) {
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
        public Builder body(QueryAllSwimmingLaneGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAllSwimmingLaneGroupResponse build() {
            return new QueryAllSwimmingLaneGroupResponse(this);
        } 

    } 

}
