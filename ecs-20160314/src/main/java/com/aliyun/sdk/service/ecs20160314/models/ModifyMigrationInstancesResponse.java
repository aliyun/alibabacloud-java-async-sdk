// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMigrationInstancesResponse} extends {@link TeaModel}
 *
 * <p>ModifyMigrationInstancesResponse</p>
 */
public class ModifyMigrationInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMigrationInstancesResponseBody body;

    private ModifyMigrationInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMigrationInstancesResponse create() {
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
    public ModifyMigrationInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMigrationInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMigrationInstancesResponseBody body);

        @Override
        ModifyMigrationInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMigrationInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMigrationInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMigrationInstancesResponse response) {
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
        public Builder body(ModifyMigrationInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMigrationInstancesResponse build() {
            return new ModifyMigrationInstancesResponse(this);
        } 

    } 

}
