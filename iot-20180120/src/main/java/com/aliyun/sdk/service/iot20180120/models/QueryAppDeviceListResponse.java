// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryAppDeviceListResponse} extends {@link TeaModel}
 *
 * <p>QueryAppDeviceListResponse</p>
 */
public class QueryAppDeviceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryAppDeviceListResponseBody body;

    private QueryAppDeviceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryAppDeviceListResponse create() {
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
    public QueryAppDeviceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryAppDeviceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryAppDeviceListResponseBody body);

        @Override
        QueryAppDeviceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryAppDeviceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryAppDeviceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryAppDeviceListResponse response) {
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
        public Builder body(QueryAppDeviceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryAppDeviceListResponse build() {
            return new QueryAppDeviceListResponse(this);
        } 

    } 

}
