// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyScalingRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyScalingRuleResponse</p>
 */
public class ModifyScalingRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyScalingRuleResponseBody body;

    private ModifyScalingRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyScalingRuleResponse create() {
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
    public ModifyScalingRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyScalingRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyScalingRuleResponseBody body);

        @Override
        ModifyScalingRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyScalingRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyScalingRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyScalingRuleResponse response) {
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
        public Builder body(ModifyScalingRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyScalingRuleResponse build() {
            return new ModifyScalingRuleResponse(this);
        } 

    } 

}
