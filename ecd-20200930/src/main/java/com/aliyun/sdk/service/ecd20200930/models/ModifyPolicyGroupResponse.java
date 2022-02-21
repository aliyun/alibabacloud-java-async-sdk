// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPolicyGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyPolicyGroupResponse</p>
 */
public class ModifyPolicyGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPolicyGroupResponseBody body;

    private ModifyPolicyGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPolicyGroupResponse create() {
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
    public ModifyPolicyGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPolicyGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPolicyGroupResponseBody body);

        @Override
        ModifyPolicyGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPolicyGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPolicyGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPolicyGroupResponse response) {
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
        public Builder body(ModifyPolicyGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPolicyGroupResponse build() {
            return new ModifyPolicyGroupResponse(this);
        } 

    } 

}
