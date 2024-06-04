// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudResourcesRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudResourcesRequest</p>
 */
public class DescribeCloudResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUserId")
    private String ownerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 10)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDomain")
    private String resourceDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceFunction")
    private String resourceFunction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
    private String resourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    private String resourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceProduct")
    private String resourceProduct;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRouteName")
    private String resourceRouteName;

    private DescribeCloudResourcesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ownerUserId = builder.ownerUserId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceDomain = builder.resourceDomain;
        this.resourceFunction = builder.resourceFunction;
        this.resourceInstanceId = builder.resourceInstanceId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceName = builder.resourceName;
        this.resourceProduct = builder.resourceProduct;
        this.resourceRegionId = builder.resourceRegionId;
        this.resourceRouteName = builder.resourceRouteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return ownerUserId
     */
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceDomain
     */
    public String getResourceDomain() {
        return this.resourceDomain;
    }

    /**
     * @return resourceFunction
     */
    public String getResourceFunction() {
        return this.resourceFunction;
    }

    /**
     * @return resourceInstanceId
     */
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceProduct
     */
    public String getResourceProduct() {
        return this.resourceProduct;
    }

    /**
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return resourceRouteName
     */
    public String getResourceRouteName() {
        return this.resourceRouteName;
    }

    public static final class Builder extends Request.Builder<DescribeCloudResourcesRequest, Builder> {
        private String instanceId; 
        private String ownerUserId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String resourceDomain; 
        private String resourceFunction; 
        private String resourceInstanceId; 
        private String resourceManagerResourceGroupId; 
        private String resourceName; 
        private String resourceProduct; 
        private String resourceRegionId; 
        private String resourceRouteName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudResourcesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ownerUserId = request.ownerUserId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceDomain = request.resourceDomain;
            this.resourceFunction = request.resourceFunction;
            this.resourceInstanceId = request.resourceInstanceId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceName = request.resourceName;
            this.resourceProduct = request.resourceProduct;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceRouteName = request.resourceRouteName;
        } 

        /**
         * The ID of the WAF instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to query the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account to which the resource belongs.
         */
        public Builder ownerUserId(String ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: **10**.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region in which the WAF instance is deployed. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: Chinese mainland.
         * *   **ap-southeast-1**: outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The domain name. You can use this parameter if you set ResourceProduct to fc or sae.
         */
        public Builder resourceDomain(String resourceDomain) {
            this.putQueryParameter("ResourceDomain", resourceDomain);
            this.resourceDomain = resourceDomain;
            return this;
        }

        /**
         * The function name. You can use this parameter if you set ResourceProduct to fc.
         */
        public Builder resourceFunction(String resourceFunction) {
            this.putQueryParameter("ResourceFunction", resourceFunction);
            this.resourceFunction = resourceFunction;
            return this;
        }

        /**
         * The ID of the resource.
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.putQueryParameter("ResourceInstanceId", resourceInstanceId);
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The name of the resource.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * The cloud service to which the resource belongs. Valid values:
         * <p>
         * 
         * *   **alb**: Application Load Balancer (ALB).
         * *   **mse**: Microservices Engine (MSE).
         * *   **fc**: Function Compute.
         * *   **sae**: Serverless App Engine (SAE).
         * 
         * >  Different cloud services are available in different regions. The specified cloud service must be available in the specified region.
         */
        public Builder resourceProduct(String resourceProduct) {
            this.putQueryParameter("ResourceProduct", resourceProduct);
            this.resourceProduct = resourceProduct;
            return this;
        }

        /**
         * The region ID of the resource. For information about region IDs, see the following table.
         * <p>
         * 
         * >  Different cloud services are available in different regions. The specified cloud service must be available in the specified region.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * The route name. You can use this parameter if you set ResourceProduct to mse.
         */
        public Builder resourceRouteName(String resourceRouteName) {
            this.putQueryParameter("ResourceRouteName", resourceRouteName);
            this.resourceRouteName = resourceRouteName;
            return this;
        }

        @Override
        public DescribeCloudResourcesRequest build() {
            return new DescribeCloudResourcesRequest(this);
        } 

    } 

}
