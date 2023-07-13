// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableActiveMetricRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableActiveMetricRuleResponse</p>
 */
public class DisableActiveMetricRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableActiveMetricRuleResponseBody body;

    private DisableActiveMetricRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableActiveMetricRuleResponse create() {
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
    public DisableActiveMetricRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableActiveMetricRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableActiveMetricRuleResponseBody body);

        @Override
        DisableActiveMetricRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableActiveMetricRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableActiveMetricRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableActiveMetricRuleResponse response) {
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
        public Builder body(DisableActiveMetricRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableActiveMetricRuleResponse build() {
            return new DisableActiveMetricRuleResponse(this);
        } 

    } 

}
