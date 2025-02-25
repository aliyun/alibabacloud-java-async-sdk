// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEthereumClientUsersResponse} extends {@link TeaModel}
 *
 * <p>DescribeEthereumClientUsersResponse</p>
 */
public class DescribeEthereumClientUsersResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DescribeEthereumClientUsersResponseBody body;

    private DescribeEthereumClientUsersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeEthereumClientUsersResponse create() {
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
    public DescribeEthereumClientUsersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEthereumClientUsersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeEthereumClientUsersResponseBody body);

        @Override
        DescribeEthereumClientUsersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEthereumClientUsersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeEthereumClientUsersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEthereumClientUsersResponse response) {
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
        public Builder body(DescribeEthereumClientUsersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEthereumClientUsersResponse build() {
            return new DescribeEthereumClientUsersResponse(this);
        } 

    } 

}
