// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplatesResponseBody</p>
 */
public class ListTemplatesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Templates")
    private java.util.List < Templates> templates;

    private ListTemplatesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesResponseBody create() {
        return builder().build();
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return templates
     */
    public java.util.List < Templates> getTemplates() {
        return this.templates;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Templates> templates; 

        /**
         * The number of entries returned on each page.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used to retrieve the next page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The template metadata.
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        public ListTemplatesResponseBody build() {
            return new ListTemplatesResponseBody(this);
        } 

    } 

    public static class Templates extends TeaModel {
        @NameInMap("Category")
        private String category;

        @NameInMap("Constraints")
        private String constraints;

        @NameInMap("CreatedBy")
        private String createdBy;

        @NameInMap("CreatedDate")
        private String createdDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("HasTrigger")
        private Boolean hasTrigger;

        @NameInMap("Hash")
        private String hash;

        @NameInMap("IsFavorite")
        private Boolean isFavorite;

        @NameInMap("Popularity")
        private Integer popularity;

        @NameInMap("Publisher")
        private String publisher;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ShareType")
        private String shareType;

        @NameInMap("Tags")
        private java.util.Map < String, ? > tags;

        @NameInMap("TemplateFormat")
        private String templateFormat;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateType")
        private String templateType;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("TotalExecutionCount")
        private Integer totalExecutionCount;

        @NameInMap("UpdatedBy")
        private String updatedBy;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        private Templates(Builder builder) {
            this.category = builder.category;
            this.constraints = builder.constraints;
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.hasTrigger = builder.hasTrigger;
            this.hash = builder.hash;
            this.isFavorite = builder.isFavorite;
            this.popularity = builder.popularity;
            this.publisher = builder.publisher;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
            this.tags = builder.tags;
            this.templateFormat = builder.templateFormat;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
            this.templateVersion = builder.templateVersion;
            this.totalExecutionCount = builder.totalExecutionCount;
            this.updatedBy = builder.updatedBy;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return constraints
         */
        public String getConstraints() {
            return this.constraints;
        }

        /**
         * @return createdBy
         */
        public String getCreatedBy() {
            return this.createdBy;
        }

        /**
         * @return createdDate
         */
        public String getCreatedDate() {
            return this.createdDate;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hasTrigger
         */
        public Boolean getHasTrigger() {
            return this.hasTrigger;
        }

        /**
         * @return hash
         */
        public String getHash() {
            return this.hash;
        }

        /**
         * @return isFavorite
         */
        public Boolean getIsFavorite() {
            return this.isFavorite;
        }

        /**
         * @return popularity
         */
        public Integer getPopularity() {
            return this.popularity;
        }

        /**
         * @return publisher
         */
        public String getPublisher() {
            return this.publisher;
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
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
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

        /**
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return totalExecutionCount
         */
        public Integer getTotalExecutionCount() {
            return this.totalExecutionCount;
        }

        /**
         * @return updatedBy
         */
        public String getUpdatedBy() {
            return this.updatedBy;
        }

        /**
         * @return updatedDate
         */
        public String getUpdatedDate() {
            return this.updatedDate;
        }

        public static final class Builder {
            private String category; 
            private String constraints; 
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private Boolean hasTrigger; 
            private String hash; 
            private Boolean isFavorite; 
            private Integer popularity; 
            private String publisher; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.Map < String, ? > tags; 
            private String templateFormat; 
            private String templateId; 
            private String templateName; 
            private String templateType; 
            private String templateVersion; 
            private Integer totalExecutionCount; 
            private String updatedBy; 
            private String updatedDate; 

            /**
             * The template type.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The constraints of template
             */
            public Builder constraints(String constraints) {
                this.constraints = constraints;
                return this;
            }

            /**
             * The user who created the template.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * The time when the template was created.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * The template description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Indicates whether the template was configured with a trigger.
             */
            public Builder hasTrigger(Boolean hasTrigger) {
                this.hasTrigger = hasTrigger;
                return this;
            }

            /**
             * The SHA-256 value of the template content.
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * The template is favorite or not.
             */
            public Builder isFavorite(Boolean isFavorite) {
                this.isFavorite = isFavorite;
                return this;
            }

            /**
             * The popularity of the public template. Valid values: **1-10**. A greater value indicates higher popularity. If **ShareType** is set to **Private**, the value of this parameter is `-1`.
             * <p>
             * 
             * >  This parameter is valid only if the value of **ShareType** is set to **Public**.
             */
            public Builder popularity(Integer popularity) {
                this.popularity = popularity;
                return this;
            }

            /**
             * The publisher of template.
             */
            public Builder publisher(String publisher) {
                this.publisher = publisher;
                return this;
            }

            /**
             * The resource group ID.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The share type of the template. The share type of a template created by a user is **Private**. Valid values:
             * <p>
             * 
             * *   **Public**
             * *   **Private**
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * The tag keys and values. The number of key-value pairs ranges from 1 to 20.
             */
            public Builder tags(java.util.Map < String, ? > tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The template format. The system automatically determines whether the format is JSON or YAML.
             */
            public Builder templateFormat(String templateFormat) {
                this.templateFormat = templateFormat;
                return this;
            }

            /**
             * The template ID.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * The template name.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * The template type.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            /**
             * The template version. The name of the version consists of the letter v and a number. The number starts from 1.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * The number of times for which the private template is executed. If **ShareType** is set to **Public**, the value of this parameter is `-1`.
             * <p>
             * 
             * >  This parameter is valid only if the value of **ShareType** is **Private**.
             */
            public Builder totalExecutionCount(Integer totalExecutionCount) {
                this.totalExecutionCount = totalExecutionCount;
                return this;
            }

            /**
             * The user who last updated the template.
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * The time when the template was last updated.
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
