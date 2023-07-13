// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventRuleListResponse} extends {@link TeaModel}
 *
 * <p>DescribeEventRuleListResponse</p>
 */
public class DescribeEventRuleListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeEventRuleListResponseBody body;

    private DescribeEventRuleListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeEventRuleListResponse create() {
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
    public DescribeEventRuleListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeEventRuleListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeEventRuleListResponseBody body);

        @Override
        DescribeEventRuleListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeEventRuleListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeEventRuleListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeEventRuleListResponse response) {
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
        public Builder body(DescribeEventRuleListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeEventRuleListResponse build() {
            return new DescribeEventRuleListResponse(this);
        } 

    } 

}
