// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteClusterRequest} extends {@link RequestModel}
 *
 * <p>DeleteClusterRequest</p>
 */
public class DeleteClusterRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ReleaseInstance")
    private String releaseInstance;

    private DeleteClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.releaseInstance = builder.releaseInstance;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return releaseInstance
     */
    public String getReleaseInstance() {
        return this.releaseInstance;
    }

    public static final class Builder extends Request.Builder<DeleteClusterRequest, Builder> {
        private String clusterId; 
        private String releaseInstance; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.releaseInstance = request.releaseInstance;
        } 

        /**
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to obtain cluster IDs.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to release Elastic Compute Service (ECS) instances that are created by using Elastic High Performance Computing (E-HPC).
         * <p>
         * 
         * Default value: true.
         */
        public Builder releaseInstance(String releaseInstance) {
            this.putQueryParameter("ReleaseInstance", releaseInstance);
            this.releaseInstance = releaseInstance;
            return this;
        }

        @Override
        public DeleteClusterRequest build() {
            return new DeleteClusterRequest(this);
        } 

    } 

}
