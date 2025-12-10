// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link ListTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListTemplatesResponseBody</p>
 */
public class ListTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TemplateData")
    private java.util.List<TemplateData> templateData;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListTemplatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.templateData = builder.templateData;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTemplatesResponseBody create() {
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
     * @return templateData
     */
    public java.util.List<TemplateData> getTemplateData() {
        return this.templateData;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TemplateData> templateData; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListTemplatesResponseBody model) {
            this.requestId = model.requestId;
            this.templateData = model.templateData;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TemplateData.
         */
        public Builder templateData(java.util.List<TemplateData> templateData) {
            this.templateData = templateData;
            return this;
        }

        /**
         * TotalCount.
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
    public static class Template extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("DocLink")
        private String docLink;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("ImageLink")
        private String imageLink;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<java.util.Map<String, ?>> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        private Template(Builder builder) {
            this.content = builder.content;
            this.creator = builder.creator;
            this.description = builder.description;
            this.detail = builder.detail;
            this.docLink = builder.docLink;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.imageLink = builder.imageLink;
            this.labels = builder.labels;
            this.name = builder.name;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Template create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return docLink
         */
        public String getDocLink() {
            return this.docLink;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return imageLink
         */
        public String getImageLink() {
            return this.imageLink;
        }

        /**
         * @return labels
         */
        public java.util.List<java.util.Map<String, ?>> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String content; 
            private String creator; 
            private String description; 
            private String detail; 
            private String docLink; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String imageLink; 
            private java.util.List<java.util.Map<String, ?>> labels; 
            private String name; 
            private String templateId; 

            private Builder() {
            } 

            private Builder(Template model) {
                this.content = model.content;
                this.creator = model.creator;
                this.description = model.description;
                this.detail = model.detail;
                this.docLink = model.docLink;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.imageLink = model.imageLink;
                this.labels = model.labels;
                this.name = model.name;
                this.templateId = model.templateId;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * DocLink.
             */
            public Builder docLink(String docLink) {
                this.docLink = docLink;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * ImageLink.
             */
            public Builder imageLink(String imageLink) {
                this.imageLink = imageLink;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<java.util.Map<String, ?>> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            public Template build() {
                return new Template(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplatesResponseBody</p>
     */
    public static class TemplateTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TagId")
        private String tagId;

        @com.aliyun.core.annotation.NameInMap("TypeId")
        private String typeId;

        private TemplateTag(Builder builder) {
            this.name = builder.name;
            this.tagId = builder.tagId;
            this.typeId = builder.typeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateTag create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tagId
         */
        public String getTagId() {
            return this.tagId;
        }

        /**
         * @return typeId
         */
        public String getTypeId() {
            return this.typeId;
        }

        public static final class Builder {
            private String name; 
            private String tagId; 
            private String typeId; 

            private Builder() {
            } 

            private Builder(TemplateTag model) {
                this.name = model.name;
                this.tagId = model.tagId;
                this.typeId = model.typeId;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TagId.
             */
            public Builder tagId(String tagId) {
                this.tagId = tagId;
                return this;
            }

            /**
             * TypeId.
             */
            public Builder typeId(String typeId) {
                this.typeId = typeId;
                return this;
            }

            public TemplateTag build() {
                return new TemplateTag(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplatesResponseBody</p>
     */
    public static class TemplateType extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TypeId")
        private String typeId;

        private TemplateType(Builder builder) {
            this.name = builder.name;
            this.typeId = builder.typeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateType create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return typeId
         */
        public String getTypeId() {
            return this.typeId;
        }

        public static final class Builder {
            private String name; 
            private String typeId; 

            private Builder() {
            } 

            private Builder(TemplateType model) {
                this.name = model.name;
                this.typeId = model.typeId;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TypeId.
             */
            public Builder typeId(String typeId) {
                this.typeId = typeId;
                return this;
            }

            public TemplateType build() {
                return new TemplateType(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListTemplatesResponseBody</p>
     */
    public static class TemplateData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Template")
        private Template template;

        @com.aliyun.core.annotation.NameInMap("TemplateTag")
        private TemplateTag templateTag;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private TemplateType templateType;

        private TemplateData(Builder builder) {
            this.template = builder.template;
            this.templateTag = builder.templateTag;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateData create() {
            return builder().build();
        }

        /**
         * @return template
         */
        public Template getTemplate() {
            return this.template;
        }

        /**
         * @return templateTag
         */
        public TemplateTag getTemplateTag() {
            return this.templateTag;
        }

        /**
         * @return templateType
         */
        public TemplateType getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private Template template; 
            private TemplateTag templateTag; 
            private TemplateType templateType; 

            private Builder() {
            } 

            private Builder(TemplateData model) {
                this.template = model.template;
                this.templateTag = model.templateTag;
                this.templateType = model.templateType;
            } 

            /**
             * Template.
             */
            public Builder template(Template template) {
                this.template = template;
                return this;
            }

            /**
             * TemplateTag.
             */
            public Builder templateTag(TemplateTag templateTag) {
                this.templateTag = templateTag;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(TemplateType templateType) {
                this.templateType = templateType;
                return this;
            }

            public TemplateData build() {
                return new TemplateData(this);
            } 

        } 

    }
}
