// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReAddMigrationTaskInPlanResponse} extends {@link TeaModel}
 *
 * <p>ReAddMigrationTaskInPlanResponse</p>
 */
public class ReAddMigrationTaskInPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ReAddMigrationTaskInPlanResponseBody body;

    private ReAddMigrationTaskInPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ReAddMigrationTaskInPlanResponse create() {
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
    public ReAddMigrationTaskInPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ReAddMigrationTaskInPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ReAddMigrationTaskInPlanResponseBody body);

        @Override
        ReAddMigrationTaskInPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ReAddMigrationTaskInPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ReAddMigrationTaskInPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ReAddMigrationTaskInPlanResponse response) {
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
        public Builder body(ReAddMigrationTaskInPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ReAddMigrationTaskInPlanResponse build() {
            return new ReAddMigrationTaskInPlanResponse(this);
        } 

    } 

}
