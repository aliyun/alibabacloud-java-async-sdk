// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsRegionIdIpv6InfoResponse} extends {@link TeaModel}
 *
 * <p>DescribeEnsRegionIdIpv6InfoResponse</p>
 */
public class DescribeEnsRegionIdIpv6InfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEnsRegionIdIpv6InfoResponseBody body;

    private DescribeEnsRegionIdIpv6InfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEnsRegionIdIpv6InfoResponse create() {
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
    public DescribeEnsRegionIdIpv6InfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEnsRegionIdIpv6InfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEnsRegionIdIpv6InfoResponseBody body);

        @Override
        DescribeEnsRegionIdIpv6InfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEnsRegionIdIpv6InfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEnsRegionIdIpv6InfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEnsRegionIdIpv6InfoResponse response) {
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
        public Builder body(DescribeEnsRegionIdIpv6InfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEnsRegionIdIpv6InfoResponse build() {
            return new DescribeEnsRegionIdIpv6InfoResponse(this);
        } 

    } 

}
