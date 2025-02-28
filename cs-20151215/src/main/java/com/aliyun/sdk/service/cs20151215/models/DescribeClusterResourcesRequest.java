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
         * <p>The cluster ID.</p>
         * <p>For more information about how to query cluster IDs, see <a href="https://help.aliyun.com/document_detail/89446.html">View cluster information</a>.</p>
         * <p>You can also call the <a href="https://help.aliyun.com/document_detail/183905.html">DescribeClustersV1</a> API operation to query all clusters that belong to an Alibaba Cloud account.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cb95aa626a47740afbf6aa099b65****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Specifies whether to query the resources created by cluster components.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
