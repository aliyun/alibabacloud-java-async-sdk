// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVMFromServiceMeshResponse} extends {@link TeaModel}
 *
 * <p>RemoveVMFromServiceMeshResponse</p>
 */
public class RemoveVMFromServiceMeshResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveVMFromServiceMeshResponseBody body;

    private RemoveVMFromServiceMeshResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveVMFromServiceMeshResponse create() {
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
    public RemoveVMFromServiceMeshResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveVMFromServiceMeshResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveVMFromServiceMeshResponseBody body);

        @Override
        RemoveVMFromServiceMeshResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveVMFromServiceMeshResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveVMFromServiceMeshResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveVMFromServiceMeshResponse response) {
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
        public Builder body(RemoveVMFromServiceMeshResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveVMFromServiceMeshResponse build() {
            return new RemoveVMFromServiceMeshResponse(this);
        } 

    } 

}
