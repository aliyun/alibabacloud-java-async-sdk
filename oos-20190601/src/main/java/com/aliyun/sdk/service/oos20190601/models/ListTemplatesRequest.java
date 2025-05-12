// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link ListTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListTemplatesRequest</p>
 */
public class ListTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedBy")
    private String createdBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedDateAfter")
    private String createdDateAfter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreatedDateBefore")
    private String createdDateBefore;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HasTrigger")
    private Boolean hasTrigger;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsExample")
    private Boolean isExample;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsFavorite")
    private Boolean isFavorite;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShareType")
    private String shareType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortField")
    private String sortField;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateFormat")
    private String templateFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private ListTemplatesRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.createdBy = builder.createdBy;
        this.createdDateAfter = builder.createdDateAfter;
        this.createdDateBefore = builder.createdDateBefore;
        this.hasTrigger = builder.hasTrigger;
        this.isExample = builder.isExample;
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
     * @return isExample
     */
    public Boolean getIsExample() {
        return this.isExample;
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
    public java.util.Map<String, ?> getTags() {
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
        private Boolean isExample; 
        private Boolean isFavorite; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String resourceGroupId; 
        private String shareType; 
        private String sortField; 
        private String sortOrder; 
        private java.util.Map<String, ?> tags; 
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
            this.isExample = request.isExample;
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
         * <p>The type of the template. Valid values include TimerTrigger, EventTrigger, AlarmTrigger, and Other.</p>
         * 
         * <strong>example:</strong>
         * <p>TimerTrigger</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The creator of the template.</p>
         * <ul>
         * <li>To query the template provided by Alibaba Cloud, set this parameter to <strong>ACS</strong>.</li>
         * <li>To query the template created by a user, set this parameter to the <strong>ID</strong> of the template or the <strong>name of the user</strong> who creates the template.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ACS</p>
         */
        public Builder createdBy(String createdBy) {
            this.putQueryParameter("CreatedBy", createdBy);
            this.createdBy = createdBy;
            return this;
        }

        /**
         * <p>Specifies to query the template that is created at or later than the specified time.</p>
         * <p>The value must be in the YYYY-MM-DDThh:mm:ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder createdDateAfter(String createdDateAfter) {
            this.putQueryParameter("CreatedDateAfter", createdDateAfter);
            this.createdDateAfter = createdDateAfter;
            return this;
        }

        /**
         * <p>Specifies to query the template that is created at or before the specified time.</p>
         * <p>The value must be in the YYYY-MM-DDThh:mm::ssZ format.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-16T10:26:14Z</p>
         */
        public Builder createdDateBefore(String createdDateBefore) {
            this.putQueryParameter("CreatedDateBefore", createdDateBefore);
            this.createdDateBefore = createdDateBefore;
            return this;
        }

        /**
         * <p>Specifies whether to query the template that is configured with a trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasTrigger(Boolean hasTrigger) {
            this.putQueryParameter("HasTrigger", hasTrigger);
            this.hasTrigger = hasTrigger;
            return this;
        }

        /**
         * <p>Specifies whether the template is an example template.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isExample(Boolean isExample) {
            this.putQueryParameter("IsExample", isExample);
            this.isExample = isExample;
            return this;
        }

        /**
         * <p>Specifies whether the template is added to favorites.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isFavorite(Boolean isFavorite) {
            this.putQueryParameter("IsFavorite", isFavorite);
            this.isFavorite = isFavorite;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 10 to 100. Default value: 50.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the region in which you want to query templates.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxsn4m4******</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The share type of the template. Valid values:</p>
         * <ul>
         * <li><strong>Public</strong></li>
         * <li><strong>Private</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * <p>The field that is used to sort the templates to be queried. Valid values:</p>
         * <ul>
         * <li><strong>TotalExecutionCount</strong> (default): The system sorts the returned templates based on the total number of times that the templates are used.</li>
         * <li><strong>Popularity</strong>: The system sorts the returned templates based on the popularity of the templates.</li>
         * <li><strong>TemplateName</strong>: The system sorts the returned templates based on the names of the templates.</li>
         * <li><strong>CreatedDate</strong>: The system sorts the returned templates based on the points in time when the templates are created.</li>
         * <li><strong>UpdatedDate</strong>: The system sorts the returned templates based on the points in time when the templates are updated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Popularity</p>
         */
        public Builder sortField(String sortField) {
            this.putQueryParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * <p>The order in which you want to sort the results. Valid values:</p>
         * <ul>
         * <li><strong>Ascending</strong>: ascending order.</li>
         * <li><strong>Descending</strong>: descending order. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Descending</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putQueryParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;k1&quot;:&quot;k2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putQueryParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The format of the template. Valid values:</p>
         * <ul>
         * <li><strong>JSON</strong></li>
         * <li><strong>YAML</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>YAML</p>
         */
        public Builder templateFormat(String templateFormat) {
            this.putQueryParameter("TemplateFormat", templateFormat);
            this.templateFormat = templateFormat;
            return this;
        }

        /**
         * <p>The name of the template. All templates whose names contain the specified template name are to be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The type of the template. Valid values:</p>
         * <ul>
         * <li>Automation: the template for automated tasks.</li>
         * <li>State: the template for configuration inventories.</li>
         * <li>Package: the template for software packages.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
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
