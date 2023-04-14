// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dypnsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyWithFusionAuthTokenResponse} extends {@link TeaModel}
 *
 * <p>VerifyWithFusionAuthTokenResponse</p>
 */
public class VerifyWithFusionAuthTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyWithFusionAuthTokenResponseBody body;

    private VerifyWithFusionAuthTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyWithFusionAuthTokenResponse create() {
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
    public VerifyWithFusionAuthTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyWithFusionAuthTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyWithFusionAuthTokenResponseBody body);

        @Override
        VerifyWithFusionAuthTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyWithFusionAuthTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyWithFusionAuthTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyWithFusionAuthTokenResponse response) {
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
        public Builder body(VerifyWithFusionAuthTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyWithFusionAuthTokenResponse build() {
            return new VerifyWithFusionAuthTokenResponse(this);
        } 

    } 

}
