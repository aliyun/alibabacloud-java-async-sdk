// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePrometheusAlertRuleResponse} extends {@link TeaModel}
 *
 * <p>DeletePrometheusAlertRuleResponse</p>
 */
public class DeletePrometheusAlertRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeletePrometheusAlertRuleResponseBody body;

    private DeletePrometheusAlertRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeletePrometheusAlertRuleResponse create() {
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
    public DeletePrometheusAlertRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeletePrometheusAlertRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeletePrometheusAlertRuleResponseBody body);

        @Override
        DeletePrometheusAlertRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeletePrometheusAlertRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeletePrometheusAlertRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeletePrometheusAlertRuleResponse response) {
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
        public Builder body(DeletePrometheusAlertRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeletePrometheusAlertRuleResponse build() {
            return new DeletePrometheusAlertRuleResponse(this);
        } 

    } 

}
