// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpnPbrRouteEntryWeightResponse} extends {@link TeaModel}
 *
 * <p>ModifyVpnPbrRouteEntryWeightResponse</p>
 */
public class ModifyVpnPbrRouteEntryWeightResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVpnPbrRouteEntryWeightResponseBody body;

    private ModifyVpnPbrRouteEntryWeightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVpnPbrRouteEntryWeightResponse create() {
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
    public ModifyVpnPbrRouteEntryWeightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVpnPbrRouteEntryWeightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVpnPbrRouteEntryWeightResponseBody body);

        @Override
        ModifyVpnPbrRouteEntryWeightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVpnPbrRouteEntryWeightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVpnPbrRouteEntryWeightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVpnPbrRouteEntryWeightResponse response) {
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
        public Builder body(ModifyVpnPbrRouteEntryWeightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVpnPbrRouteEntryWeightResponse build() {
            return new ModifyVpnPbrRouteEntryWeightResponse(this);
        } 

    } 

}
