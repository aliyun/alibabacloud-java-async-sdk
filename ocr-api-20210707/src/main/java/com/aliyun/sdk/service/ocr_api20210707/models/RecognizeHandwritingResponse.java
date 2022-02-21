// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeHandwritingResponse} extends {@link TeaModel}
 *
 * <p>RecognizeHandwritingResponse</p>
 */
public class RecognizeHandwritingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeHandwritingResponseBody body;

    private RecognizeHandwritingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeHandwritingResponse create() {
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
    public RecognizeHandwritingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeHandwritingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeHandwritingResponseBody body);

        @Override
        RecognizeHandwritingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeHandwritingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeHandwritingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeHandwritingResponse response) {
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
        public Builder body(RecognizeHandwritingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeHandwritingResponse build() {
            return new RecognizeHandwritingResponse(this);
        } 

    } 

}
