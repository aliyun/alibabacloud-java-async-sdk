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

    @Query
    @NameInMap("RetainResources")
    private java.util.List < String > retainResources;

    private DeleteHubClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.force = builder.force;
        this.retainResources = builder.retainResources;
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

    /**
     * @return retainResources
     */
    public java.util.List < String > getRetainResources() {
        return this.retainResources;
    }

    public static final class Builder extends Request.Builder<DeleteHubClusterRequest, Builder> {
        private String clusterId; 
        private Boolean force; 
        private java.util.List < String > retainResources; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHubClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.force = request.force;
            this.retainResources = request.retainResources;
        } 

        /**
         * The ID of the master instance.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to forcefully delete the master instance in ACK One. Valid values:
         * <p>
         * 
         * *   true: forcefully deletes the master instance in ACK One.
         * *   false: does not forcibly delete the master instance in ACK One.
         * 
         * Default value: false.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * The list of resources to retain.
         */
        public Builder retainResources(java.util.List < String > retainResources) {
            String retainResourcesShrink = shrink(retainResources, "RetainResources", "json");
            this.putQueryParameter("RetainResources", retainResourcesShrink);
            this.retainResources = retainResources;
            return this;
        }

        @Override
        public DeleteHubClusterRequest build() {
            return new DeleteHubClusterRequest(this);
        } 

    } 

}
