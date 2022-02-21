// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnlockVirtualMFADeviceResponse} extends {@link TeaModel}
 *
 * <p>UnlockVirtualMFADeviceResponse</p>
 */
public class UnlockVirtualMFADeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnlockVirtualMFADeviceResponseBody body;

    private UnlockVirtualMFADeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnlockVirtualMFADeviceResponse create() {
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
    public UnlockVirtualMFADeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnlockVirtualMFADeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnlockVirtualMFADeviceResponseBody body);

        @Override
        UnlockVirtualMFADeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnlockVirtualMFADeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnlockVirtualMFADeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnlockVirtualMFADeviceResponse response) {
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
        public Builder body(UnlockVirtualMFADeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnlockVirtualMFADeviceResponse build() {
            return new UnlockVirtualMFADeviceResponse(this);
        } 

    } 

}
