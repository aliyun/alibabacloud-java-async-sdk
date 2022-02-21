// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRangeDataByLocateAndIspServiceResponse} extends {@link TeaModel}
 *
 * <p>DescribeRangeDataByLocateAndIspServiceResponse</p>
 */
public class DescribeRangeDataByLocateAndIspServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRangeDataByLocateAndIspServiceResponseBody body;

    private DescribeRangeDataByLocateAndIspServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRangeDataByLocateAndIspServiceResponse create() {
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
    public DescribeRangeDataByLocateAndIspServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRangeDataByLocateAndIspServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRangeDataByLocateAndIspServiceResponseBody body);

        @Override
        DescribeRangeDataByLocateAndIspServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRangeDataByLocateAndIspServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRangeDataByLocateAndIspServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRangeDataByLocateAndIspServiceResponse response) {
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
        public Builder body(DescribeRangeDataByLocateAndIspServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRangeDataByLocateAndIspServiceResponse build() {
            return new DescribeRangeDataByLocateAndIspServiceResponse(this);
        } 

    } 

}
