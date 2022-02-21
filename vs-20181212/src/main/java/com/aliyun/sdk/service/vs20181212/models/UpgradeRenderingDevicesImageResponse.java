// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeRenderingDevicesImageResponse} extends {@link TeaModel}
 *
 * <p>UpgradeRenderingDevicesImageResponse</p>
 */
public class UpgradeRenderingDevicesImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpgradeRenderingDevicesImageResponseBody body;

    private UpgradeRenderingDevicesImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpgradeRenderingDevicesImageResponse create() {
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
    public UpgradeRenderingDevicesImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpgradeRenderingDevicesImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpgradeRenderingDevicesImageResponseBody body);

        @Override
        UpgradeRenderingDevicesImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpgradeRenderingDevicesImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpgradeRenderingDevicesImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpgradeRenderingDevicesImageResponse response) {
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
        public Builder body(UpgradeRenderingDevicesImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpgradeRenderingDevicesImageResponse build() {
            return new UpgradeRenderingDevicesImageResponse(this);
        } 

    } 

}
