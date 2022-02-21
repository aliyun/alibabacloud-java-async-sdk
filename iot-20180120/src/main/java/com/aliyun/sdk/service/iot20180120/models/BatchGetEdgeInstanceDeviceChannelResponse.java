// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDeviceChannelResponse} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDeviceChannelResponse</p>
 */
public class BatchGetEdgeInstanceDeviceChannelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchGetEdgeInstanceDeviceChannelResponseBody body;

    private BatchGetEdgeInstanceDeviceChannelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchGetEdgeInstanceDeviceChannelResponse create() {
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
    public BatchGetEdgeInstanceDeviceChannelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchGetEdgeInstanceDeviceChannelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchGetEdgeInstanceDeviceChannelResponseBody body);

        @Override
        BatchGetEdgeInstanceDeviceChannelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchGetEdgeInstanceDeviceChannelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchGetEdgeInstanceDeviceChannelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchGetEdgeInstanceDeviceChannelResponse response) {
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
        public Builder body(BatchGetEdgeInstanceDeviceChannelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchGetEdgeInstanceDeviceChannelResponse build() {
            return new BatchGetEdgeInstanceDeviceChannelResponse(this);
        } 

    } 

}
