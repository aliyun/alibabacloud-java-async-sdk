// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("keep_slb")
    private Boolean keepSlb;

    @Query
    @NameInMap("retain_all_resources")
    private Boolean retainAllResources;

    @Query
    @NameInMap("retain_resources")
    private java.util.List < String > retainResources;

    private DeleteClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.keepSlb = builder.keepSlb;
        this.retainAllResources = builder.retainAllResources;
        this.retainResources = builder.retainResources;
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
     * @return keepSlb
     */
    public Boolean getKeepSlb() {
        return this.keepSlb;
    }

    /**
     * @return retainAllResources
     */
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    /**
     * @return retainResources
     */
    public java.util.List < String > getRetainResources() {
        return this.retainResources;
    }

    public static final class Builder extends Request.Builder<DeleteClusterRequest, Builder> {
        private String clusterId; 
        private Boolean keepSlb; 
        private Boolean retainAllResources; 
        private java.util.List < String > retainResources; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.keepSlb = request.keepSlb;
            this.retainAllResources = request.retainAllResources;
            this.retainResources = request.retainResources;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to retain the Server Load Balancer (SLB) resources that are created by the cluster.
         * <p>
         * 
         * *   `true`: retains the SLB resources that are created by the cluster.
         * *   `false`: does not retain the SLB resources that are created by the cluster.
         * 
         * Default value: `false`.
         */
        public Builder keepSlb(Boolean keepSlb) {
            this.putQueryParameter("keep_slb", keepSlb);
            this.keepSlb = keepSlb;
            return this;
        }

        /**
         * Specifies whether to retain all resources. If you set the parameter to `true`, the `retain_resources` parameter is ignored.
         * <p>
         * 
         * *   `true`: retains all resources.
         * *   `false`: does not retain all resources.
         * 
         * Default value: `false`.
         */
        public Builder retainAllResources(Boolean retainAllResources) {
            this.putQueryParameter("retain_all_resources", retainAllResources);
            this.retainAllResources = retainAllResources;
            return this;
        }

        /**
         * The list of resources. To retain resources when you delete a cluster, you need to specify the IDs of the resources to be retained.
         */
        public Builder retainResources(java.util.List < String > retainResources) {
            String retainResourcesShrink = shrink(retainResources, "retain_resources", "json");
            this.putQueryParameter("retain_resources", retainResourcesShrink);
            this.retainResources = retainResources;
            return this;
        }

        @Override
        public DeleteClusterRequest build() {
            return new DeleteClusterRequest(this);
        } 

    } 

}
