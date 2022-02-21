// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BandwidthPackageRemoveAcceleratorResponse} extends {@link TeaModel}
 *
 * <p>BandwidthPackageRemoveAcceleratorResponse</p>
 */
public class BandwidthPackageRemoveAcceleratorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private BandwidthPackageRemoveAcceleratorResponseBody body;

    private BandwidthPackageRemoveAcceleratorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static BandwidthPackageRemoveAcceleratorResponse create() {
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
    public BandwidthPackageRemoveAcceleratorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<BandwidthPackageRemoveAcceleratorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(BandwidthPackageRemoveAcceleratorResponseBody body);

        @Override
        BandwidthPackageRemoveAcceleratorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<BandwidthPackageRemoveAcceleratorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private BandwidthPackageRemoveAcceleratorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(BandwidthPackageRemoveAcceleratorResponse response) {
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
        public Builder body(BandwidthPackageRemoveAcceleratorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public BandwidthPackageRemoveAcceleratorResponse build() {
            return new BandwidthPackageRemoveAcceleratorResponse(this);
        } 

    } 

}
