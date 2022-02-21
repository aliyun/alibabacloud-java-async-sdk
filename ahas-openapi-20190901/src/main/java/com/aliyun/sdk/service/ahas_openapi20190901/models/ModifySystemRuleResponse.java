// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySystemRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifySystemRuleResponse</p>
 */
public class ModifySystemRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySystemRuleResponseBody body;

    private ModifySystemRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySystemRuleResponse create() {
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
    public ModifySystemRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySystemRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySystemRuleResponseBody body);

        @Override
        ModifySystemRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySystemRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySystemRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySystemRuleResponse response) {
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
        public Builder body(ModifySystemRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySystemRuleResponse build() {
            return new ModifySystemRuleResponse(this);
        } 

    } 

}
