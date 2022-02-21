// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportSwaggerResponse} extends {@link TeaModel}
 *
 * <p>ImportSwaggerResponse</p>
 */
public class ImportSwaggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportSwaggerResponseBody body;

    private ImportSwaggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportSwaggerResponse create() {
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
    public ImportSwaggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportSwaggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportSwaggerResponseBody body);

        @Override
        ImportSwaggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportSwaggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportSwaggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportSwaggerResponse response) {
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
        public Builder body(ImportSwaggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportSwaggerResponse build() {
            return new ImportSwaggerResponse(this);
        } 

    } 

}
