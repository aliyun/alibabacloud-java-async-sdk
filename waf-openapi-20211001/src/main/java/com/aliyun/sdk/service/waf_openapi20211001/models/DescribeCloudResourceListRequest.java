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
 * {@link DescribeCloudResourceListRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudResourceListRequest</p>
 */
public class DescribeCloudResourceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudResourceId")
    private String cloudResourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerUserId")
    private String ownerUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceDomain")
    private String resourceDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
    private String resourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceProduct")
    private String resourceProduct;

    private DescribeCloudResourceListRequest(Builder builder) {
        super(builder);
        this.cloudResourceId = builder.cloudResourceId;
        this.instanceId = builder.instanceId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.ownerUserId = builder.ownerUserId;
        this.port = builder.port;
        this.regionId = builder.regionId;
        this.resourceDomain = builder.resourceDomain;
        this.resourceInstanceId = builder.resourceInstanceId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceProduct = builder.resourceProduct;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudResourceListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudResourceId
     */
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return ownerUserId
     */
    public String getOwnerUserId() {
        return this.ownerUserId;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
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
     * @return resourceProduct
     */
    public String getResourceProduct() {
        return this.resourceProduct;
    }

    public static final class Builder extends Request.Builder<DescribeCloudResourceListRequest, Builder> {
        private String cloudResourceId; 
        private String instanceId; 
        private Integer maxResults; 
        private String nextToken; 
        private String ownerUserId; 
        private String port; 
        private String regionId; 
        private String resourceDomain; 
        private String resourceInstanceId; 
        private String resourceManagerResourceGroupId; 
        private String resourceProduct; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudResourceListRequest request) {
            super(request);
            this.cloudResourceId = request.cloudResourceId;
            this.instanceId = request.instanceId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.ownerUserId = request.ownerUserId;
            this.port = request.port;
            this.regionId = request.regionId;
            this.resourceDomain = request.resourceDomain;
            this.resourceInstanceId = request.resourceInstanceId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceProduct = request.resourceProduct;
        } 

        /**
         * <p>The ID of the connected resource, which is automatically generated by WAF in cloud native mode.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/2839876.html">CreateCloudResource</a> to connect a resource and then view the resource ID in the response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdlsd********81e22-80-ecs</p>
         */
        public Builder cloudResourceId(String cloudResourceId) {
            this.putQueryParameter("CloudResourceId", cloudResourceId);
            this.cloudResourceId = cloudResourceId;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_elasticity-cn-0xldbqt****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of entries per page in a paged query. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page. If a value is returned for this parameter, the next page exists.</p>
         * <blockquote>
         * <p>If this parameter has a return value, the next page exists. You can use the returned <strong>NextToken</strong> value as a request parameter to obtain the next page of data. Repeat this process until no value is returned, which indicates that all data has been retrieved.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The UID of the resource ownership user.</p>
         * 
         * <strong>example:</strong>
         * <p>1111111111</p>
         */
        public Builder ownerUserId(String ownerUserId) {
            this.putQueryParameter("OwnerUserId", ownerUserId);
            this.ownerUserId = ownerUserId;
            return this;
        }

        /**
         * <p>The port of the cloud service connected to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
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
         * <p>The domain name connected to WAF.</p>
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
         * <p>The instance ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>i-8vbdlsd********81e22</p>
         */
        public Builder resourceInstanceId(String resourceInstanceId) {
            this.putQueryParameter("ResourceInstanceId", resourceInstanceId);
            this.resourceInstanceId = resourceInstanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The cloud service to which the resource belongs. Valid values:</p>
         * <ul>
         * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
         * </li>
         * <li><p><strong>mse</strong>: Microservices Engine (MSE).</p>
         * </li>
         * <li><p><strong>fc</strong>: Function Compute (FC).</p>
         * </li>
         * <li><p><strong>sae</strong>: Serverless App Engine (SAE).</p>
         * </li>
         * <li><p><strong>ecs</strong>: Elastic Compute Service (ECS).</p>
         * </li>
         * <li><p><strong>clb4</strong>: Classic Load Balancer (CLB) (TCP).</p>
         * </li>
         * <li><p><strong>clb7</strong>: Classic Load Balancer (CLB) (HTTP/HTTPS).</p>
         * </li>
         * <li><p><strong>apig</strong>: API Gateway (APIG).</p>
         * </li>
         * <li><p><strong>nlb</strong>: Network Load Balancer (NLB).</p>
         * </li>
         * <li><p><strong>ddos</strong>: Anti-DDoS.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Different products are supported in different regions. If you specify a value for this parameter, make sure that the product is supported in the specified region. Otherwise, the query may fail.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder resourceProduct(String resourceProduct) {
            this.putQueryParameter("ResourceProduct", resourceProduct);
            this.resourceProduct = resourceProduct;
            return this;
        }

        @Override
        public DescribeCloudResourceListRequest build() {
            return new DescribeCloudResourceListRequest(this);
        } 

    } 

}
