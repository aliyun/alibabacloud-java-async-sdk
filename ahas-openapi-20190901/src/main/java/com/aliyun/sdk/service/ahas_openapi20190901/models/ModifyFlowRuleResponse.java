// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyFlowRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyFlowRuleResponse</p>
 */
public class ModifyFlowRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyFlowRuleResponseBody body;

    private ModifyFlowRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyFlowRuleResponse create() {
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
    public ModifyFlowRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyFlowRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyFlowRuleResponseBody body);

        @Override
        ModifyFlowRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyFlowRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyFlowRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyFlowRuleResponse response) {
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
        public Builder body(ModifyFlowRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyFlowRuleResponse build() {
            return new ModifyFlowRuleResponse(this);
        } 

    } 

}
