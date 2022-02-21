// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnlockMfaDeviceResponse} extends {@link TeaModel}
 *
 * <p>UnlockMfaDeviceResponse</p>
 */
public class UnlockMfaDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnlockMfaDeviceResponseBody body;

    private UnlockMfaDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnlockMfaDeviceResponse create() {
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
    public UnlockMfaDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnlockMfaDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnlockMfaDeviceResponseBody body);

        @Override
        UnlockMfaDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnlockMfaDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnlockMfaDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnlockMfaDeviceResponse response) {
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
        public Builder body(UnlockMfaDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnlockMfaDeviceResponse build() {
            return new UnlockMfaDeviceResponse(this);
        } 

    } 

}
