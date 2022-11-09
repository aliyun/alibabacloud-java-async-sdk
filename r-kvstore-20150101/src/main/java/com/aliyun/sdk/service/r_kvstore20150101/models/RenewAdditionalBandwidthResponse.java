// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RenewAdditionalBandwidthResponse} extends {@link TeaModel}
 *
 * <p>RenewAdditionalBandwidthResponse</p>
 */
public class RenewAdditionalBandwidthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RenewAdditionalBandwidthResponseBody body;

    private RenewAdditionalBandwidthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RenewAdditionalBandwidthResponse create() {
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
    public RenewAdditionalBandwidthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RenewAdditionalBandwidthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RenewAdditionalBandwidthResponseBody body);

        @Override
        RenewAdditionalBandwidthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RenewAdditionalBandwidthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RenewAdditionalBandwidthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RenewAdditionalBandwidthResponse response) {
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
        public Builder body(RenewAdditionalBandwidthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RenewAdditionalBandwidthResponse build() {
            return new RenewAdditionalBandwidthResponse(this);
        } 

    } 

}
