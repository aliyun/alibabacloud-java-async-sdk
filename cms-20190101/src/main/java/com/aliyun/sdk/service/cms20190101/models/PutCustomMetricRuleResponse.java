// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutCustomMetricRuleResponse} extends {@link TeaModel}
 *
 * <p>PutCustomMetricRuleResponse</p>
 */
public class PutCustomMetricRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutCustomMetricRuleResponseBody body;

    private PutCustomMetricRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutCustomMetricRuleResponse create() {
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
    public PutCustomMetricRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutCustomMetricRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutCustomMetricRuleResponseBody body);

        @Override
        PutCustomMetricRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutCustomMetricRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutCustomMetricRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutCustomMetricRuleResponse response) {
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
        public Builder body(PutCustomMetricRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutCustomMetricRuleResponse build() {
            return new PutCustomMetricRuleResponse(this);
        } 

    } 

}
