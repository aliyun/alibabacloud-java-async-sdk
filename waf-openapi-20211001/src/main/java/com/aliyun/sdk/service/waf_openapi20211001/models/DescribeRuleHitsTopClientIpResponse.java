// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopClientIpResponse} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopClientIpResponse</p>
 */
public class DescribeRuleHitsTopClientIpResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRuleHitsTopClientIpResponseBody body;

    private DescribeRuleHitsTopClientIpResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRuleHitsTopClientIpResponse create() {
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
    public DescribeRuleHitsTopClientIpResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRuleHitsTopClientIpResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRuleHitsTopClientIpResponseBody body);

        @Override
        DescribeRuleHitsTopClientIpResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRuleHitsTopClientIpResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRuleHitsTopClientIpResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRuleHitsTopClientIpResponse response) {
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
        public Builder body(DescribeRuleHitsTopClientIpResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRuleHitsTopClientIpResponse build() {
            return new DescribeRuleHitsTopClientIpResponse(this);
        } 

    } 

}
