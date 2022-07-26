// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntityDeleteResponse} extends {@link TeaModel}
 *
 * <p>EntityDeleteResponse</p>
 */
public class EntityDeleteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EntityDeleteResponseBody body;

    private EntityDeleteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EntityDeleteResponse create() {
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
    public EntityDeleteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EntityDeleteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EntityDeleteResponseBody body);

        @Override
        EntityDeleteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EntityDeleteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EntityDeleteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EntityDeleteResponse response) {
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
        public Builder body(EntityDeleteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EntityDeleteResponse build() {
            return new EntityDeleteResponse(this);
        } 

    } 

}
