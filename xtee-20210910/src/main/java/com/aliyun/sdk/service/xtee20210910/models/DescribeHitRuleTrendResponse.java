// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHitRuleTrendResponse} extends {@link TeaModel}
 *
 * <p>DescribeHitRuleTrendResponse</p>
 */
public class DescribeHitRuleTrendResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeHitRuleTrendResponseBody body;

    private DescribeHitRuleTrendResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeHitRuleTrendResponse create() {
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
    public DescribeHitRuleTrendResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeHitRuleTrendResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeHitRuleTrendResponseBody body);

        @Override
        DescribeHitRuleTrendResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeHitRuleTrendResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeHitRuleTrendResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeHitRuleTrendResponse response) {
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
        public Builder body(DescribeHitRuleTrendResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeHitRuleTrendResponse build() {
            return new DescribeHitRuleTrendResponse(this);
        } 

    } 

}
