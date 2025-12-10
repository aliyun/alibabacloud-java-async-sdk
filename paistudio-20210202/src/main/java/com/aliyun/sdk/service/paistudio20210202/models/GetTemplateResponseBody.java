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
 * {@link GetTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>GetTemplateResponseBody</p>
 */
public class GetTemplateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private String detail;

    @com.aliyun.core.annotation.NameInMap("DocLink")
    private String docLink;

    @com.aliyun.core.annotation.NameInMap("ImageLink")
    private String imageLink;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<java.util.Map<String, ?>> labels;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private GetTemplateResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.detail = builder.detail;
        this.docLink = builder.docLink;
        this.imageLink = builder.imageLink;
        this.labels = builder.labels;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.templateId = builder.templateId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder {
        private String content; 
        private String description; 
        private String detail; 
        private String docLink; 
        private String imageLink; 
        private java.util.List<java.util.Map<String, ?>> labels; 
        private String name; 
        private String requestId; 
        private String sourceId; 
        private String sourceType; 
        private String templateId; 
        private String templateType; 

        private Builder() {
        } 

        private Builder(GetTemplateResponseBody model) {
            this.content = model.content;
            this.description = model.description;
            this.detail = model.detail;
            this.docLink = model.docLink;
            this.imageLink = model.imageLink;
            this.labels = model.labels;
            this.name = model.name;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.sourceType = model.sourceType;
            this.templateId = model.templateId;
            this.templateType = model.templateType;
        } 

        /**
         * Content.
         */
        public Builder content(String content) {
            this.content = content;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
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
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.templateType = templateType;
            return this;
        }

        public GetTemplateResponseBody build() {
            return new GetTemplateResponseBody(this);
        } 

    } 

}
