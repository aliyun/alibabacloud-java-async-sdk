// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAssistFileUploadUrlResponse} extends {@link TeaModel}
 *
 * <p>GenerateAssistFileUploadUrlResponse</p>
 */
public class GenerateAssistFileUploadUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateAssistFileUploadUrlResponseBody body;

    private GenerateAssistFileUploadUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateAssistFileUploadUrlResponse create() {
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
    public GenerateAssistFileUploadUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateAssistFileUploadUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateAssistFileUploadUrlResponseBody body);

        @Override
        GenerateAssistFileUploadUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateAssistFileUploadUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateAssistFileUploadUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateAssistFileUploadUrlResponse response) {
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
        public Builder body(GenerateAssistFileUploadUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateAssistFileUploadUrlResponse build() {
            return new GenerateAssistFileUploadUrlResponse(this);
        } 

    } 

}
