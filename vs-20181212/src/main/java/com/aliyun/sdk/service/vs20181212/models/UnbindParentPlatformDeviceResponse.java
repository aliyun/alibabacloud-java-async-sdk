// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindParentPlatformDeviceResponse} extends {@link TeaModel}
 *
 * <p>UnbindParentPlatformDeviceResponse</p>
 */
public class UnbindParentPlatformDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnbindParentPlatformDeviceResponseBody body;

    private UnbindParentPlatformDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnbindParentPlatformDeviceResponse create() {
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
    public UnbindParentPlatformDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnbindParentPlatformDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnbindParentPlatformDeviceResponseBody body);

        @Override
        UnbindParentPlatformDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnbindParentPlatformDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnbindParentPlatformDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnbindParentPlatformDeviceResponse response) {
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
        public Builder body(UnbindParentPlatformDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnbindParentPlatformDeviceResponse build() {
            return new UnbindParentPlatformDeviceResponse(this);
        } 

    } 

}
