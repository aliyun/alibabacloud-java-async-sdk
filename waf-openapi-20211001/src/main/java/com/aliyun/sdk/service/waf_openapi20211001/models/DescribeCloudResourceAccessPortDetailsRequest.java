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
 * {@link DescribeCloudResourceAccessPortDetailsRequest} extends {@link RequestModel}
 *
 * <p>DescribeCloudResourceAccessPortDetailsRequest</p>
 */
public class DescribeCloudResourceAccessPortDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Port")
    private String port;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceProduct")
    private String resourceProduct;

    private DescribeCloudResourceAccessPortDetailsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.port = builder.port;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.resourceInstanceId = builder.resourceInstanceId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceProduct = builder.resourceProduct;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudResourceAccessPortDetailsRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return port
     */
    public String getPort() {
        return this.port;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
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

    public static final class Builder extends Request.Builder<DescribeCloudResourceAccessPortDetailsRequest, Builder> {
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String port; 
        private String protocol; 
        private String regionId; 
        private String resourceInstanceId; 
        private String resourceManagerResourceGroupId; 
        private String resourceProduct; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCloudResourceAccessPortDetailsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.port = request.port;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.resourceInstanceId = request.resourceInstanceId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceProduct = request.resourceProduct;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-tl32ast****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
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
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The port of the cloud service that is added to WAF.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder port(String port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        /**
         * <p>The type of the protocol. Valid values:</p>
         * <ul>
         * <li><strong>http</strong></li>
         * <li><strong>https</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>https</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        /**
         * <p>The region in which the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: the Chinese mainland.</li>
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
         * <p>The instance ID of the resource.</p>
         * <p>This parameter is required.</p>
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
         * <p>The cloud service. Valid values:</p>
         * <ul>
         * <li><strong>clb4</strong>: Layer 4 CLB.</li>
         * <li><strong>clb7</strong>: Layer 7 CLB.</li>
         * <li><strong>ecs</strong>: ECS.</li>
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

        @Override
        public DescribeCloudResourceAccessPortDetailsRequest build() {
            return new DescribeCloudResourceAccessPortDetailsRequest(this);
        } 

    } 

}
