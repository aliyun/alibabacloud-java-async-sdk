// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHotelRoomDeviceResponse} extends {@link TeaModel}
 *
 * <p>GetHotelRoomDeviceResponse</p>
 */
public class GetHotelRoomDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHotelRoomDeviceResponseBody body;

    private GetHotelRoomDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHotelRoomDeviceResponse create() {
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
    public GetHotelRoomDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHotelRoomDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHotelRoomDeviceResponseBody body);

        @Override
        GetHotelRoomDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHotelRoomDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHotelRoomDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHotelRoomDeviceResponse response) {
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
        public Builder body(GetHotelRoomDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHotelRoomDeviceResponse build() {
            return new GetHotelRoomDeviceResponse(this);
        } 

    } 

}
