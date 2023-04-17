// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskDeploymentResponse} extends {@link TeaModel}
 *
 * <p>ModifyDiskDeploymentResponse</p>
 */
public class ModifyDiskDeploymentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDiskDeploymentResponseBody body;

    private ModifyDiskDeploymentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDiskDeploymentResponse create() {
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
    public ModifyDiskDeploymentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDiskDeploymentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDiskDeploymentResponseBody body);

        @Override
        ModifyDiskDeploymentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDiskDeploymentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDiskDeploymentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDiskDeploymentResponse response) {
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
        public Builder body(ModifyDiskDeploymentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDiskDeploymentResponse build() {
            return new ModifyDiskDeploymentResponse(this);
        } 

    } 

}
