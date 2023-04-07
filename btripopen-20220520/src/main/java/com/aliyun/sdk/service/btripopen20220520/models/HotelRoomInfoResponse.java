// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotelRoomInfoResponse} extends {@link TeaModel}
 *
 * <p>HotelRoomInfoResponse</p>
 */
public class HotelRoomInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private HotelRoomInfoResponseBody body;

    private HotelRoomInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static HotelRoomInfoResponse create() {
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
    public HotelRoomInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<HotelRoomInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(HotelRoomInfoResponseBody body);

        @Override
        HotelRoomInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<HotelRoomInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private HotelRoomInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(HotelRoomInfoResponse response) {
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
        public Builder body(HotelRoomInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public HotelRoomInfoResponse build() {
            return new HotelRoomInfoResponse(this);
        } 

    } 

}
