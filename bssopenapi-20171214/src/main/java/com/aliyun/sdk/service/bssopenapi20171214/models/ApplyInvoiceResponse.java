// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ApplyInvoiceResponse} extends {@link TeaModel}
 *
 * <p>ApplyInvoiceResponse</p>
 */
public class ApplyInvoiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ApplyInvoiceResponseBody body;

    private ApplyInvoiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ApplyInvoiceResponse create() {
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
    public ApplyInvoiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ApplyInvoiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ApplyInvoiceResponseBody body);

        @Override
        ApplyInvoiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ApplyInvoiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ApplyInvoiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ApplyInvoiceResponse response) {
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
        public Builder body(ApplyInvoiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ApplyInvoiceResponse build() {
            return new ApplyInvoiceResponse(this);
        } 

    } 

}
