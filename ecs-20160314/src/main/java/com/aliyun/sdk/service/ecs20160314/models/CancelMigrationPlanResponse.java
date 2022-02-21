// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelMigrationPlanResponse} extends {@link TeaModel}
 *
 * <p>CancelMigrationPlanResponse</p>
 */
public class CancelMigrationPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelMigrationPlanResponseBody body;

    private CancelMigrationPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelMigrationPlanResponse create() {
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
    public CancelMigrationPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelMigrationPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelMigrationPlanResponseBody body);

        @Override
        CancelMigrationPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelMigrationPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelMigrationPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelMigrationPlanResponse response) {
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
        public Builder body(CancelMigrationPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelMigrationPlanResponse build() {
            return new CancelMigrationPlanResponse(this);
        } 

    } 

}
