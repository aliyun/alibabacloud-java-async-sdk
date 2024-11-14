// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyApisecStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyApisecStatusRequest</p>
 */
public class ModifyApisecStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApisecStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer apisecStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroups")
    private String resourceGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    private String resources;

    private ModifyApisecStatusRequest(Builder builder) {
        super(builder);
        this.apisecStatus = builder.apisecStatus;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceGroups = builder.resourceGroups;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApisecStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apisecStatus
     */
    public Integer getApisecStatus() {
        return this.apisecStatus;
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
     * @return resourceGroups
     */
    public String getResourceGroups() {
        return this.resourceGroups;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<ModifyApisecStatusRequest, Builder> {
        private Integer apisecStatus; 
        private String instanceId; 
        private String regionId; 
        private String resourceGroups; 
        private String resourceManagerResourceGroupId; 
        private String resources; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApisecStatusRequest request) {
            super(request);
            this.apisecStatus = request.apisecStatus;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceGroups = request.resourceGroups;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resources = request.resources;
        } 

        /**
         * <p>The status of the API security module. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled</li>
         * <li><strong>0</strong>: disabled</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder apisecStatus(Integer apisecStatus) {
            this.putQueryParameter("ApisecStatus", apisecStatus);
            this.apisecStatus = apisecStatus;
            return this;
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
         * <p>The region in which the Web Application Firewall (WAF) instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland</li>
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
         * <p>The name of the protected object group to which the protected object belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        public Builder resourceGroups(String resourceGroups) {
            this.putQueryParameter("ResourceGroups", resourceGroups);
            this.resourceGroups = resourceGroups;
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
         * <p>The name of the protected object.</p>
         * 
         * <strong>example:</strong>
         * <p>alb-wewbb23dfset***</p>
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public ModifyApisecStatusRequest build() {
            return new ModifyApisecStatusRequest(this);
        } 

    } 

}
