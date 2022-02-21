// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartDeviceInstanceResponse} extends {@link TeaModel}
 *
 * <p>RestartDeviceInstanceResponse</p>
 */
public class RestartDeviceInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RestartDeviceInstanceResponseBody body;

    private RestartDeviceInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RestartDeviceInstanceResponse create() {
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
    public RestartDeviceInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RestartDeviceInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RestartDeviceInstanceResponseBody body);

        @Override
        RestartDeviceInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RestartDeviceInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RestartDeviceInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RestartDeviceInstanceResponse response) {
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
        public Builder body(RestartDeviceInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RestartDeviceInstanceResponse build() {
            return new RestartDeviceInstanceResponse(this);
        } 

    } 

}
