// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListClusterAddonInstanceResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListClusterAddonInstanceResourcesRequest</p>
 */
public class ListClusterAddonInstanceResourcesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("cluster_id")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instance_name")
    private String instanceName;

    private ListClusterAddonInstanceResourcesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterAddonInstanceResourcesRequest create() {
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
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    public static final class Builder extends Request.Builder<ListClusterAddonInstanceResourcesRequest, Builder> {
        private String clusterId; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterAddonInstanceResourcesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.instanceName = request.instanceName;
        } 

        /**
         * cluster_id.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("cluster_id", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * instance_name.
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("instance_name", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public ListClusterAddonInstanceResourcesRequest build() {
            return new ListClusterAddonInstanceResourcesRequest(this);
        } 

    } 

}
