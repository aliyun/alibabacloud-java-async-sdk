// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeProductRiskPieResponse} extends {@link TeaModel}
 *
 * <p>DescribeProductRiskPieResponse</p>
 */
public class DescribeProductRiskPieResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeProductRiskPieResponseBody body;

    private DescribeProductRiskPieResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeProductRiskPieResponse create() {
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
    public DescribeProductRiskPieResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeProductRiskPieResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeProductRiskPieResponseBody body);

        @Override
        DescribeProductRiskPieResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeProductRiskPieResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeProductRiskPieResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeProductRiskPieResponse response) {
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
        public Builder body(DescribeProductRiskPieResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeProductRiskPieResponse build() {
            return new DescribeProductRiskPieResponse(this);
        } 

    } 

}
