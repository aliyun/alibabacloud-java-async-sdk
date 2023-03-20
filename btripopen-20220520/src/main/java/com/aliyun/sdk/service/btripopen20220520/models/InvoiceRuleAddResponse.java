// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InvoiceRuleAddResponse} extends {@link TeaModel}
 *
 * <p>InvoiceRuleAddResponse</p>
 */
public class InvoiceRuleAddResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InvoiceRuleAddResponseBody body;

    private InvoiceRuleAddResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InvoiceRuleAddResponse create() {
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
    public InvoiceRuleAddResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InvoiceRuleAddResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InvoiceRuleAddResponseBody body);

        @Override
        InvoiceRuleAddResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InvoiceRuleAddResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InvoiceRuleAddResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InvoiceRuleAddResponse response) {
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
        public Builder body(InvoiceRuleAddResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InvoiceRuleAddResponse build() {
            return new InvoiceRuleAddResponse(this);
        } 

    } 

}
