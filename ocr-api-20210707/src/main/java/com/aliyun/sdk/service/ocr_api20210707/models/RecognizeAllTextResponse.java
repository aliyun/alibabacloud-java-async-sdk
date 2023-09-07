// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeAllTextResponse} extends {@link TeaModel}
 *
 * <p>RecognizeAllTextResponse</p>
 */
public class RecognizeAllTextResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeAllTextResponseBody body;

    private RecognizeAllTextResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeAllTextResponse create() {
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
    public RecognizeAllTextResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeAllTextResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeAllTextResponseBody body);

        @Override
        RecognizeAllTextResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeAllTextResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeAllTextResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeAllTextResponse response) {
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
        public Builder body(RecognizeAllTextResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeAllTextResponse build() {
            return new RecognizeAllTextResponse(this);
        } 

    } 

}
