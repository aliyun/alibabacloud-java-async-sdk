// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterAddonInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListClusterAddonInstancesRequest</p>
 */
public class ListClusterAddonInstancesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    private ListClusterAddonInstancesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterAddonInstancesRequest create() {
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

    public static final class Builder extends Request.Builder<ListClusterAddonInstancesRequest, Builder> {
        private String clusterId; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterAddonInstancesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
        } 

        /**
         * The cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        @Override
        public ListClusterAddonInstancesRequest build() {
            return new ListClusterAddonInstancesRequest(this);
        } 

    } 

}
