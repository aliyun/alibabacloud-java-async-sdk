// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateGeneralResponse} extends {@link TeaModel}
 *
 * <p>TranslateGeneralResponse</p>
 */
public class TranslateGeneralResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TranslateGeneralResponseBody body;

    private TranslateGeneralResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TranslateGeneralResponse create() {
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
    public TranslateGeneralResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TranslateGeneralResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TranslateGeneralResponseBody body);

        @Override
        TranslateGeneralResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TranslateGeneralResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TranslateGeneralResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TranslateGeneralResponse response) {
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
        public Builder body(TranslateGeneralResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TranslateGeneralResponse build() {
            return new TranslateGeneralResponse(this);
        } 

    } 

}
