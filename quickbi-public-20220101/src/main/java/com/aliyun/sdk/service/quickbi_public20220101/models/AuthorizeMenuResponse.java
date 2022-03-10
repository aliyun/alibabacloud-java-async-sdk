// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeMenuResponse} extends {@link TeaModel}
 *
 * <p>AuthorizeMenuResponse</p>
 */
public class AuthorizeMenuResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AuthorizeMenuResponseBody body;

    private AuthorizeMenuResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AuthorizeMenuResponse create() {
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
    public AuthorizeMenuResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AuthorizeMenuResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AuthorizeMenuResponseBody body);

        @Override
        AuthorizeMenuResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AuthorizeMenuResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AuthorizeMenuResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AuthorizeMenuResponse response) {
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
        public Builder body(AuthorizeMenuResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AuthorizeMenuResponse build() {
            return new AuthorizeMenuResponse(this);
        } 

    } 

}
