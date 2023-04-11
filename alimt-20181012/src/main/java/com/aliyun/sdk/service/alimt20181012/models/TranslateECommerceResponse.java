// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateECommerceResponse} extends {@link TeaModel}
 *
 * <p>TranslateECommerceResponse</p>
 */
public class TranslateECommerceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TranslateECommerceResponseBody body;

    private TranslateECommerceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TranslateECommerceResponse create() {
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
    public TranslateECommerceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TranslateECommerceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TranslateECommerceResponseBody body);

        @Override
        TranslateECommerceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TranslateECommerceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TranslateECommerceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TranslateECommerceResponse response) {
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
        public Builder body(TranslateECommerceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TranslateECommerceResponse build() {
            return new TranslateECommerceResponse(this);
        } 

    } 

}
