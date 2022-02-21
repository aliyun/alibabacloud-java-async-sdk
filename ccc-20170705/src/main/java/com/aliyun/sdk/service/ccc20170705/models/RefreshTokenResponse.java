// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshTokenResponse} extends {@link TeaModel}
 *
 * <p>RefreshTokenResponse</p>
 */
public class RefreshTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshTokenResponseBody body;

    private RefreshTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshTokenResponse create() {
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
    public RefreshTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshTokenResponseBody body);

        @Override
        RefreshTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshTokenResponse response) {
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
        public Builder body(RefreshTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshTokenResponse build() {
            return new RefreshTokenResponse(this);
        } 

    } 

}
