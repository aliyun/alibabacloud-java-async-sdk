// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeTradeMarkCertificationResponse} extends {@link TeaModel}
 *
 * <p>RecognizeTradeMarkCertificationResponse</p>
 */
public class RecognizeTradeMarkCertificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeTradeMarkCertificationResponseBody body;

    private RecognizeTradeMarkCertificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeTradeMarkCertificationResponse create() {
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
    public RecognizeTradeMarkCertificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeTradeMarkCertificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeTradeMarkCertificationResponseBody body);

        @Override
        RecognizeTradeMarkCertificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeTradeMarkCertificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeTradeMarkCertificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeTradeMarkCertificationResponse response) {
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
        public Builder body(RecognizeTradeMarkCertificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeTradeMarkCertificationResponse build() {
            return new RecognizeTradeMarkCertificationResponse(this);
        } 

    } 

}
