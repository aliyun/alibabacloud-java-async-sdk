// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyActionEventPolicyResponse} extends {@link TeaModel}
 *
 * <p>ModifyActionEventPolicyResponse</p>
 */
public class ModifyActionEventPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyActionEventPolicyResponseBody body;

    private ModifyActionEventPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyActionEventPolicyResponse create() {
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
    public ModifyActionEventPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyActionEventPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyActionEventPolicyResponseBody body);

        @Override
        ModifyActionEventPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyActionEventPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyActionEventPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyActionEventPolicyResponse response) {
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
        public Builder body(ModifyActionEventPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyActionEventPolicyResponse build() {
            return new ModifyActionEventPolicyResponse(this);
        } 

    } 

}
