// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchQueryDeviceDetailResponse} extends {@link TeaModel}
 *
 * <p>BatchQueryDeviceDetailResponse</p>
 */
public class BatchQueryDeviceDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchQueryDeviceDetailResponseBody body;

    private BatchQueryDeviceDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchQueryDeviceDetailResponse create() {
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
    public BatchQueryDeviceDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchQueryDeviceDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchQueryDeviceDetailResponseBody body);

        @Override
        BatchQueryDeviceDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchQueryDeviceDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchQueryDeviceDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchQueryDeviceDetailResponse response) {
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
        public Builder body(BatchQueryDeviceDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchQueryDeviceDetailResponse build() {
            return new BatchQueryDeviceDetailResponse(this);
        } 

    } 

}
