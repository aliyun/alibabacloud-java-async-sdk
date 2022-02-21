// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterSecurityGroupRuleResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterSecurityGroupRuleResponse</p>
 */
public class ModifyClusterSecurityGroupRuleResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterSecurityGroupRuleResponseBody body;

    private ModifyClusterSecurityGroupRuleResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterSecurityGroupRuleResponse create() {
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
    public ModifyClusterSecurityGroupRuleResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterSecurityGroupRuleResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterSecurityGroupRuleResponseBody body);

        @Override
        ModifyClusterSecurityGroupRuleResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterSecurityGroupRuleResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterSecurityGroupRuleResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterSecurityGroupRuleResponse response) {
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
        public Builder body(ModifyClusterSecurityGroupRuleResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterSecurityGroupRuleResponse build() {
            return new ModifyClusterSecurityGroupRuleResponse(this);
        } 

    } 

}
