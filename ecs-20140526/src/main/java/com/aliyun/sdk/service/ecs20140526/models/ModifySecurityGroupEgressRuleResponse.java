// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupEgressRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifySecurityGroupEgressRuleResponse</p>
 */
public class ModifySecurityGroupEgressRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySecurityGroupEgressRuleResponseBody body;

    private ModifySecurityGroupEgressRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySecurityGroupEgressRuleResponse create() {
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
    public ModifySecurityGroupEgressRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySecurityGroupEgressRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySecurityGroupEgressRuleResponseBody body);

        @Override
        ModifySecurityGroupEgressRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySecurityGroupEgressRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySecurityGroupEgressRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySecurityGroupEgressRuleResponse response) {
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
        public Builder body(ModifySecurityGroupEgressRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySecurityGroupEgressRuleResponse build() {
            return new ModifySecurityGroupEgressRuleResponse(this);
        } 

    } 

}
