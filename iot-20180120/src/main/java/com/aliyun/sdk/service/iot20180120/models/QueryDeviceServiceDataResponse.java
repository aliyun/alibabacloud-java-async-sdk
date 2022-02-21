// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceServiceDataResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceServiceDataResponse</p>
 */
public class QueryDeviceServiceDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceServiceDataResponseBody body;

    private QueryDeviceServiceDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceServiceDataResponse create() {
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
    public QueryDeviceServiceDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceServiceDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceServiceDataResponseBody body);

        @Override
        QueryDeviceServiceDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceServiceDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceServiceDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceServiceDataResponse response) {
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
        public Builder body(QueryDeviceServiceDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceServiceDataResponse build() {
            return new QueryDeviceServiceDataResponse(this);
        } 

    } 

}
