// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExistMcubeRsaKeyResponse} extends {@link TeaModel}
 *
 * <p>ExistMcubeRsaKeyResponse</p>
 */
public class ExistMcubeRsaKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExistMcubeRsaKeyResponseBody body;

    private ExistMcubeRsaKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExistMcubeRsaKeyResponse create() {
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
    public ExistMcubeRsaKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExistMcubeRsaKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExistMcubeRsaKeyResponseBody body);

        @Override
        ExistMcubeRsaKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExistMcubeRsaKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExistMcubeRsaKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExistMcubeRsaKeyResponse response) {
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
        public Builder body(ExistMcubeRsaKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExistMcubeRsaKeyResponse build() {
            return new ExistMcubeRsaKeyResponse(this);
        } 

    } 

}
