// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteIpv6InternetBandwidthResponse} extends {@link TeaModel}
 *
 * <p>DeleteIpv6InternetBandwidthResponse</p>
 */
public class DeleteIpv6InternetBandwidthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteIpv6InternetBandwidthResponseBody body;

    private DeleteIpv6InternetBandwidthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteIpv6InternetBandwidthResponse create() {
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
    public DeleteIpv6InternetBandwidthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteIpv6InternetBandwidthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteIpv6InternetBandwidthResponseBody body);

        @Override
        DeleteIpv6InternetBandwidthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteIpv6InternetBandwidthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteIpv6InternetBandwidthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteIpv6InternetBandwidthResponse response) {
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
        public Builder body(DeleteIpv6InternetBandwidthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteIpv6InternetBandwidthResponse build() {
            return new DeleteIpv6InternetBandwidthResponse(this);
        } 

    } 

}
