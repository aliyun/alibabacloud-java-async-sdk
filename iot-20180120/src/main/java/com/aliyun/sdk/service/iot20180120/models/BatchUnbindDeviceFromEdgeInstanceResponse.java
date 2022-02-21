// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUnbindDeviceFromEdgeInstanceResponse} extends {@link TeaModel}
 *
 * <p>BatchUnbindDeviceFromEdgeInstanceResponse</p>
 */
public class BatchUnbindDeviceFromEdgeInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUnbindDeviceFromEdgeInstanceResponseBody body;

    private BatchUnbindDeviceFromEdgeInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUnbindDeviceFromEdgeInstanceResponse create() {
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
    public BatchUnbindDeviceFromEdgeInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUnbindDeviceFromEdgeInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUnbindDeviceFromEdgeInstanceResponseBody body);

        @Override
        BatchUnbindDeviceFromEdgeInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUnbindDeviceFromEdgeInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUnbindDeviceFromEdgeInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUnbindDeviceFromEdgeInstanceResponse response) {
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
        public Builder body(BatchUnbindDeviceFromEdgeInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUnbindDeviceFromEdgeInstanceResponse build() {
            return new BatchUnbindDeviceFromEdgeInstanceResponse(this);
        } 

    } 

}
