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
    @NameInMap("retain_all_resources")
    private Boolean retainAllResources;

    @Query
    @NameInMap("retain_resources")
    private java.util.List < String > retainResources;

    @Query
    @NameInMap("keep_slb")
    private Boolean keepSlb;

    private DeleteClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.retainAllResources = builder.retainAllResources;
        this.retainResources = builder.retainResources;
        this.keepSlb = builder.keepSlb;
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

    /**
     * @return keepSlb
     */
    public Boolean getKeepSlb() {
        return this.keepSlb;
    }

    public static final class Builder extends Request.Builder<DeleteClusterRequest, Builder> {
        private String clusterId; 
        private Boolean retainAllResources; 
        private java.util.List < String > retainResources; 
        private Boolean keepSlb; 

        private Builder() {
            super();
        } 

        private Builder(DeleteClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.retainAllResources = request.retainAllResources;
            this.retainResources = request.retainResources;
            this.keepSlb = request.keepSlb;
        } 

        /**
         * The ID of the cluster.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to retain all resources. If the value is set to "true", "retain_resource" is ignored ".
         * <p>
         * 
         * -"true": retain all resources.
         * -"false": does not retain all resources.
         * 
         * Default value: "false ".
         */
        public Builder retainAllResources(Boolean retainAllResources) {
            this.putQueryParameter("retain_all_resources", retainAllResources);
            this.retainAllResources = retainAllResources;
            return this;
        }

        /**
         * The list of resources. If you want to retain resources when deleting a cluster, you must provide the ID of the corresponding resource.
         */
        public Builder retainResources(java.util.List < String > retainResources) {
            this.putQueryParameter("retain_resources", retainResources);
            this.retainResources = retainResources;
            return this;
        }

        /**
         * Specifies whether to retain the SLB instance. Valid values:
         * <p>
         * 
         * -"true": retain the created SLB resources.
         * -"false": the created SLB resources are not retained.
         * 
         * Default value: "false ".
         */
        public Builder keepSlb(Boolean keepSlb) {
            this.putQueryParameter("keep_slb", keepSlb);
            this.keepSlb = keepSlb;
            return this;
        }

        @Override
        public DeleteClusterRequest build() {
            return new DeleteClusterRequest(this);
        } 

    } 

}
