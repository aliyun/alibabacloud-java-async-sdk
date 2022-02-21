// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResolverRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeResolverRulesResponse</p>
 */
public class DescribeResolverRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeResolverRulesResponseBody body;

    private DescribeResolverRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeResolverRulesResponse create() {
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
    public DescribeResolverRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeResolverRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeResolverRulesResponseBody body);

        @Override
        DescribeResolverRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeResolverRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeResolverRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeResolverRulesResponse response) {
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
        public Builder body(DescribeResolverRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeResolverRulesResponse build() {
            return new DescribeResolverRulesResponse(this);
        } 

    } 

}
