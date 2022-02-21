// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportDataKeyResponse} extends {@link TeaModel}
 *
 * <p>ExportDataKeyResponse</p>
 */
public class ExportDataKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportDataKeyResponseBody body;

    private ExportDataKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportDataKeyResponse create() {
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
    public ExportDataKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportDataKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportDataKeyResponseBody body);

        @Override
        ExportDataKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportDataKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportDataKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportDataKeyResponse response) {
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
        public Builder body(ExportDataKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportDataKeyResponse build() {
            return new ExportDataKeyResponse(this);
        } 

    } 

}
