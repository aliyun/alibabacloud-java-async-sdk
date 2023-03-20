// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsInvoiceScanQueryResponse} extends {@link TeaModel}
 *
 * <p>InsInvoiceScanQueryResponse</p>
 */
public class InsInvoiceScanQueryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private InsInvoiceScanQueryResponseBody body;

    private InsInvoiceScanQueryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static InsInvoiceScanQueryResponse create() {
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
    public InsInvoiceScanQueryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<InsInvoiceScanQueryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(InsInvoiceScanQueryResponseBody body);

        @Override
        InsInvoiceScanQueryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<InsInvoiceScanQueryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private InsInvoiceScanQueryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(InsInvoiceScanQueryResponse response) {
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
        public Builder body(InsInvoiceScanQueryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public InsInvoiceScanQueryResponse build() {
            return new InsInvoiceScanQueryResponse(this);
        } 

    } 

}
