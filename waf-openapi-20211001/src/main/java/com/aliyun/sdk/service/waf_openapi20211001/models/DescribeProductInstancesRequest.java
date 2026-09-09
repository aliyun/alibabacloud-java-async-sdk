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
    @com.aliyun.core.annotation.NameInMap("ResourceDomain")
    private String resourceDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceAccessStatus")
    private String resourceInstanceAccessStatus;

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
        this.resourceDomain = builder.resourceDomain;
        this.resourceInstanceAccessStatus = builder.resourceInstanceAccessStatus;
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
     * @return resourceDomain
     */
    public String getResourceDomain() {
        return this.resourceDomain;
    }

    /**
     * @return resourceInstanceAccessStatus
     */
    public String getResourceInstanceAccessStatus() {
        return this.resourceInstanceAccessStatus;
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
        private String resourceDomain; 
        private String resourceInstanceAccessStatus; 
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
            this.resourceDomain = request.resourceDomain;
            this.resourceInstanceAccessStatus = request.resourceInstanceAccessStatus;
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
         * <p>Instance ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query instance ID of the current WAF instance.</p>
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
         * <p>The UID of the resource ownership user.</p>
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
         * <p>The number of entries per page when paging. Default value: <strong>10</strong>.</p>
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
         * <p>The domain name that is added to WAF.</p>
         * <blockquote>
         * <p>This parameter is supported only when the cloud service type is ddos.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.c**sw.net">www.c**sw.net</a></p>
         */
        public Builder resourceDomain(String resourceDomain) {
            this.putQueryParameter("ResourceDomain", resourceDomain);
            this.resourceDomain = resourceDomain;
            return this;
        }

        /**
         * <p>The WAF protection status.</p>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        public Builder resourceInstanceAccessStatus(String resourceInstanceAccessStatus) {
            this.putQueryParameter("ResourceInstanceAccessStatus", resourceInstanceAccessStatus);
            this.resourceInstanceAccessStatus = resourceInstanceAccessStatus;
            return this;
        }

        /**
         * <p>The instance ID of the cloud service.</p>
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
         * <p>The public IP address of the cloud service.</p>
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
         * <p>The Alibaba Cloud resource group ID.</p>
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
         * <p>The instance name of the cloud service.</p>
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
         * <p>The type of the cloud service. Valid values:</p>
         * <ul>
         * <li><p><strong>clb4</strong>: Layer 4 CLB.</p>
         * </li>
         * <li><p><strong>clb7</strong>: Layer 7 CLB.</p>
         * </li>
         * <li><p><strong>ecs</strong>: ECS.</p>
         * </li>
         * <li><p><strong>nlb</strong>: NLB.</p>
         * </li>
         * <li><p><strong>ddos</strong>: Anti-DDoS.</p>
         * </li>
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
         * <p>The region ID of the cloud service. Valid values:</p>
         * <ul>
         * <li><p><strong>cn-chengdu</strong>: China Southwest 1 (Chengdu).</p>
         * </li>
         * <li><p><strong>cn-beijing</strong>: China North 2 (Beijing).</p>
         * </li>
         * <li><p><strong>cn-zhangjiakou</strong>: China North 3 (Zhangjiakou).</p>
         * </li>
         * <li><p><strong>cn-hangzhou</strong>: China East 1 (Hangzhou).</p>
         * </li>
         * <li><p><strong>cn-shanghai</strong>: China East 2 (Shanghai).</p>
         * </li>
         * <li><p><strong>cn-shenzhen</strong>: China South 1 (Shenzhen).</p>
         * </li>
         * <li><p><strong>cn-qingdao</strong>: China North 1 (Qingdao).</p>
         * </li>
         * <li><p><strong>cn-hongkong</strong>: Hong Kong (China).</p>
         * </li>
         * <li><p><strong>ap-southeast-3</strong>: Malaysia (Kuala Lumpur).</p>
         * </li>
         * <li><p><strong>ap-southeast-5</strong>: Indonesia (Jakarta).</p>
         * </li>
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
