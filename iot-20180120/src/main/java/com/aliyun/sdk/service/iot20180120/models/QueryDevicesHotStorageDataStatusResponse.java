// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDevicesHotStorageDataStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryDevicesHotStorageDataStatusResponse</p>
 */
public class QueryDevicesHotStorageDataStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDevicesHotStorageDataStatusResponseBody body;

    private QueryDevicesHotStorageDataStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDevicesHotStorageDataStatusResponse create() {
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
    public QueryDevicesHotStorageDataStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDevicesHotStorageDataStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDevicesHotStorageDataStatusResponseBody body);

        @Override
        QueryDevicesHotStorageDataStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDevicesHotStorageDataStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDevicesHotStorageDataStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDevicesHotStorageDataStatusResponse response) {
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
        public Builder body(QueryDevicesHotStorageDataStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDevicesHotStorageDataStatusResponse build() {
            return new QueryDevicesHotStorageDataStatusResponse(this);
        } 

    } 

}
