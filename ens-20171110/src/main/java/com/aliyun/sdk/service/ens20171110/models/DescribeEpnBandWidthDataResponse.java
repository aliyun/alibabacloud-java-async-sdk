// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnBandWidthDataResponse} extends {@link TeaModel}
 *
 * <p>DescribeEpnBandWidthDataResponse</p>
 */
public class DescribeEpnBandWidthDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEpnBandWidthDataResponseBody body;

    private DescribeEpnBandWidthDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEpnBandWidthDataResponse create() {
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
    public DescribeEpnBandWidthDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEpnBandWidthDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEpnBandWidthDataResponseBody body);

        @Override
        DescribeEpnBandWidthDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEpnBandWidthDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEpnBandWidthDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEpnBandWidthDataResponse response) {
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
        public Builder body(DescribeEpnBandWidthDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEpnBandWidthDataResponse build() {
            return new DescribeEpnBandWidthDataResponse(this);
        } 

    } 

}
