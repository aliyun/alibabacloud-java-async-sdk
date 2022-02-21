// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportKeyMaterialResponse} extends {@link TeaModel}
 *
 * <p>ImportKeyMaterialResponse</p>
 */
public class ImportKeyMaterialResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportKeyMaterialResponseBody body;

    private ImportKeyMaterialResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportKeyMaterialResponse create() {
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
    public ImportKeyMaterialResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportKeyMaterialResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportKeyMaterialResponseBody body);

        @Override
        ImportKeyMaterialResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportKeyMaterialResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportKeyMaterialResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportKeyMaterialResponse response) {
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
        public Builder body(ImportKeyMaterialResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportKeyMaterialResponse build() {
            return new ImportKeyMaterialResponse(this);
        } 

    } 

}
