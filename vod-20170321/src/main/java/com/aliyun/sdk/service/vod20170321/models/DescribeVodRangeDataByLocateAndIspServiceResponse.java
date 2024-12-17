// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeVodRangeDataByLocateAndIspServiceResponse} extends {@link TeaModel}
 *
 * <p>DescribeVodRangeDataByLocateAndIspServiceResponse</p>
 */
public class DescribeVodRangeDataByLocateAndIspServiceResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeVodRangeDataByLocateAndIspServiceResponseBody body;

    private DescribeVodRangeDataByLocateAndIspServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeVodRangeDataByLocateAndIspServiceResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeVodRangeDataByLocateAndIspServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVodRangeDataByLocateAndIspServiceResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeVodRangeDataByLocateAndIspServiceResponseBody body);

        @Override
        DescribeVodRangeDataByLocateAndIspServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVodRangeDataByLocateAndIspServiceResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DescribeVodRangeDataByLocateAndIspServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVodRangeDataByLocateAndIspServiceResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DescribeVodRangeDataByLocateAndIspServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVodRangeDataByLocateAndIspServiceResponse build() {
            return new DescribeVodRangeDataByLocateAndIspServiceResponse(this);
        } 

    } 

}
