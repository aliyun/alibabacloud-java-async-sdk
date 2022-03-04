// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySecurityGroupPolicyResponse} extends {@link TeaModel}
 *
 * <p>ModifySecurityGroupPolicyResponse</p>
 */
public class ModifySecurityGroupPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySecurityGroupPolicyResponseBody body;

    private ModifySecurityGroupPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySecurityGroupPolicyResponse create() {
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
    public ModifySecurityGroupPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySecurityGroupPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySecurityGroupPolicyResponseBody body);

        @Override
        ModifySecurityGroupPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySecurityGroupPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySecurityGroupPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySecurityGroupPolicyResponse response) {
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
        public Builder body(ModifySecurityGroupPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySecurityGroupPolicyResponse build() {
            return new ModifySecurityGroupPolicyResponse(this);
        } 

    } 

}
