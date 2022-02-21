// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleDeviceServiceResponse} extends {@link TeaModel}
 *
 * <p>RescaleDeviceServiceResponse</p>
 */
public class RescaleDeviceServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RescaleDeviceServiceResponseBody body;

    private RescaleDeviceServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RescaleDeviceServiceResponse create() {
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
    public RescaleDeviceServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RescaleDeviceServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RescaleDeviceServiceResponseBody body);

        @Override
        RescaleDeviceServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RescaleDeviceServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RescaleDeviceServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RescaleDeviceServiceResponse response) {
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
        public Builder body(RescaleDeviceServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RescaleDeviceServiceResponse build() {
            return new RescaleDeviceServiceResponse(this);
        } 

    } 

}
