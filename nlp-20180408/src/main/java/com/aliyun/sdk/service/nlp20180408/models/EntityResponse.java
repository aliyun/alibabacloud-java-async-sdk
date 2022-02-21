// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp20180408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EntityResponse} extends {@link TeaModel}
 *
 * <p>EntityResponse</p>
 */
public class EntityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    private EntityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
    }

    public static EntityResponse create() {
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

    public interface Builder extends Response.Builder<EntityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        @Override
        EntityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EntityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EntityResponse response) {
            super(response);
            this.headers = response.headers;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        @Override
        public EntityResponse build() {
            return new EntityResponse(this);
        } 

    } 

}
