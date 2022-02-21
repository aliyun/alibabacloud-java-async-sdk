// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeTaxiInvoiceResponse} extends {@link TeaModel}
 *
 * <p>RecognizeTaxiInvoiceResponse</p>
 */
public class RecognizeTaxiInvoiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeTaxiInvoiceResponseBody body;

    private RecognizeTaxiInvoiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeTaxiInvoiceResponse create() {
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
    public RecognizeTaxiInvoiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeTaxiInvoiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeTaxiInvoiceResponseBody body);

        @Override
        RecognizeTaxiInvoiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeTaxiInvoiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeTaxiInvoiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeTaxiInvoiceResponse response) {
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
        public Builder body(RecognizeTaxiInvoiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeTaxiInvoiceResponse build() {
            return new RecognizeTaxiInvoiceResponse(this);
        } 

    } 

}
