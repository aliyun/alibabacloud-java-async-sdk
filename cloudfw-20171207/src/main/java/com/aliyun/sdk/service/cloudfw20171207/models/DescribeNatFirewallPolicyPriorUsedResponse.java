// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNatFirewallPolicyPriorUsedResponse} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallPolicyPriorUsedResponse</p>
 */
public class DescribeNatFirewallPolicyPriorUsedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNatFirewallPolicyPriorUsedResponseBody body;

    private DescribeNatFirewallPolicyPriorUsedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNatFirewallPolicyPriorUsedResponse create() {
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
     * @return body
     */
    public DescribeNatFirewallPolicyPriorUsedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNatFirewallPolicyPriorUsedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNatFirewallPolicyPriorUsedResponseBody body);

        @Override
        DescribeNatFirewallPolicyPriorUsedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNatFirewallPolicyPriorUsedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNatFirewallPolicyPriorUsedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNatFirewallPolicyPriorUsedResponse response) {
            super(response);
            this.headers = response.headers;
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
         * body.
         */
        @Override
        public Builder body(DescribeNatFirewallPolicyPriorUsedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNatFirewallPolicyPriorUsedResponse build() {
            return new DescribeNatFirewallPolicyPriorUsedResponse(this);
        } 

    } 

}
