// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnlockDeviceResponse} extends {@link TeaModel}
 *
 * <p>UnlockDeviceResponse</p>
 */
public class UnlockDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnlockDeviceResponseBody body;

    private UnlockDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnlockDeviceResponse create() {
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
    public UnlockDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnlockDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnlockDeviceResponseBody body);

        @Override
        UnlockDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnlockDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnlockDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnlockDeviceResponse response) {
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
        public Builder body(UnlockDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnlockDeviceResponse build() {
            return new UnlockDeviceResponse(this);
        } 

    } 

}
