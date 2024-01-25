// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth_intl20220809.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWeb3RiskScoreResponse} extends {@link TeaModel}
 *
 * <p>DescribeWeb3RiskScoreResponse</p>
 */
public class DescribeWeb3RiskScoreResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeWeb3RiskScoreResponseBody body;

    private DescribeWeb3RiskScoreResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeWeb3RiskScoreResponse create() {
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
    public DescribeWeb3RiskScoreResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeWeb3RiskScoreResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeWeb3RiskScoreResponseBody body);

        @Override
        DescribeWeb3RiskScoreResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeWeb3RiskScoreResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeWeb3RiskScoreResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeWeb3RiskScoreResponse response) {
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
        public Builder body(DescribeWeb3RiskScoreResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeWeb3RiskScoreResponse build() {
            return new DescribeWeb3RiskScoreResponse(this);
        } 

    } 

}
