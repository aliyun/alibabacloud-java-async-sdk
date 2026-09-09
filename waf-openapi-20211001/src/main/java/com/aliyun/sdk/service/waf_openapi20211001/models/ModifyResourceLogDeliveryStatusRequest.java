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
 * {@link ModifyResourceLogDeliveryStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyResourceLogDeliveryStatusRequest</p>
 */
public class ModifyResourceLogDeliveryStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeliveryName")
    private String deliveryName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean status;

    private ModifyResourceLogDeliveryStatusRequest(Builder builder) {
        super(builder);
        this.deliveryName = builder.deliveryName;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceLogDeliveryStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryName
     */
    public String getDeliveryName() {
        return this.deliveryName;
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
     * @return resource
     */
    public String getResource() {
        return this.resource;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyResourceLogDeliveryStatusRequest, Builder> {
        private String deliveryName; 
        private String instanceId; 
        private String regionId; 
        private String resource; 
        private String resourceManagerResourceGroupId; 
        private Boolean status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyResourceLogDeliveryStatusRequest request) {
            super(request);
            this.deliveryName = request.deliveryName;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.status = request.status;
        } 

        /**
         * <p>The name of the log delivery configuration.</p>
         * <blockquote>
         * <p>This parameter is required when you enable log delivery by setting <strong>Status</strong> to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>export-kafka</p>
         */
        public Builder deliveryName(String deliveryName) {
            this.putQueryParameter("DeliveryName", deliveryName);
            this.deliveryName = deliveryName;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-uqm35*****</p>
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
         * <p>The protected object for which you want to modify the log delivery status.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test.waf.com-waf</p>
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
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
         * <p>Indicates whether to enable log delivery for the protected object. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables log delivery.</p>
         * </li>
         * <li><p><strong>false</strong>: disables log delivery.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ModifyResourceLogDeliveryStatusRequest build() {
            return new ModifyResourceLogDeliveryStatusRequest(this);
        } 

    } 

}
