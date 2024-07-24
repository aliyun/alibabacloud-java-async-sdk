// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterResourcesRequest</p>
 */
public class DescribeClusterResourcesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("with_addon_resources")
    private Boolean withAddonResources;

    private DescribeClusterResourcesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.withAddonResources = builder.withAddonResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterResourcesRequest create() {
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
     * @return withAddonResources
     */
    public Boolean getWithAddonResources() {
        return this.withAddonResources;
    }

    public static final class Builder extends Request.Builder<DescribeClusterResourcesRequest, Builder> {
        private String clusterId; 
        private Boolean withAddonResources; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterResourcesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.withAddonResources = request.withAddonResources;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * For more information about how to query cluster IDs, see [View cluster information](~~89446~~).
         * 
         * You can also call the [DescribeClustersV1](~~183905~~) API operation to query all clusters that belong to an Alibaba Cloud account.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Specifies whether to query the resources created by cluster components at the same time.
         */
        public Builder withAddonResources(Boolean withAddonResources) {
            this.putQueryParameter("with_addon_resources", withAddonResources);
            this.withAddonResources = withAddonResources;
            return this;
        }

        @Override
        public DescribeClusterResourcesRequest build() {
            return new DescribeClusterResourcesRequest(this);
        } 

    } 

}
