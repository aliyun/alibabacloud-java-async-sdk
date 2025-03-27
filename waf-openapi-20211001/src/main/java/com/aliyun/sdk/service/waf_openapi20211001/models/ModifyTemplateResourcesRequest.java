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
 * {@link ModifyTemplateResourcesRequest} extends {@link RequestModel}
 *
 * <p>ModifyTemplateResourcesRequest</p>
 */
public class ModifyTemplateResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindResourceGroups")
    private java.util.List<String> bindResourceGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindResources")
    private java.util.List<String> bindResources;

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
    private java.util.List<String> unbindResourceGroups;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnbindResources")
    private java.util.List<String> unbindResources;

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
    public java.util.List<String> getBindResourceGroups() {
        return this.bindResourceGroups;
    }

    /**
     * @return bindResources
     */
    public java.util.List<String> getBindResources() {
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
    public java.util.List<String> getUnbindResourceGroups() {
        return this.unbindResourceGroups;
    }

    /**
     * @return unbindResources
     */
    public java.util.List<String> getUnbindResources() {
        return this.unbindResources;
    }

    public static final class Builder extends Request.Builder<ModifyTemplateResourcesRequest, Builder> {
        private java.util.List<String> bindResourceGroups; 
        private java.util.List<String> bindResources; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private Long templateId; 
        private java.util.List<String> unbindResourceGroups; 
        private java.util.List<String> unbindResources; 

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
         * <p>The protected object groups that you want to associate with the template. Specify the value in the [<strong>&quot;group1&quot;,&quot;group2&quot;,...</strong>] format.</p>
         */
        public Builder bindResourceGroups(java.util.List<String> bindResourceGroups) {
            this.putQueryParameter("BindResourceGroups", bindResourceGroups);
            this.bindResourceGroups = bindResourceGroups;
            return this;
        }

        /**
         * <p>The protected objects that you want to associate with the template. Specify the value in the [<strong>&quot;XX1&quot;,&quot;XX2&quot;,...</strong>] format.</p>
         */
        public Builder bindResources(java.util.List<String> bindResources) {
            this.putQueryParameter("BindResources", bindResources);
            this.bindResources = bindResources;
            return this;
        }

        /**
         * <p>The ID of the Web Application Firewall (WAF) instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to obtain the ID of the WAF instance.</p>
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
         * <p>The region ID of the WAF instance. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland</li>
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
         * <p>The ID of the protection rule template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2291</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The protected object groups that you want to disassociate from the template. Specify the value in the [<strong>&quot;group1&quot;,&quot;group2&quot;,...</strong>] format.</p>
         */
        public Builder unbindResourceGroups(java.util.List<String> unbindResourceGroups) {
            this.putQueryParameter("UnbindResourceGroups", unbindResourceGroups);
            this.unbindResourceGroups = unbindResourceGroups;
            return this;
        }

        /**
         * <p>The protected objects that you want to disassociate from the template. Specify the value in the [<strong>&quot;XX1&quot;,&quot;XX2&quot;,...</strong>] format.</p>
         */
        public Builder unbindResources(java.util.List<String> unbindResources) {
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
