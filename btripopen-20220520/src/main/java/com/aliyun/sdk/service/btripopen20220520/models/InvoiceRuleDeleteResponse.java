// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceRuleDeleteResponse} extends {@link TeaModel}
 *
 * <p>InvoiceRuleDeleteResponse</p>
 */
public class InvoiceRuleDeleteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvoiceRuleDeleteResponseBody body;

    private InvoiceRuleDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvoiceRuleDeleteResponse create() {
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
    public InvoiceRuleDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvoiceRuleDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvoiceRuleDeleteResponseBody body);

        @Override
        InvoiceRuleDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvoiceRuleDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvoiceRuleDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvoiceRuleDeleteResponse response) {
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
        public Builder body(InvoiceRuleDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvoiceRuleDeleteResponse build() {
            return new InvoiceRuleDeleteResponse(this);
        } 

    } 

}
