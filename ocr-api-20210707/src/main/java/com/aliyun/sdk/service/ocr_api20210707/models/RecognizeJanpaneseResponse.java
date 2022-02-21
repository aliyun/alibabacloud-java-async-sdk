// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeJanpaneseResponse} extends {@link TeaModel}
 *
 * <p>RecognizeJanpaneseResponse</p>
 */
public class RecognizeJanpaneseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeJanpaneseResponseBody body;

    private RecognizeJanpaneseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeJanpaneseResponse create() {
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
    public RecognizeJanpaneseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeJanpaneseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeJanpaneseResponseBody body);

        @Override
        RecognizeJanpaneseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeJanpaneseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeJanpaneseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeJanpaneseResponse response) {
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
        public Builder body(RecognizeJanpaneseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeJanpaneseResponse build() {
            return new RecognizeJanpaneseResponse(this);
        } 

    } 

}
