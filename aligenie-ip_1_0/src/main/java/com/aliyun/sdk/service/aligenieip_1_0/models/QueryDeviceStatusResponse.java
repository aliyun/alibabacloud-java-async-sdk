// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDeviceStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryDeviceStatusResponse</p>
 */
public class QueryDeviceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryDeviceStatusResponseBody body;

    private QueryDeviceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryDeviceStatusResponse create() {
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
    public QueryDeviceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryDeviceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryDeviceStatusResponseBody body);

        @Override
        QueryDeviceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryDeviceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryDeviceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryDeviceStatusResponse response) {
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
        public Builder body(QueryDeviceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryDeviceStatusResponse build() {
            return new QueryDeviceStatusResponse(this);
        } 

    } 

}
