// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeClustersRequest</p>
 */
public class DescribeClustersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusterType")
    private String clusterType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resource_group_id")
    private String resourceGroupId;

    private DescribeClustersRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeClustersRequest, Builder> {
        private String clusterType; 
        private String name; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClustersRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The cluster type.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("clusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The cluster name based on which the system performs fuzzy searches among the clusters that belong to the current Alibaba Cloud account.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * resource_group_id.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resource_group_id", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeClustersRequest build() {
            return new DescribeClustersRequest(this);
        } 

    } 

}
