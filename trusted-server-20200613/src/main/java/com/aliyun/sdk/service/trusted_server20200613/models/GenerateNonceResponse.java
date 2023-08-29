// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateNonceResponse} extends {@link TeaModel}
 *
 * <p>GenerateNonceResponse</p>
 */
public class GenerateNonceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateNonceResponseBody body;

    private GenerateNonceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateNonceResponse create() {
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
    public GenerateNonceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateNonceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateNonceResponseBody body);

        @Override
        GenerateNonceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateNonceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateNonceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateNonceResponse response) {
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
        public Builder body(GenerateNonceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateNonceResponse build() {
            return new GenerateNonceResponse(this);
        } 

    } 

}
