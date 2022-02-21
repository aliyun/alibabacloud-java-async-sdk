// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateFileUploadURLResponse} extends {@link TeaModel}
 *
 * <p>GenerateFileUploadURLResponse</p>
 */
public class GenerateFileUploadURLResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GenerateFileUploadURLResponseBody body;

    private GenerateFileUploadURLResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GenerateFileUploadURLResponse create() {
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
    public GenerateFileUploadURLResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GenerateFileUploadURLResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GenerateFileUploadURLResponseBody body);

        @Override
        GenerateFileUploadURLResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GenerateFileUploadURLResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GenerateFileUploadURLResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GenerateFileUploadURLResponse response) {
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
        public Builder body(GenerateFileUploadURLResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GenerateFileUploadURLResponse build() {
            return new GenerateFileUploadURLResponse(this);
        } 

    } 

}
