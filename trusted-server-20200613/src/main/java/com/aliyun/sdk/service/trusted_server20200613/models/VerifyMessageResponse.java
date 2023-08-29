// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyMessageResponse} extends {@link TeaModel}
 *
 * <p>VerifyMessageResponse</p>
 */
public class VerifyMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyMessageResponseBody body;

    private VerifyMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyMessageResponse create() {
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
    public VerifyMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyMessageResponseBody body);

        @Override
        VerifyMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyMessageResponse response) {
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
        public Builder body(VerifyMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyMessageResponse build() {
            return new VerifyMessageResponse(this);
        } 

    } 

}
