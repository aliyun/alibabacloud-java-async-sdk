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
 * {@link DescribeDefenseTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefenseTemplatesRequest</p>
 */
public class DescribeDefenseTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseScene")
    private String defenseScene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefenseSubScene")
    private String defenseSubScene;

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
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resource")
    private String resource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private Long templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateIds")
    private String templateIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private DescribeDefenseTemplatesRequest(Builder builder) {
        super(builder);
        this.defenseScene = builder.defenseScene;
        this.defenseSubScene = builder.defenseSubScene;
        this.instanceId = builder.instanceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.resource = builder.resource;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.resourceType = builder.resourceType;
        this.templateId = builder.templateId;
        this.templateIds = builder.templateIds;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDefenseTemplatesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defenseScene
     */
    public String getDefenseScene() {
        return this.defenseScene;
    }

    /**
     * @return defenseSubScene
     */
    public String getDefenseSubScene() {
        return this.defenseSubScene;
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
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateIds
     */
    public String getTemplateIds() {
        return this.templateIds;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<DescribeDefenseTemplatesRequest, Builder> {
        private String defenseScene; 
        private String defenseSubScene; 
        private String instanceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String resource; 
        private String resourceManagerResourceGroupId; 
        private String resourceType; 
        private Long templateId; 
        private String templateIds; 
        private String templateName; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDefenseTemplatesRequest request) {
            super(request);
            this.defenseScene = request.defenseScene;
            this.defenseSubScene = request.defenseSubScene;
            this.instanceId = request.instanceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.resource = request.resource;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.resourceType = request.resourceType;
            this.templateId = request.templateId;
            this.templateIds = request.templateIds;
            this.templateName = request.templateName;
            this.templateType = request.templateType;
        } 

        /**
         * <p>The protection scenario. For more information, see the <strong>DefenseScene</strong> parameter in <a href="https://help.aliyun.com/document_detail/461421.html">CreateDefenseRule</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>region_block</p>
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * <p>The sub-scenario of the protection template. Valid values:</p>
         * <ul>
         * <li><strong>web</strong>: bot management web protection scenario template.</li>
         * <li><strong>app</strong>: bot management app protection scenario template.</li>
         * <li><strong>basic</strong>: bot management basic protection template.</li>
         * <li><strong>bot_custom_acl</strong>: bot management advanced custom rule protection template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>basic</p>
         */
        public Builder defenseSubScene(String defenseSubScene) {
            this.putQueryParameter("DefenseSubScene", defenseSubScene);
            this.defenseSubScene = defenseSubScene;
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
         * <p>waf_v3prepaid_public_cn-pe33b****03</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The page number to return in a paging request. Default value: <strong>1</strong>.</p>
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
         * <p>The number of entries per page when paging. Default value: <strong>20</strong>.</p>
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
         * <p>The region where the WAF instance is deployed. Valid values:</p>
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
         * <p>The name of the protected object, the name of the protected object group, or the ID of the protected asset.</p>
         * <blockquote>
         * <p>This parameter is used together with the ResourceType parameter. Both parameters must have values for filtering to take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ruiqiu.cc-ecs</p>
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
         * <p>rg-acfmvyknl****fa</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The type of the protected resource.</p>
         * <blockquote>
         * <p>This parameter is used together with the Resource parameter. Both parameters must have values for filtering to take effect.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>single</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The ID of the protection template.</p>
         * 
         * <strong>example:</strong>
         * <p>39395</p>
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The IDs of the protection templates to query. You can specify this parameter to query the protected resources associated with multiple protection templates. Separate multiple template IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>189731,189539,189538,189531,189540,189542,189541</p>
         */
        public Builder templateIds(String templateIds) {
            this.putQueryParameter("TemplateIds", templateIds);
            this.templateIds = templateIds;
            return this;
        }

        /**
         * <p>The name of the protection template to query.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The templatetype of the protection template. Valid values:</p>
         * <ul>
         * <li><strong>user_default</strong>: default protection.</li>
         * <li><strong>user_custom</strong>: custom protection.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>user_default</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public DescribeDefenseTemplatesRequest build() {
            return new DescribeDefenseTemplatesRequest(this);
        } 

    } 

}
