// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHybridMonitorNamespaceResponse} extends {@link TeaModel}
 *
 * <p>DeleteHybridMonitorNamespaceResponse</p>
 */
public class DeleteHybridMonitorNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteHybridMonitorNamespaceResponseBody body;

    private DeleteHybridMonitorNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteHybridMonitorNamespaceResponse create() {
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
    public DeleteHybridMonitorNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteHybridMonitorNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteHybridMonitorNamespaceResponseBody body);

        @Override
        DeleteHybridMonitorNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteHybridMonitorNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteHybridMonitorNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteHybridMonitorNamespaceResponse response) {
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
        public Builder body(DeleteHybridMonitorNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteHybridMonitorNamespaceResponse build() {
            return new DeleteHybridMonitorNamespaceResponse(this);
        } 

    } 

}
