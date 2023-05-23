// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCircuitBreakerRuleResponse} extends {@link TeaModel}
 *
 * <p>CreateCircuitBreakerRuleResponse</p>
 */
public class CreateCircuitBreakerRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCircuitBreakerRuleResponseBody body;

    private CreateCircuitBreakerRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCircuitBreakerRuleResponse create() {
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
    public CreateCircuitBreakerRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCircuitBreakerRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCircuitBreakerRuleResponseBody body);

        @Override
        CreateCircuitBreakerRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCircuitBreakerRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCircuitBreakerRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCircuitBreakerRuleResponse response) {
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
        public Builder body(CreateCircuitBreakerRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCircuitBreakerRuleResponse build() {
            return new CreateCircuitBreakerRuleResponse(this);
        } 

    } 

}
