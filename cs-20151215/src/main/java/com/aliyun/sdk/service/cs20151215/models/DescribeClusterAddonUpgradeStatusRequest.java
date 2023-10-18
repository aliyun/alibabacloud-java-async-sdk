// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterAddonUpgradeStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAddonUpgradeStatusRequest</p>
 */
public class DescribeClusterAddonUpgradeStatusRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ComponentId")
    @Validation(required = true)
    private String componentId;

    private DescribeClusterAddonUpgradeStatusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentId = builder.componentId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterAddonUpgradeStatusRequest create() {
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
     * @return componentId
     */
    public String getComponentId() {
        return this.componentId;
    }

    public static final class Builder extends Request.Builder<DescribeClusterAddonUpgradeStatusRequest, Builder> {
        private String clusterId; 
        private String componentId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterAddonUpgradeStatusRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentId = request.componentId;
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
         * The component ID. Example: nginx-ingress-controller, flexvolume, or metrics-server.
         * <p>
         * 
         * You can call the `DescribeAddons` API operation to query the components supported by the cluster.
         */
        public Builder componentId(String componentId) {
            this.putPathParameter("ComponentId", componentId);
            this.componentId = componentId;
            return this;
        }

        @Override
        public DescribeClusterAddonUpgradeStatusRequest build() {
            return new DescribeClusterAddonUpgradeStatusRequest(this);
        } 

    } 

}
