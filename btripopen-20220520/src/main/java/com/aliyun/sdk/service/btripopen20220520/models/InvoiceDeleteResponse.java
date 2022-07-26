// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceDeleteResponse} extends {@link TeaModel}
 *
 * <p>InvoiceDeleteResponse</p>
 */
public class InvoiceDeleteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvoiceDeleteResponseBody body;

    private InvoiceDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvoiceDeleteResponse create() {
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
    public InvoiceDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvoiceDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvoiceDeleteResponseBody body);

        @Override
        InvoiceDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvoiceDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvoiceDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvoiceDeleteResponse response) {
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
        public Builder body(InvoiceDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvoiceDeleteResponse build() {
            return new InvoiceDeleteResponse(this);
        } 

    } 

}
