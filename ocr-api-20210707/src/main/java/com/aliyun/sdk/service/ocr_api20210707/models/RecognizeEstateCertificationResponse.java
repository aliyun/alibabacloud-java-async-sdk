// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeEstateCertificationResponse} extends {@link TeaModel}
 *
 * <p>RecognizeEstateCertificationResponse</p>
 */
public class RecognizeEstateCertificationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeEstateCertificationResponseBody body;

    private RecognizeEstateCertificationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeEstateCertificationResponse create() {
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
    public RecognizeEstateCertificationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeEstateCertificationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeEstateCertificationResponseBody body);

        @Override
        RecognizeEstateCertificationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeEstateCertificationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeEstateCertificationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeEstateCertificationResponse response) {
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
        public Builder body(RecognizeEstateCertificationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeEstateCertificationResponse build() {
            return new RecognizeEstateCertificationResponse(this);
        } 

    } 

}
