// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMigratableInstancesResponse} extends {@link TeaModel}
 *
 * <p>ModifyMigratableInstancesResponse</p>
 */
public class ModifyMigratableInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMigratableInstancesResponseBody body;

    private ModifyMigratableInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMigratableInstancesResponse create() {
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
    public ModifyMigratableInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMigratableInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMigratableInstancesResponseBody body);

        @Override
        ModifyMigratableInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMigratableInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMigratableInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMigratableInstancesResponse response) {
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
        public Builder body(ModifyMigratableInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMigratableInstancesResponse build() {
            return new ModifyMigratableInstancesResponse(this);
        } 

    } 

}
