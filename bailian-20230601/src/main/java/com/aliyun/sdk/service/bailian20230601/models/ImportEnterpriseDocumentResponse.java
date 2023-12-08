// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportEnterpriseDocumentResponse} extends {@link TeaModel}
 *
 * <p>ImportEnterpriseDocumentResponse</p>
 */
public class ImportEnterpriseDocumentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportEnterpriseDocumentResponseBody body;

    private ImportEnterpriseDocumentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportEnterpriseDocumentResponse create() {
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
    public ImportEnterpriseDocumentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportEnterpriseDocumentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportEnterpriseDocumentResponseBody body);

        @Override
        ImportEnterpriseDocumentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportEnterpriseDocumentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportEnterpriseDocumentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportEnterpriseDocumentResponse response) {
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
        public Builder body(ImportEnterpriseDocumentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportEnterpriseDocumentResponse build() {
            return new ImportEnterpriseDocumentResponse(this);
        } 

    } 

}
