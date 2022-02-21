// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeTaxClearanceCertificateResponse} extends {@link TeaModel}
 *
 * <p>RecognizeTaxClearanceCertificateResponse</p>
 */
public class RecognizeTaxClearanceCertificateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeTaxClearanceCertificateResponseBody body;

    private RecognizeTaxClearanceCertificateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeTaxClearanceCertificateResponse create() {
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
    public RecognizeTaxClearanceCertificateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeTaxClearanceCertificateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeTaxClearanceCertificateResponseBody body);

        @Override
        RecognizeTaxClearanceCertificateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeTaxClearanceCertificateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeTaxClearanceCertificateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeTaxClearanceCertificateResponse response) {
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
        public Builder body(RecognizeTaxClearanceCertificateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeTaxClearanceCertificateResponse build() {
            return new RecognizeTaxClearanceCertificateResponse(this);
        } 

    } 

}
