// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockVirtualMFADeviceResponse} extends {@link TeaModel}
 *
 * <p>LockVirtualMFADeviceResponse</p>
 */
public class LockVirtualMFADeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LockVirtualMFADeviceResponseBody body;

    private LockVirtualMFADeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static LockVirtualMFADeviceResponse create() {
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
    public LockVirtualMFADeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<LockVirtualMFADeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LockVirtualMFADeviceResponseBody body);

        @Override
        LockVirtualMFADeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<LockVirtualMFADeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LockVirtualMFADeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(LockVirtualMFADeviceResponse response) {
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
        public Builder body(LockVirtualMFADeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public LockVirtualMFADeviceResponse build() {
            return new LockVirtualMFADeviceResponse(this);
        } 

    } 

}
