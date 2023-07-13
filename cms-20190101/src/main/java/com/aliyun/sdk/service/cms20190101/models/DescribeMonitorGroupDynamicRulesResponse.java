// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitorGroupDynamicRulesResponse} extends {@link TeaModel}
 *
 * <p>DescribeMonitorGroupDynamicRulesResponse</p>
 */
public class DescribeMonitorGroupDynamicRulesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeMonitorGroupDynamicRulesResponseBody body;

    private DescribeMonitorGroupDynamicRulesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeMonitorGroupDynamicRulesResponse create() {
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
    public DescribeMonitorGroupDynamicRulesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeMonitorGroupDynamicRulesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeMonitorGroupDynamicRulesResponseBody body);

        @Override
        DescribeMonitorGroupDynamicRulesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeMonitorGroupDynamicRulesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeMonitorGroupDynamicRulesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeMonitorGroupDynamicRulesResponse response) {
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
        public Builder body(DescribeMonitorGroupDynamicRulesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeMonitorGroupDynamicRulesResponse build() {
            return new DescribeMonitorGroupDynamicRulesResponse(this);
        } 

    } 

}
