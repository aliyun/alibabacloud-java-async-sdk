// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveMfaDeviceResponse} extends {@link TeaModel}
 *
 * <p>RemoveMfaDeviceResponse</p>
 */
public class RemoveMfaDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveMfaDeviceResponseBody body;

    private RemoveMfaDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveMfaDeviceResponse create() {
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
    public RemoveMfaDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveMfaDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveMfaDeviceResponseBody body);

        @Override
        RemoveMfaDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveMfaDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveMfaDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveMfaDeviceResponse response) {
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
        public Builder body(RemoveMfaDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveMfaDeviceResponse build() {
            return new RemoveMfaDeviceResponse(this);
        } 

    } 

}
