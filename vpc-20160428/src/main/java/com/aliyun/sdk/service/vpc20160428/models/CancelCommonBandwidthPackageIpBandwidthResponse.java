// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCommonBandwidthPackageIpBandwidthResponse} extends {@link TeaModel}
 *
 * <p>CancelCommonBandwidthPackageIpBandwidthResponse</p>
 */
public class CancelCommonBandwidthPackageIpBandwidthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelCommonBandwidthPackageIpBandwidthResponseBody body;

    private CancelCommonBandwidthPackageIpBandwidthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelCommonBandwidthPackageIpBandwidthResponse create() {
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
    public CancelCommonBandwidthPackageIpBandwidthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelCommonBandwidthPackageIpBandwidthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelCommonBandwidthPackageIpBandwidthResponseBody body);

        @Override
        CancelCommonBandwidthPackageIpBandwidthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelCommonBandwidthPackageIpBandwidthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelCommonBandwidthPackageIpBandwidthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelCommonBandwidthPackageIpBandwidthResponse response) {
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
        public Builder body(CancelCommonBandwidthPackageIpBandwidthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelCommonBandwidthPackageIpBandwidthResponse build() {
            return new CancelCommonBandwidthPackageIpBandwidthResponse(this);
        } 

    } 

}
