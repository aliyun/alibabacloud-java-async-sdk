// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplatesResponseBody</p>
 */
public class ListTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Templates")
    private java.util.List < Templates> templates;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTemplatesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.templates = builder.templates;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesResponseBody create() {
        return builder().build();
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < Templates> templates; 
        private Integer totalCount; 

        /**
         * <p>The page number.<br>Pages start from page 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C3A8413B-1F16-4DED-AC3E-61A00718DE8A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The templates.</p>
         */
        public Builder templates(java.util.List < Templates> templates) {
            this.templates = templates;
            return this;
        }

        /**
         * <p>The total number of templates.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListTemplatesResponseBody build() {
            return new ListTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplatesResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>usage</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplatesResponseBody</p>
     */
    public static class Templates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TemplateARN")
        private String templateARN;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Templates(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.ownerId = builder.ownerId;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
            this.tags = builder.tags;
            this.templateARN = builder.templateARN;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Templates create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return templateARN
         */
        public String getTemplateARN() {
            return this.templateARN;
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
         * @return templateVersion
         */
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String ownerId; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.List < Tags> tags; 
            private String templateARN; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updateTime; 

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-15T08:17:14.000000</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>test-description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account to which the template belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>151266687691****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxazb4ph6aiy****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The sharing type of the template.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Private: The template belongs to the template owner.</li>
             * <li>Shared: The template is shared with other users.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The tags of the template.</p>
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ros:<em>:151266687691</em><em><strong>:template/a52f81be-496f-4e1c-a286-8852ab54</strong></em>*</p>
             */
            public Builder templateARN(String templateARN) {
                this.templateARN = templateARN;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>4d4f5aa2-3260-4e47-863b-763fbb12****</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>demo</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The latest version of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>The time when the template was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-15T08:17:14.000000</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Templates build() {
                return new Templates(this);
            } 

        } 

    }
}
