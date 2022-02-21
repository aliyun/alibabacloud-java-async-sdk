// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceMeshResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceMeshResponse</p>
 */
public class CreateServiceMeshResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceMeshResponseBody body;

    private CreateServiceMeshResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceMeshResponse create() {
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
    public CreateServiceMeshResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceMeshResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceMeshResponseBody body);

        @Override
        CreateServiceMeshResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceMeshResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceMeshResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceMeshResponse response) {
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
        public Builder body(CreateServiceMeshResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceMeshResponse build() {
            return new CreateServiceMeshResponse(this);
        } 

    } 

}
