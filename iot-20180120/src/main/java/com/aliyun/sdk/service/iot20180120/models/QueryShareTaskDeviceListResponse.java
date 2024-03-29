// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryShareTaskDeviceListResponse} extends {@link TeaModel}
 *
 * <p>QueryShareTaskDeviceListResponse</p>
 */
public class QueryShareTaskDeviceListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryShareTaskDeviceListResponseBody body;

    private QueryShareTaskDeviceListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryShareTaskDeviceListResponse create() {
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
    public QueryShareTaskDeviceListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryShareTaskDeviceListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryShareTaskDeviceListResponseBody body);

        @Override
        QueryShareTaskDeviceListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryShareTaskDeviceListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryShareTaskDeviceListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryShareTaskDeviceListResponse response) {
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
        public Builder body(QueryShareTaskDeviceListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryShareTaskDeviceListResponse build() {
            return new QueryShareTaskDeviceListResponse(this);
        } 

    } 

}
