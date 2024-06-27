// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnalysisColumnFieldListResponse} extends {@link TeaModel}
 *
 * <p>DescribeAnalysisColumnFieldListResponse</p>
 */
public class DescribeAnalysisColumnFieldListResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeAnalysisColumnFieldListResponseBody body;

    private DescribeAnalysisColumnFieldListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeAnalysisColumnFieldListResponse create() {
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
    public DescribeAnalysisColumnFieldListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeAnalysisColumnFieldListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeAnalysisColumnFieldListResponseBody body);

        @Override
        DescribeAnalysisColumnFieldListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeAnalysisColumnFieldListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeAnalysisColumnFieldListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeAnalysisColumnFieldListResponse response) {
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
        public Builder body(DescribeAnalysisColumnFieldListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeAnalysisColumnFieldListResponse build() {
            return new DescribeAnalysisColumnFieldListResponse(this);
        } 

    } 

}
