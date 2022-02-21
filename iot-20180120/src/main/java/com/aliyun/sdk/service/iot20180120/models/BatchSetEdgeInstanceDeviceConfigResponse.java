// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetEdgeInstanceDeviceConfigResponse} extends {@link TeaModel}
 *
 * <p>BatchSetEdgeInstanceDeviceConfigResponse</p>
 */
public class BatchSetEdgeInstanceDeviceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchSetEdgeInstanceDeviceConfigResponseBody body;

    private BatchSetEdgeInstanceDeviceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchSetEdgeInstanceDeviceConfigResponse create() {
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
    public BatchSetEdgeInstanceDeviceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchSetEdgeInstanceDeviceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchSetEdgeInstanceDeviceConfigResponseBody body);

        @Override
        BatchSetEdgeInstanceDeviceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchSetEdgeInstanceDeviceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchSetEdgeInstanceDeviceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchSetEdgeInstanceDeviceConfigResponse response) {
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
        public Builder body(BatchSetEdgeInstanceDeviceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchSetEdgeInstanceDeviceConfigResponse build() {
            return new BatchSetEdgeInstanceDeviceConfigResponse(this);
        } 

    } 

}
