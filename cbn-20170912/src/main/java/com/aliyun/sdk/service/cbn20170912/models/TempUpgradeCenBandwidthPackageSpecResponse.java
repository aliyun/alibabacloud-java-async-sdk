// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TempUpgradeCenBandwidthPackageSpecResponse} extends {@link TeaModel}
 *
 * <p>TempUpgradeCenBandwidthPackageSpecResponse</p>
 */
public class TempUpgradeCenBandwidthPackageSpecResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TempUpgradeCenBandwidthPackageSpecResponseBody body;

    private TempUpgradeCenBandwidthPackageSpecResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TempUpgradeCenBandwidthPackageSpecResponse create() {
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
    public TempUpgradeCenBandwidthPackageSpecResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TempUpgradeCenBandwidthPackageSpecResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TempUpgradeCenBandwidthPackageSpecResponseBody body);

        @Override
        TempUpgradeCenBandwidthPackageSpecResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TempUpgradeCenBandwidthPackageSpecResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TempUpgradeCenBandwidthPackageSpecResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TempUpgradeCenBandwidthPackageSpecResponse response) {
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
        public Builder body(TempUpgradeCenBandwidthPackageSpecResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TempUpgradeCenBandwidthPackageSpecResponse build() {
            return new TempUpgradeCenBandwidthPackageSpecResponse(this);
        } 

    } 

}
