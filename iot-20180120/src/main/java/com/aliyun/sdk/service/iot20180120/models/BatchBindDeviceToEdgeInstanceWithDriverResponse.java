// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchBindDeviceToEdgeInstanceWithDriverResponse} extends {@link TeaModel}
 *
 * <p>BatchBindDeviceToEdgeInstanceWithDriverResponse</p>
 */
public class BatchBindDeviceToEdgeInstanceWithDriverResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchBindDeviceToEdgeInstanceWithDriverResponseBody body;

    private BatchBindDeviceToEdgeInstanceWithDriverResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchBindDeviceToEdgeInstanceWithDriverResponse create() {
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
    public BatchBindDeviceToEdgeInstanceWithDriverResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchBindDeviceToEdgeInstanceWithDriverResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchBindDeviceToEdgeInstanceWithDriverResponseBody body);

        @Override
        BatchBindDeviceToEdgeInstanceWithDriverResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchBindDeviceToEdgeInstanceWithDriverResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchBindDeviceToEdgeInstanceWithDriverResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchBindDeviceToEdgeInstanceWithDriverResponse response) {
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
        public Builder body(BatchBindDeviceToEdgeInstanceWithDriverResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchBindDeviceToEdgeInstanceWithDriverResponse build() {
            return new BatchBindDeviceToEdgeInstanceWithDriverResponse(this);
        } 

    } 

}
