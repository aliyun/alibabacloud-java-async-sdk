// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotelControlDeviceResponse} extends {@link TeaModel}
 *
 * <p>ListHotelControlDeviceResponse</p>
 */
public class ListHotelControlDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListHotelControlDeviceResponseBody body;

    private ListHotelControlDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListHotelControlDeviceResponse create() {
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
    public ListHotelControlDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListHotelControlDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListHotelControlDeviceResponseBody body);

        @Override
        ListHotelControlDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListHotelControlDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListHotelControlDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListHotelControlDeviceResponse response) {
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
        public Builder body(ListHotelControlDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListHotelControlDeviceResponse build() {
            return new ListHotelControlDeviceResponse(this);
        } 

    } 

}
