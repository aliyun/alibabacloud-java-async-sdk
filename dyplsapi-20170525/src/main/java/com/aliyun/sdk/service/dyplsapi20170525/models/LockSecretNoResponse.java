// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyplsapi20170525.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockSecretNoResponse} extends {@link TeaModel}
 *
 * <p>LockSecretNoResponse</p>
 */
public class LockSecretNoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LockSecretNoResponseBody body;

    private LockSecretNoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LockSecretNoResponse create() {
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
    public LockSecretNoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LockSecretNoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LockSecretNoResponseBody body);

        @Override
        LockSecretNoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LockSecretNoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LockSecretNoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LockSecretNoResponse response) {
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
        public Builder body(LockSecretNoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LockSecretNoResponse build() {
            return new LockSecretNoResponse(this);
        } 

    } 

}
