// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportImageResponse} extends {@link TeaModel}
 *
 * <p>ImportImageResponse</p>
 */
public class ImportImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportImageResponseBody body;

    private ImportImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportImageResponse create() {
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
    public ImportImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportImageResponseBody body);

        @Override
        ImportImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportImageResponse response) {
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
        public Builder body(ImportImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportImageResponse build() {
            return new ImportImageResponse(this);
        } 

    } 

}
