// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeTableOcrResponse} extends {@link TeaModel}
 *
 * <p>RecognizeTableOcrResponse</p>
 */
public class RecognizeTableOcrResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeTableOcrResponseBody body;

    private RecognizeTableOcrResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeTableOcrResponse create() {
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
    public RecognizeTableOcrResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeTableOcrResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeTableOcrResponseBody body);

        @Override
        RecognizeTableOcrResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeTableOcrResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeTableOcrResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeTableOcrResponse response) {
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
        public Builder body(RecognizeTableOcrResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeTableOcrResponse build() {
            return new RecognizeTableOcrResponse(this);
        } 

    } 

}
