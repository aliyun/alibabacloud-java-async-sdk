// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdatePublicTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePublicTemplateResponseBody</p>
 */
public class UpdatePublicTemplateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Template")
    private Template template;

    private UpdatePublicTemplateResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePublicTemplateResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String requestId; 
        private Template template; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(Template template) {
            this.template = template;
            return this;
        }

        public UpdatePublicTemplateResponseBody build() {
            return new UpdatePublicTemplateResponseBody(this);
        } 

    } 

    public static class Template extends TeaModel {
        @NameInMap("CreatedBy")
        private String createdBy;

        @NameInMap("CreatedDate")
        private String createdDate;

        @NameInMap("Description")
        private String description;

        @NameInMap("Hash")
        private String hash;

        @NameInMap("Popularity")
        private Integer popularity;

        @NameInMap("ShareType")
        private String shareType;

        @NameInMap("TemplateFormat")
        private String templateFormat;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateVersion")
        private String templateVersion;

        @NameInMap("UpdatedBy")
        private String updatedBy;

        @NameInMap("UpdatedDate")
        private String updatedDate;

        private Template(Builder builder) {
            this.createdBy = builder.createdBy;
            this.createdDate = builder.createdDate;
            this.description = builder.description;
            this.hash = builder.hash;
            this.popularity = builder.popularity;
            this.shareType = builder.shareType;
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
         * @return hash
         */
        public String getHash() {
            return this.hash;
        }

        /**
         * @return popularity
         */
        public Integer getPopularity() {
            return this.popularity;
        }

        /**
         * @return shareType
         */
        public String getShareType() {
            return this.shareType;
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
            private String hash; 
            private Integer popularity; 
            private String shareType; 
            private String templateFormat; 
            private String templateId; 
            private String templateName; 
            private String templateVersion; 
            private String updatedBy; 
            private String updatedDate; 

            /**
             * CreatedBy.
             */
            public Builder createdBy(String createdBy) {
                this.createdBy = createdBy;
                return this;
            }

            /**
             * CreatedDate.
             */
            public Builder createdDate(String createdDate) {
                this.createdDate = createdDate;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Hash.
             */
            public Builder hash(String hash) {
                this.hash = hash;
                return this;
            }

            /**
             * Popularity.
             */
            public Builder popularity(Integer popularity) {
                this.popularity = popularity;
                return this;
            }

            /**
             * ShareType.
             */
            public Builder shareType(String shareType) {
                this.shareType = shareType;
                return this;
            }

            /**
             * TemplateFormat.
             */
            public Builder templateFormat(String templateFormat) {
                this.templateFormat = templateFormat;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateVersion.
             */
            public Builder templateVersion(String templateVersion) {
                this.templateVersion = templateVersion;
                return this;
            }

            /**
             * UpdatedBy.
             */
            public Builder updatedBy(String updatedBy) {
                this.updatedBy = updatedBy;
                return this;
            }

            /**
             * UpdatedDate.
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
