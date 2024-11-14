// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeProductInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeProductInstancesRequest</p>
 */
public class DescribeProductInstancesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
    private String resourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceIp")
    private String resourceInstanceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceName")
    private String resourceInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIp")
    @Deprecated
    private String resourceIp;

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

    private DescribeProductInstancesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.ownerUserId = builder.ownerUserId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resourceInstanceId = builder.resourceInstanceId;
        this.resourceInstanceIp = builder.resourceInstanceIp;
        this.resourceInstanceName = builder.resourceInstanceName;
        this.resourceIp = builder.resourceIp;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceName = builder.resourceName;
        this.resourceProduct = builder.resourceProduct;
        this.resourceRegionId = builder.resourceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeProductInstancesRequest create() {
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
     * @return resourceInstanceId
     */
    public String getResourceInstanceId() {
        return this.resourceInstanceId;
    }

    /**
     * @return resourceInstanceIp
     */
    public String getResourceInstanceIp() {
        return this.resourceInstanceIp;
    }

    /**
     * @return resourceInstanceName
     */
    public String getResourceInstanceName() {
        return this.resourceInstanceName;
    }

    /**
     * @return resourceIp
     */
    public String getResourceIp() {
        return this.resourceIp;
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

    public static final class Builder extends Request.Builder<DescribeProductInstancesRequest, Builder> {
        private String instanceId; 
        private String ownerUserId; 
        private Long pageNumber; 
        private Long pageSize; 
        private String regionId; 
        private String resourceInstanceId; 
        private String resourceInstanceIp; 
        private String resourceInstanceName; 
        private String resourceIp; 
        private String resourceManagerResourceGroupId; 
        private String resourceName; 
        private String resourceProduct; 
        private String resourceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeProductInstancesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.ownerUserId = request.ownerUserId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resourceInstanceId = request.resourceInstanceId;
            this.resourceInstanceIp = request.resourceInstanceIp;
            this.resourceInstanceName = request.resourceInstanceName;
            this.resourceIp = request.resourceIp;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceName = request.resourceName;
            this.resourceProduct = request.resourceProduct;
            this.resourceRegionId = request.resourceRegionId;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v3prepaid_public_cn-zxu****9d02</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the resource belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1704********9107</p>
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
         * <p>The region in which the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
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
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-2zeugkfj81jvo****4tqm</p>
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.putQueryParameter("ResourceInstanceId", resourceInstanceId);
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * <p>The IP address of the instance that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>1.X.X.1</p>
         */
        public Builder resourceInstanceIp(String resourceInstanceIp) {
            this.putQueryParameter("ResourceInstanceIp", resourceInstanceIp);
            this.resourceInstanceIp = resourceInstanceIp;
            return this;
        }

        /**
         * <p>The name of the instance that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>demoInstanceName</p>
         */
        public Builder resourceInstanceName(String resourceInstanceName) {
            this.putQueryParameter("ResourceInstanceName", resourceInstanceName);
            this.resourceInstanceName = resourceInstanceName;
            return this;
        }

        /**
         * <p>The public IP address of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.X.X.1</p>
         */
        public Builder resourceIp(String resourceIp) {
            this.putQueryParameter("ResourceIp", resourceIp);
            this.resourceIp = resourceIp;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz6ql****5uzi</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The name of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleResourceName</p>
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * <p>The cloud service to which the instance belongs. Valid values:</p>
         * <ul>
         * <li><strong>clb4</strong>: Layer 4 Classic Load Balancer (CLB).</li>
         * <li><strong>clb7</strong>: Layer 7 CLB.</li>
         * <li><strong>ecs</strong>: Elastic Compute Service (ECS).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clb7</p>
         */
        public Builder resourceProduct(String resourceProduct) {
            this.putQueryParameter("ResourceProduct", resourceProduct);
            this.resourceProduct = resourceProduct;
            return this;
        }

        /**
         * <p>The region ID of the instance. Valid values:</p>
         * <ul>
         * <li><strong>cn-chengdu</strong>: China (Chengdu).</li>
         * <li><strong>cn-beijing</strong>: China (Beijing).</li>
         * <li><strong>cn-zhangjiakou</strong>: China (Zhangjiakou).</li>
         * <li><strong>cn-hangzhou</strong>: China (Hangzhou).</li>
         * <li><strong>cn-shanghai</strong>: China (Shanghai).</li>
         * <li><strong>cn-shenzhen</strong>: China (Shenzhen).</li>
         * <li><strong>cn-qingdao</strong>: China (Qingdao).</li>
         * <li><strong>cn-hongkong</strong>: China (Hong Kong).</li>
         * <li><strong>ap-southeast-3</strong>: Malaysia (Kuala Lumpur).</li>
         * <li><strong>ap-southeast-5</strong>: Indonesia (Jakarta).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        @Override
        public DescribeProductInstancesRequest build() {
            return new DescribeProductInstancesRequest(this);
        } 

    } 

}
