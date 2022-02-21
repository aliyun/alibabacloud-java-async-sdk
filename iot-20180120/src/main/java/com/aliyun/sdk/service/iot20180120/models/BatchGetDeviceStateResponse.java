// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetDeviceStateResponse} extends {@link TeaModel}
 *
 * <p>BatchGetDeviceStateResponse</p>
 */
public class BatchGetDeviceStateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchGetDeviceStateResponseBody body;

    private BatchGetDeviceStateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchGetDeviceStateResponse create() {
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
    public BatchGetDeviceStateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGetDeviceStateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchGetDeviceStateResponseBody body);

        @Override
        BatchGetDeviceStateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGetDeviceStateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchGetDeviceStateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGetDeviceStateResponse response) {
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
        public Builder body(BatchGetDeviceStateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGetDeviceStateResponse build() {
            return new BatchGetDeviceStateResponse(this);
        } 

    } 

}
