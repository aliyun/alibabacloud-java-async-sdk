// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyGovernanceKubernetesClusterResponse} extends {@link TeaModel}
 *
 * <p>ModifyGovernanceKubernetesClusterResponse</p>
 */
public class ModifyGovernanceKubernetesClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyGovernanceKubernetesClusterResponseBody body;

    private ModifyGovernanceKubernetesClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyGovernanceKubernetesClusterResponse create() {
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
    public ModifyGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyGovernanceKubernetesClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyGovernanceKubernetesClusterResponseBody body);

        @Override
        ModifyGovernanceKubernetesClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyGovernanceKubernetesClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyGovernanceKubernetesClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyGovernanceKubernetesClusterResponse response) {
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
        public Builder body(ModifyGovernanceKubernetesClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyGovernanceKubernetesClusterResponse build() {
            return new ModifyGovernanceKubernetesClusterResponse(this);
        } 

    } 

}
