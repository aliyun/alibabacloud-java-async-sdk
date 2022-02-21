// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnBandwitdhByInternetChargeTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeEpnBandwitdhByInternetChargeTypeResponse</p>
 */
public class DescribeEpnBandwitdhByInternetChargeTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEpnBandwitdhByInternetChargeTypeResponseBody body;

    private DescribeEpnBandwitdhByInternetChargeTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEpnBandwitdhByInternetChargeTypeResponse create() {
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
    public DescribeEpnBandwitdhByInternetChargeTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEpnBandwitdhByInternetChargeTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEpnBandwitdhByInternetChargeTypeResponseBody body);

        @Override
        DescribeEpnBandwitdhByInternetChargeTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEpnBandwitdhByInternetChargeTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEpnBandwitdhByInternetChargeTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEpnBandwitdhByInternetChargeTypeResponse response) {
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
        public Builder body(DescribeEpnBandwitdhByInternetChargeTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEpnBandwitdhByInternetChargeTypeResponse build() {
            return new DescribeEpnBandwitdhByInternetChargeTypeResponse(this);
        } 

    } 

}
