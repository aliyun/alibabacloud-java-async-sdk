// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeApplicationToGroupsResponse} extends {@link TeaModel}
 *
 * <p>AuthorizeApplicationToGroupsResponse</p>
 */
public class AuthorizeApplicationToGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AuthorizeApplicationToGroupsResponseBody body;

    private AuthorizeApplicationToGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AuthorizeApplicationToGroupsResponse create() {
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
    public AuthorizeApplicationToGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AuthorizeApplicationToGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AuthorizeApplicationToGroupsResponseBody body);

        @Override
        AuthorizeApplicationToGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AuthorizeApplicationToGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AuthorizeApplicationToGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AuthorizeApplicationToGroupsResponse response) {
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
        public Builder body(AuthorizeApplicationToGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AuthorizeApplicationToGroupsResponse build() {
            return new AuthorizeApplicationToGroupsResponse(this);
        } 

    } 

}
