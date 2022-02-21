// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockMfaDeviceResponse} extends {@link TeaModel}
 *
 * <p>LockMfaDeviceResponse</p>
 */
public class LockMfaDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LockMfaDeviceResponseBody body;

    private LockMfaDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LockMfaDeviceResponse create() {
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
    public LockMfaDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LockMfaDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LockMfaDeviceResponseBody body);

        @Override
        LockMfaDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LockMfaDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LockMfaDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LockMfaDeviceResponse response) {
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
        public Builder body(LockMfaDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LockMfaDeviceResponse build() {
            return new LockMfaDeviceResponse(this);
        } 

    } 

}
