// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchImportVehicleDeviceResponse} extends {@link TeaModel}
 *
 * <p>BatchImportVehicleDeviceResponse</p>
 */
public class BatchImportVehicleDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BatchImportVehicleDeviceResponseBody body;

    private BatchImportVehicleDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BatchImportVehicleDeviceResponse create() {
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
    public BatchImportVehicleDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BatchImportVehicleDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BatchImportVehicleDeviceResponseBody body);

        @Override
        BatchImportVehicleDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BatchImportVehicleDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BatchImportVehicleDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BatchImportVehicleDeviceResponse response) {
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
        public Builder body(BatchImportVehicleDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BatchImportVehicleDeviceResponse build() {
            return new BatchImportVehicleDeviceResponse(this);
        } 

    } 

}
