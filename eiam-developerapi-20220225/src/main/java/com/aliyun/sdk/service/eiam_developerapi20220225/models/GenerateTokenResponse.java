// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam_developerapi20220225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eiam.dev.models.*;

/**
 * {@link GenerateTokenResponse} extends {@link TeaModel}
 *
 * <p>GenerateTokenResponse</p>
 */
public class GenerateTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateTokenResponseBody body;

    private GenerateTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateTokenResponse create() {
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
    public GenerateTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateTokenResponseBody body);

        @Override
        GenerateTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateTokenResponse response) {
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
        public Builder body(GenerateTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateTokenResponse build() {
            return new GenerateTokenResponse(this);
        } 

    } 

}
