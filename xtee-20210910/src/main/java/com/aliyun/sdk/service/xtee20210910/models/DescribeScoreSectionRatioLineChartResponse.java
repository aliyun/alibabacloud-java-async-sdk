// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeScoreSectionRatioLineChartResponse} extends {@link TeaModel}
 *
 * <p>DescribeScoreSectionRatioLineChartResponse</p>
 */
public class DescribeScoreSectionRatioLineChartResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeScoreSectionRatioLineChartResponseBody body;

    private DescribeScoreSectionRatioLineChartResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeScoreSectionRatioLineChartResponse create() {
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
    public DescribeScoreSectionRatioLineChartResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeScoreSectionRatioLineChartResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeScoreSectionRatioLineChartResponseBody body);

        @Override
        DescribeScoreSectionRatioLineChartResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeScoreSectionRatioLineChartResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeScoreSectionRatioLineChartResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeScoreSectionRatioLineChartResponse response) {
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
        public Builder body(DescribeScoreSectionRatioLineChartResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeScoreSectionRatioLineChartResponse build() {
            return new DescribeScoreSectionRatioLineChartResponse(this);
        } 

    } 

}
