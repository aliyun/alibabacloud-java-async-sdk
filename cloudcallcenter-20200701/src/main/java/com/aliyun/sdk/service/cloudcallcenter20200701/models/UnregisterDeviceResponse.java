// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudcallcenter20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnregisterDeviceResponse} extends {@link TeaModel}
 *
 * <p>UnregisterDeviceResponse</p>
 */
public class UnregisterDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnregisterDeviceResponseBody body;

    private UnregisterDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnregisterDeviceResponse create() {
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
    public UnregisterDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnregisterDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnregisterDeviceResponseBody body);

        @Override
        UnregisterDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnregisterDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnregisterDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnregisterDeviceResponse response) {
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
        public Builder body(UnregisterDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnregisterDeviceResponse build() {
            return new UnregisterDeviceResponse(this);
        } 

    } 

}
