// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPendingMaintenanceActionResponse} extends {@link TeaModel}
 *
 * <p>ModifyPendingMaintenanceActionResponse</p>
 */
public class ModifyPendingMaintenanceActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyPendingMaintenanceActionResponseBody body;

    private ModifyPendingMaintenanceActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyPendingMaintenanceActionResponse create() {
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
    public ModifyPendingMaintenanceActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyPendingMaintenanceActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyPendingMaintenanceActionResponseBody body);

        @Override
        ModifyPendingMaintenanceActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyPendingMaintenanceActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyPendingMaintenanceActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyPendingMaintenanceActionResponse response) {
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
        public Builder body(ModifyPendingMaintenanceActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyPendingMaintenanceActionResponse build() {
            return new ModifyPendingMaintenanceActionResponse(this);
        } 

    } 

}
