// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePrometheusAlertRuleResponse} extends {@link TeaModel}
 *
 * <p>CreatePrometheusAlertRuleResponse</p>
 */
public class CreatePrometheusAlertRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePrometheusAlertRuleResponseBody body;

    private CreatePrometheusAlertRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePrometheusAlertRuleResponse create() {
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
    public CreatePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePrometheusAlertRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePrometheusAlertRuleResponseBody body);

        @Override
        CreatePrometheusAlertRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePrometheusAlertRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePrometheusAlertRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePrometheusAlertRuleResponse response) {
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
        public Builder body(CreatePrometheusAlertRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePrometheusAlertRuleResponse build() {
            return new CreatePrometheusAlertRuleResponse(this);
        } 

    } 

}
