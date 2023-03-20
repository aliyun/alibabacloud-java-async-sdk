// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddInvoiceEntityResponse} extends {@link TeaModel}
 *
 * <p>AddInvoiceEntityResponse</p>
 */
public class AddInvoiceEntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddInvoiceEntityResponseBody body;

    private AddInvoiceEntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddInvoiceEntityResponse create() {
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
    public AddInvoiceEntityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddInvoiceEntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddInvoiceEntityResponseBody body);

        @Override
        AddInvoiceEntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddInvoiceEntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddInvoiceEntityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddInvoiceEntityResponse response) {
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
        public Builder body(AddInvoiceEntityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddInvoiceEntityResponse build() {
            return new AddInvoiceEntityResponse(this);
        } 

    } 

}
