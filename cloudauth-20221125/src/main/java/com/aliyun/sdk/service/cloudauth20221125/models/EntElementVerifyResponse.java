// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20221125.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntElementVerifyResponse} extends {@link TeaModel}
 *
 * <p>EntElementVerifyResponse</p>
 */
public class EntElementVerifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EntElementVerifyResponseBody body;

    private EntElementVerifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EntElementVerifyResponse create() {
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
    public EntElementVerifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EntElementVerifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EntElementVerifyResponseBody body);

        @Override
        EntElementVerifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EntElementVerifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EntElementVerifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EntElementVerifyResponse response) {
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
        public Builder body(EntElementVerifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EntElementVerifyResponse build() {
            return new EntElementVerifyResponse(this);
        } 

    } 

}
