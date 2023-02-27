// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterDevicesResponse} extends {@link TeaModel}
 *
 * <p>RegisterDevicesResponse</p>
 */
public class RegisterDevicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterDevicesResponseBody body;

    private RegisterDevicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterDevicesResponse create() {
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
    public RegisterDevicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterDevicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterDevicesResponseBody body);

        @Override
        RegisterDevicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterDevicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterDevicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterDevicesResponse response) {
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
        public Builder body(RegisterDevicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterDevicesResponse build() {
            return new RegisterDevicesResponse(this);
        } 

    } 

}
