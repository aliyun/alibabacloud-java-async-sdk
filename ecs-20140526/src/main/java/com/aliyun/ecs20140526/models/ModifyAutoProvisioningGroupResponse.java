// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoProvisioningGroupResponse} extends {@link TeaModel}
 *
 * <p>ModifyAutoProvisioningGroupResponse</p>
 */
public class ModifyAutoProvisioningGroupResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAutoProvisioningGroupResponseBody body;

    private ModifyAutoProvisioningGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAutoProvisioningGroupResponse create() {
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
    public ModifyAutoProvisioningGroupResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAutoProvisioningGroupResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAutoProvisioningGroupResponseBody body);

        @Override
        ModifyAutoProvisioningGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAutoProvisioningGroupResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAutoProvisioningGroupResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAutoProvisioningGroupResponse response) {
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
        public Builder body(ModifyAutoProvisioningGroupResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAutoProvisioningGroupResponse build() {
            return new ModifyAutoProvisioningGroupResponse(this);
        } 

    } 

}
