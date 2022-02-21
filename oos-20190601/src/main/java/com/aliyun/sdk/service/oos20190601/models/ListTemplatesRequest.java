// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListTemplatesRequest</p>
 */
public class ListTemplatesRequest extends Request {
    @Query
    @NameInMap("Category")
    private String category;

    @Query
    @NameInMap("CreatedBy")
    private String createdBy;

    @Query
    @NameInMap("CreatedDateAfter")
    private String createdDateAfter;

    @Query
    @NameInMap("CreatedDateBefore")
    private String createdDateBefore;

    @Query
    @NameInMap("HasTrigger")
    private Boolean hasTrigger;

    @Query
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ShareType")
    private String shareType;

    @Query
    @NameInMap("SortField")
    private String sortField;

    @Query
    @NameInMap("SortOrder")
    private String sortOrder;

    @Query
    @NameInMap("Tags")
    private java.util.Map < String, ? > tags;

    @Query
    @NameInMap("TemplateFormat")
    private String templateFormat;

    @Query
    @NameInMap("TemplateName")
    private String templateName;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    private ListTemplatesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.createdBy = builder.createdBy;
        this.createdDateAfter = builder.createdDateAfter;
        this.createdDateBefore = builder.createdDateBefore;
        this.hasTrigger = builder.hasTrigger;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.shareType = builder.shareType;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
        this.tags = builder.tags;
        this.templateFormat = builder.templateFormat;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return createdDateAfter
     */
    public String getCreatedDateAfter() {
        return this.createdDateAfter;
    }

    /**
     * @return createdDateBefore
     */
    public String getCreatedDateBefore() {
        return this.createdDateBefore;
    }

    /**
     * @return hasTrigger
     */
    public Boolean getHasTrigger() {
        return this.hasTrigger;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * @return tags
     */
    public java.util.Map < String, ? > getTags() {
        return this.tags;
    }

    /**
     * @return templateFormat
     */
    public String getTemplateFormat() {
        return this.templateFormat;
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

    public static final class Builder extends Request.Builder<ListTemplatesRequest, Builder> {
        private String category; 
        private String createdBy; 
        private String createdDateAfter; 
        private String createdDateBefore; 
        private Boolean hasTrigger; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private String shareType; 
        private String sortField; 
        private String sortOrder; 
        private java.util.Map < String, ? > tags; 
        private String templateFormat; 
        private String templateName; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ListTemplatesRequest response) {
            super(response);
            this.category = response.category;
            this.createdBy = response.createdBy;
            this.createdDateAfter = response.createdDateAfter;
            this.createdDateBefore = response.createdDateBefore;
            this.hasTrigger = response.hasTrigger;
            this.maxResults = response.maxResults;
            this.nextToken = response.nextToken;
            this.regionId = response.regionId;
            this.resourceGroupId = response.resourceGroupId;
            this.shareType = response.shareType;
            this.sortField = response.sortField;
            this.sortOrder = response.sortOrder;
            this.tags = response.tags;
            this.templateFormat = response.templateFormat;
            this.templateName = response.templateName;
            this.templateType = response.templateType;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * CreatedBy.
         */
        public Builder createdBy(String createdBy) {
            this.putQueryParameter("CreatedBy", createdBy);
            this.createdBy = createdBy;
            return this;
        }

        /**
         * CreatedDateAfter.
         */
        public Builder createdDateAfter(String createdDateAfter) {
            this.putQueryParameter("CreatedDateAfter", createdDateAfter);
            this.createdDateAfter = createdDateAfter;
            return this;
        }

        /**
         * CreatedDateBefore.
         */
        public Builder createdDateBefore(String createdDateBefore) {
            this.putQueryParameter("CreatedDateBefore", createdDateBefore);
            this.createdDateBefore = createdDateBefore;
            return this;
        }

        /**
         * HasTrigger.
         */
        public Builder hasTrigger(Boolean hasTrigger) {
            this.putQueryParameter("HasTrigger", hasTrigger);
            this.hasTrigger = hasTrigger;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ShareType.
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * SortField.
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * SortOrder.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * TemplateFormat.
         */
        public Builder templateFormat(String templateFormat) {
            this.putQueryParameter("TemplateFormat", templateFormat);
            this.templateFormat = templateFormat;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public ListTemplatesRequest build() {
            return new ListTemplatesRequest(this);
        } 

    } 

}
