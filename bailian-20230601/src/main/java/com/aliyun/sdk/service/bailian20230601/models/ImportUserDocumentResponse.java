// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportUserDocumentResponse} extends {@link TeaModel}
 *
 * <p>ImportUserDocumentResponse</p>
 */
public class ImportUserDocumentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportUserDocumentResponseBody body;

    private ImportUserDocumentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportUserDocumentResponse create() {
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
    public ImportUserDocumentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportUserDocumentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportUserDocumentResponseBody body);

        @Override
        ImportUserDocumentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportUserDocumentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportUserDocumentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportUserDocumentResponse response) {
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
        public Builder body(ImportUserDocumentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportUserDocumentResponse build() {
            return new ImportUserDocumentResponse(this);
        } 

    } 

}
