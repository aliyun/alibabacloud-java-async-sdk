// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNetworkPackageBandwidthResponse} extends {@link TeaModel}
 *
 * <p>ModifyNetworkPackageBandwidthResponse</p>
 */
public class ModifyNetworkPackageBandwidthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNetworkPackageBandwidthResponseBody body;

    private ModifyNetworkPackageBandwidthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNetworkPackageBandwidthResponse create() {
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
    public ModifyNetworkPackageBandwidthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNetworkPackageBandwidthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNetworkPackageBandwidthResponseBody body);

        @Override
        ModifyNetworkPackageBandwidthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNetworkPackageBandwidthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNetworkPackageBandwidthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNetworkPackageBandwidthResponse response) {
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
        public Builder body(ModifyNetworkPackageBandwidthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNetworkPackageBandwidthResponse build() {
            return new ModifyNetworkPackageBandwidthResponse(this);
        } 

    } 

}
