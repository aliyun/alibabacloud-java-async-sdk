// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteNodesRequest} extends {@link RequestModel}
 *
 * <p>DeleteNodesRequest</p>
 */
public class DeleteNodesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List < String > instanceIds;

    private DeleteNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNodesRequest create() {
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
     * @return instanceIds
     */
    public java.util.List < String > getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<DeleteNodesRequest, Builder> {
        private String clusterId; 
        private java.util.List < String > instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * The cluster ID. You can call the [listclusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The instance IDs of the compute nodes that you want to delete.
         */
        public Builder instanceIds(java.util.List < String > instanceIds) {
            String instanceIdsShrink = shrink(instanceIds, "InstanceIds", "json");
            this.putQueryParameter("InstanceIds", instanceIdsShrink);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public DeleteNodesRequest build() {
            return new DeleteNodesRequest(this);
        } 

    } 

}
