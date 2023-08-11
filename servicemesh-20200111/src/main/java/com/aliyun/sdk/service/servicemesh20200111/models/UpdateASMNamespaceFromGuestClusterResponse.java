// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateASMNamespaceFromGuestClusterResponse} extends {@link TeaModel}
 *
 * <p>UpdateASMNamespaceFromGuestClusterResponse</p>
 */
public class UpdateASMNamespaceFromGuestClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateASMNamespaceFromGuestClusterResponseBody body;

    private UpdateASMNamespaceFromGuestClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateASMNamespaceFromGuestClusterResponse create() {
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
    public UpdateASMNamespaceFromGuestClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateASMNamespaceFromGuestClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateASMNamespaceFromGuestClusterResponseBody body);

        @Override
        UpdateASMNamespaceFromGuestClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateASMNamespaceFromGuestClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateASMNamespaceFromGuestClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateASMNamespaceFromGuestClusterResponse response) {
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
        public Builder body(UpdateASMNamespaceFromGuestClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateASMNamespaceFromGuestClusterResponse build() {
            return new UpdateASMNamespaceFromGuestClusterResponse(this);
        } 

    } 

}
