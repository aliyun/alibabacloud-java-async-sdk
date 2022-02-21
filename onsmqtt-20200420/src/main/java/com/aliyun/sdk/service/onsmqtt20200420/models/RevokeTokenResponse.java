// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeTokenResponse} extends {@link TeaModel}
 *
 * <p>RevokeTokenResponse</p>
 */
public class RevokeTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RevokeTokenResponseBody body;

    private RevokeTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RevokeTokenResponse create() {
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
    public RevokeTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RevokeTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RevokeTokenResponseBody body);

        @Override
        RevokeTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RevokeTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RevokeTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RevokeTokenResponse response) {
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
        public Builder body(RevokeTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RevokeTokenResponse build() {
            return new RevokeTokenResponse(this);
        } 

    } 

}
