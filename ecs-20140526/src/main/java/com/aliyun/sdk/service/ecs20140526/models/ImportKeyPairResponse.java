// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportKeyPairResponse} extends {@link TeaModel}
 *
 * <p>ImportKeyPairResponse</p>
 */
public class ImportKeyPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportKeyPairResponseBody body;

    private ImportKeyPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportKeyPairResponse create() {
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
    public ImportKeyPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportKeyPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportKeyPairResponseBody body);

        @Override
        ImportKeyPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportKeyPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportKeyPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportKeyPairResponse response) {
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
        public Builder body(ImportKeyPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportKeyPairResponse build() {
            return new ImportKeyPairResponse(this);
        } 

    } 

}
