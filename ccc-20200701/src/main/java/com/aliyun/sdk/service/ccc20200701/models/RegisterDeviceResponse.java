// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDeviceResponse} extends {@link TeaModel}
 *
 * <p>RegisterDeviceResponse</p>
 */
public class RegisterDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterDeviceResponseBody body;

    private RegisterDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterDeviceResponse create() {
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
    public RegisterDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterDeviceResponseBody body);

        @Override
        RegisterDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterDeviceResponse response) {
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
        public Builder body(RegisterDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterDeviceResponse build() {
            return new RegisterDeviceResponse(this);
        } 

    } 

}
