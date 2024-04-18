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
    @NameInMap("IsFavorite")
    private Boolean isFavorite;

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
        this.isFavorite = builder.isFavorite;
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
     * @return isFavorite
     */
    public Boolean getIsFavorite() {
        return this.isFavorite;
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
        private Boolean isFavorite; 
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

        private Builder(ListTemplatesRequest request) {
            super(request);
            this.category = request.category;
            this.createdBy = request.createdBy;
            this.createdDateAfter = request.createdDateAfter;
            this.createdDateBefore = request.createdDateBefore;
            this.hasTrigger = request.hasTrigger;
            this.isFavorite = request.isFavorite;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.shareType = request.shareType;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
            this.tags = request.tags;
            this.templateFormat = request.templateFormat;
            this.templateName = request.templateName;
            this.templateType = request.templateType;
        } 

        /**
         * The type of the template. Valid values include TimerTrigger, EventTrigger, AlarmTrigger, and Other.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The creator of the template.
         * <p>
         * 
         * *   To query the template provided by Alibaba Cloud, set this parameter to **ACS**.
         * *   To query the template created by a user, set this parameter to the **ID** of the template or the **name of the user** who creates the template.
         */
        public Builder createdBy(String createdBy) {
            this.putQueryParameter("CreatedBy", createdBy);
            this.createdBy = createdBy;
            return this;
        }

        /**
         * Specifies to query the template that is created at or later than the specified time.
         * <p>
         * 
         * The value must be in the YYYY-MM-DDThh:mm:ssZ format.
         */
        public Builder createdDateAfter(String createdDateAfter) {
            this.putQueryParameter("CreatedDateAfter", createdDateAfter);
            this.createdDateAfter = createdDateAfter;
            return this;
        }

        /**
         * Specifies to query the template that is created at or before the specified time.
         * <p>
         * 
         * The value must be in the YYYY-MM-DDThh:mm::ssZ format.
         */
        public Builder createdDateBefore(String createdDateBefore) {
            this.putQueryParameter("CreatedDateBefore", createdDateBefore);
            this.createdDateBefore = createdDateBefore;
            return this;
        }

        /**
         * Specifies whether to query the template that is configured with a trigger.
         */
        public Builder hasTrigger(Boolean hasTrigger) {
            this.putQueryParameter("HasTrigger", hasTrigger);
            this.hasTrigger = hasTrigger;
            return this;
        }

        /**
         * The template is favorite or not.
         */
        public Builder isFavorite(Boolean isFavorite) {
            this.putQueryParameter("IsFavorite", isFavorite);
            this.isFavorite = isFavorite;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 10 to 100. Default value: 50.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the region in which you want to query templates.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The share type of the template. Valid values:
         * <p>
         * 
         * *   **Public**
         * *   **Private**
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * The field that is used to sort the templates to be queried. Valid values:
         * <p>
         * 
         * *   **TotalExecutionCount** (default): The system sorts the returned templates based on the total number of times that the templates are used.
         * *   **Popularity**: The system sorts the returned templates based on the popularity of the templates.
         * *   **TemplateName**: The system sorts the returned templates based on the names of the templates.
         * *   **CreatedDate**: The system sorts the returned templates based on the points in time when the templates are created.
         * *   **UpdatedDate**: The system sorts the returned templates based on the points in time when the templates are updated.
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * The order in which you want to sort the results. Valid values:
         * <p>
         * 
         * *   **Ascending**: ascending order.
         * *   **Descending**: descending order. This is the default value.
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The tag keys and values. The number of key-value pairs ranges from 1 to 20.
         */
        public Builder tags(java.util.Map < String, ? > tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * The format of the template. Valid values:
         * <p>
         * 
         * *   **JSON**
         * *   **YAML**
         */
        public Builder templateFormat(String templateFormat) {
            this.putQueryParameter("TemplateFormat", templateFormat);
            this.templateFormat = templateFormat;
            return this;
        }

        /**
         * The name of the template. All templates whose names contain the specified template name are to be returned.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * The type of the template. Valid values:
         * <p>
         * 
         * *   Automation: the template for automated tasks.
         * *   State: the template for configuration inventories.
         * *   Package: the template for software packages.
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
