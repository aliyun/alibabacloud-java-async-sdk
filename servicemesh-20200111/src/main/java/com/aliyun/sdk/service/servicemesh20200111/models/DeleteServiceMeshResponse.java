// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceMeshResponse} extends {@link TeaModel}
 *
 * <p>DeleteServiceMeshResponse</p>
 */
public class DeleteServiceMeshResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteServiceMeshResponseBody body;

    private DeleteServiceMeshResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteServiceMeshResponse create() {
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
    public DeleteServiceMeshResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteServiceMeshResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteServiceMeshResponseBody body);

        @Override
        DeleteServiceMeshResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteServiceMeshResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteServiceMeshResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteServiceMeshResponse response) {
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
        public Builder body(DeleteServiceMeshResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteServiceMeshResponse build() {
            return new DeleteServiceMeshResponse(this);
        } 

    } 

}
