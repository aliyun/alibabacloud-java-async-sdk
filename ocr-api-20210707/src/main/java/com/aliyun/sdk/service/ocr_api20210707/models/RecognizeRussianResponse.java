// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeRussianResponse} extends {@link TeaModel}
 *
 * <p>RecognizeRussianResponse</p>
 */
public class RecognizeRussianResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeRussianResponseBody body;

    private RecognizeRussianResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeRussianResponse create() {
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
    public RecognizeRussianResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeRussianResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeRussianResponseBody body);

        @Override
        RecognizeRussianResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeRussianResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeRussianResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeRussianResponse response) {
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
        public Builder body(RecognizeRussianResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeRussianResponse build() {
            return new RecognizeRussianResponse(this);
        } 

    } 

}
