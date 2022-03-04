// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedBlockStorageClusterResponse} extends {@link TeaModel}
 *
 * <p>CreateDedicatedBlockStorageClusterResponse</p>
 */
public class CreateDedicatedBlockStorageClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDedicatedBlockStorageClusterResponseBody body;

    private CreateDedicatedBlockStorageClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDedicatedBlockStorageClusterResponse create() {
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
    public CreateDedicatedBlockStorageClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDedicatedBlockStorageClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDedicatedBlockStorageClusterResponseBody body);

        @Override
        CreateDedicatedBlockStorageClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDedicatedBlockStorageClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDedicatedBlockStorageClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDedicatedBlockStorageClusterResponse response) {
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
        public Builder body(CreateDedicatedBlockStorageClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDedicatedBlockStorageClusterResponse build() {
            return new CreateDedicatedBlockStorageClusterResponse(this);
        } 

    } 

}
