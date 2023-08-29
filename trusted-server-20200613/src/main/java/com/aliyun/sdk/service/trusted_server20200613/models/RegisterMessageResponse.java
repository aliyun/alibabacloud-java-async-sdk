// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RegisterMessageResponse} extends {@link TeaModel}
 *
 * <p>RegisterMessageResponse</p>
 */
public class RegisterMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RegisterMessageResponseBody body;

    private RegisterMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RegisterMessageResponse create() {
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
    public RegisterMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RegisterMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RegisterMessageResponseBody body);

        @Override
        RegisterMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RegisterMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RegisterMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RegisterMessageResponse response) {
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
        public Builder body(RegisterMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RegisterMessageResponse build() {
            return new RegisterMessageResponse(this);
        } 

    } 

}
