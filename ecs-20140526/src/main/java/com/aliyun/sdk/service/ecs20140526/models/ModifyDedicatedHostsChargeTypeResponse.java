// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDedicatedHostsChargeTypeResponse} extends {@link TeaModel}
 *
 * <p>ModifyDedicatedHostsChargeTypeResponse</p>
 */
public class ModifyDedicatedHostsChargeTypeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDedicatedHostsChargeTypeResponseBody body;

    private ModifyDedicatedHostsChargeTypeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDedicatedHostsChargeTypeResponse create() {
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
    public ModifyDedicatedHostsChargeTypeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDedicatedHostsChargeTypeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDedicatedHostsChargeTypeResponseBody body);

        @Override
        ModifyDedicatedHostsChargeTypeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDedicatedHostsChargeTypeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDedicatedHostsChargeTypeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDedicatedHostsChargeTypeResponse response) {
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
        public Builder body(ModifyDedicatedHostsChargeTypeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDedicatedHostsChargeTypeResponse build() {
            return new ModifyDedicatedHostsChargeTypeResponse(this);
        } 

    } 

}
