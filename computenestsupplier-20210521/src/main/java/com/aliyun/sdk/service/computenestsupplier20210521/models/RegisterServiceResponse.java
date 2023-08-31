// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterServiceResponse} extends {@link TeaModel}
 *
 * <p>RegisterServiceResponse</p>
 */
public class RegisterServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterServiceResponseBody body;

    private RegisterServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterServiceResponse create() {
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
    public RegisterServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterServiceResponseBody body);

        @Override
        RegisterServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterServiceResponse response) {
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
        public Builder body(RegisterServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterServiceResponse build() {
            return new RegisterServiceResponse(this);
        } 

    } 

}
