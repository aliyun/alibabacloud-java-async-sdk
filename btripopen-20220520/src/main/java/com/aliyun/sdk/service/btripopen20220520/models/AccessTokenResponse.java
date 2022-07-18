// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AccessTokenResponse} extends {@link TeaModel}
 *
 * <p>AccessTokenResponse</p>
 */
public class AccessTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AccessTokenResponseBody body;

    private AccessTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AccessTokenResponse create() {
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
    public AccessTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AccessTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AccessTokenResponseBody body);

        @Override
        AccessTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AccessTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AccessTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AccessTokenResponse response) {
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
        public Builder body(AccessTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AccessTokenResponse build() {
            return new AccessTokenResponse(this);
        } 

    } 

}
