// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableApplicationScalingRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableApplicationScalingRuleResponse</p>
 */
public class DisableApplicationScalingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableApplicationScalingRuleResponseBody body;

    private DisableApplicationScalingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableApplicationScalingRuleResponse create() {
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
    public DisableApplicationScalingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableApplicationScalingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableApplicationScalingRuleResponseBody body);

        @Override
        DisableApplicationScalingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableApplicationScalingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableApplicationScalingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableApplicationScalingRuleResponse response) {
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
        public Builder body(DisableApplicationScalingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableApplicationScalingRuleResponse build() {
            return new DisableApplicationScalingRuleResponse(this);
        } 

    } 

}
