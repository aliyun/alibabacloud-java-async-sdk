// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHybridProxyClusterRequest} extends {@link RequestModel}
 *
 * <p>DeleteHybridProxyClusterRequest</p>
 */
public class DeleteHybridProxyClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterName;

    private DeleteHybridProxyClusterRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHybridProxyClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    public static final class Builder extends Request.Builder<DeleteHybridProxyClusterRequest, Builder> {
        private String clusterName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHybridProxyClusterRequest request) {
            super(request);
            this.clusterName = request.clusterName;
        } 

        /**
         * ClusterName.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        @Override
        public DeleteHybridProxyClusterRequest build() {
            return new DeleteHybridProxyClusterRequest(this);
        } 

    } 

}
