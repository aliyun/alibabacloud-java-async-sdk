// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCommercialVehicleDeviceResponse} extends {@link TeaModel}
 *
 * <p>GetCommercialVehicleDeviceResponse</p>
 */
public class GetCommercialVehicleDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCommercialVehicleDeviceResponseBody body;

    private GetCommercialVehicleDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCommercialVehicleDeviceResponse create() {
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
    public GetCommercialVehicleDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCommercialVehicleDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCommercialVehicleDeviceResponseBody body);

        @Override
        GetCommercialVehicleDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCommercialVehicleDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCommercialVehicleDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCommercialVehicleDeviceResponse response) {
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
        public Builder body(GetCommercialVehicleDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCommercialVehicleDeviceResponse build() {
            return new GetCommercialVehicleDeviceResponse(this);
        } 

    } 

}
