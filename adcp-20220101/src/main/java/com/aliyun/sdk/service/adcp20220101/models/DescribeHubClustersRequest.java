// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHubClustersRequest} extends {@link RequestModel}
 *
 * <p>DescribeHubClustersRequest</p>
 */
public class DescribeHubClustersRequest extends Request {
    @Query
    @NameInMap("Profile")
    private String profile;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeHubClustersRequest(Builder builder) {
        super(builder);
        this.profile = builder.profile;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHubClustersRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return profile
     */
    public String getProfile() {
        return this.profile;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeHubClustersRequest, Builder> {
        private String profile; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHubClustersRequest request) {
            super(request);
            this.profile = request.profile;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The configurations of the cluster.
         */
        public Builder profile(String profile) {
            this.putQueryParameter("Profile", profile);
            this.profile = profile;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeHubClustersRequest build() {
            return new DescribeHubClustersRequest(this);
        } 

    } 

}
