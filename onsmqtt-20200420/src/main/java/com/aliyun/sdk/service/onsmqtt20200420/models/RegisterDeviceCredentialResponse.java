// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDeviceCredentialResponse} extends {@link TeaModel}
 *
 * <p>RegisterDeviceCredentialResponse</p>
 */
public class RegisterDeviceCredentialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterDeviceCredentialResponseBody body;

    private RegisterDeviceCredentialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterDeviceCredentialResponse create() {
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
    public RegisterDeviceCredentialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterDeviceCredentialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterDeviceCredentialResponseBody body);

        @Override
        RegisterDeviceCredentialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterDeviceCredentialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterDeviceCredentialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterDeviceCredentialResponse response) {
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
        public Builder body(RegisterDeviceCredentialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterDeviceCredentialResponse build() {
            return new RegisterDeviceCredentialResponse(this);
        } 

    } 

}
