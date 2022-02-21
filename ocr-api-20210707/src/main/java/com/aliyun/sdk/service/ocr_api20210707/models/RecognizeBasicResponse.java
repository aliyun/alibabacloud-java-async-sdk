// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeBasicResponse} extends {@link TeaModel}
 *
 * <p>RecognizeBasicResponse</p>
 */
public class RecognizeBasicResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeBasicResponseBody body;

    private RecognizeBasicResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeBasicResponse create() {
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
    public RecognizeBasicResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeBasicResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeBasicResponseBody body);

        @Override
        RecognizeBasicResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeBasicResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeBasicResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeBasicResponse response) {
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
        public Builder body(RecognizeBasicResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeBasicResponse build() {
            return new RecognizeBasicResponse(this);
        } 

    } 

}
