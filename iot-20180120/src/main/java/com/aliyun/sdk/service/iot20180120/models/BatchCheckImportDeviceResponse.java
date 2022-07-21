// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCheckImportDeviceResponse} extends {@link TeaModel}
 *
 * <p>BatchCheckImportDeviceResponse</p>
 */
public class BatchCheckImportDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchCheckImportDeviceResponseBody body;

    private BatchCheckImportDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchCheckImportDeviceResponse create() {
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
    public BatchCheckImportDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchCheckImportDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchCheckImportDeviceResponseBody body);

        @Override
        BatchCheckImportDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchCheckImportDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchCheckImportDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchCheckImportDeviceResponse response) {
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
        public Builder body(BatchCheckImportDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchCheckImportDeviceResponse build() {
            return new BatchCheckImportDeviceResponse(this);
        } 

    } 

}
