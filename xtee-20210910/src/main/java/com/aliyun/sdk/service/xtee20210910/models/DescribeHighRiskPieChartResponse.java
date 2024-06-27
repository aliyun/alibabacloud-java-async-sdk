// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHighRiskPieChartResponse} extends {@link TeaModel}
 *
 * <p>DescribeHighRiskPieChartResponse</p>
 */
public class DescribeHighRiskPieChartResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeHighRiskPieChartResponseBody body;

    private DescribeHighRiskPieChartResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeHighRiskPieChartResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DescribeHighRiskPieChartResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHighRiskPieChartResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeHighRiskPieChartResponseBody body);

        @Override
        DescribeHighRiskPieChartResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHighRiskPieChartResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeHighRiskPieChartResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHighRiskPieChartResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
        public Builder body(DescribeHighRiskPieChartResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHighRiskPieChartResponse build() {
            return new DescribeHighRiskPieChartResponse(this);
        } 

    } 

}
