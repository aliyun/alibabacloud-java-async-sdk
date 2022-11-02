// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopUrlResponse} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopUrlResponse</p>
 */
public class DescribeRuleHitsTopUrlResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRuleHitsTopUrlResponseBody body;

    private DescribeRuleHitsTopUrlResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRuleHitsTopUrlResponse create() {
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
    public DescribeRuleHitsTopUrlResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRuleHitsTopUrlResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRuleHitsTopUrlResponseBody body);

        @Override
        DescribeRuleHitsTopUrlResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRuleHitsTopUrlResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRuleHitsTopUrlResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRuleHitsTopUrlResponse response) {
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
        public Builder body(DescribeRuleHitsTopUrlResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRuleHitsTopUrlResponse build() {
            return new DescribeRuleHitsTopUrlResponse(this);
        } 

    } 

}
