// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryBatchRegisterDeviceStatusResponse} extends {@link TeaModel}
 *
 * <p>QueryBatchRegisterDeviceStatusResponse</p>
 */
public class QueryBatchRegisterDeviceStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryBatchRegisterDeviceStatusResponseBody body;

    private QueryBatchRegisterDeviceStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryBatchRegisterDeviceStatusResponse create() {
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
    public QueryBatchRegisterDeviceStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryBatchRegisterDeviceStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryBatchRegisterDeviceStatusResponseBody body);

        @Override
        QueryBatchRegisterDeviceStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryBatchRegisterDeviceStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryBatchRegisterDeviceStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryBatchRegisterDeviceStatusResponse response) {
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
        public Builder body(QueryBatchRegisterDeviceStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryBatchRegisterDeviceStatusResponse build() {
            return new QueryBatchRegisterDeviceStatusResponse(this);
        } 

    } 

}
