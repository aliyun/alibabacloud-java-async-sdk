// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvailableInstancesResponse} extends {@link TeaModel}
 *
 * <p>QueryAvailableInstancesResponse</p>
 */
public class QueryAvailableInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAvailableInstancesResponseBody body;

    private QueryAvailableInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAvailableInstancesResponse create() {
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
    public QueryAvailableInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAvailableInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAvailableInstancesResponseBody body);

        @Override
        QueryAvailableInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAvailableInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAvailableInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAvailableInstancesResponse response) {
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
        public Builder body(QueryAvailableInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAvailableInstancesResponse build() {
            return new QueryAvailableInstancesResponse(this);
        } 

    } 

}
