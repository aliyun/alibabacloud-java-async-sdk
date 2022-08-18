// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeApplicationToUsersResponse} extends {@link TeaModel}
 *
 * <p>AuthorizeApplicationToUsersResponse</p>
 */
public class AuthorizeApplicationToUsersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AuthorizeApplicationToUsersResponseBody body;

    private AuthorizeApplicationToUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AuthorizeApplicationToUsersResponse create() {
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
    public AuthorizeApplicationToUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AuthorizeApplicationToUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AuthorizeApplicationToUsersResponseBody body);

        @Override
        AuthorizeApplicationToUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AuthorizeApplicationToUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AuthorizeApplicationToUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AuthorizeApplicationToUsersResponse response) {
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
        public Builder body(AuthorizeApplicationToUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AuthorizeApplicationToUsersResponse build() {
            return new AuthorizeApplicationToUsersResponse(this);
        } 

    } 

}
