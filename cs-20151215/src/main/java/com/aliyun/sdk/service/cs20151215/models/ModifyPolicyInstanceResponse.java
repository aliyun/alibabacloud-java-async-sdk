// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPolicyInstanceResponse} extends {@link TeaModel}
 *
 * <p>ModifyPolicyInstanceResponse</p>
 */
public class ModifyPolicyInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPolicyInstanceResponseBody body;

    private ModifyPolicyInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPolicyInstanceResponse create() {
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
    public ModifyPolicyInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPolicyInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPolicyInstanceResponseBody body);

        @Override
        ModifyPolicyInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPolicyInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPolicyInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPolicyInstanceResponse response) {
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
        public Builder body(ModifyPolicyInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPolicyInstanceResponse build() {
            return new ModifyPolicyInstanceResponse(this);
        } 

    } 

}
