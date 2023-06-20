// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.market20151101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CrossAccountVerifyTokenResponse} extends {@link TeaModel}
 *
 * <p>CrossAccountVerifyTokenResponse</p>
 */
public class CrossAccountVerifyTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CrossAccountVerifyTokenResponseBody body;

    private CrossAccountVerifyTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CrossAccountVerifyTokenResponse create() {
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
    public CrossAccountVerifyTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CrossAccountVerifyTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CrossAccountVerifyTokenResponseBody body);

        @Override
        CrossAccountVerifyTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CrossAccountVerifyTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CrossAccountVerifyTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CrossAccountVerifyTokenResponse response) {
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
        public Builder body(CrossAccountVerifyTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CrossAccountVerifyTokenResponse build() {
            return new CrossAccountVerifyTokenResponse(this);
        } 

    } 

}
