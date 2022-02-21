// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteDevicesResponse} extends {@link TeaModel}
 *
 * <p>BatchDeleteDevicesResponse</p>
 */
public class BatchDeleteDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchDeleteDevicesResponseBody body;

    private BatchDeleteDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchDeleteDevicesResponse create() {
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
    public BatchDeleteDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchDeleteDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchDeleteDevicesResponseBody body);

        @Override
        BatchDeleteDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchDeleteDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchDeleteDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchDeleteDevicesResponse response) {
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
        public Builder body(BatchDeleteDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchDeleteDevicesResponse build() {
            return new BatchDeleteDevicesResponse(this);
        } 

    } 

}
