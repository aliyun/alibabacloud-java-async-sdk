// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddRenderingDeviceInternetPortsResponse} extends {@link TeaModel}
 *
 * <p>AddRenderingDeviceInternetPortsResponse</p>
 */
public class AddRenderingDeviceInternetPortsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddRenderingDeviceInternetPortsResponseBody body;

    private AddRenderingDeviceInternetPortsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddRenderingDeviceInternetPortsResponse create() {
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
    public AddRenderingDeviceInternetPortsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddRenderingDeviceInternetPortsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddRenderingDeviceInternetPortsResponseBody body);

        @Override
        AddRenderingDeviceInternetPortsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddRenderingDeviceInternetPortsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddRenderingDeviceInternetPortsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddRenderingDeviceInternetPortsResponse response) {
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
        public Builder body(AddRenderingDeviceInternetPortsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddRenderingDeviceInternetPortsResponse build() {
            return new AddRenderingDeviceInternetPortsResponse(this);
        } 

    } 

}
