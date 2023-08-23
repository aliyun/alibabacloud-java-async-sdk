// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageGetHotelRoomDevicesResponse} extends {@link TeaModel}
 *
 * <p>PageGetHotelRoomDevicesResponse</p>
 */
public class PageGetHotelRoomDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PageGetHotelRoomDevicesResponseBody body;

    private PageGetHotelRoomDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PageGetHotelRoomDevicesResponse create() {
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
    public PageGetHotelRoomDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PageGetHotelRoomDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PageGetHotelRoomDevicesResponseBody body);

        @Override
        PageGetHotelRoomDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PageGetHotelRoomDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PageGetHotelRoomDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PageGetHotelRoomDevicesResponse response) {
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
        public Builder body(PageGetHotelRoomDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PageGetHotelRoomDevicesResponse build() {
            return new PageGetHotelRoomDevicesResponse(this);
        } 

    } 

}
