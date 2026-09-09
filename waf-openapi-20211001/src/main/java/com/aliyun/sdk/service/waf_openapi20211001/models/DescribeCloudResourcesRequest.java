// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
    private String resourceInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceName")
    @Deprecated
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
        this.resourceInstanceName = builder.resourceInstanceName;
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
     * @return resourceInstanceName
     */
    public String getResourceInstanceName() {
        return this.resourceInstanceName;
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
        private String resourceInstanceName; 
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
            this.resourceInstanceName = request.resourceInstanceName;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceName = request.resourceName;
            this.resourceProduct = request.resourceProduct;
            this.resourceRegionId = request.resourceRegionId;
            this.resourceRouteName = request.resourceRouteName;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v3prepaid_public_cn-lbj****cn0c</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The UID of the account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>11769793******</p>
         */
        public Builder ownerUserId(String ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The region where the WAF instance resides. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
         * </li>
         * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The domain name of the resource. This parameter is available when you query FC or SAE resources.</p>
         * 
         * <strong>example:</strong>
         * <p>fc-domain-test</p>
         */
        public Builder resourceDomain(String resourceDomain) {
            this.putQueryParameter("ResourceDomain", resourceDomain);
            this.resourceDomain = resourceDomain;
            return this;
        }

        /**
         * <p>The name of the function. This parameter is available when you query FC resources.</p>
         * 
         * <strong>example:</strong>
         * <p>fc-test</p>
         */
        public Builder resourceFunction(String resourceFunction) {
            this.putQueryParameter("ResourceFunction", resourceFunction);
            this.resourceFunction = resourceFunction;
            return this;
        }

        /**
         * <p>The ID of the resource instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-43glijk0fr****gths</p>
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.putQueryParameter("ResourceInstanceId", resourceInstanceId);
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * <p>The name of the instance that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>test-name</p>
         */
        public Builder resourceInstanceName(String resourceInstanceName) {
            this.putQueryParameter("ResourceInstanceName", resourceInstanceName);
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4gh****wela</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The name of the resource instance.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-name</p>
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The cloud service to which the resource belongs. By default, instances of Application Load Balancer (ALB), Microservices Engine (MSE), Function Compute (FC), and Serverless App Engine (SAE) are returned. Valid values:</p>
         * <ul>
         * <li><p><strong>alb</strong>: ALB</p>
         * </li>
         * <li><p><strong>mse</strong>: MSE</p>
         * </li>
         * <li><p><strong>fc</strong>: FC</p>
         * </li>
         * <li><p><strong>sae</strong>: SAE</p>
         * </li>
         * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS)</p>
         * </li>
         * <li><p><strong>clb4</strong>: Classic Load Balancer (CLB) that uses TCP</p>
         * </li>
         * <li><p><strong>clb7</strong>: CLB that uses HTTP or HTTPS</p>
         * </li>
         * <li><p><strong>nlb</strong>: Network Load Balancer (NLB)</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Each cloud service supports different regions. If you specify this parameter, make sure the region you specify for the ResourceRegionId parameter supports this service. Otherwise, the query may fail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>alb</p>
         */
        public Builder resourceProduct(String resourceProduct) {
            this.putQueryParameter("ResourceProduct", resourceProduct);
            this.resourceProduct = resourceProduct;
            return this;
        }

        /**
         * <p>The ID of the region where the resource resides. For more information, see the &quot;Regions and supported products&quot; section in this topic.</p>
         * <blockquote>
         * <p>Each cloud service supports different regions. If you specify the ResourceProduct parameter, make sure the region you specify for this parameter supports that service. Otherwise, the query may fail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * <p>The name of the route. This parameter is available when you query MSE resources.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-default-traffic</p>
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
