// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BandwidthPackageAddAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>BandwidthPackageAddAcceleratorResponse</p>
 */
public class BandwidthPackageAddAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BandwidthPackageAddAcceleratorResponseBody body;

    private BandwidthPackageAddAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BandwidthPackageAddAcceleratorResponse create() {
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
    public BandwidthPackageAddAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BandwidthPackageAddAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BandwidthPackageAddAcceleratorResponseBody body);

        @Override
        BandwidthPackageAddAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BandwidthPackageAddAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BandwidthPackageAddAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BandwidthPackageAddAcceleratorResponse response) {
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
        public Builder body(BandwidthPackageAddAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BandwidthPackageAddAcceleratorResponse build() {
            return new BandwidthPackageAddAcceleratorResponse(this);
        } 

    } 

}
