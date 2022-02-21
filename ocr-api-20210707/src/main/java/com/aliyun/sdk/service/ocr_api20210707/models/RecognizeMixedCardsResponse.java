// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ocr_api20210707.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RecognizeMixedCardsResponse} extends {@link TeaModel}
 *
 * <p>RecognizeMixedCardsResponse</p>
 */
public class RecognizeMixedCardsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RecognizeMixedCardsResponseBody body;

    private RecognizeMixedCardsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RecognizeMixedCardsResponse create() {
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
    public RecognizeMixedCardsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RecognizeMixedCardsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RecognizeMixedCardsResponseBody body);

        @Override
        RecognizeMixedCardsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RecognizeMixedCardsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RecognizeMixedCardsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RecognizeMixedCardsResponse response) {
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
        public Builder body(RecognizeMixedCardsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RecognizeMixedCardsResponse build() {
            return new RecognizeMixedCardsResponse(this);
        } 

    } 

}
