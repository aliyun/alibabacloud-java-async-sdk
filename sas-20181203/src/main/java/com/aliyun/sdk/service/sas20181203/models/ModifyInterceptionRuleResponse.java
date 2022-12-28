// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyInterceptionRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyInterceptionRuleResponse</p>
 */
public class ModifyInterceptionRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyInterceptionRuleResponseBody body;

    private ModifyInterceptionRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyInterceptionRuleResponse create() {
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
    public ModifyInterceptionRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyInterceptionRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyInterceptionRuleResponseBody body);

        @Override
        ModifyInterceptionRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyInterceptionRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyInterceptionRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyInterceptionRuleResponse response) {
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
        public Builder body(ModifyInterceptionRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyInterceptionRuleResponse build() {
            return new ModifyInterceptionRuleResponse(this);
        } 

    } 

}
