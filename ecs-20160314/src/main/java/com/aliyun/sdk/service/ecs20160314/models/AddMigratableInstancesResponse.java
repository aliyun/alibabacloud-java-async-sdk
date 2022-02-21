// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddMigratableInstancesResponse} extends {@link TeaModel}
 *
 * <p>AddMigratableInstancesResponse</p>
 */
public class AddMigratableInstancesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddMigratableInstancesResponseBody body;

    private AddMigratableInstancesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddMigratableInstancesResponse create() {
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
    public AddMigratableInstancesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddMigratableInstancesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddMigratableInstancesResponseBody body);

        @Override
        AddMigratableInstancesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddMigratableInstancesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddMigratableInstancesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddMigratableInstancesResponse response) {
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
        public Builder body(AddMigratableInstancesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddMigratableInstancesResponse build() {
            return new AddMigratableInstancesResponse(this);
        } 

    } 

}
