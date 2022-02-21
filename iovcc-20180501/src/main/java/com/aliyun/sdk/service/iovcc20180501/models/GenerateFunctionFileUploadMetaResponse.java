// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateFunctionFileUploadMetaResponse} extends {@link TeaModel}
 *
 * <p>GenerateFunctionFileUploadMetaResponse</p>
 */
public class GenerateFunctionFileUploadMetaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateFunctionFileUploadMetaResponseBody body;

    private GenerateFunctionFileUploadMetaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateFunctionFileUploadMetaResponse create() {
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
    public GenerateFunctionFileUploadMetaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateFunctionFileUploadMetaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateFunctionFileUploadMetaResponseBody body);

        @Override
        GenerateFunctionFileUploadMetaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateFunctionFileUploadMetaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateFunctionFileUploadMetaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateFunctionFileUploadMetaResponse response) {
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
        public Builder body(GenerateFunctionFileUploadMetaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateFunctionFileUploadMetaResponse build() {
            return new GenerateFunctionFileUploadMetaResponse(this);
        } 

    } 

}
