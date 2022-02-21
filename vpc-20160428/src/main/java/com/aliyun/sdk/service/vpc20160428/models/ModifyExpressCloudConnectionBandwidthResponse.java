// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyExpressCloudConnectionBandwidthResponse} extends {@link TeaModel}
 *
 * <p>ModifyExpressCloudConnectionBandwidthResponse</p>
 */
public class ModifyExpressCloudConnectionBandwidthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyExpressCloudConnectionBandwidthResponseBody body;

    private ModifyExpressCloudConnectionBandwidthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyExpressCloudConnectionBandwidthResponse create() {
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
    public ModifyExpressCloudConnectionBandwidthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyExpressCloudConnectionBandwidthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyExpressCloudConnectionBandwidthResponseBody body);

        @Override
        ModifyExpressCloudConnectionBandwidthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyExpressCloudConnectionBandwidthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyExpressCloudConnectionBandwidthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyExpressCloudConnectionBandwidthResponse response) {
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
        public Builder body(ModifyExpressCloudConnectionBandwidthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyExpressCloudConnectionBandwidthResponse build() {
            return new ModifyExpressCloudConnectionBandwidthResponse(this);
        } 

    } 

}
