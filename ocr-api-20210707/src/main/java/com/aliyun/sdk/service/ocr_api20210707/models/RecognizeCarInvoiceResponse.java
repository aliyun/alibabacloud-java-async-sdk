// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeCarInvoiceResponse} extends {@link TeaModel}
 *
 * <p>RecognizeCarInvoiceResponse</p>
 */
public class RecognizeCarInvoiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeCarInvoiceResponseBody body;

    private RecognizeCarInvoiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeCarInvoiceResponse create() {
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
    public RecognizeCarInvoiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeCarInvoiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeCarInvoiceResponseBody body);

        @Override
        RecognizeCarInvoiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeCarInvoiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeCarInvoiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeCarInvoiceResponse response) {
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
        public Builder body(RecognizeCarInvoiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeCarInvoiceResponse build() {
            return new RecognizeCarInvoiceResponse(this);
        } 

    } 

}
