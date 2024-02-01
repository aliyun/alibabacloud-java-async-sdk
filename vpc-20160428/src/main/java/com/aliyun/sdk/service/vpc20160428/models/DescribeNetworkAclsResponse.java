// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkAclsResponse} extends {@link TeaModel}
 *
 * <p>DescribeNetworkAclsResponse</p>
 */
public class DescribeNetworkAclsResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeNetworkAclsResponseBody body;

    private DescribeNetworkAclsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeNetworkAclsResponse create() {
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
    public DescribeNetworkAclsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNetworkAclsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeNetworkAclsResponseBody body);

        @Override
        DescribeNetworkAclsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNetworkAclsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeNetworkAclsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNetworkAclsResponse response) {
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
        public Builder body(DescribeNetworkAclsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNetworkAclsResponse build() {
            return new DescribeNetworkAclsResponse(this);
        } 

    } 

}
