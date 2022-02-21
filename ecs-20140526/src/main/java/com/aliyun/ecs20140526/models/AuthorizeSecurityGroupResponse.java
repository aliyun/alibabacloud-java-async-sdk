// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AuthorizeSecurityGroupResponse} extends {@link TeaModel}
 *
 * <p>AuthorizeSecurityGroupResponse</p>
 */
public class AuthorizeSecurityGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AuthorizeSecurityGroupResponseBody body;

    private AuthorizeSecurityGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AuthorizeSecurityGroupResponse create() {
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
    public AuthorizeSecurityGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AuthorizeSecurityGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AuthorizeSecurityGroupResponseBody body);

        @Override
        AuthorizeSecurityGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AuthorizeSecurityGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AuthorizeSecurityGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AuthorizeSecurityGroupResponse response) {
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
        public Builder body(AuthorizeSecurityGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AuthorizeSecurityGroupResponse build() {
            return new AuthorizeSecurityGroupResponse(this);
        } 

    } 

}
