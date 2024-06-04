// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTemplateResourcesRequest} extends {@link RequestModel}
 *
 * <p>ModifyTemplateResourcesRequest</p>
 */
public class ModifyTemplateResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindResourceGroups")
    private java.util.List < String > bindResourceGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindResources")
    private java.util.List < String > bindResources;

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
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnbindResourceGroups")
    private java.util.List < String > unbindResourceGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnbindResources")
    private java.util.List < String > unbindResources;

    private ModifyTemplateResourcesRequest(Builder builder) {
        super(builder);
        this.bindResourceGroups = builder.bindResourceGroups;
        this.bindResources = builder.bindResources;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.templateId = builder.templateId;
        this.unbindResourceGroups = builder.unbindResourceGroups;
        this.unbindResources = builder.unbindResources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTemplateResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bindResourceGroups
     */
    public java.util.List < String > getBindResourceGroups() {
        return this.bindResourceGroups;
    }

    /**
     * @return bindResources
     */
    public java.util.List < String > getBindResources() {
        return this.bindResources;
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
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return unbindResourceGroups
     */
    public java.util.List < String > getUnbindResourceGroups() {
        return this.unbindResourceGroups;
    }

    /**
     * @return unbindResources
     */
    public java.util.List < String > getUnbindResources() {
        return this.unbindResources;
    }

    public static final class Builder extends Request.Builder<ModifyTemplateResourcesRequest, Builder> {
        private java.util.List < String > bindResourceGroups; 
        private java.util.List < String > bindResources; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long templateId; 
        private java.util.List < String > unbindResourceGroups; 
        private java.util.List < String > unbindResources; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTemplateResourcesRequest request) {
            super(request);
            this.bindResourceGroups = request.bindResourceGroups;
            this.bindResources = request.bindResources;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.templateId = request.templateId;
            this.unbindResourceGroups = request.unbindResourceGroups;
            this.unbindResources = request.unbindResources;
        } 

        /**
         * The protected object groups that you want to associate with the protection rule template. Specify the value of this parameter in the \["group1","group2",...] format.
         */
        public Builder bindResourceGroups(java.util.List < String > bindResourceGroups) {
            this.putQueryParameter("BindResourceGroups", bindResourceGroups);
            this.bindResourceGroups = bindResourceGroups;
            return this;
        }

        /**
         * The protected objects that you want to associate with the protection rule template. Specify the value of this parameter in the \["XX1","XX2",...] format.
         */
        public Builder bindResources(java.util.List < String > bindResources) {
            this.putQueryParameter("BindResources", bindResources);
            this.bindResources = bindResources;
            return this;
        }

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region where the WAF instance resides. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou:** the Chinese mainland.
         * *   **ap-southeast-1:** outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The ID of the protection rule template.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The protected object groups that you want to disassociate from the protection rule template. Specify the value of this parameter in the \["group1","group2",...] format.
         */
        public Builder unbindResourceGroups(java.util.List < String > unbindResourceGroups) {
            this.putQueryParameter("UnbindResourceGroups", unbindResourceGroups);
            this.unbindResourceGroups = unbindResourceGroups;
            return this;
        }

        /**
         * The protected objects that you want to disassociate from the protection rule template. Specify the value of this parameter in the \["XX1","XX2",...] format.
         */
        public Builder unbindResources(java.util.List < String > unbindResources) {
            this.putQueryParameter("UnbindResources", unbindResources);
            this.unbindResources = unbindResources;
            return this;
        }

        @Override
        public ModifyTemplateResourcesRequest build() {
            return new ModifyTemplateResourcesRequest(this);
        } 

    } 

}
