// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBandwidthPackageResponse} extends {@link TeaModel}
 *
 * <p>DescribeBandwidthPackageResponse</p>
 */
public class DescribeBandwidthPackageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeBandwidthPackageResponseBody body;

    private DescribeBandwidthPackageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeBandwidthPackageResponse create() {
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
    public DescribeBandwidthPackageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeBandwidthPackageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeBandwidthPackageResponseBody body);

        @Override
        DescribeBandwidthPackageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeBandwidthPackageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeBandwidthPackageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeBandwidthPackageResponse response) {
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
        public Builder body(DescribeBandwidthPackageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeBandwidthPackageResponse build() {
            return new DescribeBandwidthPackageResponse(this);
        } 

    } 

}
