// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpnPbrRouteEntryAttributeResponse} extends {@link TeaModel}
 *
 * <p>ModifyVpnPbrRouteEntryAttributeResponse</p>
 */
public class ModifyVpnPbrRouteEntryAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVpnPbrRouteEntryAttributeResponseBody body;

    private ModifyVpnPbrRouteEntryAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVpnPbrRouteEntryAttributeResponse create() {
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
    public ModifyVpnPbrRouteEntryAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVpnPbrRouteEntryAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVpnPbrRouteEntryAttributeResponseBody body);

        @Override
        ModifyVpnPbrRouteEntryAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVpnPbrRouteEntryAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVpnPbrRouteEntryAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVpnPbrRouteEntryAttributeResponse response) {
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
        public Builder body(ModifyVpnPbrRouteEntryAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVpnPbrRouteEntryAttributeResponse build() {
            return new ModifyVpnPbrRouteEntryAttributeResponse(this);
        } 

    } 

}
