// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopResourceResponse} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopResourceResponse</p>
 */
public class DescribeRuleHitsTopResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRuleHitsTopResourceResponseBody body;

    private DescribeRuleHitsTopResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRuleHitsTopResourceResponse create() {
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
    public DescribeRuleHitsTopResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRuleHitsTopResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRuleHitsTopResourceResponseBody body);

        @Override
        DescribeRuleHitsTopResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRuleHitsTopResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRuleHitsTopResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRuleHitsTopResourceResponse response) {
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
        public Builder body(DescribeRuleHitsTopResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRuleHitsTopResourceResponse build() {
            return new DescribeRuleHitsTopResourceResponse(this);
        } 

    } 

}
