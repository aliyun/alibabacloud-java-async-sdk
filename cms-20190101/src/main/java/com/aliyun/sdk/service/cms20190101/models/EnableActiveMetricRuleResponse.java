// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableActiveMetricRuleResponse} extends {@link TeaModel}
 *
 * <p>EnableActiveMetricRuleResponse</p>
 */
public class EnableActiveMetricRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableActiveMetricRuleResponseBody body;

    private EnableActiveMetricRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableActiveMetricRuleResponse create() {
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
    public EnableActiveMetricRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableActiveMetricRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableActiveMetricRuleResponseBody body);

        @Override
        EnableActiveMetricRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableActiveMetricRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableActiveMetricRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableActiveMetricRuleResponse response) {
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
        public Builder body(EnableActiveMetricRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableActiveMetricRuleResponse build() {
            return new EnableActiveMetricRuleResponse(this);
        } 

    } 

}
