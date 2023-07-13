// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyHybridMonitorNamespaceResponse} extends {@link TeaModel}
 *
 * <p>ModifyHybridMonitorNamespaceResponse</p>
 */
public class ModifyHybridMonitorNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyHybridMonitorNamespaceResponseBody body;

    private ModifyHybridMonitorNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyHybridMonitorNamespaceResponse create() {
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
    public ModifyHybridMonitorNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyHybridMonitorNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyHybridMonitorNamespaceResponseBody body);

        @Override
        ModifyHybridMonitorNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyHybridMonitorNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyHybridMonitorNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyHybridMonitorNamespaceResponse response) {
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
        public Builder body(ModifyHybridMonitorNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyHybridMonitorNamespaceResponse build() {
            return new ModifyHybridMonitorNamespaceResponse(this);
        } 

    } 

}
