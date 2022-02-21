// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeEduPaperStructedResponse} extends {@link TeaModel}
 *
 * <p>RecognizeEduPaperStructedResponse</p>
 */
public class RecognizeEduPaperStructedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeEduPaperStructedResponseBody body;

    private RecognizeEduPaperStructedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeEduPaperStructedResponse create() {
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
    public RecognizeEduPaperStructedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeEduPaperStructedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeEduPaperStructedResponseBody body);

        @Override
        RecognizeEduPaperStructedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeEduPaperStructedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeEduPaperStructedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeEduPaperStructedResponse response) {
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
        public Builder body(RecognizeEduPaperStructedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeEduPaperStructedResponse build() {
            return new RecognizeEduPaperStructedResponse(this);
        } 

    } 

}
