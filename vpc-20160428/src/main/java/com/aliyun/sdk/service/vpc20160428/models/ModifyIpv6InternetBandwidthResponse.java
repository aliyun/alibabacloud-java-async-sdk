// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpv6InternetBandwidthResponse} extends {@link TeaModel}
 *
 * <p>ModifyIpv6InternetBandwidthResponse</p>
 */
public class ModifyIpv6InternetBandwidthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIpv6InternetBandwidthResponseBody body;

    private ModifyIpv6InternetBandwidthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIpv6InternetBandwidthResponse create() {
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
    public ModifyIpv6InternetBandwidthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIpv6InternetBandwidthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIpv6InternetBandwidthResponseBody body);

        @Override
        ModifyIpv6InternetBandwidthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIpv6InternetBandwidthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIpv6InternetBandwidthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIpv6InternetBandwidthResponse response) {
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
        public Builder body(ModifyIpv6InternetBandwidthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIpv6InternetBandwidthResponse build() {
            return new ModifyIpv6InternetBandwidthResponse(this);
        } 

    } 

}
