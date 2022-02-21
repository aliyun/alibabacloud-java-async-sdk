// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyClusterBootstrapActionResponse} extends {@link TeaModel}
 *
 * <p>ModifyClusterBootstrapActionResponse</p>
 */
public class ModifyClusterBootstrapActionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyClusterBootstrapActionResponseBody body;

    private ModifyClusterBootstrapActionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyClusterBootstrapActionResponse create() {
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
    public ModifyClusterBootstrapActionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyClusterBootstrapActionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyClusterBootstrapActionResponseBody body);

        @Override
        ModifyClusterBootstrapActionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyClusterBootstrapActionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyClusterBootstrapActionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyClusterBootstrapActionResponse response) {
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
        public Builder body(ModifyClusterBootstrapActionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyClusterBootstrapActionResponse build() {
            return new ModifyClusterBootstrapActionResponse(this);
        } 

    } 

}
