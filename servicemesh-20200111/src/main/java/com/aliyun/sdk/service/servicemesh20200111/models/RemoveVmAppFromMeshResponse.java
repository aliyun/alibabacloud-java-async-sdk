// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveVmAppFromMeshResponse} extends {@link TeaModel}
 *
 * <p>RemoveVmAppFromMeshResponse</p>
 */
public class RemoveVmAppFromMeshResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveVmAppFromMeshResponseBody body;

    private RemoveVmAppFromMeshResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveVmAppFromMeshResponse create() {
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
    public RemoveVmAppFromMeshResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveVmAppFromMeshResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveVmAppFromMeshResponseBody body);

        @Override
        RemoveVmAppFromMeshResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveVmAppFromMeshResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveVmAppFromMeshResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveVmAppFromMeshResponse response) {
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
        public Builder body(RemoveVmAppFromMeshResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveVmAppFromMeshResponse build() {
            return new RemoveVmAppFromMeshResponse(this);
        } 

    } 

}
