// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkRulesTfResponse} extends {@link TeaModel}
 *
 * <p>DescribeNetworkRulesTfResponse</p>
 */
public class DescribeNetworkRulesTfResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNetworkRulesTfResponseBody body;

    private DescribeNetworkRulesTfResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNetworkRulesTfResponse create() {
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
    public DescribeNetworkRulesTfResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNetworkRulesTfResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNetworkRulesTfResponseBody body);

        @Override
        DescribeNetworkRulesTfResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNetworkRulesTfResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNetworkRulesTfResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNetworkRulesTfResponse response) {
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
        public Builder body(DescribeNetworkRulesTfResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNetworkRulesTfResponse build() {
            return new DescribeNetworkRulesTfResponse(this);
        } 

    } 

}
