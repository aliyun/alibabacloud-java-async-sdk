// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeJobMonitorRuleResponse} extends {@link TeaModel}
 *
 * <p>DescribeJobMonitorRuleResponse</p>
 */
public class DescribeJobMonitorRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescribeJobMonitorRuleResponseBody body;

    private DescribeJobMonitorRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescribeJobMonitorRuleResponse create() {
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
    public DescribeJobMonitorRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescribeJobMonitorRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescribeJobMonitorRuleResponseBody body);

        @Override
        DescribeJobMonitorRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescribeJobMonitorRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescribeJobMonitorRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescribeJobMonitorRuleResponse response) {
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
        public Builder body(DescribeJobMonitorRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescribeJobMonitorRuleResponse build() {
            return new DescribeJobMonitorRuleResponse(this);
        } 

    } 

}
