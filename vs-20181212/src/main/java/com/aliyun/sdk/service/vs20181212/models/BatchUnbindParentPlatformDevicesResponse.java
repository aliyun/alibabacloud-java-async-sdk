// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchUnbindParentPlatformDevicesResponse} extends {@link TeaModel}
 *
 * <p>BatchUnbindParentPlatformDevicesResponse</p>
 */
public class BatchUnbindParentPlatformDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchUnbindParentPlatformDevicesResponseBody body;

    private BatchUnbindParentPlatformDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchUnbindParentPlatformDevicesResponse create() {
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
    public BatchUnbindParentPlatformDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchUnbindParentPlatformDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchUnbindParentPlatformDevicesResponseBody body);

        @Override
        BatchUnbindParentPlatformDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchUnbindParentPlatformDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchUnbindParentPlatformDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchUnbindParentPlatformDevicesResponse response) {
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
        public Builder body(BatchUnbindParentPlatformDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchUnbindParentPlatformDevicesResponse build() {
            return new BatchUnbindParentPlatformDevicesResponse(this);
        } 

    } 

}
