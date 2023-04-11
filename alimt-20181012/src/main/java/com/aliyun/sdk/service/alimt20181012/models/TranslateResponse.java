// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateResponse} extends {@link TeaModel}
 *
 * <p>TranslateResponse</p>
 */
public class TranslateResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TranslateResponseBody body;

    private TranslateResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TranslateResponse create() {
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
    public TranslateResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TranslateResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TranslateResponseBody body);

        @Override
        TranslateResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TranslateResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TranslateResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TranslateResponse response) {
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
        public Builder body(TranslateResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TranslateResponse build() {
            return new TranslateResponse(this);
        } 

    } 

}
