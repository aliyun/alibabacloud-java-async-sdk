// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCenBandwidthPackagesResponse} extends {@link TeaModel}
 *
 * <p>DescribeCenBandwidthPackagesResponse</p>
 */
public class DescribeCenBandwidthPackagesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeCenBandwidthPackagesResponseBody body;

    private DescribeCenBandwidthPackagesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeCenBandwidthPackagesResponse create() {
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
    public DescribeCenBandwidthPackagesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeCenBandwidthPackagesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeCenBandwidthPackagesResponseBody body);

        @Override
        DescribeCenBandwidthPackagesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeCenBandwidthPackagesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeCenBandwidthPackagesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeCenBandwidthPackagesResponse response) {
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
        public Builder body(DescribeCenBandwidthPackagesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeCenBandwidthPackagesResponse build() {
            return new DescribeCenBandwidthPackagesResponse(this);
        } 

    } 

}
