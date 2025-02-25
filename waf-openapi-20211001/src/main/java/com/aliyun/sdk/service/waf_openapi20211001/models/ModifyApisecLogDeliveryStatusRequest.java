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
 * {@link ModifyApisecLogDeliveryStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyApisecLogDeliveryStatusRequest</p>
 */
public class ModifyApisecLogDeliveryStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssertKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assertKey;

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
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean status;

    private ModifyApisecLogDeliveryStatusRequest(Builder builder) {
        super(builder);
        this.assertKey = builder.assertKey;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApisecLogDeliveryStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return assertKey
     */
    public String getAssertKey() {
        return this.assertKey;
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
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ModifyApisecLogDeliveryStatusRequest, Builder> {
        private String assertKey; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Boolean status; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApisecLogDeliveryStatusRequest request) {
            super(request);
            this.assertKey = request.assertKey;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.status = request.status;
        } 

        /**
         * <p>The type of the log subscription. Valid values:</p>
         * <ul>
         * <li><strong>risk</strong>: risk information.</li>
         * <li><strong>event</strong>: attack event information.</li>
         * <li><strong>asset</strong>: asset information.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>risk</p>
         */
        public Builder assertKey(String assertKey) {
            this.putQueryParameter("AssertKey", assertKey);
            this.assertKey = assertKey;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v3_public_cn-uqm2z****0a</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region where the WAF instance is deployed. Valid values:</p>
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
         * <p>The status of API security log subscription. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
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
        public ModifyApisecLogDeliveryStatusRequest build() {
            return new ModifyApisecLogDeliveryStatusRequest(this);
        } 

    } 

}
