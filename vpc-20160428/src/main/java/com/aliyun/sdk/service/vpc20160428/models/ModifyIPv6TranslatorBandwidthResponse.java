// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIPv6TranslatorBandwidthResponse} extends {@link TeaModel}
 *
 * <p>ModifyIPv6TranslatorBandwidthResponse</p>
 */
public class ModifyIPv6TranslatorBandwidthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIPv6TranslatorBandwidthResponseBody body;

    private ModifyIPv6TranslatorBandwidthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIPv6TranslatorBandwidthResponse create() {
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
    public ModifyIPv6TranslatorBandwidthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIPv6TranslatorBandwidthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIPv6TranslatorBandwidthResponseBody body);

        @Override
        ModifyIPv6TranslatorBandwidthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIPv6TranslatorBandwidthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIPv6TranslatorBandwidthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIPv6TranslatorBandwidthResponse response) {
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
        public Builder body(ModifyIPv6TranslatorBandwidthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIPv6TranslatorBandwidthResponse build() {
            return new ModifyIPv6TranslatorBandwidthResponse(this);
        } 

    } 

}
