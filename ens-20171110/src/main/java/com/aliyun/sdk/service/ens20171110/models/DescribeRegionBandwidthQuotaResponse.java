// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRegionBandwidthQuotaResponse} extends {@link TeaModel}
 *
 * <p>DescribeRegionBandwidthQuotaResponse</p>
 */
public class DescribeRegionBandwidthQuotaResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRegionBandwidthQuotaResponseBody body;

    private DescribeRegionBandwidthQuotaResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRegionBandwidthQuotaResponse create() {
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
    public DescribeRegionBandwidthQuotaResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRegionBandwidthQuotaResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRegionBandwidthQuotaResponseBody body);

        @Override
        DescribeRegionBandwidthQuotaResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRegionBandwidthQuotaResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRegionBandwidthQuotaResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRegionBandwidthQuotaResponse response) {
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
        public Builder body(DescribeRegionBandwidthQuotaResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRegionBandwidthQuotaResponse build() {
            return new DescribeRegionBandwidthQuotaResponse(this);
        } 

    } 

}
