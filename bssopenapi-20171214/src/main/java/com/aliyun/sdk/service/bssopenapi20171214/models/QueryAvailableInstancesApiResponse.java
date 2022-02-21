// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAvailableInstancesApiResponse} extends {@link TeaModel}
 *
 * <p>QueryAvailableInstancesApiResponse</p>
 */
public class QueryAvailableInstancesApiResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAvailableInstancesApiResponseBody body;

    private QueryAvailableInstancesApiResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAvailableInstancesApiResponse create() {
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
    public QueryAvailableInstancesApiResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAvailableInstancesApiResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAvailableInstancesApiResponseBody body);

        @Override
        QueryAvailableInstancesApiResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAvailableInstancesApiResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAvailableInstancesApiResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAvailableInstancesApiResponse response) {
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
        public Builder body(QueryAvailableInstancesApiResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAvailableInstancesApiResponse build() {
            return new QueryAvailableInstancesApiResponse(this);
        } 

    } 

}
