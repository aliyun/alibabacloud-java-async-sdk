// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopTuleTypeResponse} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopTuleTypeResponse</p>
 */
public class DescribeRuleHitsTopTuleTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRuleHitsTopTuleTypeResponseBody body;

    private DescribeRuleHitsTopTuleTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRuleHitsTopTuleTypeResponse create() {
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
    public DescribeRuleHitsTopTuleTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRuleHitsTopTuleTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRuleHitsTopTuleTypeResponseBody body);

        @Override
        DescribeRuleHitsTopTuleTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRuleHitsTopTuleTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRuleHitsTopTuleTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRuleHitsTopTuleTypeResponse response) {
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
        public Builder body(DescribeRuleHitsTopTuleTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRuleHitsTopTuleTypeResponse build() {
            return new DescribeRuleHitsTopTuleTypeResponse(this);
        } 

    } 

}
