// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkRuleAttributesResponse} extends {@link TeaModel}
 *
 * <p>DescribeNetworkRuleAttributesResponse</p>
 */
public class DescribeNetworkRuleAttributesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeNetworkRuleAttributesResponseBody body;

    private DescribeNetworkRuleAttributesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeNetworkRuleAttributesResponse create() {
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
    public DescribeNetworkRuleAttributesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeNetworkRuleAttributesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeNetworkRuleAttributesResponseBody body);

        @Override
        DescribeNetworkRuleAttributesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeNetworkRuleAttributesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeNetworkRuleAttributesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeNetworkRuleAttributesResponse response) {
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
        public Builder body(DescribeNetworkRuleAttributesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeNetworkRuleAttributesResponse build() {
            return new DescribeNetworkRuleAttributesResponse(this);
        } 

    } 

}
