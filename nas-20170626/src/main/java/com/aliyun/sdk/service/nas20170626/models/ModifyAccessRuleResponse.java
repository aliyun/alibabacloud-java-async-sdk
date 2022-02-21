// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAccessRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyAccessRuleResponse</p>
 */
public class ModifyAccessRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAccessRuleResponseBody body;

    private ModifyAccessRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAccessRuleResponse create() {
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
    public ModifyAccessRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAccessRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAccessRuleResponseBody body);

        @Override
        ModifyAccessRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAccessRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAccessRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAccessRuleResponse response) {
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
        public Builder body(ModifyAccessRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAccessRuleResponse build() {
            return new ModifyAccessRuleResponse(this);
        } 

    } 

}
