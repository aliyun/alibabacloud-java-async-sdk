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
 * {@link CreateTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTemplateResponseBody</p>
 */
public class CreateTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Template")
    private Template template;

    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private CreateTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.template = builder.template;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return template
     */
    public Template getTemplate() {
        return this.template;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder {
        private String requestId; 
        private Template template; 
        private String templateType; 

        private Builder() {
        } 

        private Builder(CreateTemplateResponseBody model) {
            this.requestId = model.requestId;
            this.template = model.template;
            this.templateType = model.templateType;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The metadata of the template.</p>
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        /**
         * <p>The type of the template.</p>
         * 
         * <strong>example:</strong>
         * <p>Private</p>
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        public CreateTemplateResponseBody build() {
            return new CreateTemplateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTemplateResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTemplateResponseBody</p>
     */
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedBy")
        private String createdBy;

        @com.aliyun.core.annotation.NameInMap("CreatedDate")
        private String createdDate;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HasTrigger")
        private Boolean hasTrigger;

        @com.aliyun.core.annotation.NameInMap("Hash")
        private String hash;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.Map<String, ?> tags;

        @com.aliyun.core.annotation.NameInMap("TemplateFormat")
        private String templateFormat;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateVersion")
        private String templateVersion;

        @com.aliyun.core.annotation.NameInMap("UpdatedBy")
        private String updatedBy;

        @com.aliyun.core.annotation.NameInMap("UpdatedDate")
        private String updatedDate;

        private Template(Builder builder) {
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.hasTrigger = builder.hasTrigger;
            this.hash = builder.hash;
            this.resourceGroupId = builder.resourceGroupId;
            this.shareType = builder.shareType;
            this.tags = builder.tags;
            this.templateFormat = builder.templateFormat;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateVersion = builder.templateVersion;
            this.updatedBy = builder.updatedBy;
            this.updatedDate = builder.updatedDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
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
            private String createdBy; 
            private String createdDate; 
            private String description; 
            private Boolean hasTrigger; 
            private String hash; 
            private String resourceGroupId; 
            private String shareType; 
            private java.util.Map<String, ?> tags; 
            private String templateFormat; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updatedBy; 
            private String updatedDate; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.createdBy = model.createdBy;
                this.createdDate = model.createdDate;
                this.description = model.description;
                this.hasTrigger = model.hasTrigger;
                this.hash = model.hash;
                this.resourceGroupId = model.resourceGroupId;
                this.shareType = model.shareType;
                this.tags = model.tags;
                this.templateFormat = model.templateFormat;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
                this.templateVersion = model.templateVersion;
                this.updatedBy = model.updatedBy;
                this.updatedDate = model.updatedDate;
            } 

            /**
             * <p>The creator of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>root(13090000)</p>
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * <p>The time when the template was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * <p>The description of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>Describe instances of given status</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Indicates whether the template was configured with a trigger.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasTrigger(Boolean hasTrigger) {
                this.hasTrigger = hasTrigger;
                return this;
            }

            /**
             * <p>The SHA-256 value of the template content.</p>
             * 
             * <strong>example:</strong>
             * <p>4bc7d7a21b3e003434b9c223f6e6d2578b5ebfeb5be28c1fcf8a8a1b11907bb4</p>
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * <p>The ID of the resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxsn4m4******</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>The share type of the template. The share type of the template that you create is Private.</p>
             * 
             * <strong>example:</strong>
             * <p>Private</p>
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * <p>The tags of the resources.</p>
             * 
             * <strong>example:</strong>
             * <p>{     &quot;k1&quot;:&quot;v1&quot;,     &quot;k2&quot;:&quot;v2&quot; }</p>
             */
            public Builder tags(java.util.Map<String, ?> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The format of the template. The system automatically determines whether the format is JSON or YAML.</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
             */
            public Builder templateFormat(String templateFormat) {
                this.templateFormat = templateFormat;
                return this;
            }

            /**
             * <p>The ID of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>t-94753d38</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>MyTemplate</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The version of the template. The name of the version consists of the letter v and a number. The number starts from 1.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account that last modified the information about the template.</p>
             * 
             * <strong>example:</strong>
             * <p>root(130900000)</p>
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * <p>The time when the template was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-05-16T10:26:14Z</p>
             */
            public Builder updatedDate(String updatedDate) {
                this.updatedDate = updatedDate;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
}
