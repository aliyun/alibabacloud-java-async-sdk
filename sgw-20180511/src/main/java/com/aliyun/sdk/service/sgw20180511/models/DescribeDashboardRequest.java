// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDashboardRequest} extends {@link RequestModel}
 *
 * <p>DescribeDashboardRequest</p>
 */
public class DescribeDashboardRequest extends Request {
    @Query
    @NameInMap("BackendBucketRegionId")
    private String backendBucketRegionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeDashboardRequest(Builder builder) {
        super(builder);
        this.backendBucketRegionId = builder.backendBucketRegionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDashboardRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendBucketRegionId
     */
    public String getBackendBucketRegionId() {
        return this.backendBucketRegionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeDashboardRequest, Builder> {
        private String backendBucketRegionId; 
        private String resourceGroupId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDashboardRequest request) {
            super(request);
            this.backendBucketRegionId = request.backendBucketRegionId;
            this.resourceGroupId = request.resourceGroupId;
            this.securityToken = request.securityToken;
        } 

        /**
         * BackendBucketRegionId.
         */
        public Builder backendBucketRegionId(String backendBucketRegionId) {
            this.putQueryParameter("BackendBucketRegionId", backendBucketRegionId);
            this.backendBucketRegionId = backendBucketRegionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeDashboardRequest build() {
            return new DescribeDashboardRequest(this);
        } 

    } 

}
