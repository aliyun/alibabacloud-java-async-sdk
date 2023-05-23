// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateCircuitBreakerRuleResponse} extends {@link TeaModel}
 *
 * <p>UpdateCircuitBreakerRuleResponse</p>
 */
public class UpdateCircuitBreakerRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateCircuitBreakerRuleResponseBody body;

    private UpdateCircuitBreakerRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateCircuitBreakerRuleResponse create() {
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
    public UpdateCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateCircuitBreakerRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateCircuitBreakerRuleResponseBody body);

        @Override
        UpdateCircuitBreakerRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateCircuitBreakerRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateCircuitBreakerRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateCircuitBreakerRuleResponse response) {
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
        public Builder body(UpdateCircuitBreakerRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateCircuitBreakerRuleResponse build() {
            return new UpdateCircuitBreakerRuleResponse(this);
        } 

    } 

}
