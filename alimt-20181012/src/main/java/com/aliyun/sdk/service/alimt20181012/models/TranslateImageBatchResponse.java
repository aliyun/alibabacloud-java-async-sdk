// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alimt20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TranslateImageBatchResponse} extends {@link TeaModel}
 *
 * <p>TranslateImageBatchResponse</p>
 */
public class TranslateImageBatchResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TranslateImageBatchResponseBody body;

    private TranslateImageBatchResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TranslateImageBatchResponse create() {
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
    public TranslateImageBatchResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TranslateImageBatchResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TranslateImageBatchResponseBody body);

        @Override
        TranslateImageBatchResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TranslateImageBatchResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TranslateImageBatchResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TranslateImageBatchResponse response) {
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
        public Builder body(TranslateImageBatchResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TranslateImageBatchResponse build() {
            return new TranslateImageBatchResponse(this);
        } 

    } 

}
