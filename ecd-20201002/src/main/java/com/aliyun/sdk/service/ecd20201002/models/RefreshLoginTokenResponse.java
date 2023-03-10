// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshLoginTokenResponse} extends {@link TeaModel}
 *
 * <p>RefreshLoginTokenResponse</p>
 */
public class RefreshLoginTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RefreshLoginTokenResponseBody body;

    private RefreshLoginTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RefreshLoginTokenResponse create() {
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
    public RefreshLoginTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RefreshLoginTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RefreshLoginTokenResponseBody body);

        @Override
        RefreshLoginTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RefreshLoginTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RefreshLoginTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RefreshLoginTokenResponse response) {
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
        public Builder body(RefreshLoginTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RefreshLoginTokenResponse build() {
            return new RefreshLoginTokenResponse(this);
        } 

    } 

}
