// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDefenseTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DescribeDefenseTemplatesRequest</p>
 */
public class DescribeDefenseTemplatesRequest extends Request {
    @Query
    @NameInMap("DefenseScene")
    private String defenseScene;

    @Query
    @NameInMap("DefenseSubScene")
    private String defenseSubScene;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Resource")
    private String resource;

    @Query
    @NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @Query
    @NameInMap("ResourceType")
    private String resourceType;

    @Query
    @NameInMap("TemplateId")
    private Long templateId;

    @Query
    @NameInMap("TemplateType")
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
            this.templateType = request.templateType;
        } 

        /**
         * The scenario in which the protection template is used.
         * <p>
         * 
         * *   **waf_group**: basic protection.
         * *   **antiscan**: scan protection.
         * *   **ip_blacklist**: IP address blacklist.
         * *   **custom_acl**: custom rule.
         * *   **whitelist**: whitelist.
         * *   **region_block**: region blacklist.
         * *   **custom_response**: custom response.
         * *   **cc**: HTTP flood protection.
         * *   **tamperproof**: website tamper-proofing.
         * *   **dlp**: data leakage prevention.
         */
        public Builder defenseScene(String defenseScene) {
            this.putQueryParameter("DefenseScene", defenseScene);
            this.defenseScene = defenseScene;
            return this;
        }

        /**
         * The sub-scenario in which the protection template is used. Valid values:
         * <p>
         * 
         * *   **web**: bot management for website protection.
         * *   **app**: bot management for app protection.
         * *   **basic**: bot management for basic protection.
         */
        public Builder defenseSubScene(String defenseSubScene) {
            this.putQueryParameter("DefenseSubScene", defenseSubScene);
            this.defenseSubScene = defenseSubScene;
            return this;
        }

        /**
         * The ID of the Web Application Firewall (WAF) instance.
         * <p>
         * 
         * > You can call the [DescribeInstance](~~433756~~) operation to query the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The page number. Default value: **1**.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: **20**.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The region in which the WAF instance is deployed. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: Chinese mainland.
         * *   **ap-southeast-1**: outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the protected object or protected object group.
         * <p>
         * 
         * >  If you specify ResourceType, you must specify this parameter.
         */
        public Builder resource(String resource) {
            this.putQueryParameter("Resource", resource);
            this.resource = resource;
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
         * The type of the protected resource. Valid values:
         * <p>
         * 
         * *   **single**: protected object. This is the default value.
         * *   **group**: protected object group.
         * 
         * >  If you specify Resource, you must specify this parameter.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * The ID of the protection template.
         */
        public Builder templateId(Long templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The type of the protection template. Valid values:
         * <p>
         * 
         * *   **user_default**: default template.
         * *   **user_custom**: custom template.
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
