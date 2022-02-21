// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeEnglishResponse} extends {@link TeaModel}
 *
 * <p>RecognizeEnglishResponse</p>
 */
public class RecognizeEnglishResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeEnglishResponseBody body;

    private RecognizeEnglishResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeEnglishResponse create() {
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
    public RecognizeEnglishResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeEnglishResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeEnglishResponseBody body);

        @Override
        RecognizeEnglishResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeEnglishResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeEnglishResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeEnglishResponse response) {
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
        public Builder body(RecognizeEnglishResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeEnglishResponse build() {
            return new RecognizeEnglishResponse(this);
        } 

    } 

}
