// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommercialVehicleDevicesResponse} extends {@link TeaModel}
 *
 * <p>ListCommercialVehicleDevicesResponse</p>
 */
public class ListCommercialVehicleDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCommercialVehicleDevicesResponseBody body;

    private ListCommercialVehicleDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCommercialVehicleDevicesResponse create() {
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
    public ListCommercialVehicleDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCommercialVehicleDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCommercialVehicleDevicesResponseBody body);

        @Override
        ListCommercialVehicleDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCommercialVehicleDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCommercialVehicleDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCommercialVehicleDevicesResponse response) {
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
        public Builder body(ListCommercialVehicleDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCommercialVehicleDevicesResponse build() {
            return new ListCommercialVehicleDevicesResponse(this);
        } 

    } 

}
