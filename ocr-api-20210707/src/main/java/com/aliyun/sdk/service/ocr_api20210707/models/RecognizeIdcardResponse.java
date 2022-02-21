// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeIdcardResponse} extends {@link TeaModel}
 *
 * <p>RecognizeIdcardResponse</p>
 */
public class RecognizeIdcardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeIdcardResponseBody body;

    private RecognizeIdcardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeIdcardResponse create() {
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
    public RecognizeIdcardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeIdcardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeIdcardResponseBody body);

        @Override
        RecognizeIdcardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeIdcardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeIdcardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeIdcardResponse response) {
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
        public Builder body(RecognizeIdcardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeIdcardResponse build() {
            return new RecognizeIdcardResponse(this);
        } 

    } 

}
