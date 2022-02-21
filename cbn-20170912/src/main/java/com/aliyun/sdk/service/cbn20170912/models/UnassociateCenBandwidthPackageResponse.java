// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnassociateCenBandwidthPackageResponse} extends {@link TeaModel}
 *
 * <p>UnassociateCenBandwidthPackageResponse</p>
 */
public class UnassociateCenBandwidthPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UnassociateCenBandwidthPackageResponseBody body;

    private UnassociateCenBandwidthPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UnassociateCenBandwidthPackageResponse create() {
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
    public UnassociateCenBandwidthPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UnassociateCenBandwidthPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UnassociateCenBandwidthPackageResponseBody body);

        @Override
        UnassociateCenBandwidthPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UnassociateCenBandwidthPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UnassociateCenBandwidthPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UnassociateCenBandwidthPackageResponse response) {
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
        public Builder body(UnassociateCenBandwidthPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UnassociateCenBandwidthPackageResponse build() {
            return new UnassociateCenBandwidthPackageResponse(this);
        } 

    } 

}
