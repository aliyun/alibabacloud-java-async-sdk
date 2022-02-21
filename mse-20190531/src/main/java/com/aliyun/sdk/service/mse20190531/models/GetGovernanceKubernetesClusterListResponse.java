// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGovernanceKubernetesClusterListResponse} extends {@link TeaModel}
 *
 * <p>GetGovernanceKubernetesClusterListResponse</p>
 */
public class GetGovernanceKubernetesClusterListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetGovernanceKubernetesClusterListResponseBody body;

    private GetGovernanceKubernetesClusterListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetGovernanceKubernetesClusterListResponse create() {
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
    public GetGovernanceKubernetesClusterListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGovernanceKubernetesClusterListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetGovernanceKubernetesClusterListResponseBody body);

        @Override
        GetGovernanceKubernetesClusterListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGovernanceKubernetesClusterListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetGovernanceKubernetesClusterListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGovernanceKubernetesClusterListResponse response) {
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
        public Builder body(GetGovernanceKubernetesClusterListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGovernanceKubernetesClusterListResponse build() {
            return new GetGovernanceKubernetesClusterListResponse(this);
        } 

    } 

}
