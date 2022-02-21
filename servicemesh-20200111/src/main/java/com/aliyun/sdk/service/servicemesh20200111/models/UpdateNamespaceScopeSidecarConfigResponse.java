// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNamespaceScopeSidecarConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateNamespaceScopeSidecarConfigResponse</p>
 */
public class UpdateNamespaceScopeSidecarConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNamespaceScopeSidecarConfigResponseBody body;

    private UpdateNamespaceScopeSidecarConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNamespaceScopeSidecarConfigResponse create() {
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
    public UpdateNamespaceScopeSidecarConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNamespaceScopeSidecarConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNamespaceScopeSidecarConfigResponseBody body);

        @Override
        UpdateNamespaceScopeSidecarConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNamespaceScopeSidecarConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNamespaceScopeSidecarConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNamespaceScopeSidecarConfigResponse response) {
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
        public Builder body(UpdateNamespaceScopeSidecarConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNamespaceScopeSidecarConfigResponse build() {
            return new UpdateNamespaceScopeSidecarConfigResponse(this);
        } 

    } 

}
