// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIpv6EgressOnlyRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeIpv6EgressOnlyRulesResponse</p>
 */
public class DescribeIpv6EgressOnlyRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeIpv6EgressOnlyRulesResponseBody body;

    private DescribeIpv6EgressOnlyRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeIpv6EgressOnlyRulesResponse create() {
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
    public DescribeIpv6EgressOnlyRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeIpv6EgressOnlyRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeIpv6EgressOnlyRulesResponseBody body);

        @Override
        DescribeIpv6EgressOnlyRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeIpv6EgressOnlyRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeIpv6EgressOnlyRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeIpv6EgressOnlyRulesResponse response) {
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
        public Builder body(DescribeIpv6EgressOnlyRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeIpv6EgressOnlyRulesResponse build() {
            return new DescribeIpv6EgressOnlyRulesResponse(this);
        } 

    } 

}
