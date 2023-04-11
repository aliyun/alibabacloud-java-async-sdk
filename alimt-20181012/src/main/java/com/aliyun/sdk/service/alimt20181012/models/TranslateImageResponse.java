// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateImageResponse} extends {@link TeaModel}
 *
 * <p>TranslateImageResponse</p>
 */
public class TranslateImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TranslateImageResponseBody body;

    private TranslateImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TranslateImageResponse create() {
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
    public TranslateImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TranslateImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TranslateImageResponseBody body);

        @Override
        TranslateImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TranslateImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TranslateImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TranslateImageResponse response) {
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
        public Builder body(TranslateImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TranslateImageResponse build() {
            return new TranslateImageResponse(this);
        } 

    } 

}
