// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeMultiLanguageResponse} extends {@link TeaModel}
 *
 * <p>RecognizeMultiLanguageResponse</p>
 */
public class RecognizeMultiLanguageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeMultiLanguageResponseBody body;

    private RecognizeMultiLanguageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeMultiLanguageResponse create() {
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
    public RecognizeMultiLanguageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeMultiLanguageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeMultiLanguageResponseBody body);

        @Override
        RecognizeMultiLanguageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeMultiLanguageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeMultiLanguageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeMultiLanguageResponse response) {
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
        public Builder body(RecognizeMultiLanguageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeMultiLanguageResponse build() {
            return new RecognizeMultiLanguageResponse(this);
        } 

    } 

}
