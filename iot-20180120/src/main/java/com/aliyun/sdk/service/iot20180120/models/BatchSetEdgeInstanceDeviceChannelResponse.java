// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchSetEdgeInstanceDeviceChannelResponse} extends {@link TeaModel}
 *
 * <p>BatchSetEdgeInstanceDeviceChannelResponse</p>
 */
public class BatchSetEdgeInstanceDeviceChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchSetEdgeInstanceDeviceChannelResponseBody body;

    private BatchSetEdgeInstanceDeviceChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchSetEdgeInstanceDeviceChannelResponse create() {
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
    public BatchSetEdgeInstanceDeviceChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchSetEdgeInstanceDeviceChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchSetEdgeInstanceDeviceChannelResponseBody body);

        @Override
        BatchSetEdgeInstanceDeviceChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchSetEdgeInstanceDeviceChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchSetEdgeInstanceDeviceChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchSetEdgeInstanceDeviceChannelResponse response) {
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
        public Builder body(BatchSetEdgeInstanceDeviceChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchSetEdgeInstanceDeviceChannelResponse build() {
            return new BatchSetEdgeInstanceDeviceChannelResponse(this);
        } 

    } 

}
