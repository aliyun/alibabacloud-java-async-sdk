// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNamespaceVpcResponse} extends {@link TeaModel}
 *
 * <p>UpdateNamespaceVpcResponse</p>
 */
public class UpdateNamespaceVpcResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateNamespaceVpcResponseBody body;

    private UpdateNamespaceVpcResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateNamespaceVpcResponse create() {
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
    public UpdateNamespaceVpcResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateNamespaceVpcResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateNamespaceVpcResponseBody body);

        @Override
        UpdateNamespaceVpcResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateNamespaceVpcResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateNamespaceVpcResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateNamespaceVpcResponse response) {
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
        public Builder body(UpdateNamespaceVpcResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateNamespaceVpcResponse build() {
            return new UpdateNamespaceVpcResponse(this);
        } 

    } 

}
