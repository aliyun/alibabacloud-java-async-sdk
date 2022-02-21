// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVpnRouteEntryWeightResponse} extends {@link TeaModel}
 *
 * <p>ModifyVpnRouteEntryWeightResponse</p>
 */
public class ModifyVpnRouteEntryWeightResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVpnRouteEntryWeightResponseBody body;

    private ModifyVpnRouteEntryWeightResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVpnRouteEntryWeightResponse create() {
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
    public ModifyVpnRouteEntryWeightResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVpnRouteEntryWeightResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVpnRouteEntryWeightResponseBody body);

        @Override
        ModifyVpnRouteEntryWeightResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVpnRouteEntryWeightResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVpnRouteEntryWeightResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVpnRouteEntryWeightResponse response) {
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
        public Builder body(ModifyVpnRouteEntryWeightResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVpnRouteEntryWeightResponse build() {
            return new ModifyVpnRouteEntryWeightResponse(this);
        } 

    } 

}
