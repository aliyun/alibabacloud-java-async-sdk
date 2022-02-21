// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyVServerGroupBackendServersResponse} extends {@link TeaModel}
 *
 * <p>ModifyVServerGroupBackendServersResponse</p>
 */
public class ModifyVServerGroupBackendServersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyVServerGroupBackendServersResponseBody body;

    private ModifyVServerGroupBackendServersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyVServerGroupBackendServersResponse create() {
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
    public ModifyVServerGroupBackendServersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyVServerGroupBackendServersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyVServerGroupBackendServersResponseBody body);

        @Override
        ModifyVServerGroupBackendServersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyVServerGroupBackendServersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyVServerGroupBackendServersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyVServerGroupBackendServersResponse response) {
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
        public Builder body(ModifyVServerGroupBackendServersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyVServerGroupBackendServersResponse build() {
            return new ModifyVServerGroupBackendServersResponse(this);
        } 

    } 

}
