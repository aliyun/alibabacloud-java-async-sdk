// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeInvoiceResponse} extends {@link TeaModel}
 *
 * <p>RecognizeInvoiceResponse</p>
 */
public class RecognizeInvoiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeInvoiceResponseBody body;

    private RecognizeInvoiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeInvoiceResponse create() {
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
    public RecognizeInvoiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeInvoiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeInvoiceResponseBody body);

        @Override
        RecognizeInvoiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeInvoiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeInvoiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeInvoiceResponse response) {
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
        public Builder body(RecognizeInvoiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeInvoiceResponse build() {
            return new RecognizeInvoiceResponse(this);
        } 

    } 

}
