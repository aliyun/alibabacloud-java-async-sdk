// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeEduPaperOcrResponse} extends {@link TeaModel}
 *
 * <p>RecognizeEduPaperOcrResponse</p>
 */
public class RecognizeEduPaperOcrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeEduPaperOcrResponseBody body;

    private RecognizeEduPaperOcrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeEduPaperOcrResponse create() {
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
    public RecognizeEduPaperOcrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeEduPaperOcrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeEduPaperOcrResponseBody body);

        @Override
        RecognizeEduPaperOcrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeEduPaperOcrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeEduPaperOcrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeEduPaperOcrResponse response) {
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
        public Builder body(RecognizeEduPaperOcrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeEduPaperOcrResponse build() {
            return new RecognizeEduPaperOcrResponse(this);
        } 

    } 

}
