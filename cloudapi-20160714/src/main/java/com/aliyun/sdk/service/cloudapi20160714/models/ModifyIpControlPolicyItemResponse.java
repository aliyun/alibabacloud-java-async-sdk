// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyIpControlPolicyItemResponse} extends {@link TeaModel}
 *
 * <p>ModifyIpControlPolicyItemResponse</p>
 */
public class ModifyIpControlPolicyItemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyIpControlPolicyItemResponseBody body;

    private ModifyIpControlPolicyItemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyIpControlPolicyItemResponse create() {
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
    public ModifyIpControlPolicyItemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyIpControlPolicyItemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyIpControlPolicyItemResponseBody body);

        @Override
        ModifyIpControlPolicyItemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyIpControlPolicyItemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyIpControlPolicyItemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyIpControlPolicyItemResponse response) {
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
        public Builder body(ModifyIpControlPolicyItemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyIpControlPolicyItemResponse build() {
            return new ModifyIpControlPolicyItemResponse(this);
        } 

    } 

}
