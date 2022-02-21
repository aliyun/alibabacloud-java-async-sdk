// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeUsedCarInvoiceResponse} extends {@link TeaModel}
 *
 * <p>RecognizeUsedCarInvoiceResponse</p>
 */
public class RecognizeUsedCarInvoiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeUsedCarInvoiceResponseBody body;

    private RecognizeUsedCarInvoiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeUsedCarInvoiceResponse create() {
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
    public RecognizeUsedCarInvoiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeUsedCarInvoiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeUsedCarInvoiceResponseBody body);

        @Override
        RecognizeUsedCarInvoiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeUsedCarInvoiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeUsedCarInvoiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeUsedCarInvoiceResponse response) {
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
        public Builder body(RecognizeUsedCarInvoiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeUsedCarInvoiceResponse build() {
            return new RecognizeUsedCarInvoiceResponse(this);
        } 

    } 

}
