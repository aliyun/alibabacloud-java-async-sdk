// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventRuleTargetListResponse} extends {@link TeaModel}
 *
 * <p>DescribeEventRuleTargetListResponse</p>
 */
public class DescribeEventRuleTargetListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEventRuleTargetListResponseBody body;

    private DescribeEventRuleTargetListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEventRuleTargetListResponse create() {
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
    public DescribeEventRuleTargetListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEventRuleTargetListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEventRuleTargetListResponseBody body);

        @Override
        DescribeEventRuleTargetListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEventRuleTargetListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEventRuleTargetListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEventRuleTargetListResponse response) {
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
        public Builder body(DescribeEventRuleTargetListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEventRuleTargetListResponse build() {
            return new DescribeEventRuleTargetListResponse(this);
        } 

    } 

}
