// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeviceControlResponse} extends {@link TeaModel}
 *
 * <p>DeviceControlResponse</p>
 */
public class DeviceControlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeviceControlResponseBody body;

    private DeviceControlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeviceControlResponse create() {
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
    public DeviceControlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeviceControlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeviceControlResponseBody body);

        @Override
        DeviceControlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeviceControlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeviceControlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeviceControlResponse response) {
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
        public Builder body(DeviceControlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeviceControlResponse build() {
            return new DeviceControlResponse(this);
        } 

    } 

}
