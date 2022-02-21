// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelImportResponse} extends {@link TeaModel}
 *
 * <p>CancelImportResponse</p>
 */
public class CancelImportResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelImportResponseBody body;

    private CancelImportResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelImportResponse create() {
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
    public CancelImportResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelImportResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelImportResponseBody body);

        @Override
        CancelImportResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelImportResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelImportResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelImportResponse response) {
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
        public Builder body(CancelImportResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelImportResponse build() {
            return new CancelImportResponse(this);
        } 

    } 

}
