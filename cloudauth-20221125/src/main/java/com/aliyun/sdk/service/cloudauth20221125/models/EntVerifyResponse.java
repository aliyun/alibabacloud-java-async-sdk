// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntVerifyResponse} extends {@link TeaModel}
 *
 * <p>EntVerifyResponse</p>
 */
public class EntVerifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EntVerifyResponseBody body;

    private EntVerifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EntVerifyResponse create() {
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
    public EntVerifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EntVerifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EntVerifyResponseBody body);

        @Override
        EntVerifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EntVerifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EntVerifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EntVerifyResponse response) {
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
        public Builder body(EntVerifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EntVerifyResponse build() {
            return new EntVerifyResponse(this);
        } 

    } 

}
