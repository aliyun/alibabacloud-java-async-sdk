// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDatabaseUserRolesResponse} extends {@link TeaModel}
 *
 * <p>ModifyDatabaseUserRolesResponse</p>
 */
public class ModifyDatabaseUserRolesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDatabaseUserRolesResponseBody body;

    private ModifyDatabaseUserRolesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDatabaseUserRolesResponse create() {
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
    public ModifyDatabaseUserRolesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDatabaseUserRolesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDatabaseUserRolesResponseBody body);

        @Override
        ModifyDatabaseUserRolesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDatabaseUserRolesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDatabaseUserRolesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDatabaseUserRolesResponse response) {
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
        public Builder body(ModifyDatabaseUserRolesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDatabaseUserRolesResponse build() {
            return new ModifyDatabaseUserRolesResponse(this);
        } 

    } 

}
