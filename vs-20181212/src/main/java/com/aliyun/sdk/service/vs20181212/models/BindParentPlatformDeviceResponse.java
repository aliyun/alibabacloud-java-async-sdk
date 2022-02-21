// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BindParentPlatformDeviceResponse} extends {@link TeaModel}
 *
 * <p>BindParentPlatformDeviceResponse</p>
 */
public class BindParentPlatformDeviceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BindParentPlatformDeviceResponseBody body;

    private BindParentPlatformDeviceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BindParentPlatformDeviceResponse create() {
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
    public BindParentPlatformDeviceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BindParentPlatformDeviceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BindParentPlatformDeviceResponseBody body);

        @Override
        BindParentPlatformDeviceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BindParentPlatformDeviceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BindParentPlatformDeviceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BindParentPlatformDeviceResponse response) {
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
        public Builder body(BindParentPlatformDeviceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BindParentPlatformDeviceResponse build() {
            return new BindParentPlatformDeviceResponse(this);
        } 

    } 

}
