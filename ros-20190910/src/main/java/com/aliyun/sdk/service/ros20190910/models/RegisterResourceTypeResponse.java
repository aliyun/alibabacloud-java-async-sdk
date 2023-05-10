// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterResourceTypeResponse} extends {@link TeaModel}
 *
 * <p>RegisterResourceTypeResponse</p>
 */
public class RegisterResourceTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterResourceTypeResponseBody body;

    private RegisterResourceTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterResourceTypeResponse create() {
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
    public RegisterResourceTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterResourceTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterResourceTypeResponseBody body);

        @Override
        RegisterResourceTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterResourceTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterResourceTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterResourceTypeResponse response) {
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
        public Builder body(RegisterResourceTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterResourceTypeResponse build() {
            return new RegisterResourceTypeResponse(this);
        } 

    } 

}
