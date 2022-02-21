// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIsolationRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyIsolationRuleResponse</p>
 */
public class ModifyIsolationRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIsolationRuleResponseBody body;

    private ModifyIsolationRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIsolationRuleResponse create() {
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
    public ModifyIsolationRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIsolationRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIsolationRuleResponseBody body);

        @Override
        ModifyIsolationRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIsolationRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIsolationRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIsolationRuleResponse response) {
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
        public Builder body(ModifyIsolationRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIsolationRuleResponse build() {
            return new ModifyIsolationRuleResponse(this);
        } 

    } 

}
