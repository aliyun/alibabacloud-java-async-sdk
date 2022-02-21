// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMigratableInstancesResponse} extends {@link TeaModel}
 *
 * <p>DeleteMigratableInstancesResponse</p>
 */
public class DeleteMigratableInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteMigratableInstancesResponseBody body;

    private DeleteMigratableInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteMigratableInstancesResponse create() {
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
    public DeleteMigratableInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteMigratableInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteMigratableInstancesResponseBody body);

        @Override
        DeleteMigratableInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteMigratableInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteMigratableInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteMigratableInstancesResponse response) {
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
        public Builder body(DeleteMigratableInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteMigratableInstancesResponse build() {
            return new DeleteMigratableInstancesResponse(this);
        } 

    } 

}
