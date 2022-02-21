// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeLatinResponse} extends {@link TeaModel}
 *
 * <p>RecognizeLatinResponse</p>
 */
public class RecognizeLatinResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeLatinResponseBody body;

    private RecognizeLatinResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeLatinResponse create() {
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
    public RecognizeLatinResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeLatinResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeLatinResponseBody body);

        @Override
        RecognizeLatinResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeLatinResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeLatinResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeLatinResponse response) {
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
        public Builder body(RecognizeLatinResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeLatinResponse build() {
            return new RecognizeLatinResponse(this);
        } 

    } 

}
