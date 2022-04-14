// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHubClusterRequest} extends {@link RequestModel}
 *
 * <p>DeleteHubClusterRequest</p>
 */
public class DeleteHubClusterRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Force")
    private Boolean force;

    private DeleteHubClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.force = builder.force;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHubClusterRequest create() {
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
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    public static final class Builder extends Request.Builder<DeleteHubClusterRequest, Builder> {
        private String clusterId; 
        private Boolean force; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHubClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.force = request.force;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        @Override
        public DeleteHubClusterRequest build() {
            return new DeleteHubClusterRequest(this);
        } 

    } 

}
