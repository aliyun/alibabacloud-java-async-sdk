// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeGeneralResponse} extends {@link TeaModel}
 *
 * <p>RecognizeGeneralResponse</p>
 */
public class RecognizeGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeGeneralResponseBody body;

    private RecognizeGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeGeneralResponse create() {
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
    public RecognizeGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeGeneralResponseBody body);

        @Override
        RecognizeGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeGeneralResponse response) {
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
        public Builder body(RecognizeGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeGeneralResponse build() {
            return new RecognizeGeneralResponse(this);
        } 

    } 

}
