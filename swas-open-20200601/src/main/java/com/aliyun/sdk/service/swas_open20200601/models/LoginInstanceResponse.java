// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LoginInstanceResponse} extends {@link TeaModel}
 *
 * <p>LoginInstanceResponse</p>
 */
public class LoginInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LoginInstanceResponseBody body;

    private LoginInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LoginInstanceResponse create() {
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
    public LoginInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LoginInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LoginInstanceResponseBody body);

        @Override
        LoginInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LoginInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LoginInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LoginInstanceResponse response) {
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
        public Builder body(LoginInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LoginInstanceResponse build() {
            return new LoginInstanceResponse(this);
        } 

    } 

}
