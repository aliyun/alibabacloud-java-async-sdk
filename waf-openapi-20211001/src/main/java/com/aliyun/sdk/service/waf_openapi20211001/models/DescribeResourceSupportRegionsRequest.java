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
 * {@link DescribeResourceSupportRegionsRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceSupportRegionsRequest</p>
 */
public class DescribeResourceSupportRegionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceProduct")
    private String resourceProduct;

    private DescribeResourceSupportRegionsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceProduct = builder.resourceProduct;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceSupportRegionsRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DescribeResourceSupportRegionsRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String resourceProduct; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceSupportRegionsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceProduct = request.resourceProduct;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>You can call <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> to query the ID of the current WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_cdnsdf3****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>The Alibaba Cloud resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzpks****kdjq</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The cloud product to which the resource belongs. By default, instances of ALB, MSE, FC, and SAE products are returned. Valid values:</p>
         * <ul>
         * <li><p><strong>alb</strong>: ALB.</p>
         * </li>
         * <li><p><strong>mse</strong>: MSE.</p>
         * </li>
         * <li><p><strong>fc</strong>: FC.</p>
         * </li>
         * <li><p><strong>sae</strong>: SAE.</p>
         * </li>
         * <li><p><strong>ecs</strong>: ECS.</p>
         * </li>
         * <li><p><strong>clb4</strong>: CLB (TCP).</p>
         * </li>
         * <li><p><strong>clb7</strong>: CLB (HTTP/HTTPS).</p>
         * </li>
         * <li><p><strong>apig</strong>: APIG.</p>
         * </li>
         * <li><p><strong>nlb</strong>: NLB.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>Each product supports different regions. If you specify a product filter, refer to the regions supported by the product. Otherwise, the filtering may fail.</p>
         * </blockquote>
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
        public DescribeResourceSupportRegionsRequest build() {
            return new DescribeResourceSupportRegionsRequest(this);
        } 

    } 

}
