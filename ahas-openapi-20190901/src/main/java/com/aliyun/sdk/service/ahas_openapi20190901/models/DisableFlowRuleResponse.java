// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableFlowRuleResponse} extends {@link TeaModel}
 *
 * <p>DisableFlowRuleResponse</p>
 */
public class DisableFlowRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableFlowRuleResponseBody body;

    private DisableFlowRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableFlowRuleResponse create() {
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
    public DisableFlowRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableFlowRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableFlowRuleResponseBody body);

        @Override
        DisableFlowRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableFlowRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableFlowRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableFlowRuleResponse response) {
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
        public Builder body(DisableFlowRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableFlowRuleResponse build() {
            return new DisableFlowRuleResponse(this);
        } 

    } 

}
