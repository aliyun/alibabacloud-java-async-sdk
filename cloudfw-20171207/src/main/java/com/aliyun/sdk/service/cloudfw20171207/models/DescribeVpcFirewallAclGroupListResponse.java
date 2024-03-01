// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallAclGroupListResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallAclGroupListResponse</p>
 */
public class DescribeVpcFirewallAclGroupListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeVpcFirewallAclGroupListResponseBody body;

    private DescribeVpcFirewallAclGroupListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeVpcFirewallAclGroupListResponse create() {
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
    public DescribeVpcFirewallAclGroupListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpcFirewallAclGroupListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeVpcFirewallAclGroupListResponseBody body);

        @Override
        DescribeVpcFirewallAclGroupListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpcFirewallAclGroupListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeVpcFirewallAclGroupListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpcFirewallAclGroupListResponse response) {
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
        public Builder body(DescribeVpcFirewallAclGroupListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpcFirewallAclGroupListResponse build() {
            return new DescribeVpcFirewallAclGroupListResponse(this);
        } 

    } 

}
