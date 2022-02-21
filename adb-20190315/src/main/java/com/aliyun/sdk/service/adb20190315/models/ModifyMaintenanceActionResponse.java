// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMaintenanceActionResponse} extends {@link TeaModel}
 *
 * <p>ModifyMaintenanceActionResponse</p>
 */
public class ModifyMaintenanceActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMaintenanceActionResponseBody body;

    private ModifyMaintenanceActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMaintenanceActionResponse create() {
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
    public ModifyMaintenanceActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMaintenanceActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMaintenanceActionResponseBody body);

        @Override
        ModifyMaintenanceActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMaintenanceActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMaintenanceActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMaintenanceActionResponse response) {
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
        public Builder body(ModifyMaintenanceActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMaintenanceActionResponse build() {
            return new ModifyMaintenanceActionResponse(this);
        } 

    } 

}
