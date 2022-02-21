// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRenderingDeviceInternetPortsResponse} extends {@link TeaModel}
 *
 * <p>DeleteRenderingDeviceInternetPortsResponse</p>
 */
public class DeleteRenderingDeviceInternetPortsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteRenderingDeviceInternetPortsResponseBody body;

    private DeleteRenderingDeviceInternetPortsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteRenderingDeviceInternetPortsResponse create() {
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
    public DeleteRenderingDeviceInternetPortsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteRenderingDeviceInternetPortsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteRenderingDeviceInternetPortsResponseBody body);

        @Override
        DeleteRenderingDeviceInternetPortsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteRenderingDeviceInternetPortsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteRenderingDeviceInternetPortsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteRenderingDeviceInternetPortsResponse response) {
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
        public Builder body(DeleteRenderingDeviceInternetPortsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteRenderingDeviceInternetPortsResponse build() {
            return new DeleteRenderingDeviceInternetPortsResponse(this);
        } 

    } 

}
