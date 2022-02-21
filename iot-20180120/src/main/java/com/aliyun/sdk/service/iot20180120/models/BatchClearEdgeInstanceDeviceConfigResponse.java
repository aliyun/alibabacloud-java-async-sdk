// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchClearEdgeInstanceDeviceConfigResponse} extends {@link TeaModel}
 *
 * <p>BatchClearEdgeInstanceDeviceConfigResponse</p>
 */
public class BatchClearEdgeInstanceDeviceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchClearEdgeInstanceDeviceConfigResponseBody body;

    private BatchClearEdgeInstanceDeviceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchClearEdgeInstanceDeviceConfigResponse create() {
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
    public BatchClearEdgeInstanceDeviceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchClearEdgeInstanceDeviceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchClearEdgeInstanceDeviceConfigResponseBody body);

        @Override
        BatchClearEdgeInstanceDeviceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchClearEdgeInstanceDeviceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchClearEdgeInstanceDeviceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchClearEdgeInstanceDeviceConfigResponse response) {
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
        public Builder body(BatchClearEdgeInstanceDeviceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchClearEdgeInstanceDeviceConfigResponse build() {
            return new BatchClearEdgeInstanceDeviceConfigResponse(this);
        } 

    } 

}
