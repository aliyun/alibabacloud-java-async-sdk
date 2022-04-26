// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizePaymentRecordResponse} extends {@link TeaModel}
 *
 * <p>RecognizePaymentRecordResponse</p>
 */
public class RecognizePaymentRecordResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizePaymentRecordResponseBody body;

    private RecognizePaymentRecordResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizePaymentRecordResponse create() {
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
    public RecognizePaymentRecordResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizePaymentRecordResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizePaymentRecordResponseBody body);

        @Override
        RecognizePaymentRecordResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizePaymentRecordResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizePaymentRecordResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizePaymentRecordResponse response) {
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
        public Builder body(RecognizePaymentRecordResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizePaymentRecordResponse build() {
            return new RecognizePaymentRecordResponse(this);
        } 

    } 

}
