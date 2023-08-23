// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ControlRoomDeviceResponse} extends {@link TeaModel}
 *
 * <p>ControlRoomDeviceResponse</p>
 */
public class ControlRoomDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ControlRoomDeviceResponseBody body;

    private ControlRoomDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ControlRoomDeviceResponse create() {
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
    public ControlRoomDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ControlRoomDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ControlRoomDeviceResponseBody body);

        @Override
        ControlRoomDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ControlRoomDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ControlRoomDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ControlRoomDeviceResponse response) {
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
        public Builder body(ControlRoomDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ControlRoomDeviceResponse build() {
            return new ControlRoomDeviceResponse(this);
        } 

    } 

}
