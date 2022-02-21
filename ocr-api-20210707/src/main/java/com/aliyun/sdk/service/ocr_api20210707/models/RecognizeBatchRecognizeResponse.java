// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeBatchRecognizeResponse} extends {@link TeaModel}
 *
 * <p>RecognizeBatchRecognizeResponse</p>
 */
public class RecognizeBatchRecognizeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeBatchRecognizeResponseBody body;

    private RecognizeBatchRecognizeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeBatchRecognizeResponse create() {
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
    public RecognizeBatchRecognizeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeBatchRecognizeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeBatchRecognizeResponseBody body);

        @Override
        RecognizeBatchRecognizeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeBatchRecognizeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeBatchRecognizeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeBatchRecognizeResponse response) {
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
        public Builder body(RecognizeBatchRecognizeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeBatchRecognizeResponse build() {
            return new RecognizeBatchRecognizeResponse(this);
        } 

    } 

}
