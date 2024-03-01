// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcFirewallCenListResponse} extends {@link TeaModel}
 *
 * <p>DescribeVpcFirewallCenListResponse</p>
 */
public class DescribeVpcFirewallCenListResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
    private DescribeVpcFirewallCenListResponseBody body;

    private DescribeVpcFirewallCenListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DescribeVpcFirewallCenListResponse create() {
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
    public DescribeVpcFirewallCenListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeVpcFirewallCenListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DescribeVpcFirewallCenListResponseBody body);

        @Override
        DescribeVpcFirewallCenListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeVpcFirewallCenListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private DescribeVpcFirewallCenListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeVpcFirewallCenListResponse response) {
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
        public Builder body(DescribeVpcFirewallCenListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeVpcFirewallCenListResponse build() {
            return new DescribeVpcFirewallCenListResponse(this);
        } 

    } 

}
