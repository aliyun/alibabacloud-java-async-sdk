// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyMigrationPlanResponse} extends {@link TeaModel}
 *
 * <p>ModifyMigrationPlanResponse</p>
 */
public class ModifyMigrationPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyMigrationPlanResponseBody body;

    private ModifyMigrationPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyMigrationPlanResponse create() {
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
    public ModifyMigrationPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyMigrationPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyMigrationPlanResponseBody body);

        @Override
        ModifyMigrationPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyMigrationPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyMigrationPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyMigrationPlanResponse response) {
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
        public Builder body(ModifyMigrationPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyMigrationPlanResponse build() {
            return new ModifyMigrationPlanResponse(this);
        } 

    } 

}
