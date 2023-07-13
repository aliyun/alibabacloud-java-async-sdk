// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutGroupMetricRuleResponse} extends {@link TeaModel}
 *
 * <p>PutGroupMetricRuleResponse</p>
 */
public class PutGroupMetricRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutGroupMetricRuleResponseBody body;

    private PutGroupMetricRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutGroupMetricRuleResponse create() {
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
    public PutGroupMetricRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutGroupMetricRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutGroupMetricRuleResponseBody body);

        @Override
        PutGroupMetricRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutGroupMetricRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutGroupMetricRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutGroupMetricRuleResponse response) {
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
        public Builder body(PutGroupMetricRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutGroupMetricRuleResponse build() {
            return new PutGroupMetricRuleResponse(this);
        } 

    } 

}
