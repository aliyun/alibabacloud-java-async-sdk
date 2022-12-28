// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAcccessTokenResponse} extends {@link TeaModel}
 *
 * <p>GenerateAcccessTokenResponse</p>
 */
public class GenerateAcccessTokenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateAcccessTokenResponseBody body;

    private GenerateAcccessTokenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateAcccessTokenResponse create() {
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
    public GenerateAcccessTokenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateAcccessTokenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateAcccessTokenResponseBody body);

        @Override
        GenerateAcccessTokenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateAcccessTokenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateAcccessTokenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateAcccessTokenResponse response) {
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
        public Builder body(GenerateAcccessTokenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateAcccessTokenResponse build() {
            return new GenerateAcccessTokenResponse(this);
        } 

    } 

}
