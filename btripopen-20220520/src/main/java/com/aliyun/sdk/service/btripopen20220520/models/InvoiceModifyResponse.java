// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceModifyResponse} extends {@link TeaModel}
 *
 * <p>InvoiceModifyResponse</p>
 */
public class InvoiceModifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvoiceModifyResponseBody body;

    private InvoiceModifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvoiceModifyResponse create() {
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
    public InvoiceModifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvoiceModifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvoiceModifyResponseBody body);

        @Override
        InvoiceModifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvoiceModifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvoiceModifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvoiceModifyResponse response) {
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
        public Builder body(InvoiceModifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvoiceModifyResponse build() {
            return new InvoiceModifyResponse(this);
        } 

    } 

}
