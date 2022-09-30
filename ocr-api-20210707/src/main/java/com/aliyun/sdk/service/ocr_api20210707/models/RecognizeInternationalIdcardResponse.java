// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeInternationalIdcardResponse} extends {@link TeaModel}
 *
 * <p>RecognizeInternationalIdcardResponse</p>
 */
public class RecognizeInternationalIdcardResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeInternationalIdcardResponseBody body;

    private RecognizeInternationalIdcardResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeInternationalIdcardResponse create() {
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
    public RecognizeInternationalIdcardResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeInternationalIdcardResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeInternationalIdcardResponseBody body);

        @Override
        RecognizeInternationalIdcardResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeInternationalIdcardResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeInternationalIdcardResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeInternationalIdcardResponse response) {
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
        public Builder body(RecognizeInternationalIdcardResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeInternationalIdcardResponse build() {
            return new RecognizeInternationalIdcardResponse(this);
        } 

    } 

}
