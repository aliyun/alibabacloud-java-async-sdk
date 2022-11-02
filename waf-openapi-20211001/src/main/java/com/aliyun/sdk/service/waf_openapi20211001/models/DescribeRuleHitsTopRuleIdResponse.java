// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRuleHitsTopRuleIdResponse} extends {@link TeaModel}
 *
 * <p>DescribeRuleHitsTopRuleIdResponse</p>
 */
public class DescribeRuleHitsTopRuleIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeRuleHitsTopRuleIdResponseBody body;

    private DescribeRuleHitsTopRuleIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeRuleHitsTopRuleIdResponse create() {
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
    public DescribeRuleHitsTopRuleIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeRuleHitsTopRuleIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeRuleHitsTopRuleIdResponseBody body);

        @Override
        DescribeRuleHitsTopRuleIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeRuleHitsTopRuleIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeRuleHitsTopRuleIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeRuleHitsTopRuleIdResponse response) {
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
        public Builder body(DescribeRuleHitsTopRuleIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeRuleHitsTopRuleIdResponse build() {
            return new DescribeRuleHitsTopRuleIdResponse(this);
        } 

    } 

}
