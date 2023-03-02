// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeDeviceResponse} extends {@link TeaModel}
 *
 * <p>AuthorizeDeviceResponse</p>
 */
public class AuthorizeDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AuthorizeDeviceResponseBody body;

    private AuthorizeDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AuthorizeDeviceResponse create() {
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
    public AuthorizeDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AuthorizeDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AuthorizeDeviceResponseBody body);

        @Override
        AuthorizeDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AuthorizeDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AuthorizeDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AuthorizeDeviceResponse response) {
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
        public Builder body(AuthorizeDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AuthorizeDeviceResponse build() {
            return new AuthorizeDeviceResponse(this);
        } 

    } 

}
