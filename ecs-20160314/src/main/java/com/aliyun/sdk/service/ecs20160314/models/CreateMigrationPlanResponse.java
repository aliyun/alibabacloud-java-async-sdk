// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMigrationPlanResponse} extends {@link TeaModel}
 *
 * <p>CreateMigrationPlanResponse</p>
 */
public class CreateMigrationPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateMigrationPlanResponseBody body;

    private CreateMigrationPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateMigrationPlanResponse create() {
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
    public CreateMigrationPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateMigrationPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateMigrationPlanResponseBody body);

        @Override
        CreateMigrationPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateMigrationPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateMigrationPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateMigrationPlanResponse response) {
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
        public Builder body(CreateMigrationPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateMigrationPlanResponse build() {
            return new CreateMigrationPlanResponse(this);
        } 

    } 

}
