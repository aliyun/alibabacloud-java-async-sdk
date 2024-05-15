// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInternetOpenIpResponse} extends {@link TeaModel}
 *
 * <p>DescribeInternetOpenIpResponse</p>
 */
public class DescribeInternetOpenIpResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeInternetOpenIpResponseBody body;

    private DescribeInternetOpenIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeInternetOpenIpResponse create() {
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
    public DescribeInternetOpenIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeInternetOpenIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeInternetOpenIpResponseBody body);

        @Override
        DescribeInternetOpenIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeInternetOpenIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeInternetOpenIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeInternetOpenIpResponse response) {
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
        public Builder body(DescribeInternetOpenIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeInternetOpenIpResponse build() {
            return new DescribeInternetOpenIpResponse(this);
        } 

    } 

}
