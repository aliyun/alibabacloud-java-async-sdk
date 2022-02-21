// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeCommonPrintedInvoiceResponse} extends {@link TeaModel}
 *
 * <p>RecognizeCommonPrintedInvoiceResponse</p>
 */
public class RecognizeCommonPrintedInvoiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeCommonPrintedInvoiceResponseBody body;

    private RecognizeCommonPrintedInvoiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeCommonPrintedInvoiceResponse create() {
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
    public RecognizeCommonPrintedInvoiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeCommonPrintedInvoiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeCommonPrintedInvoiceResponseBody body);

        @Override
        RecognizeCommonPrintedInvoiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeCommonPrintedInvoiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeCommonPrintedInvoiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeCommonPrintedInvoiceResponse response) {
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
        public Builder body(RecognizeCommonPrintedInvoiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeCommonPrintedInvoiceResponse build() {
            return new RecognizeCommonPrintedInvoiceResponse(this);
        } 

    } 

}
