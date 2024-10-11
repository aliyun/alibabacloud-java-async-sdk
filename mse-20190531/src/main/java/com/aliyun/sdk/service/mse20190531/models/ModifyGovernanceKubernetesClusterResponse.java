// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyGovernanceKubernetesClusterResponse} extends {@link TeaModel}
 *
 * <p>ModifyGovernanceKubernetesClusterResponse</p>
 */
public class ModifyGovernanceKubernetesClusterResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private ModifyGovernanceKubernetesClusterResponseBody body;

    private ModifyGovernanceKubernetesClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public ModifyGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyGovernanceKubernetesClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(ModifyGovernanceKubernetesClusterResponseBody body);

        @Override
        ModifyGovernanceKubernetesClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyGovernanceKubernetesClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private ModifyGovernanceKubernetesClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyGovernanceKubernetesClusterResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
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
