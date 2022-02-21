// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDeviceConfigResponse} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDeviceConfigResponse</p>
 */
public class BatchGetEdgeInstanceDeviceConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchGetEdgeInstanceDeviceConfigResponseBody body;

    private BatchGetEdgeInstanceDeviceConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchGetEdgeInstanceDeviceConfigResponse create() {
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
    public BatchGetEdgeInstanceDeviceConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGetEdgeInstanceDeviceConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchGetEdgeInstanceDeviceConfigResponseBody body);

        @Override
        BatchGetEdgeInstanceDeviceConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGetEdgeInstanceDeviceConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchGetEdgeInstanceDeviceConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGetEdgeInstanceDeviceConfigResponse response) {
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
        public Builder body(BatchGetEdgeInstanceDeviceConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGetEdgeInstanceDeviceConfigResponse build() {
            return new BatchGetEdgeInstanceDeviceConfigResponse(this);
        } 

    } 

}
