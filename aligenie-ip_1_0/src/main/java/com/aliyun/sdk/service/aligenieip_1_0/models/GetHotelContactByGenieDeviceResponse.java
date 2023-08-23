// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelContactByGenieDeviceResponse} extends {@link TeaModel}
 *
 * <p>GetHotelContactByGenieDeviceResponse</p>
 */
public class GetHotelContactByGenieDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelContactByGenieDeviceResponseBody body;

    private GetHotelContactByGenieDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelContactByGenieDeviceResponse create() {
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
    public GetHotelContactByGenieDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelContactByGenieDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelContactByGenieDeviceResponseBody body);

        @Override
        GetHotelContactByGenieDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelContactByGenieDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelContactByGenieDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelContactByGenieDeviceResponse response) {
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
        public Builder body(GetHotelContactByGenieDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelContactByGenieDeviceResponse build() {
            return new GetHotelContactByGenieDeviceResponse(this);
        } 

    } 

}
