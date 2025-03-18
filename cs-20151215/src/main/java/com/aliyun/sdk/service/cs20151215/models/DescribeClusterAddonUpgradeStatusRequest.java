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
 * {@link DescribeClusterAddonUpgradeStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterAddonUpgradeStatusRequest</p>
 */
public class DescribeClusterAddonUpgradeStatusRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ComponentId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c106f377e16f34eb1808d6b9362c9****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The component ID. Example: nginx-ingress-controller, flexvolume, or metrics-server.</p>
         * <p>You can call the <code>DescribeAddons</code> API operation to query the components supported by the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cloud-controller-manager</p>
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
