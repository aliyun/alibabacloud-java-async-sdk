// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportCustomCallTaggingResponse} extends {@link TeaModel}
 *
 * <p>ImportCustomCallTaggingResponse</p>
 */
public class ImportCustomCallTaggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportCustomCallTaggingResponseBody body;

    private ImportCustomCallTaggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportCustomCallTaggingResponse create() {
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
    public ImportCustomCallTaggingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportCustomCallTaggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportCustomCallTaggingResponseBody body);

        @Override
        ImportCustomCallTaggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportCustomCallTaggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportCustomCallTaggingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportCustomCallTaggingResponse response) {
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
        public Builder body(ImportCustomCallTaggingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportCustomCallTaggingResponse build() {
            return new ImportCustomCallTaggingResponse(this);
        } 

    } 

}
