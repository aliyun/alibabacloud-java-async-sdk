// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceAddResponse} extends {@link TeaModel}
 *
 * <p>InvoiceAddResponse</p>
 */
public class InvoiceAddResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvoiceAddResponseBody body;

    private InvoiceAddResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvoiceAddResponse create() {
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
    public InvoiceAddResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvoiceAddResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvoiceAddResponseBody body);

        @Override
        InvoiceAddResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvoiceAddResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvoiceAddResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvoiceAddResponse response) {
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
        public Builder body(InvoiceAddResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvoiceAddResponse build() {
            return new InvoiceAddResponse(this);
        } 

    } 

}
