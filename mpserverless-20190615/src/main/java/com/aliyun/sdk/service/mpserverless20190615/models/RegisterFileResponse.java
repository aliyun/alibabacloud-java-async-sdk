// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterFileResponse} extends {@link TeaModel}
 *
 * <p>RegisterFileResponse</p>
 */
public class RegisterFileResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterFileResponseBody body;

    private RegisterFileResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterFileResponse create() {
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
    public RegisterFileResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterFileResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterFileResponseBody body);

        @Override
        RegisterFileResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterFileResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterFileResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterFileResponse response) {
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
        public Builder body(RegisterFileResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterFileResponse build() {
            return new RegisterFileResponse(this);
        } 

    } 

}
