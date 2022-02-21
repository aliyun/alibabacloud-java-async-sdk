// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryGovernanceKubernetesClusterResponse} extends {@link TeaModel}
 *
 * <p>QueryGovernanceKubernetesClusterResponse</p>
 */
public class QueryGovernanceKubernetesClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private QueryGovernanceKubernetesClusterResponseBody body;

    private QueryGovernanceKubernetesClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static QueryGovernanceKubernetesClusterResponse create() {
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
    public QueryGovernanceKubernetesClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<QueryGovernanceKubernetesClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(QueryGovernanceKubernetesClusterResponseBody body);

        @Override
        QueryGovernanceKubernetesClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<QueryGovernanceKubernetesClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private QueryGovernanceKubernetesClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(QueryGovernanceKubernetesClusterResponse response) {
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
        public Builder body(QueryGovernanceKubernetesClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public QueryGovernanceKubernetesClusterResponse build() {
            return new QueryGovernanceKubernetesClusterResponse(this);
        } 

    } 

}
